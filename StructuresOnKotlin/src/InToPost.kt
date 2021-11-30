class InToPost(private val inn:String) {

    private val theStack:StackXChar = StackXChar(inn.length)
    private var output:String = ""


    //Преобразование в постфиксную форму
    fun doTrans(): String
    {
        for (i in 0 until inn.length)
        {
            var char = inn[i]
            theStack.displayStack("For $char ")
            when
            {
                (char == '+' || char == '-') -> gotOper(char, 1)
                (char == '*' || char == '/') -> gotOper(char, 2)
                (char == '(') -> theStack.push(char)
                (char == ')') -> gotParent(char)
            }
        }
        while (!theStack.isEmpty())
        {
            theStack.displayStack("While ")
            output+=theStack.pop()
        }
        theStack.displayStack("End ")
        return output
    }

    fun gotOper(opThis:Char, prec1: Int)
    {
        while (!theStack.isEmpty())
        {
            var opTop = theStack.pop()
            if (opTop == '(')
            {
                theStack.push(opTop)
                break
            }
            else
            {
                var prec2:Int
                if (opTop == '+' || opTop == '-')
                    prec2 = 1
                else
                    prec2 = 2
                if (prec2<prec1)
                {
                    theStack.push(opTop)
                    break
                }
                else
                    output = output + opTop
            }
        }
        theStack.push(opThis)
    }

    fun gotParent(ch:Char)
    {
        var chx:Char
        while (!theStack.isEmpty())
        {
            chx = theStack.pop()
            if(chx != '(')
                output += chx
            else
                break
        }
    }

}