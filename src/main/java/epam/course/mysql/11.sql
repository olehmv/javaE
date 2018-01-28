use labor_sql;
select s.*,c.bore from ships s, classes c
where s.class=c.class;

/*11. БД «Кораблі». Для кораблів таблиці Ships вивести їх
водотоннажність.