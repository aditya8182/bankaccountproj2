import java.time.temporal.TemporalAmount

fun main(args: Array<String>) {
    //Step 1
    var accountBalance= (0..1000).random()
    println("Account balance is : $accountBalance")
    val money =(0..1000).random()
    println("Account balance is : $accountBalance and money to be deposited/withdrawl : $money")
    //Step 2
    var output=0
    //Step 3
    fun withdraw(amount: Int) : Int
    {
        accountBalance = accountBalance- amount
        println("You successfully withdrew ${amount} dollars. The current balance is ${accountBalance} dollars.")
        return amount
    }
    //Step 4
    //output=withdraw(money)
    //println("Output is: $output")
    //Step 5
    fun debitWithdraw(amount: Int): Int
    {
        if(accountBalance==0)
        {
            println("Can't withdraw, no money on this account!")
            return accountBalance
        }
        else if(accountBalance<amount)
        {
            println("Not enough money on this account! The checking balance is ${accountBalance} dollars.")
            return 0
        }
        else{
            return withdraw(amount)
        }
    }
    //Step 6
    //output=debitWithdraw(money)
    //Step 7
    fun deposit(amount: Int): Int
    {
        accountBalance =accountBalance+ money
        return accountBalance
    }
    //Step 8
    //output=deposit(money)
    //println("Output is $output")
    fun creditDeposit(amount: Int ):Int
    {
        if(accountBalance==0)
        {
            println("You don’t need to deposit anything in order to pay off the account since it has already been paid off.")
            return accountBalance
        }
        else if(accountBalance+amount >0)
        {
            println("Deposit failed, you tried to pay off an amount greater than the credit balance. The checking balance is ${accountBalance} dollars.")
            return 0
        }
        else if(amount == -accountBalance)
        {
            accountBalance=0
            println("You have paid off this account!")
            return amount
        }
        else
        {
            return deposit(amount)
        }

    }
    output = creditDeposit(money)
    println("The amount you deposited is ${output} dollars.")
}
