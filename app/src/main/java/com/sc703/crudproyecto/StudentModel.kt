package com.sc703.crudproyecto
import java.util.*

class StudentModel(
    var id: Int = getAutoId(),
    var name: String = "",
    var email: String = ""
) {
    companion object{
        fun getAutoId():Int {
            val random = Random()
            return random.nextInt(100)
        }
    }

}