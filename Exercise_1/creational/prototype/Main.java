package creational.prototype;

public class Main {
    public static void main(String[] args) {
        DocumentTemplateManager manager = new DocumentTemplateManager();
        manager.addTemplate("contract", new Contract());
        manager.addTemplate("invoice", new Invoice());

        DocumentPrototype clientContract = manager.getTemplate("contract");
        clientContract.customize("Employment Agreement for Kishoree");
        System.out.println("--- Client Contract ---");
        clientContract.display();

        DocumentPrototype clientInvoice = manager.getTemplate("invoice");
        clientInvoice.customize("Services: Web Development - $5000");
        System.out.println("\n--- Client Invoice ---");
        clientInvoice.display();
    }
}
