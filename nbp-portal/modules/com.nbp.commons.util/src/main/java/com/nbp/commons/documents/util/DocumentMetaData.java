package com.nbp.commons.documents.util;

public class DocumentMetaData {
	
	String title = "";
	String fileUrl = "";
	String fileSize = "";
	String previewUrl = "";
	String fileName = "";
	long fileEntryId =0;
	
	public long getFileEntryId() {
		return fileEntryId;
	}
	public void setFileEntryId(long fileEntryId) {
		this.fileEntryId = fileEntryId;
	}
	public DocumentMetaData(String title, String fileUrl, String fileSize, String previewUrl, String fileName,
			long fileEntryId) {
		super();
		this.title = title;
		this.fileUrl = fileUrl;
		this.fileSize = fileSize;
		this.previewUrl = previewUrl;
		this.fileName = fileName;
		this.fileEntryId = fileEntryId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public String getPreviewUrl() {
		return previewUrl;
	}
	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
