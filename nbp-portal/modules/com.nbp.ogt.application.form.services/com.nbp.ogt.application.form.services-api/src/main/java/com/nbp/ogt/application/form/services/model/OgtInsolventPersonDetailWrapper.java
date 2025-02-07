/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OgtInsolventPersonDetail}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OgtInsolventPersonDetail
 * @generated
 */
public class OgtInsolventPersonDetailWrapper
	extends BaseModelWrapper<OgtInsolventPersonDetail>
	implements ModelWrapper<OgtInsolventPersonDetail>,
			   OgtInsolventPersonDetail {

	public OgtInsolventPersonDetailWrapper(
		OgtInsolventPersonDetail ogtInsolventPersonDetail) {

		super(ogtInsolventPersonDetail);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"ogtInsolventPersonDetailId", getOgtInsolventPersonDetailId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("natureOfInsolvent", getNatureOfInsolvent());
		attributes.put("insolventFirstName", getInsolventFirstName());
		attributes.put("insolventLastName", getInsolventLastName());
		attributes.put("insolventCompanyName", getInsolventCompanyName());
		attributes.put("insolventDebtStatute", getInsolventDebtStatute());
		attributes.put("ogtApplicationId", getOgtApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ogtInsolventPersonDetailId = (Long)attributes.get(
			"ogtInsolventPersonDetailId");

		if (ogtInsolventPersonDetailId != null) {
			setOgtInsolventPersonDetailId(ogtInsolventPersonDetailId);
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

		String natureOfInsolvent = (String)attributes.get("natureOfInsolvent");

		if (natureOfInsolvent != null) {
			setNatureOfInsolvent(natureOfInsolvent);
		}

		String insolventFirstName = (String)attributes.get(
			"insolventFirstName");

		if (insolventFirstName != null) {
			setInsolventFirstName(insolventFirstName);
		}

		String insolventLastName = (String)attributes.get("insolventLastName");

		if (insolventLastName != null) {
			setInsolventLastName(insolventLastName);
		}

		String insolventCompanyName = (String)attributes.get(
			"insolventCompanyName");

		if (insolventCompanyName != null) {
			setInsolventCompanyName(insolventCompanyName);
		}

		String insolventDebtStatute = (String)attributes.get(
			"insolventDebtStatute");

		if (insolventDebtStatute != null) {
			setInsolventDebtStatute(insolventDebtStatute);
		}

		Long ogtApplicationId = (Long)attributes.get("ogtApplicationId");

		if (ogtApplicationId != null) {
			setOgtApplicationId(ogtApplicationId);
		}
	}

	@Override
	public OgtInsolventPersonDetail cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this ogt insolvent person detail.
	 *
	 * @return the company ID of this ogt insolvent person detail
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ogt insolvent person detail.
	 *
	 * @return the create date of this ogt insolvent person detail
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this ogt insolvent person detail.
	 *
	 * @return the group ID of this ogt insolvent person detail
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the insolvent company name of this ogt insolvent person detail.
	 *
	 * @return the insolvent company name of this ogt insolvent person detail
	 */
	@Override
	public String getInsolventCompanyName() {
		return model.getInsolventCompanyName();
	}

	/**
	 * Returns the insolvent debt statute of this ogt insolvent person detail.
	 *
	 * @return the insolvent debt statute of this ogt insolvent person detail
	 */
	@Override
	public String getInsolventDebtStatute() {
		return model.getInsolventDebtStatute();
	}

	/**
	 * Returns the insolvent first name of this ogt insolvent person detail.
	 *
	 * @return the insolvent first name of this ogt insolvent person detail
	 */
	@Override
	public String getInsolventFirstName() {
		return model.getInsolventFirstName();
	}

	/**
	 * Returns the insolvent last name of this ogt insolvent person detail.
	 *
	 * @return the insolvent last name of this ogt insolvent person detail
	 */
	@Override
	public String getInsolventLastName() {
		return model.getInsolventLastName();
	}

	/**
	 * Returns the modified date of this ogt insolvent person detail.
	 *
	 * @return the modified date of this ogt insolvent person detail
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nature of insolvent of this ogt insolvent person detail.
	 *
	 * @return the nature of insolvent of this ogt insolvent person detail
	 */
	@Override
	public String getNatureOfInsolvent() {
		return model.getNatureOfInsolvent();
	}

	/**
	 * Returns the ogt application ID of this ogt insolvent person detail.
	 *
	 * @return the ogt application ID of this ogt insolvent person detail
	 */
	@Override
	public long getOgtApplicationId() {
		return model.getOgtApplicationId();
	}

	/**
	 * Returns the ogt insolvent person detail ID of this ogt insolvent person detail.
	 *
	 * @return the ogt insolvent person detail ID of this ogt insolvent person detail
	 */
	@Override
	public long getOgtInsolventPersonDetailId() {
		return model.getOgtInsolventPersonDetailId();
	}

	/**
	 * Returns the primary key of this ogt insolvent person detail.
	 *
	 * @return the primary key of this ogt insolvent person detail
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this ogt insolvent person detail.
	 *
	 * @return the user ID of this ogt insolvent person detail
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ogt insolvent person detail.
	 *
	 * @return the user name of this ogt insolvent person detail
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ogt insolvent person detail.
	 *
	 * @return the user uuid of this ogt insolvent person detail
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
	 * Sets the company ID of this ogt insolvent person detail.
	 *
	 * @param companyId the company ID of this ogt insolvent person detail
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ogt insolvent person detail.
	 *
	 * @param createDate the create date of this ogt insolvent person detail
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this ogt insolvent person detail.
	 *
	 * @param groupId the group ID of this ogt insolvent person detail
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the insolvent company name of this ogt insolvent person detail.
	 *
	 * @param insolventCompanyName the insolvent company name of this ogt insolvent person detail
	 */
	@Override
	public void setInsolventCompanyName(String insolventCompanyName) {
		model.setInsolventCompanyName(insolventCompanyName);
	}

	/**
	 * Sets the insolvent debt statute of this ogt insolvent person detail.
	 *
	 * @param insolventDebtStatute the insolvent debt statute of this ogt insolvent person detail
	 */
	@Override
	public void setInsolventDebtStatute(String insolventDebtStatute) {
		model.setInsolventDebtStatute(insolventDebtStatute);
	}

	/**
	 * Sets the insolvent first name of this ogt insolvent person detail.
	 *
	 * @param insolventFirstName the insolvent first name of this ogt insolvent person detail
	 */
	@Override
	public void setInsolventFirstName(String insolventFirstName) {
		model.setInsolventFirstName(insolventFirstName);
	}

	/**
	 * Sets the insolvent last name of this ogt insolvent person detail.
	 *
	 * @param insolventLastName the insolvent last name of this ogt insolvent person detail
	 */
	@Override
	public void setInsolventLastName(String insolventLastName) {
		model.setInsolventLastName(insolventLastName);
	}

	/**
	 * Sets the modified date of this ogt insolvent person detail.
	 *
	 * @param modifiedDate the modified date of this ogt insolvent person detail
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nature of insolvent of this ogt insolvent person detail.
	 *
	 * @param natureOfInsolvent the nature of insolvent of this ogt insolvent person detail
	 */
	@Override
	public void setNatureOfInsolvent(String natureOfInsolvent) {
		model.setNatureOfInsolvent(natureOfInsolvent);
	}

	/**
	 * Sets the ogt application ID of this ogt insolvent person detail.
	 *
	 * @param ogtApplicationId the ogt application ID of this ogt insolvent person detail
	 */
	@Override
	public void setOgtApplicationId(long ogtApplicationId) {
		model.setOgtApplicationId(ogtApplicationId);
	}

	/**
	 * Sets the ogt insolvent person detail ID of this ogt insolvent person detail.
	 *
	 * @param ogtInsolventPersonDetailId the ogt insolvent person detail ID of this ogt insolvent person detail
	 */
	@Override
	public void setOgtInsolventPersonDetailId(long ogtInsolventPersonDetailId) {
		model.setOgtInsolventPersonDetailId(ogtInsolventPersonDetailId);
	}

	/**
	 * Sets the primary key of this ogt insolvent person detail.
	 *
	 * @param primaryKey the primary key of this ogt insolvent person detail
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this ogt insolvent person detail.
	 *
	 * @param userId the user ID of this ogt insolvent person detail
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ogt insolvent person detail.
	 *
	 * @param userName the user name of this ogt insolvent person detail
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ogt insolvent person detail.
	 *
	 * @param userUuid the user uuid of this ogt insolvent person detail
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
	protected OgtInsolventPersonDetailWrapper wrap(
		OgtInsolventPersonDetail ogtInsolventPersonDetail) {

		return new OgtInsolventPersonDetailWrapper(ogtInsolventPersonDetail);
	}

}