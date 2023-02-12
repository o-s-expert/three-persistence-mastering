package expert.os.performance;

import java.util.List;

public class Person {

    private Long id;

    private String name;

    //one to many annotation -- JPA
    // UDT to Cassandra
    //subdocument on MongoDB
    private List<Address> addresses;
}
