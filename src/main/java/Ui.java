import java.util.Scanner;

/**
 * Ui class handles the bot's response to the user's input.
 */
public class Ui {
    public Ui() {

    }

    /**
     * Function called when there is error loading the file.
     */
    public void showLoadingError() {
        System.out.println("There is an error in loading the file.");
    }

    /**
     * Displays welcome message at the start of the program.
     */
    public String welcome() {
        /*String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Greetings from\n" + logo);
        System.out.println("Is that anything that I can do for you?");*/
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        String greetings = "Greetings from\n" + logo + "Is there anything that I can do for you?";
        return greetings;
    }

    /**
     * Reads the command that the user input.
     * @return Command that the user typed.
     */
    public String readCommand() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    /**
     * Prints marking task as done.
     * @param t List of tasks.
     * @param num Task number.
     */
    public String printMarkDone(TaskList t, int num) {
        //System.out.println("Got it. I've marked task #" + num + ": 「" + t.getDukeList().get(num - 1) + "」 as done.");
        //System.out.println("You currently have " + t.getSize() + " task(s) in your list.");
        String msg = "Got it. I've marked task #" + num + ": 「" + t.getDukeList().get(num - 1) + "」 as done." + "\n"
                + "You currently have " + t.getSize() + " task(s) in your list.";
        return msg;
    }

    /**
     * Prints the task that is being added into tasks list.
     * @param tList List of tasks.
     * @param t Specific task.
     */
    public String printTaskAdded(TaskList tList, Task t) {
        //System.out.println("Got it. I've added 「" + t + "」 to your task(s).");
        //System.out.println("You currently have " + tList.getSize() + " task(s) in your list.");
        String msg = "Got it. I've added 「" + t + "」 to your task(s)." + "\n"
                + "You currently have " + tList.getSize() + " task(s) in your list.";
        return msg;
    }

    /**
     * Prints the task that is being removed from the tasks list.
     * @param t List of tasks.
     * @param num Number in the list to be removed.
     */
    /*public void printTaskRemoved(TaskList t, int num) {
        System.out.println("Got it. I've removed task #" + num + ": 「" + t.getDukeList().get(num - 1) + "」.");
        System.out.println("You currently have " + (t.getSize()-1) + " task(s) in your list.");
    }*/
    public String printTaskRemoved(Task t, int num, TaskList taskList) {
        String msg = "Got it. I've removed task #" + num + ": 「" + t + "」." + "\n"
                + "You currently have " + taskList.getSize() + " task(s) in your list.";
        return msg;
        //System.out.println("Got it. I've removed task #" + num + ": 「" + t + "」.");
        //System.out.println("You currently have " + taskList.getSize() + " task(s) in your list.");
    }

    /**
     * Prints the task according to the keyword.
     * @param list List of matching tasks.
     * @param keyword Keyword entered by the user.
     */
    public String printMatchingTask(String list, String keyword) {
        if (list.equals("")) {
            return "We have found nothing related to your search.";
            //System.out.println("We have found nothing related to your search.");
        } else {
            String msg = "Here are some matching tasks in your list: 「" + keyword + "」" + "\n" +
                    list;
            //System.out.println("Here are some matching tasks in your list: 「" + keyword + "」");
            //System.out.println(list);
            return msg;
        }
    }

    /**
     * Prints goodbye message to the user.
     */
    public String goodbye() {
        //System.out.println("さらbye. Hope to see you again soon! ( ﾟ▽ﾟ)/");
        return "さらbye. Hope to see you again soon! ( ﾟ▽ﾟ)/";
    }

}