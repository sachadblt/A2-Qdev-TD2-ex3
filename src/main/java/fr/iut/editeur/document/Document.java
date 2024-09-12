package fr.iut.editeur.document;

/**
 * La classe Document représente un texte éditable avec diverses fonctionnalités
 * comme ajouter du texte, le remplacer ou le convertir en majuscules.
 */
public class Document {

    /**
     * Texte contenu dans le document.
     */
    private String texte;

    /**
     * Constructeur par défaut qui initialise un document vide.
     */
    public Document() {
        this.texte = "";
    }

    /**
     * Obtient le texte contenu dans le document.
     *
     * @return le texte du document
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Définit le texte contenu dans le document.
     *
     * @param texte le texte à définir
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Ajoute du texte à la fin du document.
     *
     * @param texte le texte à ajouter
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Retourne le texte complet du document sous forme de chaîne de caractères.
     *
     * @return le texte du document
     */
    @Override
    public String toString() {
        return this.texte;
    }

    /**
     * Remplace une partie du texte du document.
     *
     * @param debut l'index de début du texte à remplacer
     * @param fin l'index de fin du texte à remplacer
     * @param remplacement le texte qui remplacera l'ancien texte
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    /**
     * Convertit en majuscules une partie du texte.
     *
     * @param debut l'index de début du texte à convertir
     * @param fin l'index de fin du texte à convertir
     */
    public void majuscules(int debut, int fin) {
        String partie = texte.substring(debut, fin);
        partie = partie.toUpperCase();
        remplacer(debut, fin-1, partie);
    }

    /**
     * Efface une partie du texte du document.
     *
     * @param debut l'index de début du texte à effacer
     * @param fin l'index de fin du texte à effacer
     */
    public void effacer(int debut, int fin) {
        remplacer(debut, fin-1, "");
    }

    /**
     * Efface tout le texte du document.
     */
    public void clear(){
        texte=".";
    }
}
