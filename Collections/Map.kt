package Collections

class Map {
    val map = mapOf(
        "Mango" to 100,
        "Apple" to 200,
        "Banana" to 50,
        "Guava" to 80,
        "Guava" to 80
    )
    fun map(){
        println(map.toString())
        println(map.values)
        println(map.keys)
        for (i in map){
            println(i)
        }
        map.forEach {
            println(it)
        }
    }
}
class MutableMap {
    var mutableMapOf = mutableMapOf(
        "Apple" to 200,
        "Mango" to 100,
        "Banana" to 50,
        "Guava" to 70
    )
    fun mutableMapOf(){
        println(mutableMapOf.toString())
        mutableMapOf.put("Orange",220)
    }
}
fun main(){
    var map = Map()
    map.map()
    var mutableMap = MutableMap()
    mutableMap.mutableMapOf()

}