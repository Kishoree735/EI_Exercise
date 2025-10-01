package structural.proxy;

public class ImageProxy implements Image {
    private String filename;
    private HighResolutionImage realImage;
    private boolean isCached;

    public ImageProxy(String filename) {
        this.filename = filename;
        this.isCached = false;
    }

    @Override
    public void display() {
        if (!isCached) {
            System.out.println("[PROXY] Image not in cache, loading...");
            realImage = new HighResolutionImage(filename);
            isCached = true;
        } else {
            System.out.println("[PROXY] Serving from cache");
        }
        realImage.display();
    }
}
