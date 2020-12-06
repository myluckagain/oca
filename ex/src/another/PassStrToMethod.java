package another;

public class PassStrToMethod {

    public static void m(String s) {
        s = s + "end";
    }

    public static void m(StringBuilder builder) {
        builder.append("end");
    }

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("start");
        m(builder);
        //строка меняется
        System.out.println(builder);

        String s = "start";
        m(s);
        //строка не меняется
        System.out.println(s);

    }
}