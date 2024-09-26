public class BankMain {

        public static void main(String[] args) {
            //PSEUDO steps to create a bank account
            // Create a new bank account with an initial deposit and balance
            // Print initial account details
            // Set a new deposit and update balance
            // Print updated account details
            // Get the current balance and deposit values
            // Print the values retrieved using getters

            Bank account1 = new Bank(100.0, 1000.0);


            account1.printAccountDetails();
            account1.setDeposit(200.0);
            account1.printAccountDetails();

            double currentDeposit = account1.getDeposit();
            double currentBalance = account1.getBalance();

            System.out.println("Retrieved Deposit: " + currentDeposit);
            System.out.println("Retrieved Balance: " + currentBalance);
        }
    }


