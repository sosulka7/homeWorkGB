public class Cat {
    String name;
    int appetite;
    boolean satiety;

    Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat(Plate a) {
        if (appetite > a.food && satiety == false) {
            System.out.println(name + " - не хватает еды");
            a.addFood();
        }

        a.decreaseFood(appetite);
        satiety = true;
        System.out.println(name + " наелся ");
    }
    void catInfoSatiety(){
        System.out.println(name + ": сытость " + satiety);
    }
}
