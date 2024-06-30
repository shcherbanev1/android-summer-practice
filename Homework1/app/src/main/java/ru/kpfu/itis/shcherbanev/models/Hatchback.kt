package ru.kpfu.itis.shcherbanev.models

import ru.kpfu.itis.shcherbanev.enums.CarBrands

class Hatchback(
    ID: Int,
    brand: CarBrands,
    year: Int,
    horsePower: Int,
    torque: Int,
    weight: Int,
    private val isCombustedEngine: Boolean
) : Car(ID, brand, year, horsePower, torque, weight) {
    fun hasCombustedEngine() = isCombustedEngine
}