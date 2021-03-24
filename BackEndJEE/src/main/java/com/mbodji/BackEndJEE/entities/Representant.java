package com.mbodji.BackEndJEE.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Representant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRepresentant;
    private String prenomRepresentant;
    private String nomRepresentant;
    private String civiliteRepresentant;
    private String fonctionRepresentant;
    private String emailRepresentant;
    private double telephoneFixeRepresentant;
    private double posteRepresentant;
    private double telephoneMobileRepresentant;
    private String habilitationRepresentant;
	public Representant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Representant(String prenomRepresentant, String nomRepresentant, String civiliteRepresentant,
			String fonctionRepresentant, String emailRepresentant, double telephoneFixeRepresentant,
			double posteRepresentant, double telephoneMobileRepresentant, String habilitationRepresentant) {
		super();
		this.prenomRepresentant = prenomRepresentant;
		this.nomRepresentant = nomRepresentant;
		this.civiliteRepresentant = civiliteRepresentant;
		this.fonctionRepresentant = fonctionRepresentant;
		this.emailRepresentant = emailRepresentant;
		this.telephoneFixeRepresentant = telephoneFixeRepresentant;
		this.posteRepresentant = posteRepresentant;
		this.telephoneMobileRepresentant = telephoneMobileRepresentant;
		this.habilitationRepresentant = habilitationRepresentant;
	}
	public Long getIdRepresentant() {
		return idRepresentant;
	}
	public void setIdRepresentant(Long idRepresentant) {
		this.idRepresentant = idRepresentant;
	}
	public String getPrenomRepresentant() {
		return prenomRepresentant;
	}
	public void setPrenomRepresentant(String prenomRepresentant) {
		this.prenomRepresentant = prenomRepresentant;
	}
	public String getNomRepresentant() {
		return nomRepresentant;
	}
	public void setNomRepresentant(String nomRepresentant) {
		this.nomRepresentant = nomRepresentant;
	}
	public String getCiviliteRepresentant() {
		return civiliteRepresentant;
	}
	public void setCiviliteRepresentant(String civiliteRepresentant) {
		this.civiliteRepresentant = civiliteRepresentant;
	}
	public String getFonctionRepresentant() {
		return fonctionRepresentant;
	}
	public void setFonctionRepresentant(String fonctionRepresentant) {
		this.fonctionRepresentant = fonctionRepresentant;
	}
	public String getEmailRepresentant() {
		return emailRepresentant;
	}
	public void setEmailRepresentant(String emailRepresentant) {
		this.emailRepresentant = emailRepresentant;
	}
	public double getTelephoneFixeRepresentant() {
		return telephoneFixeRepresentant;
	}
	public void setTelephoneFixeRepresentant(double telephoneFixeRepresentant) {
		this.telephoneFixeRepresentant = telephoneFixeRepresentant;
	}
	public double getPosteRepresentant() {
		return posteRepresentant;
	}
	public void setPosteRepresentant(double posteRepresentant) {
		this.posteRepresentant = posteRepresentant;
	}
	public double getTelephoneMobileRepresentant() {
		return telephoneMobileRepresentant;
	}
	public void setTelephoneMobileRepresentant(double telephoneMobileRepresentant) {
		this.telephoneMobileRepresentant = telephoneMobileRepresentant;
	}
	public String getHabilitationRepresentant() {
		return habilitationRepresentant;
	}
	public void setHabilitationRepresentant(String habilitationRepresentant) {
		this.habilitationRepresentant = habilitationRepresentant;
	}
    
	

}
