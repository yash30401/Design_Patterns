fun main(){


    // Classes and Objects-----------------------

//    val lambo=car("Lambo","Sports",1000)
//
//    println(lambo.name)

    //Getter and setters--------------
//    val person=person("Yash",20)
//    person.page=-1
//
//


   //Inheritance --------------------
// val cycle=cycle("sisu",150)
//
//    println(cycle.name)
//
//    cycle.drive()


    //Overriding-----------------------------------------


//    val oneplus=onePlus(128,8)
//
//    oneplus.display()


    //Polymorphism-----------------------------------------------------
        //Parent can hold a refrence to its child and calls the methods of the child classes

//        val circle:shape=circle(4.0)
//        val square:shape=square(4.0)
//
//
//    println(circle.area())
//    println(square.area())


//   val shapes= arrayOf(circle(4.0),square(2.0))
//
//    calculatearea(shapes)




    //Abstraction----------------------------------------------------------------------------

    // Class Cant be instantiated
    // Abstract Class has both abstract and non-abstracr methods and properties
    //When we dont know about its body.


//    val circle=Circle(2.0)
//
//    println(circle.area())
//    circle.display()

    //Interface------------------------------------------------------------------------

    //Group objects on what they can do rather than what they are
    // To use polymorphism in unrelated set of classes(i.e. classes which do not belongs to same inheritance hierarchy)
    // It is a type of contract
    // Interface can have both abstract and concrete methods
    // Interface can implements other interface and classes can implements many interfaces but  classes can have only one super class
    // objectsDragging(arrayOf(Circle(2.0),Square(2.0),Triangle(2.0,2.0),Person()))


    //Object Declaration (Singleton Pattern)-----------------------------------------------------------------------
    // ("Main Concept"):- With classes you can create as many Objects as you want. But if you want to create only one object you can go with
    // Object declaration Concept.
    // No Constructors are allowed.
    // Singleton Pattern. (It ensures that, a class can only create one of its object not more than that.)
    // You can inherit class/interface.

//    println(A.a)
//    B.test()


//    SharingWidget.display()
//
//    SharingWidget.twitterIncrement()
//    SharingWidget.twitterIncrement()
//    SharingWidget.fbIncrement()
//    println()
//    SharingWidget.display()

    //Companion Object------------------------------------------------
    // It is used for making an object a companion of a class so we can directly access object's properties and its methods
    // ("Important"):- Only one companion object can be defined in a class
    // We generally use companion in kotlin for Factory pattern
//    MyClass.f()
//    MyClass.anotherObject.g()

    //Data Classes-------------------------------------------------------------

//    val p1=Person(1,"Yash")
//    val p2=Person(1,"Yash")

//    println(p1)
//    println(p2)
//    println(p1.hashCode())
//    println(p1==p2)

//    val p3=p1.copy(id=2)
//    println(p3)

    //De-Structuring
//    val (id,name)=p1
//    println(id)
//    println(name)


    //Enum Classes------------------------------------------------------------

    println(Day.MONDAY)

    val day=Day.SUNDAY.id
    println(day)

    for(i in Day.values()){
        println(i)
    }

    val day2=Day.TUESDAY
    day2.printDay()

}

//Enum Classes------------------------------------------------------------

enum class Day(val id:Int){
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    fun printDay(){
        println("Day is $this")
    }

}


//Data Classes-------------------------------------------------------------

//data class Person(val id:Int,val name:String)



//Companion Object------------------------------------------------------------
    //You can define as many objects as you want in your class
//class MyClass{
//    companion object myObject{
//        fun f(){
//            println("Hello Friends")
//        }
//    }
//
//    object anotherObject{
//        fun g(){
//            println("Another Object")
//        }
//    }
//}



//Object Declaration (Singleton Pattern)-----------------------------------------------------------------------

//object SharingWidget{
//
//    private var twitterLike=0
//    private var fbLikes=0
//
//    fun twitterIncrement()= twitterLike++
//    fun fbIncrement()= fbLikes++
//
//    fun display()=println("Twitter Likes: ${twitterLike}\nFB Likes: ${fbLikes}")
//
//}



//object A{
//    val a:Int=20
//
//}
//
//object B{
//    fun test(){
//        println("How Are You?")
//    }
//}








