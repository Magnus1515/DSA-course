package classes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cookie cookieOne = new Cookie("green");
        Cookie cookieTwo = new Cookie("blue");

        cookieOne.setColor("yelow");

        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());
    }
}