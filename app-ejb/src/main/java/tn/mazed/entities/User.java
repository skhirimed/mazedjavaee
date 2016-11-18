package tn.mazed.entities;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Collection;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the aspnetusers database table.
 * 
 */
@Entity
@Table(name="aspnetusers")
@NamedQuery(name="Aspnetuser.findAll", query="SELECT a FROM User a")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private int accessFailedCount;

	private String email;

	private byte emailConfirmed;

	private byte lockoutEnabled;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lockoutEndDateUtc;

	@Lob
	private String passwordHash;

	@Lob
	private String phoneNumber;

	private byte phoneNumberConfirmed;

	@Lob
	private String profilePhoto;

	@Lob
	private String securityStamp;

	private byte twoFactorEnabled;

	private String userName;

	private byte viewdNotifications;

	//bi-directional many-to-one association to Aspnetuserclaim
	@OneToMany(mappedBy="user")
	private List<Userclaim> claims;

	//bi-directional many-to-one association to Aspnetuserlogin
	@OneToMany(mappedBy="user")
	private List<Userlogin> logins;

	//bi-directional many-to-many association to Aspnetrole
	@ManyToMany
	@JoinTable(
		name="aspnetuserroles"
		, joinColumns={
			@JoinColumn(name="UserId")
			}
		, inverseJoinColumns={
			@JoinColumn(name="RoleId")
			}
		)
	private List<Role> roles;

	//bi-directional many-to-one association to Comment
	@OneToMany(mappedBy="user")
	private List<Comment> comments;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="user1")
	private List<Message> messages1;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="user2")
	private List<Message> messages2;

	//bi-directional many-to-one association to Notification
	@OneToMany(mappedBy="user")
	private List<Notification> notifications;

	//bi-directional many-to-one association to Verificationrequest
	@OneToMany(mappedBy="user")
	private List<Verificationrequest> verificationrequests;

	/*
	 * Blog
	 * */
	
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	private List<BlogComment> blogComments;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	private List<Post> posts;
	/*
	 * 
	 * 
	 * */
	
	
	/*
	 * Auction
	 * */
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	private Collection<Bid> bids;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	private Collection<Auction> auctions;
	

	/*
	 * 
	 * 
	 * */
	
	
	public User() {
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAccessFailedCount() {
		return accessFailedCount;
	}
	public void setAccessFailedCount(int accessFailedCount) {
		this.accessFailedCount = accessFailedCount;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public byte getEmailConfirmed() {
		return emailConfirmed;
	}
	public void setEmailConfirmed(byte emailConfirmed) {
		this.emailConfirmed = emailConfirmed;
	}
	public byte getLockoutEnabled() {
		return lockoutEnabled;
	}
	public void setLockoutEnabled(byte lockoutEnabled) {
		this.lockoutEnabled = lockoutEnabled;
	}
	public Date getLockoutEndDateUtc() {
		return lockoutEndDateUtc;
	}
	public void setLockoutEndDateUtc(Date lockoutEndDateUtc) {
		this.lockoutEndDateUtc = lockoutEndDateUtc;
	}
	public String getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public byte getPhoneNumberConfirmed() {
		return phoneNumberConfirmed;
	}
	public void setPhoneNumberConfirmed(byte phoneNumberConfirmed) {
		this.phoneNumberConfirmed = phoneNumberConfirmed;
	}
	public String getProfilePhoto() {
		return profilePhoto;
	}
	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}
	public String getSecurityStamp() {
		return securityStamp;
	}
	public void setSecurityStamp(String securityStamp) {
		this.securityStamp = securityStamp;
	}
	public byte getTwoFactorEnabled() {
		return twoFactorEnabled;
	}
	public void setTwoFactorEnabled(byte twoFactorEnabled) {
		this.twoFactorEnabled = twoFactorEnabled;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public byte getViewdNotifications() {
		return viewdNotifications;
	}
	public void setViewdNotifications(byte viewdNotifications) {
		this.viewdNotifications = viewdNotifications;
	}
	
	public List<Userclaim> getClaims() {
		return claims;
	}
	public void setClaims(List<Userclaim> claims) {
		this.claims = claims;
	}
	public List<Userlogin> getLogins() {
		return logins;
	}
	public void setLogins(List<Userlogin> logins) {
		this.logins = logins;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public List<Message> getMessages1() {
		return messages1;
	}
	public void setMessages1(List<Message> messages1) {
		this.messages1 = messages1;
	}
	public List<Message> getMessages2() {
		return messages2;
	}
	public void setMessages2(List<Message> messages2) {
		this.messages2 = messages2;
	}
	public List<Notification> getNotifications() {
		return notifications;
	}
	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}
	public List<Verificationrequest> getVerificationrequests() {
		return verificationrequests;
	}
	public void setVerificationrequests(
			List<Verificationrequest> verificationrequests) {
		this.verificationrequests = verificationrequests;
	}
	public List<BlogComment> getBlogComments() {
		return blogComments;
	}
	public void setBlogComments(List<BlogComment> blogComments) {
		this.blogComments = blogComments;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}