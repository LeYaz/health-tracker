create table food
(
    id       bigserial
        primary key,
    calorie  integer,
    family   bytea,
    name     varchar(255),
    quantity integer,
    weight   integer,
    food_id  bigint
        constraint fk273wbds7fuoro608hgpovi0ec
            references foodcomposition
);

alter table food
    owner to postgres;

