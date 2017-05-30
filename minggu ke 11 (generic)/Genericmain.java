package generic;

public class Genericmain {
    public static void main(String[] args) {
        
        Katering<Integer> integer_object;
        integer_object = new Katering<>(88);
        integer_object.showType();

        int v = integer_object.getob();
        System.out.println("value: " + v);

        System.out.println();

        Katering<String> string_object = new Katering<>("Generics Test");

        string_object.showType();

        String str = string_object.getob();
        System.out.println("value: " + str);
    }
}