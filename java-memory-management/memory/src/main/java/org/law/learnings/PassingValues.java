package org.law.learnings;

public class PassingValues {

    public static void main(String[] args) {
        Customer customer = new Customer("Lawrence");
        renameCustomer(customer);
        System.out.println(customer.getName());
    }

    public static void renameCustomer(Customer customer) {
        customer.setName("JudeLaw");
    }
}
