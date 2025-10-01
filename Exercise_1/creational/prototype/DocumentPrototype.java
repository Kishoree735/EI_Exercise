package creational.prototype;

public interface DocumentPrototype extends Cloneable {
    DocumentPrototype clone();
    void customize(String content);
    void display();
}
