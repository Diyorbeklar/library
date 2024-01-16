DROP TABLE IF EXISTS author;
CREATE TABLE author(
    id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    first_name varchar,
    last_name varchar,
    address varchar
)