package com.agriculture.remote.services.client.dto.v1_0;

import com.agriculture.remote.services.client.function.UnsafeSupplier;
import com.agriculture.remote.services.client.serdes.v1_0.AgricultureApplicationPermitSerDes;

import java.io.Serializable;

import java.util.Date;
import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Yogesh Chandra
 * @generated
 */
@Generated("")
public class AgricultureApplicationPermit implements Cloneable, Serializable {

	public static AgricultureApplicationPermit toDTO(String json) {
		return AgricultureApplicationPermitSerDes.toDTO(json);
	}

	public String getPIRPermitCertificate() {
		return PIRPermitCertificate;
	}

	public void setPIRPermitCertificate(String PIRPermitCertificate) {
		this.PIRPermitCertificate = PIRPermitCertificate;
	}

	public void setPIRPermitCertificate(
		UnsafeSupplier<String, Exception> PIRPermitCertificateUnsafeSupplier) {

		try {
			PIRPermitCertificate = PIRPermitCertificateUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String PIRPermitCertificate;

	public String getCaseId() {
		return caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public void setCaseId(
		UnsafeSupplier<String, Exception> caseIdUnsafeSupplier) {

		try {
			caseId = caseIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String caseId;

	public Date getDateOfExpiration() {
		return dateOfExpiration;
	}

	public void setDateOfExpiration(Date dateOfExpiration) {
		this.dateOfExpiration = dateOfExpiration;
	}

	public void setDateOfExpiration(
		UnsafeSupplier<Date, Exception> dateOfExpirationUnsafeSupplier) {

		try {
			dateOfExpiration = dateOfExpirationUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date dateOfExpiration;

	public Date getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public void setDateOfIssue(
		UnsafeSupplier<Date, Exception> dateOfIssueUnsafeSupplier) {

		try {
			dateOfIssue = dateOfIssueUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date dateOfIssue;

	public String getDurationOfPermit() {
		return durationOfPermit;
	}

	public void setDurationOfPermit(String durationOfPermit) {
		this.durationOfPermit = durationOfPermit;
	}

	public void setDurationOfPermit(
		UnsafeSupplier<String, Exception> durationOfPermitUnsafeSupplier) {

		try {
			durationOfPermit = durationOfPermitUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String durationOfPermit;

	public String getPirPermitNumber() {
		return pirPermitNumber;
	}

	public void setPirPermitNumber(String pirPermitNumber) {
		this.pirPermitNumber = pirPermitNumber;
	}

	public void setPirPermitNumber(
		UnsafeSupplier<String, Exception> pirPermitNumberUnsafeSupplier) {

		try {
			pirPermitNumber = pirPermitNumberUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String pirPermitNumber;

	@Override
	public AgricultureApplicationPermit clone()
		throws CloneNotSupportedException {

		return (AgricultureApplicationPermit)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AgricultureApplicationPermit)) {
			return false;
		}

		AgricultureApplicationPermit agricultureApplicationPermit =
			(AgricultureApplicationPermit)object;

		return Objects.equals(
			toString(), agricultureApplicationPermit.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return AgricultureApplicationPermitSerDes.toJSON(this);
	}

}