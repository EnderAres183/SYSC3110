import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddys;

    public AddressBook() {
        this.buddys = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo bud) {
        buddys.add(bud);
    }

    public void removeBuddy(BuddyInfo bud) {
        buddys.remove(bud);
    }


    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        System.out.println("hello world");
    }

}
