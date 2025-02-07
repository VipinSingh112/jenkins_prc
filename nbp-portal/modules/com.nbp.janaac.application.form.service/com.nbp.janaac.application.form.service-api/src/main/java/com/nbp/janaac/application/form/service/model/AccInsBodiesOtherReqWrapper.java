/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AccInsBodiesOtherReq}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesOtherReq
 * @generated
 */
public class AccInsBodiesOtherReqWrapper
	extends BaseModelWrapper<AccInsBodiesOtherReq>
	implements AccInsBodiesOtherReq, ModelWrapper<AccInsBodiesOtherReq> {

	public AccInsBodiesOtherReqWrapper(
		AccInsBodiesOtherReq accInsBodiesOtherReq) {

		super(accInsBodiesOtherReq);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("accInsBodiesOtherReqId", getAccInsBodiesOtherReqId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicationFees", getApplicationFees());
		attributes.put("insPaymentMethod", getInsPaymentMethod());
		attributes.put("applicantRepName", getApplicantRepName());
		attributes.put("applicantRepPosition", getApplicantRepPosition());
		attributes.put("signatureDate", getSignatureDate());
		attributes.put("janaacApplicationId", getJanaacApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accInsBodiesOtherReqId = (Long)attributes.get(
			"accInsBodiesOtherReqId");

		if (accInsBodiesOtherReqId != null) {
			setAccInsBodiesOtherReqId(accInsBodiesOtherReqId);
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

		String applicationFees = (String)attributes.get("applicationFees");

		if (applicationFees != null) {
			setApplicationFees(applicationFees);
		}

		String insPaymentMethod = (String)attributes.get("insPaymentMethod");

		if (insPaymentMethod != null) {
			setInsPaymentMethod(insPaymentMethod);
		}

		String applicantRepName = (String)attributes.get("applicantRepName");

		if (applicantRepName != null) {
			setApplicantRepName(applicantRepName);
		}

		String applicantRepPosition = (String)attributes.get(
			"applicantRepPosition");

		if (applicantRepPosition != null) {
			setApplicantRepPosition(applicantRepPosition);
		}

		Date signatureDate = (Date)attributes.get("signatureDate");

		if (signatureDate != null) {
			setSignatureDate(signatureDate);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}
	}

	@Override
	public AccInsBodiesOtherReq cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc ins bodies other req ID of this acc ins bodies other req.
	 *
	 * @return the acc ins bodies other req ID of this acc ins bodies other req
	 */
	@Override
	public long getAccInsBodiesOtherReqId() {
		return model.getAccInsBodiesOtherReqId();
	}

	/**
	 * Returns the applicant rep name of this acc ins bodies other req.
	 *
	 * @return the applicant rep name of this acc ins bodies other req
	 */
	@Override
	public String getApplicantRepName() {
		return model.getApplicantRepName();
	}

	/**
	 * Returns the applicant rep position of this acc ins bodies other req.
	 *
	 * @return the applicant rep position of this acc ins bodies other req
	 */
	@Override
	public String getApplicantRepPosition() {
		return model.getApplicantRepPosition();
	}

	/**
	 * Returns the application fees of this acc ins bodies other req.
	 *
	 * @return the application fees of this acc ins bodies other req
	 */
	@Override
	public String getApplicationFees() {
		return model.getApplicationFees();
	}

	/**
	 * Returns the company ID of this acc ins bodies other req.
	 *
	 * @return the company ID of this acc ins bodies other req
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acc ins bodies other req.
	 *
	 * @return the create date of this acc ins bodies other req
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acc ins bodies other req.
	 *
	 * @return the group ID of this acc ins bodies other req
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the ins payment method of this acc ins bodies other req.
	 *
	 * @return the ins payment method of this acc ins bodies other req
	 */
	@Override
	public String getInsPaymentMethod() {
		return model.getInsPaymentMethod();
	}

	/**
	 * Returns the janaac application ID of this acc ins bodies other req.
	 *
	 * @return the janaac application ID of this acc ins bodies other req
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this acc ins bodies other req.
	 *
	 * @return the modified date of this acc ins bodies other req
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this acc ins bodies other req.
	 *
	 * @return the primary key of this acc ins bodies other req
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the signature date of this acc ins bodies other req.
	 *
	 * @return the signature date of this acc ins bodies other req
	 */
	@Override
	public Date getSignatureDate() {
		return model.getSignatureDate();
	}

	/**
	 * Returns the user ID of this acc ins bodies other req.
	 *
	 * @return the user ID of this acc ins bodies other req
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc ins bodies other req.
	 *
	 * @return the user name of this acc ins bodies other req
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc ins bodies other req.
	 *
	 * @return the user uuid of this acc ins bodies other req
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc ins bodies other req.
	 *
	 * @return the uuid of this acc ins bodies other req
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the acc ins bodies other req ID of this acc ins bodies other req.
	 *
	 * @param accInsBodiesOtherReqId the acc ins bodies other req ID of this acc ins bodies other req
	 */
	@Override
	public void setAccInsBodiesOtherReqId(long accInsBodiesOtherReqId) {
		model.setAccInsBodiesOtherReqId(accInsBodiesOtherReqId);
	}

	/**
	 * Sets the applicant rep name of this acc ins bodies other req.
	 *
	 * @param applicantRepName the applicant rep name of this acc ins bodies other req
	 */
	@Override
	public void setApplicantRepName(String applicantRepName) {
		model.setApplicantRepName(applicantRepName);
	}

	/**
	 * Sets the applicant rep position of this acc ins bodies other req.
	 *
	 * @param applicantRepPosition the applicant rep position of this acc ins bodies other req
	 */
	@Override
	public void setApplicantRepPosition(String applicantRepPosition) {
		model.setApplicantRepPosition(applicantRepPosition);
	}

	/**
	 * Sets the application fees of this acc ins bodies other req.
	 *
	 * @param applicationFees the application fees of this acc ins bodies other req
	 */
	@Override
	public void setApplicationFees(String applicationFees) {
		model.setApplicationFees(applicationFees);
	}

	/**
	 * Sets the company ID of this acc ins bodies other req.
	 *
	 * @param companyId the company ID of this acc ins bodies other req
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acc ins bodies other req.
	 *
	 * @param createDate the create date of this acc ins bodies other req
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acc ins bodies other req.
	 *
	 * @param groupId the group ID of this acc ins bodies other req
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the ins payment method of this acc ins bodies other req.
	 *
	 * @param insPaymentMethod the ins payment method of this acc ins bodies other req
	 */
	@Override
	public void setInsPaymentMethod(String insPaymentMethod) {
		model.setInsPaymentMethod(insPaymentMethod);
	}

	/**
	 * Sets the janaac application ID of this acc ins bodies other req.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc ins bodies other req
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this acc ins bodies other req.
	 *
	 * @param modifiedDate the modified date of this acc ins bodies other req
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this acc ins bodies other req.
	 *
	 * @param primaryKey the primary key of this acc ins bodies other req
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the signature date of this acc ins bodies other req.
	 *
	 * @param signatureDate the signature date of this acc ins bodies other req
	 */
	@Override
	public void setSignatureDate(Date signatureDate) {
		model.setSignatureDate(signatureDate);
	}

	/**
	 * Sets the user ID of this acc ins bodies other req.
	 *
	 * @param userId the user ID of this acc ins bodies other req
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc ins bodies other req.
	 *
	 * @param userName the user name of this acc ins bodies other req
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc ins bodies other req.
	 *
	 * @param userUuid the user uuid of this acc ins bodies other req
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc ins bodies other req.
	 *
	 * @param uuid the uuid of this acc ins bodies other req
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected AccInsBodiesOtherReqWrapper wrap(
		AccInsBodiesOtherReq accInsBodiesOtherReq) {

		return new AccInsBodiesOtherReqWrapper(accInsBodiesOtherReq);
	}

}