# Mediator Design Pattern

O cliente solicita um Memento do objeto de origem quando precisa verificar o estado do objeto de origem. O objeto de origem inicializa o Memento com uma caracterização de seu estado. O cliente é o “care-taker” do Memento, mas apenas o objeto de origem pode armazenar e recuperar informações do Memento (o Memento é “opaco” para o cliente e todos os outros objetos). Se o cliente precisar subseqüentemente “reverter” o estado do objeto de origem, ele entregará o Memento de volta ao objeto de origem para reintegração.

Usage:
```kotlin
fun main() {
    with(Adder()) {
        add(10)
        println(result)
        save()
        add(20)
        println(result)
        undo()
        println(result)
    }
}
```

Output:
```text
10
30
10
```