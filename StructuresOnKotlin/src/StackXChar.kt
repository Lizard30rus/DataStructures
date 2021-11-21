class StackXChar(private val maxSize: Int) {

    private val charArray = CharArray(maxSize)
    private var top = -1


    fun push(j : Char){
        charArray[++top] = j
    }

    fun pop() : Char = charArray[top--]
    fun peek(): Char = charArray[top]

    fun isEmpty() : Boolean = top ==-1
    fun isFull() : Boolean = top == maxSize-1

}