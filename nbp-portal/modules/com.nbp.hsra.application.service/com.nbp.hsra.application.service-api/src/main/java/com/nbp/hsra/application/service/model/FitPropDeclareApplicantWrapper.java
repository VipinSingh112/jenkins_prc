/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FitPropDeclareApplicant}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FitPropDeclareApplicant
 * @generated
 */
public class FitPropDeclareApplicantWrapper
	extends BaseModelWrapper<FitPropDeclareApplicant>
	implements FitPropDeclareApplicant, ModelWrapper<FitPropDeclareApplicant> {

	public FitPropDeclareApplicantWrapper(
		FitPropDeclareApplicant fitPropDeclareApplicant) {

		super(fitPropDeclareApplicant);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"fitPropDeclareApplicantId", getFitPropDeclareApplicantId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nameApplicant", getNameApplicant());
		attributes.put("dateApplicant", getDateApplicant());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fitPropDeclareApplicantId = (Long)attributes.get(
			"fitPropDeclareApplicantId");

		if (fitPropDeclareApplicantId != null) {
			setFitPropDeclareApplicantId(fitPropDeclareApplicantId);
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

		String nameApplicant = (String)attributes.get("nameApplicant");

		if (nameApplicant != null) {
			setNameApplicant(nameApplicant);
		}

		Date dateApplicant = (Date)attributes.get("dateApplicant");

		if (dateApplicant != null) {
			setDateApplicant(dateApplicant);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public FitPropDeclareApplicant cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this fit prop declare applicant.
	 *
	 * @return the company ID of this fit prop declare applicant
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this fit prop declare applicant.
	 *
	 * @return the create date of this fit prop declare applicant
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date applicant of this fit prop declare applicant.
	 *
	 * @return the date applicant of this fit prop declare applicant
	 */
	@Override
	public Date getDateApplicant() {
		return model.getDateApplicant();
	}

	/**
	 * Returns the fit prop declare applicant ID of this fit prop declare applicant.
	 *
	 * @return the fit prop declare applicant ID of this fit prop declare applicant
	 */
	@Override
	public long getFitPropDeclareApplicantId() {
		return model.getFitPropDeclareApplicantId();
	}

	/**
	 * Returns the group ID of this fit prop declare applicant.
	 *
	 * @return the group ID of this fit prop declare applicant
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this fit prop declare applicant.
	 *
	 * @return the hsra application ID of this fit prop declare applicant
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the modified date of this fit prop declare applicant.
	 *
	 * @return the modified date of this fit prop declare applicant
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name applicant of this fit prop declare applicant.
	 *
	 * @return the name applicant of this fit prop declare applicant
	 */
	@Override
	public String getNameApplicant() {
		return model.getNameApplicant();
	}

	/**
	 * Returns the primary key of this fit prop declare applicant.
	 *
	 * @return the primary key of this fit prop declare applicant
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this fit prop declare applicant.
	 *
	 * @return the user ID of this fit prop declare applicant
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this fit prop declare applicant.
	 *
	 * @return the user name of this fit prop declare applicant
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this fit prop declare applicant.
	 *
	 * @return the user uuid of this fit prop declare applicant
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
	 * Sets the company ID of this fit prop declare applicant.
	 *
	 * @param companyId the company ID of this fit prop declare applicant
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this fit prop declare applicant.
	 *
	 * @param createDate the create date of this fit prop declare applicant
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date applicant of this fit prop declare applicant.
	 *
	 * @param dateApplicant the date applicant of this fit prop declare applicant
	 */
	@Override
	public void setDateApplicant(Date dateApplicant) {
		model.setDateApplicant(dateApplicant);
	}

	/**
	 * Sets the fit prop declare applicant ID of this fit prop declare applicant.
	 *
	 * @param fitPropDeclareApplicantId the fit prop declare applicant ID of this fit prop declare applicant
	 */
	@Override
	public void setFitPropDeclareApplicantId(long fitPropDeclareApplicantId) {
		model.setFitPropDeclareApplicantId(fitPropDeclareApplicantId);
	}

	/**
	 * Sets the group ID of this fit prop declare applicant.
	 *
	 * @param groupId the group ID of this fit prop declare applicant
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this fit prop declare applicant.
	 *
	 * @param hsraApplicationId the hsra application ID of this fit prop declare applicant
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the modified date of this fit prop declare applicant.
	 *
	 * @param modifiedDate the modified date of this fit prop declare applicant
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name applicant of this fit prop declare applicant.
	 *
	 * @param nameApplicant the name applicant of this fit prop declare applicant
	 */
	@Override
	public void setNameApplicant(String nameApplicant) {
		model.setNameApplicant(nameApplicant);
	}

	/**
	 * Sets the primary key of this fit prop declare applicant.
	 *
	 * @param primaryKey the primary key of this fit prop declare applicant
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this fit prop declare applicant.
	 *
	 * @param userId the user ID of this fit prop declare applicant
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this fit prop declare applicant.
	 *
	 * @param userName the user name of this fit prop declare applicant
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this fit prop declare applicant.
	 *
	 * @param userUuid the user uuid of this fit prop declare applicant
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
	protected FitPropDeclareApplicantWrapper wrap(
		FitPropDeclareApplicant fitPropDeclareApplicant) {

		return new FitPropDeclareApplicantWrapper(fitPropDeclareApplicant);
	}

}