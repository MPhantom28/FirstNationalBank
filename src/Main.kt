fun main(args: Array<String>) {
    println("First National Bank")

    val bankAccount = SavingsAccount("ABC123", "Sarah Morgan", 450.00)

    println("Account holder name: ${bankAccount.name}")
    println("Account balance: ${bankAccount.getBalance()}")

    bankAccount.deposit(650.00)

    println("Account balance: ${bankAccount.getBalance()}")

    bankAccount.withdraw(1150.00)

    println("Account balance: ${bankAccount.getBalance()}")


}