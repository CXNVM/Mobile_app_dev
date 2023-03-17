
import kotlin.math.pow;

class Circle(var R: Double, var x: Double,var y: Double) {

    fun isInCircle(x: Double, y: Double) {
        var cond: Boolean = (x - this.x).pow(2) + (y - this.y).pow(2) <= R.pow(2);
        if (cond) {
            println("Точка лежит внутри окружности");
        } else {
            println("Точка ВНЕ окружности");
        }
    }
}