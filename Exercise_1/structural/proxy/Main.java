package structural.proxy;

public class Main{
    public static void main(String[] args) {
        Image image1 = new ImageProxy("vacation_photo.jpg");

        System.out.println("--- First request ---");
        image1.display();

        System.out.println("\n--- Second request (cached) ---");
        image1.display();
    }
}
