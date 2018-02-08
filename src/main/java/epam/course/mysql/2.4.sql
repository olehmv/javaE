use labor_sql;
select * from product;
select distinct maker from product
where maker in(select maker from product where type="PC")and type="Laptop";


/*4. БД «Комп. фірма». Знайдіть виробників, що випускають
одночасно ПК та ноутбуки (використати операцію IN).
Вивести maker.