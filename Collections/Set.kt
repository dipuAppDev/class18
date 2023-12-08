package Collections

class Set {
    val setList = setOf("Rakib","Hasan","Maruf","Jibon","Jibon")
    fun setList(){
        println(setList)
        println(setList.toString())
        println(setList.size)
        println(setList.count())
        println(setList.first())
        println(setList.last())
        println(setList.forEach {
            println(it)
        })
        for (i in setList){
            println(i)
        }
    }
}
fun main(args:Array<String>){
    var setList = Set()
    setList.setList()
}