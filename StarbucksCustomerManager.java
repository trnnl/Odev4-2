public class StarbucksCustomerManager extends BaseCustomerManager{

    ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;

    }


    @Override
    public void save(Customer customer) {
        if(customerCheckService.checkIfPersonReal(customer)){
            super.save(customer);
        }
        else{
            System.out.println("Geçerli bir kullanıcı değil...");
        }

    }

}
