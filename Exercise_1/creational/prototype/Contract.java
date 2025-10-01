package creational.prototype;

public class Contract implements DocumentPrototype {
    private String header;
    private String content;
    private String footer;

    public Contract() {
        this.header = "=== LEGAL CONTRACT ===";
        this.content = "[Contract Terms]";
        this.footer = "Signature: __________";
    }

    @Override
    public DocumentPrototype clone() {
        try {
            return (Contract) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Contract();
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
        System.out.println(footer);
    }
}
