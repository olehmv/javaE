use labor_sql;
select p.name, pt.date from passenger p, pass_in_trip pt
where p.ID_psg=pt.ID_psg;

/*15. БД «Аеропорт». Для пасажирів таблиці Passenger вивести
дати, коли вони користувалися послугами авіаліній.