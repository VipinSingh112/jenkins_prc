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
 * This class is a wrapper for {@link AccThirdPartyScope}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccThirdPartyScope
 * @generated
 */
public class AccThirdPartyScopeWrapper
	extends BaseModelWrapper<AccThirdPartyScope>
	implements AccThirdPartyScope, ModelWrapper<AccThirdPartyScope> {

	public AccThirdPartyScopeWrapper(AccThirdPartyScope accThirdPartyScope) {
		super(accThirdPartyScope);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("accThirdPartyScopeId", getAccThirdPartyScopeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("accreditationCategory", getAccreditationCategory());
		attributes.put("foodProduct1", getFoodProduct1());
		attributes.put("foodRegulation1", getFoodRegulation1());
		attributes.put("foodProduct2", getFoodProduct2());
		attributes.put("foodRegulation2", getFoodRegulation2());
		attributes.put("foodProduct3", getFoodProduct3());
		attributes.put("foodRegulation3", getFoodRegulation3());
		attributes.put("foodProduct4", getFoodProduct4());
		attributes.put("foodRegulation4", getFoodRegulation4());
		attributes.put("foodProduct5", getFoodProduct5());
		attributes.put("foodRegulation5", getFoodRegulation5());
		attributes.put("foodProduct6", getFoodProduct6());
		attributes.put("foodRegulation6", getFoodRegulation6());
		attributes.put("foodProduct7", getFoodProduct7());
		attributes.put("foodRegulation7", getFoodRegulation7());
		attributes.put("foodProduct8", getFoodProduct8());
		attributes.put("foodRegulation8", getFoodRegulation8());
		attributes.put("foodProduct9", getFoodProduct9());
		attributes.put("foodRegulation9", getFoodRegulation9());
		attributes.put("foodProduct10", getFoodProduct10());
		attributes.put("foodRegulation10", getFoodRegulation10());
		attributes.put("accCategoryOther", getAccCategoryOther());
		attributes.put("foodProduct11", getFoodProduct11());
		attributes.put("foodRegulation11", getFoodRegulation11());
		attributes.put("accCategoryOther12", getAccCategoryOther12());
		attributes.put("foodProduct12", getFoodProduct12());
		attributes.put("foodRegulation12", getFoodRegulation12());
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

		Long accThirdPartyScopeId = (Long)attributes.get(
			"accThirdPartyScopeId");

		if (accThirdPartyScopeId != null) {
			setAccThirdPartyScopeId(accThirdPartyScopeId);
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

		String accreditationCategory = (String)attributes.get(
			"accreditationCategory");

		if (accreditationCategory != null) {
			setAccreditationCategory(accreditationCategory);
		}

		String foodProduct1 = (String)attributes.get("foodProduct1");

		if (foodProduct1 != null) {
			setFoodProduct1(foodProduct1);
		}

		String foodRegulation1 = (String)attributes.get("foodRegulation1");

		if (foodRegulation1 != null) {
			setFoodRegulation1(foodRegulation1);
		}

		String foodProduct2 = (String)attributes.get("foodProduct2");

		if (foodProduct2 != null) {
			setFoodProduct2(foodProduct2);
		}

		String foodRegulation2 = (String)attributes.get("foodRegulation2");

		if (foodRegulation2 != null) {
			setFoodRegulation2(foodRegulation2);
		}

		String foodProduct3 = (String)attributes.get("foodProduct3");

		if (foodProduct3 != null) {
			setFoodProduct3(foodProduct3);
		}

		String foodRegulation3 = (String)attributes.get("foodRegulation3");

		if (foodRegulation3 != null) {
			setFoodRegulation3(foodRegulation3);
		}

		String foodProduct4 = (String)attributes.get("foodProduct4");

		if (foodProduct4 != null) {
			setFoodProduct4(foodProduct4);
		}

		String foodRegulation4 = (String)attributes.get("foodRegulation4");

		if (foodRegulation4 != null) {
			setFoodRegulation4(foodRegulation4);
		}

		String foodProduct5 = (String)attributes.get("foodProduct5");

		if (foodProduct5 != null) {
			setFoodProduct5(foodProduct5);
		}

		String foodRegulation5 = (String)attributes.get("foodRegulation5");

		if (foodRegulation5 != null) {
			setFoodRegulation5(foodRegulation5);
		}

		String foodProduct6 = (String)attributes.get("foodProduct6");

		if (foodProduct6 != null) {
			setFoodProduct6(foodProduct6);
		}

		String foodRegulation6 = (String)attributes.get("foodRegulation6");

		if (foodRegulation6 != null) {
			setFoodRegulation6(foodRegulation6);
		}

		String foodProduct7 = (String)attributes.get("foodProduct7");

		if (foodProduct7 != null) {
			setFoodProduct7(foodProduct7);
		}

		String foodRegulation7 = (String)attributes.get("foodRegulation7");

		if (foodRegulation7 != null) {
			setFoodRegulation7(foodRegulation7);
		}

		String foodProduct8 = (String)attributes.get("foodProduct8");

		if (foodProduct8 != null) {
			setFoodProduct8(foodProduct8);
		}

		String foodRegulation8 = (String)attributes.get("foodRegulation8");

		if (foodRegulation8 != null) {
			setFoodRegulation8(foodRegulation8);
		}

		String foodProduct9 = (String)attributes.get("foodProduct9");

		if (foodProduct9 != null) {
			setFoodProduct9(foodProduct9);
		}

		String foodRegulation9 = (String)attributes.get("foodRegulation9");

		if (foodRegulation9 != null) {
			setFoodRegulation9(foodRegulation9);
		}

		String foodProduct10 = (String)attributes.get("foodProduct10");

		if (foodProduct10 != null) {
			setFoodProduct10(foodProduct10);
		}

		String foodRegulation10 = (String)attributes.get("foodRegulation10");

		if (foodRegulation10 != null) {
			setFoodRegulation10(foodRegulation10);
		}

		String accCategoryOther = (String)attributes.get("accCategoryOther");

		if (accCategoryOther != null) {
			setAccCategoryOther(accCategoryOther);
		}

		String foodProduct11 = (String)attributes.get("foodProduct11");

		if (foodProduct11 != null) {
			setFoodProduct11(foodProduct11);
		}

		String foodRegulation11 = (String)attributes.get("foodRegulation11");

		if (foodRegulation11 != null) {
			setFoodRegulation11(foodRegulation11);
		}

		String accCategoryOther12 = (String)attributes.get(
			"accCategoryOther12");

		if (accCategoryOther12 != null) {
			setAccCategoryOther12(accCategoryOther12);
		}

		String foodProduct12 = (String)attributes.get("foodProduct12");

		if (foodProduct12 != null) {
			setFoodProduct12(foodProduct12);
		}

		String foodRegulation12 = (String)attributes.get("foodRegulation12");

		if (foodRegulation12 != null) {
			setFoodRegulation12(foodRegulation12);
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
	public AccThirdPartyScope cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc category other of this acc third party scope.
	 *
	 * @return the acc category other of this acc third party scope
	 */
	@Override
	public String getAccCategoryOther() {
		return model.getAccCategoryOther();
	}

	/**
	 * Returns the acc category other12 of this acc third party scope.
	 *
	 * @return the acc category other12 of this acc third party scope
	 */
	@Override
	public String getAccCategoryOther12() {
		return model.getAccCategoryOther12();
	}

	/**
	 * Returns the acc exp date of this acc third party scope.
	 *
	 * @return the acc exp date of this acc third party scope
	 */
	@Override
	public Date getAccExpDate() {
		return model.getAccExpDate();
	}

	/**
	 * Returns the accreditation category of this acc third party scope.
	 *
	 * @return the accreditation category of this acc third party scope
	 */
	@Override
	public String getAccreditationCategory() {
		return model.getAccreditationCategory();
	}

	/**
	 * Returns the acc third party scope ID of this acc third party scope.
	 *
	 * @return the acc third party scope ID of this acc third party scope
	 */
	@Override
	public long getAccThirdPartyScopeId() {
		return model.getAccThirdPartyScopeId();
	}

	/**
	 * Returns the cer intrested parties of this acc third party scope.
	 *
	 * @return the cer intrested parties of this acc third party scope
	 */
	@Override
	public String getCerIntrestedParties() {
		return model.getCerIntrestedParties();
	}

	/**
	 * Returns the cert body scope of this acc third party scope.
	 *
	 * @return the cert body scope of this acc third party scope
	 */
	@Override
	public String getCertBodyScope() {
		return model.getCertBodyScope();
	}

	/**
	 * Returns the certification cer body of this acc third party scope.
	 *
	 * @return the certification cer body of this acc third party scope
	 */
	@Override
	public String getCertificationCerBody() {
		return model.getCertificationCerBody();
	}

	/**
	 * Returns the client service of this acc third party scope.
	 *
	 * @return the client service of this acc third party scope
	 */
	@Override
	public String getClientService() {
		return model.getClientService();
	}

	/**
	 * Returns the company ID of this acc third party scope.
	 *
	 * @return the company ID of this acc third party scope
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acc third party scope.
	 *
	 * @return the create date of this acc third party scope
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the established relation of this acc third party scope.
	 *
	 * @return the established relation of this acc third party scope
	 */
	@Override
	public String getEstablishedRelation() {
		return model.getEstablishedRelation();
	}

	/**
	 * Returns the established rel desc of this acc third party scope.
	 *
	 * @return the established rel desc of this acc third party scope
	 */
	@Override
	public String getEstablishedRelDesc() {
		return model.getEstablishedRelDesc();
	}

	/**
	 * Returns the food product1 of this acc third party scope.
	 *
	 * @return the food product1 of this acc third party scope
	 */
	@Override
	public String getFoodProduct1() {
		return model.getFoodProduct1();
	}

	/**
	 * Returns the food product10 of this acc third party scope.
	 *
	 * @return the food product10 of this acc third party scope
	 */
	@Override
	public String getFoodProduct10() {
		return model.getFoodProduct10();
	}

	/**
	 * Returns the food product11 of this acc third party scope.
	 *
	 * @return the food product11 of this acc third party scope
	 */
	@Override
	public String getFoodProduct11() {
		return model.getFoodProduct11();
	}

	/**
	 * Returns the food product12 of this acc third party scope.
	 *
	 * @return the food product12 of this acc third party scope
	 */
	@Override
	public String getFoodProduct12() {
		return model.getFoodProduct12();
	}

	/**
	 * Returns the food product2 of this acc third party scope.
	 *
	 * @return the food product2 of this acc third party scope
	 */
	@Override
	public String getFoodProduct2() {
		return model.getFoodProduct2();
	}

	/**
	 * Returns the food product3 of this acc third party scope.
	 *
	 * @return the food product3 of this acc third party scope
	 */
	@Override
	public String getFoodProduct3() {
		return model.getFoodProduct3();
	}

	/**
	 * Returns the food product4 of this acc third party scope.
	 *
	 * @return the food product4 of this acc third party scope
	 */
	@Override
	public String getFoodProduct4() {
		return model.getFoodProduct4();
	}

	/**
	 * Returns the food product5 of this acc third party scope.
	 *
	 * @return the food product5 of this acc third party scope
	 */
	@Override
	public String getFoodProduct5() {
		return model.getFoodProduct5();
	}

	/**
	 * Returns the food product6 of this acc third party scope.
	 *
	 * @return the food product6 of this acc third party scope
	 */
	@Override
	public String getFoodProduct6() {
		return model.getFoodProduct6();
	}

	/**
	 * Returns the food product7 of this acc third party scope.
	 *
	 * @return the food product7 of this acc third party scope
	 */
	@Override
	public String getFoodProduct7() {
		return model.getFoodProduct7();
	}

	/**
	 * Returns the food product8 of this acc third party scope.
	 *
	 * @return the food product8 of this acc third party scope
	 */
	@Override
	public String getFoodProduct8() {
		return model.getFoodProduct8();
	}

	/**
	 * Returns the food product9 of this acc third party scope.
	 *
	 * @return the food product9 of this acc third party scope
	 */
	@Override
	public String getFoodProduct9() {
		return model.getFoodProduct9();
	}

	/**
	 * Returns the food regulation1 of this acc third party scope.
	 *
	 * @return the food regulation1 of this acc third party scope
	 */
	@Override
	public String getFoodRegulation1() {
		return model.getFoodRegulation1();
	}

	/**
	 * Returns the food regulation10 of this acc third party scope.
	 *
	 * @return the food regulation10 of this acc third party scope
	 */
	@Override
	public String getFoodRegulation10() {
		return model.getFoodRegulation10();
	}

	/**
	 * Returns the food regulation11 of this acc third party scope.
	 *
	 * @return the food regulation11 of this acc third party scope
	 */
	@Override
	public String getFoodRegulation11() {
		return model.getFoodRegulation11();
	}

	/**
	 * Returns the food regulation12 of this acc third party scope.
	 *
	 * @return the food regulation12 of this acc third party scope
	 */
	@Override
	public String getFoodRegulation12() {
		return model.getFoodRegulation12();
	}

	/**
	 * Returns the food regulation2 of this acc third party scope.
	 *
	 * @return the food regulation2 of this acc third party scope
	 */
	@Override
	public String getFoodRegulation2() {
		return model.getFoodRegulation2();
	}

	/**
	 * Returns the food regulation3 of this acc third party scope.
	 *
	 * @return the food regulation3 of this acc third party scope
	 */
	@Override
	public String getFoodRegulation3() {
		return model.getFoodRegulation3();
	}

	/**
	 * Returns the food regulation4 of this acc third party scope.
	 *
	 * @return the food regulation4 of this acc third party scope
	 */
	@Override
	public String getFoodRegulation4() {
		return model.getFoodRegulation4();
	}

	/**
	 * Returns the food regulation5 of this acc third party scope.
	 *
	 * @return the food regulation5 of this acc third party scope
	 */
	@Override
	public String getFoodRegulation5() {
		return model.getFoodRegulation5();
	}

	/**
	 * Returns the food regulation6 of this acc third party scope.
	 *
	 * @return the food regulation6 of this acc third party scope
	 */
	@Override
	public String getFoodRegulation6() {
		return model.getFoodRegulation6();
	}

	/**
	 * Returns the food regulation7 of this acc third party scope.
	 *
	 * @return the food regulation7 of this acc third party scope
	 */
	@Override
	public String getFoodRegulation7() {
		return model.getFoodRegulation7();
	}

	/**
	 * Returns the food regulation8 of this acc third party scope.
	 *
	 * @return the food regulation8 of this acc third party scope
	 */
	@Override
	public String getFoodRegulation8() {
		return model.getFoodRegulation8();
	}

	/**
	 * Returns the food regulation9 of this acc third party scope.
	 *
	 * @return the food regulation9 of this acc third party scope
	 */
	@Override
	public String getFoodRegulation9() {
		return model.getFoodRegulation9();
	}

	/**
	 * Returns the group ID of this acc third party scope.
	 *
	 * @return the group ID of this acc third party scope
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this acc third party scope.
	 *
	 * @return the janaac application ID of this acc third party scope
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this acc third party scope.
	 *
	 * @return the modified date of this acc third party scope
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the org accredited of this acc third party scope.
	 *
	 * @return the org accredited of this acc third party scope
	 */
	@Override
	public String getOrgAccredited() {
		return model.getOrgAccredited();
	}

	/**
	 * Returns the other services of this acc third party scope.
	 *
	 * @return the other services of this acc third party scope
	 */
	@Override
	public String getOtherServices() {
		return model.getOtherServices();
	}

	/**
	 * Returns the other services describe of this acc third party scope.
	 *
	 * @return the other services describe of this acc third party scope
	 */
	@Override
	public String getOtherServicesDescribe() {
		return model.getOtherServicesDescribe();
	}

	/**
	 * Returns the primary key of this acc third party scope.
	 *
	 * @return the primary key of this acc third party scope
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the responsible body of this acc third party scope.
	 *
	 * @return the responsible body of this acc third party scope
	 */
	@Override
	public String getResponsibleBody() {
		return model.getResponsibleBody();
	}

	/**
	 * Returns the user ID of this acc third party scope.
	 *
	 * @return the user ID of this acc third party scope
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc third party scope.
	 *
	 * @return the user name of this acc third party scope
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc third party scope.
	 *
	 * @return the user uuid of this acc third party scope
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc third party scope.
	 *
	 * @return the uuid of this acc third party scope
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
	 * Sets the acc category other of this acc third party scope.
	 *
	 * @param accCategoryOther the acc category other of this acc third party scope
	 */
	@Override
	public void setAccCategoryOther(String accCategoryOther) {
		model.setAccCategoryOther(accCategoryOther);
	}

	/**
	 * Sets the acc category other12 of this acc third party scope.
	 *
	 * @param accCategoryOther12 the acc category other12 of this acc third party scope
	 */
	@Override
	public void setAccCategoryOther12(String accCategoryOther12) {
		model.setAccCategoryOther12(accCategoryOther12);
	}

	/**
	 * Sets the acc exp date of this acc third party scope.
	 *
	 * @param accExpDate the acc exp date of this acc third party scope
	 */
	@Override
	public void setAccExpDate(Date accExpDate) {
		model.setAccExpDate(accExpDate);
	}

	/**
	 * Sets the accreditation category of this acc third party scope.
	 *
	 * @param accreditationCategory the accreditation category of this acc third party scope
	 */
	@Override
	public void setAccreditationCategory(String accreditationCategory) {
		model.setAccreditationCategory(accreditationCategory);
	}

	/**
	 * Sets the acc third party scope ID of this acc third party scope.
	 *
	 * @param accThirdPartyScopeId the acc third party scope ID of this acc third party scope
	 */
	@Override
	public void setAccThirdPartyScopeId(long accThirdPartyScopeId) {
		model.setAccThirdPartyScopeId(accThirdPartyScopeId);
	}

	/**
	 * Sets the cer intrested parties of this acc third party scope.
	 *
	 * @param cerIntrestedParties the cer intrested parties of this acc third party scope
	 */
	@Override
	public void setCerIntrestedParties(String cerIntrestedParties) {
		model.setCerIntrestedParties(cerIntrestedParties);
	}

	/**
	 * Sets the cert body scope of this acc third party scope.
	 *
	 * @param certBodyScope the cert body scope of this acc third party scope
	 */
	@Override
	public void setCertBodyScope(String certBodyScope) {
		model.setCertBodyScope(certBodyScope);
	}

	/**
	 * Sets the certification cer body of this acc third party scope.
	 *
	 * @param certificationCerBody the certification cer body of this acc third party scope
	 */
	@Override
	public void setCertificationCerBody(String certificationCerBody) {
		model.setCertificationCerBody(certificationCerBody);
	}

	/**
	 * Sets the client service of this acc third party scope.
	 *
	 * @param clientService the client service of this acc third party scope
	 */
	@Override
	public void setClientService(String clientService) {
		model.setClientService(clientService);
	}

	/**
	 * Sets the company ID of this acc third party scope.
	 *
	 * @param companyId the company ID of this acc third party scope
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acc third party scope.
	 *
	 * @param createDate the create date of this acc third party scope
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the established relation of this acc third party scope.
	 *
	 * @param establishedRelation the established relation of this acc third party scope
	 */
	@Override
	public void setEstablishedRelation(String establishedRelation) {
		model.setEstablishedRelation(establishedRelation);
	}

	/**
	 * Sets the established rel desc of this acc third party scope.
	 *
	 * @param establishedRelDesc the established rel desc of this acc third party scope
	 */
	@Override
	public void setEstablishedRelDesc(String establishedRelDesc) {
		model.setEstablishedRelDesc(establishedRelDesc);
	}

	/**
	 * Sets the food product1 of this acc third party scope.
	 *
	 * @param foodProduct1 the food product1 of this acc third party scope
	 */
	@Override
	public void setFoodProduct1(String foodProduct1) {
		model.setFoodProduct1(foodProduct1);
	}

	/**
	 * Sets the food product10 of this acc third party scope.
	 *
	 * @param foodProduct10 the food product10 of this acc third party scope
	 */
	@Override
	public void setFoodProduct10(String foodProduct10) {
		model.setFoodProduct10(foodProduct10);
	}

	/**
	 * Sets the food product11 of this acc third party scope.
	 *
	 * @param foodProduct11 the food product11 of this acc third party scope
	 */
	@Override
	public void setFoodProduct11(String foodProduct11) {
		model.setFoodProduct11(foodProduct11);
	}

	/**
	 * Sets the food product12 of this acc third party scope.
	 *
	 * @param foodProduct12 the food product12 of this acc third party scope
	 */
	@Override
	public void setFoodProduct12(String foodProduct12) {
		model.setFoodProduct12(foodProduct12);
	}

	/**
	 * Sets the food product2 of this acc third party scope.
	 *
	 * @param foodProduct2 the food product2 of this acc third party scope
	 */
	@Override
	public void setFoodProduct2(String foodProduct2) {
		model.setFoodProduct2(foodProduct2);
	}

	/**
	 * Sets the food product3 of this acc third party scope.
	 *
	 * @param foodProduct3 the food product3 of this acc third party scope
	 */
	@Override
	public void setFoodProduct3(String foodProduct3) {
		model.setFoodProduct3(foodProduct3);
	}

	/**
	 * Sets the food product4 of this acc third party scope.
	 *
	 * @param foodProduct4 the food product4 of this acc third party scope
	 */
	@Override
	public void setFoodProduct4(String foodProduct4) {
		model.setFoodProduct4(foodProduct4);
	}

	/**
	 * Sets the food product5 of this acc third party scope.
	 *
	 * @param foodProduct5 the food product5 of this acc third party scope
	 */
	@Override
	public void setFoodProduct5(String foodProduct5) {
		model.setFoodProduct5(foodProduct5);
	}

	/**
	 * Sets the food product6 of this acc third party scope.
	 *
	 * @param foodProduct6 the food product6 of this acc third party scope
	 */
	@Override
	public void setFoodProduct6(String foodProduct6) {
		model.setFoodProduct6(foodProduct6);
	}

	/**
	 * Sets the food product7 of this acc third party scope.
	 *
	 * @param foodProduct7 the food product7 of this acc third party scope
	 */
	@Override
	public void setFoodProduct7(String foodProduct7) {
		model.setFoodProduct7(foodProduct7);
	}

	/**
	 * Sets the food product8 of this acc third party scope.
	 *
	 * @param foodProduct8 the food product8 of this acc third party scope
	 */
	@Override
	public void setFoodProduct8(String foodProduct8) {
		model.setFoodProduct8(foodProduct8);
	}

	/**
	 * Sets the food product9 of this acc third party scope.
	 *
	 * @param foodProduct9 the food product9 of this acc third party scope
	 */
	@Override
	public void setFoodProduct9(String foodProduct9) {
		model.setFoodProduct9(foodProduct9);
	}

	/**
	 * Sets the food regulation1 of this acc third party scope.
	 *
	 * @param foodRegulation1 the food regulation1 of this acc third party scope
	 */
	@Override
	public void setFoodRegulation1(String foodRegulation1) {
		model.setFoodRegulation1(foodRegulation1);
	}

	/**
	 * Sets the food regulation10 of this acc third party scope.
	 *
	 * @param foodRegulation10 the food regulation10 of this acc third party scope
	 */
	@Override
	public void setFoodRegulation10(String foodRegulation10) {
		model.setFoodRegulation10(foodRegulation10);
	}

	/**
	 * Sets the food regulation11 of this acc third party scope.
	 *
	 * @param foodRegulation11 the food regulation11 of this acc third party scope
	 */
	@Override
	public void setFoodRegulation11(String foodRegulation11) {
		model.setFoodRegulation11(foodRegulation11);
	}

	/**
	 * Sets the food regulation12 of this acc third party scope.
	 *
	 * @param foodRegulation12 the food regulation12 of this acc third party scope
	 */
	@Override
	public void setFoodRegulation12(String foodRegulation12) {
		model.setFoodRegulation12(foodRegulation12);
	}

	/**
	 * Sets the food regulation2 of this acc third party scope.
	 *
	 * @param foodRegulation2 the food regulation2 of this acc third party scope
	 */
	@Override
	public void setFoodRegulation2(String foodRegulation2) {
		model.setFoodRegulation2(foodRegulation2);
	}

	/**
	 * Sets the food regulation3 of this acc third party scope.
	 *
	 * @param foodRegulation3 the food regulation3 of this acc third party scope
	 */
	@Override
	public void setFoodRegulation3(String foodRegulation3) {
		model.setFoodRegulation3(foodRegulation3);
	}

	/**
	 * Sets the food regulation4 of this acc third party scope.
	 *
	 * @param foodRegulation4 the food regulation4 of this acc third party scope
	 */
	@Override
	public void setFoodRegulation4(String foodRegulation4) {
		model.setFoodRegulation4(foodRegulation4);
	}

	/**
	 * Sets the food regulation5 of this acc third party scope.
	 *
	 * @param foodRegulation5 the food regulation5 of this acc third party scope
	 */
	@Override
	public void setFoodRegulation5(String foodRegulation5) {
		model.setFoodRegulation5(foodRegulation5);
	}

	/**
	 * Sets the food regulation6 of this acc third party scope.
	 *
	 * @param foodRegulation6 the food regulation6 of this acc third party scope
	 */
	@Override
	public void setFoodRegulation6(String foodRegulation6) {
		model.setFoodRegulation6(foodRegulation6);
	}

	/**
	 * Sets the food regulation7 of this acc third party scope.
	 *
	 * @param foodRegulation7 the food regulation7 of this acc third party scope
	 */
	@Override
	public void setFoodRegulation7(String foodRegulation7) {
		model.setFoodRegulation7(foodRegulation7);
	}

	/**
	 * Sets the food regulation8 of this acc third party scope.
	 *
	 * @param foodRegulation8 the food regulation8 of this acc third party scope
	 */
	@Override
	public void setFoodRegulation8(String foodRegulation8) {
		model.setFoodRegulation8(foodRegulation8);
	}

	/**
	 * Sets the food regulation9 of this acc third party scope.
	 *
	 * @param foodRegulation9 the food regulation9 of this acc third party scope
	 */
	@Override
	public void setFoodRegulation9(String foodRegulation9) {
		model.setFoodRegulation9(foodRegulation9);
	}

	/**
	 * Sets the group ID of this acc third party scope.
	 *
	 * @param groupId the group ID of this acc third party scope
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this acc third party scope.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc third party scope
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this acc third party scope.
	 *
	 * @param modifiedDate the modified date of this acc third party scope
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the org accredited of this acc third party scope.
	 *
	 * @param orgAccredited the org accredited of this acc third party scope
	 */
	@Override
	public void setOrgAccredited(String orgAccredited) {
		model.setOrgAccredited(orgAccredited);
	}

	/**
	 * Sets the other services of this acc third party scope.
	 *
	 * @param otherServices the other services of this acc third party scope
	 */
	@Override
	public void setOtherServices(String otherServices) {
		model.setOtherServices(otherServices);
	}

	/**
	 * Sets the other services describe of this acc third party scope.
	 *
	 * @param otherServicesDescribe the other services describe of this acc third party scope
	 */
	@Override
	public void setOtherServicesDescribe(String otherServicesDescribe) {
		model.setOtherServicesDescribe(otherServicesDescribe);
	}

	/**
	 * Sets the primary key of this acc third party scope.
	 *
	 * @param primaryKey the primary key of this acc third party scope
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the responsible body of this acc third party scope.
	 *
	 * @param responsibleBody the responsible body of this acc third party scope
	 */
	@Override
	public void setResponsibleBody(String responsibleBody) {
		model.setResponsibleBody(responsibleBody);
	}

	/**
	 * Sets the user ID of this acc third party scope.
	 *
	 * @param userId the user ID of this acc third party scope
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc third party scope.
	 *
	 * @param userName the user name of this acc third party scope
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc third party scope.
	 *
	 * @param userUuid the user uuid of this acc third party scope
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc third party scope.
	 *
	 * @param uuid the uuid of this acc third party scope
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
	protected AccThirdPartyScopeWrapper wrap(
		AccThirdPartyScope accThirdPartyScope) {

		return new AccThirdPartyScopeWrapper(accThirdPartyScope);
	}

}