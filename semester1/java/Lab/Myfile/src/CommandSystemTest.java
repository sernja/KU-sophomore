import org.junit.jupiter.api.Test;

import javax.swing.text.html.CSS;

import static org.junit.jupiter.api.Assertions.*;

class CommandSystemTest {
    @Test
    void test_executeTouch(){
        CommandSystem system = new CommandSystem();
        system.execute(("touch file-name"));
        assertEquals("touch", system.getCommand());
        assertEquals("file-name", system.getParams());
    }

    @Test
    void test_executeEcho(){
        CommandSystem system = new CommandSystem();
        system.execute("echo \"text\" > file-name");
        assertEquals("echo", system.getCommand());
        assertEquals("\"text\" > file-name", system.getParams());
        system.execute("echo \"text\" >> file-name");
        assertEquals("echo", system.getCommand());
        assertEquals("\"text\" >> file-name", system.getParams());
    }

    @Test
    void test_executeExit(){
        CommandSystem system = new CommandSystem();
        system.execute("exit");
        assertEquals("exit", system.getCommand());
        assertEquals("", system.getParams());
    }

    @Test
    void test_commandCat(){
        CommandSystem system = new CommandSystem();
        system.execute("touch readme.md");
        system.execute("echo TEXT > readme.md");
        system.execute("cat readme.md");
        assertEquals("TEXT", system.getOutput());
    }
}