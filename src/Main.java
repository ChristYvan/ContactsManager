public class Main {

    public static void main(String[] args) {

        // Création du gestionnaire de contacts
        ContactsManager myContactsManager = new ContactsManager();

        System.out.println("=== Gestionnaire de Contacts ===\n");

        // --- Ajout du contact 1 ---
        Contact c1 = new Contact();
        c1.name = "Akale Konan";
        c1.phoneNumber = "0601020304";
        myContactsManager.addContact(c1);

        // --- Ajout du contact 2 ---
        Contact c2 = new Contact();
        c2.name = "Kouadio Yao";
        c2.phoneNumber = "0705060708";
        myContactsManager.addContact(c2);

        // --- Ajout du contact 3 ---
        Contact c3 = new Contact();
        c3.name = "Ouattara Seydou";
        c3.phoneNumber = "0709101112";
        myContactsManager.addContact(c3);

        // --- Ajout du contact 4 ---
        Contact c4 = new Contact();
        c4.name = "Kone Aminata";
        c4.phoneNumber = "0513141516";
        myContactsManager.addContact(c4);

        // --- Ajout du contact 5 ---
        Contact c5 = new Contact();
        c5.name = "Akale Brou";
        c5.phoneNumber = "0117181920";
        myContactsManager.addContact(c5);

        // Affichage de tous les contacts
        myContactsManager.displayAllContacts();

        // --- Recherche d'un contact par nom ---
        String nomRecherche = "Kouadio Yao";
        System.out.println("🔍 Recherche du contact : " + nomRecherche);

        Contact found = myContactsManager.searchContact(nomRecherche);

        if (found != null) {
            System.out.println("✅ Contact trouvé !");
            System.out.println("   Nom       : " + found.name);
            System.out.println("   Téléphone : " + found.phoneNumber);
        } else {
            System.out.println("❌ Contact introuvable : " + nomRecherche);
        }

        // --- Test avec un contact inexistant ---
        String nomInconnu = "Diallo Inconnu";
        System.out.println("\n🔍 Recherche du contact : " + nomInconnu);
        Contact notFound = myContactsManager.searchContact(nomInconnu);

        if (notFound != null) {
            System.out.println("✅ Contact trouvé : " + notFound);
        } else {
            System.out.println("❌ Contact introuvable : " + nomInconnu);
        }
    }
}