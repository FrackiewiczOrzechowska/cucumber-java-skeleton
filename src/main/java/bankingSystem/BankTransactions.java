package bankingSystem;

public class BankTransactions {

    public static final String Error_Deposit = "Deposit not allowed, account of a different customer has been selected";
    public static final String Error_Withdraw = "Withdraw not allowed, account of a different customer has been selected";
    public static final String Error_Transfer = "Deposit not allowed, account of a different customer has been selected";
    public static final String Error_Opening_Deposit = "Opening deposit not allowed, account of a different customer has been selected";

private BankInterface bankInterface;

public BankTransactions (BankInterface bankInterface) {

    this.bankInterface = bankInterface;

}




}
