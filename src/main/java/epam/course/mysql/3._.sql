use StoredPr_DB;
show tables;
drop trigger BeforeInsertEmpl;
select * from employee;
DELIMITER //
CREATE TRIGGER BeforeInsertEmpl
BEFORE INSERT
ON employee FOR EACH ROW
BEGIN
IF (new.Post not in (select * from post))
THEN SIGNAL SQLSTATE '45000'
SET MESSAGE_TEXT = 'CHECK error for Insert';

END IF;
END //
DELIMITER ;
insert into employee values(1,"Ivanov","Ivan","Ivanov",111111,"noi45645",12.3,now(),"pos",4);