package manipulandostring;

public class ManipulandoString {

    public static void main(String[] args) {

        String str = "Hello World";

        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.concat("X"));
        System.out.println(str.substring(0,5));

        str = str.substring(6,11);
        System.out.println(str);
    }
}
