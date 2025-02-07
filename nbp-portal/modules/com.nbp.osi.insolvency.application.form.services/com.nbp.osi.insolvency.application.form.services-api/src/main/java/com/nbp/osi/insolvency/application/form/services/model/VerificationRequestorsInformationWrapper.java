/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link VerificationRequestorsInformation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VerificationRequestorsInformation
 * @generated
 */
public class VerificationRequestorsInformationWrapper
	extends BaseModelWrapper<VerificationRequestorsInformation>
	implements ModelWrapper<VerificationRequestorsInformation>,
			   VerificationRequestorsInformation {

	public VerificationRequestorsInformationWrapper(
		VerificationRequestorsInformation verificationRequestorsInformation) {

		super(verificationRequestorsInformation);
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
	public VerificationRequestorsInformation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this verification requestors information.
	 *
	 * @return the company ID of this verification requestors information
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this verification requestors information.
	 *
	 * @return the create date of this verification requestors information
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this verification requestors information.
	 *
	 * @return the group ID of this verification requestors information
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this verification requestors information.
	 *
	 * @return the modified date of this verification requestors information
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency ID of this verification requestors information.
	 *
	 * @return the osi insolvency ID of this verification requestors information
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this verification requestors information.
	 *
	 * @return the primary key of this verification requestors information
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.service.persistence.
		VerificationRequestorsInformationPK getPrimaryKey() {

		return model.getPrimaryKey();
	}

	/**
	 * Returns the requestor information ID of this verification requestors information.
	 *
	 * @return the requestor information ID of this verification requestors information
	 */
	@Override
	public long getRequestorInformationId() {
		return model.getRequestorInformationId();
	}

	/**
	 * Returns the user ID of this verification requestors information.
	 *
	 * @return the user ID of this verification requestors information
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this verification requestors information.
	 *
	 * @return the user name of this verification requestors information
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this verification requestors information.
	 *
	 * @return the user uuid of this verification requestors information
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the ver date of request of this verification requestors information.
	 *
	 * @return the ver date of request of this verification requestors information
	 */
	@Override
	public Date getVerDateOfRequest() {
		return model.getVerDateOfRequest();
	}

	/**
	 * Returns the ver requestor address of this verification requestors information.
	 *
	 * @return the ver requestor address of this verification requestors information
	 */
	@Override
	public String getVerRequestorAddress() {
		return model.getVerRequestorAddress();
	}

	/**
	 * Returns the ver requestor email of this verification requestors information.
	 *
	 * @return the ver requestor email of this verification requestors information
	 */
	@Override
	public String getVerRequestorEmail() {
		return model.getVerRequestorEmail();
	}

	/**
	 * Returns the ver requestor name of this verification requestors information.
	 *
	 * @return the ver requestor name of this verification requestors information
	 */
	@Override
	public String getVerRequestorName() {
		return model.getVerRequestorName();
	}

	/**
	 * Returns the ver requestor occupation of this verification requestors information.
	 *
	 * @return the ver requestor occupation of this verification requestors information
	 */
	@Override
	public String getVerRequestorOccupation() {
		return model.getVerRequestorOccupation();
	}

	/**
	 * Returns the ver requestor tel num of this verification requestors information.
	 *
	 * @return the ver requestor tel num of this verification requestors information
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
	 * Sets the company ID of this verification requestors information.
	 *
	 * @param companyId the company ID of this verification requestors information
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this verification requestors information.
	 *
	 * @param createDate the create date of this verification requestors information
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this verification requestors information.
	 *
	 * @param groupId the group ID of this verification requestors information
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this verification requestors information.
	 *
	 * @param modifiedDate the modified date of this verification requestors information
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency ID of this verification requestors information.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this verification requestors information
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this verification requestors information.
	 *
	 * @param primaryKey the primary key of this verification requestors information
	 */
	@Override
	public void setPrimaryKey(
		com.nbp.osi.insolvency.application.form.services.service.persistence.
			VerificationRequestorsInformationPK primaryKey) {

		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the requestor information ID of this verification requestors information.
	 *
	 * @param requestorInformationId the requestor information ID of this verification requestors information
	 */
	@Override
	public void setRequestorInformationId(long requestorInformationId) {
		model.setRequestorInformationId(requestorInformationId);
	}

	/**
	 * Sets the user ID of this verification requestors information.
	 *
	 * @param userId the user ID of this verification requestors information
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this verification requestors information.
	 *
	 * @param userName the user name of this verification requestors information
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this verification requestors information.
	 *
	 * @param userUuid the user uuid of this verification requestors information
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the ver date of request of this verification requestors information.
	 *
	 * @param verDateOfRequest the ver date of request of this verification requestors information
	 */
	@Override
	public void setVerDateOfRequest(Date verDateOfRequest) {
		model.setVerDateOfRequest(verDateOfRequest);
	}

	/**
	 * Sets the ver requestor address of this verification requestors information.
	 *
	 * @param verRequestorAddress the ver requestor address of this verification requestors information
	 */
	@Override
	public void setVerRequestorAddress(String verRequestorAddress) {
		model.setVerRequestorAddress(verRequestorAddress);
	}

	/**
	 * Sets the ver requestor email of this verification requestors information.
	 *
	 * @param verRequestorEmail the ver requestor email of this verification requestors information
	 */
	@Override
	public void setVerRequestorEmail(String verRequestorEmail) {
		model.setVerRequestorEmail(verRequestorEmail);
	}

	/**
	 * Sets the ver requestor name of this verification requestors information.
	 *
	 * @param verRequestorName the ver requestor name of this verification requestors information
	 */
	@Override
	public void setVerRequestorName(String verRequestorName) {
		model.setVerRequestorName(verRequestorName);
	}

	/**
	 * Sets the ver requestor occupation of this verification requestors information.
	 *
	 * @param verRequestorOccupation the ver requestor occupation of this verification requestors information
	 */
	@Override
	public void setVerRequestorOccupation(String verRequestorOccupation) {
		model.setVerRequestorOccupation(verRequestorOccupation);
	}

	/**
	 * Sets the ver requestor tel num of this verification requestors information.
	 *
	 * @param verRequestorTelNum the ver requestor tel num of this verification requestors information
	 */
	@Override
	public void setVerRequestorTelNum(String verRequestorTelNum) {
		model.setVerRequestorTelNum(verRequestorTelNum);
	}

	@Override
	protected VerificationRequestorsInformationWrapper wrap(
		VerificationRequestorsInformation verificationRequestorsInformation) {

		return new VerificationRequestorsInformationWrapper(
			verificationRequestorsInformation);
	}

}