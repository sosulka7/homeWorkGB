public class Worker
{
    String name;
    String position;
    String email;
    String number;
    int salary;
    int age;

    public Worker(String name, String position, String email, String number, int salary, int age)
    {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }
//    public void creationWorker()
//    {
//        Worker[] workersArray = new Worker[5];
//        workersArray[0] = new Worker("Вася", "Аптекарь", "vasya228@mail.ru", 29000, 41 );
//        workersArray[1] = new Worker("Петя", "Трубочист", "vasya228@mail.ru", 29000, 41 );
//        workersArray[2] = new Worker("Саня", "Таксист", "vasya228@mail.ru", 29000, 41 );
//        workersArray[3] = new Worker("Егор", "Садовник", "vasya228@mail.ru", 29000, 41 );
//        workersArray[4] = new Worker("Геннадий", "Сантехник", "vasya228@mail.ru", 29000, 41 );
//        for (int i = 0; i < workersArray.length; i++)
//        {
//            System.out.println("сотрудник №" + (i+1)+": " + workersArray[i]);
//        }
//    }

    public void outputToTheConsole()
    {
        System.out.print("Имя: " + name + ", ");
        System.out.print("Должность: " + position + ", ");
        System.out.print("e-mail: " + email + ", ");
        System.out.print("Номер: " + number + ", ");
        System.out.print("Зарплата: " + salary + ", ");
        System.out.print("Возраст: " + age);
        System.out.println();
    }
}
