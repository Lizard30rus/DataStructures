class Link(private val iData: Int, private val dData:Double, public var next: Link? = null) {

    fun display()
    {
        println("iData: $iData, dData: $dData")
    }

    fun getiData() = iData

}