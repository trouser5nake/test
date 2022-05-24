package test;

public class test {

    public static void main(String[] args) {
        String s = "23.456.32";
        String s1 = s.replace(".", "");

        int d = Integer.parseInt(s1);
        System.out.println(d);
    }
}