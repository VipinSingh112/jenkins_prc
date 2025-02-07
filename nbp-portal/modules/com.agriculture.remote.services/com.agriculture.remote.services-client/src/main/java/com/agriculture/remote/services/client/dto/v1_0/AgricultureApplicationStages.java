package com.agriculture.remote.services.client.dto.v1_0;

import com.agriculture.remote.services.client.function.UnsafeSupplier;
import com.agriculture.remote.services.client.serdes.v1_0.AgricultureApplicationStagesSerDes;

import java.io.Serializable;

import java.util.Date;
import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Yogesh Chandra
 * @generated
 */
@Generated("")
public class AgricultureApplicationStages implements Cloneable, Serializable {

	public static AgricultureApplicationStages toDTO(String json) {
		return AgricultureApplicationStagesSerDes.toDTO(json);
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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public void setDuration(
		UnsafeSupplier<String, Exception> durationUnsafeSupplier) {

		try {
			duration = durationUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String duration;

	public Date getStageEndDate() {
		return stageEndDate;
	}

	public void setStageEndDate(Date stageEndDate) {
		this.stageEndDate = stageEndDate;
	}

	public void setStageEndDate(
		UnsafeSupplier<Date, Exception> stageEndDateUnsafeSupplier) {

		try {
			stageEndDate = stageEndDateUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date stageEndDate;

	public StageName getStageName() {
		return stageName;
	}

	public String getStageNameAsString() {
		if (stageName == null) {
			return null;
		}

		return stageName.toString();
	}

	public void setStageName(StageName stageName) {
		this.stageName = stageName;
	}

	public void setStageName(
		UnsafeSupplier<StageName, Exception> stageNameUnsafeSupplier) {

		try {
			stageName = stageNameUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected StageName stageName;

	public Date getStageStartDate() {
		return stageStartDate;
	}

	public void setStageStartDate(Date stageStartDate) {
		this.stageStartDate = stageStartDate;
	}

	public void setStageStartDate(
		UnsafeSupplier<Date, Exception> stageStartDateUnsafeSupplier) {

		try {
			stageStartDate = stageStartDateUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date stageStartDate;

	public Status getStatus() {
		return status;
	}

	public String getStatusAsString() {
		if (status == null) {
			return null;
		}

		return status.toString();
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setStatus(
		UnsafeSupplier<Status, Exception> statusUnsafeSupplier) {

		try {
			status = statusUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Status status;

	@Override
	public AgricultureApplicationStages clone()
		throws CloneNotSupportedException {

		return (AgricultureApplicationStages)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AgricultureApplicationStages)) {
			return false;
		}

		AgricultureApplicationStages agricultureApplicationStages =
			(AgricultureApplicationStages)object;

		return Objects.equals(
			toString(), agricultureApplicationStages.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return AgricultureApplicationStagesSerDes.toJSON(this);
	}

	public static enum StageName {

		DATA_VERIFICATION("Data Verification"),
		INSPECTION_RADA("Inspection (RADA)"),
		REFERRAL_TO_JCA("Referral to JCA"),
		JCA_RECOMMENDATIONS("JCA Recommendations"),
		ISSUANCE_OF_PERMIT_EXEMPTION_CERTIFICATE_OR_REFUSAL_LETTER(
			"Issuance of Permit(Exemption Certificate) or Refusal Letter");

		public static StageName create(String value) {
			for (StageName stageName : values()) {
				if (Objects.equals(stageName.getValue(), value) ||
					Objects.equals(stageName.name(), value)) {

					return stageName;
				}
			}

			return null;
		}

		public String getValue() {
			return _value;
		}

		@Override
		public String toString() {
			return _value;
		}

		private StageName(String value) {
			_value = value;
		}

		private final String _value;

	}

	public static enum Status {

		OPEN("Open"), IN_PROGRESS("In-Progress"), ON_HOLD("On-Hold"),
		CLOSED("Closed");

		public static Status create(String value) {
			for (Status status : values()) {
				if (Objects.equals(status.getValue(), value) ||
					Objects.equals(status.name(), value)) {

					return status;
				}
			}

			return null;
		}

		public String getValue() {
			return _value;
		}

		@Override
		public String toString() {
			return _value;
		}

		private Status(String value) {
			_value = value;
		}

		private final String _value;

	}

}