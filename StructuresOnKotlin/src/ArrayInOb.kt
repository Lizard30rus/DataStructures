class ArrayInOb(private val size: Int) {
    private val arrayObj = arrayOfNulls<Person>(size)
    private var nElms : Int = 0


    fun insert (lname: String, fname : String, age : Int){
       arrayObj[nElms] = Person(fname, lname, age)
       nElms++
    }

    fun display()
    {
        for (i in 0 until nElms)
        {
            arrayObj[i]?.displayPerson()
        }
    }

    fun insertSort() {
        for(out in 1 until nElms)
        {
            var temp: Person? = arrayObj[out]
            var ink : Int = out

            if (temp != null) {
                while (ink> 0 && arrayObj[ink-1]?.lastName?.compareTo(temp.lastName)!! >0)
                {
                    arrayObj[ink] = arrayObj[ink-1]
                    --ink
                }
                arrayObj[ink] = temp

            }
        }

    }
}