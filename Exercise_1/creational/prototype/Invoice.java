package creational.prototype;

public class Invoice implements DocumentPrototype {
    private String header;
    private String content;
    private String total;

    public Invoice() {
        this.header = "=== INVOICE ===";
        this.content = "[Items List]";
        this.total = "Total: $5000.00";
    }

    @Override
    public DocumentPrototype clone() {
        try {
            return (Invoice) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Invoice();
        }
    }

    @Override
    public void customize(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println(header);
        System.out.println(content);
        System.out.println(total);
    }
}
