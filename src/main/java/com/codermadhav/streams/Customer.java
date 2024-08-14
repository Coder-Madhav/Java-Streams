package com.codermadhav.streams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    private int id;
    private String name;
    private String email;
    private List<String> phoneNumber;

    public static List<Customer> customerData() {
        return Arrays.asList(
                Customer.builder()
                        .id(1)
                        .name("John Doe")
                        .email("john.doe@example.com")
                        .phoneNumber(Arrays.asList("123-456-7890", "098-765-4321"))
                        .build(),

                Customer.builder()
                        .id(2)
                        .name("Jane Smith")
                        .email("jane.smith@example.com")
                        .phoneNumber(Arrays.asList("555-123-4567", "555-765-4321"))
                        .build(),

                Customer.builder()
                        .id(3)
                        .name("Alice Johnson")
                        .email("alice.johnson@example.com")
                        .phoneNumber(Arrays.asList("111-222-3333", "444-555-6666"))
                        .build(),

                Customer.builder()
                        .id(4)
                        .name("Bob Brown")
                        .email("bob.brown@example.com")
                        .phoneNumber(Arrays.asList("222-333-4444", "333-444-5555"))
                        .build(),

                Customer.builder()
                        .id(5)
                        .name("Carol White")
                        .email("carol.white@example.com")
                        .phoneNumber(Arrays.asList("666-777-8888", "777-888-9999"))
                        .build()

        );
    }
}
