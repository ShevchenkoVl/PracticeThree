package com.practice3

fun main()
{
    val a=Figure(width = 5, height = 6)
    val b=Figure(width = 7, height = 8)
    val c=Figure(width = 8, height = 3)

    val figures = listOf(a,b,c)

    var allArea = 0
    figures.forEach{
        allArea+=it.area
    }
    println(allArea)
    println("__________")
    val d=Rectangle(sideA = 4, sideB = 4)
    val e=Rectangle(sideB = 3, sideA = 8)
    val g=Oval(firstRadius = 3, secondRadius = 3)
    val f=Oval(firstRadius = 5, secondRadius = 6)
    val h=Line(length = 10)


    val shapes = mutableListOf(d,e,g,f,h)

    var ovals = shapes.filterIsInstance<Oval>().count();
    var rectangles = shapes.filterIsInstance<Rectangle>().count();
    var lines = shapes.filterIsInstance<Line>().count();

    print("ovals ")
    println(ovals)
    print("rectangles ")
    println(rectangles)
    print("lines ")
    println(lines)
    println("__________")
    ovals=0
    rectangles=0
    lines=0

    shapes.forEach {
        when (it) {
            is Oval -> ovals++
            is Rectangle -> rectangles++
            is Line -> lines++
        }
    }
    print("ovals ")
    println(ovals)
    print("rectangles ")
    println(rectangles)
    print("lines ")
    println(lines)
}