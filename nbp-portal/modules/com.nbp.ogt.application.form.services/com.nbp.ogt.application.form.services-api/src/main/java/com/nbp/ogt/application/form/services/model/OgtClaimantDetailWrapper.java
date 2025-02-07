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
 * This class is a wrapper for {@link OgtClaimantDetail}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OgtClaimantDetail
 * @generated
 */
public class OgtClaimantDetailWrapper
	extends BaseModelWrapper<OgtClaimantDetail>
	implements ModelWrapper<OgtClaimantDetail>, OgtClaimantDetail {

	public OgtClaimantDetailWrapper(OgtClaimantDetail ogtClaimantDetail) {
		super(ogtClaimantDetail);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ogtClaimantDetailId", getOgtClaimantDetailId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("claimantName", getClaimantName());
		attributes.put("claimantFirstName", getClaimantFirstName());
		attributes.put("claimantLastName", getClaimantLastName());
		attributes.put("claimantCompanyName", getClaimantCompanyName());
		attributes.put("claimantAddress", getClaimantAddress());
		attributes.put("claimantEmailAddr", getClaimantEmailAddr());
		attributes.put("claimantTeleNum", getClaimantTeleNum());
		attributes.put("claimantFaxNo", getClaimantFaxNo());
		attributes.put("claimantDate", getClaimantDate());
		attributes.put("claimantTrn", getClaimantTrn());
		attributes.put("claimantRelative", getClaimantRelative());
		attributes.put("ogtApplicationId", getOgtApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ogtClaimantDetailId = (Long)attributes.get("ogtClaimantDetailId");

		if (ogtClaimantDetailId != null) {
			setOgtClaimantDetailId(ogtClaimantDetailId);
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

		String claimantName = (String)attributes.get("claimantName");

		if (claimantName != null) {
			setClaimantName(claimantName);
		}

		String claimantFirstName = (String)attributes.get("claimantFirstName");

		if (claimantFirstName != null) {
			setClaimantFirstName(claimantFirstName);
		}

		String claimantLastName = (String)attributes.get("claimantLastName");

		if (claimantLastName != null) {
			setClaimantLastName(claimantLastName);
		}

		String claimantCompanyName = (String)attributes.get(
			"claimantCompanyName");

		if (claimantCompanyName != null) {
			setClaimantCompanyName(claimantCompanyName);
		}

		String claimantAddress = (String)attributes.get("claimantAddress");

		if (claimantAddress != null) {
			setClaimantAddress(claimantAddress);
		}

		String claimantEmailAddr = (String)attributes.get("claimantEmailAddr");

		if (claimantEmailAddr != null) {
			setClaimantEmailAddr(claimantEmailAddr);
		}

		String claimantTeleNum = (String)attributes.get("claimantTeleNum");

		if (claimantTeleNum != null) {
			setClaimantTeleNum(claimantTeleNum);
		}

		String claimantFaxNo = (String)attributes.get("claimantFaxNo");

		if (claimantFaxNo != null) {
			setClaimantFaxNo(claimantFaxNo);
		}

		Date claimantDate = (Date)attributes.get("claimantDate");

		if (claimantDate != null) {
			setClaimantDate(claimantDate);
		}

		String claimantTrn = (String)attributes.get("claimantTrn");

		if (claimantTrn != null) {
			setClaimantTrn(claimantTrn);
		}

		String claimantRelative = (String)attributes.get("claimantRelative");

		if (claimantRelative != null) {
			setClaimantRelative(claimantRelative);
		}

		Long ogtApplicationId = (Long)attributes.get("ogtApplicationId");

		if (ogtApplicationId != null) {
			setOgtApplicationId(ogtApplicationId);
		}
	}

	@Override
	public OgtClaimantDetail cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the claimant address of this ogt claimant detail.
	 *
	 * @return the claimant address of this ogt claimant detail
	 */
	@Override
	public String getClaimantAddress() {
		return model.getClaimantAddress();
	}

	/**
	 * Returns the claimant company name of this ogt claimant detail.
	 *
	 * @return the claimant company name of this ogt claimant detail
	 */
	@Override
	public String getClaimantCompanyName() {
		return model.getClaimantCompanyName();
	}

	/**
	 * Returns the claimant date of this ogt claimant detail.
	 *
	 * @return the claimant date of this ogt claimant detail
	 */
	@Override
	public Date getClaimantDate() {
		return model.getClaimantDate();
	}

	/**
	 * Returns the claimant email addr of this ogt claimant detail.
	 *
	 * @return the claimant email addr of this ogt claimant detail
	 */
	@Override
	public String getClaimantEmailAddr() {
		return model.getClaimantEmailAddr();
	}

	/**
	 * Returns the claimant fax no of this ogt claimant detail.
	 *
	 * @return the claimant fax no of this ogt claimant detail
	 */
	@Override
	public String getClaimantFaxNo() {
		return model.getClaimantFaxNo();
	}

	/**
	 * Returns the claimant first name of this ogt claimant detail.
	 *
	 * @return the claimant first name of this ogt claimant detail
	 */
	@Override
	public String getClaimantFirstName() {
		return model.getClaimantFirstName();
	}

	/**
	 * Returns the claimant last name of this ogt claimant detail.
	 *
	 * @return the claimant last name of this ogt claimant detail
	 */
	@Override
	public String getClaimantLastName() {
		return model.getClaimantLastName();
	}

	/**
	 * Returns the claimant name of this ogt claimant detail.
	 *
	 * @return the claimant name of this ogt claimant detail
	 */
	@Override
	public String getClaimantName() {
		return model.getClaimantName();
	}

	/**
	 * Returns the claimant relative of this ogt claimant detail.
	 *
	 * @return the claimant relative of this ogt claimant detail
	 */
	@Override
	public String getClaimantRelative() {
		return model.getClaimantRelative();
	}

	/**
	 * Returns the claimant tele num of this ogt claimant detail.
	 *
	 * @return the claimant tele num of this ogt claimant detail
	 */
	@Override
	public String getClaimantTeleNum() {
		return model.getClaimantTeleNum();
	}

	/**
	 * Returns the claimant trn of this ogt claimant detail.
	 *
	 * @return the claimant trn of this ogt claimant detail
	 */
	@Override
	public String getClaimantTrn() {
		return model.getClaimantTrn();
	}

	/**
	 * Returns the company ID of this ogt claimant detail.
	 *
	 * @return the company ID of this ogt claimant detail
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ogt claimant detail.
	 *
	 * @return the create date of this ogt claimant detail
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this ogt claimant detail.
	 *
	 * @return the group ID of this ogt claimant detail
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this ogt claimant detail.
	 *
	 * @return the modified date of this ogt claimant detail
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ogt application ID of this ogt claimant detail.
	 *
	 * @return the ogt application ID of this ogt claimant detail
	 */
	@Override
	public long getOgtApplicationId() {
		return model.getOgtApplicationId();
	}

	/**
	 * Returns the ogt claimant detail ID of this ogt claimant detail.
	 *
	 * @return the ogt claimant detail ID of this ogt claimant detail
	 */
	@Override
	public long getOgtClaimantDetailId() {
		return model.getOgtClaimantDetailId();
	}

	/**
	 * Returns the primary key of this ogt claimant detail.
	 *
	 * @return the primary key of this ogt claimant detail
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this ogt claimant detail.
	 *
	 * @return the user ID of this ogt claimant detail
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ogt claimant detail.
	 *
	 * @return the user name of this ogt claimant detail
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ogt claimant detail.
	 *
	 * @return the user uuid of this ogt claimant detail
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
	 * Sets the claimant address of this ogt claimant detail.
	 *
	 * @param claimantAddress the claimant address of this ogt claimant detail
	 */
	@Override
	public void setClaimantAddress(String claimantAddress) {
		model.setClaimantAddress(claimantAddress);
	}

	/**
	 * Sets the claimant company name of this ogt claimant detail.
	 *
	 * @param claimantCompanyName the claimant company name of this ogt claimant detail
	 */
	@Override
	public void setClaimantCompanyName(String claimantCompanyName) {
		model.setClaimantCompanyName(claimantCompanyName);
	}

	/**
	 * Sets the claimant date of this ogt claimant detail.
	 *
	 * @param claimantDate the claimant date of this ogt claimant detail
	 */
	@Override
	public void setClaimantDate(Date claimantDate) {
		model.setClaimantDate(claimantDate);
	}

	/**
	 * Sets the claimant email addr of this ogt claimant detail.
	 *
	 * @param claimantEmailAddr the claimant email addr of this ogt claimant detail
	 */
	@Override
	public void setClaimantEmailAddr(String claimantEmailAddr) {
		model.setClaimantEmailAddr(claimantEmailAddr);
	}

	/**
	 * Sets the claimant fax no of this ogt claimant detail.
	 *
	 * @param claimantFaxNo the claimant fax no of this ogt claimant detail
	 */
	@Override
	public void setClaimantFaxNo(String claimantFaxNo) {
		model.setClaimantFaxNo(claimantFaxNo);
	}

	/**
	 * Sets the claimant first name of this ogt claimant detail.
	 *
	 * @param claimantFirstName the claimant first name of this ogt claimant detail
	 */
	@Override
	public void setClaimantFirstName(String claimantFirstName) {
		model.setClaimantFirstName(claimantFirstName);
	}

	/**
	 * Sets the claimant last name of this ogt claimant detail.
	 *
	 * @param claimantLastName the claimant last name of this ogt claimant detail
	 */
	@Override
	public void setClaimantLastName(String claimantLastName) {
		model.setClaimantLastName(claimantLastName);
	}

	/**
	 * Sets the claimant name of this ogt claimant detail.
	 *
	 * @param claimantName the claimant name of this ogt claimant detail
	 */
	@Override
	public void setClaimantName(String claimantName) {
		model.setClaimantName(claimantName);
	}

	/**
	 * Sets the claimant relative of this ogt claimant detail.
	 *
	 * @param claimantRelative the claimant relative of this ogt claimant detail
	 */
	@Override
	public void setClaimantRelative(String claimantRelative) {
		model.setClaimantRelative(claimantRelative);
	}

	/**
	 * Sets the claimant tele num of this ogt claimant detail.
	 *
	 * @param claimantTeleNum the claimant tele num of this ogt claimant detail
	 */
	@Override
	public void setClaimantTeleNum(String claimantTeleNum) {
		model.setClaimantTeleNum(claimantTeleNum);
	}

	/**
	 * Sets the claimant trn of this ogt claimant detail.
	 *
	 * @param claimantTrn the claimant trn of this ogt claimant detail
	 */
	@Override
	public void setClaimantTrn(String claimantTrn) {
		model.setClaimantTrn(claimantTrn);
	}

	/**
	 * Sets the company ID of this ogt claimant detail.
	 *
	 * @param companyId the company ID of this ogt claimant detail
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ogt claimant detail.
	 *
	 * @param createDate the create date of this ogt claimant detail
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this ogt claimant detail.
	 *
	 * @param groupId the group ID of this ogt claimant detail
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this ogt claimant detail.
	 *
	 * @param modifiedDate the modified date of this ogt claimant detail
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ogt application ID of this ogt claimant detail.
	 *
	 * @param ogtApplicationId the ogt application ID of this ogt claimant detail
	 */
	@Override
	public void setOgtApplicationId(long ogtApplicationId) {
		model.setOgtApplicationId(ogtApplicationId);
	}

	/**
	 * Sets the ogt claimant detail ID of this ogt claimant detail.
	 *
	 * @param ogtClaimantDetailId the ogt claimant detail ID of this ogt claimant detail
	 */
	@Override
	public void setOgtClaimantDetailId(long ogtClaimantDetailId) {
		model.setOgtClaimantDetailId(ogtClaimantDetailId);
	}

	/**
	 * Sets the primary key of this ogt claimant detail.
	 *
	 * @param primaryKey the primary key of this ogt claimant detail
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this ogt claimant detail.
	 *
	 * @param userId the user ID of this ogt claimant detail
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ogt claimant detail.
	 *
	 * @param userName the user name of this ogt claimant detail
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ogt claimant detail.
	 *
	 * @param userUuid the user uuid of this ogt claimant detail
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
	protected OgtClaimantDetailWrapper wrap(
		OgtClaimantDetail ogtClaimantDetail) {

		return new OgtClaimantDetailWrapper(ogtClaimantDetail);
	}

}