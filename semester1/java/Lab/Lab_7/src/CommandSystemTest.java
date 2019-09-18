import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandSystemTest {

    @Test
    void test_executeTouch() {
        CommandSystem system = new CommandSystem();
        system.execute("touch file-name");
        assertEquals("touch", system.getCommand());
        assertEquals("file-name", system.getParams());
    }

    @Test
    void test_executeEcho() {
        CommandSystem system = new CommandSystem();
        system.execute("echo \"text\" > file-name");
        assertEquals("echo", system.getCommand());
        assertEquals("\"text\" > file-name", system.getParams());
        system.execute("echo \"text\" >> file-name");
        assertEquals("echo", system.getCommand());
        assertEquals("\"text\" >> file-name", system.getParams());
    }

    @Test
    void test_executeExit() {
        CommandSystem system = new CommandSystem();
        system.execute("exit");
        assertEquals("exit", system.getCommand());
        assertEquals("", system.getParams());
    }

    @Test
    void test_commandCat() {
        CommandSystem system = new CommandSystem();
        system.execute("touch readme.md");
        system.execute("echo TEXT > readme.md");
        system.execute("cat readme.md");
        assertEquals("TEXT", system.getOutput());
    }

    @Test
    void test_echoOverrideName(){
        CommandSystem system = new CommandSystem();
        system.execute("touch readme.md");
        system.execute("echo TEXT > readme1.md");
        assertEquals("File readme1.md Not Found", system.getOutput());
    }

    @Test
    void test_touchAgain(){
        CommandSystem system = new CommandSystem();
        system.execute("touch readme.md");
        system.execute("touch readme.md");
        assertEquals("File readme.md Already Exist", system.getOutput());
    }
}