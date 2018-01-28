use labor_sql;
select * from pc
where speed>=500 and price<=800
union
select * from laptop
where speed>=500 and price<=800
order by price desc
;
/*6. БД «Комп. фірма». Отримати інформацію про комп’ютери, що
мають частоту процесора не менше 500 МГц та ціну нижче 800
дол. Вихідні дані впорядкувати за спаданням за стовпцем price.