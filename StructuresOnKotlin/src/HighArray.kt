class HighArray(size: Int) {

    private val array = LongArray(size)
    private var nElms : Int = 0

    fun find(value : Long) : Boolean
    {
        for(j in 0 until nElms)
            if (array[j] == value)
                return true
        return false
    }

     fun insert(value: Long)
     {
         array[nElms] = value
         nElms++
     }

    fun delete(value: Long) : Boolean
    {
        var count : Int = 0
        for(j in 0 until nElms)
        {
            count++
            if (value == array[j])
                break
        }
        return if (count == nElms)
            false
        else
        {
            for (k in count-1 until nElms)
                array[k] = array[k+1]
            nElms--
            true
        }
    }

    fun display()
    {
        for (i in 0 until nElms)
        {
            print("array[$i]: ${array[i]}")
        }
        println()
        print("nElms: $nElms")
        println()
    }

}