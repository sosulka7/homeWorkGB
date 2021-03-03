public class Dog extends Animals
{
    Dog(String name, String color)
    {
        super(name, color);
    }
    @Override
    protected void runAnimal(int run)
    {
        if (run <= 500 && run > 0 )
        {
            System.out.println(getName() + " пробежал " + run + " м");
        }
        else
        {
            System.out.println(getName() + " не может столько пробежать");
        }
    }
    protected void swimAnimal(int swim) {
        if (swim <= 10 && swim > 0 )
        {
            System.out.println(getName() + " проплыл " + swim + " м");
        }
        else
        {
            System.out.println(getName() + " не может столько проплыть");
        }
    }
}
