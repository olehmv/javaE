use labor_sql;

select * from product;
select * from PC;
select * from Laptop;
select * from Printer;

SELECT p.maker,
         COUNT(PC.model) PC_cnt,
         COUNT(Laptop.model) Laptop_cnt,
         COUNT(Printer.model) Printer_cnt
    FROM product p
          LEFT JOIN PC ON p.model = PC.model
          LEFT JOIN Laptop ON p.model = Laptop.model
          LEFT JOIN Printer ON p.model = Printer.model
GROUP BY p.maker;

/*3. Для таблиці Product отримати підсумковий набір у вигляді
таблиці зі стовпцями maker, pc, laptop та printer, в якій для
кожного виробника необхідно вказати кількість продукції, що
ним випускається, тобто наявну загальну кількість продукції у
таблицях, відповідно, PC, Laptop та Printer.