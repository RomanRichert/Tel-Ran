use classicmodels;

#1
select
	t1.*
from employees t1
inner join offices t2
on t1.officeCode = t2.officeCode
where t2.city = "Boston";

#2
select distinct
	t1.customerName
from customers t1
inner join payments t2
on t1.customerNumber = t2.customerNumber
where t2.paymentDate like "2005%";

#3
select 
	t1.* 
from orders t1
inner join customers t2
on t1.customerNumber = t2.customerNumber
where t1.status = "Resolved" and t2.city = "Madrid";

#4
select 
	t1.employeeNumber,
    CONCAT (t1.firstName, " ", t1.lastName) as employee,
    t1.jobTitle as employeeJobTitle,
    t1.reportsTo,
    CONCAT (t2.firstName, " ", t2.lastName) as supervisor,
    t2.jobTitle as supervisorJobTitle
from employees t1
inner join employees t2
on t1.reportsTo = t2.employeeNumber
where t1.jobTitle != t2.jobTitle;