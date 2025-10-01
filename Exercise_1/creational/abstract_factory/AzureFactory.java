package creational.abstract_factory;

public class AzureFactory implements CloudFactory {
    @Override
    public VirtualMachine createVM() {
        return new AzureVirtualMachine();
    }

    @Override
    public Database createDatabase() {
        return new AzureDatabase();
    }

    @Override
    public Storage createStorage() {
        return new AzureStorage();
    }
}
