package fr.afcepf.ai100.business.api;

import java.util.List;

import fr.afcepf.ai100.entity.ChasseurDePrime;
import fr.afcepf.ai100.exception.ChasseurDePrimeUniqueEnSonGenreException;

/**
 * Interface proposant les m�thodes du business ChasseurDePrime.
 *
 * @author Stagiaire
 *
 */
public interface IBusinessChasseurDePrime {

    /**
     * Ajoute un chasseur de prime dans la bdd.
     *
     * @param pChasseurDePrime
     *            le chasseur de prime � ajouter.
     * @return le chasseur de prime avec son id g�n�r�.
     * @throws ChasseurDePrimeUniqueEnSonGenreException
     *             si jamais le nom existe d�ja.
     */
    ChasseurDePrime ajouterChasseurDePrime(ChasseurDePrime pChasseurDePrime)
            throws ChasseurDePrimeUniqueEnSonGenreException;

    /**
     * Supprime le chasseur de prime d�sign� par son id de la bdd.
     *
     * @param pIdChasseurDePrime
     *            l'id du chasseur de prime � supprimer.
     */
    void supprimerChasseurDePrime(int pIdChasseurDePrime);

    /**
     * Recherche des chasseurs de prime par nom semblable � celui fourni.
     *
     * @param pNom
     *            : le nom de r�f�rence.
     * @return la liste des chasseurs de prime dont le nom match pNom.
     */
    List<ChasseurDePrime> rechercherChasseurDePrimeParNom(String pNom);

    /**
     * Recherche des chasseurs de prime dont le tarif est compris entre le tarif
     * bas et le tarif haut.
     *
     * @param pTarifBas
     *            le tarif minimum de la recherche.
     * @param pTarifHaut
     *            le tarif maximum de la recherche.
     * @return la liste des chasseurs de prime dont le tarif est compris entre
     *         pTarifHaut et pTarifBas.
     */
    List<ChasseurDePrime> rechercherChasseurDePrimeParTarif(float pTarifBas,
            float pTarifHaut);
}
