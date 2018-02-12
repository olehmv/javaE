use labor_sql;

 select distinct maker from product 
 where not maker=any(select maker from product where  type="Laptop") and type!="Printer";

/*3. БД «Комп. фірма». Знайдіть виробників, що випускають ПК,
але не ноутбуки (використати ключове слово ANY). Вивести
maker.