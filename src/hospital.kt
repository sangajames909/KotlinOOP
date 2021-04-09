open class Hospital(name: String, age: Int) {
    init {
        println("DepartmentName is: $name. ")
        println("DepartmentAge is: $age")
    }
}

class dental (name: String, age: Int): Hospital(name, age) {

    fun dentaldep() {
        println("X department is headed by dr Y and has the Id Z")
    }
}

class surgery(name: String, age: Int): Hospital(name, age) {

    fun surgerydep() {
        println("X is the departmentName ")
    }
}

class general(name: String, age: Int): Hospital(name, age) {

    fun generaldep() {
        println("Y is the departmentHead and Z is the department ID.")
    }
}

fun main(args: Array<String>) {
    val d = dental("dental",42)
    d.dentaldep()
    val c = surgery("surgery", 21)
    c.surgerydep()
    val h = general("general", 33)
    h.generaldep()
}