
CREATE TABLE customer (
    cust_no VARCHAR2(15) PRIMARY KEY,
    name VARCHAR2(255) NOT NULL,
    phone_no VARCHAR2(15),
    city VARCHAR2(255)
);


CREATE TABLE account (
    acc_no VARCHAR2(5) PRIMARY KEY,
    balance NUMBER(10, 2),
    type VARCHAR2(50),
    cust_no VARCHAR2(15),
    FOREIGN KEY (cust_no) REFERENCES customer(cust_no)
);

CREATE TABLE loan (
    loan_no VARCHAR2(5) PRIMARY KEY,
    amount NUMBER(10, 2),
    type VARCHAR2(50),
    cust_no VARCHAR2(15),
    FOREIGN KEY (cust_no) REFERENCES customer(cust_no)
);
