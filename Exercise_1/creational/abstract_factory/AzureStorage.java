package creational.abstract_factory;

public class AzureStorage implements Storage {
    @Override
    public String provision() {
        return "Azure Blob Storage provisioned";
    }
}
