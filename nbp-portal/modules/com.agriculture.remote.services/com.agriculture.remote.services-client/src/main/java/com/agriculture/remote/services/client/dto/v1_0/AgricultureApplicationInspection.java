package com.agriculture.remote.services.client.dto.v1_0;

import com.agriculture.remote.services.client.function.UnsafeSupplier;
import com.agriculture.remote.services.client.serdes.v1_0.AgricultureApplicationInspectionSerDes;

import java.io.Serializable;

import java.util.Date;
import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Yogesh Chandra
 * @generated
 */
@Generated("")
public class AgricultureApplicationInspection
	implements Cloneable, Serializable {

	public static AgricultureApplicationInspection toDTO(String json) {
		return AgricultureApplicationInspectionSerDes.toDTO(json);
	}

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

	public Date getDateofInspection() {
		return dateofInspection;
	}

	public void setDateofInspection(Date dateofInspection) {
		this.dateofInspection = dateofInspection;
	}

	public void setDateofInspection(
		UnsafeSupplier<Date, Exception> dateofInspectionUnsafeSupplier) {

		try {
			dateofInspection = dateofInspectionUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date dateofInspection;

	@Override
	public AgricultureApplicationInspection clone()
		throws CloneNotSupportedException {

		return (AgricultureApplicationInspection)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AgricultureApplicationInspection)) {
			return false;
		}

		AgricultureApplicationInspection agricultureApplicationInspection =
			(AgricultureApplicationInspection)object;

		return Objects.equals(
			toString(), agricultureApplicationInspection.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return AgricultureApplicationInspectionSerDes.toJSON(this);
	}

}