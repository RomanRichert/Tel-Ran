#1
select 
model, speed, hd
from PC
where price < 500;

#2
select distinct
maker
from Product
where type in ('Printer');

#3
select
model,
ram,
screen
from Laptop
where price > 1000;

#4
select
*
from Printer
where color in('y');

#5
select
model,
speed,
hd
from PC
where CD in('12x', '24x') and price < 600;