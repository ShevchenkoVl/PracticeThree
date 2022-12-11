package com.practice3

data class Figure(
    val width: Int,
    val height: Int
){
    val area get()=width*height
}
