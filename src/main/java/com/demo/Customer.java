// package com.demo;

// import org.springframework.stereotype.Component;

// @Component
// public class Customer {

//     public String getCustomerDetails() {
//         return "Customer: Harish";
//     }
// }
package com.demo;

import org.springframework.stereotype.Component;

@Component
public class Customer {

    private String firstName;
    private String lastName;

    // Default constructor
    public Customer() {
        this.firstName = "Arjun";
        this.lastName = "Kumar";
    }

    // Parameterized constructor (optional)
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter and Setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Method to return full customer details
    public String getCustomerDetails() {
        return "Customer: " + firstName + " " + lastName;
    }
}
