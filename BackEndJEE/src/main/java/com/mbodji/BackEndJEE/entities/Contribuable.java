package com.mbodji.BackEndJEE.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Contribuable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContribuable;
    private String prenomContribuable;
    private String nomContribuable;
    private String civiliteContribuable;
    private String fonctionContribuable;
    private String emailContribuable;
    private double telephoneContribuable;
    private String representantContribuable;
    private String activateContribuable;
    private double adresseContribuable;
    private String voieContribuable;
    private String nomVoieContribuable;
    private String immeubleContribuable;
    private String cartierContribuable;
    private String communeContribuable;
    private double boitePostaleContribuable;
    private double nineaContribuable;
    private double cofiContribuable;
    private String centreContribuable;
    
  /*  
	public Contribuable() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Contribuable(String prenomContribuable, String nomContribuable, String civiliteContribuable,
			String fonctionContribuable, String emailContribuable, double telephoneContribuable,
			String representantContribuable, String activateContribuable, double adresseContribuable,
			String voieContribuable, String nomVoieContribuable, String immeubleContribuable,
			String cartierContribuable, String communeContribuable, double boitePostaleContribuable,
			double nineaContribuable, double cofiContribuable, String centreContribuable) {
		super();
		this.prenomContribuable = prenomContribuable;
		this.nomContribuable = nomContribuable;
		this.civiliteContribuable = civiliteContribuable;
		this.fonctionContribuable = fonctionContribuable;
		this.emailContribuable = emailContribuable;
		this.telephoneContribuable = telephoneContribuable;
		this.representantContribuable = representantContribuable;
		this.activateContribuable = activateContribuable;
		this.adresseContribuable = adresseContribuable;
		this.voieContribuable = voieContribuable;
		this.nomVoieContribuable = nomVoieContribuable;
		this.immeubleContribuable = immeubleContribuable;
		this.cartierContribuable = cartierContribuable;
		this.communeContribuable = communeContribuable;
		this.boitePostaleContribuable = boitePostaleContribuable;
		this.nineaContribuable = nineaContribuable;
		this.cofiContribuable = cofiContribuable;
		this.centreContribuable = centreContribuable;
	}


	public Long getIdContribuable() {
		return idContribuable;
	}


	public void setIdContribuable(Long idContribuable) {
		this.idContribuable = idContribuable;
	}


	public String getPrenomContribuable() {
		return prenomContribuable;
	}


	public void setPrenomContribuable(String prenomContribuable) {
		this.prenomContribuable = prenomContribuable;
	}


	public String getNomContribuable() {
		return nomContribuable;
	}


	public void setNomContribuable(String nomContribuable) {
		this.nomContribuable = nomContribuable;
	}


	public String getCiviliteContribuable() {
		return civiliteContribuable;
	}


	public void setCiviliteContribuable(String civiliteContribuable) {
		this.civiliteContribuable = civiliteContribuable;
	}


	public String getFonctionContribuable() {
		return fonctionContribuable;
	}


	public void setFonctionContribuable(String fonctionContribuable) {
		this.fonctionContribuable = fonctionContribuable;
	}


	public String getEmailContribuable() {
		return emailContribuable;
	}


	public void setEmailContribuable(String emailContribuable) {
		this.emailContribuable = emailContribuable;
	}


	public double getTelephoneContribuable() {
		return telephoneContribuable;
	}


	public void setTelephoneContribuable(double telephoneContribuable) {
		this.telephoneContribuable = telephoneContribuable;
	}


	public String getRepresentantContribuable() {
		return representantContribuable;
	}


	public void setRepresentantContribuable(String representantContribuable) {
		this.representantContribuable = representantContribuable;
	}


	public String getActivateContribuable() {
		return activateContribuable;
	}


	public void setActivateContribuable(String activateContribuable) {
		this.activateContribuable = activateContribuable;
	}


	public double getAdresseContribuable() {
		return adresseContribuable;
	}


	public void setAdresseContribuable(double adresseContribuable) {
		this.adresseContribuable = adresseContribuable;
	}


	public String getVoieContribuable() {
		return voieContribuable;
	}


	public void setVoieContribuable(String voieContribuable) {
		this.voieContribuable = voieContribuable;
	}


	public String getNomVoieContribuable() {
		return nomVoieContribuable;
	}


	public void setNomVoieContribuable(String nomVoieContribuable) {
		this.nomVoieContribuable = nomVoieContribuable;
	}


	public String getImmeubleContribuable() {
		return immeubleContribuable;
	}


	public void setImmeubleContribuable(String immeubleContribuable) {
		this.immeubleContribuable = immeubleContribuable;
	}


	public String getCartierContribuable() {
		return cartierContribuable;
	}


	public void setCartierContribuable(String cartierContribuable) {
		this.cartierContribuable = cartierContribuable;
	}


	public String getCommuneContribuable() {
		return communeContribuable;
	}


	public void setCommuneContribuable(String communeContribuable) {
		this.communeContribuable = communeContribuable;
	}


	public double getBoitePostaleContribuable() {
		return boitePostaleContribuable;
	}


	public void setBoitePostaleContribuable(double boitePostaleContribuable) {
		this.boitePostaleContribuable = boitePostaleContribuable;
	}


	public double getNineaContribuable() {
		return nineaContribuable;
	}


	public void setNineaContribuable(double nineaContribuable) {
		this.nineaContribuable = nineaContribuable;
	}


	public double getCofiContribuable() {
		return cofiContribuable;
	}


	public void setCofiContribuable(double cofiContribuable) {
		this.cofiContribuable = cofiContribuable;
	}


	public String getCentreContribuable() {
		return centreContribuable;
	}


	public void setCentreContribuable(String centreContribuable) {
		this.centreContribuable = centreContribuable;
	}
	*/
	
    

}
