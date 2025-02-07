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
 * This class is a wrapper for {@link DetailOfApplicantSecTwo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfApplicantSecTwo
 * @generated
 */
public class DetailOfApplicantSecTwoWrapper
	extends BaseModelWrapper<DetailOfApplicantSecTwo>
	implements DetailOfApplicantSecTwo, ModelWrapper<DetailOfApplicantSecTwo> {

	public DetailOfApplicantSecTwoWrapper(
		DetailOfApplicantSecTwo detailOfApplicantSecTwo) {

		super(detailOfApplicantSecTwo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("detailOfAppliSecTwoId", getDetailOfAppliSecTwoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("organizationName", getOrganizationName());
		attributes.put("nuclearMailingAddr", getNuclearMailingAddr());
		attributes.put("parish", getParish());
		attributes.put("nuclearTrnNumber", getNuclearTrnNumber());
		attributes.put("nuclearTelephoneNo", getNuclearTelephoneNo());
		attributes.put("nuclearFaxNo", getNuclearFaxNo());
		attributes.put("nuclearEmailAddr", getNuclearEmailAddr());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long detailOfAppliSecTwoId = (Long)attributes.get(
			"detailOfAppliSecTwoId");

		if (detailOfAppliSecTwoId != null) {
			setDetailOfAppliSecTwoId(detailOfAppliSecTwoId);
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

		String organizationName = (String)attributes.get("organizationName");

		if (organizationName != null) {
			setOrganizationName(organizationName);
		}

		String nuclearMailingAddr = (String)attributes.get(
			"nuclearMailingAddr");

		if (nuclearMailingAddr != null) {
			setNuclearMailingAddr(nuclearMailingAddr);
		}

		String parish = (String)attributes.get("parish");

		if (parish != null) {
			setParish(parish);
		}

		String nuclearTrnNumber = (String)attributes.get("nuclearTrnNumber");

		if (nuclearTrnNumber != null) {
			setNuclearTrnNumber(nuclearTrnNumber);
		}

		String nuclearTelephoneNo = (String)attributes.get(
			"nuclearTelephoneNo");

		if (nuclearTelephoneNo != null) {
			setNuclearTelephoneNo(nuclearTelephoneNo);
		}

		String nuclearFaxNo = (String)attributes.get("nuclearFaxNo");

		if (nuclearFaxNo != null) {
			setNuclearFaxNo(nuclearFaxNo);
		}

		String nuclearEmailAddr = (String)attributes.get("nuclearEmailAddr");

		if (nuclearEmailAddr != null) {
			setNuclearEmailAddr(nuclearEmailAddr);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public DetailOfApplicantSecTwo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this detail of applicant sec two.
	 *
	 * @return the company ID of this detail of applicant sec two
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this detail of applicant sec two.
	 *
	 * @return the create date of this detail of applicant sec two
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the detail of appli sec two ID of this detail of applicant sec two.
	 *
	 * @return the detail of appli sec two ID of this detail of applicant sec two
	 */
	@Override
	public long getDetailOfAppliSecTwoId() {
		return model.getDetailOfAppliSecTwoId();
	}

	/**
	 * Returns the group ID of this detail of applicant sec two.
	 *
	 * @return the group ID of this detail of applicant sec two
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this detail of applicant sec two.
	 *
	 * @return the hsra application ID of this detail of applicant sec two
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the modified date of this detail of applicant sec two.
	 *
	 * @return the modified date of this detail of applicant sec two
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nuclear email addr of this detail of applicant sec two.
	 *
	 * @return the nuclear email addr of this detail of applicant sec two
	 */
	@Override
	public String getNuclearEmailAddr() {
		return model.getNuclearEmailAddr();
	}

	/**
	 * Returns the nuclear fax no of this detail of applicant sec two.
	 *
	 * @return the nuclear fax no of this detail of applicant sec two
	 */
	@Override
	public String getNuclearFaxNo() {
		return model.getNuclearFaxNo();
	}

	/**
	 * Returns the nuclear mailing addr of this detail of applicant sec two.
	 *
	 * @return the nuclear mailing addr of this detail of applicant sec two
	 */
	@Override
	public String getNuclearMailingAddr() {
		return model.getNuclearMailingAddr();
	}

	/**
	 * Returns the nuclear telephone no of this detail of applicant sec two.
	 *
	 * @return the nuclear telephone no of this detail of applicant sec two
	 */
	@Override
	public String getNuclearTelephoneNo() {
		return model.getNuclearTelephoneNo();
	}

	/**
	 * Returns the nuclear trn number of this detail of applicant sec two.
	 *
	 * @return the nuclear trn number of this detail of applicant sec two
	 */
	@Override
	public String getNuclearTrnNumber() {
		return model.getNuclearTrnNumber();
	}

	/**
	 * Returns the organization name of this detail of applicant sec two.
	 *
	 * @return the organization name of this detail of applicant sec two
	 */
	@Override
	public String getOrganizationName() {
		return model.getOrganizationName();
	}

	/**
	 * Returns the parish of this detail of applicant sec two.
	 *
	 * @return the parish of this detail of applicant sec two
	 */
	@Override
	public String getParish() {
		return model.getParish();
	}

	/**
	 * Returns the primary key of this detail of applicant sec two.
	 *
	 * @return the primary key of this detail of applicant sec two
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this detail of applicant sec two.
	 *
	 * @return the user ID of this detail of applicant sec two
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this detail of applicant sec two.
	 *
	 * @return the user name of this detail of applicant sec two
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this detail of applicant sec two.
	 *
	 * @return the user uuid of this detail of applicant sec two
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
	 * Sets the company ID of this detail of applicant sec two.
	 *
	 * @param companyId the company ID of this detail of applicant sec two
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this detail of applicant sec two.
	 *
	 * @param createDate the create date of this detail of applicant sec two
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the detail of appli sec two ID of this detail of applicant sec two.
	 *
	 * @param detailOfAppliSecTwoId the detail of appli sec two ID of this detail of applicant sec two
	 */
	@Override
	public void setDetailOfAppliSecTwoId(long detailOfAppliSecTwoId) {
		model.setDetailOfAppliSecTwoId(detailOfAppliSecTwoId);
	}

	/**
	 * Sets the group ID of this detail of applicant sec two.
	 *
	 * @param groupId the group ID of this detail of applicant sec two
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this detail of applicant sec two.
	 *
	 * @param hsraApplicationId the hsra application ID of this detail of applicant sec two
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the modified date of this detail of applicant sec two.
	 *
	 * @param modifiedDate the modified date of this detail of applicant sec two
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nuclear email addr of this detail of applicant sec two.
	 *
	 * @param nuclearEmailAddr the nuclear email addr of this detail of applicant sec two
	 */
	@Override
	public void setNuclearEmailAddr(String nuclearEmailAddr) {
		model.setNuclearEmailAddr(nuclearEmailAddr);
	}

	/**
	 * Sets the nuclear fax no of this detail of applicant sec two.
	 *
	 * @param nuclearFaxNo the nuclear fax no of this detail of applicant sec two
	 */
	@Override
	public void setNuclearFaxNo(String nuclearFaxNo) {
		model.setNuclearFaxNo(nuclearFaxNo);
	}

	/**
	 * Sets the nuclear mailing addr of this detail of applicant sec two.
	 *
	 * @param nuclearMailingAddr the nuclear mailing addr of this detail of applicant sec two
	 */
	@Override
	public void setNuclearMailingAddr(String nuclearMailingAddr) {
		model.setNuclearMailingAddr(nuclearMailingAddr);
	}

	/**
	 * Sets the nuclear telephone no of this detail of applicant sec two.
	 *
	 * @param nuclearTelephoneNo the nuclear telephone no of this detail of applicant sec two
	 */
	@Override
	public void setNuclearTelephoneNo(String nuclearTelephoneNo) {
		model.setNuclearTelephoneNo(nuclearTelephoneNo);
	}

	/**
	 * Sets the nuclear trn number of this detail of applicant sec two.
	 *
	 * @param nuclearTrnNumber the nuclear trn number of this detail of applicant sec two
	 */
	@Override
	public void setNuclearTrnNumber(String nuclearTrnNumber) {
		model.setNuclearTrnNumber(nuclearTrnNumber);
	}

	/**
	 * Sets the organization name of this detail of applicant sec two.
	 *
	 * @param organizationName the organization name of this detail of applicant sec two
	 */
	@Override
	public void setOrganizationName(String organizationName) {
		model.setOrganizationName(organizationName);
	}

	/**
	 * Sets the parish of this detail of applicant sec two.
	 *
	 * @param parish the parish of this detail of applicant sec two
	 */
	@Override
	public void setParish(String parish) {
		model.setParish(parish);
	}

	/**
	 * Sets the primary key of this detail of applicant sec two.
	 *
	 * @param primaryKey the primary key of this detail of applicant sec two
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this detail of applicant sec two.
	 *
	 * @param userId the user ID of this detail of applicant sec two
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this detail of applicant sec two.
	 *
	 * @param userName the user name of this detail of applicant sec two
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this detail of applicant sec two.
	 *
	 * @param userUuid the user uuid of this detail of applicant sec two
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
	protected DetailOfApplicantSecTwoWrapper wrap(
		DetailOfApplicantSecTwo detailOfApplicantSecTwo) {

		return new DetailOfApplicantSecTwoWrapper(detailOfApplicantSecTwo);
	}

}