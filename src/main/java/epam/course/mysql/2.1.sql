use labor_sql;
select distinct maker from product 
 where maker not in(select maker from product where  type="Laptop") and type!="Printer";


/*1. БД «Комп. фірма». Знайдіть виробників, що випускають ПК,
але не ноутбуки (використати операцію IN). Вивести maker.