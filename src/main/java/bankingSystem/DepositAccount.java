package bankingSystem;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class DepositAccount {

    private BigDecimal balance;
    private BigDecimal firstBalance;
    private Account linkedAccount;
    private final LocalDate openingDate;
    private final UUID id;


  public DepositAccount (Account linkedAccount, BigDecimal firstBalance, LocalDate openingDate ){
      this.linkedAccount = linkedAccount;
      this.balance = firstBalance;
      this.id = UUID.randomUUID();
      this.openingDate = openingDate;
  }


}
