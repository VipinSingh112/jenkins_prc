/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RadiationSafetyLowRisk}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadiationSafetyLowRisk
 * @generated
 */
public class RadiationSafetyLowRiskWrapper
	extends BaseModelWrapper<RadiationSafetyLowRisk>
	implements ModelWrapper<RadiationSafetyLowRisk>, RadiationSafetyLowRisk {

	public RadiationSafetyLowRiskWrapper(
		RadiationSafetyLowRisk radiationSafetyLowRisk) {

		super(radiationSafetyLowRisk);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"radiationSafetyLowRiskId", getRadiationSafetyLowRiskId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("appendixRsoName", getAppendixRsoName());
		attributes.put("appendixRsoTitle", getAppendixRsoTitle());
		attributes.put("appendixRsoTeleNo", getAppendixRsoTeleNo());
		attributes.put("appendixRsoExt", getAppendixRsoExt());
		attributes.put("appendixRsoFax", getAppendixRsoFax());
		attributes.put("appendixRsoEmail", getAppendixRsoEmail());
		attributes.put("appendixRsoDetails", getAppendixRsoDetails());
		attributes.put("qualifiedAppendixName", getQualifiedAppendixName());
		attributes.put("qualifiedAppendixTitle", getQualifiedAppendixTitle());
		attributes.put("qualifiedAppendixTele", getQualifiedAppendixTele());
		attributes.put("qualifiedAppendixExt", getQualifiedAppendixExt());
		attributes.put("qualifiedAppendixFax", getQualifiedAppendixFax());
		attributes.put("qualifiedAppendixEmail", getQualifiedAppendixEmail());
		attributes.put(
			"qualifiedAppendixRegstNo", getQualifiedAppendixRegstNo());
		attributes.put("qualifiedAppendixDate", getQualifiedAppendixDate());
		attributes.put(
			"qualifiedAppendixDetails", getQualifiedAppendixDetails());
		attributes.put("monitoringExposure", getMonitoringExposure());
		attributes.put("recordSystem", getRecordSystem());
		attributes.put("securityAccess", getSecurityAccess());
		attributes.put("trainingInformation", getTrainingInformation());
		attributes.put("leakTesting", getLeakTesting());
		attributes.put("emergencyProcedures", getEmergencyProcedures());
		attributes.put("managementSourcesDis", getManagementSourcesDis());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long radiationSafetyLowRiskId = (Long)attributes.get(
			"radiationSafetyLowRiskId");

		if (radiationSafetyLowRiskId != null) {
			setRadiationSafetyLowRiskId(radiationSafetyLowRiskId);
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

		String appendixRsoName = (String)attributes.get("appendixRsoName");

		if (appendixRsoName != null) {
			setAppendixRsoName(appendixRsoName);
		}

		String appendixRsoTitle = (String)attributes.get("appendixRsoTitle");

		if (appendixRsoTitle != null) {
			setAppendixRsoTitle(appendixRsoTitle);
		}

		String appendixRsoTeleNo = (String)attributes.get("appendixRsoTeleNo");

		if (appendixRsoTeleNo != null) {
			setAppendixRsoTeleNo(appendixRsoTeleNo);
		}

		String appendixRsoExt = (String)attributes.get("appendixRsoExt");

		if (appendixRsoExt != null) {
			setAppendixRsoExt(appendixRsoExt);
		}

		String appendixRsoFax = (String)attributes.get("appendixRsoFax");

		if (appendixRsoFax != null) {
			setAppendixRsoFax(appendixRsoFax);
		}

		String appendixRsoEmail = (String)attributes.get("appendixRsoEmail");

		if (appendixRsoEmail != null) {
			setAppendixRsoEmail(appendixRsoEmail);
		}

		String appendixRsoDetails = (String)attributes.get(
			"appendixRsoDetails");

		if (appendixRsoDetails != null) {
			setAppendixRsoDetails(appendixRsoDetails);
		}

		String qualifiedAppendixName = (String)attributes.get(
			"qualifiedAppendixName");

		if (qualifiedAppendixName != null) {
			setQualifiedAppendixName(qualifiedAppendixName);
		}

		String qualifiedAppendixTitle = (String)attributes.get(
			"qualifiedAppendixTitle");

		if (qualifiedAppendixTitle != null) {
			setQualifiedAppendixTitle(qualifiedAppendixTitle);
		}

		String qualifiedAppendixTele = (String)attributes.get(
			"qualifiedAppendixTele");

		if (qualifiedAppendixTele != null) {
			setQualifiedAppendixTele(qualifiedAppendixTele);
		}

		String qualifiedAppendixExt = (String)attributes.get(
			"qualifiedAppendixExt");

		if (qualifiedAppendixExt != null) {
			setQualifiedAppendixExt(qualifiedAppendixExt);
		}

		String qualifiedAppendixFax = (String)attributes.get(
			"qualifiedAppendixFax");

		if (qualifiedAppendixFax != null) {
			setQualifiedAppendixFax(qualifiedAppendixFax);
		}

		String qualifiedAppendixEmail = (String)attributes.get(
			"qualifiedAppendixEmail");

		if (qualifiedAppendixEmail != null) {
			setQualifiedAppendixEmail(qualifiedAppendixEmail);
		}

		String qualifiedAppendixRegstNo = (String)attributes.get(
			"qualifiedAppendixRegstNo");

		if (qualifiedAppendixRegstNo != null) {
			setQualifiedAppendixRegstNo(qualifiedAppendixRegstNo);
		}

		Date qualifiedAppendixDate = (Date)attributes.get(
			"qualifiedAppendixDate");

		if (qualifiedAppendixDate != null) {
			setQualifiedAppendixDate(qualifiedAppendixDate);
		}

		String qualifiedAppendixDetails = (String)attributes.get(
			"qualifiedAppendixDetails");

		if (qualifiedAppendixDetails != null) {
			setQualifiedAppendixDetails(qualifiedAppendixDetails);
		}

		String monitoringExposure = (String)attributes.get(
			"monitoringExposure");

		if (monitoringExposure != null) {
			setMonitoringExposure(monitoringExposure);
		}

		String recordSystem = (String)attributes.get("recordSystem");

		if (recordSystem != null) {
			setRecordSystem(recordSystem);
		}

		String securityAccess = (String)attributes.get("securityAccess");

		if (securityAccess != null) {
			setSecurityAccess(securityAccess);
		}

		String trainingInformation = (String)attributes.get(
			"trainingInformation");

		if (trainingInformation != null) {
			setTrainingInformation(trainingInformation);
		}

		String leakTesting = (String)attributes.get("leakTesting");

		if (leakTesting != null) {
			setLeakTesting(leakTesting);
		}

		String emergencyProcedures = (String)attributes.get(
			"emergencyProcedures");

		if (emergencyProcedures != null) {
			setEmergencyProcedures(emergencyProcedures);
		}

		String managementSourcesDis = (String)attributes.get(
			"managementSourcesDis");

		if (managementSourcesDis != null) {
			setManagementSourcesDis(managementSourcesDis);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public RadiationSafetyLowRisk cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the appendix rso details of this radiation safety low risk.
	 *
	 * @return the appendix rso details of this radiation safety low risk
	 */
	@Override
	public String getAppendixRsoDetails() {
		return model.getAppendixRsoDetails();
	}

	/**
	 * Returns the appendix rso email of this radiation safety low risk.
	 *
	 * @return the appendix rso email of this radiation safety low risk
	 */
	@Override
	public String getAppendixRsoEmail() {
		return model.getAppendixRsoEmail();
	}

	/**
	 * Returns the appendix rso ext of this radiation safety low risk.
	 *
	 * @return the appendix rso ext of this radiation safety low risk
	 */
	@Override
	public String getAppendixRsoExt() {
		return model.getAppendixRsoExt();
	}

	/**
	 * Returns the appendix rso fax of this radiation safety low risk.
	 *
	 * @return the appendix rso fax of this radiation safety low risk
	 */
	@Override
	public String getAppendixRsoFax() {
		return model.getAppendixRsoFax();
	}

	/**
	 * Returns the appendix rso name of this radiation safety low risk.
	 *
	 * @return the appendix rso name of this radiation safety low risk
	 */
	@Override
	public String getAppendixRsoName() {
		return model.getAppendixRsoName();
	}

	/**
	 * Returns the appendix rso tele no of this radiation safety low risk.
	 *
	 * @return the appendix rso tele no of this radiation safety low risk
	 */
	@Override
	public String getAppendixRsoTeleNo() {
		return model.getAppendixRsoTeleNo();
	}

	/**
	 * Returns the appendix rso title of this radiation safety low risk.
	 *
	 * @return the appendix rso title of this radiation safety low risk
	 */
	@Override
	public String getAppendixRsoTitle() {
		return model.getAppendixRsoTitle();
	}

	/**
	 * Returns the company ID of this radiation safety low risk.
	 *
	 * @return the company ID of this radiation safety low risk
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this radiation safety low risk.
	 *
	 * @return the create date of this radiation safety low risk
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the emergency procedures of this radiation safety low risk.
	 *
	 * @return the emergency procedures of this radiation safety low risk
	 */
	@Override
	public String getEmergencyProcedures() {
		return model.getEmergencyProcedures();
	}

	/**
	 * Returns the group ID of this radiation safety low risk.
	 *
	 * @return the group ID of this radiation safety low risk
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this radiation safety low risk.
	 *
	 * @return the hsra application ID of this radiation safety low risk
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the leak testing of this radiation safety low risk.
	 *
	 * @return the leak testing of this radiation safety low risk
	 */
	@Override
	public String getLeakTesting() {
		return model.getLeakTesting();
	}

	/**
	 * Returns the management sources dis of this radiation safety low risk.
	 *
	 * @return the management sources dis of this radiation safety low risk
	 */
	@Override
	public String getManagementSourcesDis() {
		return model.getManagementSourcesDis();
	}

	/**
	 * Returns the modified date of this radiation safety low risk.
	 *
	 * @return the modified date of this radiation safety low risk
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the monitoring exposure of this radiation safety low risk.
	 *
	 * @return the monitoring exposure of this radiation safety low risk
	 */
	@Override
	public String getMonitoringExposure() {
		return model.getMonitoringExposure();
	}

	/**
	 * Returns the primary key of this radiation safety low risk.
	 *
	 * @return the primary key of this radiation safety low risk
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the qualified appendix date of this radiation safety low risk.
	 *
	 * @return the qualified appendix date of this radiation safety low risk
	 */
	@Override
	public Date getQualifiedAppendixDate() {
		return model.getQualifiedAppendixDate();
	}

	/**
	 * Returns the qualified appendix details of this radiation safety low risk.
	 *
	 * @return the qualified appendix details of this radiation safety low risk
	 */
	@Override
	public String getQualifiedAppendixDetails() {
		return model.getQualifiedAppendixDetails();
	}

	/**
	 * Returns the qualified appendix email of this radiation safety low risk.
	 *
	 * @return the qualified appendix email of this radiation safety low risk
	 */
	@Override
	public String getQualifiedAppendixEmail() {
		return model.getQualifiedAppendixEmail();
	}

	/**
	 * Returns the qualified appendix ext of this radiation safety low risk.
	 *
	 * @return the qualified appendix ext of this radiation safety low risk
	 */
	@Override
	public String getQualifiedAppendixExt() {
		return model.getQualifiedAppendixExt();
	}

	/**
	 * Returns the qualified appendix fax of this radiation safety low risk.
	 *
	 * @return the qualified appendix fax of this radiation safety low risk
	 */
	@Override
	public String getQualifiedAppendixFax() {
		return model.getQualifiedAppendixFax();
	}

	/**
	 * Returns the qualified appendix name of this radiation safety low risk.
	 *
	 * @return the qualified appendix name of this radiation safety low risk
	 */
	@Override
	public String getQualifiedAppendixName() {
		return model.getQualifiedAppendixName();
	}

	/**
	 * Returns the qualified appendix regst no of this radiation safety low risk.
	 *
	 * @return the qualified appendix regst no of this radiation safety low risk
	 */
	@Override
	public String getQualifiedAppendixRegstNo() {
		return model.getQualifiedAppendixRegstNo();
	}

	/**
	 * Returns the qualified appendix tele of this radiation safety low risk.
	 *
	 * @return the qualified appendix tele of this radiation safety low risk
	 */
	@Override
	public String getQualifiedAppendixTele() {
		return model.getQualifiedAppendixTele();
	}

	/**
	 * Returns the qualified appendix title of this radiation safety low risk.
	 *
	 * @return the qualified appendix title of this radiation safety low risk
	 */
	@Override
	public String getQualifiedAppendixTitle() {
		return model.getQualifiedAppendixTitle();
	}

	/**
	 * Returns the radiation safety low risk ID of this radiation safety low risk.
	 *
	 * @return the radiation safety low risk ID of this radiation safety low risk
	 */
	@Override
	public long getRadiationSafetyLowRiskId() {
		return model.getRadiationSafetyLowRiskId();
	}

	/**
	 * Returns the record system of this radiation safety low risk.
	 *
	 * @return the record system of this radiation safety low risk
	 */
	@Override
	public String getRecordSystem() {
		return model.getRecordSystem();
	}

	/**
	 * Returns the security access of this radiation safety low risk.
	 *
	 * @return the security access of this radiation safety low risk
	 */
	@Override
	public String getSecurityAccess() {
		return model.getSecurityAccess();
	}

	/**
	 * Returns the training information of this radiation safety low risk.
	 *
	 * @return the training information of this radiation safety low risk
	 */
	@Override
	public String getTrainingInformation() {
		return model.getTrainingInformation();
	}

	/**
	 * Returns the user ID of this radiation safety low risk.
	 *
	 * @return the user ID of this radiation safety low risk
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this radiation safety low risk.
	 *
	 * @return the user name of this radiation safety low risk
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this radiation safety low risk.
	 *
	 * @return the user uuid of this radiation safety low risk
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
	 * Sets the appendix rso details of this radiation safety low risk.
	 *
	 * @param appendixRsoDetails the appendix rso details of this radiation safety low risk
	 */
	@Override
	public void setAppendixRsoDetails(String appendixRsoDetails) {
		model.setAppendixRsoDetails(appendixRsoDetails);
	}

	/**
	 * Sets the appendix rso email of this radiation safety low risk.
	 *
	 * @param appendixRsoEmail the appendix rso email of this radiation safety low risk
	 */
	@Override
	public void setAppendixRsoEmail(String appendixRsoEmail) {
		model.setAppendixRsoEmail(appendixRsoEmail);
	}

	/**
	 * Sets the appendix rso ext of this radiation safety low risk.
	 *
	 * @param appendixRsoExt the appendix rso ext of this radiation safety low risk
	 */
	@Override
	public void setAppendixRsoExt(String appendixRsoExt) {
		model.setAppendixRsoExt(appendixRsoExt);
	}

	/**
	 * Sets the appendix rso fax of this radiation safety low risk.
	 *
	 * @param appendixRsoFax the appendix rso fax of this radiation safety low risk
	 */
	@Override
	public void setAppendixRsoFax(String appendixRsoFax) {
		model.setAppendixRsoFax(appendixRsoFax);
	}

	/**
	 * Sets the appendix rso name of this radiation safety low risk.
	 *
	 * @param appendixRsoName the appendix rso name of this radiation safety low risk
	 */
	@Override
	public void setAppendixRsoName(String appendixRsoName) {
		model.setAppendixRsoName(appendixRsoName);
	}

	/**
	 * Sets the appendix rso tele no of this radiation safety low risk.
	 *
	 * @param appendixRsoTeleNo the appendix rso tele no of this radiation safety low risk
	 */
	@Override
	public void setAppendixRsoTeleNo(String appendixRsoTeleNo) {
		model.setAppendixRsoTeleNo(appendixRsoTeleNo);
	}

	/**
	 * Sets the appendix rso title of this radiation safety low risk.
	 *
	 * @param appendixRsoTitle the appendix rso title of this radiation safety low risk
	 */
	@Override
	public void setAppendixRsoTitle(String appendixRsoTitle) {
		model.setAppendixRsoTitle(appendixRsoTitle);
	}

	/**
	 * Sets the company ID of this radiation safety low risk.
	 *
	 * @param companyId the company ID of this radiation safety low risk
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this radiation safety low risk.
	 *
	 * @param createDate the create date of this radiation safety low risk
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the emergency procedures of this radiation safety low risk.
	 *
	 * @param emergencyProcedures the emergency procedures of this radiation safety low risk
	 */
	@Override
	public void setEmergencyProcedures(String emergencyProcedures) {
		model.setEmergencyProcedures(emergencyProcedures);
	}

	/**
	 * Sets the group ID of this radiation safety low risk.
	 *
	 * @param groupId the group ID of this radiation safety low risk
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this radiation safety low risk.
	 *
	 * @param hsraApplicationId the hsra application ID of this radiation safety low risk
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the leak testing of this radiation safety low risk.
	 *
	 * @param leakTesting the leak testing of this radiation safety low risk
	 */
	@Override
	public void setLeakTesting(String leakTesting) {
		model.setLeakTesting(leakTesting);
	}

	/**
	 * Sets the management sources dis of this radiation safety low risk.
	 *
	 * @param managementSourcesDis the management sources dis of this radiation safety low risk
	 */
	@Override
	public void setManagementSourcesDis(String managementSourcesDis) {
		model.setManagementSourcesDis(managementSourcesDis);
	}

	/**
	 * Sets the modified date of this radiation safety low risk.
	 *
	 * @param modifiedDate the modified date of this radiation safety low risk
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the monitoring exposure of this radiation safety low risk.
	 *
	 * @param monitoringExposure the monitoring exposure of this radiation safety low risk
	 */
	@Override
	public void setMonitoringExposure(String monitoringExposure) {
		model.setMonitoringExposure(monitoringExposure);
	}

	/**
	 * Sets the primary key of this radiation safety low risk.
	 *
	 * @param primaryKey the primary key of this radiation safety low risk
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the qualified appendix date of this radiation safety low risk.
	 *
	 * @param qualifiedAppendixDate the qualified appendix date of this radiation safety low risk
	 */
	@Override
	public void setQualifiedAppendixDate(Date qualifiedAppendixDate) {
		model.setQualifiedAppendixDate(qualifiedAppendixDate);
	}

	/**
	 * Sets the qualified appendix details of this radiation safety low risk.
	 *
	 * @param qualifiedAppendixDetails the qualified appendix details of this radiation safety low risk
	 */
	@Override
	public void setQualifiedAppendixDetails(String qualifiedAppendixDetails) {
		model.setQualifiedAppendixDetails(qualifiedAppendixDetails);
	}

	/**
	 * Sets the qualified appendix email of this radiation safety low risk.
	 *
	 * @param qualifiedAppendixEmail the qualified appendix email of this radiation safety low risk
	 */
	@Override
	public void setQualifiedAppendixEmail(String qualifiedAppendixEmail) {
		model.setQualifiedAppendixEmail(qualifiedAppendixEmail);
	}

	/**
	 * Sets the qualified appendix ext of this radiation safety low risk.
	 *
	 * @param qualifiedAppendixExt the qualified appendix ext of this radiation safety low risk
	 */
	@Override
	public void setQualifiedAppendixExt(String qualifiedAppendixExt) {
		model.setQualifiedAppendixExt(qualifiedAppendixExt);
	}

	/**
	 * Sets the qualified appendix fax of this radiation safety low risk.
	 *
	 * @param qualifiedAppendixFax the qualified appendix fax of this radiation safety low risk
	 */
	@Override
	public void setQualifiedAppendixFax(String qualifiedAppendixFax) {
		model.setQualifiedAppendixFax(qualifiedAppendixFax);
	}

	/**
	 * Sets the qualified appendix name of this radiation safety low risk.
	 *
	 * @param qualifiedAppendixName the qualified appendix name of this radiation safety low risk
	 */
	@Override
	public void setQualifiedAppendixName(String qualifiedAppendixName) {
		model.setQualifiedAppendixName(qualifiedAppendixName);
	}

	/**
	 * Sets the qualified appendix regst no of this radiation safety low risk.
	 *
	 * @param qualifiedAppendixRegstNo the qualified appendix regst no of this radiation safety low risk
	 */
	@Override
	public void setQualifiedAppendixRegstNo(String qualifiedAppendixRegstNo) {
		model.setQualifiedAppendixRegstNo(qualifiedAppendixRegstNo);
	}

	/**
	 * Sets the qualified appendix tele of this radiation safety low risk.
	 *
	 * @param qualifiedAppendixTele the qualified appendix tele of this radiation safety low risk
	 */
	@Override
	public void setQualifiedAppendixTele(String qualifiedAppendixTele) {
		model.setQualifiedAppendixTele(qualifiedAppendixTele);
	}

	/**
	 * Sets the qualified appendix title of this radiation safety low risk.
	 *
	 * @param qualifiedAppendixTitle the qualified appendix title of this radiation safety low risk
	 */
	@Override
	public void setQualifiedAppendixTitle(String qualifiedAppendixTitle) {
		model.setQualifiedAppendixTitle(qualifiedAppendixTitle);
	}

	/**
	 * Sets the radiation safety low risk ID of this radiation safety low risk.
	 *
	 * @param radiationSafetyLowRiskId the radiation safety low risk ID of this radiation safety low risk
	 */
	@Override
	public void setRadiationSafetyLowRiskId(long radiationSafetyLowRiskId) {
		model.setRadiationSafetyLowRiskId(radiationSafetyLowRiskId);
	}

	/**
	 * Sets the record system of this radiation safety low risk.
	 *
	 * @param recordSystem the record system of this radiation safety low risk
	 */
	@Override
	public void setRecordSystem(String recordSystem) {
		model.setRecordSystem(recordSystem);
	}

	/**
	 * Sets the security access of this radiation safety low risk.
	 *
	 * @param securityAccess the security access of this radiation safety low risk
	 */
	@Override
	public void setSecurityAccess(String securityAccess) {
		model.setSecurityAccess(securityAccess);
	}

	/**
	 * Sets the training information of this radiation safety low risk.
	 *
	 * @param trainingInformation the training information of this radiation safety low risk
	 */
	@Override
	public void setTrainingInformation(String trainingInformation) {
		model.setTrainingInformation(trainingInformation);
	}

	/**
	 * Sets the user ID of this radiation safety low risk.
	 *
	 * @param userId the user ID of this radiation safety low risk
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this radiation safety low risk.
	 *
	 * @param userName the user name of this radiation safety low risk
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this radiation safety low risk.
	 *
	 * @param userUuid the user uuid of this radiation safety low risk
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
	protected RadiationSafetyLowRiskWrapper wrap(
		RadiationSafetyLowRisk radiationSafetyLowRisk) {

		return new RadiationSafetyLowRiskWrapper(radiationSafetyLowRisk);
	}

}