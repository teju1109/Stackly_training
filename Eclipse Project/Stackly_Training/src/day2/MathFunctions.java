package day2;

public class MathFunctions {
    public static void main(String[] args) {

        double a = 16, b = -5, c = 2.5;

        System.out.println("abs: " + Math.abs(b));
        System.out.println("sqrt: " + Math.sqrt(a));
        System.out.println("pow: " + Math.pow(a, 2));
        System.out.println("max: " + Math.max(a, b));
        System.out.println("min: " + Math.min(a, b));
        System.out.println("round: " + Math.round(c));
        System.out.println("ceil: " + Math.ceil(c));
        System.out.println("floor: " + Math.floor(c));
        System.out.println("random: " + Math.random());
        System.out.println("cbrt: " + Math.cbrt(a));
        System.out.println("exp: " + Math.exp(2));
        System.out.println("log: " + Math.log(a));
        System.out.println("log10: " + Math.log10(a));
        System.out.println("sin: " + Math.sin(a));
        System.out.println("cos: " + Math.cos(a));
        System.out.println("tan: " + Math.tan(a));
        System.out.println("asin: " + Math.asin(0.5));
        System.out.println("acos: " + Math.acos(0.5));
        System.out.println("atan: " + Math.atan(1));
        System.out.println("signum: " + Math.signum(b));
    }
}