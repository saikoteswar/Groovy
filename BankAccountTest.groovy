import groovy.util.GroovyTestCase

class BankAccountTests extends GroovyTestCase{

    private account

    def void setUp() {
        account = new BankAccount(10)
    }

    def void tearDown(){
        account = null
    }

    def void testCanDepositMoney(){
        account.deposit(2);
        assert 12 == account.balance
    }
    
    def void testCanWithdrawMoney(){
        account.withdraw(5)
        assert 5 == account.balance
    }
    
    def void testCanNotWithdrawMoneyMoreThanBalance(){
        shouldFail(InsufficientFundsException){
            account.withdraw(15)
        }
    }
    
}