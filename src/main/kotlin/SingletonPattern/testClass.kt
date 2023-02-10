package SingletonPattern

fun main(){
    val singletonClass = SingletonClass.getInstance()
    val singletonClass2 = SingletonClass.getInstance()

    println(singletonClass.hashCode())
    println(singletonClass2.hashCode())


    val run = run()
    val run2 = run()

    println(run.hashCode())
    println(run2.hashCode())



}

class run{
    fun run(){
        println("run")
    }
}