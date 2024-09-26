public class BankMain {

        public static void main(String[] args) {

            // Creating a new bank account with an initial deposit and balance
            Bank account1 = new Bank(100.0, 1000.0);

            // Print initial account details
            account1.printAccountDetails();

            // Set a new deposit and update balance
            account1.setDeposit(200.0);

            // Print updated account details
            account1.printAccountDetails();

            // Get the current balance and deposit values
            double currentDeposit = account1.getDeposit();
            double currentBalance = account1.getBalance();

            // Print the values retrieved using getters
            System.out.println("Retrieved Deposit: " + currentDeposit);
            System.out.println("Retrieved Balance: " + currentBalance);
        }
    }


