package ru.kpfu.itis.shcherbanev.models

import ru.kpfu.itis.shcherbanev.enums.CarBrands

class Truck(
    ID: Int,
    brand: CarBrands,
    year: Int,
    horsePower: Int,
    torque: Int,
    weight: Int,
    private val loadCapacity: Int
) : Car(ID, brand, year, horsePower, torque, weight) {
    fun getLoadCapacity() = loadCapacity
}