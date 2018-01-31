use labor_sql;
select p.*,pr.*
    from product p
    join printer pr on p.model=pr.model where color!="n"
    order by price;

/*4. БД «Комп. фірма». Знайдіть виробників найдешевших
кольорових принтерів. Вивести: maker, price.