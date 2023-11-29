public class Main {

/*
Теория.
    В информатике широко применяется 2 принципа работы: LIFO и FIFO
        LIFO(Last in first out) - Последним пришел, первым ушел (стек)
        FIFO(First in first out) - первым пришел, первым ушел (очередь)

    Стек - структура данных, которая поддерживает операции добавления в конец структуры и извлечение из конца структуры
    Очередь - структура данных, которая поддерживает операции добавления в конец структуры и извлечение из начала структуры

    Примеры из реальной жизни:
        Очередь - очередь в магазине
        Стек - банка чипсов, стопка блинов.

    В информатике часто приходится использовать подобные структуры данных, для решения системных вопросов или специфических
        задач программирования.
 */

/*
Заметки.
    Применение очереди: Блокирующая очередь - рабочий поток
    Применение стека: Цепочка вызовов элементов программы

    TODO - указание в комментах к программе, что нужно сднелать в будущем

 */

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.display();
        stack.trace();
        System.out.println("Pop: " + stack.pop());
        stack.display();
        stack.trace();
        System.out.println("Peek: " + stack.peek());
        stack.display();
        stack.trace();
        System.out.println("Pop: " + stack.pop());
        stack.display();
        stack.trace();
        System.out.println("Pop: " + stack.pop());
        stack.display();
        stack.trace();
        System.out.println("Pop: " + stack.pop());
        stack.display();
        stack.trace();
        System.out.println("Начинаем добавление в стек:");
        stack.push(2);
        stack.display();
        stack.trace();
        stack.push(2);
        stack.display();
        stack.trace();
        stack.push(2);
        stack.display();
        stack.trace();
        stack.push(2);
        stack.display();
        stack.trace();
        stack.push(2);
        stack.display();
        stack.trace();
        stack.push(2);
        stack.display();
        stack.trace();
        stack.push(2);
        stack.display();
        stack.trace();


    }
}
