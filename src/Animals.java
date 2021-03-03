public class Animals
{
    private String name;
    private String color;


    Animals(String name, String color)
    {
        this.name = name;
        this.color = color;
    }
    public String getName()
    {
        return name;
    }
    public String getColor()
    {
        return color;
    }
    protected void runAnimal(int run)
    {
        System.out.println(name + " пробежал " + run + " м");
    }
    protected void swimAnimal(int swim)
    {
        System.out.println(name + " проплыл " + swim + " м");
    }
}
