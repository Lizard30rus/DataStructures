class StackX(val maxSize: Int) {
    //РЕАЛИЗАЦИЯ СТРУКТУРЫ ДАННЫХ СТЕК НА БАЗЕ МАССИВА
    private  val stackArray = LongArray(maxSize)
    private var top = -1

    fun push(j : Long){
        stackArray[++top] = j
    }

    fun pop() : Long = stackArray[top--]
    fun peek(): Long = stackArray[top]

    fun isEmpty() : Boolean = top ==-1
    fun isFull() : Boolean = top == maxSize-1



}