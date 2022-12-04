fun main(args: Array<String>) {
    val koala: Animal = Herbivores()
    koala.name = "Коала"
    koala.color = "Серый"
    koala.food = "Листья"
    koala.sayHello()

    val giraffe: Animal = Herbivores()
    giraffe.name = "Жираф"
    giraffe.color = "Коричневый"
    giraffe.food = "Листья"
    giraffe.sayHello()

    val jaguar: Animal = Carnivores()
    jaguar.name = "Ягуар"
    jaguar.color = "Пятнистый"
    jaguar.food = "Мясо"
    jaguar.sayHello()

    val puma: Animal = Carnivores()
    puma.name = "Пума"
    puma.color = "Песочная"
    puma.food = "Мясо"
    puma.sayHello()
}