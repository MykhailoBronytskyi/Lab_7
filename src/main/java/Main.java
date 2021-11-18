import java.util.Date;

public class Main {
    public static void main(String[] args) {

        analytics.DataBase db = new analytics.DataBase();
        analytics.Авторизація авторизація = new analytics.Авторизація();

        if (авторизація.авторизуватися(db)) {
            reports.ReportBuilder br = new reports.ReportBuilder(db);
        }
        Date date = new Date();
        Date date_2 = new Date();

        System.out.println(date_2.getTime() +"\n"+ date.getTime());
        System.out.println(date_2+"\n"+date);
    }
}
