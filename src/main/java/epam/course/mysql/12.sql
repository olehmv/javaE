use labor_sql;
select o.*, b.date from outcomes o
join battles b on b.name=o.battle
where o.result="damaged" or o.result="Ok";

/*12. БД «Кораблі». Для кораблів, що вціліли у битвах, вивести
назви та дати битв, у яких вони брали участь.