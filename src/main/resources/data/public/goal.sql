create table goal
(
    id            bigserial
        primary key,
    actual_weight integer,
    goal_weight   integer,
    start_weight  integer
);

alter table goal
    owner to postgres;

