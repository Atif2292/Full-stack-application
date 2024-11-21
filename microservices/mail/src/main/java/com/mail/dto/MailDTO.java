package com.mail.dto;

public class MailDTO {

	private String mailAddress;

	private Long mailSenderName;

	private String mailId;

	private int mailIdNumber;
	
	public int getMailIdNumber() {
		return mailIdNumber;
	}

	public void setMailIdNumber(int mailIdNumber) {
		this.mailIdNumber = mailIdNumber;
	}

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


}
