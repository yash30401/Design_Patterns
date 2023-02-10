import java.util.*

fun main() {

    val pay=Cart(payWithUPi("Hello"))
    pay.performPay()

    println()

    val payWithCash=Cart(payWithCash("Yash",2423423,"Swarn Jayanti Nagar"))
    payWithCash.performPay()

    println()
    val payWithDebitCard=Cart(payWithDebitCard(324223,242,Date(2020-10-20)))
    payWithDebitCard.performPay()
    println()
    val payWithPaypal=Cart(payWithPaypal("Yash","sdasdas"))
    payWithPaypal.performPay()

}


interface paymentBehavior{
    fun pay(amount:Float)
}

class payWithPaypal(email:String,password:String):paymentBehavior{
    override fun pay(amount: Float) {
        println("Paying $amount amount with Payapl")
    }

}

class payWithCash(name:String,phoneNumber:Int,adress:String):paymentBehavior{

    var name=name
    var adress=adress

    override fun pay(amount: Float) {
        println("The item will be delivered to $name at $adress of amount $amount")
    }

}

class payWithCreditCard(cardNumber:Int,cardCvv:Int,cardExpiry: Date):paymentBehavior{
    override fun pay(amount: Float) {
        println("Doing Payment Through Credit Card")
    }

}

class payWithDebitCard(cardNumber:Int,cardCvv:Int,cardExpiry: Date):paymentBehavior{

    var cvv=cardCvv
        set(value) {
           if(value>999){
               println("Check Your Cvv")
           }else{
               field=value
           }
        }


    override fun pay(amount: Float) {
        println("Doing Payment Through Debit Card")
    }

}

class payWithUPi(upiId:String):paymentBehavior{
    override fun pay(amount: Float) {
        println("Doing Payment Through UPI")
    }

}

class payWithNetBanking(email:String,password: String):paymentBehavior{
    override fun pay(amount: Float) {
        println("Doing Payment Through NetBanking")
    }

}

 class Cart{
     var paymentBehavior:paymentBehavior

    constructor(paymentBehavior: paymentBehavior){
        this.paymentBehavior=paymentBehavior
    }

     fun totalAmount():Float{
      return 100.0f
    }

    fun performPay(){
        paymentBehavior.pay(totalAmount())
    }


}

