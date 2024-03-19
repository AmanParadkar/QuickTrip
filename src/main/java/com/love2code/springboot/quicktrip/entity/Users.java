package com.love2code.springboot.quicktrip.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class Users {

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="User_Name")
	private String userName;
	
	@Column(name="phone_No")
	private String phoneNo;

    @Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
	private User_Address address;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Packagee> packagees;
	
    public Users()
	{
		
	}

	
  // Getters and Setters

	public Users(int id, String userName, String phoneNo, String email, String password,
			User_Address address, List<Packagee> packagees) {
		this.id = id;
		this.userName = userName;
		this.phoneNo = phoneNo;
		this.email = email;
		this.password = password;
		this.address = address;
		this.packagees = packagees;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User_Address getAddressId() {
		return address;
	}

	public void setAddressId(User_Address addressId) {
		this.address = addressId;
	}
	

	public User_Address getAddress() {
		return address;
	}


	public void setAddress(User_Address address) {
		this.address = address;
	}


	public List<Packagee> getPackagees() {
		return packagees;
	}


	public void setPackagees(List<Packagee> packagees) {
		this.packagees = packagees;
	}


	@Override
	public String toString() {
		return "Users [id=" + id + ", userName=" + userName + ", role=" + ", phoneNo=" + phoneNo + ", email="
				+ email + ", password=" + password + ", addressId=" + address + "]";
	}
  
	

}