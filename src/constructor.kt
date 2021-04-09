fun main() {

    val stu = Student("James", 20)
    val studentcourse = Student("MIT")
    val stu3 = Student()

    println("Name: ${stu.name} and Age: ${stu.age}")
    println("Course Name: ${studentcourse.name}  ")
    println("Name: ${stu3.name} and Age: ${stu3.age}")

}

class Student(val name: String = "Student", var age: Int = 20) {

}