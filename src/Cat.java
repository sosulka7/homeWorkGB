public class Cat extends Animals
{
    Cat(String name, String color)
    {
        super(name, color);
    }
    @Override
    protected void runAnimal(int run)
    {
        if (run <= 200 && run > 0 )
        {
            System.out.println(getName() + " пробежал " + run + " м");
        }
        else
        {
            System.out.println(getName() + " не может столько пробежать");
        }
    }

    @Override
    protected void swimAnimal(int swim) {
        System.out.println("Вы чего? Кошки не умеют плавать!");
    }
}
