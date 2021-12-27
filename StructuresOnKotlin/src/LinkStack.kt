class LinkStack(private val theList:LinkList) {

    fun push(i:Int, d:Double)
    {
        theList.insertFirst(i,d)
    }

    fun pop():Link?{
        return theList.deleteFirst()
    }

    fun peek():Link?
    {
        val current:Link? = theList.deleteFirst()
        if (current != null) {
            theList.insertFirst(current.getiData(), current.getdData())
        }
        return current
    }

    fun isEmpty():Boolean = theList.isEmpty()

    fun displayStack()
    {
        println("Stack ---->")
        theList.displayList()
    }
}