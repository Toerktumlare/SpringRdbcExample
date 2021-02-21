CREATE DATABASE "myDatabase";

CREATE SCHEMA vehicles;

CREATE TABLE categories (
    id              SERIAL PRIMARY KEY,
    name           VARCHAR(100) NOT NULL
);

INSERT INTO categories (name) values ('Cars');
INSERT INTO categories (name) values ('Planes');
INSERT INTO categories (name) values ('Busses');
INSERT INTO categories (name) values ('Trucks');