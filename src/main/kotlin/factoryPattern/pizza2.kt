package factoryPattern

fun main() {

    val pizzaStore = NYPizzaStore()
    pizzaStore.orderPizza("Chees")

    val pizzaStore2 = CaliforniaPizzaStore()
    pizzaStore2.orderPizza("Chees")


}

interface pizza {
    fun prepare()
    fun bake()
    fun cut()
    fun box()
}

abstract class PizzaStore2 {

    fun orderPizza(type: String): pizza {
        var pizza: pizza
        pizza = createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza
    }

    abstract fun createPizza(type: String): pizza
}

class NYPizzaStore : PizzaStore2() {
    override fun createPizza(type: String): pizza {
        var pizza: pizza? = null
        if (type.equals("Chees")) {
            pizza = NYCheesPizza()
        } else if (type.equals("Thin Crust")) {
            pizza = NYThinCrustPizza()
        }
        return pizza!!
    }

}

class CaliforniaPizzaStore : PizzaStore2() {
    override fun createPizza(type: String): pizza {
        var pizza: pizza? = null
        if (type.equals("Chees")) {
            pizza = CaliforniaCheesPizza()
        } else if (type.equals("Thin Crust")) {
            pizza = CaliforniaThinCrustPizza()
        }

        return pizza!!
    }

}

class NYCheesPizza : pizza {
    override fun prepare() {
        println("Preparing New York Chees Pizza")
    }

    override fun bake() {
        println("Baking New York Chees Pizza")
    }

    override fun cut() {
        println("Cutting New York Chees Pizza")
    }

    override fun box() {
        println("Boxing New York Chees Pizza")
    }

}

class NYThinCrustPizza : pizza {
    override fun prepare() {
        println("Preparing New York Thin Crust Pizza")
    }

    override fun bake() {
        println("Baking New York Thin Crust Pizza")
    }

    override fun cut() {
        println("Cutting New York Thin Crust Pizza")
    }

    override fun box() {
        println("Boxing New York Thin Crust Pizza")
    }
}


class CaliforniaCheesPizza : pizza {
    override fun prepare() {
        println("Preparing California Chees Pizza")
    }

    override fun bake() {
        println("Baking California Chees Pizza")
    }

    override fun cut() {
        println("Cutting California Chees Pizza")
    }

    override fun box() {
        println("Boxing California Chees Pizza")
    }
}

class CaliforniaThinCrustPizza : pizza {
    override fun prepare() {
        println("Preparing California Thin Crust Pizza")
    }

    override fun bake() {
        println("Baking California Thin Crust Pizza")
    }

    override fun cut() {
        println("Cutting California Thin Crust Pizza")
    }

    override fun box() {
        println("Boxing California Thin Crust Pizza")
    }
}