#6
select distinct
	t1.maker,
	t2.speed
from  Product t1
inner join Laptop t2
on t1.model = t2.model
where hd >= 10;

#7

