public class Main {
    public static void main(String[] args)
    {
        Worker worker1 = new Worker("ds", "ad", "das","8-999-777-22-33" , 13333, 23);
        Worker[] workersArray = new Worker[5];
        workersArray[0] = new Worker("Вася", "Аптекарь", "vasya228@mail.ru", "8-900-288-32-21", 29000, 43 );
        workersArray[1] = new Worker("Петя", "Трубочист", "petya228@mail.ru","8-733-828-27-78", 25000, 42 );
        workersArray[2] = new Worker("Саня", "Таксист", "sanya228@mail.ru","8-364-776-18-72", 31000, 39 );
        workersArray[3] = new Worker("Егор", "Садовник", "egor228@mail.ru","8-374-998-29-46", 30000, 23 );
        workersArray[4] = new Worker("Геннадий", "Сантехник", "genadyi228@mail.ru","8-123-777-14-83", 35000,51 );
        System.out.println("Возраст больше 40");
        for (int i = 0; i < workersArray.length; i++)
        {
            if(workersArray[i].age > 40)
            {
                System.out.println("Cотрудник №" + (i + 1) + ":");
                workersArray[i].outputToTheConsole();
            }
        }
    }
}
