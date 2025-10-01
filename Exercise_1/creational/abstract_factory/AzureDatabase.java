package creational.abstract_factory;

public class AzureDatabase implements Database {
    @Override
    public String create() {
        return "Azure SQL Database created";
    }
}
