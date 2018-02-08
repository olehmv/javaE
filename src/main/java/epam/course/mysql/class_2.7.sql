use labor_sql;

select * from income_o;
select * from outcome_o;


select point,date,inc,`out` from
(select i.point,i.date,CASE(i.point) WHEN i.point is not null THEN i.inc else i.inc-i.inc END as inc,null `out`
from income_o i 
union all
select o.point,o.date,null inc,CASE(o.point) WHEN o.point is not null THEN o.out else o.out-o.out END as `out`
from outcome_o o 
) r;



/*7. Приймаючи, що прихід та розхід грошей на кожному пункті
прийому фіксується не частіше одного разу на день (таблиці
Income_o та Outcome_o), написати запит з вихідними даними:
point (пункт), date (дата), inc (прихід), out (розхід). (Підказка:
використовувати повне зовнішнє з’єднання та оператор CASE)