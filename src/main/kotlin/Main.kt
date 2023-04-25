import java.lang.reflect.Type

fun main() {
println(returnin("vocado"))
   println( compatible("Misunderstood"))
multiples()
    var account= CurrentAccount("1234123","Moses Milo", 5000.0)
    account.deposit(500.0)
    account.withdraw(1000.0)
    account.details()

    var saving= SavingsAccount("4567","Moses Milo",10000.0,5)
        saving.deposit(200.0)
    saving.withdraw(1500.0)
    saving.details()

}

//1. Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun returnin(word:String): List<Any> {
    var first= (word.toLowerCase().first())
    var last= word.last()
    var long= word.length
      var vowe= arrayOf('a', 'e','i','o','u')
    var doe= first in vowe
   if (first in vowe){
        var does= true
        println(does)
        }
    else{
        println("Doesnt start with vowel")
    }
    var answer= listOf<Any>(first, last,long,doe)

    return answer
}

//2. Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)
fun compatible(password:String): Boolean {
    var leng= password.length
    return (leng in 8..16 && password!="password")

}

//3. Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multiples(){
    for (x in 1..1000){
        if (x%6==0 && x %8==0){
            println("Bingo")
        }
        else if (x%8==0){
            println("$x Multiple of 8")
        }
        else if (x%6==0){
            println("$x is multiple of 6")
        }
        else {
            null
        }

    }
}
//4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)

open class CurrentAccount( var accountno:String, var accountName:String, var balance:Double){
  open  fun deposit(amount:Double){
        balance+=amount
        println(balance)
    }
  open  fun withdraw(amount:Double){
        balance-=amount
        println(balance)
    }
    open fun details(){
        println("Account number $accountno with balance ${balance} is operated by $accountName")
    }
}

//5 Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)

class SavingsAccount(accountno: String, accountName: String, balance: Double, var withdrawal:Int)
    :CurrentAccount(accountno, accountName, balance){
    override fun deposit(amount: Double) {
        super.deposit(amount)
    }

    override fun withdraw(amount: Double) {
        if (withdrawal<4){
        balance-=amount
            withdrawal++
        println(balance)}

    }

    override fun details() {
        super.details()
    }

}






































