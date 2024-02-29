
-- Answer 1

CREATE TABLE Instructor(
ID Number(5),
Name Varchar2(30),
Dept_name Varchar2(20),
Salary Number(6)
);

CREATE TABLE Course(
Course_id Varchar2(10),
Title Varchar2(30),
Dept_name Varchar2(20),
Credits Number(2)
);

CREATE TABLE Prereq(
Course_id Varchar2(10),
Prereq_id Varchar2(10)
);

CREATE TABLE Department(
Dept_name Varchar2(20),
Building Varchar2(20),
Budget Number(10),
);

CREATE TABLE Teaches(
ID Number(5),
Course_id Varchar2(10),
Sec_id Number(2),
Semester Varchar2(10),
year Number(4)
);


-- Answer 2

INSERT INTO instructor (ID, name, dept_name, salary)
VALUES (10101, 'Srinivasan', 'Comp. Sci.', 65000),
(12121, 'Wu', 'Finance', 90000),
(15151, 'Mozart', 'Music', 40000),
(22222, 'Einstein', 'Physics', 95000),
(32343, 'El Said', 'History', 60000),
(33456, 'Gold', 'Physics', 87000),
(45565, 'Katz', 'Comp. Sci.', 75000),
(58583, 'Califieri', 'History', 62000),
(76543, 'Singh', 'Finance', 80000),
(76766, 'Crick', 'Biology', 72000),
(83821, 'Brandt', 'Comp. Sci.', 92000),
(98345, 'Kim', 'Elec. Eng.', 80000)
;

-- Answer 3

INSERT INTO course (course_id, title, dept_name, credits)
VALUES 
('BIO-101', 'Intro. to Biology', 'Biology', 4),
('BIO-301', 'Genetics', 'Biology', 4),
('BIO-399', 'Computational Biology', 'Biology', 3),
('CS-101', 'Intro. to Computer Science', 'Comp. Sci.', 4),
('CS-190', 'Game Design', 'Comp. Sci.', 4),
('CS-315', 'Robotics', 'Comp. Sci.', 4),
('CS-347', 'Image Processing', 'Comp. Sci.', 3),
('EE-181', 'Intro. to Digital Systems', 'Elec. Eng.', 3),
('FIN-201', 'Investment Banking', 'Finance', 3),
('HIS-351', 'World History', 'History', 3),
('MU-199', 'Music Video Production', 'Music', 3),
('PHY-101', 'Physical Principles', 'Physics', 4)
;


-- Answer 4

INSERT INTO prereq (course_id, prereq_id)
VALUES 
('BIO-301', 'BIO-101'),
('BIO-399', 'BIO-101'),
('CS-190', 'CS-101'),
('CS-315', 'CS-101'),
('CS-319', 'CS-101'),
('CS-347', 'CS-101'),
('EE-181', 'PHY-101')
;


-- Answer 5

INSERT INTO department (dept_name, building, budget)
VALUES
('Biology', 'Watson', 90000),
('Comp. Sci.', 'Taylor', 100000),
('Elec. Eng.', 'Taylor', 85000),
('Finance', 'Painter', 120000),
('History', 'Painter', 50000),
('Music', 'Packard', 80000),
('Physics', 'Watson', 70000)
;


-- Answer 6

INSERT INTO Teaches (ID, course_id, sec_id, semester, year)
VALUES
(10101, 'CS-101', 1, 'Fall', 2009),
(10101, 'CS-315', 1, 'Spring', 2010),
(10101, 'CS-347', 1, 'Fall', 2009),
(12121, 'FIN-201', 1, 'Spring', 2010),
(15151, 'MU-199', 1, 'Spring', 2010),
(22222, 'PHY-101', 1, 'Fall', 2010),
(32343, 'HIS-351', 1, 'Spring', 2010),
(45565, 'CS-101', 1, 'Spring', 2010),
(45565, 'CS-319', 1, 'Spring', 2010),
(76766, 'BIO-101', 1, 'Summer', 2009),
(76766, 'BIO-301', 1, 'Summer', 2010),
(83821, 'CS-190', 1, 'Spring', 2009),
(83821, 'CS-190', 2, 'Spring', 2009),
(83821, 'CS-319', 2, 'Spring', 2010),
(98345, 'EE-181', 1, 'Spring', 2009)
;

