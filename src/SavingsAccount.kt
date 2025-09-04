class SavingsAccount (_accountNumber: String, _name: String, _balance: Double): DepositableBankAccount (_accountNumber, _name, _balance) {

    override fun withdraw(amount: Double) {
        if (amount <= getBalance()) super.withdraw(amount)
    }



}