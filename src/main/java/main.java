import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        KeyLogger kl = new KeyLogger(br.readLine());
        System.out.println(kl.getPsw());
        br.close();
    }
}
