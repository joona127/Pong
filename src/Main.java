public class Main {
    public static void main(String[] args) {
        Window window = new Window();
        Thread thread1 = new Thread(window);
        thread1.start();
    }
}
