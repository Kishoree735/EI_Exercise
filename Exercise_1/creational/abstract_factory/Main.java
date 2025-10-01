package creational.abstract_factory;

public class Main {
    public static void main(String[] args) {
        CloudFactory awsFactory = new AWSFactory();
        System.out.println("--- Provisioning on AWS ---");
        System.out.println(awsFactory.createVM().launch());
        System.out.println(awsFactory.createDatabase().create());
        System.out.println(awsFactory.createStorage().provision());

        CloudFactory azureFactory = new AzureFactory();
        System.out.println("\n--- Provisioning on Azure ---");
        System.out.println(azureFactory.createVM().launch());
        System.out.println(azureFactory.createDatabase().create());
        System.out.println(azureFactory.createStorage().provision());
    }
}
