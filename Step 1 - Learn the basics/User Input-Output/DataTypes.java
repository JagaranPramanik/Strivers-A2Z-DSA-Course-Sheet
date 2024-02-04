import java.util.Scanner;

public class DataTypes {
    public static int dataTypes(String type) {
        if(type.equals("Integer")) {
            return 4;
        }
        else if(type.equals("Long")) {
            return 8;
        }
        else if(type.equals("Float")) {
            return 4;
        }
        else if(type.equals("Double")) {
            return 8;
        }
        else if(type.equals("Character")) {
            return 1;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        System.out.println(dataTypes(data));
        sc.close();
    }
}