package FinalWork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileSave {
    private String User;
    private String LastUserName;
    private String UserFileName = View.LastName + ".txt";
    public FileSave(String user, String LastName){
        this.User = user;
        this.LastUserName = LastName;
    }
    public void ChooseSave(){
        File file = new File(UserFileName);
        if(isFileExist(file)) OverWriting();
        else NewSaveFile();
    }
    private static boolean isFileExist(File file){
        return file.exists();
    }
    private void OverWriting(){
        try(FileWriter writer = new FileWriter (UserFileName, true)){
            writer.write(User);
            System.out.println("Файл перезаписан");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
    public void NewSaveFile(){
        try(FileWriter writer = new FileWriter (UserFileName, false)){
            writer.write(User);
            System.out.println("Создан новый файл");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
