class SortArray (size : Int) {

    private val array = LongArray(size)
    private var nelms = 0

    fun insert(index: Long)
    {
        array[nelms] = index
        nelms++
    }

    fun display()
    {
        for(i in 0 until nelms)
        {
            print("array[$i]: ${array[i]} ")
        }
        println()
        println("nelms: $nelms")
    }
    //ПУЗЫРЬКОМ НАХУЙ
    fun bubbleSort()
    {
        for (i in nelms-1 downTo 1)
        {
            for (j in 0 until i)
            {
                if (array[j] > array[j+1])
                  swap(j, j+1)
            }
        }
    }

    fun selectSort()
    {
        var min : Int
        for (i in 0 until nelms - 1)
        {
            min = i
            for (j in i+1 until nelms)
                if (array[j] < array[min])
                    min = j
            swap(i, min)
        }
    }

    private fun swap(one : Int, two : Int)
    {
        var temp = array[one]
        array[one] = array[two]
        array[two] = temp
    }
}