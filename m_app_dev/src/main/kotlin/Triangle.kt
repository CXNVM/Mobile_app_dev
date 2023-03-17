
class Triangle(var a: Int, var b: Int, var c: Int) {

    fun TypeOfTriangle() {
        var a = this.a;
        var b = this.b;
        var c = this.c;
        var TrFeature: Boolean = a + b > c && a + c > c && a + b > c;
        var rvbCond: Boolean = a == b && b == c;
        var rvsCond: Boolean = a == b || b == c || a == c;
        if (TrFeature) {
            if (rvbCond) {
                println("Треугольник - РАВНОСТОРОННИЙ");
            } else if (rvsCond) {
                println("Треугольник - РАВНОБЕДРЕННЫЙ");
            } else {
                println("Треугольник - ОБЫЧНЫЙ");
            }
        } else {
            println("Не выполняется главное свойство треугольника...");
        }
    }
}