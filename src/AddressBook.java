import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddys = new ArrayList<>();

    public void addBuddy(BuddyInfo buddy) {
        buddys.add(buddy);
    }

    public void removeBuddy(int index) {
        buddys.remove(index);
    }


    public static void main(String[] args) {
        System.out.println("Address Book");
    }

}
