use labor_sql;
select model,speed from pc
where price between 400 and 600
order by hd;

/*8. БД «Комп. фірма». Знайти модель та частоту процесора
комп’ютерів, що коштують від 400 до 600 дол. Вивести: model,
speed. Вихідні дані впорядкувати за зростанням за стовпцем
hd.