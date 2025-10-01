package creational.abstract_factory;

public class AWSVirtualMachine implements VirtualMachine {
    @Override
    public String launch() {
        return "AWS EC2 Instance launched";
    }
}
