# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table "users" ("login" VARCHAR NOT NULL,"status" VARCHAR NOT NULL);

# --- !Downs

drop table "users";

