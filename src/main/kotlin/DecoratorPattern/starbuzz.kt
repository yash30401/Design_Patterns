abstract class Beverage {


    open fun getDescription(): String {
        return "Desc"
    }

    abstract fun cost(): Double
}

class Espresso : Beverage() {

    override fun getDescription(): String {
        return "Espresso"
    }

    override fun cost(): Double {
        return 1.99
    }
}

abstract class CondimentDecorator : Beverage() {
    abstract override fun getDescription(): String
}

class Mocha(private val beverage: Beverage) : CondimentDecorator() {
    override fun getDescription(): String {
        return "${beverage.getDescription()}, Mocha"
    }

    override fun cost(): Double {
        return 0.20 + beverage.cost()
    }
}

class Whip(private val beverage: Beverage) : CondimentDecorator() {
    override fun getDescription(): String {
        return "${beverage.getDescription()}, Whip"
    }

    override fun cost(): Double {
        return 0.10 + beverage.cost()
    }
}

fun main() {
    var beverage: Beverage = Espresso()
    println("${beverage.getDescription()} $${beverage.cost()}")

    beverage = Mocha(beverage)
    println("${beverage.getDescription()} $${beverage.cost()}")

    beverage = Whip(beverage)
    println("${beverage.getDescription()} $${beverage.cost()}")
}
