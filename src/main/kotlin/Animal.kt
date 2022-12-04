open class Animal( var type: String, var name: String, var color: String, var food: String) {
    fun sayHello() {
        println("Название: $name, Класс: $type Цвет: $color, Еда: $food")
    }
}