package tn.mazed.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the notifications database table.
 * 
 */
@Entity
@Table(name="notifications")
@NamedQuery(name="Notification.findAll", query="SELECT n FROM Notification n")
public class Notification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int notificationId;

	private byte includeInNotifications;

	@Temporal(TemporalType.TIMESTAMP)
	private Date notificationDate;

	@Lob
	private String notificationMessage;

	@Lob
	private String notificationType;

	private byte viewed;

	//bi-directional many-to-one association to Aspnetuser
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;

	public Notification() {
	}

	public int getNotificationId() {
		return this.notificationId;
	}

	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}

	public byte getIncludeInNotifications() {
		return this.includeInNotifications;
	}

	public void setIncludeInNotifications(byte includeInNotifications) {
		this.includeInNotifications = includeInNotifications;
	}

	public Date getNotificationDate() {
		return this.notificationDate;
	}

	public void setNotificationDate(Date notificationDate) {
		this.notificationDate = notificationDate;
	}

	public String getNotificationMessage() {
		return this.notificationMessage;
	}

	public void setNotificationMessage(String notificationMessage) {
		this.notificationMessage = notificationMessage;
	}

	public String getNotificationType() {
		return this.notificationType;
	}

	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}

	public byte getViewed() {
		return this.viewed;
	}

	public void setViewed(byte viewed) {
		this.viewed = viewed;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

}