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
 * This class is a wrapper for {@link AccMediLabOtherReq}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabOtherReq
 * @generated
 */
public class AccMediLabOtherReqWrapper
	extends BaseModelWrapper<AccMediLabOtherReq>
	implements AccMediLabOtherReq, ModelWrapper<AccMediLabOtherReq> {

	public AccMediLabOtherReqWrapper(AccMediLabOtherReq accMediLabOtherReq) {
		super(accMediLabOtherReq);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("accMediLabOtherReqId", getAccMediLabOtherReqId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("paymentMethod", getPaymentMethod());
		attributes.put("representativeName", getRepresentativeName());
		attributes.put("representativePos", getRepresentativePos());
		attributes.put("signDate", getSignDate());
		attributes.put("janaacApplicationId", getJanaacApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accMediLabOtherReqId = (Long)attributes.get(
			"accMediLabOtherReqId");

		if (accMediLabOtherReqId != null) {
			setAccMediLabOtherReqId(accMediLabOtherReqId);
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

		String paymentMethod = (String)attributes.get("paymentMethod");

		if (paymentMethod != null) {
			setPaymentMethod(paymentMethod);
		}

		String representativeName = (String)attributes.get(
			"representativeName");

		if (representativeName != null) {
			setRepresentativeName(representativeName);
		}

		String representativePos = (String)attributes.get("representativePos");

		if (representativePos != null) {
			setRepresentativePos(representativePos);
		}

		Date signDate = (Date)attributes.get("signDate");

		if (signDate != null) {
			setSignDate(signDate);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}
	}

	@Override
	public AccMediLabOtherReq cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc medi lab other req ID of this acc medi lab other req.
	 *
	 * @return the acc medi lab other req ID of this acc medi lab other req
	 */
	@Override
	public long getAccMediLabOtherReqId() {
		return model.getAccMediLabOtherReqId();
	}

	/**
	 * Returns the company ID of this acc medi lab other req.
	 *
	 * @return the company ID of this acc medi lab other req
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acc medi lab other req.
	 *
	 * @return the create date of this acc medi lab other req
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acc medi lab other req.
	 *
	 * @return the group ID of this acc medi lab other req
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this acc medi lab other req.
	 *
	 * @return the janaac application ID of this acc medi lab other req
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this acc medi lab other req.
	 *
	 * @return the modified date of this acc medi lab other req
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the payment method of this acc medi lab other req.
	 *
	 * @return the payment method of this acc medi lab other req
	 */
	@Override
	public String getPaymentMethod() {
		return model.getPaymentMethod();
	}

	/**
	 * Returns the primary key of this acc medi lab other req.
	 *
	 * @return the primary key of this acc medi lab other req
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the representative name of this acc medi lab other req.
	 *
	 * @return the representative name of this acc medi lab other req
	 */
	@Override
	public String getRepresentativeName() {
		return model.getRepresentativeName();
	}

	/**
	 * Returns the representative pos of this acc medi lab other req.
	 *
	 * @return the representative pos of this acc medi lab other req
	 */
	@Override
	public String getRepresentativePos() {
		return model.getRepresentativePos();
	}

	/**
	 * Returns the sign date of this acc medi lab other req.
	 *
	 * @return the sign date of this acc medi lab other req
	 */
	@Override
	public Date getSignDate() {
		return model.getSignDate();
	}

	/**
	 * Returns the user ID of this acc medi lab other req.
	 *
	 * @return the user ID of this acc medi lab other req
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc medi lab other req.
	 *
	 * @return the user name of this acc medi lab other req
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc medi lab other req.
	 *
	 * @return the user uuid of this acc medi lab other req
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc medi lab other req.
	 *
	 * @return the uuid of this acc medi lab other req
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
	 * Sets the acc medi lab other req ID of this acc medi lab other req.
	 *
	 * @param accMediLabOtherReqId the acc medi lab other req ID of this acc medi lab other req
	 */
	@Override
	public void setAccMediLabOtherReqId(long accMediLabOtherReqId) {
		model.setAccMediLabOtherReqId(accMediLabOtherReqId);
	}

	/**
	 * Sets the company ID of this acc medi lab other req.
	 *
	 * @param companyId the company ID of this acc medi lab other req
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acc medi lab other req.
	 *
	 * @param createDate the create date of this acc medi lab other req
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acc medi lab other req.
	 *
	 * @param groupId the group ID of this acc medi lab other req
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this acc medi lab other req.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc medi lab other req
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this acc medi lab other req.
	 *
	 * @param modifiedDate the modified date of this acc medi lab other req
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the payment method of this acc medi lab other req.
	 *
	 * @param paymentMethod the payment method of this acc medi lab other req
	 */
	@Override
	public void setPaymentMethod(String paymentMethod) {
		model.setPaymentMethod(paymentMethod);
	}

	/**
	 * Sets the primary key of this acc medi lab other req.
	 *
	 * @param primaryKey the primary key of this acc medi lab other req
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the representative name of this acc medi lab other req.
	 *
	 * @param representativeName the representative name of this acc medi lab other req
	 */
	@Override
	public void setRepresentativeName(String representativeName) {
		model.setRepresentativeName(representativeName);
	}

	/**
	 * Sets the representative pos of this acc medi lab other req.
	 *
	 * @param representativePos the representative pos of this acc medi lab other req
	 */
	@Override
	public void setRepresentativePos(String representativePos) {
		model.setRepresentativePos(representativePos);
	}

	/**
	 * Sets the sign date of this acc medi lab other req.
	 *
	 * @param signDate the sign date of this acc medi lab other req
	 */
	@Override
	public void setSignDate(Date signDate) {
		model.setSignDate(signDate);
	}

	/**
	 * Sets the user ID of this acc medi lab other req.
	 *
	 * @param userId the user ID of this acc medi lab other req
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc medi lab other req.
	 *
	 * @param userName the user name of this acc medi lab other req
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc medi lab other req.
	 *
	 * @param userUuid the user uuid of this acc medi lab other req
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc medi lab other req.
	 *
	 * @param uuid the uuid of this acc medi lab other req
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
	protected AccMediLabOtherReqWrapper wrap(
		AccMediLabOtherReq accMediLabOtherReq) {

		return new AccMediLabOtherReqWrapper(accMediLabOtherReq);
	}

}