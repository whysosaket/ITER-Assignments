USE University;

-- a
DESCRIBE Instructor;
DESCRIBE Course;
DESCRIBE Prereq;
DESCRIBE Department;
DESCRIBE Teaches;

-- b
SELECT * FROM Instructor;
SELECT * FROM Course;
SELECT * FROM Prereq;
SELECT * FROM Department;
SELECT * FROM Teaches;

-- c
SELECT name, Dept_name FROM Instructor;

-- d
SELECT name, salary FROM Instructor WHERE Dept_name = 'Comp. Sci.';

-- e
SELECT * from Instructor WHERE Dept_name = 'Physics' AND Salary < 90000;

-- f
SELECT name from Instructor WHERE Dept_name != 'Comp. Sci';

