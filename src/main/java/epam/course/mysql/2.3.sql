use labor_sql;

select * from product;
select * from PC;
select * from Laptop;
select * from Printer;

SELECT makers.maker,
       pc_cnt.cnt,
       laptop_cnt.cnt,
       printer_cnt.cnt
  FROM (SELECT DISTINCT maker FROM product) makers
       LEFT JOIN (SELECT COUNT (pc.model) cnt, maker
                    FROM product pd JOIN PC pc ON pd.model = pc.model) pc_cnt
          ON makers.maker = pc_cnt.maker
       LEFT JOIN
       (SELECT COUNT (l.model) cnt, maker
          FROM product pd JOIN Laptop l ON pd.model = l.model) laptop_cnt
          ON makers.maker = laptop_cnt.maker
       LEFT JOIN
       (SELECT COUNT (p.model) cnt, maker
          FROM product pd JOIN Printer p ON pd.model = p.model) printer_cnt
          ON makers.maker = printer_cnt.maker;


/*3. Для таблиці Product отримати підсумковий набір у вигляді
таблиці зі стовпцями maker, pc, laptop та printer, в якій для
кожного виробника необхідно вказати кількість продукції, що
ним випускається, тобто наявну загальну кількість продукції у
таблицях, відповідно, PC, Laptop та Printer.