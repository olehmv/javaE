use labor_sql;
select name, class, count(name) as cnt from ships
group by name
order by name;
/*5. БД «Кораблі». Перерахувати назви головних кораблів (з
таблиці Ships). Вивести: name, class. Вихідні дані
впорядкувати за зростанням за стовпцем name.