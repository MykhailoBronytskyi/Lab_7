package facebook;

import user.User;


public class MyFacebookUser implements User {
    private FacebookUser user;

    public MyFacebookUser(FacebookUser user){
        this.user = user;
    }

    @Override
    public String getCountry() {
        return this.user.getUserCountry();
    }

    @Override
    public String getEmail() {
        return this.user.getEmail();
    }

    @Override
    public String getActiveTime() {
        return this.user.getUserActiveTime();
    }
}
