package creational.abstract_factory;

public class AWSDatabase implements Database {
    @Override
    public String create() {
        return "AWS RDS Database created";
    }
}
