create table "user"
(
    id       bigint       not null
        constraint id
            primary key,
    email    varchar(255) not null,
    password varchar(255) not null
);

alter table "user"
    owner to postgres;

