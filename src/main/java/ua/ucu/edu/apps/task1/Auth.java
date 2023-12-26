package ua.ucu.edu.apps.task1;

public class Auth {
    public User login(){
        int n = 0;
        if (n > 0){
            return new MyTwitterUser(new TwitterUser());

        }else{
            return new MyFacebookUser(new FacebookUser());
        }
    }

    public void proccessData(User user){
            String country = user.getCountry();
    }
}
