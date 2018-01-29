use labor_sql;

select * from product;
select * from PC;
select * from Laptop;
select * from Printer;

select  pd.maker,count(pc.module) from product pd
join PC pc on pd.model=pc.model
group by pd.maker;

/*3. Для таблиці Product отримати підсумковий набір у вигляді
таблиці зі стовпцями maker, pc, laptop та printer, в якій для
кожного виробника необхідно вказати кількість продукції, що
ним випускається, тобто наявну загальну кількість продукції у
таблицях, відповідно, PC, Laptop та Printer.