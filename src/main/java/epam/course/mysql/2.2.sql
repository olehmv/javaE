use labor_sql;
select  distinct maker from product
where maker<>all(select maker from product where type="Laptop")and type!="Printer";

/*2. БД «Комп. фірма». Знайдіть виробників, що випускають ПК,
але не ноутбуки (використати ключове слово ALL). Вивести
maker.