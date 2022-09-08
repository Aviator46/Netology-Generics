public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox1 = new MagicBox<>(5);
        magicBox1.add("Часы");
        magicBox1.add("Очки");
        magicBox1.add("Ручка");
        magicBox1.add("Ножницы");
        magicBox1.add("Надфиль");
        magicBox1.pick();

        MagicBox<Integer> magicBox2 = new MagicBox<>(5);
        magicBox2.add(5);
        magicBox2.add(26);
        magicBox2.add(46);
        magicBox2.add(63);
        magicBox2.pick();
    }
}