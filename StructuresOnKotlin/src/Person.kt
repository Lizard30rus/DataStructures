class Person(val firstName: String, val lastName: String, val age: Int ) {



    fun displayPerson(){
        print(" Last name: ${this.lastName}, ")
        print(" First name: ${this.firstName}, ")
        println(", Age: ${this.age}")
    }
}