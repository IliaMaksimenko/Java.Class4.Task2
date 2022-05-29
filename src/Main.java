import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input your height in centimeters: ");
        float height = in.nextFloat();

        System.out.print("Input your weight in kilograms: ");
        float weight = in.nextFloat();

        BmiService service = new BmiService();
        float YourBmi = service.Bmi(weight, height);


        System.out.println("Body mass index = " + YourBmi);
        in.close();

        if (YourBmi > 18 && YourBmi < 25){
            System.out.println("Your body mass index is Normal");
        }else if(YourBmi < 18){
            System.out.println("Your body mass index is Low");
        }else{
            System.out.println("Your body mass index is High");
        }
    }
}
