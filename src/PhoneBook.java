import java.util.ArrayList;

class PhoneBookEntry {
    private String name;
    private String phoneNumber;
    
    public PhoneBookEntry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber;
    }
}

public class PhoneBook {
    public static void main(String[] args) {
        ArrayList<PhoneBookEntry> phoneBook = new ArrayList<>();
        
        phoneBook.add(new PhoneBookEntry("Ahmed", "03330000000"));
        phoneBook.add(new PhoneBookEntry("Ali", "03340000000"));
        
        for (PhoneBookEntry entry : phoneBook) {
            System.out.println(entry);
        }
    }
}
