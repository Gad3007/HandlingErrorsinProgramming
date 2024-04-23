package FinalWork;

public class Controller {

    private String UserDate;


    public void GetDate() {
        View view = new View();
        view.UserInputFIO("Фамилия");
        view.UserInputFIO("Имя");
        view.UserInputFIO("Отчество");

        view.UserHappyBD("Дата");
        view.UserHappyBD("Месяц");
        view.UserHappyBD("Год");

        view.UserNumberPhone();
        view.UserSex();
    }

    @Override
    public String toString() {
        return "Пользователь: {" +
                View.LastName + " " + View.FirstName + " " + View.MiddleName + " " +
                View.HappyBD + " " + View.NumberPhone + " " + View.Sex +
                "}" + '\n';
    }
}