create database ecommerce;
use ecommerce;

create table User(
	user_id int auto_increment primary key not null,
    username varchar(255) not null,
    email varchar(255) not null,
    password varchar(255) not null,
    role enum("ADMIN", "USER")
);


create table Product(
	product_id int auto_increment primary key not null,
    product_name varchar(255) not null,
    product_type varchar(255) not null,
    product_quantiry int not null,
    product_price double not null,
    product_image blob not null
);