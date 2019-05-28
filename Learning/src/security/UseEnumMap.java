package security;
import java.util.*;

public class UseEnumMap {
    public static void main(String[] args) {
        EnumMap<User, UserPriority> faculty = new EnumMap<User, UserPriority>(User.class);
        for (User user : User.values()) {
            faculty.put(user, new UserPriority(user));
        }
        for (User user : User.values()) {
            System.out.println(user.name() + "-> Priority:" + ((UserPriority) faculty.get(user)).getPriority());
        }
    }
}