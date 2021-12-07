class LinkList(private var first:Link? = null) {

    fun insertFirst(i:Int, d:Double)
    {

      var newLink:Link = Link(i,d)
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




    fun isEmpty() = first == null


}