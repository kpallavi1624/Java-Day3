import java.util.Scanner;

public class String1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        String c = sc.nextLine();
        System.out.println("Length: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Character:"+s.charAt(0));
        System.out.println("contains:"+s.contains(c));
        System.out.println("equals:"+s.equalsIgnoreCase(c));
        System.out.println("ends:"+s.endsWith("programming"));
        System.out.println("indexof:"+s.indexOf(s));
        System.out.println("lastindex:"+s.lastIndexOf(c));
        System.out.println("equalsto:"+s.equals(c));
        System.out.println("contains"+s.contains("rm"));
        System.out.println("substring:"+s.substring(0));
        System.out.println("substringlast:"+s.lastIndexOf(5));
    }
}
