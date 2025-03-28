package com.example.m1w3d4coroutine

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.annotation.RequiresApi
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.lang.Thread.sleep
import java.time.LocalDate
import java.time.LocalTime

class MainActivity : ComponentActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    @OptIn(DelicateCoroutinesApi::class)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Here we have only one Chef(coroutine)
        // cooking 3 dishes(functions) one after another
        val mainChefStarts = System.nanoTime()

        println("Main Chef " + dish_1())
        println("Main Chef " + dish_2())
        println("Main Chef " + dish_3())

        val mainChefEnds = System.nanoTime()
        val mainChefDuration = (mainChefEnds-mainChefStarts)/1_000_000_000

        println("The main Chef tok $mainChefDuration")

        //Then the main Chef hired 3 Chefs(coroutines)
        // they are cooking 3 dishes(functions) at the same time

//        val ChefsStart = System.nanoTime()
        val handler = CoroutineExceptionHandler{_, throwable ->
            print("Exception handling: ${throwable.localizedMessage}")
        }
        GlobalScope.launch(handler) {
            println("secondary kitchen Chef_1 " + dish_1())
            throw IndexOutOfBoundsException("Chef_1 mast up")
        }
        GlobalScope.launch(handler) {
            println("secondary kitchen Chef_2 " + dish_2())
            throw IndexOutOfBoundsException("Chef_2 mast up")
        }
        GlobalScope.launch(handler) {
            println("secondary kitchen Chef_3 " + dish_3())
            throw IndexOutOfBoundsException("Chef_3 mast up")
        }

//        val ChefsEnd = System.nanoTime()
//
//        val ChefsDuration = (ChefsEnd - ChefsStart) / 1_000_000_000
//        println("The new hired Chefs tok $ChefsDuration")


    }
}


fun dish_1 ():String{
    sleep(5000L)//preparing the dish
    return ("Dish 1 is done")
}

fun dish_2 ():String{
    sleep(5000L)//preparing the dish
    return ("Dish 2 is done")
}

fun dish_3 ():String{
    sleep(5000L)//preparing the dish
    return ("Dish 3 is done")
}
