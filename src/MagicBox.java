import java.util.Random;

public class MagicBox<T> {
    public int maxElements;
    public T[] items;
    public int fullElements = 0; //занятые ячейки
    public int randomInt; //случайная ячейка массива

    public MagicBox(int maxElements) {
        this.maxElements = maxElements;
        this.items = (T[]) new Object[maxElements];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                fullElements += 1;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        Random random = new Random();
        if (fullElements < items.length) {
            throw new RuntimeException("Осталось заполнить ячеек: " + (items.length - fullElements));
        }

        if (fullElements == items.length) {
            randomInt = random.nextInt(items.length);
            System.out.println("Коробка заполнена.");
            System.out.println("случайный элемент из коробки: " + items[randomInt]);
            return items[randomInt];
        }
        return null;
    }
}