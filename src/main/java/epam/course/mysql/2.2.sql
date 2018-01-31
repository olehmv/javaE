use labor_sql;
 select * from product;
 select distinct maker from product a
 where maker not in(select maker from product where  type="Laptop") and type!="Printer";
 select distinct maker from product 
 where not maker=any(select maker from product where  type="Laptop") and type!="Printer";
 
 select distinct maker from product 
 where maker<>all(select maker from product where type="Laptop") and type!="Printer";

/*2. БД «Комп. фірма». Знайдіть виробників, що випускають ПК, але
не ноутбуки. Вивести maker. (використати операції IN, ANY,
ALL)
maker
----------
E