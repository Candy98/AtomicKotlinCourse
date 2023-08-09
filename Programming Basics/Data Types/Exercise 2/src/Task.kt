// DataTypes/Task2.kt
package dataTypesExercise2

fun main() {
  val int: Int = 10
  val double: Double = 1.1
  val boolean: Boolean = false
  val string: String = "abc"
  val character: Char = 'a'

  // Can be combined:

val result1:String=string+double
val result2:String=string+character
val result3:String=string+boolean
val result4:String=string+int

  val dr:Double=double+int
  val dr1:Double=int+double
  val s1:String=string+character
  val s2:Char=character+int
  println("The type that can be combined " +
    "with every other type using '+':")
  println("String")

  // Can't be combined:
 /* val cr=boolean+boolean
  val cr1=int+character
  val cr2=double+string*/


}