package tn.mazed.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the verificationrequests database table.
 * 
 */
@Entity
@Table(name="verificationrequests")
@NamedQuery(name="Verificationrequest.findAll", query="SELECT v FROM Verificationrequest v")
public class Verificationrequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int verificationRequestId;

	private byte accepted;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateRequest;

	@Lob
	private String status;

	//bi-directional many-to-one association to Verificationattachment
	@OneToMany(mappedBy="verificationrequest")
	private List<Verificationattachment> verificationattachments;

	//bi-directional many-to-one association to Aspnetuser
	@ManyToOne
	@JoinColumn(name="userId")
	private Aspnetuser aspnetuser;

	public Verificationrequest() {
	}

	public int getVerificationRequestId() {
		return this.verificationRequestId;
	}

	public void setVerificationRequestId(int verificationRequestId) {
		this.verificationRequestId = verificationRequestId;
	}

	public byte getAccepted() {
		return this.accepted;
	}

	public void setAccepted(byte accepted) {
		this.accepted = accepted;
	}

	public Date getDateRequest() {
		return this.dateRequest;
	}

	public void setDateRequest(Date dateRequest) {
		this.dateRequest = dateRequest;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Verificationattachment> getVerificationattachments() {
		return this.verificationattachments;
	}

	public void setVerificationattachments(List<Verificationattachment> verificationattachments) {
		this.verificationattachments = verificationattachments;
	}

	public Verificationattachment addVerificationattachment(Verificationattachment verificationattachment) {
		getVerificationattachments().add(verificationattachment);
		verificationattachment.setVerificationrequest(this);

		return verificationattachment;
	}

	public Verificationattachment removeVerificationattachment(Verificationattachment verificationattachment) {
		getVerificationattachments().remove(verificationattachment);
		verificationattachment.setVerificationrequest(null);

		return verificationattachment;
	}

	public Aspnetuser getAspnetuser() {
		return this.aspnetuser;
	}

	public void setAspnetuser(Aspnetuser aspnetuser) {
		this.aspnetuser = aspnetuser;
	}

}