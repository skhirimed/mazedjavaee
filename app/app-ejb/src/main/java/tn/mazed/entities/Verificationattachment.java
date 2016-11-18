package tn.mazed.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the verificationattachments database table.
 * 
 */
@Entity
@Table(name="verificationattachments")
@NamedQuery(name="Verificationattachment.findAll", query="SELECT v FROM Verificationattachment v")
public class Verificationattachment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int verificationAttachmentId;

	@Lob
	private String info;

	@Lob
	private String type;

	@Lob
	private String url;

	//bi-directional many-to-one association to Verificationrequest
	@ManyToOne
	@JoinColumn(name="verificationId")
	private Verificationrequest verificationrequest;

	public Verificationattachment() {
	}

	public int getVerificationAttachmentId() {
		return this.verificationAttachmentId;
	}

	public void setVerificationAttachmentId(int verificationAttachmentId) {
		this.verificationAttachmentId = verificationAttachmentId;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Verificationrequest getVerificationrequest() {
		return this.verificationrequest;
	}

	public void setVerificationrequest(Verificationrequest verificationrequest) {
		this.verificationrequest = verificationrequest;
	}

}