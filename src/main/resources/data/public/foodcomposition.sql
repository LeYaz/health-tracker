create table foodcomposition
(
    id       bigserial
        primary key,
    glucides integer,
    lipides  integer,
    proteins integer,
    sugar    integer
);

alter table foodcomposition
    owner to postgres;

