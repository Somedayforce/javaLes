import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int  areaRectangle(int a,int b) throws NVException {
        if(a<0 || b<0){
            throw new NVException("Wrong values!");
        }
        return a*b;
    };
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a and b:");
        int a =0;
        int b = 0;
        try {
            a= Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
        } catch (IOException|NumberFormatException e) {
            System.out.println("Input error!");
        }
        try {
            areaRectangle(a, b);
        }catch (NVException e){
            System.err.println(e);
        }
        System.out.println("================");
        try {
            Plant plant = new Plant(5, "Blue", "tre");
            System.out.println(plant);
        } catch (ColorException e) {
            e.printStackTrace();
        } catch (TypeException e) {
            e.printStackTrace();
        }
    }
}
