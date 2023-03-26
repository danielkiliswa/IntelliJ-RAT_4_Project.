/* RAT 4 */
// INHERITANCE

// CALLING
fun main(args: Array<String>) {
    val student1 = Student()
    student1.gender = "male and female"
    student1.course = "Engineering and Education"
    println("The class has both ${student1.gender} students, \n and they are taking both ${student1.course} courses.")
    student1.curriculum()

    val boys1 = Boys()
    boys1.gender = "male"
    boys1.course = "Engineering and Education"
    println("The class has 30 ${boys1.gender} students & they are taking both ${boys1.course} courses.")
    boys1.curriculum()
    boys1.football()

    val ladies1 = Ladies()
    ladies1.gender = "female"
    ladies1.course = "Engineering and Education"
    println("The class has 27 ${ladies1.gender} students & they are taking both ${ladies1.course} courses.")
    ladies1.curriculum()
    ladies1.hockey()
}

/* In a class of 57 students the teacher was collecting data of her students,
The data she required was:
The gender of the students
The course they are doing
the feedback on boys playing football
the feedback on the ladies playing hockey
the feedback on the curriculum
Using inheritance, represent the gender and the course as
properties and the feedback as methods
 */

// DECLARATION

open class Student {
    var gender: String = ""
    var course: String = ""

    fun curriculum() {
        println("The students are using the TVET-CDAAC Curriculum.")
    }
}

class Boys: Student() {
    fun football() {
        println("The number of boys playing football is 25, while 5 boys aren't playing football.")
    }
}

class Ladies: Student() {
    fun hockey() {
        println("The number of girls playing hockey is 20, while 7 girls aren't playing hockey.")
    }
}
