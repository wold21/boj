import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String jaehwan = br.readLine();
        String doctor = br.readLine();
        if(jaehwan.length() < doctor.length()){
            System.out.println("no");
        } else {
            System.out.println("go");
        }
        br.close();
    }
}