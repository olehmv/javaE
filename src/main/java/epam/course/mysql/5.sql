use labor_sql;
select name, class from ships
where name=class
order by name;
show tables;
select * from battles;
use labor_sql;
insert into  battles (name,date) value ("TEST",NOW());
/*5. БД «Кораблі». Перерахувати назви головних кораблів (з
таблиці Ships). Вивести: name, class. Вихідні дані
впорядкувати за зростанням за стовпцем name.