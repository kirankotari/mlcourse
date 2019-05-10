public class Mark <T extends Number>{
    public T mark;

    public Mark(T value) {
        mark = value;
    }
    public T getMark() {
        return mark;
    }
    public int roundMark() {
        return Math.round(mark.floatValue());
    }
    public boolean sameAny(Mark<?> ob) {
        return roundMark() == ob.roundMark();
    }
    public boolean same(Mark<T> ob) {
        return getMark() == ob.getMark();
    }
    class Runner {
        public static void main(String[] args) {
            
        }
    }
}
