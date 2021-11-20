
fun main (args: Array<String>)
{
    val stackarray : StackX = StackX(10)
    println(stackarray.isEmpty())
    println(stackarray.isFull())
    var count = 0
    while (!stackarray.isFull())
    {
        stackarray.push(count.toLong())
        count += 6
    }
    println(stackarray.isEmpty())
    println(stackarray.isFull())




















}