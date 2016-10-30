package main

/**
 * Created by Roger on 30/10/2016.
 */
class Utis {

    @Throws(NumberFormatException::class)
    fun getLineInInt(line: String?): Int {
        return line!!.toInt()
    }


}