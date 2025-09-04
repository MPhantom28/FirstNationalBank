abstract class BankAccount (_accountNumber: String, _name: String, _balance: Double){

    //PROPERTIES
    //val cannot be changed
    //these are all public
    val accountNumber = _accountNumber
    var name = _name
    private var balance = _balance
    //dont use double in irl money value and should use a currency type like dollars and cents
    //lateinit doesnt work for primitive values

    //FUNCTIONS
    fun getBalance() : Double {
        return balance
    }

    fun deposit (amount: Double) {
        if (amount > 0) balance += amount
    }

    open fun withdraw (amount: Double) {
        if (amount > 0) balance -= amount
    }

}