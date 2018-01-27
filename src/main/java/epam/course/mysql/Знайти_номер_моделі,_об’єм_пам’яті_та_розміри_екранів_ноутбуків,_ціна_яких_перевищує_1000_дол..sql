use labor_sql;
select l.model, l.ram, l.screen, l.price from laptop l
where l.price>1000
order by ram, price desc