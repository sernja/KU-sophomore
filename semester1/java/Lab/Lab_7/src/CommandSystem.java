
import java.util.ArrayList;

public class CommandSystem {
    private ArrayList<MyFile> files = new ArrayList<>();
    private String command;
    private String params;
    private String output;
    private String echoNotFound;
    private String touchError;

    public void execute(String commandLine) {
        String[] arrCommandLine = commandLine.split(" ");
        int lengthArr = arrCommandLine.length;

        if(files.size() == 0){
            params = arrCommandLine[lengthArr - 1];
            command = arrCommandLine[0];
            files.add(new MyFile(arrCommandLine[lengthArr - 1]));
        }else {
            for (MyFile file : files) {
                boolean stop = false;
                if (commandLine.equals("exit")) {
                    command = commandLine;
                    params = "";
                    break;
                } else if (file.getName().equals(arrCommandLine[lengthArr - 1])) {
                    switch (arrCommandLine[0]) {
                        case "touch":
                            output = "File " + arrCommandLine[lengthArr - 1] + " Already Exist";
                            System.out.println(getOutput());
                            stop = true;
                            break;
                        case "echo":
                            command = arrCommandLine[0];
                            params = "";
                            for (int i = 1; i < arrCommandLine.length; i++) {
                                if (i + 1 == arrCommandLine.length) {
                                    params += arrCommandLine[i];
                                } else {
                                    params += arrCommandLine[i] + ' ';
                                }
                            }
                            todoEcho(arrCommandLine, lengthArr, file);
                            stop = true;
                            break;
                        case "cat":
                            command = "cat";
                            output = file.getContent();
                            System.out.println(output);
                            stop = true;
                            break;
                    }
                    if (stop) break;
                } else {
                    switch (arrCommandLine[0]) {
                        case "echo":
                            output = "File " + arrCommandLine[lengthArr - 1] + " Not Found";
                            System.out.println(getOutput());
                            stop = true;
                            break;
                        case "touch":
                            params = arrCommandLine[lengthArr - 1];
                            command = arrCommandLine[0];
                            files.add(new MyFile(arrCommandLine[lengthArr - 1]));
                            stop = true;
                            break;
                        case "exit":
                            command = arrCommandLine[0];
                            params = "";
                            stop = true;
                            break;
                    }

                    if (stop) break;
                }
            }
        }
    }

    public void todoEcho(String[] arrStr, int lengthArr, MyFile file){
        boolean insertSet = false;
        if (arrStr[lengthArr-2].equals(">")) {
            insertSet = true;
        }
        String text = "" ;
        arrStr[0] = "";
        arrStr[lengthArr - 2] = "";
        arrStr[lengthArr - 1] = "";

        for (int i = 1; i < lengthArr-2; i ++) {
            if(i + 1 == lengthArr-2){
                text += arrStr[i].replace("\"", "");
            } else {
                text += arrStr[i].replace("\"", "") + ' ';
            }
        }

        if (insertSet){
            file.setContent(text);
        } else{
            file.appendContent(text);
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

    public String getEchoNotFound() {
        return echoNotFound;
    }

    public String getTouchError() {
        return touchError;
    }
}
