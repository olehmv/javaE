use labor_sql;
select * from printer
where type!="Matrix" and price<300
order by type desc;

/*7. БД «Комп. фірма». Отримати інформацію про всі принтери,
які не є матричними та коштують менше 300 дол. Вихідні дані
впорядкувати за спаданням за стовпцем type.