package com.codermadhav.streams;

import java.util.List;

public class MapVsFlatmapTest {
    public static void main(String[] args) {
        List<Customer> customers = Customer.customerData();

        //get list of emails from the give list
        List<String> emailsList = customers.stream().map(Customer::getEmail).toList();
        System.out.println(emailsList);

        //get the list of phone numbers from the given array
        List<List<String>> phoneNumbers = customers.stream().map(Customer::getPhoneNumber).toList();
        System.out.println(phoneNumbers);

        //get the list of phone numbers using flat map
        List<String> phones = customers.stream().flatMap(customer -> customer.getPhoneNumber().stream())
                .toList();
        System.out.println(phones);
    }
}
