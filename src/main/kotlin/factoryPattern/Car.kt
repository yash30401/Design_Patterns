package factoryPattern

fun main(){



    val car=CarStore(CarFactory())

    car.orderCar("Ferrari")
    println()
    car.orderCar("Maclaren")

}


interface Car{
    fun createDesign()
    fun createFrame()
    fun PaintFrame()
    fun createInterior()
    fun finishing()
}

class Lambo:Car{
    override fun createDesign() {
        println("Creating Lambo Design")
    }

    override fun createFrame() {
        println("Creating Lambo Frame")
    }

    override fun PaintFrame() {
        println("Painting Lambo")
    }

    override fun createInterior() {
        println("Creating Lambo Interior")
    }

    override fun finishing() {
        println("Finishing Lambo")
    }

}

class Ferrari:Car{
    override fun createDesign() {
        println("Creating Ferrari Design")
    }

    override fun createFrame() {
        println("Creating Ferrari Frame")
    }

    override fun PaintFrame() {
        println("Painting Ferrari")
    }

    override fun createInterior() {
        println("Creating Ferrari Interior")
    }

    override fun finishing() {
        println("Finishing Ferrari")
    }
}

class Bugati:Car{
    override fun createDesign() {
        println("Creating Bugati Design")
    }

    override fun createFrame() {
        println("Creating Bugati Frame")
    }

    override fun PaintFrame() {
        println("Painting Bugati")
    }

    override fun createInterior() {
        println("Creating Bugati Interior")
    }

    override fun finishing() {
        println("Finishing Bugati")
    }
}

class Maclaren:Car{
    override fun createDesign() {
        println("Creating Maclaren Design")
    }

    override fun createFrame() {
        println("Creating Maclaren Frame")
    }

    override fun PaintFrame() {
        println("Painting Maclaren")
    }

    override fun createInterior() {
        println("Creating Maclaren Interior")
    }

    override fun finishing() {
        println("Finishing Maclaren")
    }
}

class CarFactory{

    var car:Car?=null

    fun createCar(type:String):Car{

        if(type.equals("Lambo")){
            car=Lambo()
        }else if(type.equals("Ferrari")){
            car=Ferrari()
        }else if(type.equals("Bugati")){
            car=Bugati()
        }else if(type.equals("Maclaren")){
            car=Maclaren()
        }

        return car!!
    }

}

class CarStore{
    var carFactory:CarFactory

    constructor(factory:CarFactory){
        carFactory=factory
    }

    fun orderCar(type:String):Car{
        var car:Car?=null

        car=carFactory.createCar(type)

        car.createDesign()
        car.createFrame()
        car.PaintFrame()
        car.createInterior()
        car.finishing()

        return car
    }

}