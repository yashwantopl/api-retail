package com.opl.retail.api.model.notification;


/**
 * @author sanket
 *
 */
public class ContentAttachment {
	
	private String fileName;
	
	private byte[] contentInByte;

	public ContentAttachment() {
		super();
	}

	public ContentAttachment(String fileName, byte[] contentInByte) {
		super();
		this.fileName = fileName;
		this.contentInByte = contentInByte;
	}

	public String getFileName() {
		return fileName;
	}

	public byte[] getContentInByte() {
		return contentInByte;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setContentInByte(byte[] contentInByte) {
		this.contentInByte = contentInByte;
	}
	
	
	

}
