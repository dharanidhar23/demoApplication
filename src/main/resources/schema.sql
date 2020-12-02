CREATE TABLE public.transaction
(
    id integer NOT NULL,
    message text COLLATE pg_catalog."default",
    CONSTRAINT "Transaction_pkey" PRIMARY KEY (id)
)

CREATE SEQUENCE hibernate_sequence START 1;