package factoryPattern

fun main(){

    var pizzaStore:PizzaStore

    pizzaStore=PizzaStore(SimplePizzaFactory())

    pizzaStore.orderPizza("Chees")

}

interface Pizza{
     fun prepare()
     fun bake()
     fun cut()
     fun box()
}

class CheesPizza:Pizza{

    override fun prepare() {
        println("Preparing Chees Pizza")
    }

    override fun bake() {
        println("Baking Chees Pizza")
    }

    override fun cut() {
        println("Cutting Chees Pizza")
    }

    override fun box() {
        println("Boxing Chees Pizza")
    }

}

class VeggiePizza:Pizza{
    override fun prepare() {
        println("Preparing Veggie Pizza")
    }

    override fun bake() {
        println("Baking Veggie Pizza")
    }

    override fun cut() {
        println("Cutting Veggie Pizza")
    }

    override fun box() {
        println("boxing Veggie Pizza")
    }

}

class PepperoniPizza:Pizza{
    override fun prepare() {
        println("Preparing Pepperoni Pizza")
    }

    override fun bake() {
        println("Baking Pepperoni Pizza")
    }

    override fun cut() {
        println("Cutting Pepperoni Pizza")
    }

    override fun box() {
        println("Boxing Pepperoni Pizza")
    }

}

class SimplePizzaFactory{

    var pizza:Pizza?=null

    fun createPizza(type:String):Pizza{
        if(type.equals("Chees")){
            pizza=CheesPizza()
        }else if(type.equals("Veggie")){
            pizza=VeggiePizza()
        }else if(type.equals("Pepperoni")){
            pizza=PepperoniPizza()
        }

        return pizza!!
    }


}

open class PizzaStore{
    val pizzaFactory:SimplePizzaFactory

    constructor(Factory: SimplePizzaFactory){
        pizzaFactory=Factory
    }

    fun orderPizza(type:String):Pizza{
        var pizza:Pizza?=null

        pizza=pizzaFactory.createPizza(type)

        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza!!
    }
}