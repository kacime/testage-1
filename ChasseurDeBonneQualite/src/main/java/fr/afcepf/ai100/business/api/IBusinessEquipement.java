package fr.afcepf.ai100.business.api;

import java.util.List;

import fr.afcepf.ai100.entity.ChasseurDePrime;
import fr.afcepf.ai100.entity.Equipement;
import fr.afcepf.ai100.exception.AttributionException;
import fr.afcepf.ai100.exception.EquipementMaxException;

/**
 * Interface proposant les m�thodes du business Equipement.
 *
 * @author Stagiaire
 *
 */
public interface IBusinessEquipement {

    /**
     * Permet d'attribuer un Equipement � un ChasseurDePrime si celui-ci ne
     * porte pas d�j� plus de trois �quipements.
     *
     * @param pEquipement
     *            l'Equipement a attribuer
     * @param pChasseurDePrime
     *            le ChasseurDePrime qui veut porter l'Equipement.
     * @return l'Equipement avec l'id de son pocesseur modifi�.
     * @throws EquipementMaxException
     *             lev�e si la capacit� maximum de portage du chasseur de prime
     *             est atteinte.
     * @throws AttributionException
     *             lev�e si l'attribution ne se passe pas correctement.
     */
    Equipement attribuerEquipement(Equipement pEquipement,
            ChasseurDePrime pChasseurDePrime)
            throws EquipementMaxException, AttributionException;

    /**
     * Supprime l'�quipement d�sign� par son id de la base.
     *
     * @param pIdEquipement
     *            id de l'�quipement � supprimer.
     */
    void supprimerEquipement(int pIdEquipement);

    /**
     * Recherche des equipement par nom semblable.
     *
     * @param pNom
     *            : le nom ressemblant au nom des �quipements.
     * @return la liste des �quipements dont le nom match avec le pNom.
     */
    List<Equipement> rechercherEquipement(String pNom);

    /**
     * R�cup�re les �quipements du ChasseurDePrime.
     *
     * @param pChasseurDePrime
     *            le ChasseurDePrime dont on veut les Equipement.
     * @return les Equipement du ChasseurDePrime.
     */
    List<Equipement> rechercherEquipementParIdChasseurDePrime(
            ChasseurDePrime pChasseurDePrime);

}
