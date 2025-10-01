package creational.abstract_factory;

public class AWSFactory implements CloudFactory {
    @Override
    public VirtualMachine createVM() {
        return new AWSVirtualMachine();
    }

    @Override
    public Database createDatabase() {
        return new AWSDatabase();
    }

    @Override
    public Storage createStorage() {
        return new AWSStorage();
    }
}
