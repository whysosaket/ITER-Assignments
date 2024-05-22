-- Add dummy data to customer table
INSERT INTO customer (cust_no, name, phone_no, city)
VALUES ('C0003', 'Rajesh Kumar', '1234567890', 'MUM');

INSERT INTO customer (cust_no, name, phone_no, city)
VALUES ('C0005', 'Priya Singh', '9876543210', 'DEL');

INSERT INTO customer (cust_no, name, phone_no, city)
VALUES ('C0008', 'Amit Sharma', '5555555555', 'BLR');

INSERT INTO customer (cust_no, name, phone_no, city)
VALUES ('C0016', 'Neha Gupta', '7767676767', 'KOL');


-- Add dummy data to account table
INSERT INTO account (acc_no, balance, type, cust_no)
VALUES ('A0005', 15000.00, 'Savings', 'C0003');

INSERT INTO account (acc_no, balance, type, cust_no)
VALUES ('A0008', 10000.00, 'Checking', 'C0008');


-- Add dummy data to loan table
INSERT INTO loan (loan_no, amount, type, cust_no)
VALUES ('L0001', 15000.00, 'Home Loan', 'C0003');

INSERT INTO loan (loan_no, amount, type, cust_no)
VALUES ('L0002', 10000.00, 'Auto Loan', 'C0005');

INSERT INTO loan (loan_no, amount, type, cust_no)
VALUES ('L0003', 8000.00, 'Personal Loan', 'C0008');
