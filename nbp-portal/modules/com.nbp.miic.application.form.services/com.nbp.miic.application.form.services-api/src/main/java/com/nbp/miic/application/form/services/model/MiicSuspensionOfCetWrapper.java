/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MiicSuspensionOfCet}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicSuspensionOfCet
 * @generated
 */
public class MiicSuspensionOfCetWrapper
	extends BaseModelWrapper<MiicSuspensionOfCet>
	implements MiicSuspensionOfCet, ModelWrapper<MiicSuspensionOfCet> {

	public MiicSuspensionOfCetWrapper(MiicSuspensionOfCet miicSuspensionOfCet) {
		super(miicSuspensionOfCet);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("miicSuspensionOfCetId", getMiicSuspensionOfCetId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("indicationOfUrgency", getIndicationOfUrgency());
		attributes.put("requestForSuspension", getRequestForSuspension());
		attributes.put("evidenceOfInability", getEvidenceOfInability());
		attributes.put("evidenceOfConsultation", getEvidenceOfConsultation());
		attributes.put(
			"evidenceOfConsultationForeign",
			getEvidenceOfConsultationForeign());
		attributes.put(
			"nameOfAuthorizedPersonnel", getNameOfAuthorizedPersonnel());
		attributes.put("miicApplicationId", getMiicApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long miicSuspensionOfCetId = (Long)attributes.get(
			"miicSuspensionOfCetId");

		if (miicSuspensionOfCetId != null) {
			setMiicSuspensionOfCetId(miicSuspensionOfCetId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String indicationOfUrgency = (String)attributes.get(
			"indicationOfUrgency");

		if (indicationOfUrgency != null) {
			setIndicationOfUrgency(indicationOfUrgency);
		}

		String requestForSuspension = (String)attributes.get(
			"requestForSuspension");

		if (requestForSuspension != null) {
			setRequestForSuspension(requestForSuspension);
		}

		String evidenceOfInability = (String)attributes.get(
			"evidenceOfInability");

		if (evidenceOfInability != null) {
			setEvidenceOfInability(evidenceOfInability);
		}

		String evidenceOfConsultation = (String)attributes.get(
			"evidenceOfConsultation");

		if (evidenceOfConsultation != null) {
			setEvidenceOfConsultation(evidenceOfConsultation);
		}

		String evidenceOfConsultationForeign = (String)attributes.get(
			"evidenceOfConsultationForeign");

		if (evidenceOfConsultationForeign != null) {
			setEvidenceOfConsultationForeign(evidenceOfConsultationForeign);
		}

		String nameOfAuthorizedPersonnel = (String)attributes.get(
			"nameOfAuthorizedPersonnel");

		if (nameOfAuthorizedPersonnel != null) {
			setNameOfAuthorizedPersonnel(nameOfAuthorizedPersonnel);
		}

		Long miicApplicationId = (Long)attributes.get("miicApplicationId");

		if (miicApplicationId != null) {
			setMiicApplicationId(miicApplicationId);
		}
	}

	@Override
	public MiicSuspensionOfCet cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this miic suspension of cet.
	 *
	 * @return the company ID of this miic suspension of cet
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this miic suspension of cet.
	 *
	 * @return the create date of this miic suspension of cet
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the evidence of consultation of this miic suspension of cet.
	 *
	 * @return the evidence of consultation of this miic suspension of cet
	 */
	@Override
	public String getEvidenceOfConsultation() {
		return model.getEvidenceOfConsultation();
	}

	/**
	 * Returns the evidence of consultation foreign of this miic suspension of cet.
	 *
	 * @return the evidence of consultation foreign of this miic suspension of cet
	 */
	@Override
	public String getEvidenceOfConsultationForeign() {
		return model.getEvidenceOfConsultationForeign();
	}

	/**
	 * Returns the evidence of inability of this miic suspension of cet.
	 *
	 * @return the evidence of inability of this miic suspension of cet
	 */
	@Override
	public String getEvidenceOfInability() {
		return model.getEvidenceOfInability();
	}

	/**
	 * Returns the group ID of this miic suspension of cet.
	 *
	 * @return the group ID of this miic suspension of cet
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the indication of urgency of this miic suspension of cet.
	 *
	 * @return the indication of urgency of this miic suspension of cet
	 */
	@Override
	public String getIndicationOfUrgency() {
		return model.getIndicationOfUrgency();
	}

	/**
	 * Returns the miic application ID of this miic suspension of cet.
	 *
	 * @return the miic application ID of this miic suspension of cet
	 */
	@Override
	public long getMiicApplicationId() {
		return model.getMiicApplicationId();
	}

	/**
	 * Returns the miic suspension of cet ID of this miic suspension of cet.
	 *
	 * @return the miic suspension of cet ID of this miic suspension of cet
	 */
	@Override
	public long getMiicSuspensionOfCetId() {
		return model.getMiicSuspensionOfCetId();
	}

	/**
	 * Returns the modified date of this miic suspension of cet.
	 *
	 * @return the modified date of this miic suspension of cet
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of authorized personnel of this miic suspension of cet.
	 *
	 * @return the name of authorized personnel of this miic suspension of cet
	 */
	@Override
	public String getNameOfAuthorizedPersonnel() {
		return model.getNameOfAuthorizedPersonnel();
	}

	/**
	 * Returns the primary key of this miic suspension of cet.
	 *
	 * @return the primary key of this miic suspension of cet
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the request for suspension of this miic suspension of cet.
	 *
	 * @return the request for suspension of this miic suspension of cet
	 */
	@Override
	public String getRequestForSuspension() {
		return model.getRequestForSuspension();
	}

	/**
	 * Returns the user ID of this miic suspension of cet.
	 *
	 * @return the user ID of this miic suspension of cet
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this miic suspension of cet.
	 *
	 * @return the user name of this miic suspension of cet
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this miic suspension of cet.
	 *
	 * @return the user uuid of this miic suspension of cet
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this miic suspension of cet.
	 *
	 * @param companyId the company ID of this miic suspension of cet
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this miic suspension of cet.
	 *
	 * @param createDate the create date of this miic suspension of cet
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the evidence of consultation of this miic suspension of cet.
	 *
	 * @param evidenceOfConsultation the evidence of consultation of this miic suspension of cet
	 */
	@Override
	public void setEvidenceOfConsultation(String evidenceOfConsultation) {
		model.setEvidenceOfConsultation(evidenceOfConsultation);
	}

	/**
	 * Sets the evidence of consultation foreign of this miic suspension of cet.
	 *
	 * @param evidenceOfConsultationForeign the evidence of consultation foreign of this miic suspension of cet
	 */
	@Override
	public void setEvidenceOfConsultationForeign(
		String evidenceOfConsultationForeign) {

		model.setEvidenceOfConsultationForeign(evidenceOfConsultationForeign);
	}

	/**
	 * Sets the evidence of inability of this miic suspension of cet.
	 *
	 * @param evidenceOfInability the evidence of inability of this miic suspension of cet
	 */
	@Override
	public void setEvidenceOfInability(String evidenceOfInability) {
		model.setEvidenceOfInability(evidenceOfInability);
	}

	/**
	 * Sets the group ID of this miic suspension of cet.
	 *
	 * @param groupId the group ID of this miic suspension of cet
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the indication of urgency of this miic suspension of cet.
	 *
	 * @param indicationOfUrgency the indication of urgency of this miic suspension of cet
	 */
	@Override
	public void setIndicationOfUrgency(String indicationOfUrgency) {
		model.setIndicationOfUrgency(indicationOfUrgency);
	}

	/**
	 * Sets the miic application ID of this miic suspension of cet.
	 *
	 * @param miicApplicationId the miic application ID of this miic suspension of cet
	 */
	@Override
	public void setMiicApplicationId(long miicApplicationId) {
		model.setMiicApplicationId(miicApplicationId);
	}

	/**
	 * Sets the miic suspension of cet ID of this miic suspension of cet.
	 *
	 * @param miicSuspensionOfCetId the miic suspension of cet ID of this miic suspension of cet
	 */
	@Override
	public void setMiicSuspensionOfCetId(long miicSuspensionOfCetId) {
		model.setMiicSuspensionOfCetId(miicSuspensionOfCetId);
	}

	/**
	 * Sets the modified date of this miic suspension of cet.
	 *
	 * @param modifiedDate the modified date of this miic suspension of cet
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of authorized personnel of this miic suspension of cet.
	 *
	 * @param nameOfAuthorizedPersonnel the name of authorized personnel of this miic suspension of cet
	 */
	@Override
	public void setNameOfAuthorizedPersonnel(String nameOfAuthorizedPersonnel) {
		model.setNameOfAuthorizedPersonnel(nameOfAuthorizedPersonnel);
	}

	/**
	 * Sets the primary key of this miic suspension of cet.
	 *
	 * @param primaryKey the primary key of this miic suspension of cet
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the request for suspension of this miic suspension of cet.
	 *
	 * @param requestForSuspension the request for suspension of this miic suspension of cet
	 */
	@Override
	public void setRequestForSuspension(String requestForSuspension) {
		model.setRequestForSuspension(requestForSuspension);
	}

	/**
	 * Sets the user ID of this miic suspension of cet.
	 *
	 * @param userId the user ID of this miic suspension of cet
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this miic suspension of cet.
	 *
	 * @param userName the user name of this miic suspension of cet
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this miic suspension of cet.
	 *
	 * @param userUuid the user uuid of this miic suspension of cet
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected MiicSuspensionOfCetWrapper wrap(
		MiicSuspensionOfCet miicSuspensionOfCet) {

		return new MiicSuspensionOfCetWrapper(miicSuspensionOfCet);
	}

}