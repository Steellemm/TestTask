package com.steellemm.testtask;

import com.steellemm.testtask.enums.CurrencyEnum;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.time.Instant;
import java.util.Map;

@Service
public class TestTaskRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public TestTaskRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(String tableName, CurrencyEnum currency, Instant timestamp, BigInteger price) {
        jdbcTemplate.update(String.format("INSERT INTO %s VALUES(:time, :symbol, :price)", tableName), Map.of(
                "time", timestamp,
                "symbol", currency.name(),
                "price", price));
    }


}
