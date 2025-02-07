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
 * This class is a wrapper for {@link AccMediLabTestResourceReq}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestResourceReq
 * @generated
 */
public class AccMediLabTestResourceReqWrapper
	extends BaseModelWrapper<AccMediLabTestResourceReq>
	implements AccMediLabTestResourceReq,
			   ModelWrapper<AccMediLabTestResourceReq> {

	public AccMediLabTestResourceReqWrapper(
		AccMediLabTestResourceReq accMediLabTestResourceReq) {

		super(accMediLabTestResourceReq);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"accMediLabTestResourceReqId", getAccMediLabTestResourceReqId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("testExternal", getTestExternal());
		attributes.put("testCompetence", getTestCompetence());
		attributes.put("testLabFacilities", getTestLabFacilities());
		attributes.put("testLabContracted", getTestLabContracted());
		attributes.put("testLabFacilityEnv", getTestLabFacilityEnv());
		attributes.put("testSpecialEnv", getTestSpecialEnv());
		attributes.put("testMonitoringAct", getTestMonitoringAct());
		attributes.put("testLabRelatedEquip", getTestLabRelatedEquip());
		attributes.put("testSecurityArrange", getTestSecurityArrange());
		attributes.put("janaacApplicationId", getJanaacApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accMediLabTestResourceReqId = (Long)attributes.get(
			"accMediLabTestResourceReqId");

		if (accMediLabTestResourceReqId != null) {
			setAccMediLabTestResourceReqId(accMediLabTestResourceReqId);
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

		String testExternal = (String)attributes.get("testExternal");

		if (testExternal != null) {
			setTestExternal(testExternal);
		}

		String testCompetence = (String)attributes.get("testCompetence");

		if (testCompetence != null) {
			setTestCompetence(testCompetence);
		}

		String testLabFacilities = (String)attributes.get("testLabFacilities");

		if (testLabFacilities != null) {
			setTestLabFacilities(testLabFacilities);
		}

		String testLabContracted = (String)attributes.get("testLabContracted");

		if (testLabContracted != null) {
			setTestLabContracted(testLabContracted);
		}

		String testLabFacilityEnv = (String)attributes.get(
			"testLabFacilityEnv");

		if (testLabFacilityEnv != null) {
			setTestLabFacilityEnv(testLabFacilityEnv);
		}

		String testSpecialEnv = (String)attributes.get("testSpecialEnv");

		if (testSpecialEnv != null) {
			setTestSpecialEnv(testSpecialEnv);
		}

		String testMonitoringAct = (String)attributes.get("testMonitoringAct");

		if (testMonitoringAct != null) {
			setTestMonitoringAct(testMonitoringAct);
		}

		String testLabRelatedEquip = (String)attributes.get(
			"testLabRelatedEquip");

		if (testLabRelatedEquip != null) {
			setTestLabRelatedEquip(testLabRelatedEquip);
		}

		String testSecurityArrange = (String)attributes.get(
			"testSecurityArrange");

		if (testSecurityArrange != null) {
			setTestSecurityArrange(testSecurityArrange);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}
	}

	@Override
	public AccMediLabTestResourceReq cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc medi lab test resource req ID of this acc medi lab test resource req.
	 *
	 * @return the acc medi lab test resource req ID of this acc medi lab test resource req
	 */
	@Override
	public long getAccMediLabTestResourceReqId() {
		return model.getAccMediLabTestResourceReqId();
	}

	/**
	 * Returns the company ID of this acc medi lab test resource req.
	 *
	 * @return the company ID of this acc medi lab test resource req
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acc medi lab test resource req.
	 *
	 * @return the create date of this acc medi lab test resource req
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acc medi lab test resource req.
	 *
	 * @return the group ID of this acc medi lab test resource req
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this acc medi lab test resource req.
	 *
	 * @return the janaac application ID of this acc medi lab test resource req
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this acc medi lab test resource req.
	 *
	 * @return the modified date of this acc medi lab test resource req
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this acc medi lab test resource req.
	 *
	 * @return the primary key of this acc medi lab test resource req
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the test competence of this acc medi lab test resource req.
	 *
	 * @return the test competence of this acc medi lab test resource req
	 */
	@Override
	public String getTestCompetence() {
		return model.getTestCompetence();
	}

	/**
	 * Returns the test external of this acc medi lab test resource req.
	 *
	 * @return the test external of this acc medi lab test resource req
	 */
	@Override
	public String getTestExternal() {
		return model.getTestExternal();
	}

	/**
	 * Returns the test lab contracted of this acc medi lab test resource req.
	 *
	 * @return the test lab contracted of this acc medi lab test resource req
	 */
	@Override
	public String getTestLabContracted() {
		return model.getTestLabContracted();
	}

	/**
	 * Returns the test lab facilities of this acc medi lab test resource req.
	 *
	 * @return the test lab facilities of this acc medi lab test resource req
	 */
	@Override
	public String getTestLabFacilities() {
		return model.getTestLabFacilities();
	}

	/**
	 * Returns the test lab facility env of this acc medi lab test resource req.
	 *
	 * @return the test lab facility env of this acc medi lab test resource req
	 */
	@Override
	public String getTestLabFacilityEnv() {
		return model.getTestLabFacilityEnv();
	}

	/**
	 * Returns the test lab related equip of this acc medi lab test resource req.
	 *
	 * @return the test lab related equip of this acc medi lab test resource req
	 */
	@Override
	public String getTestLabRelatedEquip() {
		return model.getTestLabRelatedEquip();
	}

	/**
	 * Returns the test monitoring act of this acc medi lab test resource req.
	 *
	 * @return the test monitoring act of this acc medi lab test resource req
	 */
	@Override
	public String getTestMonitoringAct() {
		return model.getTestMonitoringAct();
	}

	/**
	 * Returns the test security arrange of this acc medi lab test resource req.
	 *
	 * @return the test security arrange of this acc medi lab test resource req
	 */
	@Override
	public String getTestSecurityArrange() {
		return model.getTestSecurityArrange();
	}

	/**
	 * Returns the test special env of this acc medi lab test resource req.
	 *
	 * @return the test special env of this acc medi lab test resource req
	 */
	@Override
	public String getTestSpecialEnv() {
		return model.getTestSpecialEnv();
	}

	/**
	 * Returns the user ID of this acc medi lab test resource req.
	 *
	 * @return the user ID of this acc medi lab test resource req
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc medi lab test resource req.
	 *
	 * @return the user name of this acc medi lab test resource req
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc medi lab test resource req.
	 *
	 * @return the user uuid of this acc medi lab test resource req
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc medi lab test resource req.
	 *
	 * @return the uuid of this acc medi lab test resource req
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
	 * Sets the acc medi lab test resource req ID of this acc medi lab test resource req.
	 *
	 * @param accMediLabTestResourceReqId the acc medi lab test resource req ID of this acc medi lab test resource req
	 */
	@Override
	public void setAccMediLabTestResourceReqId(
		long accMediLabTestResourceReqId) {

		model.setAccMediLabTestResourceReqId(accMediLabTestResourceReqId);
	}

	/**
	 * Sets the company ID of this acc medi lab test resource req.
	 *
	 * @param companyId the company ID of this acc medi lab test resource req
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acc medi lab test resource req.
	 *
	 * @param createDate the create date of this acc medi lab test resource req
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acc medi lab test resource req.
	 *
	 * @param groupId the group ID of this acc medi lab test resource req
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this acc medi lab test resource req.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc medi lab test resource req
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this acc medi lab test resource req.
	 *
	 * @param modifiedDate the modified date of this acc medi lab test resource req
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this acc medi lab test resource req.
	 *
	 * @param primaryKey the primary key of this acc medi lab test resource req
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the test competence of this acc medi lab test resource req.
	 *
	 * @param testCompetence the test competence of this acc medi lab test resource req
	 */
	@Override
	public void setTestCompetence(String testCompetence) {
		model.setTestCompetence(testCompetence);
	}

	/**
	 * Sets the test external of this acc medi lab test resource req.
	 *
	 * @param testExternal the test external of this acc medi lab test resource req
	 */
	@Override
	public void setTestExternal(String testExternal) {
		model.setTestExternal(testExternal);
	}

	/**
	 * Sets the test lab contracted of this acc medi lab test resource req.
	 *
	 * @param testLabContracted the test lab contracted of this acc medi lab test resource req
	 */
	@Override
	public void setTestLabContracted(String testLabContracted) {
		model.setTestLabContracted(testLabContracted);
	}

	/**
	 * Sets the test lab facilities of this acc medi lab test resource req.
	 *
	 * @param testLabFacilities the test lab facilities of this acc medi lab test resource req
	 */
	@Override
	public void setTestLabFacilities(String testLabFacilities) {
		model.setTestLabFacilities(testLabFacilities);
	}

	/**
	 * Sets the test lab facility env of this acc medi lab test resource req.
	 *
	 * @param testLabFacilityEnv the test lab facility env of this acc medi lab test resource req
	 */
	@Override
	public void setTestLabFacilityEnv(String testLabFacilityEnv) {
		model.setTestLabFacilityEnv(testLabFacilityEnv);
	}

	/**
	 * Sets the test lab related equip of this acc medi lab test resource req.
	 *
	 * @param testLabRelatedEquip the test lab related equip of this acc medi lab test resource req
	 */
	@Override
	public void setTestLabRelatedEquip(String testLabRelatedEquip) {
		model.setTestLabRelatedEquip(testLabRelatedEquip);
	}

	/**
	 * Sets the test monitoring act of this acc medi lab test resource req.
	 *
	 * @param testMonitoringAct the test monitoring act of this acc medi lab test resource req
	 */
	@Override
	public void setTestMonitoringAct(String testMonitoringAct) {
		model.setTestMonitoringAct(testMonitoringAct);
	}

	/**
	 * Sets the test security arrange of this acc medi lab test resource req.
	 *
	 * @param testSecurityArrange the test security arrange of this acc medi lab test resource req
	 */
	@Override
	public void setTestSecurityArrange(String testSecurityArrange) {
		model.setTestSecurityArrange(testSecurityArrange);
	}

	/**
	 * Sets the test special env of this acc medi lab test resource req.
	 *
	 * @param testSpecialEnv the test special env of this acc medi lab test resource req
	 */
	@Override
	public void setTestSpecialEnv(String testSpecialEnv) {
		model.setTestSpecialEnv(testSpecialEnv);
	}

	/**
	 * Sets the user ID of this acc medi lab test resource req.
	 *
	 * @param userId the user ID of this acc medi lab test resource req
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc medi lab test resource req.
	 *
	 * @param userName the user name of this acc medi lab test resource req
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc medi lab test resource req.
	 *
	 * @param userUuid the user uuid of this acc medi lab test resource req
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc medi lab test resource req.
	 *
	 * @param uuid the uuid of this acc medi lab test resource req
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
	protected AccMediLabTestResourceReqWrapper wrap(
		AccMediLabTestResourceReq accMediLabTestResourceReq) {

		return new AccMediLabTestResourceReqWrapper(accMediLabTestResourceReq);
	}

}