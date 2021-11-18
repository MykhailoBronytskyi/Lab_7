package facebook;

import org.junit.BeforeClass;
import twitter.MyTwitterUser;
import twitter.TwitterUser;

import static org.junit.jupiter.api.Assertions.*;

class FacebookUserTest {

    private FacebookUser facebook_user = new FacebookUser("random@gmail.com","USA","12.00");
    private TwitterUser twitter_user = new TwitterUser("other@gmail.com","Canada","11.00");

    private MyFacebookUser my_facebook_user = new MyFacebookUser(facebook_user);
    private MyTwitterUser my_twitter_user = new MyTwitterUser(twitter_user);

    @BeforeClass
    void setUp(){
        System.out.println("hello world!");
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        System.out.println(my_facebook_user.getEmail());

        assertEquals("random@gmail.com", my_facebook_user.getEmail());
        assertEquals(facebook_user.getEmail(), my_facebook_user.getEmail());


        System.out.println(my_twitter_user.getEmail());

        assertEquals("other@gmail.com", my_twitter_user.getEmail());
        assertEquals(twitter_user.getUserMail(), my_twitter_user.getEmail());
    }

    @org.junit.jupiter.api.Test
    void getUserCountry() {
        System.out.println(my_facebook_user.getCountry());

        assertEquals("USA", my_facebook_user.getCountry());
        assertEquals(facebook_user.getUserCountry(), my_facebook_user.getCountry());


        System.out.println(my_twitter_user.getCountry());

        assertEquals("Canada", my_twitter_user.getCountry());
        assertEquals(twitter_user.getCountry(), my_twitter_user.getCountry());
    }

    @org.junit.jupiter.api.Test
    void getUserActiveTime() {
        System.out.println(my_facebook_user.getActiveTime());

        assertEquals("12.00", my_facebook_user.getActiveTime());
        assertEquals(facebook_user.getUserActiveTime(), my_facebook_user.getActiveTime());


        System.out.println(my_twitter_user.getActiveTime());

        assertEquals("11.00", my_twitter_user.getActiveTime());
        assertEquals(twitter_user.getLastActiveTime(), my_twitter_user.getActiveTime());
    }
}