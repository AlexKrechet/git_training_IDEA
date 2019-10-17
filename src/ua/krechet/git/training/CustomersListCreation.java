package ua.krechet.git.training;

import java.util.ArrayList;
import java.util.List;

public class CustomersListCreation {
    public List create(){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Tony", 29));
        customers.add(new Customer("Molly", 21));
        customers.add(new Customer("Joe", 27));
        customers.add(new Customer("Mark", 35));
        customers.add(new Customer("Bill", 30));
        return customers;
    }
}
