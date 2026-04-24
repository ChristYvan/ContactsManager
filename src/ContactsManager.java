/**
 * Classe principale du gestionnaire de contacts.
 *
 * Cette classe permet de :
 * - Stocker une liste de contacts
 * - Ajouter un contact via addContact()
 * - Rechercher un contact par son nom via searchContact()
 *
 * Elle contient également la méthode main() pour tester le programme.
 */
public class ContactsManager {

    // Tableau pour stocker les contacts (capacité maximale : 100)
    private Contact[] contacts;

    // Nombre actuel de contacts dans le tableau
    private int size;

    /**
     * Constructeur par défaut.
     * Initialise un tableau vide pouvant contenir jusqu'à 100 contacts.
     */
    public ContactsManager() {
        contacts = new Contact[100];
        size = 0;
    }

    /**
     * Ajoute un contact à la liste.
     * Le contact est placé à la prochaine position disponible dans le tableau.
     *
     * @param contact Le contact à ajouter
     */
    public void addContact(Contact contact) {
        if (size < contacts.length) {
            contacts[size] = contact;
            size++;
            System.out.println("✔ Contact ajouté : " + contact.name);
        } else {
            System.out.println("❌ Le gestionnaire est plein. Impossible d'ajouter " + contact.name);
        }
    }

    /**
     * Recherche un contact par son nom.
     * La recherche est sensible à la casse (majuscules/minuscules).
     *
     * @param name Le nom du contact à rechercher
     * @return Le contact correspondant, ou null s'il n'est pas trouvé
     */
    public Contact searchContact(String name) {
        // On parcourt tous les contacts enregistrés
        for (int i = 0; i < size; i++) {
            if (contacts[i].name.equals(name)) {
                return contacts[i]; // Contact trouvé
            }
        }
        return null; // Aucun contact trouvé avec ce nom
    }

    /**
     * Affiche tous les contacts enregistrés dans le gestionnaire.
     */
    public void displayAllContacts() {
        System.out.println("\n--- Liste des contacts (" + size + ") ---");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + contacts[i]);
        }
        System.out.println("--------------------------------\n");
    }

    /**
     * Point d'entrée du programme.
     * Démontre l'utilisation du gestionnaire de contacts :
     * - Création de 5 contacts
     * - Ajout dans le gestionnaire
     * - Affichage de la liste
     * - Recherche d'un contact
     */
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
