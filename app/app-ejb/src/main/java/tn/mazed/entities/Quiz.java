package tn.mazed.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the quizs database table.
 * 
 */
@Entity
@Table(name="quizs")
@NamedQuery(name="Quiz.findAll", query="SELECT q FROM Quiz q")
public class Quiz implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idQuiz;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreationQuiz;

	@Lob
	private String typeQuiz;

	//bi-directional many-to-one association to Question
	@OneToMany(mappedBy="quiz")
	private List<Question> questions;

	public Quiz() {
	}

	public int getIdQuiz() {
		return this.idQuiz;
	}

	public void setIdQuiz(int idQuiz) {
		this.idQuiz = idQuiz;
	}

	public Date getDateCreationQuiz() {
		return this.dateCreationQuiz;
	}

	public void setDateCreationQuiz(Date dateCreationQuiz) {
		this.dateCreationQuiz = dateCreationQuiz;
	}

	public String getTypeQuiz() {
		return this.typeQuiz;
	}

	public void setTypeQuiz(String typeQuiz) {
		this.typeQuiz = typeQuiz;
	}

	public List<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Question addQuestion(Question question) {
		getQuestions().add(question);
		question.setQuiz(this);

		return question;
	}

	public Question removeQuestion(Question question) {
		getQuestions().remove(question);
		question.setQuiz(null);

		return question;
	}

}