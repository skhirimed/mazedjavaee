package tn.mazed.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: BlogComment
 *
 */
@Entity

public class BlogComment implements Serializable {

	   
	@Id
	private int idComment;
	private String textComment;
	private Date dateComment;
	private String image;
	
	@ManyToOne
	private User user;
	
	private static final long serialVersionUID = 1L;

	public BlogComment() {
		super();
	}   
	public int getIdComment() {
		return this.idComment;
	}

	public void setIdComment(int idComment) {
		this.idComment = idComment;
	}   
	public String getTextComment() {
		return this.textComment;
	}

	public void setTextComment(String textComment) {
		this.textComment = textComment;
	}   
	public Date getDateComment() {
		return this.dateComment;
	}

	public void setDateComment(Date dateComment) {
		this.dateComment = dateComment;
	}
   
}
