
fun main() {

    val mduck = MallardDuck()
    val rduck = RedHeadDuck()
    val rubberDuck = RubberDuck()
    val decoyDuck = DecoyDuck()

    println("Flying------")
    mduck.performFlying()
    rduck.performFlying()
    rubberDuck.performFlying()
    decoyDuck.performFlying()

    println()
    println("Qucking-----")
    mduck.performQuack()
    rduck.performQuack()
    rubberDuck.performQuack()
    decoyDuck.performQuack()

    println()
    println("Setting Behavior-----")
    mduck.performFlying()
    mduck.flying=flyRocketPowered()
    mduck.performFlying()

}

//Not A Good Way----------

//    mduck.display()
//    mduck.quack()
//    rduck.display()
//
//    println()
//
//    rubberDuck.display()
//    rubberDuck.quack()
//
//    println()
//
//    decoyDuck.display()

//}

//interface quacking{
//    fun quack()
//}
//
//interface flying{
//    fun fly()
//}
//
//abstract class Duck{
//
//    fun swim(){
//        println("Ducks Are Swimming")
//    }
//
//    abstract fun display()
//}
//
//class MallardDuck: Duck(),quacking,flying {
//
//    override fun display() {
//       println("Mallards Are Displaying")
//    }
//
//    override fun quack() {
//        println("Mallards Quacking")
//    }
//
//    override fun fly() {
//        println("Mallards Flying")
//    }
//
//}
//
//class RedHeadDuck:Duck(){
//    override fun display() {
//        println("RedHeads Are Displaying")
//    }
//
//
//
//}
//
//class RubberDuck:Duck(),quacking{
//    override fun display() {
//        println("Rubber Ducks are Displaying")
//    }
//
//    override fun quack() {
//        println("RubberDuck Squeaking")
//    }
//
//}
//
//class DecoyDuck:Duck(){
//    override fun display() {
//        println("Decoy Displaying")
//    }


//Another Way-------------------

//}

interface quacking{
    fun quack()
}

interface flying{
    fun fly()
}

class flyWithWings:flying{
    override fun fly() {
        println("Flying With Wings")
    }

}

class flyNoWay:flying{
    override fun fly() {
        println("Can't Fly")
    }

}

class flyRocketPowered:flying{
    override fun fly() {
        println("Flying rocket Powered")
    }

}

class quack:quacking{
    override fun quack() {
        println("Quacking")
    }

}

class squeaking:quacking{
    override fun quack() {
        println("Squeaking")
    }

}

class mute:quacking{
    override fun quack() {
        println("Muted")
    }

}

abstract class Duck{

     var quacking:quacking
     var flying: flying

    constructor(quacking: quacking,flying: flying) {
        this.quacking=quacking
        this.flying=flying

    }

    fun swim(){
        println("Ducks Are Swimming")
    }

    abstract fun display()

    fun performQuack(){
        quacking.quack()
    }

    fun performFlying(){
        flying.fly()
    }
}

class MallardDuck: Duck {

    constructor():super(quack(),flyWithWings())


    override fun display() {
        println("Mallards Are Displaying")
    }


}

class RedHeadDuck:Duck {

    constructor():super(quack(),flyWithWings())

    override fun display() {
        println("RedHeads Are Displaying")
    }

}

class RubberDuck:Duck{

    constructor():super(squeaking(),flyNoWay())

    override fun display() {
        println("Rubber Ducks are Displaying")
    }


}

class DecoyDuck:Duck {

    constructor():super(mute(),flyNoWay())

    override fun display() {
        println("Decoy Displaying")
    }
}