package day2;

public class StringFunctions {
	public static void main(String[] args) {

        String s = "  Hello World  ";

    System.out.println("length: " + s.length());
    System.out.println("charAt: " + s.charAt(1));
    System.out.println("substring: " + s.substring(2, 7));
    System.out.println("toUpperCase: " + s.toUpperCase());
    System.out.println("toLowerCase: " + s.toLowerCase());
    System.out.println("trim: " + s.trim());
    System.out.println("equals: " + s.equals("Hello"));
    System.out.println("equalsIgnoreCase: " + s.equalsIgnoreCase("hello world"));
    System.out.println("contains: " + s.contains("World"));
    System.out.println("startsWith: " + s.startsWith("  He"));
    System.out.println("endsWith: " + s.endsWith("  "));
    System.out.println("indexOf: " + s.indexOf("o"));
    System.out.println("lastIndexOf: " + s.lastIndexOf("o"));
    System.out.println("replace: " + s.replace("World", "Java"));
    System.out.println("concat: " + s.concat("!!!"));
    }

}
