class FirstLastList(private var first:Link?, private var last:Link?) {

    fun isEmpty() = first == null
/*
    fun insertFirst(i:Int, d:Double)
    {
        val newLink = Link(i,d)
        if (isEmpty())
            last = newLink
        newLink.next = first
        first = newLink
    }

 */

    fun insertLast(i:Int, d:Double)
    {
        val newLink = Link(i,d)
        if (isEmpty())
        {
            first = newLink
            last = newLink
        }
        else
        {
            last?.next = newLink
            last = newLink
        }
    }

    fun deleteFirst(): Link?
    {
        val temp:Link? =  first
        first = first?.next
        return temp
    }

    fun displayList()
    {
        var current:Link? = first
        while (current !=null)
        {
            current.display()
            current = current.next
        }
        println()
    }
}