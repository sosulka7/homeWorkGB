public class Main {
    public static void main(String[] args)
    {
        Cat[] catsArray = new Cat[4];
        catsArray[0] = new Cat("Дукалис", 17,false);
        catsArray[1] = new Cat("Никитос", 13,false);
        catsArray[2] = new Cat("Игорек", 14,false);
        catsArray[3] = new Cat("Максимка", 15,false);
        Plate plate = new Plate(50);
        plate.info();
        for (int i =0; i < catsArray.length; i++) {
            catsArray[i].eat(plate);
            plate.info();
        }
    }
}
