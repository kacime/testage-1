package fr.afcepf.ai100.entity;

/**
 * Classe entit� correspondant � la table equipement.
 *
 * @author Stagiaire
 *
 */
public class Equipement {

    /**
     * Id de l'�quipement dans la bdd.
     */
    private int idEquipement;

    /**
     * Nom de l'�quipement.
     */
    private String nom;
    /**
     *id du chasseur de prime portant l'�quipement.
     */
    private int idChasseurDePrime;

    /**
     * Getter de l'id de l'�quipement.
     * @return l'id de l'�quipement.
     */
    public int getIdEquipement() {
        return idEquipement;
    }
    /**
     * Setter de l'id de l'�quipement.
     * @param pIdEquipement nouvel id de l'�quipement.
     */
    public void setIdEquipement(int pIdEquipement) {
        idEquipement = pIdEquipement;
    }

    /**
     * Getter du nom de l'�quipement.
     * @return le nom de l'�quipement.
     */
    public String getNom() {
        return nom;
    }
    /**
     * Setter du nom de l'�quipement.
     * @param pNom nouveau nom de l'�quipement.
     */
    public void setNom(String pNom) {
        nom = pNom;
    }
    /**
     * Getter du nom du chasseur de prime qui poc�de de l'�quipement.
     * @return l'id du chasseur de prime qui a l'�quipement.
     */
    public int getIdChasseurDePrime() {
        return idChasseurDePrime;
    }
    /**
     * Setter de l'id du chasseur de prime qui poc�de l'�quipement.
     * @param pIdChasseurDePrime l'id du nouveau pocesseur.
     */
    public void setIdChasseurDePrime(int pIdChasseurDePrime) {
        idChasseurDePrime = pIdChasseurDePrime;
    }
    /**
     * Constructeur.
     * @param pIdEquipement id de l'�quipement.
     * @param pNom nom de l'�quipement.
     * @param pIdChasseurDePrime id du pocesseur de l'�quipement.
     */
    public Equipement(int pIdEquipement, String pNom, int pIdChasseurDePrime) {
        super();
        idEquipement = pIdEquipement;
        nom = pNom;
        idChasseurDePrime = pIdChasseurDePrime;
    }
    /**
     * Constructeur.
     * @param pIdEquipement id de l'�quipement.
     * @param pNom nom de l'�quipement.
     */
    public Equipement(int pIdEquipement, String pNom) {
        super();
        idEquipement = pIdEquipement;
        nom = pNom;
    }
    /**
     * Constructeur.
     * @param pNom nom de l'�quipement.
     */
    public Equipement(String pNom) {
        nom = pNom;
    }
}
