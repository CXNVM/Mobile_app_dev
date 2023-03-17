import java.util.Scanner

fun main() {
    println();
    val input = Scanner(System.`in`);
    var action = "";
    while (action != "стоп") {
        println("Какую программу вы хотите запустить? тр или круг// 'стоп' для остановки");
        action = input.next();
        if (action == "тр") {
            getTriangleType();
        } else if (action == "круг") {
            circleFun();
        }
    }
}
fun getTriangleType() {
    println("Введите стороны треугольника...");
    val input = Scanner(System.`in`);
    var side1 = input.nextInt();
    var side2 = input.nextInt();
    var side3 = input.nextInt();
    var tr = Triangle(side1, side2, side3);
    tr.TypeOfTriangle();
}

fun circleFun() {
    println("Введите радиус и координаты центра...");
    val input = Scanner(System.`in`);
    var R = input.nextDouble();
    var x0 = input.nextDouble();
    var y0 = input.nextDouble();
    var crcl = Circle(R, x0, y0);
    println("Введите координаты точки для проверки...");
    var x = input.nextDouble();
    var y = input.nextDouble();
    crcl.isInCircle(x, y);
}