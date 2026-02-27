package test9;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
class User {
    private String username;
    private String email;
    private int age;
}

public class UserFactory {
    public static void main(String[] args) {
        User user1 = User.builder()
                .username("user1")
                .email("user1@example.com")
                .age(25)
                .build();

        User user2 = User.builder()
                .username("user2")
                .email("user2@example.com")
                .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}