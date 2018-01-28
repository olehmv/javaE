use labor_sql;
select s.*, c.country from ships s, classes c
where s.class=c.class;

/*13. БД «Кораблі». Для кораблів таблиці Ships вивести країни,
яким вони належать.