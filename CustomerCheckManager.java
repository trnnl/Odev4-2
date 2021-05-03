public class CustomerCheckManager implements ICustomerCheckService{
    @Override
    public boolean checkIfPersonReal(Customer customer) {
        if(customer.getFirstName().equals("Ali") && customer.getLastName().equals("Öz") && customer.getNationalityID().equals("12345678")){
            return true;
        }

        else{
            return false;
        }
    }

}
