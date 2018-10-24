package com.newtours.model;

public class RegisterData {
	
	/*public String[] values() {
	String[] values = {/--Todos los atributos aca--/};
	return values;
	
}*/
	
	private String nombre;
	private String apellido;
	private String phone;
	private String email;
	
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String postal_cod;
	private String country;
	
	private String userName;
	private String pass;
	private String conf_pass;
	
	public RegisterData(String nombre, String apellido, String phone, String email, String address1, String address2,
			String city, String state, String postal_cod, String country, String userName, String pass,
			String conf_pass) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.phone = phone;
		this.email = email;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.postal_cod = postal_cod;
		this.country = country;
		this.userName = userName;
		this.pass = pass;
		this.conf_pass = conf_pass;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostal_cod() {
		return postal_cod;
	}
	public void setPostal_cod(String postal_cod) {
		this.postal_cod = postal_cod;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getConf_pass() {
		return conf_pass;
	}
	public void setConf_pass(String conf_pass) {
		this.conf_pass = conf_pass;
	}	

}
