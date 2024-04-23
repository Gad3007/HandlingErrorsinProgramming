package FinalWork;

import Lesson3.task4.Cell;

import java.util.Arrays;
import java.util.Scanner;

public class View {
    static String LastName;
    static String FirstName;
    static String MiddleName;
    static String HappyBD;
    static long NumberPhone;
    static String Sex;




    public View(){
    }

    private String ScannerInput() {
        Scanner scanner = new Scanner(System.in);
        String Cell = scanner.nextLine();

        return Cell;
    }

    public void UserInputFIO(String FIO) {
        System.out.print("Введите " + FIO + ": ");
        String CellFIO = ScannerInput();
        boolean CheckCell = isNumeric(CellFIO);
        if(CheckCell) {
            while(CheckCell) {
                System.out.println("Вы ввели цифры, попробуйте еще раз");
                System.out.print("Введите " + FIO + ": ");
                CellFIO = ScannerInput();
                CheckCell = isNumeric(CellFIO);
            }
        }
        else {
            if(FIO.equals("Фамилия")) View.LastName = CellFIO;
            else if(FIO.equals("Имя")) View.FirstName = CellFIO;
            else View.MiddleName = CellFIO;
        }
    }


    public void UserHappyBD(String DMY) {
        System.out.print("Введите " + DMY + ": ");
        String CellDMY = ScannerInput();

        boolean CheckCell = isNumeric(CellDMY);
        int CellNum;
        if(CheckCell == false) {
            while (CheckCell == false) {
                System.out.println("Вы ввели буквы, попробуйте еще раз");
                System.out.print("Введите " + DMY + ": ");
                CellDMY = ScannerInput();
                CheckCell = isNumeric(CellDMY);
            }
        }
        else {
            CellNum = Integer.parseInt(CellDMY);
            if (DMY.equals("Дата")) {
                if(CellNum > 31 || CellNum < 1) {
                    while (CellNum > 31) {
                        System.out.println("Вы ввели не имеющуюся дату, попробуйте еще раз");
                        System.out.print("Введите " + DMY + ": ");
                        CellDMY = ScannerInput();
                        CellNum = Integer.parseInt(CellDMY);
                    }
                    while (CellNum < 1){
                        System.out.println("Вы ввели не имеющуюся дату, попробуйте еще раз");
                        System.out.print("Введите " + DMY + ": ");
                        CellDMY = ScannerInput();
                        CellNum = Integer.parseInt(CellDMY);
                    }
                }
                else View.HappyBD = CellNum + ".";
            }
            else if (DMY.equals("Месяц")) {

                if (CellNum > 12 || CellNum < 1) {
                    while (CellNum > 12) {
                        System.out.println("Вы ввели не имеющийся месяц, попробуйте еще раз");
                        System.out.print("Введите " + DMY + ": ");
                        CellDMY = ScannerInput();
                        CellNum = Integer.parseInt(CellDMY);
                    }
                    while (CellNum < 1) {
                        System.out.println("Вы ввели не имеющийся месяц, попробуйте еще раз");
                        System.out.print("Введите " + DMY + ": ");
                        CellDMY = ScannerInput();
                        CellNum = Integer.parseInt(CellDMY);
                    }
                } else View.HappyBD += CellDMY + ".";
            }
            else if(DMY.equals("Год")) {
                if (CellNum < 1) {
                    while (CellNum < 1) {
                        System.out.println("Вы ввели не имеющийся год, попробуйте еще раз");
                        System.out.print("Введите " + DMY + ": ");
                        CellDMY = ScannerInput();
                        CellNum = Integer.parseInt(CellDMY);
                    }
                }
                else View.HappyBD += CellDMY;

            }
        }
    }

    public void UserNumberPhone() {
        System.out.print("Введите номер телефона без +: ");
        String CellPhone = ScannerInput();

        if(CellPhone.length() > 10) {
            while(CellPhone.length() > 10) {
                System.out.println("Вы ввели некорректный номер (>10)");
                System.out.print("Введите номер телефона без +: ");
                CellPhone = ScannerInput();
            }
        }
        else if(CellPhone.length() < 10) {
            while (CellPhone.length() < 10) {
                System.out.println("Вы ввели некорректный номер (<10)");
                System.out.print("Введите номер телефона без +: ");
                CellPhone = ScannerInput();
            }
        }
        else {
            boolean CheckCell = isNumeric(CellPhone);
            if(CheckCell) View.NumberPhone = Long.parseLong(CellPhone);
            else System.out.println("Вы ввели буквы в номере телефона");
        }
    }

    public void UserSex() {
        System.out.print("Введите пол пользователя (f or m): ");
        String CellSex = ScannerInput().toLowerCase();

        if(CellSex.equals("f") || CellSex.equals("m")) {
            View.Sex = CellSex;
        } else {
            System.out.println("Вы ввели некорректное значение пола, попробуйте еще раз");
            UserSex();
        }
    }


    private static boolean isNumeric(String cell) {
        try {
            Long.parseLong(cell);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
