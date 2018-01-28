use labor_sql;
select  p.model,p.speed,p.hd 
from pc p join product pd on p.model=pd.model
where pd.maker="A" and (p.hd=10 or p.hd=20)
order by speed;


/*9. БД «Комп. фірма». Знайти модель, частоту процесора та об’єм
жорсткого диску для тих комп’ютерів, що комплектуються
накопичувачами 10 або 20 Мб та випускаються виробником
'A'. Вивести: model, speed, hd. Вихідні дані впорядкувати за
зростанням за стовпцем speed.