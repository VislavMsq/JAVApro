public class Main {
/*
Hash - функция представляет обьект в виде числового значения. Алгоритма перевода в число могут быть разные,
    но не у всех есть обьщее свойство.
HashCode - дает числовое представление обьекта, если HashCode - обьекта не совпали , то дальше обьекты можно не сравнивать
    если совпали это не значит, что обьекты равны, нужно продолжать проверку.

Словарь - структура данных, в которой каждый элемент имеет свой ключ, по которорому к нему можно обратиться
    пара - ключ->значение. Синонимы: Карты(Мап), Мапа, Dictionary, множесвто, хэш-таблицы

Сложность доступа к элементу равна O(1) - константная сложность, т.е неважно каких размеров структура, это операция
    всегда будет требовать одинаковое кл-во операций

Каллизия(хэш-промах) - хэш функция вычесляет позицию для элемента, но нет гарантии, что эта позиция уже не занята
    другим элементов.

Решение проблем коллизии: линейное пробирование, квадратичное пробирование и двойное хэширование

 */

    public static void main(String[] args) {
        String str = "Privet";

        System.out.println(str.hashCode());

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.insert("Привет", "Hello");
        hashMap.display();
        System.out.println("Значение: " + hashMap.find("Привет"));

        hashMap.insert("Пока", "Bye");
        hashMap.display();
        System.out.println("Значение: " + hashMap.find("Пока"));

    }
}
