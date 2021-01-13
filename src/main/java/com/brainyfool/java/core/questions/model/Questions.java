package com.brainyfool.java.core.questions.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Questions {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String description;
	private String a;
	private String b;
	private String c;
	private String d;
	private String correct;
	private String hint;

	public Questions() {
	}

	public Questions(Integer id, String description, String a, String b, String c, String d, String correct,
			String hint) {
		super();
		this.id = id;
		this.description = description;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.correct = correct;
		this.hint = hint;
	}

	@Override
	public String toString() {
		return "Questions [id=" + id + ", description=" + description + ", a=" + a + ", b=" + b + ", c=" + c + ", d="
				+ d + ", correct=" + correct + ", hint=" + hint + "]";
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCorrect(String correct) {
		this.correct = correct;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}

	public Integer getId() {
		return id;
	}

	public String[] getDescription() {
		return description.split(",,");
	}

	public String getCorrect() {
		return correct;
	}

	public String getHint() {
		return hint;
	}

}
