package tn.mazed.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the messages database table.
 * 
 */
@Entity
@Table(name="messages")
@NamedQuery(name="Message.findAll", query="SELECT m FROM Message m")
public class Message implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int messageID;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	private byte read;

	@Lob
	private String text;

	//bi-directional many-to-one association to Aspnetuser
	@ManyToOne
	@JoinColumn(name="AccountFromID")
	private Aspnetuser aspnetuser1;

	//bi-directional many-to-one association to Aspnetuser
	@ManyToOne
	@JoinColumn(name="AccountToID")
	private Aspnetuser aspnetuser2;

	public Message() {
	}

	public int getMessageID() {
		return this.messageID;
	}

	public void setMessageID(int messageID) {
		this.messageID = messageID;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public byte getRead() {
		return this.read;
	}

	public void setRead(byte read) {
		this.read = read;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Aspnetuser getAspnetuser1() {
		return this.aspnetuser1;
	}

	public void setAspnetuser1(Aspnetuser aspnetuser1) {
		this.aspnetuser1 = aspnetuser1;
	}

	public Aspnetuser getAspnetuser2() {
		return this.aspnetuser2;
	}

	public void setAspnetuser2(Aspnetuser aspnetuser2) {
		this.aspnetuser2 = aspnetuser2;
	}

}