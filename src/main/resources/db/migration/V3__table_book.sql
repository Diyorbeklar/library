DROP TABLE IF EXISTS book;
CREATE TABLE book(
    id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    title varchar,
    author_id INT REFERENCES author(id),
    category_id INT REFERENCES category(id),
    year INT,
    language varchar
)