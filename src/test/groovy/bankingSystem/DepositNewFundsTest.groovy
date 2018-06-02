package bankingSystem

import spock.lang.Specification

import static org.assertj.core.api.Assertions.assertThat

class DepositNewFundsTest extends Specification{

private final DepositAccount = new DepositAccount();

    def "interest rate for newly deposited funds is greater that for the rest of the funds"() {
        expect:
        assertThat(repository.getAccountsForCustomer(customer)).isEmpty()

        where:
        customer = new Customer()
    }


}
