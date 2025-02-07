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
 * This class is a wrapper for {@link AccCerBodyProdScope}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyProdScope
 * @generated
 */
public class AccCerBodyProdScopeWrapper
	extends BaseModelWrapper<AccCerBodyProdScope>
	implements AccCerBodyProdScope, ModelWrapper<AccCerBodyProdScope> {

	public AccCerBodyProdScopeWrapper(AccCerBodyProdScope accCerBodyProdScope) {
		super(accCerBodyProdScope);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("accCerBodyProdScopeId", getAccCerBodyProdScopeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("cerIntrestedParties", getCerIntrestedParties());
		attributes.put("otherServices", getOtherServices());
		attributes.put("otherServicesDescribe", getOtherServicesDescribe());
		attributes.put("establishedRelation", getEstablishedRelation());
		attributes.put("establishedRelDesc", getEstablishedRelDesc());
		attributes.put("clientService", getClientService());
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

		Long accCerBodyProdScopeId = (Long)attributes.get(
			"accCerBodyProdScopeId");

		if (accCerBodyProdScopeId != null) {
			setAccCerBodyProdScopeId(accCerBodyProdScopeId);
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
	public AccCerBodyProdScope cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc cer body prod scope ID of this acc cer body prod scope.
	 *
	 * @return the acc cer body prod scope ID of this acc cer body prod scope
	 */
	@Override
	public long getAccCerBodyProdScopeId() {
		return model.getAccCerBodyProdScopeId();
	}

	/**
	 * Returns the acc exp date of this acc cer body prod scope.
	 *
	 * @return the acc exp date of this acc cer body prod scope
	 */
	@Override
	public Date getAccExpDate() {
		return model.getAccExpDate();
	}

	/**
	 * Returns the cer intrested parties of this acc cer body prod scope.
	 *
	 * @return the cer intrested parties of this acc cer body prod scope
	 */
	@Override
	public String getCerIntrestedParties() {
		return model.getCerIntrestedParties();
	}

	/**
	 * Returns the cert body scope of this acc cer body prod scope.
	 *
	 * @return the cert body scope of this acc cer body prod scope
	 */
	@Override
	public String getCertBodyScope() {
		return model.getCertBodyScope();
	}

	/**
	 * Returns the client service of this acc cer body prod scope.
	 *
	 * @return the client service of this acc cer body prod scope
	 */
	@Override
	public String getClientService() {
		return model.getClientService();
	}

	/**
	 * Returns the company ID of this acc cer body prod scope.
	 *
	 * @return the company ID of this acc cer body prod scope
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acc cer body prod scope.
	 *
	 * @return the create date of this acc cer body prod scope
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the established relation of this acc cer body prod scope.
	 *
	 * @return the established relation of this acc cer body prod scope
	 */
	@Override
	public String getEstablishedRelation() {
		return model.getEstablishedRelation();
	}

	/**
	 * Returns the established rel desc of this acc cer body prod scope.
	 *
	 * @return the established rel desc of this acc cer body prod scope
	 */
	@Override
	public String getEstablishedRelDesc() {
		return model.getEstablishedRelDesc();
	}

	/**
	 * Returns the group ID of this acc cer body prod scope.
	 *
	 * @return the group ID of this acc cer body prod scope
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this acc cer body prod scope.
	 *
	 * @return the janaac application ID of this acc cer body prod scope
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this acc cer body prod scope.
	 *
	 * @return the modified date of this acc cer body prod scope
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the org accredited of this acc cer body prod scope.
	 *
	 * @return the org accredited of this acc cer body prod scope
	 */
	@Override
	public String getOrgAccredited() {
		return model.getOrgAccredited();
	}

	/**
	 * Returns the other services of this acc cer body prod scope.
	 *
	 * @return the other services of this acc cer body prod scope
	 */
	@Override
	public String getOtherServices() {
		return model.getOtherServices();
	}

	/**
	 * Returns the other services describe of this acc cer body prod scope.
	 *
	 * @return the other services describe of this acc cer body prod scope
	 */
	@Override
	public String getOtherServicesDescribe() {
		return model.getOtherServicesDescribe();
	}

	/**
	 * Returns the primary key of this acc cer body prod scope.
	 *
	 * @return the primary key of this acc cer body prod scope
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the responsible body of this acc cer body prod scope.
	 *
	 * @return the responsible body of this acc cer body prod scope
	 */
	@Override
	public String getResponsibleBody() {
		return model.getResponsibleBody();
	}

	/**
	 * Returns the user ID of this acc cer body prod scope.
	 *
	 * @return the user ID of this acc cer body prod scope
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc cer body prod scope.
	 *
	 * @return the user name of this acc cer body prod scope
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc cer body prod scope.
	 *
	 * @return the user uuid of this acc cer body prod scope
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc cer body prod scope.
	 *
	 * @return the uuid of this acc cer body prod scope
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
	 * Sets the acc cer body prod scope ID of this acc cer body prod scope.
	 *
	 * @param accCerBodyProdScopeId the acc cer body prod scope ID of this acc cer body prod scope
	 */
	@Override
	public void setAccCerBodyProdScopeId(long accCerBodyProdScopeId) {
		model.setAccCerBodyProdScopeId(accCerBodyProdScopeId);
	}

	/**
	 * Sets the acc exp date of this acc cer body prod scope.
	 *
	 * @param accExpDate the acc exp date of this acc cer body prod scope
	 */
	@Override
	public void setAccExpDate(Date accExpDate) {
		model.setAccExpDate(accExpDate);
	}

	/**
	 * Sets the cer intrested parties of this acc cer body prod scope.
	 *
	 * @param cerIntrestedParties the cer intrested parties of this acc cer body prod scope
	 */
	@Override
	public void setCerIntrestedParties(String cerIntrestedParties) {
		model.setCerIntrestedParties(cerIntrestedParties);
	}

	/**
	 * Sets the cert body scope of this acc cer body prod scope.
	 *
	 * @param certBodyScope the cert body scope of this acc cer body prod scope
	 */
	@Override
	public void setCertBodyScope(String certBodyScope) {
		model.setCertBodyScope(certBodyScope);
	}

	/**
	 * Sets the client service of this acc cer body prod scope.
	 *
	 * @param clientService the client service of this acc cer body prod scope
	 */
	@Override
	public void setClientService(String clientService) {
		model.setClientService(clientService);
	}

	/**
	 * Sets the company ID of this acc cer body prod scope.
	 *
	 * @param companyId the company ID of this acc cer body prod scope
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acc cer body prod scope.
	 *
	 * @param createDate the create date of this acc cer body prod scope
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the established relation of this acc cer body prod scope.
	 *
	 * @param establishedRelation the established relation of this acc cer body prod scope
	 */
	@Override
	public void setEstablishedRelation(String establishedRelation) {
		model.setEstablishedRelation(establishedRelation);
	}

	/**
	 * Sets the established rel desc of this acc cer body prod scope.
	 *
	 * @param establishedRelDesc the established rel desc of this acc cer body prod scope
	 */
	@Override
	public void setEstablishedRelDesc(String establishedRelDesc) {
		model.setEstablishedRelDesc(establishedRelDesc);
	}

	/**
	 * Sets the group ID of this acc cer body prod scope.
	 *
	 * @param groupId the group ID of this acc cer body prod scope
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this acc cer body prod scope.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc cer body prod scope
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this acc cer body prod scope.
	 *
	 * @param modifiedDate the modified date of this acc cer body prod scope
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the org accredited of this acc cer body prod scope.
	 *
	 * @param orgAccredited the org accredited of this acc cer body prod scope
	 */
	@Override
	public void setOrgAccredited(String orgAccredited) {
		model.setOrgAccredited(orgAccredited);
	}

	/**
	 * Sets the other services of this acc cer body prod scope.
	 *
	 * @param otherServices the other services of this acc cer body prod scope
	 */
	@Override
	public void setOtherServices(String otherServices) {
		model.setOtherServices(otherServices);
	}

	/**
	 * Sets the other services describe of this acc cer body prod scope.
	 *
	 * @param otherServicesDescribe the other services describe of this acc cer body prod scope
	 */
	@Override
	public void setOtherServicesDescribe(String otherServicesDescribe) {
		model.setOtherServicesDescribe(otherServicesDescribe);
	}

	/**
	 * Sets the primary key of this acc cer body prod scope.
	 *
	 * @param primaryKey the primary key of this acc cer body prod scope
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the responsible body of this acc cer body prod scope.
	 *
	 * @param responsibleBody the responsible body of this acc cer body prod scope
	 */
	@Override
	public void setResponsibleBody(String responsibleBody) {
		model.setResponsibleBody(responsibleBody);
	}

	/**
	 * Sets the user ID of this acc cer body prod scope.
	 *
	 * @param userId the user ID of this acc cer body prod scope
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc cer body prod scope.
	 *
	 * @param userName the user name of this acc cer body prod scope
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc cer body prod scope.
	 *
	 * @param userUuid the user uuid of this acc cer body prod scope
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc cer body prod scope.
	 *
	 * @param uuid the uuid of this acc cer body prod scope
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
	protected AccCerBodyProdScopeWrapper wrap(
		AccCerBodyProdScope accCerBodyProdScope) {

		return new AccCerBodyProdScopeWrapper(accCerBodyProdScope);
	}

}