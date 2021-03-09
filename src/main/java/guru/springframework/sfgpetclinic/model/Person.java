package guru.springframework.sfgpetclinic.model;

public class Person {
    private String FirstName;
    private String lastName;


    public Person(String firstName, String lastName) {
        FirstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
