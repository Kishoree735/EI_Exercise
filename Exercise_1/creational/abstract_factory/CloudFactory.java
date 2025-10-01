package creational.abstract_factory;

public interface CloudFactory {
    VirtualMachine createVM();
    Database createDatabase();
    Storage createStorage();
}
