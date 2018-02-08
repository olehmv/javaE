use labor_sql;
select * from product;
select * from PC;
select * from printer;
select distinct maker from product p 
join PC pc on p.model=pc.model
where maker in (select  distinct p.maker from product p where p.type="printer") and p.type="PC"
order by ram;


/*5. Знайдіть виробників принтерів, що випускають ПК з
найменшим об’ємом RAM. Виведіть: maker.