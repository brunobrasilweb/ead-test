CREATE TABLE courses (
	id serial NOT NULL,
	name varchar(150) NOT NULL,
    video varchar(200) NOT NULL,
	CONSTRAINT courses_pk PRIMARY KEY (id)
);