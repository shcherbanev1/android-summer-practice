package ru.kpfu.itis.shcherbanev.race

import ru.kpfu.itis.shcherbanev.factories.CarFactory
import ru.kpfu.itis.shcherbanev.models.Car

class RaceManager {

    fun startRace(carsNumber: Int) {
        val carFactory = CarFactory()
        val cars = ArrayList<Car>()

        var round = 1

        for (i in 0 until carsNumber step 1) {
            cars.add(carFactory.createRandomCar(i))
        }

        while (cars.size > 1) {
            println("round $round")

            cars.shuffle()
            val winnerCars = ArrayList<Car>()

            for (i in 0 until cars.size step 2) {
                if (i + 1 < cars.size) {
                    val car1 = cars[i]
                    val car2 = cars[i + 1]

                    println("race between ${car1.getID()} and ${car2.getID()}")
                    val winner = race(car1, car2)
                    println("winner is ${winner.getID()}")

                    winnerCars.add(winner)
                } else {
                    println("${cars[i].getID()} has no pair -> comes to next round")
                    winnerCars.add(cars[i])
                }
            }
            cars.clear()
            cars.addAll(winnerCars)
            round++
        }
        println("Absolute Champion is ${cars.first().getID()}")
    }

    private fun race(car1: Car, car2: Car): Car {
        val power1 = car1.getHorsePower() * car1.getTorque() / car1.getWeight()
        val power2 = car2.getHorsePower() * car2.getTorque() / car2.getWeight()
        return if (power1 > power2) car1 else car2
    }

}