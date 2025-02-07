/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link JtbAddCraftApplicantInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddCraftApplicantInfo
 * @generated
 */
public class JtbAddCraftApplicantInfoWrapper
	extends BaseModelWrapper<JtbAddCraftApplicantInfo>
	implements JtbAddCraftApplicantInfo,
			   ModelWrapper<JtbAddCraftApplicantInfo> {

	public JtbAddCraftApplicantInfoWrapper(
		JtbAddCraftApplicantInfo jtbAddCraftApplicantInfo) {

		super(jtbAddCraftApplicantInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"jtbAddCraftApplicantInfoId", getJtbAddCraftApplicantInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("counter", getCounter());
		attributes.put("ownerName", getOwnerName());
		attributes.put("ownerAddress", getOwnerAddress());
		attributes.put("ownerPhoneNo", getOwnerPhoneNo());
		attributes.put("sellingLocation", getSellingLocation());
		attributes.put("operatingEmail", getOperatingEmail());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jtbAddCraftApplicantInfoId = (Long)attributes.get(
			"jtbAddCraftApplicantInfoId");

		if (jtbAddCraftApplicantInfoId != null) {
			setJtbAddCraftApplicantInfoId(jtbAddCraftApplicantInfoId);
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

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		String ownerName = (String)attributes.get("ownerName");

		if (ownerName != null) {
			setOwnerName(ownerName);
		}

		String ownerAddress = (String)attributes.get("ownerAddress");

		if (ownerAddress != null) {
			setOwnerAddress(ownerAddress);
		}

		String ownerPhoneNo = (String)attributes.get("ownerPhoneNo");

		if (ownerPhoneNo != null) {
			setOwnerPhoneNo(ownerPhoneNo);
		}

		String sellingLocation = (String)attributes.get("sellingLocation");

		if (sellingLocation != null) {
			setSellingLocation(sellingLocation);
		}

		String operatingEmail = (String)attributes.get("operatingEmail");

		if (operatingEmail != null) {
			setOperatingEmail(operatingEmail);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public JtbAddCraftApplicantInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this jtb add craft applicant info.
	 *
	 * @return the company ID of this jtb add craft applicant info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this jtb add craft applicant info.
	 *
	 * @return the counter of this jtb add craft applicant info
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this jtb add craft applicant info.
	 *
	 * @return the create date of this jtb add craft applicant info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this jtb add craft applicant info.
	 *
	 * @return the group ID of this jtb add craft applicant info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb add craft applicant info ID of this jtb add craft applicant info.
	 *
	 * @return the jtb add craft applicant info ID of this jtb add craft applicant info
	 */
	@Override
	public long getJtbAddCraftApplicantInfoId() {
		return model.getJtbAddCraftApplicantInfoId();
	}

	/**
	 * Returns the jtb application ID of this jtb add craft applicant info.
	 *
	 * @return the jtb application ID of this jtb add craft applicant info
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this jtb add craft applicant info.
	 *
	 * @return the modified date of this jtb add craft applicant info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the operating email of this jtb add craft applicant info.
	 *
	 * @return the operating email of this jtb add craft applicant info
	 */
	@Override
	public String getOperatingEmail() {
		return model.getOperatingEmail();
	}

	/**
	 * Returns the owner address of this jtb add craft applicant info.
	 *
	 * @return the owner address of this jtb add craft applicant info
	 */
	@Override
	public String getOwnerAddress() {
		return model.getOwnerAddress();
	}

	/**
	 * Returns the owner name of this jtb add craft applicant info.
	 *
	 * @return the owner name of this jtb add craft applicant info
	 */
	@Override
	public String getOwnerName() {
		return model.getOwnerName();
	}

	/**
	 * Returns the owner phone no of this jtb add craft applicant info.
	 *
	 * @return the owner phone no of this jtb add craft applicant info
	 */
	@Override
	public String getOwnerPhoneNo() {
		return model.getOwnerPhoneNo();
	}

	/**
	 * Returns the primary key of this jtb add craft applicant info.
	 *
	 * @return the primary key of this jtb add craft applicant info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the selling location of this jtb add craft applicant info.
	 *
	 * @return the selling location of this jtb add craft applicant info
	 */
	@Override
	public String getSellingLocation() {
		return model.getSellingLocation();
	}

	/**
	 * Returns the user ID of this jtb add craft applicant info.
	 *
	 * @return the user ID of this jtb add craft applicant info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jtb add craft applicant info.
	 *
	 * @return the user name of this jtb add craft applicant info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jtb add craft applicant info.
	 *
	 * @return the user uuid of this jtb add craft applicant info
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
	 * Sets the company ID of this jtb add craft applicant info.
	 *
	 * @param companyId the company ID of this jtb add craft applicant info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this jtb add craft applicant info.
	 *
	 * @param counter the counter of this jtb add craft applicant info
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this jtb add craft applicant info.
	 *
	 * @param createDate the create date of this jtb add craft applicant info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this jtb add craft applicant info.
	 *
	 * @param groupId the group ID of this jtb add craft applicant info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb add craft applicant info ID of this jtb add craft applicant info.
	 *
	 * @param jtbAddCraftApplicantInfoId the jtb add craft applicant info ID of this jtb add craft applicant info
	 */
	@Override
	public void setJtbAddCraftApplicantInfoId(long jtbAddCraftApplicantInfoId) {
		model.setJtbAddCraftApplicantInfoId(jtbAddCraftApplicantInfoId);
	}

	/**
	 * Sets the jtb application ID of this jtb add craft applicant info.
	 *
	 * @param jtbApplicationId the jtb application ID of this jtb add craft applicant info
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this jtb add craft applicant info.
	 *
	 * @param modifiedDate the modified date of this jtb add craft applicant info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the operating email of this jtb add craft applicant info.
	 *
	 * @param operatingEmail the operating email of this jtb add craft applicant info
	 */
	@Override
	public void setOperatingEmail(String operatingEmail) {
		model.setOperatingEmail(operatingEmail);
	}

	/**
	 * Sets the owner address of this jtb add craft applicant info.
	 *
	 * @param ownerAddress the owner address of this jtb add craft applicant info
	 */
	@Override
	public void setOwnerAddress(String ownerAddress) {
		model.setOwnerAddress(ownerAddress);
	}

	/**
	 * Sets the owner name of this jtb add craft applicant info.
	 *
	 * @param ownerName the owner name of this jtb add craft applicant info
	 */
	@Override
	public void setOwnerName(String ownerName) {
		model.setOwnerName(ownerName);
	}

	/**
	 * Sets the owner phone no of this jtb add craft applicant info.
	 *
	 * @param ownerPhoneNo the owner phone no of this jtb add craft applicant info
	 */
	@Override
	public void setOwnerPhoneNo(String ownerPhoneNo) {
		model.setOwnerPhoneNo(ownerPhoneNo);
	}

	/**
	 * Sets the primary key of this jtb add craft applicant info.
	 *
	 * @param primaryKey the primary key of this jtb add craft applicant info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the selling location of this jtb add craft applicant info.
	 *
	 * @param sellingLocation the selling location of this jtb add craft applicant info
	 */
	@Override
	public void setSellingLocation(String sellingLocation) {
		model.setSellingLocation(sellingLocation);
	}

	/**
	 * Sets the user ID of this jtb add craft applicant info.
	 *
	 * @param userId the user ID of this jtb add craft applicant info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jtb add craft applicant info.
	 *
	 * @param userName the user name of this jtb add craft applicant info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jtb add craft applicant info.
	 *
	 * @param userUuid the user uuid of this jtb add craft applicant info
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
	protected JtbAddCraftApplicantInfoWrapper wrap(
		JtbAddCraftApplicantInfo jtbAddCraftApplicantInfo) {

		return new JtbAddCraftApplicantInfoWrapper(jtbAddCraftApplicantInfo);
	}

}