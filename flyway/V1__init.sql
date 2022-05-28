CREATE TABLE rate_1_minute (
    time timestamp,
    symbol CHAR(4),
    price NUMERIC(18, 5),
    PRIMARY KEY (time, symbol)
);

CREATE TABLE rate_5_minutes (
    time timestamp,
    symbol CHAR(4),
    price NUMERIC(18, 5),
    PRIMARY KEY (time, symbol)
);

CREATE TABLE rate_10_minutes (
    time timestamp,
    symbol CHAR(4),
    price NUMERIC(18, 5),
    PRIMARY KEY (time, symbol)
);

CREATE TABLE rate_1_hour (
    time timestamp,
    symbol CHAR(4),
    price NUMERIC(18, 5),
    PRIMARY KEY (time, symbol)
);

CREATE TABLE rate_1_day (
    time timestamp,
    symbol CHAR(4),
    price NUMERIC(18, 5),
    PRIMARY KEY (time, symbol)
);