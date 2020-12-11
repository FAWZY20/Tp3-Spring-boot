CREATE TABLE repository (
    name varchar(50) PRIMARY KEY NOT NULL,
    owner varchar(50) NOT NULL,
    issues int,
    fork int,
    lastUpdate bigint default 0
                        );


CREATE TABLE statistic (
    id varchar(50) PRIMARY KEY NOT NULL,
    entry_type varchar(50) NOT NULL,
    datetime date,
    alue int
);