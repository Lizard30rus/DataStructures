class Reverser(private val value:String) {
    private val input = value
    private var output = ""

    fun doRev():String
    {
        val stackArray: StackXChar = StackXChar(input.length)
        var ch:Char
        for(element in input)
            stackArray.push(element)
        while (!stackArray.isEmpty())
        {
            ch = stackArray.pop()
            output += ch
        }
        return output
    }
}