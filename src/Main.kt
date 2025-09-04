fun main(args: Array<String>) {
    println("First National Bank")

    val bankAccount : BankAccount = CDAccount("ABC123", "Sarah Morgan", 450.00)

    println("Account holder name: ${bankAccount.name}")
    println("Account balance: ${bankAccount.getBalance()}")

    println("Account balance: ${bankAccount.getBalance()}")

    bankAccount.withdraw(1150.00)

    println("Account balance: ${bankAccount.getBalance()}")


}

fun performWithdrawel (bankAccount: BankAccount, amount: Double) {
    bankAccount.withdraw(amount)
}