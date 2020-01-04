public class Main {

    public static void main(String [] args) {
        ContactsManager myContactsManager = new ContactsManager();

        // create and add new contact
        Contact sally = new Contact();
        sally.name = "Sally";
        sally.email = "sally@email.com";
        sally.phoneNumber = "0176345678";
        myContactsManager.addContact(sally);

        // create and add new contact
        Contact tom = new Contact();
        tom.name = "Tom";
        tom.email = "tom@email.com";
        tom.phoneNumber = "0170123456";
        myContactsManager.addContact(tom);

        // create and add new contact
        Contact ruth = new Contact();
        ruth.name = "Ruth";
        ruth.email = "ruth@email.com";
        ruth.phoneNumber = "0150987654";
        myContactsManager.addContact(ruth);

        // search for a contact and print out phone number
        Contact myContact = myContactsManager.searchContact("Ruth");
        System.out.println(myContact.phoneNumber);
    }
}
