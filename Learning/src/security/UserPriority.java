package security;

enum User {
    STUDENT, TUTOR, INSTRUCTOR, DEAN
}
class UserPriority {
    private int priority;
    public UserPriority(User k) {
        switch (k) {
            case STUDENT:
                priority = 1; break;
            case TUTOR:
                priority = 3; break;
            case INSTRUCTOR:
                priority = 7; break;
            case DEAN:
                priority = 10; break;
            default:
                priority = 0;
        }
    }
    public int getPriority() {
        return priority;
    }
}
