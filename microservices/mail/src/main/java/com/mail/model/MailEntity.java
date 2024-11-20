package com.mail.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mail")
public class MailEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mailIdNumber;
	private String mailAddress;

	private Long mailSenderName;

	private String mailId;

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public Long getMailSenderName() {
		return mailSenderName;
	}

	public void setMailSenderName(Long mailSenderName) {
		this.mailSenderName = mailSenderName;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public int getMailIdNumber() {
		return mailIdNumber;
	}

	public void setMailIdNumber(int mailIdNumber) {
		this.mailIdNumber = mailIdNumber;
	}

}
