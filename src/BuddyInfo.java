public class BuddyInfo {

    private String name;
    private String address;
    private int PhoneNumber;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public BuddyInfo(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.PhoneNumber = phoneNumber;
    }
    public BuddyInfo() {
        this("Default Name", "Default Address", 9110);
    }



    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", "19 Homerson St", 51311043);
        System.out.println("Hello " + buddy.getName());
    }
}
