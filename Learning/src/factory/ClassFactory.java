package factory;

public class ClassFactory {
    private enum Signs {FIRST, SECOND}
        public static Base getClassFromFactory(String id) {
            Signs sign = Signs.valueOf(id.toUpperCase());
            switch(sign) {
                case FIRST : return new First();
                case SECOND : return new Second();
                default : throw new EnumConstantNotPresentException(Signs.class, sign.name());
            }
    }
}
