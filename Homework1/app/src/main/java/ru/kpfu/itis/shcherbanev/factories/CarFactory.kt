package ru.kpfu.itis.shcherbanev.factories

import ru.kpfu.itis.shcherbanev.enums.CarBrands
import ru.kpfu.itis.shcherbanev.enums.DriveType
import ru.kpfu.itis.shcherbanev.models.Car
import ru.kpfu.itis.shcherbanev.models.Hatchback
import ru.kpfu.itis.shcherbanev.models.SUV
import ru.kpfu.itis.shcherbanev.models.Sedan
import ru.kpfu.itis.shcherbanev.models.Truck
import kotlin.random.Random

class CarFactory {

    fun createRandomCar(ID: Int): Car {
        val randomBrand = generateRandomBrand()
        val randomYear = generateRandomYear()
        val randomHorsePower = generateRandomHorsePower()
        val randomTorque = generateRandomTorque()
        val randomWeight = generateRandomWeight()

        val randomType = listOf("Hatchback", "Sedan", "SUV", "Truck").random()

        return when (randomType) {
            "SUV" -> SUV(
                ID,
                randomBrand,
                randomYear,
                randomHorsePower,
                randomTorque,
                randomWeight,
                generateRandomDriveType()
            )

            "Sedan" -> Sedan(
                ID,
                randomBrand,
                randomYear,
                randomHorsePower,
                randomTorque,
                randomWeight,
                generateRandomLuxuryLevel()
            )

            "Truck" -> Truck(
                ID,
                randomBrand,
                randomYear,
                randomHorsePower,
                randomTorque,
                randomWeight,
                generateRandomLoadCapacity()
            )

            "Hatchback" -> Hatchback(
                ID,
                randomBrand,
                randomYear,
                randomHorsePower,
                randomTorque,
                randomWeight,
                generateRandomCombustedEngine()
            )

            else -> throw IllegalArgumentException()
        }
    }

    private fun generateRandomBrand(): CarBrands = CarBrands.entries.toTypedArray().random()

    private fun generateRandomYear(): Int = Random.nextInt(from = 1980, until = 2024)

    private fun generateRandomHorsePower(): Int = Random.nextInt(from = 86, until = 640)

    private fun generateRandomTorque(): Int = Random.nextInt(from = 140, until = 750)

    private fun generateRandomWeight(): Int = Random.nextInt(from = 1500, until = 5000)

    private fun generateRandomDriveType(): DriveType = DriveType.entries.toTypedArray().random()

    private fun generateRandomLuxuryLevel(): String = listOf("C class", "E class", "S class", "D class").random()

    private fun generateRandomLoadCapacity(): Int = Random.nextInt(from = 2, until = 18)

    private fun generateRandomCombustedEngine(): Boolean = Random.nextBoolean()

}
