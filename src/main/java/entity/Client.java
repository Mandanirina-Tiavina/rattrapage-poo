package entity;

import lombok.AllArgsConstructor;

import java.time.Instant;

@AllArgsConstructor
public class Client {
    private String firstName;
    private String lastName;
    private Instant birthDate;
    private String address;
    private String email;
    private String phone;
}
