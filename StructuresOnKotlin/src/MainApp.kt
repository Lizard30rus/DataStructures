
fun main (args: Array<String>)
{
    //println("Hello, world!")
    val arr: SortArray = SortArray(10)
    arr.insert(12)
    arr.insert(22)
    arr.insert(13)
    arr.insert(111)
    arr.insert(122)
    arr.insert(2)
    arr.insert(1)
    arr.insert(1211)
    arr.insert(45)
    arr.insert(0)
    arr.display()
    println("////////////////////////////////////////")
    arr.selectSort()
    arr.display()
    println("and again!")
    arr.display()
    println("and again!!!!!!!Блять")
    arr.display()



}