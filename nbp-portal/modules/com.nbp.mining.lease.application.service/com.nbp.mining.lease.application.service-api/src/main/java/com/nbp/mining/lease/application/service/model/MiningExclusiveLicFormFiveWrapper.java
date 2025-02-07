/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MiningExclusiveLicFormFive}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningExclusiveLicFormFive
 * @generated
 */
public class MiningExclusiveLicFormFiveWrapper
	extends BaseModelWrapper<MiningExclusiveLicFormFive>
	implements MiningExclusiveLicFormFive,
			   ModelWrapper<MiningExclusiveLicFormFive> {

	public MiningExclusiveLicFormFiveWrapper(
		MiningExclusiveLicFormFive miningExclusiveLicFormFive) {

		super(miningExclusiveLicFormFive);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"miningExclusiveLicFormFiveId", getMiningExclusiveLicFormFiveId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicantNameLicence", getApplicantNameLicence());
		attributes.put("trnNumberLicence", getTrnNumberLicence());
		attributes.put(
			"applicantNationalityLicence", getApplicantNationalityLicence());
		attributes.put("applicantAddressLicence", getApplicantAddressLicence());
		attributes.put(
			"applicantTelephoneLicence", getApplicantTelephoneLicence());
		attributes.put("applicantEmailLicence", getApplicantEmailLicence());
		attributes.put("applicantNumberLicence", getApplicantNumberLicence());
		attributes.put("agentNameLicence", getAgentNameLicence());
		attributes.put("numProspectingLicence", getNumProspectingLicence());
		attributes.put("agentNameLicenceGrant", getAgentNameLicenceGrant());
		attributes.put("applicantLicence", getApplicantLicence());
		attributes.put("justicePeaceParish", getJusticePeaceParish());
		attributes.put(
			"applicantLandmarkLicence", getApplicantLandmarkLicence());
		attributes.put("applicantAreaLicence", getApplicantAreaLicence());
		attributes.put("applicantDesires", getApplicantDesires());
		attributes.put("dateLocationLic", getDateLocationLic());
		attributes.put("incorporationLodged", getIncorporationLodged());
		attributes.put(
			"miningLeaseApplicationId", getMiningLeaseApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long miningExclusiveLicFormFiveId = (Long)attributes.get(
			"miningExclusiveLicFormFiveId");

		if (miningExclusiveLicFormFiveId != null) {
			setMiningExclusiveLicFormFiveId(miningExclusiveLicFormFiveId);
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

		String applicantNameLicence = (String)attributes.get(
			"applicantNameLicence");

		if (applicantNameLicence != null) {
			setApplicantNameLicence(applicantNameLicence);
		}

		String trnNumberLicence = (String)attributes.get("trnNumberLicence");

		if (trnNumberLicence != null) {
			setTrnNumberLicence(trnNumberLicence);
		}

		String applicantNationalityLicence = (String)attributes.get(
			"applicantNationalityLicence");

		if (applicantNationalityLicence != null) {
			setApplicantNationalityLicence(applicantNationalityLicence);
		}

		String applicantAddressLicence = (String)attributes.get(
			"applicantAddressLicence");

		if (applicantAddressLicence != null) {
			setApplicantAddressLicence(applicantAddressLicence);
		}

		String applicantTelephoneLicence = (String)attributes.get(
			"applicantTelephoneLicence");

		if (applicantTelephoneLicence != null) {
			setApplicantTelephoneLicence(applicantTelephoneLicence);
		}

		String applicantEmailLicence = (String)attributes.get(
			"applicantEmailLicence");

		if (applicantEmailLicence != null) {
			setApplicantEmailLicence(applicantEmailLicence);
		}

		String applicantNumberLicence = (String)attributes.get(
			"applicantNumberLicence");

		if (applicantNumberLicence != null) {
			setApplicantNumberLicence(applicantNumberLicence);
		}

		String agentNameLicence = (String)attributes.get("agentNameLicence");

		if (agentNameLicence != null) {
			setAgentNameLicence(agentNameLicence);
		}

		String numProspectingLicence = (String)attributes.get(
			"numProspectingLicence");

		if (numProspectingLicence != null) {
			setNumProspectingLicence(numProspectingLicence);
		}

		String agentNameLicenceGrant = (String)attributes.get(
			"agentNameLicenceGrant");

		if (agentNameLicenceGrant != null) {
			setAgentNameLicenceGrant(agentNameLicenceGrant);
		}

		String applicantLicence = (String)attributes.get("applicantLicence");

		if (applicantLicence != null) {
			setApplicantLicence(applicantLicence);
		}

		String justicePeaceParish = (String)attributes.get(
			"justicePeaceParish");

		if (justicePeaceParish != null) {
			setJusticePeaceParish(justicePeaceParish);
		}

		String applicantLandmarkLicence = (String)attributes.get(
			"applicantLandmarkLicence");

		if (applicantLandmarkLicence != null) {
			setApplicantLandmarkLicence(applicantLandmarkLicence);
		}

		String applicantAreaLicence = (String)attributes.get(
			"applicantAreaLicence");

		if (applicantAreaLicence != null) {
			setApplicantAreaLicence(applicantAreaLicence);
		}

		String applicantDesires = (String)attributes.get("applicantDesires");

		if (applicantDesires != null) {
			setApplicantDesires(applicantDesires);
		}

		Date dateLocationLic = (Date)attributes.get("dateLocationLic");

		if (dateLocationLic != null) {
			setDateLocationLic(dateLocationLic);
		}

		String incorporationLodged = (String)attributes.get(
			"incorporationLodged");

		if (incorporationLodged != null) {
			setIncorporationLodged(incorporationLodged);
		}

		Long miningLeaseApplicationId = (Long)attributes.get(
			"miningLeaseApplicationId");

		if (miningLeaseApplicationId != null) {
			setMiningLeaseApplicationId(miningLeaseApplicationId);
		}
	}

	@Override
	public MiningExclusiveLicFormFive cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the agent name licence of this mining exclusive lic form five.
	 *
	 * @return the agent name licence of this mining exclusive lic form five
	 */
	@Override
	public String getAgentNameLicence() {
		return model.getAgentNameLicence();
	}

	/**
	 * Returns the agent name licence grant of this mining exclusive lic form five.
	 *
	 * @return the agent name licence grant of this mining exclusive lic form five
	 */
	@Override
	public String getAgentNameLicenceGrant() {
		return model.getAgentNameLicenceGrant();
	}

	/**
	 * Returns the applicant address licence of this mining exclusive lic form five.
	 *
	 * @return the applicant address licence of this mining exclusive lic form five
	 */
	@Override
	public String getApplicantAddressLicence() {
		return model.getApplicantAddressLicence();
	}

	/**
	 * Returns the applicant area licence of this mining exclusive lic form five.
	 *
	 * @return the applicant area licence of this mining exclusive lic form five
	 */
	@Override
	public String getApplicantAreaLicence() {
		return model.getApplicantAreaLicence();
	}

	/**
	 * Returns the applicant desires of this mining exclusive lic form five.
	 *
	 * @return the applicant desires of this mining exclusive lic form five
	 */
	@Override
	public String getApplicantDesires() {
		return model.getApplicantDesires();
	}

	/**
	 * Returns the applicant email licence of this mining exclusive lic form five.
	 *
	 * @return the applicant email licence of this mining exclusive lic form five
	 */
	@Override
	public String getApplicantEmailLicence() {
		return model.getApplicantEmailLicence();
	}

	/**
	 * Returns the applicant landmark licence of this mining exclusive lic form five.
	 *
	 * @return the applicant landmark licence of this mining exclusive lic form five
	 */
	@Override
	public String getApplicantLandmarkLicence() {
		return model.getApplicantLandmarkLicence();
	}

	/**
	 * Returns the applicant licence of this mining exclusive lic form five.
	 *
	 * @return the applicant licence of this mining exclusive lic form five
	 */
	@Override
	public String getApplicantLicence() {
		return model.getApplicantLicence();
	}

	/**
	 * Returns the applicant name licence of this mining exclusive lic form five.
	 *
	 * @return the applicant name licence of this mining exclusive lic form five
	 */
	@Override
	public String getApplicantNameLicence() {
		return model.getApplicantNameLicence();
	}

	/**
	 * Returns the applicant nationality licence of this mining exclusive lic form five.
	 *
	 * @return the applicant nationality licence of this mining exclusive lic form five
	 */
	@Override
	public String getApplicantNationalityLicence() {
		return model.getApplicantNationalityLicence();
	}

	/**
	 * Returns the applicant number licence of this mining exclusive lic form five.
	 *
	 * @return the applicant number licence of this mining exclusive lic form five
	 */
	@Override
	public String getApplicantNumberLicence() {
		return model.getApplicantNumberLicence();
	}

	/**
	 * Returns the applicant telephone licence of this mining exclusive lic form five.
	 *
	 * @return the applicant telephone licence of this mining exclusive lic form five
	 */
	@Override
	public String getApplicantTelephoneLicence() {
		return model.getApplicantTelephoneLicence();
	}

	/**
	 * Returns the company ID of this mining exclusive lic form five.
	 *
	 * @return the company ID of this mining exclusive lic form five
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this mining exclusive lic form five.
	 *
	 * @return the create date of this mining exclusive lic form five
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date location lic of this mining exclusive lic form five.
	 *
	 * @return the date location lic of this mining exclusive lic form five
	 */
	@Override
	public Date getDateLocationLic() {
		return model.getDateLocationLic();
	}

	/**
	 * Returns the group ID of this mining exclusive lic form five.
	 *
	 * @return the group ID of this mining exclusive lic form five
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the incorporation lodged of this mining exclusive lic form five.
	 *
	 * @return the incorporation lodged of this mining exclusive lic form five
	 */
	@Override
	public String getIncorporationLodged() {
		return model.getIncorporationLodged();
	}

	/**
	 * Returns the justice peace parish of this mining exclusive lic form five.
	 *
	 * @return the justice peace parish of this mining exclusive lic form five
	 */
	@Override
	public String getJusticePeaceParish() {
		return model.getJusticePeaceParish();
	}

	/**
	 * Returns the mining exclusive lic form five ID of this mining exclusive lic form five.
	 *
	 * @return the mining exclusive lic form five ID of this mining exclusive lic form five
	 */
	@Override
	public long getMiningExclusiveLicFormFiveId() {
		return model.getMiningExclusiveLicFormFiveId();
	}

	/**
	 * Returns the mining lease application ID of this mining exclusive lic form five.
	 *
	 * @return the mining lease application ID of this mining exclusive lic form five
	 */
	@Override
	public long getMiningLeaseApplicationId() {
		return model.getMiningLeaseApplicationId();
	}

	/**
	 * Returns the modified date of this mining exclusive lic form five.
	 *
	 * @return the modified date of this mining exclusive lic form five
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the num prospecting licence of this mining exclusive lic form five.
	 *
	 * @return the num prospecting licence of this mining exclusive lic form five
	 */
	@Override
	public String getNumProspectingLicence() {
		return model.getNumProspectingLicence();
	}

	/**
	 * Returns the primary key of this mining exclusive lic form five.
	 *
	 * @return the primary key of this mining exclusive lic form five
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the trn number licence of this mining exclusive lic form five.
	 *
	 * @return the trn number licence of this mining exclusive lic form five
	 */
	@Override
	public String getTrnNumberLicence() {
		return model.getTrnNumberLicence();
	}

	/**
	 * Returns the user ID of this mining exclusive lic form five.
	 *
	 * @return the user ID of this mining exclusive lic form five
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this mining exclusive lic form five.
	 *
	 * @return the user name of this mining exclusive lic form five
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this mining exclusive lic form five.
	 *
	 * @return the user uuid of this mining exclusive lic form five
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
	 * Sets the agent name licence of this mining exclusive lic form five.
	 *
	 * @param agentNameLicence the agent name licence of this mining exclusive lic form five
	 */
	@Override
	public void setAgentNameLicence(String agentNameLicence) {
		model.setAgentNameLicence(agentNameLicence);
	}

	/**
	 * Sets the agent name licence grant of this mining exclusive lic form five.
	 *
	 * @param agentNameLicenceGrant the agent name licence grant of this mining exclusive lic form five
	 */
	@Override
	public void setAgentNameLicenceGrant(String agentNameLicenceGrant) {
		model.setAgentNameLicenceGrant(agentNameLicenceGrant);
	}

	/**
	 * Sets the applicant address licence of this mining exclusive lic form five.
	 *
	 * @param applicantAddressLicence the applicant address licence of this mining exclusive lic form five
	 */
	@Override
	public void setApplicantAddressLicence(String applicantAddressLicence) {
		model.setApplicantAddressLicence(applicantAddressLicence);
	}

	/**
	 * Sets the applicant area licence of this mining exclusive lic form five.
	 *
	 * @param applicantAreaLicence the applicant area licence of this mining exclusive lic form five
	 */
	@Override
	public void setApplicantAreaLicence(String applicantAreaLicence) {
		model.setApplicantAreaLicence(applicantAreaLicence);
	}

	/**
	 * Sets the applicant desires of this mining exclusive lic form five.
	 *
	 * @param applicantDesires the applicant desires of this mining exclusive lic form five
	 */
	@Override
	public void setApplicantDesires(String applicantDesires) {
		model.setApplicantDesires(applicantDesires);
	}

	/**
	 * Sets the applicant email licence of this mining exclusive lic form five.
	 *
	 * @param applicantEmailLicence the applicant email licence of this mining exclusive lic form five
	 */
	@Override
	public void setApplicantEmailLicence(String applicantEmailLicence) {
		model.setApplicantEmailLicence(applicantEmailLicence);
	}

	/**
	 * Sets the applicant landmark licence of this mining exclusive lic form five.
	 *
	 * @param applicantLandmarkLicence the applicant landmark licence of this mining exclusive lic form five
	 */
	@Override
	public void setApplicantLandmarkLicence(String applicantLandmarkLicence) {
		model.setApplicantLandmarkLicence(applicantLandmarkLicence);
	}

	/**
	 * Sets the applicant licence of this mining exclusive lic form five.
	 *
	 * @param applicantLicence the applicant licence of this mining exclusive lic form five
	 */
	@Override
	public void setApplicantLicence(String applicantLicence) {
		model.setApplicantLicence(applicantLicence);
	}

	/**
	 * Sets the applicant name licence of this mining exclusive lic form five.
	 *
	 * @param applicantNameLicence the applicant name licence of this mining exclusive lic form five
	 */
	@Override
	public void setApplicantNameLicence(String applicantNameLicence) {
		model.setApplicantNameLicence(applicantNameLicence);
	}

	/**
	 * Sets the applicant nationality licence of this mining exclusive lic form five.
	 *
	 * @param applicantNationalityLicence the applicant nationality licence of this mining exclusive lic form five
	 */
	@Override
	public void setApplicantNationalityLicence(
		String applicantNationalityLicence) {

		model.setApplicantNationalityLicence(applicantNationalityLicence);
	}

	/**
	 * Sets the applicant number licence of this mining exclusive lic form five.
	 *
	 * @param applicantNumberLicence the applicant number licence of this mining exclusive lic form five
	 */
	@Override
	public void setApplicantNumberLicence(String applicantNumberLicence) {
		model.setApplicantNumberLicence(applicantNumberLicence);
	}

	/**
	 * Sets the applicant telephone licence of this mining exclusive lic form five.
	 *
	 * @param applicantTelephoneLicence the applicant telephone licence of this mining exclusive lic form five
	 */
	@Override
	public void setApplicantTelephoneLicence(String applicantTelephoneLicence) {
		model.setApplicantTelephoneLicence(applicantTelephoneLicence);
	}

	/**
	 * Sets the company ID of this mining exclusive lic form five.
	 *
	 * @param companyId the company ID of this mining exclusive lic form five
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this mining exclusive lic form five.
	 *
	 * @param createDate the create date of this mining exclusive lic form five
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date location lic of this mining exclusive lic form five.
	 *
	 * @param dateLocationLic the date location lic of this mining exclusive lic form five
	 */
	@Override
	public void setDateLocationLic(Date dateLocationLic) {
		model.setDateLocationLic(dateLocationLic);
	}

	/**
	 * Sets the group ID of this mining exclusive lic form five.
	 *
	 * @param groupId the group ID of this mining exclusive lic form five
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the incorporation lodged of this mining exclusive lic form five.
	 *
	 * @param incorporationLodged the incorporation lodged of this mining exclusive lic form five
	 */
	@Override
	public void setIncorporationLodged(String incorporationLodged) {
		model.setIncorporationLodged(incorporationLodged);
	}

	/**
	 * Sets the justice peace parish of this mining exclusive lic form five.
	 *
	 * @param justicePeaceParish the justice peace parish of this mining exclusive lic form five
	 */
	@Override
	public void setJusticePeaceParish(String justicePeaceParish) {
		model.setJusticePeaceParish(justicePeaceParish);
	}

	/**
	 * Sets the mining exclusive lic form five ID of this mining exclusive lic form five.
	 *
	 * @param miningExclusiveLicFormFiveId the mining exclusive lic form five ID of this mining exclusive lic form five
	 */
	@Override
	public void setMiningExclusiveLicFormFiveId(
		long miningExclusiveLicFormFiveId) {

		model.setMiningExclusiveLicFormFiveId(miningExclusiveLicFormFiveId);
	}

	/**
	 * Sets the mining lease application ID of this mining exclusive lic form five.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID of this mining exclusive lic form five
	 */
	@Override
	public void setMiningLeaseApplicationId(long miningLeaseApplicationId) {
		model.setMiningLeaseApplicationId(miningLeaseApplicationId);
	}

	/**
	 * Sets the modified date of this mining exclusive lic form five.
	 *
	 * @param modifiedDate the modified date of this mining exclusive lic form five
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the num prospecting licence of this mining exclusive lic form five.
	 *
	 * @param numProspectingLicence the num prospecting licence of this mining exclusive lic form five
	 */
	@Override
	public void setNumProspectingLicence(String numProspectingLicence) {
		model.setNumProspectingLicence(numProspectingLicence);
	}

	/**
	 * Sets the primary key of this mining exclusive lic form five.
	 *
	 * @param primaryKey the primary key of this mining exclusive lic form five
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the trn number licence of this mining exclusive lic form five.
	 *
	 * @param trnNumberLicence the trn number licence of this mining exclusive lic form five
	 */
	@Override
	public void setTrnNumberLicence(String trnNumberLicence) {
		model.setTrnNumberLicence(trnNumberLicence);
	}

	/**
	 * Sets the user ID of this mining exclusive lic form five.
	 *
	 * @param userId the user ID of this mining exclusive lic form five
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this mining exclusive lic form five.
	 *
	 * @param userName the user name of this mining exclusive lic form five
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this mining exclusive lic form five.
	 *
	 * @param userUuid the user uuid of this mining exclusive lic form five
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
	protected MiningExclusiveLicFormFiveWrapper wrap(
		MiningExclusiveLicFormFive miningExclusiveLicFormFive) {

		return new MiningExclusiveLicFormFiveWrapper(
			miningExclusiveLicFormFive);
	}

}