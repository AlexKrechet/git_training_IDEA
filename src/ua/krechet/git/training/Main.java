package ua.krechet.git.training;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] arg) {

        CustomersListCreation customersList = new CustomersListCreation();
        List customers = customersList.create();

        FilteringDisplayFromCustomers filteredDisplay = new FilteringDisplayFromCustomers();
        filteredDisplay.show(customers);
    }
}
