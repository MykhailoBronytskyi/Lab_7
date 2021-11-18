package analytics;

public class DataBase extends БазаДаних{

    public String getUserData(){
        return отриматиДаніКористувача();
    }

    public String getStatisticData(){
        return отриматиСтатистичніДані();
    }
}
