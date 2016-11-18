package tn.mazed.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Post
 *
 */
@Entity

public class Post implements Serializable {
 
	@Id
	private int idPost;
	private String category;
	private String subject;
	private String content;
	private Date time;
	private boolean validation;
	@ManyToOne
	private User user;
	
	@OneToMany
	private List<BlogComment> comments;
	
	private static final long serialVersionUID = 1L;

	public Post() {
		super();
	}   
	public int getIdPost() {
		return this.idPost;
	}

	public void setIdPost(int idPost) {
		this.idPost = idPost;
	}   
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}   
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}   
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}   
	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}   
	public boolean getValidation() {
		return this.validation;
	}

	public void setValidation(boolean validation) {
		this.validation = validation;
	}
   
}
