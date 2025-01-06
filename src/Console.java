import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {

    public static void println(String message) {
        System.out.println(message);
    }

    public static int readInt(){

        String line = readln();

        try{
            return Integer.parseInt(line);
        } catch(NumberFormatException e){
            return 0;
        }
    }

    public static String readln() {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            return buffer.readLine();
        } catch (IOException e) {
            return "";
        }
    }
}