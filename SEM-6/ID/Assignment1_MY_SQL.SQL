USE university;

-- Question 1

CREATE TABLE Instructor(
ID INT(5),
Name VARCHAR(30),
Dept_name VARCHAR(20),
Salary INT(6)
);

CREATE TABLE Course(
Course_id VARCHAR(10),
Title VARCHAR(30),
Dept_name VARCHAR(20),
Credits INT(2)
);

CREATE TABLE Prereq(
Course_id VARCHAR(10),
Prereq_id VARCHAR(10)
);

CREATE TABLE Department(
Dept_name VARCHAR(20),
Building VARCHAR(20),
Budget INT(10)
);

CREATE TABLE Teaches(
ID INT(5),
Course_id VARCHAR(10),
Sec_id INT(2),
Semester VARCHAR(10),
year INT(4)
);

-- Question 2

INSERT INTO Instructor (ID, Name, Dept_name, Salary)
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
(98345, 'Kim', 'Elec. Eng.', 80000);

-- Question 3

INSERT INTO Course (Course_id, Title, Dept_name, Credits)
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
('PHY-101', 'Physical Principles', 'Physics', 4);

-- Question 4

INSERT INTO Prereq (Course_id, Prereq_id)
VALUES 
('BIO-301', 'BIO-101'),
('BIO-399', 'BIO-101'),
('CS-190', 'CS-101'),
('CS-315', 'CS-101'),
('CS-319', 'CS-101'),
('CS-347', 'CS-101'),
('EE-181', 'PHY-101');

-- Question 5

INSERT INTO Department (Dept_name, Building, Budget)
VALUES
('Biology', 'Watson', 90000),
('Comp. Sci.', 'Taylor', 100000),
('Elec. Eng.', 'Taylor', 85000),
('Finance', 'Painter', 120000),
('History', 'Painter', 50000),
('Music', 'Packard', 80000),
('Physics', 'Watson', 70000);

-- Question 6

INSERT INTO Teaches (ID, Course_id, Sec_id, Semester, year)
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
(98345, 'EE-181', 1, 'Spring', 2009);
