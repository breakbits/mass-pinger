package masspinger;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by kamil on 16.03.2017.
 */
public class MassPinger {



    public static void main(String[] args) {

        String ip = "127.0.0.1";
        String pingResult="";
        String pingCmd = "ping " + ip;
        try {
            Runtime r = Runtime.getRuntime();
            Process p = r.exec(pingCmd);

            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((pingResult=in.readLine()) != null) {
                System.out.println(pingResult);
            }
            in.close();
        }
    catch (Exception e){
        System.out.println(e);
    }

    }
}
