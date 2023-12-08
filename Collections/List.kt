package Collections

/**
 * Immutable list
 */
class List {
    var list = listOf(
        "Rakib",
        "Munna",
        "Hasib",
        "Saif"
    )

    fun listOf(){
        for (list in list){
            println(list)
        }
        println(list.size)
        println(list[3])
        println(list.first())
        println(list.last())
        println(list.count())
        println(list.toString())
        var iterator = list.listIterator()
        while (iterator.hasNext()){
            println(iterator.next())
        }
        for (i in list.indices){
            println(list[i])
        }
        list.forEach {
            println(it)
        }
    }

}
/**
 * Mutable list
 */
//class MutableList{
//    var mutableList = mutableListOf(
//        "Bangladesh",
//        "India",
//        "Pakistan",
//        "Nepal",
//        "Bhutan",
//        "Mayanmar",
//        "Bhutan"
//    )
//    fun mutableList(){
//        println(mutableList.first()) // print first item
//        println(mutableList.last()) // print last item
//        println(mutableList[1]) // print an item using indexing
//        println(mutableList[5])
//        mutableList[3] = "America" // change an item
//        mutableList.add("Srilanka") // add a new item
//        mutableList.add("Maldiv")
//        println("MutableList Size : ${mutableList.size}") // print list size
//        println(mutableList.count()) // count list item
//        mutableList.remove("America") // remove an item using item name
//        mutableList.removeAt(2) // remove an item using index of item
//        for (i in mutableList){
//            print("${i} ")
//        }
//
//    }
//}
/**
 * Immutable set
 */

