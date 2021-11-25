class Reverser(private val value:String) {

    private var output = ""

    fun doRev():String
    {
        val stackArray: StackXChar = StackXChar(value.length)
        var ch:Char
        for(element in value)
            stackArray.push(element)
        while (!stackArray.isEmpty())
        {
            ch = stackArray.pop()
            output += ch
        }
        return output
    }
}