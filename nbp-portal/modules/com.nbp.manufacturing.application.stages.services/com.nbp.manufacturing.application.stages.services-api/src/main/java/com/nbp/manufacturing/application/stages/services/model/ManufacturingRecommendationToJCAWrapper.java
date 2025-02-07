/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ManufacturingRecommendationToJCA}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingRecommendationToJCA
 * @generated
 */
public class ManufacturingRecommendationToJCAWrapper
	extends BaseModelWrapper<ManufacturingRecommendationToJCA>
	implements ManufacturingRecommendationToJCA,
			   ModelWrapper<ManufacturingRecommendationToJCA> {

	public ManufacturingRecommendationToJCAWrapper(
		ManufacturingRecommendationToJCA manufacturingRecommendationToJCA) {

		super(manufacturingRecommendationToJCA);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("manufacturingJCAId", getManufacturingJCAId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("date", getDate());
		attributes.put("recommendationToJCA", getRecommendationToJCA());
		attributes.put("recommendation", getRecommendation());
		attributes.put("numberOfMIICInspectors", getNumberOfMIICInspectors());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long manufacturingJCAId = (Long)attributes.get("manufacturingJCAId");

		if (manufacturingJCAId != null) {
			setManufacturingJCAId(manufacturingJCAId);
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

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		String recommendationToJCA = (String)attributes.get(
			"recommendationToJCA");

		if (recommendationToJCA != null) {
			setRecommendationToJCA(recommendationToJCA);
		}

		String recommendation = (String)attributes.get("recommendation");

		if (recommendation != null) {
			setRecommendation(recommendation);
		}

		String numberOfMIICInspectors = (String)attributes.get(
			"numberOfMIICInspectors");

		if (numberOfMIICInspectors != null) {
			setNumberOfMIICInspectors(numberOfMIICInspectors);
		}
	}

	@Override
	public ManufacturingRecommendationToJCA cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this manufacturing recommendation to jca.
	 *
	 * @return the case ID of this manufacturing recommendation to jca
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this manufacturing recommendation to jca.
	 *
	 * @return the company ID of this manufacturing recommendation to jca
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this manufacturing recommendation to jca.
	 *
	 * @return the create date of this manufacturing recommendation to jca
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of this manufacturing recommendation to jca.
	 *
	 * @return the date of this manufacturing recommendation to jca
	 */
	@Override
	public Date getDate() {
		return model.getDate();
	}

	/**
	 * Returns the group ID of this manufacturing recommendation to jca.
	 *
	 * @return the group ID of this manufacturing recommendation to jca
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the manufacturing jca ID of this manufacturing recommendation to jca.
	 *
	 * @return the manufacturing jca ID of this manufacturing recommendation to jca
	 */
	@Override
	public long getManufacturingJCAId() {
		return model.getManufacturingJCAId();
	}

	/**
	 * Returns the modified date of this manufacturing recommendation to jca.
	 *
	 * @return the modified date of this manufacturing recommendation to jca
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the number of miic inspectors of this manufacturing recommendation to jca.
	 *
	 * @return the number of miic inspectors of this manufacturing recommendation to jca
	 */
	@Override
	public String getNumberOfMIICInspectors() {
		return model.getNumberOfMIICInspectors();
	}

	/**
	 * Returns the primary key of this manufacturing recommendation to jca.
	 *
	 * @return the primary key of this manufacturing recommendation to jca
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the recommendation of this manufacturing recommendation to jca.
	 *
	 * @return the recommendation of this manufacturing recommendation to jca
	 */
	@Override
	public String getRecommendation() {
		return model.getRecommendation();
	}

	/**
	 * Returns the recommendation to jca of this manufacturing recommendation to jca.
	 *
	 * @return the recommendation to jca of this manufacturing recommendation to jca
	 */
	@Override
	public String getRecommendationToJCA() {
		return model.getRecommendationToJCA();
	}

	/**
	 * Returns the user ID of this manufacturing recommendation to jca.
	 *
	 * @return the user ID of this manufacturing recommendation to jca
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this manufacturing recommendation to jca.
	 *
	 * @return the user name of this manufacturing recommendation to jca
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this manufacturing recommendation to jca.
	 *
	 * @return the user uuid of this manufacturing recommendation to jca
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
	 * Sets the case ID of this manufacturing recommendation to jca.
	 *
	 * @param caseId the case ID of this manufacturing recommendation to jca
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this manufacturing recommendation to jca.
	 *
	 * @param companyId the company ID of this manufacturing recommendation to jca
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this manufacturing recommendation to jca.
	 *
	 * @param createDate the create date of this manufacturing recommendation to jca
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of this manufacturing recommendation to jca.
	 *
	 * @param date the date of this manufacturing recommendation to jca
	 */
	@Override
	public void setDate(Date date) {
		model.setDate(date);
	}

	/**
	 * Sets the group ID of this manufacturing recommendation to jca.
	 *
	 * @param groupId the group ID of this manufacturing recommendation to jca
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the manufacturing jca ID of this manufacturing recommendation to jca.
	 *
	 * @param manufacturingJCAId the manufacturing jca ID of this manufacturing recommendation to jca
	 */
	@Override
	public void setManufacturingJCAId(long manufacturingJCAId) {
		model.setManufacturingJCAId(manufacturingJCAId);
	}

	/**
	 * Sets the modified date of this manufacturing recommendation to jca.
	 *
	 * @param modifiedDate the modified date of this manufacturing recommendation to jca
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the number of miic inspectors of this manufacturing recommendation to jca.
	 *
	 * @param numberOfMIICInspectors the number of miic inspectors of this manufacturing recommendation to jca
	 */
	@Override
	public void setNumberOfMIICInspectors(String numberOfMIICInspectors) {
		model.setNumberOfMIICInspectors(numberOfMIICInspectors);
	}

	/**
	 * Sets the primary key of this manufacturing recommendation to jca.
	 *
	 * @param primaryKey the primary key of this manufacturing recommendation to jca
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the recommendation of this manufacturing recommendation to jca.
	 *
	 * @param recommendation the recommendation of this manufacturing recommendation to jca
	 */
	@Override
	public void setRecommendation(String recommendation) {
		model.setRecommendation(recommendation);
	}

	/**
	 * Sets the recommendation to jca of this manufacturing recommendation to jca.
	 *
	 * @param recommendationToJCA the recommendation to jca of this manufacturing recommendation to jca
	 */
	@Override
	public void setRecommendationToJCA(String recommendationToJCA) {
		model.setRecommendationToJCA(recommendationToJCA);
	}

	/**
	 * Sets the user ID of this manufacturing recommendation to jca.
	 *
	 * @param userId the user ID of this manufacturing recommendation to jca
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this manufacturing recommendation to jca.
	 *
	 * @param userName the user name of this manufacturing recommendation to jca
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this manufacturing recommendation to jca.
	 *
	 * @param userUuid the user uuid of this manufacturing recommendation to jca
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
	protected ManufacturingRecommendationToJCAWrapper wrap(
		ManufacturingRecommendationToJCA manufacturingRecommendationToJCA) {

		return new ManufacturingRecommendationToJCAWrapper(
			manufacturingRecommendationToJCA);
	}

}