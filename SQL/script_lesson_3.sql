create table client(
	id integer primary key,
	name varchar(64),
	lastname varchar(64),
	locator_id integer,
	city varchar(64)
);

insert into client (id, name, lastname, locator_id, city) values
		(1 , 'Александр' , 'Иванов'       , 1, 'Уфа'),
		(2 , 'Борис'     , 'Калинин'      , 7, 'Ереван'),
		(3 , 'Петр'      , 'Суворов'      , 2, 'Казань'),
		(4 , 'Юрий'      , 'Сахаров'      , 6, 'Владимир'),
		(5 , 'Всеволод'  , 'Долгих'       , 4,  null),
		(6 , 'Александр' , 'Виноградов'   , 5, 'Москва'),
		(7 , 'Николай'   , 'Николаев'     , 2, 'Нижний Новгород'),
		(8 , 'Ольга'     , 'Печуркина'    , 1, 'Санкт-Петербург'),
		(9 , 'Екатерина' , 'Александрова' , 8, 'Чебоксары'),
		(10, 'Юлия'      , 'Абрикосова'   , 3, 'Москва');


create table locators(
	locator_id integer primary key,
	phone varchar(20),
	email varchar(64)
);

insert into locators (locator_id, phone, email) values
	(1,	'+7(495)563-83-79'   ,  'ivan.92@mail.ru'),
	(2,	'+374(905)750-44-13' ,  'Nik.nik@mail.ru'),
	(3,	'+7(916)258-30-30'   ,  'Apricot.Yla@mail.ru'),
	(4,	'+7(909)546-77-76'   ,  'Dolg.Seva@mail.ru'),
	(5,	'+374(903)391-77-01' ,  'Vino.Sasha@mail.ru'),
	(6,	'+7(495)620-04-40'   ,  'Sacharov.Yuri_13@mail.ru'),
	(7,	'+374(905)980-02-08' ,  'Bor.Kalin@mail.ru'),
	(8,	'+7(916)444-22-04'   ,  'Katusha.93@mail.ru');



create table transactions(
	id integer primary key,
	client_id integer,
	money_amount DECIMAL(10, 2),
	currency_id integer
);

insert into transactions (id, client_id, money_amount, currency_id) values
	(1,   4,  16600   ,2),
	(2,   5,  5       ,2),
	(3,   7,  15000   ,2),
	(4,   7,  14700   ,3),
	(5,   10, 50000   ,2),
	(6,   7,  11000   ,1),
	(7,   2,  10900   ,3),
	(8,   6,  15400   ,3),
	(9,   5,  null    ,1),
	(10,  7,  15100   ,2),
	(11,  8,  null    ,1),
	(12,  5,  10400   ,1),
	(13,  5,  17700   ,2),
	(14,  8,  15600   ,2),
	(15,  3,  14600   ,2),
	(16,  6,  13900   ,2),
	(17,  4,  700000  ,2),
	(18,  8,  null    ,2),
	(19,  6,  17000   ,1),
	(20,  10, null    ,3),
	(21,  3,  1000000 ,3),
	(22,  7,  17300   ,1),
	(23,  2,  15100   ,2),
	(24,  7,  18600   ,3),
	(25,  3,  4       ,1),
	(26,  2,  18900   ,2),
	(27,  5,  null    ,1),
	(28,  5,  14800   ,3),
	(29,  5,  17100   ,1),
	(30,  4,  16700   ,3);


create table currency_types(
	id integer primary key,
	title varchar(16)
);

insert into currency_types (id, title) values
	(1, 'Рубль'),
	(2, 'Доллар'),
	(3, 'Евро');


create table currency_exchange(
	id integer,
	to_currency_id integer,
	coef DECIMAL(10, 3)
);


insert into currency_exchange (id, to_currency_id, coef) values
	(1, 2, 0.013),
	(1, 3, 0.011),
	(2, 1, 76.01),
	(2, 3, 0.85),
	(3, 1, 89.88),
	(3, 2, 1.18);
