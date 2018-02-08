use labor_sql;
select * from product;
select * from PC;
select distinct maker from product p
join PC pc on p.model=pc.model
where p.type="PC";


/*7. БД «Комп. фірма». Знайти тих виробників ПК, усі моделі ПК
яких є у наявності в таблиці PC (використовувати вкладені
підзапити та оператори IN, ALL, ANY). Вивести maker.