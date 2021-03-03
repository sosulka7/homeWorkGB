public class Main {
    public static void main(String[] args)
    {
        Cat cat1 = new Cat("Пашка", "Черный");
        cat1.runAnimal(201);
        cat1.swimAnimal(-1);
        Dog dog1 = new Dog("Бобик", "Красный");
        dog1.runAnimal(255);
        dog1.swimAnimal(11);
    }
}
