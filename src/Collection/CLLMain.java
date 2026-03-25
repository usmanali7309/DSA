package Collection;

public class CLLMain {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(4);
        list.insert(9);
        list.insert(3);
        list.insert(5);
        list.delete(9);
        list.display();
    }
}
