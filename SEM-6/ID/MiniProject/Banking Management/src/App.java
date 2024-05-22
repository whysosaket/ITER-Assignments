import java.sql.*;
import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        Connection con = null;
        Statement stmt = null;
        Scanner scanner = new Scanner(System.in);

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String conurl = "jdbc:oracle:thin:@localhost:1521:orclcdb";
            con = DriverManager.getConnection(conurl, "sys as sysdba", "mypassword1");
            // Class.forName("com.mysql.cj.jdbc.Driver");
            // String conurl = "jdbc:mysql://127.0.0.1:3306/bankingdb";
            // con = DriverManager.getConnection(conurl, "root", "saket2002");
            stmt = con.createStatement();

            int choice_variable;
            do {
                System.out.println("\n\n------ Banking Management System ------\n");
                System.out.println("Enter your choice(1-9):");
                System.out.println("1. Display Customer Records");
                System.out.println("2. Add Customer Record");
                System.out.println("3. Delete Customer Record");
                System.out.println("4. Update Customer Record");
                System.out.println("5. Display Account Details");
                System.out.println("6. Display Loan Details");
                System.out.println("7. Deposit Money");
                System.out.println("8. Withdraw Money");
                System.out.println("9. Exit");
                System.out.println("\n--------------------------------------\n");
                choice_variable = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.println("\n");

                switch (choice_variable) {
                    case 1:
                        displayCustomerRecords(stmt);
                        break;
                    case 2:
                        addCustomerRecord(stmt, scanner);
                        break;
                    case 3:
                        deleteCustomerRecord(stmt, scanner);
                        break;
                    case 4:
                        updateCustomerRecord(stmt, scanner);
                        break;
                    case 5:
                        displayAccountDetails(stmt, scanner);
                        break;
                    case 6:
                        displayLoanDetails(stmt, scanner);
                        break;
                    case 7:
                        depositMoney(stmt, scanner);
                        break;
                    case 8:
                        withdrawMoney(stmt, scanner);
                        break;
                    case 9:
                        exitMenu();
                        break;
                    default:
                        invalidChoice();
                        break;
                }
            } while (choice_variable != 9);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            closeResources(stmt, con, scanner);
        }
    }

    static void displayCustomerRecords(Statement stmt) {
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM customer");
            System.out.println("Customer Number\tCustomer Name\tPhone Number\tCity");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
            }
        } catch (SQLException e) {
            System.out.println("Error in displaying customer records: " + e.getMessage());
        }
    }

    static void addCustomerRecord(Statement stmt, Scanner scanner) {
        try {
            System.out.println("Enter customer number:");
            String custno = scanner.nextLine();
            custno = custno.trim().toUpperCase();
            System.out.println("Enter customer name:");
            String custname = scanner.nextLine();
            System.out.println("Enter phone number:");
            String phone = scanner.nextLine();
            System.out.println("Enter city:");
            String city = scanner.nextLine();
            stmt.executeUpdate("INSERT INTO customer VALUES('" + custno + "','" + custname + "','" + phone + "','" + city + "')");
            String accountNumber = "A"+custno.split("C")[1];
            stmt.executeUpdate("INSERT INTO account VALUES('" + accountNumber + "',0,'Savings','" + custno + "')");
            System.out.println("Customer record added successfully!");
        } catch (SQLException e) {
            System.out.println("Error in adding customer record: " + e.getMessage());
        }
    }

    static void deleteCustomerRecord(Statement stmt, Scanner scanner) {
        try {
            System.out.println("Enter customer number to delete:");
            String custno = scanner.nextLine();
            custno = custno.trim().toUpperCase();
            stmt.executeUpdate("DELETE FROM loan WHERE cust_no=" + "'"+custno+"'");
            stmt.executeUpdate("DELETE FROM account WHERE cust_no=" + "'"+custno+"'");
            stmt.executeUpdate("DELETE FROM customer WHERE cust_no=" + "'"+custno+"'");
            System.out.println("Customer record deleted successfully!");
        } catch (SQLException e) {
            System.out.println("Error in deleting customer record: " + e.getMessage());
        }
    }

    static void updateCustomerRecord(Statement stmt, Scanner scanner) {
        try {
            System.out.println("Enter customer number to update:");
            String custno = scanner.nextLine();
            custno = custno.trim().toUpperCase();
            System.out.println("1. Update name");
            System.out.println("2. Update phone number");
            System.out.println("3. Update city");
            System.out.println("Enter your choice(1-3):");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    System.out.println("Enter new name:");
                    String name = scanner.nextLine();
                    stmt.executeUpdate("UPDATE customer SET name='" + name + "' WHERE cust_no=" + "'"+custno+"'");
                    break;
                case 2:
                    System.out.println("Enter new phone number:");
                    String phone = scanner.nextLine();
                    stmt.executeUpdate("UPDATE customer SET phone_no='" + phone + "' WHERE cust_no=" + "'"+custno+"'");
                    break;
                case 3:
                    System.out.println("Enter new city:");
                    String city = scanner.nextLine();
                    stmt.executeUpdate("UPDATE customer SET city='" + city + "' WHERE cust_no=" + "'"+custno+"'");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
            System.out.println("Customer record updated successfully!");
        } catch (SQLException e) {
            System.out.println("Error in updating customer record: " + e.getMessage());
        }
    }

    static void displayAccountDetails(Statement stmt, Scanner scanner) {
        try {
            System.out.println("Enter customer number to display account details:");
            String custno = scanner.nextLine();
            custno = custno.trim().toUpperCase();
            ResultSet rs = stmt.executeQuery("SELECT * FROM account WHERE cust_no=" + "'"+custno+"'");
            System.out.println("Account Number\tBalance\tType\tCustomer Number");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t" + rs.getFloat(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
            }
        } catch (SQLException e) {
            System.out.println("Error in displaying account details: " + e.getMessage());
        }
    }

    static void displayLoanDetails(Statement stmt, Scanner scanner) {
        try {
            System.out.println("Enter customer number to display loan details:");
            String custno = scanner.nextLine();
            custno = custno.trim().toUpperCase();
            ResultSet rs = stmt.executeQuery("SELECT * FROM loan WHERE cust_no=" + "'"+custno+"'");
            System.out.println("Loan Number\tAmount\tType\tCustomer Number");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t" + rs.getFloat(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
            }
        } catch (SQLException e) {
            System.out.println("Error in displaying loan details: " + e.getMessage());
        }
    }

    static void depositMoney(Statement stmt, Scanner scanner) {
        try {
            System.out.println("Enter account number to deposit money:");
            String accno = scanner.nextLine();
            accno = accno.trim().toUpperCase();
            System.out.println("Enter amount to deposit:");
            float amount = scanner.nextFloat();
            stmt.executeUpdate("UPDATE account SET balance=balance+" + amount + " WHERE acc_no=" + "'"+accno+"'");
            System.out.println("Money deposited successfully!");
        } catch (SQLException e) {
            System.out.println("Error in depositing money: " + e.getMessage());
        }
    }

    static void withdrawMoney(Statement stmt, Scanner scanner) {
        try {
            System.out.println("Enter account number to withdraw money:");
            String accno = scanner.nextLine();
            accno = accno.trim().toUpperCase();
            System.out.println("Enter amount to withdraw:");
            float amount = scanner.nextFloat();
            ResultSet rs = stmt.executeQuery("SELECT balance FROM account WHERE acc_no=" + "'"+accno+"'");
            rs.next();
            float balance = rs.getFloat(1);
            if (balance >= amount) {
                stmt.executeUpdate("UPDATE account SET balance=balance-" + amount + " WHERE acc_no=" + "'"+accno+"'");
                System.out.println("Money withdrawn successfully!");
            } else {
                System.out.println("Insufficient balance!");
            }
        } catch (SQLException e) {
            System.out.println("Error in withdrawing money: " + e.getMessage());
        }
    }

    static void exitMenu() {
        System.out.println("Exiting the menu...");
    }

    static void invalidChoice() {
        System.out.println("Invalid choice! Please enter a number between 1 to 9.");
    }

    static void closeResources(Statement stmt, Connection con, Scanner scanner) {
        try {
            if (stmt != null) stmt.close();
            if (con != null) con.close();
            if (scanner != null) scanner.close();
        } catch (SQLException e) {
            System.out.println("Error in closing resources: " + e.getMessage());
        }
    }
}
