fun main(args: Array<String>) {
    println("First National Bank")

    val bankAccount = BankAccount("ABC123", "Sarah Morgan", 450.00)

    println("Account holder name: ${bankAccount.name}")
    println("Account balance: ${bankAccount.getBalance()}")

    bankAccount.deposit(650.00)

    println("Account balance: ${bankAccount.getBalance()}")

    bankAccount.withdraw(200.00)
    println("Account balance: ${bankAccount.getBalance()}")

    bankAccount.withdraw(1000.00)

    println("Account balance: ${bankAccount.getBalance()}")
}