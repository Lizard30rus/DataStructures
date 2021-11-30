
fun main (args: Array<String>)
{

   // val rev:Reverser = Reverser("улыбок тебе дед макар")
    //println(rev.doRev())
    //val  brchek:BracketChecker = BracketChecker("[asd(ffg)))]")
    //brchek.check()

    val prq: priorityQ = priorityQ(8)
/*
    prq.insert(900)

    prq.insert(30)

    prq.insert(20)

    prq.insert(40)

    prq.insert(60)

    prq.insert(90)

    prq.insert(12)
    prq.insert(16)

    prq.remove( )

 */

    var Sum = 0
    var oneNightIn113 = 2200
    for (i in 0 .. 10)
    {
        Sum = oneNightIn113 + (oneNightIn113*i - 300*i)
        println(Sum)
    }


}