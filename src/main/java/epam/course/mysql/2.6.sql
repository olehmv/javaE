use labor_sql;
select  distinct maker from product
where maker=any(select maker from product where type="PC") and type="Laptop";


/*6. БД «Комп. фірма». Знайдіть виробників, що випускають
одночасно ПК та ноутбуки (використати ключове слово ANY).
Вивести maker.