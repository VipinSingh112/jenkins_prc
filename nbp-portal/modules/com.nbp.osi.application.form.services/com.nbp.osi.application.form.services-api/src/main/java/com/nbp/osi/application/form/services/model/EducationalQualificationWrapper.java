/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EducationalQualification}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EducationalQualification
 * @generated
 */
public class EducationalQualificationWrapper
	extends BaseModelWrapper<EducationalQualification>
	implements EducationalQualification,
			   ModelWrapper<EducationalQualification> {

	public EducationalQualificationWrapper(
		EducationalQualification educationalQualification) {

		super(educationalQualification);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("educationalDetailId", getEducationalDetailId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("institution", getInstitution());
		attributes.put("qualificationType", getQualificationType());
		attributes.put("qualificationPeriod", getQualificationPeriod());
		attributes.put("qualificationGrade", getQualificationGrade());
		attributes.put("counter", getCounter());
		attributes.put("osiApplicationId", getOsiApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long educationalDetailId = (Long)attributes.get("educationalDetailId");

		if (educationalDetailId != null) {
			setEducationalDetailId(educationalDetailId);
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

		String institution = (String)attributes.get("institution");

		if (institution != null) {
			setInstitution(institution);
		}

		String qualificationType = (String)attributes.get("qualificationType");

		if (qualificationType != null) {
			setQualificationType(qualificationType);
		}

		Date qualificationPeriod = (Date)attributes.get("qualificationPeriod");

		if (qualificationPeriod != null) {
			setQualificationPeriod(qualificationPeriod);
		}

		String qualificationGrade = (String)attributes.get(
			"qualificationGrade");

		if (qualificationGrade != null) {
			setQualificationGrade(qualificationGrade);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long osiApplicationId = (Long)attributes.get("osiApplicationId");

		if (osiApplicationId != null) {
			setOsiApplicationId(osiApplicationId);
		}
	}

	@Override
	public EducationalQualification cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this educational qualification.
	 *
	 * @return the company ID of this educational qualification
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this educational qualification.
	 *
	 * @return the counter of this educational qualification
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this educational qualification.
	 *
	 * @return the create date of this educational qualification
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the educational detail ID of this educational qualification.
	 *
	 * @return the educational detail ID of this educational qualification
	 */
	@Override
	public long getEducationalDetailId() {
		return model.getEducationalDetailId();
	}

	/**
	 * Returns the group ID of this educational qualification.
	 *
	 * @return the group ID of this educational qualification
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the institution of this educational qualification.
	 *
	 * @return the institution of this educational qualification
	 */
	@Override
	public String getInstitution() {
		return model.getInstitution();
	}

	/**
	 * Returns the modified date of this educational qualification.
	 *
	 * @return the modified date of this educational qualification
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi application ID of this educational qualification.
	 *
	 * @return the osi application ID of this educational qualification
	 */
	@Override
	public long getOsiApplicationId() {
		return model.getOsiApplicationId();
	}

	/**
	 * Returns the primary key of this educational qualification.
	 *
	 * @return the primary key of this educational qualification
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the qualification grade of this educational qualification.
	 *
	 * @return the qualification grade of this educational qualification
	 */
	@Override
	public String getQualificationGrade() {
		return model.getQualificationGrade();
	}

	/**
	 * Returns the qualification period of this educational qualification.
	 *
	 * @return the qualification period of this educational qualification
	 */
	@Override
	public Date getQualificationPeriod() {
		return model.getQualificationPeriod();
	}

	/**
	 * Returns the qualification type of this educational qualification.
	 *
	 * @return the qualification type of this educational qualification
	 */
	@Override
	public String getQualificationType() {
		return model.getQualificationType();
	}

	/**
	 * Returns the user ID of this educational qualification.
	 *
	 * @return the user ID of this educational qualification
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this educational qualification.
	 *
	 * @return the user name of this educational qualification
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this educational qualification.
	 *
	 * @return the user uuid of this educational qualification
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this educational qualification.
	 *
	 * @return the uuid of this educational qualification
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this educational qualification.
	 *
	 * @param companyId the company ID of this educational qualification
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this educational qualification.
	 *
	 * @param counter the counter of this educational qualification
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this educational qualification.
	 *
	 * @param createDate the create date of this educational qualification
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the educational detail ID of this educational qualification.
	 *
	 * @param educationalDetailId the educational detail ID of this educational qualification
	 */
	@Override
	public void setEducationalDetailId(long educationalDetailId) {
		model.setEducationalDetailId(educationalDetailId);
	}

	/**
	 * Sets the group ID of this educational qualification.
	 *
	 * @param groupId the group ID of this educational qualification
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the institution of this educational qualification.
	 *
	 * @param institution the institution of this educational qualification
	 */
	@Override
	public void setInstitution(String institution) {
		model.setInstitution(institution);
	}

	/**
	 * Sets the modified date of this educational qualification.
	 *
	 * @param modifiedDate the modified date of this educational qualification
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi application ID of this educational qualification.
	 *
	 * @param osiApplicationId the osi application ID of this educational qualification
	 */
	@Override
	public void setOsiApplicationId(long osiApplicationId) {
		model.setOsiApplicationId(osiApplicationId);
	}

	/**
	 * Sets the primary key of this educational qualification.
	 *
	 * @param primaryKey the primary key of this educational qualification
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the qualification grade of this educational qualification.
	 *
	 * @param qualificationGrade the qualification grade of this educational qualification
	 */
	@Override
	public void setQualificationGrade(String qualificationGrade) {
		model.setQualificationGrade(qualificationGrade);
	}

	/**
	 * Sets the qualification period of this educational qualification.
	 *
	 * @param qualificationPeriod the qualification period of this educational qualification
	 */
	@Override
	public void setQualificationPeriod(Date qualificationPeriod) {
		model.setQualificationPeriod(qualificationPeriod);
	}

	/**
	 * Sets the qualification type of this educational qualification.
	 *
	 * @param qualificationType the qualification type of this educational qualification
	 */
	@Override
	public void setQualificationType(String qualificationType) {
		model.setQualificationType(qualificationType);
	}

	/**
	 * Sets the user ID of this educational qualification.
	 *
	 * @param userId the user ID of this educational qualification
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this educational qualification.
	 *
	 * @param userName the user name of this educational qualification
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this educational qualification.
	 *
	 * @param userUuid the user uuid of this educational qualification
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this educational qualification.
	 *
	 * @param uuid the uuid of this educational qualification
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected EducationalQualificationWrapper wrap(
		EducationalQualification educationalQualification) {

		return new EducationalQualificationWrapper(educationalQualification);
	}

}