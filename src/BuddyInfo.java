public class BuddyInfo {

    private final static String DEFAULT_NAME = "Chase";
    private final static String DEFAULT_ADDRESS = "12345 bob road";
    private final static int DEFAULT_NUMBER = 1234;

    private final String name;
    private String address;
    private int number;


    public BuddyInfo(String name, String address, int number) {

        this.name = name;
    }

    public BuddyInfo() {
        this(DEFAULT_NAME, DEFAULT_ADDRESS, DEFAULT_NUMBER);
    }


    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer Simpson", "123 Springfield", 12344);
        System.out.println("hello");
        System.out.println(buddy.getName());
    }
}