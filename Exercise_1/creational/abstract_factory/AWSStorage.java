package creational.abstract_factory;

public class AWSStorage implements Storage {
    @Override
    public String provision() {
        return "AWS S3 Bucket provisioned";
    }
}
