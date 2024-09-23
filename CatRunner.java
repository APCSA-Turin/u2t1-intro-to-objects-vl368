public class CatRunner {
    public static void main(String[] args){
        Cat cat1 = new Cat("Pooks", 23, 34);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("lemon", 4, 234);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
