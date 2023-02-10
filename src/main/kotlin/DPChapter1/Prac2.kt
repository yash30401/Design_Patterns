package DPChapter1


fun main(){

    val ninja=Ninja()
    val cyborg=Cyborg()
    val wrestler=Wrestler()
    val PowerRanger=PowerRanger()

    ninja.performFight()
    PowerRanger.performFight()
}

interface flyBehavior{
    fun fly()
}

interface fightBehavior{
    fun fight()
}

interface runBehavior{
    fun run()
}

interface weaponBehavior{
    fun weapon()
}

class flyWithWings:flyBehavior{
    override fun fly() {
        println("Flying With Wings")
    }

}

class flyNoWay:flyBehavior{
    override fun fly() {
        println("Fly No Way")
    }
}

class fightWithAgression:fightBehavior{
    override fun fight() {
        println("Fight With Agression")
    }

}
class fightSmartly:fightBehavior{
    override fun fight() {
        println("Fight Smartly")
    }

}

class fightNoWay:fightBehavior{
    override fun fight() {
        println("Fight No Way")
    }

}

class runWithSuperMaxSpeed:runBehavior{
    override fun run() {
        println("Run With Supermax Speed")
    }

}
class runAtNormal:runBehavior{
    override fun run() {
        println("Run At Normal")
    }

}

class runSlowly:runBehavior{
    override fun run() {
        println("Running Slowly")
    }

}

class sword:weaponBehavior{
    override fun weapon() {
        println("Sword")
    }

}

class machineGun:weaponBehavior{
    override fun weapon() {
        println("Machine Gun")
    }

}

class buzooka:weaponBehavior{
    override fun weapon() {
        println("Buzooka Is Firing")
    }

}

class noweapon:weaponBehavior{
    override fun weapon() {
        println("No Weapon")
    }

}

abstract class Character{

    lateinit var fly:flyBehavior
    lateinit var fight:fightBehavior
    lateinit var run:runBehavior
    lateinit var weapon:weaponBehavior

    constructor(fly:flyBehavior,fight:fightBehavior,run:runBehavior,weapon:weaponBehavior){
        this.fly=fly
        this.fight=fight
        this.run=run
        this.weapon=weapon
    }

    abstract fun walk()
    abstract fun display()
    abstract fun jump()

    fun performFly(){
        fly.fly()
    }

    fun performFight(){
        fight.fight()
    }
    fun perform(){
        run.run()
    }

    fun performWeapon(){
        weapon.weapon()
    }


}

class Ninja:DPChapter1.Character{

    constructor():super(flyNoWay(),fightWithAgression(),runWithSuperMaxSpeed(),sword())

    override fun walk() {
        println("Ninja Walking")
    }

    override fun display() {
        println("Ninja Displaying")
    }

    override fun jump() {
        println("Ninja Jumping")
    }

}

class Cyborg:DPChapter1.Character{

    constructor():super(flyWithWings(),fightWithAgression(),runWithSuperMaxSpeed(),machineGun())
    override fun walk() {
        println("Cyborg Is Walking")
    }

    override fun display() {
        println("Cyborg Is Displaying")
    }

    override fun jump() {
        println("Cyborg Is Jumping")
    }

}

class Wrestler:DPChapter1.Character{

    constructor():super(flyNoWay(),fightWithAgression(),runAtNormal(),noweapon())

    override fun walk() {
        println("Wrestler is Walking")
    }

    override fun display() {

        println("Wrestler is Displaying")
    }

    override fun jump() {
        println("Wrestler is Jumping")
    }


}

class PowerRanger:DPChapter1.Character{

    constructor():super(flyNoWay(),fightSmartly(),runAtNormal(),buzooka())

    override fun walk() {
        println("PowerRanger is Walking")
    }

    override fun display() {

        println("PowerRanger is Displaying")
    }

    override fun jump() {
        println("PowerRanger is Jumping")
    }


}


