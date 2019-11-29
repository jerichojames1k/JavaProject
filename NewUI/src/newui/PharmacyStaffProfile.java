package newui;

public abstract class PharmacyStaffProfile {
    public String username;
    public String address;
    public String email;

    public PharmacyStaffProfile(String username, String address, String email) {
        this.username = username;
        this.address = address;
        this.email = email;
    }
    abstract void viewmedicine();
    abstract void viewcustomer();
    abstract void viewcustomerorder();
}