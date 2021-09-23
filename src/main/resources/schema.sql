DROP TABLE IF EXISTS billionaires;
DROP SEQUENCE  IF EXISTS HIBERNATE_SEQUENCE;
DROP TABLE  IF EXISTS heroes;

CREATE TABLE billionaires (
                              id INT AUTO_INCREMENT  PRIMARY KEY,
                              first_name VARCHAR(250) NOT NULL,
                              last_name VARCHAR(250) NOT NULL,
                              career VARCHAR(250) DEFAULT NULL
);


CREATE TABLE heroes (
                              id INT AUTO_INCREMENT  PRIMARY KEY,
                              name VARCHAR(250) NOT NULL
);

CREATE SEQUENCE HIBERNATE_SEQUENCE START WITH 1 INCREMENT BY 1;
