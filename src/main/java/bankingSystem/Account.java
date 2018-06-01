package bankingSystem;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

public class Account {




        private final UUID id;
        private final Customer owner;
        private BigDecimal balance;
        public BigDecimal amount;


        public Account(Customer owner) {
            id = UUID.randomUUID();
            this.owner = owner;
        }


    public BigDecimal getBalance() {
        return this.balance;
    }


    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void printBalance() {
        System.out.println("Your balance equals " + balance + " zloty");
    }

    public void withdraw(BigDecimal amount)  {
        this.balance = this.balance.subtract(amount);
        System.out.println("Withdrawing " + amount + " zloty");
        printBalance();
    }


    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    public void transfer(Account transferDestination, BigDecimal amount){

        this.withdraw(amount);
        System.out.println("Transferring " + amount + "zloty to " + transferDestination);
        printBalance();
    }

        public Customer getOwner()
        {
            return owner;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Account account = (Account) o;
            return Objects.equals(id, account.id);
        }

        @Override
        public int hashCode() {

            return Objects.hash(id);


    }


}
