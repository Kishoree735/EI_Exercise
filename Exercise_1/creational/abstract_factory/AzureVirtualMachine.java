package creational.abstract_factory;

public class AzureVirtualMachine implements VirtualMachine {
    @Override
    public String launch() {
        return "Azure VM Instance launched";
    }
}
