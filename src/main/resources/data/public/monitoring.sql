create table monitoring
(
    id     bigserial
        primary key,
    date   timestamp,
    weight integer
);

alter table monitoring
    owner to postgres;

