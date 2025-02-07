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
 * This class is a wrapper for {@link AccCerBodyScope}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyScope
 * @generated
 */
public class AccCerBodyScopeWrapper
	extends BaseModelWrapper<AccCerBodyScope>
	implements AccCerBodyScope, ModelWrapper<AccCerBodyScope> {

	public AccCerBodyScopeWrapper(AccCerBodyScope accCerBodyScope) {
		super(accCerBodyScope);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("accCerBodyScopeId", getAccCerBodyScopeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("certificationStandard", getCertificationStandard());
		attributes.put("expertiseField1", getExpertiseField1());
		attributes.put("expertiseField2", getExpertiseField2());
		attributes.put("expertiseField3", getExpertiseField3());
		attributes.put("expertiseField4", getExpertiseField4());
		attributes.put("expertiseField5", getExpertiseField5());
		attributes.put("expertiseField6", getExpertiseField6());
		attributes.put("expertiseField7", getExpertiseField7());
		attributes.put("expertiseField8", getExpertiseField8());
		attributes.put("expertiseField9", getExpertiseField9());
		attributes.put("expertiseField10", getExpertiseField10());
		attributes.put("expertiseField11", getExpertiseField11());
		attributes.put("expertiseField12", getExpertiseField12());
		attributes.put("expertiseField13", getExpertiseField13());
		attributes.put("expertiseField14", getExpertiseField14());
		attributes.put("cerIntrestedParties", getCerIntrestedParties());
		attributes.put("otherServices", getOtherServices());
		attributes.put("otherServicesDescribe", getOtherServicesDescribe());
		attributes.put("establishedRelation", getEstablishedRelation());
		attributes.put("establishedRelDesc", getEstablishedRelDesc());
		attributes.put("clientService", getClientService());
		attributes.put("certificationCerBody", getCertificationCerBody());
		attributes.put("orgAccredited", getOrgAccredited());
		attributes.put("responsibleBody", getResponsibleBody());
		attributes.put("accExpDate", getAccExpDate());
		attributes.put("certBodyScope", getCertBodyScope());
		attributes.put("janaacApplicationId", getJanaacApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accCerBodyScopeId = (Long)attributes.get("accCerBodyScopeId");

		if (accCerBodyScopeId != null) {
			setAccCerBodyScopeId(accCerBodyScopeId);
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

		String certificationStandard = (String)attributes.get(
			"certificationStandard");

		if (certificationStandard != null) {
			setCertificationStandard(certificationStandard);
		}

		String expertiseField1 = (String)attributes.get("expertiseField1");

		if (expertiseField1 != null) {
			setExpertiseField1(expertiseField1);
		}

		String expertiseField2 = (String)attributes.get("expertiseField2");

		if (expertiseField2 != null) {
			setExpertiseField2(expertiseField2);
		}

		String expertiseField3 = (String)attributes.get("expertiseField3");

		if (expertiseField3 != null) {
			setExpertiseField3(expertiseField3);
		}

		String expertiseField4 = (String)attributes.get("expertiseField4");

		if (expertiseField4 != null) {
			setExpertiseField4(expertiseField4);
		}

		String expertiseField5 = (String)attributes.get("expertiseField5");

		if (expertiseField5 != null) {
			setExpertiseField5(expertiseField5);
		}

		String expertiseField6 = (String)attributes.get("expertiseField6");

		if (expertiseField6 != null) {
			setExpertiseField6(expertiseField6);
		}

		String expertiseField7 = (String)attributes.get("expertiseField7");

		if (expertiseField7 != null) {
			setExpertiseField7(expertiseField7);
		}

		String expertiseField8 = (String)attributes.get("expertiseField8");

		if (expertiseField8 != null) {
			setExpertiseField8(expertiseField8);
		}

		String expertiseField9 = (String)attributes.get("expertiseField9");

		if (expertiseField9 != null) {
			setExpertiseField9(expertiseField9);
		}

		String expertiseField10 = (String)attributes.get("expertiseField10");

		if (expertiseField10 != null) {
			setExpertiseField10(expertiseField10);
		}

		String expertiseField11 = (String)attributes.get("expertiseField11");

		if (expertiseField11 != null) {
			setExpertiseField11(expertiseField11);
		}

		String expertiseField12 = (String)attributes.get("expertiseField12");

		if (expertiseField12 != null) {
			setExpertiseField12(expertiseField12);
		}

		String expertiseField13 = (String)attributes.get("expertiseField13");

		if (expertiseField13 != null) {
			setExpertiseField13(expertiseField13);
		}

		String expertiseField14 = (String)attributes.get("expertiseField14");

		if (expertiseField14 != null) {
			setExpertiseField14(expertiseField14);
		}

		String cerIntrestedParties = (String)attributes.get(
			"cerIntrestedParties");

		if (cerIntrestedParties != null) {
			setCerIntrestedParties(cerIntrestedParties);
		}

		String otherServices = (String)attributes.get("otherServices");

		if (otherServices != null) {
			setOtherServices(otherServices);
		}

		String otherServicesDescribe = (String)attributes.get(
			"otherServicesDescribe");

		if (otherServicesDescribe != null) {
			setOtherServicesDescribe(otherServicesDescribe);
		}

		String establishedRelation = (String)attributes.get(
			"establishedRelation");

		if (establishedRelation != null) {
			setEstablishedRelation(establishedRelation);
		}

		String establishedRelDesc = (String)attributes.get(
			"establishedRelDesc");

		if (establishedRelDesc != null) {
			setEstablishedRelDesc(establishedRelDesc);
		}

		String clientService = (String)attributes.get("clientService");

		if (clientService != null) {
			setClientService(clientService);
		}

		String certificationCerBody = (String)attributes.get(
			"certificationCerBody");

		if (certificationCerBody != null) {
			setCertificationCerBody(certificationCerBody);
		}

		String orgAccredited = (String)attributes.get("orgAccredited");

		if (orgAccredited != null) {
			setOrgAccredited(orgAccredited);
		}

		String responsibleBody = (String)attributes.get("responsibleBody");

		if (responsibleBody != null) {
			setResponsibleBody(responsibleBody);
		}

		Date accExpDate = (Date)attributes.get("accExpDate");

		if (accExpDate != null) {
			setAccExpDate(accExpDate);
		}

		String certBodyScope = (String)attributes.get("certBodyScope");

		if (certBodyScope != null) {
			setCertBodyScope(certBodyScope);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}
	}

	@Override
	public AccCerBodyScope cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc cer body scope ID of this acc cer body scope.
	 *
	 * @return the acc cer body scope ID of this acc cer body scope
	 */
	@Override
	public long getAccCerBodyScopeId() {
		return model.getAccCerBodyScopeId();
	}

	/**
	 * Returns the acc exp date of this acc cer body scope.
	 *
	 * @return the acc exp date of this acc cer body scope
	 */
	@Override
	public Date getAccExpDate() {
		return model.getAccExpDate();
	}

	/**
	 * Returns the cer intrested parties of this acc cer body scope.
	 *
	 * @return the cer intrested parties of this acc cer body scope
	 */
	@Override
	public String getCerIntrestedParties() {
		return model.getCerIntrestedParties();
	}

	/**
	 * Returns the cert body scope of this acc cer body scope.
	 *
	 * @return the cert body scope of this acc cer body scope
	 */
	@Override
	public String getCertBodyScope() {
		return model.getCertBodyScope();
	}

	/**
	 * Returns the certification cer body of this acc cer body scope.
	 *
	 * @return the certification cer body of this acc cer body scope
	 */
	@Override
	public String getCertificationCerBody() {
		return model.getCertificationCerBody();
	}

	/**
	 * Returns the certification standard of this acc cer body scope.
	 *
	 * @return the certification standard of this acc cer body scope
	 */
	@Override
	public String getCertificationStandard() {
		return model.getCertificationStandard();
	}

	/**
	 * Returns the client service of this acc cer body scope.
	 *
	 * @return the client service of this acc cer body scope
	 */
	@Override
	public String getClientService() {
		return model.getClientService();
	}

	/**
	 * Returns the company ID of this acc cer body scope.
	 *
	 * @return the company ID of this acc cer body scope
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acc cer body scope.
	 *
	 * @return the create date of this acc cer body scope
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the established relation of this acc cer body scope.
	 *
	 * @return the established relation of this acc cer body scope
	 */
	@Override
	public String getEstablishedRelation() {
		return model.getEstablishedRelation();
	}

	/**
	 * Returns the established rel desc of this acc cer body scope.
	 *
	 * @return the established rel desc of this acc cer body scope
	 */
	@Override
	public String getEstablishedRelDesc() {
		return model.getEstablishedRelDesc();
	}

	/**
	 * Returns the expertise field1 of this acc cer body scope.
	 *
	 * @return the expertise field1 of this acc cer body scope
	 */
	@Override
	public String getExpertiseField1() {
		return model.getExpertiseField1();
	}

	/**
	 * Returns the expertise field10 of this acc cer body scope.
	 *
	 * @return the expertise field10 of this acc cer body scope
	 */
	@Override
	public String getExpertiseField10() {
		return model.getExpertiseField10();
	}

	/**
	 * Returns the expertise field11 of this acc cer body scope.
	 *
	 * @return the expertise field11 of this acc cer body scope
	 */
	@Override
	public String getExpertiseField11() {
		return model.getExpertiseField11();
	}

	/**
	 * Returns the expertise field12 of this acc cer body scope.
	 *
	 * @return the expertise field12 of this acc cer body scope
	 */
	@Override
	public String getExpertiseField12() {
		return model.getExpertiseField12();
	}

	/**
	 * Returns the expertise field13 of this acc cer body scope.
	 *
	 * @return the expertise field13 of this acc cer body scope
	 */
	@Override
	public String getExpertiseField13() {
		return model.getExpertiseField13();
	}

	/**
	 * Returns the expertise field14 of this acc cer body scope.
	 *
	 * @return the expertise field14 of this acc cer body scope
	 */
	@Override
	public String getExpertiseField14() {
		return model.getExpertiseField14();
	}

	/**
	 * Returns the expertise field2 of this acc cer body scope.
	 *
	 * @return the expertise field2 of this acc cer body scope
	 */
	@Override
	public String getExpertiseField2() {
		return model.getExpertiseField2();
	}

	/**
	 * Returns the expertise field3 of this acc cer body scope.
	 *
	 * @return the expertise field3 of this acc cer body scope
	 */
	@Override
	public String getExpertiseField3() {
		return model.getExpertiseField3();
	}

	/**
	 * Returns the expertise field4 of this acc cer body scope.
	 *
	 * @return the expertise field4 of this acc cer body scope
	 */
	@Override
	public String getExpertiseField4() {
		return model.getExpertiseField4();
	}

	/**
	 * Returns the expertise field5 of this acc cer body scope.
	 *
	 * @return the expertise field5 of this acc cer body scope
	 */
	@Override
	public String getExpertiseField5() {
		return model.getExpertiseField5();
	}

	/**
	 * Returns the expertise field6 of this acc cer body scope.
	 *
	 * @return the expertise field6 of this acc cer body scope
	 */
	@Override
	public String getExpertiseField6() {
		return model.getExpertiseField6();
	}

	/**
	 * Returns the expertise field7 of this acc cer body scope.
	 *
	 * @return the expertise field7 of this acc cer body scope
	 */
	@Override
	public String getExpertiseField7() {
		return model.getExpertiseField7();
	}

	/**
	 * Returns the expertise field8 of this acc cer body scope.
	 *
	 * @return the expertise field8 of this acc cer body scope
	 */
	@Override
	public String getExpertiseField8() {
		return model.getExpertiseField8();
	}

	/**
	 * Returns the expertise field9 of this acc cer body scope.
	 *
	 * @return the expertise field9 of this acc cer body scope
	 */
	@Override
	public String getExpertiseField9() {
		return model.getExpertiseField9();
	}

	/**
	 * Returns the group ID of this acc cer body scope.
	 *
	 * @return the group ID of this acc cer body scope
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this acc cer body scope.
	 *
	 * @return the janaac application ID of this acc cer body scope
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this acc cer body scope.
	 *
	 * @return the modified date of this acc cer body scope
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the org accredited of this acc cer body scope.
	 *
	 * @return the org accredited of this acc cer body scope
	 */
	@Override
	public String getOrgAccredited() {
		return model.getOrgAccredited();
	}

	/**
	 * Returns the other services of this acc cer body scope.
	 *
	 * @return the other services of this acc cer body scope
	 */
	@Override
	public String getOtherServices() {
		return model.getOtherServices();
	}

	/**
	 * Returns the other services describe of this acc cer body scope.
	 *
	 * @return the other services describe of this acc cer body scope
	 */
	@Override
	public String getOtherServicesDescribe() {
		return model.getOtherServicesDescribe();
	}

	/**
	 * Returns the primary key of this acc cer body scope.
	 *
	 * @return the primary key of this acc cer body scope
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the responsible body of this acc cer body scope.
	 *
	 * @return the responsible body of this acc cer body scope
	 */
	@Override
	public String getResponsibleBody() {
		return model.getResponsibleBody();
	}

	/**
	 * Returns the user ID of this acc cer body scope.
	 *
	 * @return the user ID of this acc cer body scope
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc cer body scope.
	 *
	 * @return the user name of this acc cer body scope
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc cer body scope.
	 *
	 * @return the user uuid of this acc cer body scope
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc cer body scope.
	 *
	 * @return the uuid of this acc cer body scope
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
	 * Sets the acc cer body scope ID of this acc cer body scope.
	 *
	 * @param accCerBodyScopeId the acc cer body scope ID of this acc cer body scope
	 */
	@Override
	public void setAccCerBodyScopeId(long accCerBodyScopeId) {
		model.setAccCerBodyScopeId(accCerBodyScopeId);
	}

	/**
	 * Sets the acc exp date of this acc cer body scope.
	 *
	 * @param accExpDate the acc exp date of this acc cer body scope
	 */
	@Override
	public void setAccExpDate(Date accExpDate) {
		model.setAccExpDate(accExpDate);
	}

	/**
	 * Sets the cer intrested parties of this acc cer body scope.
	 *
	 * @param cerIntrestedParties the cer intrested parties of this acc cer body scope
	 */
	@Override
	public void setCerIntrestedParties(String cerIntrestedParties) {
		model.setCerIntrestedParties(cerIntrestedParties);
	}

	/**
	 * Sets the cert body scope of this acc cer body scope.
	 *
	 * @param certBodyScope the cert body scope of this acc cer body scope
	 */
	@Override
	public void setCertBodyScope(String certBodyScope) {
		model.setCertBodyScope(certBodyScope);
	}

	/**
	 * Sets the certification cer body of this acc cer body scope.
	 *
	 * @param certificationCerBody the certification cer body of this acc cer body scope
	 */
	@Override
	public void setCertificationCerBody(String certificationCerBody) {
		model.setCertificationCerBody(certificationCerBody);
	}

	/**
	 * Sets the certification standard of this acc cer body scope.
	 *
	 * @param certificationStandard the certification standard of this acc cer body scope
	 */
	@Override
	public void setCertificationStandard(String certificationStandard) {
		model.setCertificationStandard(certificationStandard);
	}

	/**
	 * Sets the client service of this acc cer body scope.
	 *
	 * @param clientService the client service of this acc cer body scope
	 */
	@Override
	public void setClientService(String clientService) {
		model.setClientService(clientService);
	}

	/**
	 * Sets the company ID of this acc cer body scope.
	 *
	 * @param companyId the company ID of this acc cer body scope
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acc cer body scope.
	 *
	 * @param createDate the create date of this acc cer body scope
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the established relation of this acc cer body scope.
	 *
	 * @param establishedRelation the established relation of this acc cer body scope
	 */
	@Override
	public void setEstablishedRelation(String establishedRelation) {
		model.setEstablishedRelation(establishedRelation);
	}

	/**
	 * Sets the established rel desc of this acc cer body scope.
	 *
	 * @param establishedRelDesc the established rel desc of this acc cer body scope
	 */
	@Override
	public void setEstablishedRelDesc(String establishedRelDesc) {
		model.setEstablishedRelDesc(establishedRelDesc);
	}

	/**
	 * Sets the expertise field1 of this acc cer body scope.
	 *
	 * @param expertiseField1 the expertise field1 of this acc cer body scope
	 */
	@Override
	public void setExpertiseField1(String expertiseField1) {
		model.setExpertiseField1(expertiseField1);
	}

	/**
	 * Sets the expertise field10 of this acc cer body scope.
	 *
	 * @param expertiseField10 the expertise field10 of this acc cer body scope
	 */
	@Override
	public void setExpertiseField10(String expertiseField10) {
		model.setExpertiseField10(expertiseField10);
	}

	/**
	 * Sets the expertise field11 of this acc cer body scope.
	 *
	 * @param expertiseField11 the expertise field11 of this acc cer body scope
	 */
	@Override
	public void setExpertiseField11(String expertiseField11) {
		model.setExpertiseField11(expertiseField11);
	}

	/**
	 * Sets the expertise field12 of this acc cer body scope.
	 *
	 * @param expertiseField12 the expertise field12 of this acc cer body scope
	 */
	@Override
	public void setExpertiseField12(String expertiseField12) {
		model.setExpertiseField12(expertiseField12);
	}

	/**
	 * Sets the expertise field13 of this acc cer body scope.
	 *
	 * @param expertiseField13 the expertise field13 of this acc cer body scope
	 */
	@Override
	public void setExpertiseField13(String expertiseField13) {
		model.setExpertiseField13(expertiseField13);
	}

	/**
	 * Sets the expertise field14 of this acc cer body scope.
	 *
	 * @param expertiseField14 the expertise field14 of this acc cer body scope
	 */
	@Override
	public void setExpertiseField14(String expertiseField14) {
		model.setExpertiseField14(expertiseField14);
	}

	/**
	 * Sets the expertise field2 of this acc cer body scope.
	 *
	 * @param expertiseField2 the expertise field2 of this acc cer body scope
	 */
	@Override
	public void setExpertiseField2(String expertiseField2) {
		model.setExpertiseField2(expertiseField2);
	}

	/**
	 * Sets the expertise field3 of this acc cer body scope.
	 *
	 * @param expertiseField3 the expertise field3 of this acc cer body scope
	 */
	@Override
	public void setExpertiseField3(String expertiseField3) {
		model.setExpertiseField3(expertiseField3);
	}

	/**
	 * Sets the expertise field4 of this acc cer body scope.
	 *
	 * @param expertiseField4 the expertise field4 of this acc cer body scope
	 */
	@Override
	public void setExpertiseField4(String expertiseField4) {
		model.setExpertiseField4(expertiseField4);
	}

	/**
	 * Sets the expertise field5 of this acc cer body scope.
	 *
	 * @param expertiseField5 the expertise field5 of this acc cer body scope
	 */
	@Override
	public void setExpertiseField5(String expertiseField5) {
		model.setExpertiseField5(expertiseField5);
	}

	/**
	 * Sets the expertise field6 of this acc cer body scope.
	 *
	 * @param expertiseField6 the expertise field6 of this acc cer body scope
	 */
	@Override
	public void setExpertiseField6(String expertiseField6) {
		model.setExpertiseField6(expertiseField6);
	}

	/**
	 * Sets the expertise field7 of this acc cer body scope.
	 *
	 * @param expertiseField7 the expertise field7 of this acc cer body scope
	 */
	@Override
	public void setExpertiseField7(String expertiseField7) {
		model.setExpertiseField7(expertiseField7);
	}

	/**
	 * Sets the expertise field8 of this acc cer body scope.
	 *
	 * @param expertiseField8 the expertise field8 of this acc cer body scope
	 */
	@Override
	public void setExpertiseField8(String expertiseField8) {
		model.setExpertiseField8(expertiseField8);
	}

	/**
	 * Sets the expertise field9 of this acc cer body scope.
	 *
	 * @param expertiseField9 the expertise field9 of this acc cer body scope
	 */
	@Override
	public void setExpertiseField9(String expertiseField9) {
		model.setExpertiseField9(expertiseField9);
	}

	/**
	 * Sets the group ID of this acc cer body scope.
	 *
	 * @param groupId the group ID of this acc cer body scope
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this acc cer body scope.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc cer body scope
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this acc cer body scope.
	 *
	 * @param modifiedDate the modified date of this acc cer body scope
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the org accredited of this acc cer body scope.
	 *
	 * @param orgAccredited the org accredited of this acc cer body scope
	 */
	@Override
	public void setOrgAccredited(String orgAccredited) {
		model.setOrgAccredited(orgAccredited);
	}

	/**
	 * Sets the other services of this acc cer body scope.
	 *
	 * @param otherServices the other services of this acc cer body scope
	 */
	@Override
	public void setOtherServices(String otherServices) {
		model.setOtherServices(otherServices);
	}

	/**
	 * Sets the other services describe of this acc cer body scope.
	 *
	 * @param otherServicesDescribe the other services describe of this acc cer body scope
	 */
	@Override
	public void setOtherServicesDescribe(String otherServicesDescribe) {
		model.setOtherServicesDescribe(otherServicesDescribe);
	}

	/**
	 * Sets the primary key of this acc cer body scope.
	 *
	 * @param primaryKey the primary key of this acc cer body scope
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the responsible body of this acc cer body scope.
	 *
	 * @param responsibleBody the responsible body of this acc cer body scope
	 */
	@Override
	public void setResponsibleBody(String responsibleBody) {
		model.setResponsibleBody(responsibleBody);
	}

	/**
	 * Sets the user ID of this acc cer body scope.
	 *
	 * @param userId the user ID of this acc cer body scope
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc cer body scope.
	 *
	 * @param userName the user name of this acc cer body scope
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc cer body scope.
	 *
	 * @param userUuid the user uuid of this acc cer body scope
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc cer body scope.
	 *
	 * @param uuid the uuid of this acc cer body scope
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
	protected AccCerBodyScopeWrapper wrap(AccCerBodyScope accCerBodyScope) {
		return new AccCerBodyScopeWrapper(accCerBodyScope);
	}

}