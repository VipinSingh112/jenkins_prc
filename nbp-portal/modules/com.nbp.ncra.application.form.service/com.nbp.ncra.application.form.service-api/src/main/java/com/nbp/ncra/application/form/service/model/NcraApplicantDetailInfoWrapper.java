/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NcraApplicantDetailInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraApplicantDetailInfo
 * @generated
 */
public class NcraApplicantDetailInfoWrapper
	extends BaseModelWrapper<NcraApplicantDetailInfo>
	implements ModelWrapper<NcraApplicantDetailInfo>, NcraApplicantDetailInfo {

	public NcraApplicantDetailInfoWrapper(
		NcraApplicantDetailInfo ncraApplicantDetailInfo) {

		super(ncraApplicantDetailInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"ncraApplicantDetailInfoId", getNcraApplicantDetailInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicantBusinessName", getApplicantBusinessName());
		attributes.put("applicantAddress", getApplicantAddress());
		attributes.put("applicantContact", getApplicantContact());
		attributes.put("applicantTeleNum", getApplicantTeleNum());
		attributes.put("applicantFaxNo", getApplicantFaxNo());
		attributes.put("applicantEmailAddr", getApplicantEmailAddr());
		attributes.put("applicantLocation", getApplicantLocation());
		attributes.put("ncraApplicationId", getNcraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncraApplicantDetailInfoId = (Long)attributes.get(
			"ncraApplicantDetailInfoId");

		if (ncraApplicantDetailInfoId != null) {
			setNcraApplicantDetailInfoId(ncraApplicantDetailInfoId);
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

		String applicantBusinessName = (String)attributes.get(
			"applicantBusinessName");

		if (applicantBusinessName != null) {
			setApplicantBusinessName(applicantBusinessName);
		}

		String applicantAddress = (String)attributes.get("applicantAddress");

		if (applicantAddress != null) {
			setApplicantAddress(applicantAddress);
		}

		String applicantContact = (String)attributes.get("applicantContact");

		if (applicantContact != null) {
			setApplicantContact(applicantContact);
		}

		String applicantTeleNum = (String)attributes.get("applicantTeleNum");

		if (applicantTeleNum != null) {
			setApplicantTeleNum(applicantTeleNum);
		}

		String applicantFaxNo = (String)attributes.get("applicantFaxNo");

		if (applicantFaxNo != null) {
			setApplicantFaxNo(applicantFaxNo);
		}

		String applicantEmailAddr = (String)attributes.get(
			"applicantEmailAddr");

		if (applicantEmailAddr != null) {
			setApplicantEmailAddr(applicantEmailAddr);
		}

		String applicantLocation = (String)attributes.get("applicantLocation");

		if (applicantLocation != null) {
			setApplicantLocation(applicantLocation);
		}

		Long ncraApplicationId = (Long)attributes.get("ncraApplicationId");

		if (ncraApplicationId != null) {
			setNcraApplicationId(ncraApplicationId);
		}
	}

	@Override
	public NcraApplicantDetailInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the applicant address of this ncra applicant detail info.
	 *
	 * @return the applicant address of this ncra applicant detail info
	 */
	@Override
	public String getApplicantAddress() {
		return model.getApplicantAddress();
	}

	/**
	 * Returns the applicant business name of this ncra applicant detail info.
	 *
	 * @return the applicant business name of this ncra applicant detail info
	 */
	@Override
	public String getApplicantBusinessName() {
		return model.getApplicantBusinessName();
	}

	/**
	 * Returns the applicant contact of this ncra applicant detail info.
	 *
	 * @return the applicant contact of this ncra applicant detail info
	 */
	@Override
	public String getApplicantContact() {
		return model.getApplicantContact();
	}

	/**
	 * Returns the applicant email addr of this ncra applicant detail info.
	 *
	 * @return the applicant email addr of this ncra applicant detail info
	 */
	@Override
	public String getApplicantEmailAddr() {
		return model.getApplicantEmailAddr();
	}

	/**
	 * Returns the applicant fax no of this ncra applicant detail info.
	 *
	 * @return the applicant fax no of this ncra applicant detail info
	 */
	@Override
	public String getApplicantFaxNo() {
		return model.getApplicantFaxNo();
	}

	/**
	 * Returns the applicant location of this ncra applicant detail info.
	 *
	 * @return the applicant location of this ncra applicant detail info
	 */
	@Override
	public String getApplicantLocation() {
		return model.getApplicantLocation();
	}

	/**
	 * Returns the applicant tele num of this ncra applicant detail info.
	 *
	 * @return the applicant tele num of this ncra applicant detail info
	 */
	@Override
	public String getApplicantTeleNum() {
		return model.getApplicantTeleNum();
	}

	/**
	 * Returns the company ID of this ncra applicant detail info.
	 *
	 * @return the company ID of this ncra applicant detail info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ncra applicant detail info.
	 *
	 * @return the create date of this ncra applicant detail info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this ncra applicant detail info.
	 *
	 * @return the group ID of this ncra applicant detail info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this ncra applicant detail info.
	 *
	 * @return the modified date of this ncra applicant detail info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncra applicant detail info ID of this ncra applicant detail info.
	 *
	 * @return the ncra applicant detail info ID of this ncra applicant detail info
	 */
	@Override
	public long getNcraApplicantDetailInfoId() {
		return model.getNcraApplicantDetailInfoId();
	}

	/**
	 * Returns the ncra application ID of this ncra applicant detail info.
	 *
	 * @return the ncra application ID of this ncra applicant detail info
	 */
	@Override
	public long getNcraApplicationId() {
		return model.getNcraApplicationId();
	}

	/**
	 * Returns the primary key of this ncra applicant detail info.
	 *
	 * @return the primary key of this ncra applicant detail info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this ncra applicant detail info.
	 *
	 * @return the user ID of this ncra applicant detail info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncra applicant detail info.
	 *
	 * @return the user name of this ncra applicant detail info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncra applicant detail info.
	 *
	 * @return the user uuid of this ncra applicant detail info
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
	 * Sets the applicant address of this ncra applicant detail info.
	 *
	 * @param applicantAddress the applicant address of this ncra applicant detail info
	 */
	@Override
	public void setApplicantAddress(String applicantAddress) {
		model.setApplicantAddress(applicantAddress);
	}

	/**
	 * Sets the applicant business name of this ncra applicant detail info.
	 *
	 * @param applicantBusinessName the applicant business name of this ncra applicant detail info
	 */
	@Override
	public void setApplicantBusinessName(String applicantBusinessName) {
		model.setApplicantBusinessName(applicantBusinessName);
	}

	/**
	 * Sets the applicant contact of this ncra applicant detail info.
	 *
	 * @param applicantContact the applicant contact of this ncra applicant detail info
	 */
	@Override
	public void setApplicantContact(String applicantContact) {
		model.setApplicantContact(applicantContact);
	}

	/**
	 * Sets the applicant email addr of this ncra applicant detail info.
	 *
	 * @param applicantEmailAddr the applicant email addr of this ncra applicant detail info
	 */
	@Override
	public void setApplicantEmailAddr(String applicantEmailAddr) {
		model.setApplicantEmailAddr(applicantEmailAddr);
	}

	/**
	 * Sets the applicant fax no of this ncra applicant detail info.
	 *
	 * @param applicantFaxNo the applicant fax no of this ncra applicant detail info
	 */
	@Override
	public void setApplicantFaxNo(String applicantFaxNo) {
		model.setApplicantFaxNo(applicantFaxNo);
	}

	/**
	 * Sets the applicant location of this ncra applicant detail info.
	 *
	 * @param applicantLocation the applicant location of this ncra applicant detail info
	 */
	@Override
	public void setApplicantLocation(String applicantLocation) {
		model.setApplicantLocation(applicantLocation);
	}

	/**
	 * Sets the applicant tele num of this ncra applicant detail info.
	 *
	 * @param applicantTeleNum the applicant tele num of this ncra applicant detail info
	 */
	@Override
	public void setApplicantTeleNum(String applicantTeleNum) {
		model.setApplicantTeleNum(applicantTeleNum);
	}

	/**
	 * Sets the company ID of this ncra applicant detail info.
	 *
	 * @param companyId the company ID of this ncra applicant detail info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ncra applicant detail info.
	 *
	 * @param createDate the create date of this ncra applicant detail info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this ncra applicant detail info.
	 *
	 * @param groupId the group ID of this ncra applicant detail info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this ncra applicant detail info.
	 *
	 * @param modifiedDate the modified date of this ncra applicant detail info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncra applicant detail info ID of this ncra applicant detail info.
	 *
	 * @param ncraApplicantDetailInfoId the ncra applicant detail info ID of this ncra applicant detail info
	 */
	@Override
	public void setNcraApplicantDetailInfoId(long ncraApplicantDetailInfoId) {
		model.setNcraApplicantDetailInfoId(ncraApplicantDetailInfoId);
	}

	/**
	 * Sets the ncra application ID of this ncra applicant detail info.
	 *
	 * @param ncraApplicationId the ncra application ID of this ncra applicant detail info
	 */
	@Override
	public void setNcraApplicationId(long ncraApplicationId) {
		model.setNcraApplicationId(ncraApplicationId);
	}

	/**
	 * Sets the primary key of this ncra applicant detail info.
	 *
	 * @param primaryKey the primary key of this ncra applicant detail info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this ncra applicant detail info.
	 *
	 * @param userId the user ID of this ncra applicant detail info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncra applicant detail info.
	 *
	 * @param userName the user name of this ncra applicant detail info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncra applicant detail info.
	 *
	 * @param userUuid the user uuid of this ncra applicant detail info
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
	protected NcraApplicantDetailInfoWrapper wrap(
		NcraApplicantDetailInfo ncraApplicantDetailInfo) {

		return new NcraApplicantDetailInfoWrapper(ncraApplicantDetailInfo);
	}

}