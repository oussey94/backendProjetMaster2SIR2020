package com.mbodji.BackEndJEE.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mandataire {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMandataire;
    private String civiliteMandataire;
    private String denominationMandataire;
    private String fonctionMandataire;
    private String entrepriseMandataire;
    private String adresseMandataire;
    private String compteDeMandataire;
    private String typeMandatMandataire;
    
	public Mandataire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mandataire(String civiliteMandataire, String denominationMandataire, String fonctionMandataire,
			String entrepriseMandataire, String adresseMandataire, String compteDeMandataire,
			String typeMandatMandataire) {
		super();
		this.civiliteMandataire = civiliteMandataire;
		this.denominationMandataire = denominationMandataire;
		this.fonctionMandataire = fonctionMandataire;
		this.entrepriseMandataire = entrepriseMandataire;
		this.adresseMandataire = adresseMandataire;
		this.compteDeMandataire = compteDeMandataire;
		this.typeMandatMandataire = typeMandatMandataire;
	}
	public Long getIdMandataire() {
		return idMandataire;
	}
	public void setIdMandataire(Long idMandataire) {
		this.idMandataire = idMandataire;
	}
	public String getCiviliteMandataire() {
		return civiliteMandataire;
	}
	public void setCiviliteMandataire(String civiliteMandataire) {
		this.civiliteMandataire = civiliteMandataire;
	}
	public String getDenominationMandataire() {
		return denominationMandataire;
	}
	public void setDenominationMandataire(String denominationMandataire) {
		this.denominationMandataire = denominationMandataire;
	}
	public String getFonctionMandataire() {
		return fonctionMandataire;
	}
	public void setFonctionMandataire(String fonctionMandataire) {
		this.fonctionMandataire = fonctionMandataire;
	}
	public String getEntrepriseMandataire() {
		return entrepriseMandataire;
	}
	public void setEntrepriseMandataire(String entrepriseMandataire) {
		this.entrepriseMandataire = entrepriseMandataire;
	}
	public String getAdresseMandataire() {
		return adresseMandataire;
	}
	public void setAdresseMandataire(String adresseMandataire) {
		this.adresseMandataire = adresseMandataire;
	}
	public String getCompteDeMandataire() {
		return compteDeMandataire;
	}
	public void setCompteDeMandataire(String compteDeMandataire) {
		this.compteDeMandataire = compteDeMandataire;
	}
	public String getTypeMandatMandataire() {
		return typeMandatMandataire;
	}
	public void setTypeMandatMandataire(String typeMandatMandataire) {
		this.typeMandatMandataire = typeMandatMandataire;
	}
    
    

}
