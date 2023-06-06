import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]arr = new  int[10];
        System.out.println("Укажите индекс элемента в который хотите записать значение 1");
        int index = scanner.nextInt();
        if (index < arr.length && index > -1){
            arr[index]= 1;
        } else {
            System.out.println("уКАЗАТЬ индекс за пределами массива");
        }
//        try {
//            arr[index] = 1;
//        } catch (Exception e){
//            System.out.println("уКАЗАТЬ индекс за пределами массива")
        }
    }

