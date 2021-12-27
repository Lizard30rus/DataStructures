class LinkQueue(private val theList:FirstLastList) {

    fun push(i:Int, d:Double)
    {
        theList.insertLast(i,d)
    }

    fun pop():Link?{
        return theList.deleteFirst()
    }

    fun isEmpty():Boolean = theList.isEmpty()

    fun displayQueue()
    {
        println("Queue ---->")
        theList.displayList()
    }
}