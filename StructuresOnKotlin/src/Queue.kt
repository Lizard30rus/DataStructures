class Queue(private val size:Int) {
    private var font = 0
    private var rear = -1
    private val maxSize = size+1
    private val queArray = LongArray(maxSize)


    fun  insert(j:Long)
    {
        
        if (rear == maxSize - 1)
            rear = -1
        queArray[++rear] = j
    }

    fun remove() : Long
    {
        val temp = queArray[font++]
        if (font == maxSize)
            font = 0
        return temp
    }

    fun peek():Long = queArray[font]

    fun isEmpty():Boolean = (rear+1 == font || (font + maxSize-1 == rear))
    fun isFull():Boolean = (rear+2 == font) || (font+maxSize-2 == rear)
}