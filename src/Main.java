public class Main {
    public static void main(String[] args) {

        ContactsManager myContactsManager = new ContactsManager();

        Contact c1 = new Contact();
        c1.name = "Cheick";
        c1.phoneNumber = "0102030405";
        myContactsManager.addContact(c1);

        Contact c2 = new Contact();
        c2.name = "Noela";
        c2.phoneNumber = "0607080910";
        myContactsManager.addContact(c2);

        Contact c3 = new Contact();
        c3.name = "Jean";
        c3.phoneNumber = "0611223344";
        myContactsManager.addContact(c3);

        Contact c4 = new Contact();
        c4.name = "Aliou";
        c4.phoneNumber = "0755667788";
        myContactsManager.addContact(c4);

        Contact c5 = new Contact();
        c5.name = "Brice";
        c5.phoneNumber = "0699887766";
        myContactsManager.addContact(c5);

        try {
            Contact trouve = myContactsManager.searchContact("Jean");

            if (trouve == null) {
                System.out.println("Contact introuvable !");
            } else {
                System.out.println("Numéro de Jean : " + trouve.phoneNumber);
            }

        } catch (Exception e) {
            System.out.println("Une erreur s'est produite : " + e.getMessage());
        }
    }
}