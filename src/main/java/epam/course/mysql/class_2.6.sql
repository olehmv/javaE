use labor_sql;
select * from PC;
select * from laptop;

select avg(price.price) from 
(select pc.price,pc.model from PC pc
union
select l.price,l.model from laptop l) price
join product p on p.model=price.model
where p.maker="A";





/*6. БД «Комп. фірма». Знайдіть середню ціну ПК та ноутбуків, що
випущені виробником 'A'. Вивести: одна загальна середня ціна.
(Підказка: використовувати оператор UNION)