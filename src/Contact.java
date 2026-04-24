/**
 * Classe représentant un contact avec un nom et un numéro de téléphone.
 * Un contact est une entité simple du gestionnaire de contacts.
 */
public class Contact {

    // Nom du contact
    public String name;

    // Numéro de téléphone du contact
    public String phoneNumber;

    /**
     * Constructeur par défaut.
     * Crée un contact vide (nom et numéro non définis).
     */
    public Contact() {
        this.name = "";
        this.phoneNumber = "";
    }

    /**
     * Constructeur avec paramètres.
     * Permet de créer un contact directement avec ses informations.
     *
     * @param name        Le nom du contact
     * @param phoneNumber Le numéro de téléphone du contact
     */
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Retourne une représentation textuelle du contact.
     * Utile pour l'affichage dans la console.
     *
     * @return Une chaîne au format "Nom : ... | Téléphone : ..."
     */
    @Override
    public String toString() {
        return "Nom : " + name + " | Téléphone : " + phoneNumber;
    }
}
