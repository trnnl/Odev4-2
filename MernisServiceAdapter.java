public class MernisServiceAdapter implements ICustomerCheckService{
    @Override
    public boolean checkIfPersonReal(Customer customer) {
        return false;
    }
}
