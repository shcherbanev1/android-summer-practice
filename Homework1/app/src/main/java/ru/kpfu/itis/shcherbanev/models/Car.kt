package ru.kpfu.itis.shcherbanev.models

import ru.kpfu.itis.shcherbanev.enums.CarBrands

abstract class Car(
    private val ID: Int,
    private val brand: CarBrands,
    private val year: Int,
    private val horsePower: Int,
    private val torque: Int,
    private val weight: Int
) {
    fun printInfo() {
        println("ID = $ID, ${brand.brand} $year - $horsePower HP, $torque Nm, $weight kg")
    }

    fun getID() = ID
    fun getHorsePower() = horsePower
    fun getTorque() = torque
    fun getWeight() = weight

}