package UI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunExec {
    public String process(String baitaptuan, String BT){
        try {
            String cmdString = "java src/" + baitaptuan + "/" + BT + ".java";
            Process r = Runtime.getRuntime().exec(cmdString);
            BufferedReader input = new BufferedReader(new InputStreamReader(
                    r.getInputStream()));
            String line;
            String output = "";
            while ((line = input.readLine()) != null)
            {
                output = output + line + "\n";
            }
            if (output != "") return output;

        } catch (IOException e) {
        }
        return "Error";
    }
}
