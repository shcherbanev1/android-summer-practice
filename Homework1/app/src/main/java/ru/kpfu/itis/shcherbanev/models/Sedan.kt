package ru.kpfu.itis.shcherbanev.models

import ru.kpfu.itis.shcherbanev.enums.CarBrands

class Sedan(
    ID: Int,
    brand: CarBrands,
    year: Int,
    horsePower: Int,
    torque: Int,
    weight: Int,
    private val luxuryLevel: String
) : Car(ID, brand, year, horsePower, torque, weight) {
    fun getLuxuryLevel() = luxuryLevel
}