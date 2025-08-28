import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class hello_file {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Hello.txt"));
            String line;
            while((line = br.readLine())!=null){
                System.out.println();
            }
            br.close();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
