package ru.kpfu.itis.shcherbanev.models

import ru.kpfu.itis.shcherbanev.enums.CarBrands
import ru.kpfu.itis.shcherbanev.enums.DriveType

class SUV(
    ID: Int,
    brand: CarBrands,
    year: Int,
    horsePower: Int,
    torque: Int,
    weight: Int,
    private val driveType: DriveType
) : Car(ID, brand, year, horsePower, torque, weight) {
    fun getDriveType() = driveType
}