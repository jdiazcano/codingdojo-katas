package example

class BankAccount {

    var balance = 0; private set

    fun deposit(deposit: Int) {
        balance += deposit
    }

}