package twitter;

import user.User;

public class MyTwitterUser implements User {
    private TwitterUser user;

    public MyTwitterUser(TwitterUser user){
        this.user = user;
    }

    @Override
    public String getCountry() {
        return this.user.getCountry();
    }

    @Override
    public String getEmail() {
        return this.user.getUserMail();
    }

    @Override
    public String getActiveTime() {
        return this.user.getLastActiveTime();
    }
}
