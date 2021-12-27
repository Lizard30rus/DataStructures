
fun main (args: Array<String>)
{

    println("$args")
    val linkStack = LinkStack(LinkList())
    linkStack.push(11, 11.0)
    linkStack.push(22, 22.0)
    linkStack.push(33, 33.0)
    linkStack.push(44, 44.0)
    linkStack.push(55, 55.0)
    linkStack.displayStack()
    println("Last element peek: ${linkStack.peek()?.getiData()} :  ${linkStack.peek()?.getdData()}")
    linkStack.displayStack()
    linkStack.pop()
    linkStack.pop()
    linkStack.displayStack()


    println("/////////////////////////////////////////////////////")

    val linkQueue = LinkQueue(FirstLastList(null,null))
    linkQueue.push(11, 11.0)
    linkQueue.push(22, 22.0)
    linkQueue.push(33, 33.0)
    linkQueue.push(44, 44.0)
    linkQueue.push(55, 55.0)
    linkQueue.displayQueue()
    linkQueue.pop()
    linkQueue.pop()
    linkQueue.displayQueue()

}