package newui;


public abstract class UserProfile {
    public String username;
    public String address;
    public String email;

    public UserProfile(String username, String address, String email) {
        this.username = username;
        this.address = address;
        this.email = email;
    }
  
}