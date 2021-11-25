class BracketChecker(private val data:String) {

    fun check()
    {
        val  stackChar = StackXChar(data.length)
        var j = 0
        for (element in data)
        {
            when
            {
                (element == '{' || element == '[' || element == '(') ->
                {
                    stackChar.push(element)
                    //break
                }
                (element == '}' || element == ']' || element == ')') ->
                {
                    if (!stackChar.isEmpty())
                    {
                        val chx:Char = stackChar.pop()
                        if (    element == '}' && chx != '{' ||
                                element == ']' && chx != '[' ||
                                element == ')' && chx != '(')
                        {
                            println("Error: $element at $j")
                            stackChar.push(chx)
                        }
                    }
                    else
                        println("Error: $element at $j")
                    //break
                }
               // else -> break
            }
           j++
        }
        if(!stackChar.isEmpty())
            println("Error: missing right delimter")
        else
            println("normalno")
    }
}