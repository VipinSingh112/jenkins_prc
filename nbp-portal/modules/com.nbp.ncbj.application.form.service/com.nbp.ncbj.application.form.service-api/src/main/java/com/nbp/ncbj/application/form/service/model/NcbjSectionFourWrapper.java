/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NcbjSectionFour}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionFour
 * @generated
 */
public class NcbjSectionFourWrapper
	extends BaseModelWrapper<NcbjSectionFour>
	implements ModelWrapper<NcbjSectionFour>, NcbjSectionFour {

	public NcbjSectionFourWrapper(NcbjSectionFour ncbjSectionFour) {
		super(ncbjSectionFour);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ncbjSectionFourId", getNcbjSectionFourId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("consultService", getConsultService());
		attributes.put("consultTelephone", getConsultTelephone());
		attributes.put("consultEmail", getConsultEmail());
		attributes.put("consultStageOne", getConsultStageOne());
		attributes.put("consultStageTwo", getConsultStageTwo());
		attributes.put(
			"consultSurveillanceAudit", getConsultSurveillanceAudit());
		attributes.put(
			"consultRecertificationAudit", getConsultRecertificationAudit());
		attributes.put(
			"consultPreassessmentAudit", getConsultPreassessmentAudit());
		attributes.put("consultOtherService", getConsultOtherService());
		attributes.put("consultName", getConsultName());
		attributes.put("consultPosition", getConsultPosition());
		attributes.put("consultDate", getConsultDate());
		attributes.put("ncbjApplicationId", getNcbjApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncbjSectionFourId = (Long)attributes.get("ncbjSectionFourId");

		if (ncbjSectionFourId != null) {
			setNcbjSectionFourId(ncbjSectionFourId);
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

		String consultService = (String)attributes.get("consultService");

		if (consultService != null) {
			setConsultService(consultService);
		}

		String consultTelephone = (String)attributes.get("consultTelephone");

		if (consultTelephone != null) {
			setConsultTelephone(consultTelephone);
		}

		String consultEmail = (String)attributes.get("consultEmail");

		if (consultEmail != null) {
			setConsultEmail(consultEmail);
		}

		Date consultStageOne = (Date)attributes.get("consultStageOne");

		if (consultStageOne != null) {
			setConsultStageOne(consultStageOne);
		}

		Date consultStageTwo = (Date)attributes.get("consultStageTwo");

		if (consultStageTwo != null) {
			setConsultStageTwo(consultStageTwo);
		}

		Date consultSurveillanceAudit = (Date)attributes.get(
			"consultSurveillanceAudit");

		if (consultSurveillanceAudit != null) {
			setConsultSurveillanceAudit(consultSurveillanceAudit);
		}

		Date consultRecertificationAudit = (Date)attributes.get(
			"consultRecertificationAudit");

		if (consultRecertificationAudit != null) {
			setConsultRecertificationAudit(consultRecertificationAudit);
		}

		Date consultPreassessmentAudit = (Date)attributes.get(
			"consultPreassessmentAudit");

		if (consultPreassessmentAudit != null) {
			setConsultPreassessmentAudit(consultPreassessmentAudit);
		}

		Date consultOtherService = (Date)attributes.get("consultOtherService");

		if (consultOtherService != null) {
			setConsultOtherService(consultOtherService);
		}

		String consultName = (String)attributes.get("consultName");

		if (consultName != null) {
			setConsultName(consultName);
		}

		String consultPosition = (String)attributes.get("consultPosition");

		if (consultPosition != null) {
			setConsultPosition(consultPosition);
		}

		Date consultDate = (Date)attributes.get("consultDate");

		if (consultDate != null) {
			setConsultDate(consultDate);
		}

		Long ncbjApplicationId = (Long)attributes.get("ncbjApplicationId");

		if (ncbjApplicationId != null) {
			setNcbjApplicationId(ncbjApplicationId);
		}
	}

	@Override
	public NcbjSectionFour cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this ncbj section four.
	 *
	 * @return the company ID of this ncbj section four
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the consult date of this ncbj section four.
	 *
	 * @return the consult date of this ncbj section four
	 */
	@Override
	public Date getConsultDate() {
		return model.getConsultDate();
	}

	/**
	 * Returns the consult email of this ncbj section four.
	 *
	 * @return the consult email of this ncbj section four
	 */
	@Override
	public String getConsultEmail() {
		return model.getConsultEmail();
	}

	/**
	 * Returns the consult name of this ncbj section four.
	 *
	 * @return the consult name of this ncbj section four
	 */
	@Override
	public String getConsultName() {
		return model.getConsultName();
	}

	/**
	 * Returns the consult other service of this ncbj section four.
	 *
	 * @return the consult other service of this ncbj section four
	 */
	@Override
	public Date getConsultOtherService() {
		return model.getConsultOtherService();
	}

	/**
	 * Returns the consult position of this ncbj section four.
	 *
	 * @return the consult position of this ncbj section four
	 */
	@Override
	public String getConsultPosition() {
		return model.getConsultPosition();
	}

	/**
	 * Returns the consult preassessment audit of this ncbj section four.
	 *
	 * @return the consult preassessment audit of this ncbj section four
	 */
	@Override
	public Date getConsultPreassessmentAudit() {
		return model.getConsultPreassessmentAudit();
	}

	/**
	 * Returns the consult recertification audit of this ncbj section four.
	 *
	 * @return the consult recertification audit of this ncbj section four
	 */
	@Override
	public Date getConsultRecertificationAudit() {
		return model.getConsultRecertificationAudit();
	}

	/**
	 * Returns the consult service of this ncbj section four.
	 *
	 * @return the consult service of this ncbj section four
	 */
	@Override
	public String getConsultService() {
		return model.getConsultService();
	}

	/**
	 * Returns the consult stage one of this ncbj section four.
	 *
	 * @return the consult stage one of this ncbj section four
	 */
	@Override
	public Date getConsultStageOne() {
		return model.getConsultStageOne();
	}

	/**
	 * Returns the consult stage two of this ncbj section four.
	 *
	 * @return the consult stage two of this ncbj section four
	 */
	@Override
	public Date getConsultStageTwo() {
		return model.getConsultStageTwo();
	}

	/**
	 * Returns the consult surveillance audit of this ncbj section four.
	 *
	 * @return the consult surveillance audit of this ncbj section four
	 */
	@Override
	public Date getConsultSurveillanceAudit() {
		return model.getConsultSurveillanceAudit();
	}

	/**
	 * Returns the consult telephone of this ncbj section four.
	 *
	 * @return the consult telephone of this ncbj section four
	 */
	@Override
	public String getConsultTelephone() {
		return model.getConsultTelephone();
	}

	/**
	 * Returns the create date of this ncbj section four.
	 *
	 * @return the create date of this ncbj section four
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this ncbj section four.
	 *
	 * @return the group ID of this ncbj section four
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this ncbj section four.
	 *
	 * @return the modified date of this ncbj section four
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncbj application ID of this ncbj section four.
	 *
	 * @return the ncbj application ID of this ncbj section four
	 */
	@Override
	public long getNcbjApplicationId() {
		return model.getNcbjApplicationId();
	}

	/**
	 * Returns the ncbj section four ID of this ncbj section four.
	 *
	 * @return the ncbj section four ID of this ncbj section four
	 */
	@Override
	public long getNcbjSectionFourId() {
		return model.getNcbjSectionFourId();
	}

	/**
	 * Returns the primary key of this ncbj section four.
	 *
	 * @return the primary key of this ncbj section four
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this ncbj section four.
	 *
	 * @return the user ID of this ncbj section four
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj section four.
	 *
	 * @return the user name of this ncbj section four
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj section four.
	 *
	 * @return the user uuid of this ncbj section four
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
	 * Sets the company ID of this ncbj section four.
	 *
	 * @param companyId the company ID of this ncbj section four
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the consult date of this ncbj section four.
	 *
	 * @param consultDate the consult date of this ncbj section four
	 */
	@Override
	public void setConsultDate(Date consultDate) {
		model.setConsultDate(consultDate);
	}

	/**
	 * Sets the consult email of this ncbj section four.
	 *
	 * @param consultEmail the consult email of this ncbj section four
	 */
	@Override
	public void setConsultEmail(String consultEmail) {
		model.setConsultEmail(consultEmail);
	}

	/**
	 * Sets the consult name of this ncbj section four.
	 *
	 * @param consultName the consult name of this ncbj section four
	 */
	@Override
	public void setConsultName(String consultName) {
		model.setConsultName(consultName);
	}

	/**
	 * Sets the consult other service of this ncbj section four.
	 *
	 * @param consultOtherService the consult other service of this ncbj section four
	 */
	@Override
	public void setConsultOtherService(Date consultOtherService) {
		model.setConsultOtherService(consultOtherService);
	}

	/**
	 * Sets the consult position of this ncbj section four.
	 *
	 * @param consultPosition the consult position of this ncbj section four
	 */
	@Override
	public void setConsultPosition(String consultPosition) {
		model.setConsultPosition(consultPosition);
	}

	/**
	 * Sets the consult preassessment audit of this ncbj section four.
	 *
	 * @param consultPreassessmentAudit the consult preassessment audit of this ncbj section four
	 */
	@Override
	public void setConsultPreassessmentAudit(Date consultPreassessmentAudit) {
		model.setConsultPreassessmentAudit(consultPreassessmentAudit);
	}

	/**
	 * Sets the consult recertification audit of this ncbj section four.
	 *
	 * @param consultRecertificationAudit the consult recertification audit of this ncbj section four
	 */
	@Override
	public void setConsultRecertificationAudit(
		Date consultRecertificationAudit) {

		model.setConsultRecertificationAudit(consultRecertificationAudit);
	}

	/**
	 * Sets the consult service of this ncbj section four.
	 *
	 * @param consultService the consult service of this ncbj section four
	 */
	@Override
	public void setConsultService(String consultService) {
		model.setConsultService(consultService);
	}

	/**
	 * Sets the consult stage one of this ncbj section four.
	 *
	 * @param consultStageOne the consult stage one of this ncbj section four
	 */
	@Override
	public void setConsultStageOne(Date consultStageOne) {
		model.setConsultStageOne(consultStageOne);
	}

	/**
	 * Sets the consult stage two of this ncbj section four.
	 *
	 * @param consultStageTwo the consult stage two of this ncbj section four
	 */
	@Override
	public void setConsultStageTwo(Date consultStageTwo) {
		model.setConsultStageTwo(consultStageTwo);
	}

	/**
	 * Sets the consult surveillance audit of this ncbj section four.
	 *
	 * @param consultSurveillanceAudit the consult surveillance audit of this ncbj section four
	 */
	@Override
	public void setConsultSurveillanceAudit(Date consultSurveillanceAudit) {
		model.setConsultSurveillanceAudit(consultSurveillanceAudit);
	}

	/**
	 * Sets the consult telephone of this ncbj section four.
	 *
	 * @param consultTelephone the consult telephone of this ncbj section four
	 */
	@Override
	public void setConsultTelephone(String consultTelephone) {
		model.setConsultTelephone(consultTelephone);
	}

	/**
	 * Sets the create date of this ncbj section four.
	 *
	 * @param createDate the create date of this ncbj section four
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this ncbj section four.
	 *
	 * @param groupId the group ID of this ncbj section four
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this ncbj section four.
	 *
	 * @param modifiedDate the modified date of this ncbj section four
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncbj application ID of this ncbj section four.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj section four
	 */
	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		model.setNcbjApplicationId(ncbjApplicationId);
	}

	/**
	 * Sets the ncbj section four ID of this ncbj section four.
	 *
	 * @param ncbjSectionFourId the ncbj section four ID of this ncbj section four
	 */
	@Override
	public void setNcbjSectionFourId(long ncbjSectionFourId) {
		model.setNcbjSectionFourId(ncbjSectionFourId);
	}

	/**
	 * Sets the primary key of this ncbj section four.
	 *
	 * @param primaryKey the primary key of this ncbj section four
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this ncbj section four.
	 *
	 * @param userId the user ID of this ncbj section four
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj section four.
	 *
	 * @param userName the user name of this ncbj section four
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj section four.
	 *
	 * @param userUuid the user uuid of this ncbj section four
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
	protected NcbjSectionFourWrapper wrap(NcbjSectionFour ncbjSectionFour) {
		return new NcbjSectionFourWrapper(ncbjSectionFour);
	}

}