package chapter;

import java.util.*;

public class Message {
    private String message;
    private int id;

    public Message(String message) {
        this.message = message;
        this.id = new Random().nextInt(1000);
    }
    public String getMessage() {
        return message;
    }
    public Integer getId() {
        return id;
    }
    public String toString() {
        return "[" + id + "] " + message;
    }
    public static void main(String[] args){
        Comparator<Message> comparator = new Comparator<Message>(){
            public int compare(Message o1, Message o2) {
                return o1.getId().compareTo(o2.getId());
            }
        };
        List<Message> messages = new ArrayList();
        List<Message> messages1 = new ArrayList();
        messages.add(new Message("Hello, World!"));
        messages.add(new Message("Hello, Sun!"));
        messages.add(new Message("kek!"));
        messages.add(new Message("qwert"));
        messages.add(new Message("trewq"));
//        Collections.sort(messages,comparator);
        System.out.println(messages);
    }
}