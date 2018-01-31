use labor_sql;

select p.*,pr.*,pc.*
	from product p
    left join printer pr on p.model=pr.model
    left join PC pc on p.model=pc.model
    order by pc.ram;




/*5. Знайдіть виробників принтерів, що випускають ПК з
найменшим об’ємом RAM. Виведіть: maker.