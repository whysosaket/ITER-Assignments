use bankingdb;

CREATE TABLE customer (
    cust_no VARCHAR(15) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    phone_no VARCHAR(15),
    city VARCHAR(255)
);

CREATE TABLE account (
    acc_no VARCHAR(5) PRIMARY KEY,
    balance DECIMAL(10, 2),
    type VARCHAR(50),
    cust_no VARCHAR(15),
    FOREIGN KEY (cust_no) REFERENCES customer(cust_no)
);

CREATE TABLE loan (
    loan_no VARCHAR(5) PRIMARY KEY,
    amount DECIMAL(10, 2),
    type VARCHAR(50),
    cust_no VARCHAR(15),
    FOREIGN KEY (cust_no) REFERENCES customer(cust_no)
);
