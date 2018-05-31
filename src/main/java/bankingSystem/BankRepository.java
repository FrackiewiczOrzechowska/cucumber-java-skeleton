package bankingSystem;

import java.util.Map;
import java.util.Set;

public class BankRepository implements BankInterface{

    private Map<Customer, Set<Account>> mapAccounts;
    private Map<Account, Set<DepositAccount>> mapDeposits;

    


}
