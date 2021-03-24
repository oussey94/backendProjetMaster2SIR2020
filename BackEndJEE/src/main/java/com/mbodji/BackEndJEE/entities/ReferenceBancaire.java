package com.mbodji.BackEndJEE.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReferenceBancaire {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReferenceBancaire;
    private String banqueReferenceBancaire;
    private String codeBanqueReferenceBancaire;
    private double codeguichetReferenceBancaire;
    private double numCompteReferenceBancaire;
    private double cleReferenceBancaire;
	public ReferenceBancaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReferenceBancaire(String banqueReferenceBancaire, String codeBanqueReferenceBancaire,
			double codeguichetReferenceBancaire, double numCompteReferenceBancaire, double cleReferenceBancaire) {
		super();
		this.banqueReferenceBancaire = banqueReferenceBancaire;
		this.codeBanqueReferenceBancaire = codeBanqueReferenceBancaire;
		this.codeguichetReferenceBancaire = codeguichetReferenceBancaire;
		this.numCompteReferenceBancaire = numCompteReferenceBancaire;
		this.cleReferenceBancaire = cleReferenceBancaire;
	}
	public Long getIdReferenceBancaire() {
		return idReferenceBancaire;
	}
	public void setIdReferenceBancaire(Long idReferenceBancaire) {
		this.idReferenceBancaire = idReferenceBancaire;
	}
	public String getBanqueReferenceBancaire() {
		return banqueReferenceBancaire;
	}
	public void setBanqueReferenceBancaire(String banqueReferenceBancaire) {
		this.banqueReferenceBancaire = banqueReferenceBancaire;
	}
	public String getCodeBanqueReferenceBancaire() {
		return codeBanqueReferenceBancaire;
	}
	public void setCodeBanqueReferenceBancaire(String codeBanqueReferenceBancaire) {
		this.codeBanqueReferenceBancaire = codeBanqueReferenceBancaire;
	}
	public double getCodeguichetReferenceBancaire() {
		return codeguichetReferenceBancaire;
	}
	public void setCodeguichetReferenceBancaire(double codeguichetReferenceBancaire) {
		this.codeguichetReferenceBancaire = codeguichetReferenceBancaire;
	}
	public double getNumCompteReferenceBancaire() {
		return numCompteReferenceBancaire;
	}
	public void setNumCompteReferenceBancaire(double numCompteReferenceBancaire) {
		this.numCompteReferenceBancaire = numCompteReferenceBancaire;
	}
	public double getCleReferenceBancaire() {
		return cleReferenceBancaire;
	}
	public void setCleReferenceBancaire(double cleReferenceBancaire) {
		this.cleReferenceBancaire = cleReferenceBancaire;
	}
    
    
    

}
