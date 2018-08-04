object MainClass extends App {

  val acct1 = new BankAccount("Eric Nace", 345.63, "savings")
  val acct2 = new BankAccount("Jen Nace", 3454.63, "savings")
  val acct3 = new BankAccount("Quin Nace", 3457.63, "checking")
  val acct4 = new BankAccount("Zee Nace", 3455.63, "savings")
  val acct5 = new BankAccount("Raff Nace", 345.63, "savings")
  val acct6 = new BankAccount("Calista Nace", 945.63, "checking")

  println(acct1)
  println(acct2)
  println(acct3)
  println(acct4)
  println(acct5)
  println(acct6)

}


class BankAccount(fName:String, balance:Double, acctType:String ) {

  val acctID: Int = BankAccount.accountIDs()

  override def toString:String = {
   "Name: " + fName + " Balance: " + balance.toString + " Type:" + acctType + " Acct ID: " + acctID.toString
  }
}

object BankAccount {
  var acctNumber = 5000

  def accountIDs(): Int = {
    acctNumber += 1
    acctNumber
  }
}