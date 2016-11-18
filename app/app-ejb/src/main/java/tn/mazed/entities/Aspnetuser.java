package tn.mazed.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the aspnetusers database table.
 * 
 */
@Entity
@Table(name="aspnetusers")
@NamedQuery(name="Aspnetuser.findAll", query="SELECT a FROM Aspnetuser a")
public class Aspnetuser implements Serializable {
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
	@OneToMany(mappedBy="aspnetuser")
	private List<Aspnetuserclaim> aspnetuserclaims;

	//bi-directional many-to-one association to Aspnetuserlogin
	@OneToMany(mappedBy="aspnetuser")
	private List<Aspnetuserlogin> aspnetuserlogins;

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
	private List<Aspnetrole> aspnetroles;

	//bi-directional many-to-one association to Comment
	@OneToMany(mappedBy="aspnetuser")
	private List<Comment> comments;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="aspnetuser1")
	private List<Message> messages1;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="aspnetuser2")
	private List<Message> messages2;

	//bi-directional many-to-one association to Notification
	@OneToMany(mappedBy="aspnetuser")
	private List<Notification> notifications;

	//bi-directional many-to-one association to Verificationrequest
	@OneToMany(mappedBy="aspnetuser")
	private List<Verificationrequest> verificationrequests;

	public Aspnetuser() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAccessFailedCount() {
		return this.accessFailedCount;
	}

	public void setAccessFailedCount(int accessFailedCount) {
		this.accessFailedCount = accessFailedCount;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getEmailConfirmed() {
		return this.emailConfirmed;
	}

	public void setEmailConfirmed(byte emailConfirmed) {
		this.emailConfirmed = emailConfirmed;
	}

	public byte getLockoutEnabled() {
		return this.lockoutEnabled;
	}

	public void setLockoutEnabled(byte lockoutEnabled) {
		this.lockoutEnabled = lockoutEnabled;
	}

	public Date getLockoutEndDateUtc() {
		return this.lockoutEndDateUtc;
	}

	public void setLockoutEndDateUtc(Date lockoutEndDateUtc) {
		this.lockoutEndDateUtc = lockoutEndDateUtc;
	}

	public String getPasswordHash() {
		return this.passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public byte getPhoneNumberConfirmed() {
		return this.phoneNumberConfirmed;
	}

	public void setPhoneNumberConfirmed(byte phoneNumberConfirmed) {
		this.phoneNumberConfirmed = phoneNumberConfirmed;
	}

	public String getProfilePhoto() {
		return this.profilePhoto;
	}

	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}

	public String getSecurityStamp() {
		return this.securityStamp;
	}

	public void setSecurityStamp(String securityStamp) {
		this.securityStamp = securityStamp;
	}

	public byte getTwoFactorEnabled() {
		return this.twoFactorEnabled;
	}

	public void setTwoFactorEnabled(byte twoFactorEnabled) {
		this.twoFactorEnabled = twoFactorEnabled;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public byte getViewdNotifications() {
		return this.viewdNotifications;
	}

	public void setViewdNotifications(byte viewdNotifications) {
		this.viewdNotifications = viewdNotifications;
	}

	public List<Aspnetuserclaim> getAspnetuserclaims() {
		return this.aspnetuserclaims;
	}

	public void setAspnetuserclaims(List<Aspnetuserclaim> aspnetuserclaims) {
		this.aspnetuserclaims = aspnetuserclaims;
	}

	public Aspnetuserclaim addAspnetuserclaim(Aspnetuserclaim aspnetuserclaim) {
		getAspnetuserclaims().add(aspnetuserclaim);
		aspnetuserclaim.setAspnetuser(this);

		return aspnetuserclaim;
	}

	public Aspnetuserclaim removeAspnetuserclaim(Aspnetuserclaim aspnetuserclaim) {
		getAspnetuserclaims().remove(aspnetuserclaim);
		aspnetuserclaim.setAspnetuser(null);

		return aspnetuserclaim;
	}

	public List<Aspnetuserlogin> getAspnetuserlogins() {
		return this.aspnetuserlogins;
	}

	public void setAspnetuserlogins(List<Aspnetuserlogin> aspnetuserlogins) {
		this.aspnetuserlogins = aspnetuserlogins;
	}

	public Aspnetuserlogin addAspnetuserlogin(Aspnetuserlogin aspnetuserlogin) {
		getAspnetuserlogins().add(aspnetuserlogin);
		aspnetuserlogin.setAspnetuser(this);

		return aspnetuserlogin;
	}

	public Aspnetuserlogin removeAspnetuserlogin(Aspnetuserlogin aspnetuserlogin) {
		getAspnetuserlogins().remove(aspnetuserlogin);
		aspnetuserlogin.setAspnetuser(null);

		return aspnetuserlogin;
	}

	public List<Aspnetrole> getAspnetroles() {
		return this.aspnetroles;
	}

	public void setAspnetroles(List<Aspnetrole> aspnetroles) {
		this.aspnetroles = aspnetroles;
	}

	public List<Comment> getComments() {
		return this.comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public Comment addComment(Comment comment) {
		getComments().add(comment);
		comment.setAspnetuser(this);

		return comment;
	}

	public Comment removeComment(Comment comment) {
		getComments().remove(comment);
		comment.setAspnetuser(null);

		return comment;
	}

	public List<Message> getMessages1() {
		return this.messages1;
	}

	public void setMessages1(List<Message> messages1) {
		this.messages1 = messages1;
	}

	public Message addMessages1(Message messages1) {
		getMessages1().add(messages1);
		messages1.setAspnetuser1(this);

		return messages1;
	}

	public Message removeMessages1(Message messages1) {
		getMessages1().remove(messages1);
		messages1.setAspnetuser1(null);

		return messages1;
	}

	public List<Message> getMessages2() {
		return this.messages2;
	}

	public void setMessages2(List<Message> messages2) {
		this.messages2 = messages2;
	}

	public Message addMessages2(Message messages2) {
		getMessages2().add(messages2);
		messages2.setAspnetuser2(this);

		return messages2;
	}

	public Message removeMessages2(Message messages2) {
		getMessages2().remove(messages2);
		messages2.setAspnetuser2(null);

		return messages2;
	}

	public List<Notification> getNotifications() {
		return this.notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public Notification addNotification(Notification notification) {
		getNotifications().add(notification);
		notification.setAspnetuser(this);

		return notification;
	}

	public Notification removeNotification(Notification notification) {
		getNotifications().remove(notification);
		notification.setAspnetuser(null);

		return notification;
	}

	public List<Verificationrequest> getVerificationrequests() {
		return this.verificationrequests;
	}

	public void setVerificationrequests(List<Verificationrequest> verificationrequests) {
		this.verificationrequests = verificationrequests;
	}

	public Verificationrequest addVerificationrequest(Verificationrequest verificationrequest) {
		getVerificationrequests().add(verificationrequest);
		verificationrequest.setAspnetuser(this);

		return verificationrequest;
	}

	public Verificationrequest removeVerificationrequest(Verificationrequest verificationrequest) {
		getVerificationrequests().remove(verificationrequest);
		verificationrequest.setAspnetuser(null);

		return verificationrequest;
	}

}