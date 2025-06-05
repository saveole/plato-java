package org.saveole.model;

public class Main {
    public static void main(String[] args) {
        GetUserRequest request = GetUserRequest.newBuilder()
            .setId("123")
            .build();
        System.out.println(request);

        User jonhDoe = User.newBuilder()
                .setId("123")
                .setName("Jonh Doe")
                .setEmail("<EMAIL>")
                .addPhoneNumbers("123456789")
                .addPhoneNumbers("987654321")
                .build();
        System.out.println(jonhDoe);
    }
}
