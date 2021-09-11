package duke.ui;

public class Ui {
    public static void showDukeWelcome(){
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo +
                "What can I do for you?\n"
                + "Type \"Help\" for list of helpful commands!\n");
    }

    public static void showBreakLine(){
        System.out.println("____________________________________________________________");
    }

    public static void showExit(){
        System.out.println("Bye. Hope to see you again soon!");
    }
}
