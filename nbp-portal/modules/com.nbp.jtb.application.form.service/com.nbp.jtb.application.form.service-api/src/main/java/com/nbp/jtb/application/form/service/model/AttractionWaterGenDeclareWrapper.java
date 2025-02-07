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
 * This class is a wrapper for {@link AttractionWaterGenDeclare}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterGenDeclare
 * @generated
 */
public class AttractionWaterGenDeclareWrapper
	extends BaseModelWrapper<AttractionWaterGenDeclare>
	implements AttractionWaterGenDeclare,
			   ModelWrapper<AttractionWaterGenDeclare> {

	public AttractionWaterGenDeclareWrapper(
		AttractionWaterGenDeclare attractionWaterGenDeclare) {

		super(attractionWaterGenDeclare);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"attractionWaterGenDeclareId", getAttractionWaterGenDeclareId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("firstAid", getFirstAid());
		attributes.put("cpr", getCpr());
		attributes.put("divingCertificate", getDivingCertificate());
		attributes.put("rlss", getRlss());
		attributes.put("lifeguard", getLifeguard());
		attributes.put("breathing", getBreathing());
		attributes.put("operationName", getOperationName());
		attributes.put("operationAddress", getOperationAddress());
		attributes.put("insuranceAmount", getInsuranceAmount());
		attributes.put("managerSignDate", getManagerSignDate());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attractionWaterGenDeclareId = (Long)attributes.get(
			"attractionWaterGenDeclareId");

		if (attractionWaterGenDeclareId != null) {
			setAttractionWaterGenDeclareId(attractionWaterGenDeclareId);
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

		String firstAid = (String)attributes.get("firstAid");

		if (firstAid != null) {
			setFirstAid(firstAid);
		}

		String cpr = (String)attributes.get("cpr");

		if (cpr != null) {
			setCpr(cpr);
		}

		String divingCertificate = (String)attributes.get("divingCertificate");

		if (divingCertificate != null) {
			setDivingCertificate(divingCertificate);
		}

		String rlss = (String)attributes.get("rlss");

		if (rlss != null) {
			setRlss(rlss);
		}

		String lifeguard = (String)attributes.get("lifeguard");

		if (lifeguard != null) {
			setLifeguard(lifeguard);
		}

		String breathing = (String)attributes.get("breathing");

		if (breathing != null) {
			setBreathing(breathing);
		}

		String operationName = (String)attributes.get("operationName");

		if (operationName != null) {
			setOperationName(operationName);
		}

		String operationAddress = (String)attributes.get("operationAddress");

		if (operationAddress != null) {
			setOperationAddress(operationAddress);
		}

		String insuranceAmount = (String)attributes.get("insuranceAmount");

		if (insuranceAmount != null) {
			setInsuranceAmount(insuranceAmount);
		}

		Date managerSignDate = (Date)attributes.get("managerSignDate");

		if (managerSignDate != null) {
			setManagerSignDate(managerSignDate);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AttractionWaterGenDeclare cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the attraction water gen declare ID of this attraction water gen declare.
	 *
	 * @return the attraction water gen declare ID of this attraction water gen declare
	 */
	@Override
	public long getAttractionWaterGenDeclareId() {
		return model.getAttractionWaterGenDeclareId();
	}

	/**
	 * Returns the breathing of this attraction water gen declare.
	 *
	 * @return the breathing of this attraction water gen declare
	 */
	@Override
	public String getBreathing() {
		return model.getBreathing();
	}

	/**
	 * Returns the company ID of this attraction water gen declare.
	 *
	 * @return the company ID of this attraction water gen declare
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the cpr of this attraction water gen declare.
	 *
	 * @return the cpr of this attraction water gen declare
	 */
	@Override
	public String getCpr() {
		return model.getCpr();
	}

	/**
	 * Returns the create date of this attraction water gen declare.
	 *
	 * @return the create date of this attraction water gen declare
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the diving certificate of this attraction water gen declare.
	 *
	 * @return the diving certificate of this attraction water gen declare
	 */
	@Override
	public String getDivingCertificate() {
		return model.getDivingCertificate();
	}

	/**
	 * Returns the first aid of this attraction water gen declare.
	 *
	 * @return the first aid of this attraction water gen declare
	 */
	@Override
	public String getFirstAid() {
		return model.getFirstAid();
	}

	/**
	 * Returns the group ID of this attraction water gen declare.
	 *
	 * @return the group ID of this attraction water gen declare
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the insurance amount of this attraction water gen declare.
	 *
	 * @return the insurance amount of this attraction water gen declare
	 */
	@Override
	public String getInsuranceAmount() {
		return model.getInsuranceAmount();
	}

	/**
	 * Returns the jtb application ID of this attraction water gen declare.
	 *
	 * @return the jtb application ID of this attraction water gen declare
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the lifeguard of this attraction water gen declare.
	 *
	 * @return the lifeguard of this attraction water gen declare
	 */
	@Override
	public String getLifeguard() {
		return model.getLifeguard();
	}

	/**
	 * Returns the manager sign date of this attraction water gen declare.
	 *
	 * @return the manager sign date of this attraction water gen declare
	 */
	@Override
	public Date getManagerSignDate() {
		return model.getManagerSignDate();
	}

	/**
	 * Returns the modified date of this attraction water gen declare.
	 *
	 * @return the modified date of this attraction water gen declare
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the operation address of this attraction water gen declare.
	 *
	 * @return the operation address of this attraction water gen declare
	 */
	@Override
	public String getOperationAddress() {
		return model.getOperationAddress();
	}

	/**
	 * Returns the operation name of this attraction water gen declare.
	 *
	 * @return the operation name of this attraction water gen declare
	 */
	@Override
	public String getOperationName() {
		return model.getOperationName();
	}

	/**
	 * Returns the primary key of this attraction water gen declare.
	 *
	 * @return the primary key of this attraction water gen declare
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the rlss of this attraction water gen declare.
	 *
	 * @return the rlss of this attraction water gen declare
	 */
	@Override
	public String getRlss() {
		return model.getRlss();
	}

	/**
	 * Returns the user ID of this attraction water gen declare.
	 *
	 * @return the user ID of this attraction water gen declare
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this attraction water gen declare.
	 *
	 * @return the user name of this attraction water gen declare
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this attraction water gen declare.
	 *
	 * @return the user uuid of this attraction water gen declare
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
	 * Sets the attraction water gen declare ID of this attraction water gen declare.
	 *
	 * @param attractionWaterGenDeclareId the attraction water gen declare ID of this attraction water gen declare
	 */
	@Override
	public void setAttractionWaterGenDeclareId(
		long attractionWaterGenDeclareId) {

		model.setAttractionWaterGenDeclareId(attractionWaterGenDeclareId);
	}

	/**
	 * Sets the breathing of this attraction water gen declare.
	 *
	 * @param breathing the breathing of this attraction water gen declare
	 */
	@Override
	public void setBreathing(String breathing) {
		model.setBreathing(breathing);
	}

	/**
	 * Sets the company ID of this attraction water gen declare.
	 *
	 * @param companyId the company ID of this attraction water gen declare
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the cpr of this attraction water gen declare.
	 *
	 * @param cpr the cpr of this attraction water gen declare
	 */
	@Override
	public void setCpr(String cpr) {
		model.setCpr(cpr);
	}

	/**
	 * Sets the create date of this attraction water gen declare.
	 *
	 * @param createDate the create date of this attraction water gen declare
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the diving certificate of this attraction water gen declare.
	 *
	 * @param divingCertificate the diving certificate of this attraction water gen declare
	 */
	@Override
	public void setDivingCertificate(String divingCertificate) {
		model.setDivingCertificate(divingCertificate);
	}

	/**
	 * Sets the first aid of this attraction water gen declare.
	 *
	 * @param firstAid the first aid of this attraction water gen declare
	 */
	@Override
	public void setFirstAid(String firstAid) {
		model.setFirstAid(firstAid);
	}

	/**
	 * Sets the group ID of this attraction water gen declare.
	 *
	 * @param groupId the group ID of this attraction water gen declare
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the insurance amount of this attraction water gen declare.
	 *
	 * @param insuranceAmount the insurance amount of this attraction water gen declare
	 */
	@Override
	public void setInsuranceAmount(String insuranceAmount) {
		model.setInsuranceAmount(insuranceAmount);
	}

	/**
	 * Sets the jtb application ID of this attraction water gen declare.
	 *
	 * @param jtbApplicationId the jtb application ID of this attraction water gen declare
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the lifeguard of this attraction water gen declare.
	 *
	 * @param lifeguard the lifeguard of this attraction water gen declare
	 */
	@Override
	public void setLifeguard(String lifeguard) {
		model.setLifeguard(lifeguard);
	}

	/**
	 * Sets the manager sign date of this attraction water gen declare.
	 *
	 * @param managerSignDate the manager sign date of this attraction water gen declare
	 */
	@Override
	public void setManagerSignDate(Date managerSignDate) {
		model.setManagerSignDate(managerSignDate);
	}

	/**
	 * Sets the modified date of this attraction water gen declare.
	 *
	 * @param modifiedDate the modified date of this attraction water gen declare
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the operation address of this attraction water gen declare.
	 *
	 * @param operationAddress the operation address of this attraction water gen declare
	 */
	@Override
	public void setOperationAddress(String operationAddress) {
		model.setOperationAddress(operationAddress);
	}

	/**
	 * Sets the operation name of this attraction water gen declare.
	 *
	 * @param operationName the operation name of this attraction water gen declare
	 */
	@Override
	public void setOperationName(String operationName) {
		model.setOperationName(operationName);
	}

	/**
	 * Sets the primary key of this attraction water gen declare.
	 *
	 * @param primaryKey the primary key of this attraction water gen declare
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the rlss of this attraction water gen declare.
	 *
	 * @param rlss the rlss of this attraction water gen declare
	 */
	@Override
	public void setRlss(String rlss) {
		model.setRlss(rlss);
	}

	/**
	 * Sets the user ID of this attraction water gen declare.
	 *
	 * @param userId the user ID of this attraction water gen declare
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this attraction water gen declare.
	 *
	 * @param userName the user name of this attraction water gen declare
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this attraction water gen declare.
	 *
	 * @param userUuid the user uuid of this attraction water gen declare
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
	protected AttractionWaterGenDeclareWrapper wrap(
		AttractionWaterGenDeclare attractionWaterGenDeclare) {

		return new AttractionWaterGenDeclareWrapper(attractionWaterGenDeclare);
	}

}