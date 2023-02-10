package SingletonPattern

class SingletonClass private constructor(){
    companion object {
        @Volatile
        private var instance: SingletonClass? = null

        fun getInstance(): SingletonClass {
            return instance?: synchronized(this){
                    val INSTANCE=SingletonClass()
                    instance= INSTANCE
                    INSTANCE
                }
            }

        }


    }

