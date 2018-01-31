use StoredPr_DB;
show tables;
drop trigger if exists AfterDeletePost;
select * from post;


DELIMITER //
CREATE TRIGGER AfterDeletePost
AFTER DELETE
ON post FOR EACH ROW
BEGIN
IF(old.post in (select post from employee))
THEN SIGNAL SQLSTATE '45000'
SET MESSAGE_TEXT = 'Delete error MIN cardinality';

END IF;
END //
DELIMITER ;

insert into post values("pos") ;

delete  from post where post="pos";