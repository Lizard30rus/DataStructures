class LinkList(private var first:Link? = null) {

    fun insertFirst(i:Int, d:Double)
    {
      val newLink = Link(i,d)
      newLink.next = first
        first = newLink
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

    fun displayThis(){
        first?.display()
        println("/////")
        first?.next?.display()
    }

    fun findByKey(i:Int):Link?
    {
        val current:Link? = first
        while (current?.getiData() != i)
        {
            if (current?.next == null)
            {
                println("findByKey совпадений не найдено")
                return current
            }
            current.next = current
        }
        return current
    }

    fun deleteByKey(i:Int):Link?
    {
        val current:Link? = first
        var previous:Link? = first
        while (current?.getiData() != i)
        {
            if (current?.next == null)
            {
                println("deleteByKey совпадений не найдено")
                return current
            }
            previous = current
            current.next = current
        }
        return if (current == first)
        {
            first = first?.next
            current
        }
        else
        {
            previous?.next= current.next
            current
        }
    }

    fun isEmpty() = first == null


}