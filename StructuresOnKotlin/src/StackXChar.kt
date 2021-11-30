class StackXChar(private val maxSize: Int) {

    private val charArray = CharArray(maxSize)
    private var top = -1


    fun push(j : Char){
        charArray[++top] = j
    }

    fun pop() : Char = charArray[top--]   //ИЗВЛЕЧЕНИЕ ЭЛЕМЕНТА С ВЕРШИНЫ СТЕКА
    fun peek(): Char = charArray[top]    //ЧТЕНИЕ ЭЛЕМЕНТА С ВЕРШИНЫ СТЕКА

    fun isEmpty() : Boolean = top ==-1
    fun isFull() : Boolean = top == maxSize-1

    fun size():Int = top+1
    fun peekN(n:Int): Char = charArray[n]

    fun displayStack(s:String)
    {
        println(s)
        println("Stack: bottom--->top")
        for (i in 0 until this.size())
            print(" ${this.peekN(i)}")
        println()
    }


}