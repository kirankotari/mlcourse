package chapter;
import java.util.*;
enum Faculty{FFSM, MMF, FPMI, FMO, GEO}

public class UseEnumSet {
    public static void main(String[] args) {
        EnumSet<Faculty> set1 = EnumSet.range(Faculty.MMF, Faculty.FMO);
        EnumSet<Faculty> set2 = EnumSet.complementOf(set1);
        System.out.println(set1);
        System.out.println(set2);
    }
}
