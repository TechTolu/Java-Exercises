package chapterThree;

public class ModifiedClass {

        private String name;
        private double balance;

        public ModifiedClass(String name, int balance) {
            this.name = name;
            this.balance = balance;
        }


        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance = amount + balance;
        }

        public void withdrawal(double withdraw) {
            balance = balance - withdraw;
        }
    }


