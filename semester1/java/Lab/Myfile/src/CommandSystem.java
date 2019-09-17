import java.util.ArrayList;

public class CommandSystem {
    private ArrayList<MyFile> files;
    private String command;
    private String params;
    private String output;

    public void execute(String commandLine){
        String [] arr = commandLine.split(" ");
        if(arr[1].equals(">")){
            command = arr[0] + arr[1];
        }else{
            params = arr[1];
        }

    }

    public String getCommand() {
        return command;
    }
    public String getParams() {
        return params;
    }

    public String getOutput() {
        return output;
    }
}
