drop database if exists 'dev';

create database IF NOT EXISTS 'dev';
use dev;
-- drop table if exists 'user';
-- CREATE TABLE IF NOT EXISTS user;
CREATE TABLE user
(
  id       int         null,
  name     varchar(20) null,
  password varchar(20) null,
  number   varchar(20) null
);

