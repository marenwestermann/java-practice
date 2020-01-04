public class ContactsManager {

    // fields
    Contact [] myFriends;
    int friendsCount;

    // constructor
    ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }
    // method for adding contacts
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    //method for searching for contacts
    Contact searchContact(String searchName) {
        for(int i=0; i < friendsCount; i++) {
            if(myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }
}