//Interface----------------------------------------------------------------------------

//fun objectsDragging(objects: Array<Draggable>){
//    for(obj in objects){
//        obj.drag()
//    }
//}

//interface Draggable{
//    fun drag()
//}
//
//abstract class Shape():Draggable{
//
//    abstract fun area():Double
//
//}
//
//
//
//class Circle(val radius:Double):Shape(){
//    override fun area(): Double {
//        return Math.PI*radius*radius
//    }
//
//    override fun drag() {
//        println("Circle is Dragging")
//    }
//
//}
//
//class Square(val side:Double):Shape(){
//    override fun area(): Double {
//        return side*side
//    }
//
//    override fun drag() {
//        println("Sqaure is Dragging")
//    }
//
//}
//
//class Triangle(val base:Double,val height:Double):Shape(){
//    override fun area(): Double {
//        return 0.5*base*height
//    }
//
//    override fun drag() {
//        println("Triangle is Dragging")
//    }
//
//}
//
//class Person():Draggable{
//    override fun drag() {
//        println("Person is Draggable")
//    }
//
//}
//



//Abstraction----------------------------------------------------------------------------

//abstract class Shape(){
//
//     abstract fun area():Double
//     abstract fun display()
//
//}
//
//class Circle(val radius:Double):Shape(){
//    override fun area(): Double {
//        return Math.PI * radius*radius
//    }
//
//    override fun display() {
//       println("Circle Is Displaying")
//    }
//
//}






//Polymorphism-----------------------------------------------------

//fun calculatearea(shapes:Array<shape>){
//    for(shape in shapes){
//        println(shape.area())
//    }
//}
//
//open class shape{
//    open fun area():Double{
//        return 0.0
//    }
//}
//
//class circle(val radius:Double):shape(){
//
//    override fun area(): Double {
//        return Math.PI * radius*radius
//    }
//
//}
//
//class square(val side:Double):shape(){
//    override fun area(): Double {
//        return side*side
//    }
//}



//Overriding-------------------------------------------------------------------------


//open class Mobile(val name:String, val storage:Int,val ram:Int){
//
//    var Mname:String=name
//    get() {
//        return field
//    }
//    var Mstorage:Int=storage
//    set(value) {
//        if(value<0){
//            println("Mstorage Can't be negative")
//        }else{
//            field=value
//        }
//    }
//    var Mram:Int=ram
//        set(value) {
//            if(value<0){
//                println("Ram Can't be negative")
//            }else{
//                field=value
//            }
//        }
//
//    fun call(){
//        println("Calling")
//    }
//
//    fun powerOff(){
//        println("Switching Off")
//    }
//
//    open fun display(){
//        println("Simple Mobile Display")
//    }
//
//}
//
//class onePlus(val oneplusstorage:Int,val oneplusram:Int ):Mobile("OpenPlus", oneplusstorage,oneplusram){
//
//
//    override fun display() {
//        println("OnePlus Display")
//    }
//
//
//}
//



//Inheritance ------------------------------------------------------------------------

//open class vehicle(val name:String, val type:String, val kmRan:Int){
//
//    fun drive(){
//        println("${name} is driving")
//    }
//
//    fun breaking(){
//        println("Vehicle is breaking")
//    }
//
//}
//
//class cycle(val cname:String,val ckmRan:Int): vehicle("${cname}","cycle",ckmRan) {
//
//    fun wheele(){
//        println("Cycle is doing wheele")
//    }
//
//    fun stoppee(){
//        println("cycle is doing stoppee")
//    }
//
//}
//



// Classes and Objects-------------------------------------------------------

//class car(val name:String, val type:String, val kmRan:Int){
//
//    var carname:String=name
//    var cartype:String=type
//    var carkmRan:Int=kmRan
//
//
//    fun drive(){
//        println("${name} is Driving")
//    }
//
//    fun applyBreask(){
//        println("Breaks Enabled")
//    }
//
//}




//Getter and setters-------------- ----------------------

//class person(val name:String, val age:Int){
//
//    var pname:String=name
//    var page:Int=age
//    set(value) {
//        if(value<0){
//           println("Age Can't be negative")
//        }else{
//            field=value
//        }
//    }
//
//}


