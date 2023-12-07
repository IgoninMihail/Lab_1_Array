fun main(args: Array<String>) {
    //базовый уровень
    val numbers: Array<Int> = arrayOf(2,65,3,87,34,9,56,9,5,345,987,345)
    print("Массив:")
    for (number in numbers){
        print(" $number\t")
    }
    println()
    println("Заменяем 5 элемент массива")
    numbers[4] = 55555
    print("Массив:")
    for (number in numbers){
        print(" $number\t")
    }
//    println("Введите массив, состоящий из 12 элементов целого типа:")
//    println("Введите 1 элемент массива:")
//    val x1:Int = readln().toInt()
//    println("Введите 2 элемент массива:")
//    val x2:Int = readln().toInt()
//    println("Введите 3 элемент массива:")
//    val x3:Int = readln().toInt()
//    println("Введите 4 элемент массива:")
//    val x4:Int = readln().toInt()
//    println("Введите 5 элемент массива:")
//    val x5:Int = readln().toInt()
//    println("Введите 6 элемент массива:")
//    val x6:Int = readln().toInt()
//    println("Введите 7 элемент массива:")
//    val x7:Int = readln().toInt()
//    println("Введите 8 элемент массива:")
//    val x8:Int = readln().toInt()
//    println("Введите 9 элемент массива:")
//    val x9:Int = readln().toInt()
//    println("Введите 10 элемент массива:")
//    val x10:Int = readln().toInt()
//    println("Введите 11 элемент массива:")
//    val x11:Int = readln().toInt()
//    println("Введите 12 элемент массива:")
//    val x12:Int = readln().toInt()
//    val numbers: Array<Int> = arrayOf(x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12)
//    print("массив:")
//    for (number in numbers){
//        print(" $number\t")
//    } println()
//    println("Введите число, на которое хотите заменить 5-й элемент массива:")
//    val y:Int = readln().toInt()
//    numbers[4] = y
//    print("массив:")
//    for (number in numbers){
//        print(" $number\t")
//    }
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    // println("Program arguments: ${args.joinToString()}")
}
