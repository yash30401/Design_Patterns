package factoryPattern

fun main(){

    val shapeFactory=ShapeFactory()
    val shape = shapeFactory.getShape("Circle")
    shape.draw()
}

interface shape{
    fun draw()
}

class Rectangle:shape{
    override fun draw() {
        println("This is Rectangle")
    }
}

class Triangle:shape{
    override fun draw() {
        println("This is Triangle")
    }
}

class Square:shape{
    override fun draw() {
        println("This is Square")
    }
}

class Circle:shape{
    override fun draw() {
        println("This is Circle")
    }

}

class ShapeFactory{
    var shape:shape?=null

    fun getShape(type:String):shape{
        if(type.equals("Circle")){
            shape=Circle()
        }else if(type.equals("Square")){
            shape=Square()
        }else if(type.equals("Rectangle")){
            shape=Rectangle()
        }else if(type.equals("Triangle")){
            shape=Triangle()
        }
        return shape!!
    }
}