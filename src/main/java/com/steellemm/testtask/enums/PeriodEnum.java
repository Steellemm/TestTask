package com.steellemm.testtask.enums;

public enum PeriodEnum {
    MINUTE_1("rate_1_minute", 1),
    MINUTE_5("rate_5_minutes", 5),
    MINUTE_10("rate_10_minutes", 10),
    HOUR("rate_1_hour", 60),
    DAY("rate_1_day", 1440);

    private final String tableName;
    private final int intervalInMinutes;
    PeriodEnum(String tableName, int intervalInMinutes) {
        this.tableName = tableName;
        this.intervalInMinutes = intervalInMinutes;
    }

    public String tableName() {
        return tableName;
    }

    public int intervalInMinutes() {
        return intervalInMinutes;
    }
}
