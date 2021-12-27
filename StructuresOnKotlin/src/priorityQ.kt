

class priorityQ(private val size:Int) {


    private val queArray = LongArray(size)
    private var nElms: Int = 0

    fun isEmpty(): Boolean = nElms == 0
    fun isFull(): Boolean = nElms == size

    fun peek():Long = queArray[nElms-1]

    fun insert(a: Long) {
        if(nElms == 0) {
            queArray[nElms++] = a
        }
        else
        {
            if (isFull())
                throw Exception("Массив полон.Пиздец:((")
            else
            {
                var temp = nElms - 1
                while (a > queArray[temp])
                {
                    queArray[temp+1] = queArray[temp]
                    temp--
                    if (temp == -1) //Проверяем, дошел ли перебор до конца очереди
                    {
                        break
                    }
                }
            queArray[temp+1] = a
            nElms++
            }
        }
    }

    fun displayQueue(){
        for (i in nElms until 0)
        {
            print(" ${queArray[i]} ")
        }
        println()
    }

    fun remove():Long
    {
        if (isEmpty())
            throw Exception("Массив пуст и нечего ремувывать.")
        else
            return queArray[--nElms]
    }

    fun removeAll(){
        while (!isEmpty())
            println("${this.remove()}")
    }


}