package structural.proxy;

public class HighResolutionImage implements Image {
    private String filename;
    private byte[] imageData;

    public HighResolutionImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading high-resolution image: " + filename);
        // Simulate loading large image
        imageData = new byte[1024 * 1024]; // 1MB
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}
