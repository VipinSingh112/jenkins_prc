/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link VerificationRequestorsInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VerificationRequestorsInfo
 * @generated
 */
public class VerificationRequestorsInfoWrapper
	extends BaseModelWrapper<VerificationRequestorsInfo>
	implements ModelWrapper<VerificationRequestorsInfo>,
			   VerificationRequestorsInfo {

	public VerificationRequestorsInfoWrapper(
		VerificationRequestorsInfo verificationRequestorsInfo) {

		super(verificationRequestorsInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("requestorInformationId", getRequestorInformationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("verRequestorName", getVerRequestorName());
		attributes.put("verRequestorLastName", getVerRequestorLastName());
		attributes.put("verRequestorOccupation", getVerRequestorOccupation());
		attributes.put("verRequestorAddress", getVerRequestorAddress());
		attributes.put("verDateOfRequest", getVerDateOfRequest());
		attributes.put("verRequestorTelNum", getVerRequestorTelNum());
		attributes.put("verRequestorEmail", getVerRequestorEmail());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long requestorInformationId = (Long)attributes.get(
			"requestorInformationId");

		if (requestorInformationId != null) {
			setRequestorInformationId(requestorInformationId);
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

		String verRequestorName = (String)attributes.get("verRequestorName");

		if (verRequestorName != null) {
			setVerRequestorName(verRequestorName);
		}

		String verRequestorLastName = (String)attributes.get(
			"verRequestorLastName");

		if (verRequestorLastName != null) {
			setVerRequestorLastName(verRequestorLastName);
		}

		String verRequestorOccupation = (String)attributes.get(
			"verRequestorOccupation");

		if (verRequestorOccupation != null) {
			setVerRequestorOccupation(verRequestorOccupation);
		}

		String verRequestorAddress = (String)attributes.get(
			"verRequestorAddress");

		if (verRequestorAddress != null) {
			setVerRequestorAddress(verRequestorAddress);
		}

		Date verDateOfRequest = (Date)attributes.get("verDateOfRequest");

		if (verDateOfRequest != null) {
			setVerDateOfRequest(verDateOfRequest);
		}

		String verRequestorTelNum = (String)attributes.get(
			"verRequestorTelNum");

		if (verRequestorTelNum != null) {
			setVerRequestorTelNum(verRequestorTelNum);
		}

		String verRequestorEmail = (String)attributes.get("verRequestorEmail");

		if (verRequestorEmail != null) {
			setVerRequestorEmail(verRequestorEmail);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public VerificationRequestorsInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this verification requestors info.
	 *
	 * @return the company ID of this verification requestors info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this verification requestors info.
	 *
	 * @return the create date of this verification requestors info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this verification requestors info.
	 *
	 * @return the group ID of this verification requestors info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this verification requestors info.
	 *
	 * @return the modified date of this verification requestors info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency ID of this verification requestors info.
	 *
	 * @return the osi insolvency ID of this verification requestors info
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this verification requestors info.
	 *
	 * @return the primary key of this verification requestors info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the requestor information ID of this verification requestors info.
	 *
	 * @return the requestor information ID of this verification requestors info
	 */
	@Override
	public long getRequestorInformationId() {
		return model.getRequestorInformationId();
	}

	/**
	 * Returns the user ID of this verification requestors info.
	 *
	 * @return the user ID of this verification requestors info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this verification requestors info.
	 *
	 * @return the user name of this verification requestors info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this verification requestors info.
	 *
	 * @return the user uuid of this verification requestors info
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the ver date of request of this verification requestors info.
	 *
	 * @return the ver date of request of this verification requestors info
	 */
	@Override
	public Date getVerDateOfRequest() {
		return model.getVerDateOfRequest();
	}

	/**
	 * Returns the ver requestor address of this verification requestors info.
	 *
	 * @return the ver requestor address of this verification requestors info
	 */
	@Override
	public String getVerRequestorAddress() {
		return model.getVerRequestorAddress();
	}

	/**
	 * Returns the ver requestor email of this verification requestors info.
	 *
	 * @return the ver requestor email of this verification requestors info
	 */
	@Override
	public String getVerRequestorEmail() {
		return model.getVerRequestorEmail();
	}

	/**
	 * Returns the ver requestor last name of this verification requestors info.
	 *
	 * @return the ver requestor last name of this verification requestors info
	 */
	@Override
	public String getVerRequestorLastName() {
		return model.getVerRequestorLastName();
	}

	/**
	 * Returns the ver requestor name of this verification requestors info.
	 *
	 * @return the ver requestor name of this verification requestors info
	 */
	@Override
	public String getVerRequestorName() {
		return model.getVerRequestorName();
	}

	/**
	 * Returns the ver requestor occupation of this verification requestors info.
	 *
	 * @return the ver requestor occupation of this verification requestors info
	 */
	@Override
	public String getVerRequestorOccupation() {
		return model.getVerRequestorOccupation();
	}

	/**
	 * Returns the ver requestor tel num of this verification requestors info.
	 *
	 * @return the ver requestor tel num of this verification requestors info
	 */
	@Override
	public String getVerRequestorTelNum() {
		return model.getVerRequestorTelNum();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this verification requestors info.
	 *
	 * @param companyId the company ID of this verification requestors info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this verification requestors info.
	 *
	 * @param createDate the create date of this verification requestors info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this verification requestors info.
	 *
	 * @param groupId the group ID of this verification requestors info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this verification requestors info.
	 *
	 * @param modifiedDate the modified date of this verification requestors info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency ID of this verification requestors info.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this verification requestors info
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this verification requestors info.
	 *
	 * @param primaryKey the primary key of this verification requestors info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the requestor information ID of this verification requestors info.
	 *
	 * @param requestorInformationId the requestor information ID of this verification requestors info
	 */
	@Override
	public void setRequestorInformationId(long requestorInformationId) {
		model.setRequestorInformationId(requestorInformationId);
	}

	/**
	 * Sets the user ID of this verification requestors info.
	 *
	 * @param userId the user ID of this verification requestors info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this verification requestors info.
	 *
	 * @param userName the user name of this verification requestors info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this verification requestors info.
	 *
	 * @param userUuid the user uuid of this verification requestors info
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the ver date of request of this verification requestors info.
	 *
	 * @param verDateOfRequest the ver date of request of this verification requestors info
	 */
	@Override
	public void setVerDateOfRequest(Date verDateOfRequest) {
		model.setVerDateOfRequest(verDateOfRequest);
	}

	/**
	 * Sets the ver requestor address of this verification requestors info.
	 *
	 * @param verRequestorAddress the ver requestor address of this verification requestors info
	 */
	@Override
	public void setVerRequestorAddress(String verRequestorAddress) {
		model.setVerRequestorAddress(verRequestorAddress);
	}

	/**
	 * Sets the ver requestor email of this verification requestors info.
	 *
	 * @param verRequestorEmail the ver requestor email of this verification requestors info
	 */
	@Override
	public void setVerRequestorEmail(String verRequestorEmail) {
		model.setVerRequestorEmail(verRequestorEmail);
	}

	/**
	 * Sets the ver requestor last name of this verification requestors info.
	 *
	 * @param verRequestorLastName the ver requestor last name of this verification requestors info
	 */
	@Override
	public void setVerRequestorLastName(String verRequestorLastName) {
		model.setVerRequestorLastName(verRequestorLastName);
	}

	/**
	 * Sets the ver requestor name of this verification requestors info.
	 *
	 * @param verRequestorName the ver requestor name of this verification requestors info
	 */
	@Override
	public void setVerRequestorName(String verRequestorName) {
		model.setVerRequestorName(verRequestorName);
	}

	/**
	 * Sets the ver requestor occupation of this verification requestors info.
	 *
	 * @param verRequestorOccupation the ver requestor occupation of this verification requestors info
	 */
	@Override
	public void setVerRequestorOccupation(String verRequestorOccupation) {
		model.setVerRequestorOccupation(verRequestorOccupation);
	}

	/**
	 * Sets the ver requestor tel num of this verification requestors info.
	 *
	 * @param verRequestorTelNum the ver requestor tel num of this verification requestors info
	 */
	@Override
	public void setVerRequestorTelNum(String verRequestorTelNum) {
		model.setVerRequestorTelNum(verRequestorTelNum);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected VerificationRequestorsInfoWrapper wrap(
		VerificationRequestorsInfo verificationRequestorsInfo) {

		return new VerificationRequestorsInfoWrapper(
			verificationRequestorsInfo);
	}

}