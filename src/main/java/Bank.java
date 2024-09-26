public class Bank {

                    // Pseudo steps
        // Instance variables for deposit and balance
//    // Constructor to initialize deposit and balance
    // Getter method for deposit and balance
    // Setter method for deposit and balance
    //Print account details

        private double deposit;
        private double balance;

        // Constructor to initialize deposit and balance
        public Bank(double deposit, double balance) {
            this.deposit = deposit;
            this.balance = balance;
        }

        // Getter method for deposit
        public double getDeposit() {
            return this.deposit;
        }

        // Setter method for deposit (updates the balance as well)
        public void setDeposit(double newDeposit) {
            this.deposit = newDeposit; // Update the deposit
            this.balance += newDeposit; // Increase the balance by the deposit amount
        }

        // Getter method for balance
        public double getBalance() {
            return this.balance;
        }

        // Method to print account details
        public void printAccountDetails() {
            System.out.println("Current Deposit: " + this.deposit);
            System.out.println("Current Balance: " + this.balance);
        }
    }

