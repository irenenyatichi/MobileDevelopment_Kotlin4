import java.lang.reflect.Array
import java.util.*

fun main() {
instruments()
    cities()
    sum()
    var flavors=names("chocolate","vanilla","strawberry")
    println(Arrays.toString(flavors))
}
fun instruments(){
    var instrumentsArray= arrayOf("Piano","Drum","Guitar","Trumpet")
    println(Arrays.toString(instrumentsArray))
}
fun cities() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    println(Arrays.toString(cities).capitalize())
}
fun sum(){
    var numbers= arrayOf(32,17,4, 213,78,43,90,31,3,73,11,158,62)
    var sum =numbers[1]+numbers[4]
    println(sum)
    println(numbers.indexOf(158))
    println(Arrays.toString(numbers.sortedArray()))
}
fun names(a:String,b:String,c:String):kotlin.Array<String> {
    var list= arrayOf("$a","$b","$c")
    return list

}