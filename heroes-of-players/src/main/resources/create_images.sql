DROP TABLE IF EXISTS images;

CREATE TABLE images (
    id SERIAL PRIMARY KEY,
    name varchar(100) NOT NULL,
    image bytea NOT NULL,
    image_base64 text
)