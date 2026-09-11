package com.joysistvi.stage2.day19.activity13;

public class UserAccount {

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;


    //parameterized constructor
    public UserAccount (String firstName, String middleName, String lastName,
                        String address, String email, String password) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;

        if (!email.contains("@")) {
            this.email = "Email must contain @";
        } else {
            this.email = email;
        }

        this.password = password;
    }


    //getter
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    //setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            this.email = "Invalid. Email must contain @";
        } else {
            this.email = email;
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
