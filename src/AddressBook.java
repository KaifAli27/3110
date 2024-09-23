import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddys;

    public AddressBook() {
        this.buddys = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            this.buddys.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < this.buddys.size()) {
            return this.buddys.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        BuddyInfo buddy1 = new BuddyInfo("Homer","19 Homerson St", 513311043);
        addressBook.addBuddy(buddy1);
        addressBook.removeBuddy(0);
        BuddyInfo buddy2 = new BuddyInfo("Hammy","24 Homerson St", 513311078);


        addressBook.addBuddy(buddy2);
        System.out.println("editing on git teggst");


        System.out.println("Address Book");
        System.out.println("Buddies in the address book:");
        for (BuddyInfo buddy : addressBook.buddys) {
            System.out.println(buddy.getName());
        }

        BuddyInfo buddy3 = new BuddyInfo("Tom","Carleton",613);
        AddressBook addressBook1 = new AddressBook();
        addressBook1.addBuddy(buddy3);
        for (BuddyInfo buddy : addressBook1.buddys) {
            System.out.println(buddy.getName());
        }
    }
}
