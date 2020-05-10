class BankAccount{
private balance

    BankAccount(openingBalance){
        balance = openingBalance
    }

   def void deposit(amount){
    balance += amount
    }

    def void withdraw(amount){
        if(amount>balance){
            throw new InsufficientFundsException()
        }
        balance -= amount
    }

   
}