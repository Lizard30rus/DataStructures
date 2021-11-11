import java.io.IOException;

public class InterListApp {

    public static void main(String[] args) throws IOException {
        LinkList theList = new LinkList(); // Создание списка
        CustomLIstIterator iter1 = theList.getIterator(); // Создание итератора
        long value;
        iter1.insertAfter(20); // Вставка элементов
        iter1.insertAfter(40);
        iter1.insertAfter(80);
        iter1.insertBefore(60);
        theList.displayList();
    }

}
