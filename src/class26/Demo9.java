package class26;

import java.util.ArrayList;

public class Demo9 {
    public static void main(String[] args) {
        Integer number=10;
        System.out.println(Integer.MAX_VALUE);
        int num=Integer.parseInt("20");//if number is present in the form of String using this method we can conert to int
        System.out.println(num);
        System.out.println(Integer.MIN_VALUE);

        int number1=15;
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(number1);
        System.out.println("numbers = " + numbers);
    }
}
