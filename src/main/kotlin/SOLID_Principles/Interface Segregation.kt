package SOLID_Principles


fun main(){
    val waiter=Waiter()
    waiter.serveOrder()
}

interface waiterInterface{

    fun serveOrder()
    fun takeOrder()

}

interface chefInterface{

    fun makeDish()
    fun decideMenu()

}

// Interface should be implemented in such a way that the client does not have to be implemnet unneccessary functions that they do not need.

class Waiter:waiterInterface{

    override fun serveOrder() {
        println("Waiter Serving Order")
    }

    override fun takeOrder() {
        println("Waiter Taking order")
    }

}
