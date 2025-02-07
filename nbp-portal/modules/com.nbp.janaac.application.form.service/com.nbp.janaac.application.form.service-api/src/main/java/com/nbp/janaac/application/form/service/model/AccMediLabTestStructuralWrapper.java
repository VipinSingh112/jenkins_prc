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
 * This class is a wrapper for {@link AccMediLabTestStructural}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestStructural
 * @generated
 */
public class AccMediLabTestStructuralWrapper
	extends BaseModelWrapper<AccMediLabTestStructural>
	implements AccMediLabTestStructural,
			   ModelWrapper<AccMediLabTestStructural> {

	public AccMediLabTestStructuralWrapper(
		AccMediLabTestStructural accMediLabTestStructural) {

		super(accMediLabTestStructural);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"accMediLabTestStructuralId", getAccMediLabTestStructuralId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("testLabLegalEntity", getTestLabLegalEntity());
		attributes.put("testlegalStatus", getTestlegalStatus());
		attributes.put("testlabPartOfOrg", getTestlabPartOfOrg());
		attributes.put("testlabPartOfOrgName", getTestlabPartOfOrgName());
		attributes.put("testLabPartOfOrgPos", getTestLabPartOfOrgPos());
		attributes.put("testMangerialStaff", getTestMangerialStaff());
		attributes.put("testTechnicalStaff", getTestTechnicalStaff());
		attributes.put("testingRelevantDoc", getTestingRelevantDoc());
		attributes.put("testMajorIncome", getTestMajorIncome());
		attributes.put("testLabClients", getTestLabClients());
		attributes.put("janaacApplicationId", getJanaacApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accMediLabTestStructuralId = (Long)attributes.get(
			"accMediLabTestStructuralId");

		if (accMediLabTestStructuralId != null) {
			setAccMediLabTestStructuralId(accMediLabTestStructuralId);
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

		String testLabLegalEntity = (String)attributes.get(
			"testLabLegalEntity");

		if (testLabLegalEntity != null) {
			setTestLabLegalEntity(testLabLegalEntity);
		}

		String testlegalStatus = (String)attributes.get("testlegalStatus");

		if (testlegalStatus != null) {
			setTestlegalStatus(testlegalStatus);
		}

		String testlabPartOfOrg = (String)attributes.get("testlabPartOfOrg");

		if (testlabPartOfOrg != null) {
			setTestlabPartOfOrg(testlabPartOfOrg);
		}

		String testlabPartOfOrgName = (String)attributes.get(
			"testlabPartOfOrgName");

		if (testlabPartOfOrgName != null) {
			setTestlabPartOfOrgName(testlabPartOfOrgName);
		}

		String testLabPartOfOrgPos = (String)attributes.get(
			"testLabPartOfOrgPos");

		if (testLabPartOfOrgPos != null) {
			setTestLabPartOfOrgPos(testLabPartOfOrgPos);
		}

		String testMangerialStaff = (String)attributes.get(
			"testMangerialStaff");

		if (testMangerialStaff != null) {
			setTestMangerialStaff(testMangerialStaff);
		}

		String testTechnicalStaff = (String)attributes.get(
			"testTechnicalStaff");

		if (testTechnicalStaff != null) {
			setTestTechnicalStaff(testTechnicalStaff);
		}

		String testingRelevantDoc = (String)attributes.get(
			"testingRelevantDoc");

		if (testingRelevantDoc != null) {
			setTestingRelevantDoc(testingRelevantDoc);
		}

		String testMajorIncome = (String)attributes.get("testMajorIncome");

		if (testMajorIncome != null) {
			setTestMajorIncome(testMajorIncome);
		}

		String testLabClients = (String)attributes.get("testLabClients");

		if (testLabClients != null) {
			setTestLabClients(testLabClients);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}
	}

	@Override
	public AccMediLabTestStructural cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc medi lab test structural ID of this acc medi lab test structural.
	 *
	 * @return the acc medi lab test structural ID of this acc medi lab test structural
	 */
	@Override
	public long getAccMediLabTestStructuralId() {
		return model.getAccMediLabTestStructuralId();
	}

	/**
	 * Returns the company ID of this acc medi lab test structural.
	 *
	 * @return the company ID of this acc medi lab test structural
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acc medi lab test structural.
	 *
	 * @return the create date of this acc medi lab test structural
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acc medi lab test structural.
	 *
	 * @return the group ID of this acc medi lab test structural
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this acc medi lab test structural.
	 *
	 * @return the janaac application ID of this acc medi lab test structural
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this acc medi lab test structural.
	 *
	 * @return the modified date of this acc medi lab test structural
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this acc medi lab test structural.
	 *
	 * @return the primary key of this acc medi lab test structural
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the testing relevant doc of this acc medi lab test structural.
	 *
	 * @return the testing relevant doc of this acc medi lab test structural
	 */
	@Override
	public String getTestingRelevantDoc() {
		return model.getTestingRelevantDoc();
	}

	/**
	 * Returns the test lab clients of this acc medi lab test structural.
	 *
	 * @return the test lab clients of this acc medi lab test structural
	 */
	@Override
	public String getTestLabClients() {
		return model.getTestLabClients();
	}

	/**
	 * Returns the test lab legal entity of this acc medi lab test structural.
	 *
	 * @return the test lab legal entity of this acc medi lab test structural
	 */
	@Override
	public String getTestLabLegalEntity() {
		return model.getTestLabLegalEntity();
	}

	/**
	 * Returns the testlab part of org of this acc medi lab test structural.
	 *
	 * @return the testlab part of org of this acc medi lab test structural
	 */
	@Override
	public String getTestlabPartOfOrg() {
		return model.getTestlabPartOfOrg();
	}

	/**
	 * Returns the testlab part of org name of this acc medi lab test structural.
	 *
	 * @return the testlab part of org name of this acc medi lab test structural
	 */
	@Override
	public String getTestlabPartOfOrgName() {
		return model.getTestlabPartOfOrgName();
	}

	/**
	 * Returns the test lab part of org pos of this acc medi lab test structural.
	 *
	 * @return the test lab part of org pos of this acc medi lab test structural
	 */
	@Override
	public String getTestLabPartOfOrgPos() {
		return model.getTestLabPartOfOrgPos();
	}

	/**
	 * Returns the testlegal status of this acc medi lab test structural.
	 *
	 * @return the testlegal status of this acc medi lab test structural
	 */
	@Override
	public String getTestlegalStatus() {
		return model.getTestlegalStatus();
	}

	/**
	 * Returns the test major income of this acc medi lab test structural.
	 *
	 * @return the test major income of this acc medi lab test structural
	 */
	@Override
	public String getTestMajorIncome() {
		return model.getTestMajorIncome();
	}

	/**
	 * Returns the test mangerial staff of this acc medi lab test structural.
	 *
	 * @return the test mangerial staff of this acc medi lab test structural
	 */
	@Override
	public String getTestMangerialStaff() {
		return model.getTestMangerialStaff();
	}

	/**
	 * Returns the test technical staff of this acc medi lab test structural.
	 *
	 * @return the test technical staff of this acc medi lab test structural
	 */
	@Override
	public String getTestTechnicalStaff() {
		return model.getTestTechnicalStaff();
	}

	/**
	 * Returns the user ID of this acc medi lab test structural.
	 *
	 * @return the user ID of this acc medi lab test structural
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc medi lab test structural.
	 *
	 * @return the user name of this acc medi lab test structural
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc medi lab test structural.
	 *
	 * @return the user uuid of this acc medi lab test structural
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc medi lab test structural.
	 *
	 * @return the uuid of this acc medi lab test structural
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
	 * Sets the acc medi lab test structural ID of this acc medi lab test structural.
	 *
	 * @param accMediLabTestStructuralId the acc medi lab test structural ID of this acc medi lab test structural
	 */
	@Override
	public void setAccMediLabTestStructuralId(long accMediLabTestStructuralId) {
		model.setAccMediLabTestStructuralId(accMediLabTestStructuralId);
	}

	/**
	 * Sets the company ID of this acc medi lab test structural.
	 *
	 * @param companyId the company ID of this acc medi lab test structural
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acc medi lab test structural.
	 *
	 * @param createDate the create date of this acc medi lab test structural
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acc medi lab test structural.
	 *
	 * @param groupId the group ID of this acc medi lab test structural
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this acc medi lab test structural.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc medi lab test structural
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this acc medi lab test structural.
	 *
	 * @param modifiedDate the modified date of this acc medi lab test structural
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this acc medi lab test structural.
	 *
	 * @param primaryKey the primary key of this acc medi lab test structural
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the testing relevant doc of this acc medi lab test structural.
	 *
	 * @param testingRelevantDoc the testing relevant doc of this acc medi lab test structural
	 */
	@Override
	public void setTestingRelevantDoc(String testingRelevantDoc) {
		model.setTestingRelevantDoc(testingRelevantDoc);
	}

	/**
	 * Sets the test lab clients of this acc medi lab test structural.
	 *
	 * @param testLabClients the test lab clients of this acc medi lab test structural
	 */
	@Override
	public void setTestLabClients(String testLabClients) {
		model.setTestLabClients(testLabClients);
	}

	/**
	 * Sets the test lab legal entity of this acc medi lab test structural.
	 *
	 * @param testLabLegalEntity the test lab legal entity of this acc medi lab test structural
	 */
	@Override
	public void setTestLabLegalEntity(String testLabLegalEntity) {
		model.setTestLabLegalEntity(testLabLegalEntity);
	}

	/**
	 * Sets the testlab part of org of this acc medi lab test structural.
	 *
	 * @param testlabPartOfOrg the testlab part of org of this acc medi lab test structural
	 */
	@Override
	public void setTestlabPartOfOrg(String testlabPartOfOrg) {
		model.setTestlabPartOfOrg(testlabPartOfOrg);
	}

	/**
	 * Sets the testlab part of org name of this acc medi lab test structural.
	 *
	 * @param testlabPartOfOrgName the testlab part of org name of this acc medi lab test structural
	 */
	@Override
	public void setTestlabPartOfOrgName(String testlabPartOfOrgName) {
		model.setTestlabPartOfOrgName(testlabPartOfOrgName);
	}

	/**
	 * Sets the test lab part of org pos of this acc medi lab test structural.
	 *
	 * @param testLabPartOfOrgPos the test lab part of org pos of this acc medi lab test structural
	 */
	@Override
	public void setTestLabPartOfOrgPos(String testLabPartOfOrgPos) {
		model.setTestLabPartOfOrgPos(testLabPartOfOrgPos);
	}

	/**
	 * Sets the testlegal status of this acc medi lab test structural.
	 *
	 * @param testlegalStatus the testlegal status of this acc medi lab test structural
	 */
	@Override
	public void setTestlegalStatus(String testlegalStatus) {
		model.setTestlegalStatus(testlegalStatus);
	}

	/**
	 * Sets the test major income of this acc medi lab test structural.
	 *
	 * @param testMajorIncome the test major income of this acc medi lab test structural
	 */
	@Override
	public void setTestMajorIncome(String testMajorIncome) {
		model.setTestMajorIncome(testMajorIncome);
	}

	/**
	 * Sets the test mangerial staff of this acc medi lab test structural.
	 *
	 * @param testMangerialStaff the test mangerial staff of this acc medi lab test structural
	 */
	@Override
	public void setTestMangerialStaff(String testMangerialStaff) {
		model.setTestMangerialStaff(testMangerialStaff);
	}

	/**
	 * Sets the test technical staff of this acc medi lab test structural.
	 *
	 * @param testTechnicalStaff the test technical staff of this acc medi lab test structural
	 */
	@Override
	public void setTestTechnicalStaff(String testTechnicalStaff) {
		model.setTestTechnicalStaff(testTechnicalStaff);
	}

	/**
	 * Sets the user ID of this acc medi lab test structural.
	 *
	 * @param userId the user ID of this acc medi lab test structural
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc medi lab test structural.
	 *
	 * @param userName the user name of this acc medi lab test structural
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc medi lab test structural.
	 *
	 * @param userUuid the user uuid of this acc medi lab test structural
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc medi lab test structural.
	 *
	 * @param uuid the uuid of this acc medi lab test structural
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
	protected AccMediLabTestStructuralWrapper wrap(
		AccMediLabTestStructural accMediLabTestStructural) {

		return new AccMediLabTestStructuralWrapper(accMediLabTestStructural);
	}

}