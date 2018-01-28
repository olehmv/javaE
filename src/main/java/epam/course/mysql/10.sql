use labor_sql;
select p.maker, p.type, l.model, l.speed from laptop l
join product p on l.model=p.model
where speed>600;

/*10. БД «Комп. фірма». Виведіть виробника, тип, модель та частоту
процесора для ноутбуків, частота процесорів яких перевищує
600 МГц. Вивести: maker, type, model, speed.