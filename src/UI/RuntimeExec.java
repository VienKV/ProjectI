package UI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RuntimeExec {
    public String process(String week, String bai){
        try {
            String cmdString = "java src/" + week + "/" + bai + ".java";
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
