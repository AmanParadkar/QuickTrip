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
	
	@Column(name="role_")
	private String role;
	
	@Column(name="phone_No")
	private String phoneNo;

    @Column(name="email")
	private String email;
	
	@Column(name="paasword")
	private String password;
	
	// @Column(name="city")
	// private String city;

	// @Column(name="state")
	// private String state;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private User_Address addressId;
	
	@JoinColumn(name="package_id")
    @OneToOne(cascade=CascadeType.ALL)
	private Packagee packageId;
	// @Column(name="packageId")
	// private int packageId;


    public Users()
	{
		
	}

	public Users(int id, String userName, String role, String phoneNo, String email, String password,
			User_Address addressId, Packagee packageId) {
		this.id = id;
		this.userName = userName;
		this.role = role;
		this.phoneNo = phoneNo;
		this.email = email;
		this.password = password;
		this.addressId = addressId;
		this.packageId = packageId;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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
		return addressId;
	}

	public void setAddressId(User_Address addressId) {
		this.addressId = addressId;
	}

	public Packagee getPackageId() {
		return packageId;
	}

	public void setPackageId(Packagee packageId) {
		this.packageId = packageId;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", userName=" + userName + ", role=" + role + ", phoneNo=" + phoneNo + ", email="
				+ email + ", password=" + password + ", addressId=" + addressId + ", packageId=" + packageId + "]";
	}

	

}
