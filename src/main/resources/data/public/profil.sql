create table profil
(
    id              bigserial
        primary key,
    birth           timestamp,
    created_at      timestamp,
    food_preference bytea,
    height          integer,
    name            varchar(255),
    sexe            bytea,
    surname         varchar(255),
    weight          integer,
    goal_id         bigint
        constraint fk72cv4rgoo0qj0dbfenlg0txx1
            references goal,
    monitoring_id   bigint
        constraint fkcx9bnr16ah3eud0iyb0r1vj6o
            references monitoring,
    receipe_id      bigint
        constraint fkad4algdh0p2aaw96lq4dwwurn
            references meal,
    user_id         bigint
        constraint "FK74sd0iwwpre0c3wk2ur5wjunt"
            references "user",
    meal_id         bigint
        constraint fkq5mv7r7fxaqkqc0ehvowpcmy8
            references meal
);

alter table profil
    owner to postgres;

