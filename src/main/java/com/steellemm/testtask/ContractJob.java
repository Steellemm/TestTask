package com.steellemm.testtask;

import com.steellemm.testtask.enums.CurrencyEnum;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@Service
public class ContractJob implements Job {

    public final static String TABLE_NAME = "tableName";
    public final static int TIMEOUT = 10_000;
    private final TestTask smartContract;
    private final TestTaskRepository repository;

    public ContractJob(TestTask smartContract, TestTaskRepository repository) {
        this.smartContract = smartContract;
        this.repository = repository;
    }

    /**
     * Yes, I know this method is disgusting, but it has been written for test task:)
     */
    @Override
    public void execute(JobExecutionContext context) {
        try {
            String tableName = context.getJobDetail().getJobDataMap().getString(TABLE_NAME);
            Timestamp now = Timestamp.from(Instant.now());
            CompletableFuture<BigInteger> bnbCall = smartContract.getBNB().sendAsync();
            CompletableFuture<BigInteger> btcCall = smartContract.getBTC().sendAsync();
            CompletableFuture<BigInteger> ethCall = smartContract.getETH().sendAsync();
            BigInteger bnb = bnbCall.get(TIMEOUT, TimeUnit.MILLISECONDS);
            BigInteger btc = btcCall.get(TIMEOUT, TimeUnit.MILLISECONDS);
            BigInteger eth = ethCall.get(TIMEOUT, TimeUnit.MILLISECONDS);
            repository.save(tableName, CurrencyEnum.BNB, now, bnb);
            repository.save(tableName, CurrencyEnum.BTC, now, btc);
            repository.save(tableName, CurrencyEnum.ETH, now, eth);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
