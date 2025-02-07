/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SezConsultancyInspection}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezConsultancyInspection
 * @generated
 */
public class SezConsultancyInspectionWrapper
	extends BaseModelWrapper<SezConsultancyInspection>
	implements ModelWrapper<SezConsultancyInspection>,
			   SezConsultancyInspection {

	public SezConsultancyInspectionWrapper(
		SezConsultancyInspection sezConsultancyInspection) {

		super(sezConsultancyInspection);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"sezConsultancyInspectionId", getSezConsultancyInspectionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("doYouWant", getDoYouWant());
		attributes.put("consultancyName", getConsultancyName());
		attributes.put("consultancyEmail", getConsultancyEmail());
		attributes.put("consultancyPhoneNum", getConsultancyPhoneNum());
		attributes.put("consultancyDateBirth", getConsultancyDateBirth());
		attributes.put("consultancyBirthCountry", getConsultancyBirthCountry());
		attributes.put("consultancyCountry", getConsultancyCountry());
		attributes.put("consultancySezStatus", getConsultancySezStatus());
		attributes.put("agendaName", getAgendaName());
		attributes.put("dateForInspection", getDateForInspection());
		attributes.put("consultancyTime", getConsultancyTime());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezConsultancyInspectionId = (Long)attributes.get(
			"sezConsultancyInspectionId");

		if (sezConsultancyInspectionId != null) {
			setSezConsultancyInspectionId(sezConsultancyInspectionId);
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

		String doYouWant = (String)attributes.get("doYouWant");

		if (doYouWant != null) {
			setDoYouWant(doYouWant);
		}

		String consultancyName = (String)attributes.get("consultancyName");

		if (consultancyName != null) {
			setConsultancyName(consultancyName);
		}

		String consultancyEmail = (String)attributes.get("consultancyEmail");

		if (consultancyEmail != null) {
			setConsultancyEmail(consultancyEmail);
		}

		String consultancyPhoneNum = (String)attributes.get(
			"consultancyPhoneNum");

		if (consultancyPhoneNum != null) {
			setConsultancyPhoneNum(consultancyPhoneNum);
		}

		Date consultancyDateBirth = (Date)attributes.get(
			"consultancyDateBirth");

		if (consultancyDateBirth != null) {
			setConsultancyDateBirth(consultancyDateBirth);
		}

		String consultancyBirthCountry = (String)attributes.get(
			"consultancyBirthCountry");

		if (consultancyBirthCountry != null) {
			setConsultancyBirthCountry(consultancyBirthCountry);
		}

		String consultancyCountry = (String)attributes.get(
			"consultancyCountry");

		if (consultancyCountry != null) {
			setConsultancyCountry(consultancyCountry);
		}

		String consultancySezStatus = (String)attributes.get(
			"consultancySezStatus");

		if (consultancySezStatus != null) {
			setConsultancySezStatus(consultancySezStatus);
		}

		String agendaName = (String)attributes.get("agendaName");

		if (agendaName != null) {
			setAgendaName(agendaName);
		}

		Date dateForInspection = (Date)attributes.get("dateForInspection");

		if (dateForInspection != null) {
			setDateForInspection(dateForInspection);
		}

		String consultancyTime = (String)attributes.get("consultancyTime");

		if (consultancyTime != null) {
			setConsultancyTime(consultancyTime);
		}
	}

	@Override
	public SezConsultancyInspection cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the agenda name of this sez consultancy inspection.
	 *
	 * @return the agenda name of this sez consultancy inspection
	 */
	@Override
	public String getAgendaName() {
		return model.getAgendaName();
	}

	/**
	 * Returns the company ID of this sez consultancy inspection.
	 *
	 * @return the company ID of this sez consultancy inspection
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the consultancy birth country of this sez consultancy inspection.
	 *
	 * @return the consultancy birth country of this sez consultancy inspection
	 */
	@Override
	public String getConsultancyBirthCountry() {
		return model.getConsultancyBirthCountry();
	}

	/**
	 * Returns the consultancy country of this sez consultancy inspection.
	 *
	 * @return the consultancy country of this sez consultancy inspection
	 */
	@Override
	public String getConsultancyCountry() {
		return model.getConsultancyCountry();
	}

	/**
	 * Returns the consultancy date birth of this sez consultancy inspection.
	 *
	 * @return the consultancy date birth of this sez consultancy inspection
	 */
	@Override
	public Date getConsultancyDateBirth() {
		return model.getConsultancyDateBirth();
	}

	/**
	 * Returns the consultancy email of this sez consultancy inspection.
	 *
	 * @return the consultancy email of this sez consultancy inspection
	 */
	@Override
	public String getConsultancyEmail() {
		return model.getConsultancyEmail();
	}

	/**
	 * Returns the consultancy name of this sez consultancy inspection.
	 *
	 * @return the consultancy name of this sez consultancy inspection
	 */
	@Override
	public String getConsultancyName() {
		return model.getConsultancyName();
	}

	/**
	 * Returns the consultancy phone num of this sez consultancy inspection.
	 *
	 * @return the consultancy phone num of this sez consultancy inspection
	 */
	@Override
	public String getConsultancyPhoneNum() {
		return model.getConsultancyPhoneNum();
	}

	/**
	 * Returns the consultancy sez status of this sez consultancy inspection.
	 *
	 * @return the consultancy sez status of this sez consultancy inspection
	 */
	@Override
	public String getConsultancySezStatus() {
		return model.getConsultancySezStatus();
	}

	/**
	 * Returns the consultancy time of this sez consultancy inspection.
	 *
	 * @return the consultancy time of this sez consultancy inspection
	 */
	@Override
	public String getConsultancyTime() {
		return model.getConsultancyTime();
	}

	/**
	 * Returns the create date of this sez consultancy inspection.
	 *
	 * @return the create date of this sez consultancy inspection
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date for inspection of this sez consultancy inspection.
	 *
	 * @return the date for inspection of this sez consultancy inspection
	 */
	@Override
	public Date getDateForInspection() {
		return model.getDateForInspection();
	}

	/**
	 * Returns the do you want of this sez consultancy inspection.
	 *
	 * @return the do you want of this sez consultancy inspection
	 */
	@Override
	public String getDoYouWant() {
		return model.getDoYouWant();
	}

	/**
	 * Returns the group ID of this sez consultancy inspection.
	 *
	 * @return the group ID of this sez consultancy inspection
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez consultancy inspection.
	 *
	 * @return the modified date of this sez consultancy inspection
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this sez consultancy inspection.
	 *
	 * @return the primary key of this sez consultancy inspection
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez consultancy inspection ID of this sez consultancy inspection.
	 *
	 * @return the sez consultancy inspection ID of this sez consultancy inspection
	 */
	@Override
	public long getSezConsultancyInspectionId() {
		return model.getSezConsultancyInspectionId();
	}

	/**
	 * Returns the user ID of this sez consultancy inspection.
	 *
	 * @return the user ID of this sez consultancy inspection
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez consultancy inspection.
	 *
	 * @return the user name of this sez consultancy inspection
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez consultancy inspection.
	 *
	 * @return the user uuid of this sez consultancy inspection
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
	 * Sets the agenda name of this sez consultancy inspection.
	 *
	 * @param agendaName the agenda name of this sez consultancy inspection
	 */
	@Override
	public void setAgendaName(String agendaName) {
		model.setAgendaName(agendaName);
	}

	/**
	 * Sets the company ID of this sez consultancy inspection.
	 *
	 * @param companyId the company ID of this sez consultancy inspection
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the consultancy birth country of this sez consultancy inspection.
	 *
	 * @param consultancyBirthCountry the consultancy birth country of this sez consultancy inspection
	 */
	@Override
	public void setConsultancyBirthCountry(String consultancyBirthCountry) {
		model.setConsultancyBirthCountry(consultancyBirthCountry);
	}

	/**
	 * Sets the consultancy country of this sez consultancy inspection.
	 *
	 * @param consultancyCountry the consultancy country of this sez consultancy inspection
	 */
	@Override
	public void setConsultancyCountry(String consultancyCountry) {
		model.setConsultancyCountry(consultancyCountry);
	}

	/**
	 * Sets the consultancy date birth of this sez consultancy inspection.
	 *
	 * @param consultancyDateBirth the consultancy date birth of this sez consultancy inspection
	 */
	@Override
	public void setConsultancyDateBirth(Date consultancyDateBirth) {
		model.setConsultancyDateBirth(consultancyDateBirth);
	}

	/**
	 * Sets the consultancy email of this sez consultancy inspection.
	 *
	 * @param consultancyEmail the consultancy email of this sez consultancy inspection
	 */
	@Override
	public void setConsultancyEmail(String consultancyEmail) {
		model.setConsultancyEmail(consultancyEmail);
	}

	/**
	 * Sets the consultancy name of this sez consultancy inspection.
	 *
	 * @param consultancyName the consultancy name of this sez consultancy inspection
	 */
	@Override
	public void setConsultancyName(String consultancyName) {
		model.setConsultancyName(consultancyName);
	}

	/**
	 * Sets the consultancy phone num of this sez consultancy inspection.
	 *
	 * @param consultancyPhoneNum the consultancy phone num of this sez consultancy inspection
	 */
	@Override
	public void setConsultancyPhoneNum(String consultancyPhoneNum) {
		model.setConsultancyPhoneNum(consultancyPhoneNum);
	}

	/**
	 * Sets the consultancy sez status of this sez consultancy inspection.
	 *
	 * @param consultancySezStatus the consultancy sez status of this sez consultancy inspection
	 */
	@Override
	public void setConsultancySezStatus(String consultancySezStatus) {
		model.setConsultancySezStatus(consultancySezStatus);
	}

	/**
	 * Sets the consultancy time of this sez consultancy inspection.
	 *
	 * @param consultancyTime the consultancy time of this sez consultancy inspection
	 */
	@Override
	public void setConsultancyTime(String consultancyTime) {
		model.setConsultancyTime(consultancyTime);
	}

	/**
	 * Sets the create date of this sez consultancy inspection.
	 *
	 * @param createDate the create date of this sez consultancy inspection
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date for inspection of this sez consultancy inspection.
	 *
	 * @param dateForInspection the date for inspection of this sez consultancy inspection
	 */
	@Override
	public void setDateForInspection(Date dateForInspection) {
		model.setDateForInspection(dateForInspection);
	}

	/**
	 * Sets the do you want of this sez consultancy inspection.
	 *
	 * @param doYouWant the do you want of this sez consultancy inspection
	 */
	@Override
	public void setDoYouWant(String doYouWant) {
		model.setDoYouWant(doYouWant);
	}

	/**
	 * Sets the group ID of this sez consultancy inspection.
	 *
	 * @param groupId the group ID of this sez consultancy inspection
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez consultancy inspection.
	 *
	 * @param modifiedDate the modified date of this sez consultancy inspection
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this sez consultancy inspection.
	 *
	 * @param primaryKey the primary key of this sez consultancy inspection
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez consultancy inspection ID of this sez consultancy inspection.
	 *
	 * @param sezConsultancyInspectionId the sez consultancy inspection ID of this sez consultancy inspection
	 */
	@Override
	public void setSezConsultancyInspectionId(long sezConsultancyInspectionId) {
		model.setSezConsultancyInspectionId(sezConsultancyInspectionId);
	}

	/**
	 * Sets the user ID of this sez consultancy inspection.
	 *
	 * @param userId the user ID of this sez consultancy inspection
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez consultancy inspection.
	 *
	 * @param userName the user name of this sez consultancy inspection
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez consultancy inspection.
	 *
	 * @param userUuid the user uuid of this sez consultancy inspection
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
	protected SezConsultancyInspectionWrapper wrap(
		SezConsultancyInspection sezConsultancyInspection) {

		return new SezConsultancyInspectionWrapper(sezConsultancyInspection);
	}

}