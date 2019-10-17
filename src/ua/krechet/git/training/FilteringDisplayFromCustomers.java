package ua.krechet.git.training;

import java.util.List;

public class FilteringDisplayFromCustomers {
    public void show(List<Customer> customers) {
        customers.stream().filter(customer -> customer.getAge() > 25).sorted((c1, c2) -> c1.getName().compareTo(c2.getName()))
                .forEach(System.out::println);
    }
}
