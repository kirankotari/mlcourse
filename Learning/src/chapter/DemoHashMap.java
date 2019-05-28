package chapter;
        import java.util.*;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>(5);

        for (int i = 11; i<15; i++)
            hm.put(i, i + "EL");
//        System.out.print(hm);
        hm.put(12,"14EL");
//        System.out.println(hm);
        String a = hm.get(12);
//        System.out.print(a);
        Set<Map.Entry<Integer, String>> setValue = hm.entrySet();

        Iterator<Map.Entry<Integer, String>> i = setValue.iterator();
        while (i.hasNext()) {
            Map.Entry<Integer, String> me = i.next();
            System.out.print(me.getKey() + " : ");
//            System.out.println(me.getValue());
        }
    }
}
