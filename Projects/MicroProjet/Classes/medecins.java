package Classes;

import java.util.ArrayList;
import java.util.List;

public class medecins {

	private int id;
	private int version;
	private String titre;
	private String nom;
	private String prenom;
	private List<Creneaux> ListeCreneaux = new ArrayList<>();

	public medecins(int id, int version, String titre, String nom, String prenom, List<Creneaux> listeCreneaux) {

		super();
		this.id = id;
		this.version = version;
		this.titre = titre;
		this.nom = nom;
		this.prenom = prenom;
		ListeCreneaux = listeCreneaux;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Creneaux> getListeCreneaux() {
		return ListeCreneaux;
	}

	public void setListeCreneaux(List<Creneaux> listeCreneaux) {
		ListeCreneaux = listeCreneaux;
	}

	@Override
	public String toString() {
		return "Medecin [id=" + id + ", version=" + version + ", titre=" + titre + ", nom=" + nom + ", prenom=" + prenom + ", ListeCreneaux=" + ListeCreneaux + "]";
	}

}
