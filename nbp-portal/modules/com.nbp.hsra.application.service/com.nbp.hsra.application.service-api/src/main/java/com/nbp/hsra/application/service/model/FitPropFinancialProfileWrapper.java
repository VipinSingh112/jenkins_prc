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
 * This class is a wrapper for {@link FitPropFinancialProfile}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FitPropFinancialProfile
 * @generated
 */
public class FitPropFinancialProfileWrapper
	extends BaseModelWrapper<FitPropFinancialProfile>
	implements FitPropFinancialProfile, ModelWrapper<FitPropFinancialProfile> {

	public FitPropFinancialProfileWrapper(
		FitPropFinancialProfile fitPropFinancialProfile) {

		super(fitPropFinancialProfile);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"fitPropFinancialProfileId", getFitPropFinancialProfileId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("financialInstitution", getFinancialInstitution());
		attributes.put("creditfacility", getCreditfacility());
		attributes.put("surroundingAction", getSurroundingAction());
		attributes.put("jamaicaInstitution", getJamaicaInstitution());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fitPropFinancialProfileId = (Long)attributes.get(
			"fitPropFinancialProfileId");

		if (fitPropFinancialProfileId != null) {
			setFitPropFinancialProfileId(fitPropFinancialProfileId);
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

		String financialInstitution = (String)attributes.get(
			"financialInstitution");

		if (financialInstitution != null) {
			setFinancialInstitution(financialInstitution);
		}

		String creditfacility = (String)attributes.get("creditfacility");

		if (creditfacility != null) {
			setCreditfacility(creditfacility);
		}

		String surroundingAction = (String)attributes.get("surroundingAction");

		if (surroundingAction != null) {
			setSurroundingAction(surroundingAction);
		}

		String jamaicaInstitution = (String)attributes.get(
			"jamaicaInstitution");

		if (jamaicaInstitution != null) {
			setJamaicaInstitution(jamaicaInstitution);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public FitPropFinancialProfile cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this fit prop financial profile.
	 *
	 * @return the company ID of this fit prop financial profile
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this fit prop financial profile.
	 *
	 * @return the create date of this fit prop financial profile
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the creditfacility of this fit prop financial profile.
	 *
	 * @return the creditfacility of this fit prop financial profile
	 */
	@Override
	public String getCreditfacility() {
		return model.getCreditfacility();
	}

	/**
	 * Returns the financial institution of this fit prop financial profile.
	 *
	 * @return the financial institution of this fit prop financial profile
	 */
	@Override
	public String getFinancialInstitution() {
		return model.getFinancialInstitution();
	}

	/**
	 * Returns the fit prop financial profile ID of this fit prop financial profile.
	 *
	 * @return the fit prop financial profile ID of this fit prop financial profile
	 */
	@Override
	public long getFitPropFinancialProfileId() {
		return model.getFitPropFinancialProfileId();
	}

	/**
	 * Returns the group ID of this fit prop financial profile.
	 *
	 * @return the group ID of this fit prop financial profile
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this fit prop financial profile.
	 *
	 * @return the hsra application ID of this fit prop financial profile
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the jamaica institution of this fit prop financial profile.
	 *
	 * @return the jamaica institution of this fit prop financial profile
	 */
	@Override
	public String getJamaicaInstitution() {
		return model.getJamaicaInstitution();
	}

	/**
	 * Returns the modified date of this fit prop financial profile.
	 *
	 * @return the modified date of this fit prop financial profile
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this fit prop financial profile.
	 *
	 * @return the primary key of this fit prop financial profile
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the surrounding action of this fit prop financial profile.
	 *
	 * @return the surrounding action of this fit prop financial profile
	 */
	@Override
	public String getSurroundingAction() {
		return model.getSurroundingAction();
	}

	/**
	 * Returns the user ID of this fit prop financial profile.
	 *
	 * @return the user ID of this fit prop financial profile
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this fit prop financial profile.
	 *
	 * @return the user name of this fit prop financial profile
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this fit prop financial profile.
	 *
	 * @return the user uuid of this fit prop financial profile
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
	 * Sets the company ID of this fit prop financial profile.
	 *
	 * @param companyId the company ID of this fit prop financial profile
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this fit prop financial profile.
	 *
	 * @param createDate the create date of this fit prop financial profile
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the creditfacility of this fit prop financial profile.
	 *
	 * @param creditfacility the creditfacility of this fit prop financial profile
	 */
	@Override
	public void setCreditfacility(String creditfacility) {
		model.setCreditfacility(creditfacility);
	}

	/**
	 * Sets the financial institution of this fit prop financial profile.
	 *
	 * @param financialInstitution the financial institution of this fit prop financial profile
	 */
	@Override
	public void setFinancialInstitution(String financialInstitution) {
		model.setFinancialInstitution(financialInstitution);
	}

	/**
	 * Sets the fit prop financial profile ID of this fit prop financial profile.
	 *
	 * @param fitPropFinancialProfileId the fit prop financial profile ID of this fit prop financial profile
	 */
	@Override
	public void setFitPropFinancialProfileId(long fitPropFinancialProfileId) {
		model.setFitPropFinancialProfileId(fitPropFinancialProfileId);
	}

	/**
	 * Sets the group ID of this fit prop financial profile.
	 *
	 * @param groupId the group ID of this fit prop financial profile
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this fit prop financial profile.
	 *
	 * @param hsraApplicationId the hsra application ID of this fit prop financial profile
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the jamaica institution of this fit prop financial profile.
	 *
	 * @param jamaicaInstitution the jamaica institution of this fit prop financial profile
	 */
	@Override
	public void setJamaicaInstitution(String jamaicaInstitution) {
		model.setJamaicaInstitution(jamaicaInstitution);
	}

	/**
	 * Sets the modified date of this fit prop financial profile.
	 *
	 * @param modifiedDate the modified date of this fit prop financial profile
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this fit prop financial profile.
	 *
	 * @param primaryKey the primary key of this fit prop financial profile
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the surrounding action of this fit prop financial profile.
	 *
	 * @param surroundingAction the surrounding action of this fit prop financial profile
	 */
	@Override
	public void setSurroundingAction(String surroundingAction) {
		model.setSurroundingAction(surroundingAction);
	}

	/**
	 * Sets the user ID of this fit prop financial profile.
	 *
	 * @param userId the user ID of this fit prop financial profile
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this fit prop financial profile.
	 *
	 * @param userName the user name of this fit prop financial profile
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this fit prop financial profile.
	 *
	 * @param userUuid the user uuid of this fit prop financial profile
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
	protected FitPropFinancialProfileWrapper wrap(
		FitPropFinancialProfile fitPropFinancialProfile) {

		return new FitPropFinancialProfileWrapper(fitPropFinancialProfile);
	}

}