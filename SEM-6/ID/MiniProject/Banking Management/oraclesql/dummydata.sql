INSERT INTO customer (cust_no, name, phone_no, city) VALUES (1, 'Ramesh Kumar', '123-456-7890', 'Mumbai');
INSERT INTO customer (cust_no, name, phone_no, city) VALUES (2, 'Sunita Gupta', '987-654-3210', 'Delhi');
INSERT INTO customer (cust_no, name, phone_no, city) VALUES (3, 'Prakash Singh', '555-123-4567', 'Bangalore');

INSERT INTO account (acc_no, balance, type, cust_no) VALUES (101, 5000.00, 'Savings', 1);
INSERT INTO account (acc_no, balance, type, cust_no) VALUES (102, 10000.00, 'Checking', 2);
INSERT INTO account (acc_no, balance, type, cust_no) VALUES (103, 7500.00, 'Savings', 3);

INSERT INTO loan (loan_no, amount, type, cust_no) VALUES (201, 15000.00, 'Home Loan', 1);
INSERT INTO loan (loan_no, amount, type, cust_no) VALUES (202, 10000.00, 'Auto Loan', 2);
