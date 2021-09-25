package com.codemer.authserver.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "CARDHOLDER_TBL")
public class cardHolder {
	
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String userName;
	private String password;
	private String email;
	 @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	    @JoinTable(
	            name = "users_roles",
	            joinColumns = @JoinColumn(name = "user_id"),
	            inverseJoinColumns = @JoinColumn(name = "role_id")
	            )
    private Set<Role> roles;
	 
	 public cardHolder() {
			super();
			
		}
	
	public cardHolder(int id, String userName, String password, String email, Set<Role> roles) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "cardHolder [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", roles=" + roles + "]";
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
    public  Collection<? extends GrantedAuthority> getRoles() {
        
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        
        for (Role role : this.roles) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }         
        return authorities;
    }
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	

}
