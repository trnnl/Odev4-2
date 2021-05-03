public class Main {

    public static void main(String[] args) {

        BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
        baseCustomerManager.save(new Customer(1,"Turan","Can","05.08.1990","1905"));
        BaseCustomerManager baseCustomerManager1 = new StarbucksCustomerManager(new CustomerCheckManager());
        baseCustomerManager1.save(new Customer(8,"Ali","Öz","01.01.1992","12345678"));
        System.out.println();
        BaseCustomerManager baseCustomerManager2 = new StarbucksCustomerManager(new CustomerCheckManager());
        baseCustomerManager2.save(new Customer(3, "Ali","Veli",".07.08.1994","444555666"));




    }

}
