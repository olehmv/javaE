use labor_sql;
select * from product;
select  distinct maker from product
where maker in(select maker from product where type="PC") and type="Laptop";

select  distinct maker from product
where maker=any(select maker from product where type="PC") and type="Laptop";

select  distinct maker from product
where maker=all(select maker from product where type=!"Printer");

/*1. БД «Комп. фірма». Знайдіть виробників, що випускають
одночасно ПК та ноутбуки. Вивести maker. (використати
операції IN, ANY, ALL)
maker
----------
A
B