package FinalWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.GetDate();
        String User = controller.toString();
        System.out.println(User);

        FileSave fileTxt = new FileSave(User, View.LastName);
        fileTxt.ChooseSave();
    }

}