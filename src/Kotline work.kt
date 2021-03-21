import java.util.*

fun main() {
girls()
place()
numbersArray()
var answer=names( "Sandra","Resty","Juliet")
println(Arrays.toString(answer))
}
fun girls() {
var girlsArray= arrayOf("Carol","Zilla","Grace","Sarah")
    println(Arrays.toString(girlsArray))
}
fun place() {
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach { town ->
        println(town.capitalize())
    }
}
fun numbersArray() {
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[1]+numbers[4])
    println(numbers.lastIndex-1)
    println(Arrays.toString(numbers.sortedArray()))
}
fun names(name1:String,name2:String,name3:String):Array<String>{
   return arrayOf(name1,name2,name3)

}