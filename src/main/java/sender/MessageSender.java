package sender;

import facebook.FacebookUser;
import twitter.TwitterUser;
import user.User;

public class MessageSender {
    public boolean send(String text, User user, String country) {
        String message = "You have a message";

        String user_country = user.getCountry();
        String user_email = user.getEmail();
        String active_time = user.getActiveTime();

        System.out.println("Your active time is: " + active_time);
        if (active_time == "12.00") {
            System.out.println(user.getClass().getSimpleName() + "of" + user_country + "\n" +
                    "with email:" + user_email + "." + message);
            return true;
        }
        return false;
    }
}

