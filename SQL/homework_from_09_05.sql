create database education;

use education;

create table students (
	id integer primary key auto_increment,
    name varchar (64) not null,
    lastname varchar (64) not null,
    gender char (1) check (gender in('m', 'n'))
);
 drop table if exists teachers;   
create table teachers (
	id integer primary key auto_increment,
    name varchar (64) not null,
    lastname varchar (64) not null,
    age integer check (age between 0 and 120)
);
    
create table lesson (
	id integer primary key auto_increment,
    subject varchar (64),
    teacher_id integer
);

insert into students values (1, "Роман", "Рихерт", "m");
insert into students (name, lastname, gender) values ("Сергей", "Перминов", "m");
insert into students (name, lastname, gender) values ("Татьяна", "Чебанова", "n");
insert into students (name, lastname, gender) values ("Виолетта", "Балабанова", "n");
insert into students (name, lastname, gender) values ("Евгений", "Макаров", "m");


insert into teachers (name, lastname, age) values ("Олег", "Попов", 45);
insert into teachers (name, lastname, age) values ("Валентина", "Маркова", 60);
insert into teachers (name, lastname, age) values ("Татьяна", "Рубцова", 34);
insert into teachers (name, lastname, age) values ("Гайк", "Инанц", 29);
insert into teachers (name, lastname, age) values ("Андрей", "Белов", 47);

insert into lesson (subject, teacher_id) values ("Физ-ра", 1);
insert into lesson (subject, teacher_id) values ("Математика", 2);
insert into lesson (subject, teacher_id) values ("Алгоритмы", 3);
insert into lesson (subject, teacher_id) values ("SQL", 4);
insert into lesson (subject, teacher_id) values ("Java", 5);





