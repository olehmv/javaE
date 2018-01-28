use labor_sql;
select t.*, c.name from trip t
join company c on t.ID_comp=c.ID_comp
where plane="Boeing";

/*14. БД «Аеропорт». Для рейсових літаків 'Boeing' вказати назви
компаній, яким вони належать.