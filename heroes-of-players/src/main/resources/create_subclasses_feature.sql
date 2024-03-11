DROP TABLE IF EXISTS features;

CREATE TABLE features
(
    id                    SERIAL PRIMARY KEY,
    subclass_name         VARCHAR(255) references subclasses(name),
    subclass_feature_name VARCHAR(255),
    subclass_feature_lvl  INTEGER,
    description           text
);