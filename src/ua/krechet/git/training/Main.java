package ua.krechet.git.training;

import java.util.List;

public class Main {
    public static void main(String[] arg) {

        CustomersListCreation customersList = new CustomersListCreation();
        List<Customer> customers = customersList.create();

        FilteringDisplayFromCustomers filteredDisplay = new FilteringDisplayFromCustomers();
        filteredDisplay.show(customers);
    }
}
