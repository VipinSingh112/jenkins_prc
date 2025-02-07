/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NcbjOrgDetailInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjOrgDetailInfo
 * @generated
 */
public class NcbjOrgDetailInfoWrapper
	extends BaseModelWrapper<NcbjOrgDetailInfo>
	implements ModelWrapper<NcbjOrgDetailInfo>, NcbjOrgDetailInfo {

	public NcbjOrgDetailInfoWrapper(NcbjOrgDetailInfo ncbjOrgDetailInfo) {
		super(ncbjOrgDetailInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ncbjOrgDetailInfoId", getNcbjOrgDetailInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("newCompanyName", getNewCompanyName());
		attributes.put("companyEmail", getCompanyEmail());
		attributes.put("mailingAddress", getMailingAddress());
		attributes.put("city", getCity());
		attributes.put("postalCode", getPostalCode());
		attributes.put("country", getCountry());
		attributes.put("physicalAddress", getPhysicalAddress());
		attributes.put("physicalCity", getPhysicalCity());
		attributes.put("physicalPostalCode", getPhysicalPostalCode());
		attributes.put("physicalCountry", getPhysicalCountry());
		attributes.put("companyHead", getCompanyHead());
		attributes.put("companyTitle", getCompanyTitle());
		attributes.put("companyContact", getCompanyContact());
		attributes.put("companyContactTitle", getCompanyContactTitle());
		attributes.put("companyTelephone", getCompanyTelephone());
		attributes.put("companyFax", getCompanyFax());
		attributes.put("companyWebsite", getCompanyWebsite());
		attributes.put("certificationScope", getCertificationScope());
		attributes.put("manageAccessToAuditDet", getManageAccessToAuditDet());
		attributes.put("keyActivity", getKeyActivity());
		attributes.put("transferReason", getTransferReason());
		attributes.put("indicateStandard", getIndicateStandard());
		attributes.put("ceritificationBodyName", getCeritificationBodyName());
		attributes.put("consultingFirm", getConsultingFirm());
		attributes.put("consultant", getConsultant());
		attributes.put("telephone", getTelephone());
		attributes.put("email", getEmail());
		attributes.put("certificationScopeRadio", getCertificationScopeRadio());
		attributes.put("outsourceProcess", getOutsourceProcess());
		attributes.put("relevantRequirement", getRelevantRequirement());
		attributes.put("relevantRequirementList", getRelevantRequirementList());
		attributes.put("managementAccessToAudit", getManagementAccessToAudit());
		attributes.put("pleaseManageDetail", getPleaseManageDetail());
		attributes.put("desiredCertification", getDesiredCertification());
		attributes.put("surveillanceSchedule", getSurveillanceSchedule());
		attributes.put("certifiedManagement", getCertifiedManagement());
		attributes.put(
			"certifiedAccreditedCerti", getCertifiedAccreditedCerti());
		attributes.put("companyUsedConsulting", getCompanyUsedConsulting());
		attributes.put("ncbjApplicationId", getNcbjApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncbjOrgDetailInfoId = (Long)attributes.get("ncbjOrgDetailInfoId");

		if (ncbjOrgDetailInfoId != null) {
			setNcbjOrgDetailInfoId(ncbjOrgDetailInfoId);
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

		String newCompanyName = (String)attributes.get("newCompanyName");

		if (newCompanyName != null) {
			setNewCompanyName(newCompanyName);
		}

		String companyEmail = (String)attributes.get("companyEmail");

		if (companyEmail != null) {
			setCompanyEmail(companyEmail);
		}

		String mailingAddress = (String)attributes.get("mailingAddress");

		if (mailingAddress != null) {
			setMailingAddress(mailingAddress);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String postalCode = (String)attributes.get("postalCode");

		if (postalCode != null) {
			setPostalCode(postalCode);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		String physicalAddress = (String)attributes.get("physicalAddress");

		if (physicalAddress != null) {
			setPhysicalAddress(physicalAddress);
		}

		String physicalCity = (String)attributes.get("physicalCity");

		if (physicalCity != null) {
			setPhysicalCity(physicalCity);
		}

		String physicalPostalCode = (String)attributes.get(
			"physicalPostalCode");

		if (physicalPostalCode != null) {
			setPhysicalPostalCode(physicalPostalCode);
		}

		String physicalCountry = (String)attributes.get("physicalCountry");

		if (physicalCountry != null) {
			setPhysicalCountry(physicalCountry);
		}

		String companyHead = (String)attributes.get("companyHead");

		if (companyHead != null) {
			setCompanyHead(companyHead);
		}

		String companyTitle = (String)attributes.get("companyTitle");

		if (companyTitle != null) {
			setCompanyTitle(companyTitle);
		}

		String companyContact = (String)attributes.get("companyContact");

		if (companyContact != null) {
			setCompanyContact(companyContact);
		}

		String companyContactTitle = (String)attributes.get(
			"companyContactTitle");

		if (companyContactTitle != null) {
			setCompanyContactTitle(companyContactTitle);
		}

		String companyTelephone = (String)attributes.get("companyTelephone");

		if (companyTelephone != null) {
			setCompanyTelephone(companyTelephone);
		}

		String companyFax = (String)attributes.get("companyFax");

		if (companyFax != null) {
			setCompanyFax(companyFax);
		}

		String companyWebsite = (String)attributes.get("companyWebsite");

		if (companyWebsite != null) {
			setCompanyWebsite(companyWebsite);
		}

		String certificationScope = (String)attributes.get(
			"certificationScope");

		if (certificationScope != null) {
			setCertificationScope(certificationScope);
		}

		String manageAccessToAuditDet = (String)attributes.get(
			"manageAccessToAuditDet");

		if (manageAccessToAuditDet != null) {
			setManageAccessToAuditDet(manageAccessToAuditDet);
		}

		String keyActivity = (String)attributes.get("keyActivity");

		if (keyActivity != null) {
			setKeyActivity(keyActivity);
		}

		String transferReason = (String)attributes.get("transferReason");

		if (transferReason != null) {
			setTransferReason(transferReason);
		}

		String indicateStandard = (String)attributes.get("indicateStandard");

		if (indicateStandard != null) {
			setIndicateStandard(indicateStandard);
		}

		String ceritificationBodyName = (String)attributes.get(
			"ceritificationBodyName");

		if (ceritificationBodyName != null) {
			setCeritificationBodyName(ceritificationBodyName);
		}

		String consultingFirm = (String)attributes.get("consultingFirm");

		if (consultingFirm != null) {
			setConsultingFirm(consultingFirm);
		}

		String consultant = (String)attributes.get("consultant");

		if (consultant != null) {
			setConsultant(consultant);
		}

		String telephone = (String)attributes.get("telephone");

		if (telephone != null) {
			setTelephone(telephone);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String certificationScopeRadio = (String)attributes.get(
			"certificationScopeRadio");

		if (certificationScopeRadio != null) {
			setCertificationScopeRadio(certificationScopeRadio);
		}

		String outsourceProcess = (String)attributes.get("outsourceProcess");

		if (outsourceProcess != null) {
			setOutsourceProcess(outsourceProcess);
		}

		String relevantRequirement = (String)attributes.get(
			"relevantRequirement");

		if (relevantRequirement != null) {
			setRelevantRequirement(relevantRequirement);
		}

		String relevantRequirementList = (String)attributes.get(
			"relevantRequirementList");

		if (relevantRequirementList != null) {
			setRelevantRequirementList(relevantRequirementList);
		}

		String managementAccessToAudit = (String)attributes.get(
			"managementAccessToAudit");

		if (managementAccessToAudit != null) {
			setManagementAccessToAudit(managementAccessToAudit);
		}

		String pleaseManageDetail = (String)attributes.get(
			"pleaseManageDetail");

		if (pleaseManageDetail != null) {
			setPleaseManageDetail(pleaseManageDetail);
		}

		String desiredCertification = (String)attributes.get(
			"desiredCertification");

		if (desiredCertification != null) {
			setDesiredCertification(desiredCertification);
		}

		String surveillanceSchedule = (String)attributes.get(
			"surveillanceSchedule");

		if (surveillanceSchedule != null) {
			setSurveillanceSchedule(surveillanceSchedule);
		}

		String certifiedManagement = (String)attributes.get(
			"certifiedManagement");

		if (certifiedManagement != null) {
			setCertifiedManagement(certifiedManagement);
		}

		String certifiedAccreditedCerti = (String)attributes.get(
			"certifiedAccreditedCerti");

		if (certifiedAccreditedCerti != null) {
			setCertifiedAccreditedCerti(certifiedAccreditedCerti);
		}

		String companyUsedConsulting = (String)attributes.get(
			"companyUsedConsulting");

		if (companyUsedConsulting != null) {
			setCompanyUsedConsulting(companyUsedConsulting);
		}

		Long ncbjApplicationId = (Long)attributes.get("ncbjApplicationId");

		if (ncbjApplicationId != null) {
			setNcbjApplicationId(ncbjApplicationId);
		}
	}

	@Override
	public NcbjOrgDetailInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the ceritification body name of this ncbj org detail info.
	 *
	 * @return the ceritification body name of this ncbj org detail info
	 */
	@Override
	public String getCeritificationBodyName() {
		return model.getCeritificationBodyName();
	}

	/**
	 * Returns the certification scope of this ncbj org detail info.
	 *
	 * @return the certification scope of this ncbj org detail info
	 */
	@Override
	public String getCertificationScope() {
		return model.getCertificationScope();
	}

	/**
	 * Returns the certification scope radio of this ncbj org detail info.
	 *
	 * @return the certification scope radio of this ncbj org detail info
	 */
	@Override
	public String getCertificationScopeRadio() {
		return model.getCertificationScopeRadio();
	}

	/**
	 * Returns the certified accredited certi of this ncbj org detail info.
	 *
	 * @return the certified accredited certi of this ncbj org detail info
	 */
	@Override
	public String getCertifiedAccreditedCerti() {
		return model.getCertifiedAccreditedCerti();
	}

	/**
	 * Returns the certified management of this ncbj org detail info.
	 *
	 * @return the certified management of this ncbj org detail info
	 */
	@Override
	public String getCertifiedManagement() {
		return model.getCertifiedManagement();
	}

	/**
	 * Returns the city of this ncbj org detail info.
	 *
	 * @return the city of this ncbj org detail info
	 */
	@Override
	public String getCity() {
		return model.getCity();
	}

	/**
	 * Returns the company contact of this ncbj org detail info.
	 *
	 * @return the company contact of this ncbj org detail info
	 */
	@Override
	public String getCompanyContact() {
		return model.getCompanyContact();
	}

	/**
	 * Returns the company contact title of this ncbj org detail info.
	 *
	 * @return the company contact title of this ncbj org detail info
	 */
	@Override
	public String getCompanyContactTitle() {
		return model.getCompanyContactTitle();
	}

	/**
	 * Returns the company email of this ncbj org detail info.
	 *
	 * @return the company email of this ncbj org detail info
	 */
	@Override
	public String getCompanyEmail() {
		return model.getCompanyEmail();
	}

	/**
	 * Returns the company fax of this ncbj org detail info.
	 *
	 * @return the company fax of this ncbj org detail info
	 */
	@Override
	public String getCompanyFax() {
		return model.getCompanyFax();
	}

	/**
	 * Returns the company head of this ncbj org detail info.
	 *
	 * @return the company head of this ncbj org detail info
	 */
	@Override
	public String getCompanyHead() {
		return model.getCompanyHead();
	}

	/**
	 * Returns the company ID of this ncbj org detail info.
	 *
	 * @return the company ID of this ncbj org detail info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company telephone of this ncbj org detail info.
	 *
	 * @return the company telephone of this ncbj org detail info
	 */
	@Override
	public String getCompanyTelephone() {
		return model.getCompanyTelephone();
	}

	/**
	 * Returns the company title of this ncbj org detail info.
	 *
	 * @return the company title of this ncbj org detail info
	 */
	@Override
	public String getCompanyTitle() {
		return model.getCompanyTitle();
	}

	/**
	 * Returns the company used consulting of this ncbj org detail info.
	 *
	 * @return the company used consulting of this ncbj org detail info
	 */
	@Override
	public String getCompanyUsedConsulting() {
		return model.getCompanyUsedConsulting();
	}

	/**
	 * Returns the company website of this ncbj org detail info.
	 *
	 * @return the company website of this ncbj org detail info
	 */
	@Override
	public String getCompanyWebsite() {
		return model.getCompanyWebsite();
	}

	/**
	 * Returns the consultant of this ncbj org detail info.
	 *
	 * @return the consultant of this ncbj org detail info
	 */
	@Override
	public String getConsultant() {
		return model.getConsultant();
	}

	/**
	 * Returns the consulting firm of this ncbj org detail info.
	 *
	 * @return the consulting firm of this ncbj org detail info
	 */
	@Override
	public String getConsultingFirm() {
		return model.getConsultingFirm();
	}

	/**
	 * Returns the country of this ncbj org detail info.
	 *
	 * @return the country of this ncbj org detail info
	 */
	@Override
	public String getCountry() {
		return model.getCountry();
	}

	/**
	 * Returns the create date of this ncbj org detail info.
	 *
	 * @return the create date of this ncbj org detail info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the desired certification of this ncbj org detail info.
	 *
	 * @return the desired certification of this ncbj org detail info
	 */
	@Override
	public String getDesiredCertification() {
		return model.getDesiredCertification();
	}

	/**
	 * Returns the email of this ncbj org detail info.
	 *
	 * @return the email of this ncbj org detail info
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the group ID of this ncbj org detail info.
	 *
	 * @return the group ID of this ncbj org detail info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the indicate standard of this ncbj org detail info.
	 *
	 * @return the indicate standard of this ncbj org detail info
	 */
	@Override
	public String getIndicateStandard() {
		return model.getIndicateStandard();
	}

	/**
	 * Returns the key activity of this ncbj org detail info.
	 *
	 * @return the key activity of this ncbj org detail info
	 */
	@Override
	public String getKeyActivity() {
		return model.getKeyActivity();
	}

	/**
	 * Returns the mailing address of this ncbj org detail info.
	 *
	 * @return the mailing address of this ncbj org detail info
	 */
	@Override
	public String getMailingAddress() {
		return model.getMailingAddress();
	}

	/**
	 * Returns the manage access to audit det of this ncbj org detail info.
	 *
	 * @return the manage access to audit det of this ncbj org detail info
	 */
	@Override
	public String getManageAccessToAuditDet() {
		return model.getManageAccessToAuditDet();
	}

	/**
	 * Returns the management access to audit of this ncbj org detail info.
	 *
	 * @return the management access to audit of this ncbj org detail info
	 */
	@Override
	public String getManagementAccessToAudit() {
		return model.getManagementAccessToAudit();
	}

	/**
	 * Returns the modified date of this ncbj org detail info.
	 *
	 * @return the modified date of this ncbj org detail info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncbj application ID of this ncbj org detail info.
	 *
	 * @return the ncbj application ID of this ncbj org detail info
	 */
	@Override
	public long getNcbjApplicationId() {
		return model.getNcbjApplicationId();
	}

	/**
	 * Returns the ncbj org detail info ID of this ncbj org detail info.
	 *
	 * @return the ncbj org detail info ID of this ncbj org detail info
	 */
	@Override
	public long getNcbjOrgDetailInfoId() {
		return model.getNcbjOrgDetailInfoId();
	}

	/**
	 * Returns the new company name of this ncbj org detail info.
	 *
	 * @return the new company name of this ncbj org detail info
	 */
	@Override
	public String getNewCompanyName() {
		return model.getNewCompanyName();
	}

	/**
	 * Returns the outsource process of this ncbj org detail info.
	 *
	 * @return the outsource process of this ncbj org detail info
	 */
	@Override
	public String getOutsourceProcess() {
		return model.getOutsourceProcess();
	}

	/**
	 * Returns the physical address of this ncbj org detail info.
	 *
	 * @return the physical address of this ncbj org detail info
	 */
	@Override
	public String getPhysicalAddress() {
		return model.getPhysicalAddress();
	}

	/**
	 * Returns the physical city of this ncbj org detail info.
	 *
	 * @return the physical city of this ncbj org detail info
	 */
	@Override
	public String getPhysicalCity() {
		return model.getPhysicalCity();
	}

	/**
	 * Returns the physical country of this ncbj org detail info.
	 *
	 * @return the physical country of this ncbj org detail info
	 */
	@Override
	public String getPhysicalCountry() {
		return model.getPhysicalCountry();
	}

	/**
	 * Returns the physical postal code of this ncbj org detail info.
	 *
	 * @return the physical postal code of this ncbj org detail info
	 */
	@Override
	public String getPhysicalPostalCode() {
		return model.getPhysicalPostalCode();
	}

	/**
	 * Returns the please manage detail of this ncbj org detail info.
	 *
	 * @return the please manage detail of this ncbj org detail info
	 */
	@Override
	public String getPleaseManageDetail() {
		return model.getPleaseManageDetail();
	}

	/**
	 * Returns the postal code of this ncbj org detail info.
	 *
	 * @return the postal code of this ncbj org detail info
	 */
	@Override
	public String getPostalCode() {
		return model.getPostalCode();
	}

	/**
	 * Returns the primary key of this ncbj org detail info.
	 *
	 * @return the primary key of this ncbj org detail info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the relevant requirement of this ncbj org detail info.
	 *
	 * @return the relevant requirement of this ncbj org detail info
	 */
	@Override
	public String getRelevantRequirement() {
		return model.getRelevantRequirement();
	}

	/**
	 * Returns the relevant requirement list of this ncbj org detail info.
	 *
	 * @return the relevant requirement list of this ncbj org detail info
	 */
	@Override
	public String getRelevantRequirementList() {
		return model.getRelevantRequirementList();
	}

	/**
	 * Returns the surveillance schedule of this ncbj org detail info.
	 *
	 * @return the surveillance schedule of this ncbj org detail info
	 */
	@Override
	public String getSurveillanceSchedule() {
		return model.getSurveillanceSchedule();
	}

	/**
	 * Returns the telephone of this ncbj org detail info.
	 *
	 * @return the telephone of this ncbj org detail info
	 */
	@Override
	public String getTelephone() {
		return model.getTelephone();
	}

	/**
	 * Returns the transfer reason of this ncbj org detail info.
	 *
	 * @return the transfer reason of this ncbj org detail info
	 */
	@Override
	public String getTransferReason() {
		return model.getTransferReason();
	}

	/**
	 * Returns the user ID of this ncbj org detail info.
	 *
	 * @return the user ID of this ncbj org detail info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj org detail info.
	 *
	 * @return the user name of this ncbj org detail info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj org detail info.
	 *
	 * @return the user uuid of this ncbj org detail info
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
	 * Sets the ceritification body name of this ncbj org detail info.
	 *
	 * @param ceritificationBodyName the ceritification body name of this ncbj org detail info
	 */
	@Override
	public void setCeritificationBodyName(String ceritificationBodyName) {
		model.setCeritificationBodyName(ceritificationBodyName);
	}

	/**
	 * Sets the certification scope of this ncbj org detail info.
	 *
	 * @param certificationScope the certification scope of this ncbj org detail info
	 */
	@Override
	public void setCertificationScope(String certificationScope) {
		model.setCertificationScope(certificationScope);
	}

	/**
	 * Sets the certification scope radio of this ncbj org detail info.
	 *
	 * @param certificationScopeRadio the certification scope radio of this ncbj org detail info
	 */
	@Override
	public void setCertificationScopeRadio(String certificationScopeRadio) {
		model.setCertificationScopeRadio(certificationScopeRadio);
	}

	/**
	 * Sets the certified accredited certi of this ncbj org detail info.
	 *
	 * @param certifiedAccreditedCerti the certified accredited certi of this ncbj org detail info
	 */
	@Override
	public void setCertifiedAccreditedCerti(String certifiedAccreditedCerti) {
		model.setCertifiedAccreditedCerti(certifiedAccreditedCerti);
	}

	/**
	 * Sets the certified management of this ncbj org detail info.
	 *
	 * @param certifiedManagement the certified management of this ncbj org detail info
	 */
	@Override
	public void setCertifiedManagement(String certifiedManagement) {
		model.setCertifiedManagement(certifiedManagement);
	}

	/**
	 * Sets the city of this ncbj org detail info.
	 *
	 * @param city the city of this ncbj org detail info
	 */
	@Override
	public void setCity(String city) {
		model.setCity(city);
	}

	/**
	 * Sets the company contact of this ncbj org detail info.
	 *
	 * @param companyContact the company contact of this ncbj org detail info
	 */
	@Override
	public void setCompanyContact(String companyContact) {
		model.setCompanyContact(companyContact);
	}

	/**
	 * Sets the company contact title of this ncbj org detail info.
	 *
	 * @param companyContactTitle the company contact title of this ncbj org detail info
	 */
	@Override
	public void setCompanyContactTitle(String companyContactTitle) {
		model.setCompanyContactTitle(companyContactTitle);
	}

	/**
	 * Sets the company email of this ncbj org detail info.
	 *
	 * @param companyEmail the company email of this ncbj org detail info
	 */
	@Override
	public void setCompanyEmail(String companyEmail) {
		model.setCompanyEmail(companyEmail);
	}

	/**
	 * Sets the company fax of this ncbj org detail info.
	 *
	 * @param companyFax the company fax of this ncbj org detail info
	 */
	@Override
	public void setCompanyFax(String companyFax) {
		model.setCompanyFax(companyFax);
	}

	/**
	 * Sets the company head of this ncbj org detail info.
	 *
	 * @param companyHead the company head of this ncbj org detail info
	 */
	@Override
	public void setCompanyHead(String companyHead) {
		model.setCompanyHead(companyHead);
	}

	/**
	 * Sets the company ID of this ncbj org detail info.
	 *
	 * @param companyId the company ID of this ncbj org detail info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company telephone of this ncbj org detail info.
	 *
	 * @param companyTelephone the company telephone of this ncbj org detail info
	 */
	@Override
	public void setCompanyTelephone(String companyTelephone) {
		model.setCompanyTelephone(companyTelephone);
	}

	/**
	 * Sets the company title of this ncbj org detail info.
	 *
	 * @param companyTitle the company title of this ncbj org detail info
	 */
	@Override
	public void setCompanyTitle(String companyTitle) {
		model.setCompanyTitle(companyTitle);
	}

	/**
	 * Sets the company used consulting of this ncbj org detail info.
	 *
	 * @param companyUsedConsulting the company used consulting of this ncbj org detail info
	 */
	@Override
	public void setCompanyUsedConsulting(String companyUsedConsulting) {
		model.setCompanyUsedConsulting(companyUsedConsulting);
	}

	/**
	 * Sets the company website of this ncbj org detail info.
	 *
	 * @param companyWebsite the company website of this ncbj org detail info
	 */
	@Override
	public void setCompanyWebsite(String companyWebsite) {
		model.setCompanyWebsite(companyWebsite);
	}

	/**
	 * Sets the consultant of this ncbj org detail info.
	 *
	 * @param consultant the consultant of this ncbj org detail info
	 */
	@Override
	public void setConsultant(String consultant) {
		model.setConsultant(consultant);
	}

	/**
	 * Sets the consulting firm of this ncbj org detail info.
	 *
	 * @param consultingFirm the consulting firm of this ncbj org detail info
	 */
	@Override
	public void setConsultingFirm(String consultingFirm) {
		model.setConsultingFirm(consultingFirm);
	}

	/**
	 * Sets the country of this ncbj org detail info.
	 *
	 * @param country the country of this ncbj org detail info
	 */
	@Override
	public void setCountry(String country) {
		model.setCountry(country);
	}

	/**
	 * Sets the create date of this ncbj org detail info.
	 *
	 * @param createDate the create date of this ncbj org detail info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the desired certification of this ncbj org detail info.
	 *
	 * @param desiredCertification the desired certification of this ncbj org detail info
	 */
	@Override
	public void setDesiredCertification(String desiredCertification) {
		model.setDesiredCertification(desiredCertification);
	}

	/**
	 * Sets the email of this ncbj org detail info.
	 *
	 * @param email the email of this ncbj org detail info
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the group ID of this ncbj org detail info.
	 *
	 * @param groupId the group ID of this ncbj org detail info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the indicate standard of this ncbj org detail info.
	 *
	 * @param indicateStandard the indicate standard of this ncbj org detail info
	 */
	@Override
	public void setIndicateStandard(String indicateStandard) {
		model.setIndicateStandard(indicateStandard);
	}

	/**
	 * Sets the key activity of this ncbj org detail info.
	 *
	 * @param keyActivity the key activity of this ncbj org detail info
	 */
	@Override
	public void setKeyActivity(String keyActivity) {
		model.setKeyActivity(keyActivity);
	}

	/**
	 * Sets the mailing address of this ncbj org detail info.
	 *
	 * @param mailingAddress the mailing address of this ncbj org detail info
	 */
	@Override
	public void setMailingAddress(String mailingAddress) {
		model.setMailingAddress(mailingAddress);
	}

	/**
	 * Sets the manage access to audit det of this ncbj org detail info.
	 *
	 * @param manageAccessToAuditDet the manage access to audit det of this ncbj org detail info
	 */
	@Override
	public void setManageAccessToAuditDet(String manageAccessToAuditDet) {
		model.setManageAccessToAuditDet(manageAccessToAuditDet);
	}

	/**
	 * Sets the management access to audit of this ncbj org detail info.
	 *
	 * @param managementAccessToAudit the management access to audit of this ncbj org detail info
	 */
	@Override
	public void setManagementAccessToAudit(String managementAccessToAudit) {
		model.setManagementAccessToAudit(managementAccessToAudit);
	}

	/**
	 * Sets the modified date of this ncbj org detail info.
	 *
	 * @param modifiedDate the modified date of this ncbj org detail info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncbj application ID of this ncbj org detail info.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj org detail info
	 */
	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		model.setNcbjApplicationId(ncbjApplicationId);
	}

	/**
	 * Sets the ncbj org detail info ID of this ncbj org detail info.
	 *
	 * @param ncbjOrgDetailInfoId the ncbj org detail info ID of this ncbj org detail info
	 */
	@Override
	public void setNcbjOrgDetailInfoId(long ncbjOrgDetailInfoId) {
		model.setNcbjOrgDetailInfoId(ncbjOrgDetailInfoId);
	}

	/**
	 * Sets the new company name of this ncbj org detail info.
	 *
	 * @param newCompanyName the new company name of this ncbj org detail info
	 */
	@Override
	public void setNewCompanyName(String newCompanyName) {
		model.setNewCompanyName(newCompanyName);
	}

	/**
	 * Sets the outsource process of this ncbj org detail info.
	 *
	 * @param outsourceProcess the outsource process of this ncbj org detail info
	 */
	@Override
	public void setOutsourceProcess(String outsourceProcess) {
		model.setOutsourceProcess(outsourceProcess);
	}

	/**
	 * Sets the physical address of this ncbj org detail info.
	 *
	 * @param physicalAddress the physical address of this ncbj org detail info
	 */
	@Override
	public void setPhysicalAddress(String physicalAddress) {
		model.setPhysicalAddress(physicalAddress);
	}

	/**
	 * Sets the physical city of this ncbj org detail info.
	 *
	 * @param physicalCity the physical city of this ncbj org detail info
	 */
	@Override
	public void setPhysicalCity(String physicalCity) {
		model.setPhysicalCity(physicalCity);
	}

	/**
	 * Sets the physical country of this ncbj org detail info.
	 *
	 * @param physicalCountry the physical country of this ncbj org detail info
	 */
	@Override
	public void setPhysicalCountry(String physicalCountry) {
		model.setPhysicalCountry(physicalCountry);
	}

	/**
	 * Sets the physical postal code of this ncbj org detail info.
	 *
	 * @param physicalPostalCode the physical postal code of this ncbj org detail info
	 */
	@Override
	public void setPhysicalPostalCode(String physicalPostalCode) {
		model.setPhysicalPostalCode(physicalPostalCode);
	}

	/**
	 * Sets the please manage detail of this ncbj org detail info.
	 *
	 * @param pleaseManageDetail the please manage detail of this ncbj org detail info
	 */
	@Override
	public void setPleaseManageDetail(String pleaseManageDetail) {
		model.setPleaseManageDetail(pleaseManageDetail);
	}

	/**
	 * Sets the postal code of this ncbj org detail info.
	 *
	 * @param postalCode the postal code of this ncbj org detail info
	 */
	@Override
	public void setPostalCode(String postalCode) {
		model.setPostalCode(postalCode);
	}

	/**
	 * Sets the primary key of this ncbj org detail info.
	 *
	 * @param primaryKey the primary key of this ncbj org detail info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the relevant requirement of this ncbj org detail info.
	 *
	 * @param relevantRequirement the relevant requirement of this ncbj org detail info
	 */
	@Override
	public void setRelevantRequirement(String relevantRequirement) {
		model.setRelevantRequirement(relevantRequirement);
	}

	/**
	 * Sets the relevant requirement list of this ncbj org detail info.
	 *
	 * @param relevantRequirementList the relevant requirement list of this ncbj org detail info
	 */
	@Override
	public void setRelevantRequirementList(String relevantRequirementList) {
		model.setRelevantRequirementList(relevantRequirementList);
	}

	/**
	 * Sets the surveillance schedule of this ncbj org detail info.
	 *
	 * @param surveillanceSchedule the surveillance schedule of this ncbj org detail info
	 */
	@Override
	public void setSurveillanceSchedule(String surveillanceSchedule) {
		model.setSurveillanceSchedule(surveillanceSchedule);
	}

	/**
	 * Sets the telephone of this ncbj org detail info.
	 *
	 * @param telephone the telephone of this ncbj org detail info
	 */
	@Override
	public void setTelephone(String telephone) {
		model.setTelephone(telephone);
	}

	/**
	 * Sets the transfer reason of this ncbj org detail info.
	 *
	 * @param transferReason the transfer reason of this ncbj org detail info
	 */
	@Override
	public void setTransferReason(String transferReason) {
		model.setTransferReason(transferReason);
	}

	/**
	 * Sets the user ID of this ncbj org detail info.
	 *
	 * @param userId the user ID of this ncbj org detail info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj org detail info.
	 *
	 * @param userName the user name of this ncbj org detail info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj org detail info.
	 *
	 * @param userUuid the user uuid of this ncbj org detail info
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
	protected NcbjOrgDetailInfoWrapper wrap(
		NcbjOrgDetailInfo ncbjOrgDetailInfo) {

		return new NcbjOrgDetailInfoWrapper(ncbjOrgDetailInfo);
	}

}