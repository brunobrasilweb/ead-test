create table users (
        username varchar(50) not null primary key,
        password varchar(255) not null,
        enabled boolean not null
);
CREATE TABLE authorities (
	username varchar(100) NULL,
	authority varchar(100) NULL
)
WITH (
	OIDS=FALSE
);
ALTER TABLE public.authorities ADD CONSTRAINT authorities_users_fk FOREIGN KEY (username) REFERENCES public.users(username);