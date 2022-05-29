package com.steellemm.testtask;

import com.steellemm.testtask.enums.PeriodEnum;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.ContractGasProvider;
import org.web3j.tx.gas.DefaultGasProvider;

import static org.quartz.SimpleScheduleBuilder.simpleSchedule;

@Configuration
public class TestTaskConfig {

    @Value("${contract.address}")
    private String contractAddress;
    @Value("${contract.node-url}")
    private String nodeUrl;
    @Value("${contract.private-key}")
    private String privateKey;

    @Bean
    public ContractGasProvider gasProvider() {
        return new DefaultGasProvider();
    }

    @Bean
    public Web3j web3j() {
        return Web3j.build(new HttpService(nodeUrl));
    }

    @Bean
    public Credentials credentials() {
        return Credentials.create(privateKey);
    }

    @Bean
    public TestTask testTask(Web3j web3j, ContractGasProvider contractGasProvider, Credentials credentials) {
        return TestTask.load(contractAddress, web3j, credentials, contractGasProvider);
    }

    @Bean
    public JobDetail job1() {
        return generateJobDetail(PeriodEnum.MINUTE_1);
    }

    @Bean
    public Trigger trigger1(JobDetail job1) {
        return generateTrigger(job1, PeriodEnum.MINUTE_1);
    }

    @Bean
    public JobDetail job2() {
        return generateJobDetail(PeriodEnum.MINUTE_5);
    }

    @Bean
    public Trigger trigger2(JobDetail job2) {
        return generateTrigger(job2, PeriodEnum.MINUTE_5);
    }

    @Bean
    public JobDetail job3() {
        return generateJobDetail(PeriodEnum.MINUTE_10);
    }

    @Bean
    public Trigger trigger3(JobDetail job3) {
        return generateTrigger(job3, PeriodEnum.MINUTE_10);
    }

    @Bean
    public JobDetail job4() {
        return generateJobDetail(PeriodEnum.HOUR);
    }

    @Bean
    public Trigger trigger4(JobDetail job4) {
        return generateTrigger(job4, PeriodEnum.HOUR);
    }

    @Bean
    public JobDetail job5() {
        return generateJobDetail(PeriodEnum.DAY);
    }

    @Bean
    public Trigger trigger5(JobDetail job5) {
        return generateTrigger(job5, PeriodEnum.DAY);
    }


    private JobDetail generateJobDetail(PeriodEnum periodEnum) {
        return JobBuilder.newJob().ofType(ContractJob.class)
                .storeDurably()
                .usingJobData(ContractJob.TABLE_NAME, periodEnum.tableName())
                .withIdentity(periodEnum.tableName())
                .withDescription("Job has started: " + periodEnum)
                .build();
    }

    private Trigger generateTrigger(JobDetail job, PeriodEnum periodEnum) {
        return TriggerBuilder.newTrigger().forJob(job)
                .withIdentity("Qrtz_Trigger for " + periodEnum)
                .withDescription("Trigger")
                .withSchedule(simpleSchedule().repeatForever().withIntervalInMinutes(periodEnum.intervalInMinutes()))
                .build();
    }

}
