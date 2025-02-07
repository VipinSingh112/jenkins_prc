/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OgtClaimToSpouse}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OgtClaimToSpouse
 * @generated
 */
public class OgtClaimToSpouseWrapper
	extends BaseModelWrapper<OgtClaimToSpouse>
	implements ModelWrapper<OgtClaimToSpouse>, OgtClaimToSpouse {

	public OgtClaimToSpouseWrapper(OgtClaimToSpouse ogtClaimToSpouse) {
		super(ogtClaimToSpouse);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ogtClaimToSpouseId", getOgtClaimToSpouseId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("spouseDate", getSpouseDate());
		attributes.put("claimSpouseDesc", getClaimSpouseDesc());
		attributes.put("nameCompletionForm", getNameCompletionForm());
		attributes.put("nameCompletionDate", getNameCompletionDate());
		attributes.put("compPersonAddress", getCompPersonAddress());
		attributes.put("justicePeaceParish", getJusticePeaceParish());
		attributes.put("nameJusticeOfPeace", getNameJusticeOfPeace());
		attributes.put("nameJusticeDate", getNameJusticeDate());
		attributes.put("officialAmtClaim", getOfficialAmtClaim());
		attributes.put("officialSection", getOfficialSection());
		attributes.put("officialAmtVoting", getOfficialAmtVoting());
		attributes.put("officialAmtVotingDate", getOfficialAmtVotingDate());
		attributes.put("officialPayment", getOfficialPayment());
		attributes.put("officialPaymentDate", getOfficialPaymentDate());
		attributes.put("ogtApplicationId", getOgtApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ogtClaimToSpouseId = (Long)attributes.get("ogtClaimToSpouseId");

		if (ogtClaimToSpouseId != null) {
			setOgtClaimToSpouseId(ogtClaimToSpouseId);
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

		Date spouseDate = (Date)attributes.get("spouseDate");

		if (spouseDate != null) {
			setSpouseDate(spouseDate);
		}

		String claimSpouseDesc = (String)attributes.get("claimSpouseDesc");

		if (claimSpouseDesc != null) {
			setClaimSpouseDesc(claimSpouseDesc);
		}

		String nameCompletionForm = (String)attributes.get(
			"nameCompletionForm");

		if (nameCompletionForm != null) {
			setNameCompletionForm(nameCompletionForm);
		}

		Date nameCompletionDate = (Date)attributes.get("nameCompletionDate");

		if (nameCompletionDate != null) {
			setNameCompletionDate(nameCompletionDate);
		}

		String compPersonAddress = (String)attributes.get("compPersonAddress");

		if (compPersonAddress != null) {
			setCompPersonAddress(compPersonAddress);
		}

		String justicePeaceParish = (String)attributes.get(
			"justicePeaceParish");

		if (justicePeaceParish != null) {
			setJusticePeaceParish(justicePeaceParish);
		}

		String nameJusticeOfPeace = (String)attributes.get(
			"nameJusticeOfPeace");

		if (nameJusticeOfPeace != null) {
			setNameJusticeOfPeace(nameJusticeOfPeace);
		}

		Date nameJusticeDate = (Date)attributes.get("nameJusticeDate");

		if (nameJusticeDate != null) {
			setNameJusticeDate(nameJusticeDate);
		}

		String officialAmtClaim = (String)attributes.get("officialAmtClaim");

		if (officialAmtClaim != null) {
			setOfficialAmtClaim(officialAmtClaim);
		}

		String officialSection = (String)attributes.get("officialSection");

		if (officialSection != null) {
			setOfficialSection(officialSection);
		}

		String officialAmtVoting = (String)attributes.get("officialAmtVoting");

		if (officialAmtVoting != null) {
			setOfficialAmtVoting(officialAmtVoting);
		}

		Date officialAmtVotingDate = (Date)attributes.get(
			"officialAmtVotingDate");

		if (officialAmtVotingDate != null) {
			setOfficialAmtVotingDate(officialAmtVotingDate);
		}

		String officialPayment = (String)attributes.get("officialPayment");

		if (officialPayment != null) {
			setOfficialPayment(officialPayment);
		}

		Date officialPaymentDate = (Date)attributes.get("officialPaymentDate");

		if (officialPaymentDate != null) {
			setOfficialPaymentDate(officialPaymentDate);
		}

		Long ogtApplicationId = (Long)attributes.get("ogtApplicationId");

		if (ogtApplicationId != null) {
			setOgtApplicationId(ogtApplicationId);
		}
	}

	@Override
	public OgtClaimToSpouse cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the claim spouse desc of this ogt claim to spouse.
	 *
	 * @return the claim spouse desc of this ogt claim to spouse
	 */
	@Override
	public String getClaimSpouseDesc() {
		return model.getClaimSpouseDesc();
	}

	/**
	 * Returns the company ID of this ogt claim to spouse.
	 *
	 * @return the company ID of this ogt claim to spouse
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the comp person address of this ogt claim to spouse.
	 *
	 * @return the comp person address of this ogt claim to spouse
	 */
	@Override
	public String getCompPersonAddress() {
		return model.getCompPersonAddress();
	}

	/**
	 * Returns the create date of this ogt claim to spouse.
	 *
	 * @return the create date of this ogt claim to spouse
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this ogt claim to spouse.
	 *
	 * @return the group ID of this ogt claim to spouse
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the justice peace parish of this ogt claim to spouse.
	 *
	 * @return the justice peace parish of this ogt claim to spouse
	 */
	@Override
	public String getJusticePeaceParish() {
		return model.getJusticePeaceParish();
	}

	/**
	 * Returns the modified date of this ogt claim to spouse.
	 *
	 * @return the modified date of this ogt claim to spouse
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name completion date of this ogt claim to spouse.
	 *
	 * @return the name completion date of this ogt claim to spouse
	 */
	@Override
	public Date getNameCompletionDate() {
		return model.getNameCompletionDate();
	}

	/**
	 * Returns the name completion form of this ogt claim to spouse.
	 *
	 * @return the name completion form of this ogt claim to spouse
	 */
	@Override
	public String getNameCompletionForm() {
		return model.getNameCompletionForm();
	}

	/**
	 * Returns the name justice date of this ogt claim to spouse.
	 *
	 * @return the name justice date of this ogt claim to spouse
	 */
	@Override
	public Date getNameJusticeDate() {
		return model.getNameJusticeDate();
	}

	/**
	 * Returns the name justice of peace of this ogt claim to spouse.
	 *
	 * @return the name justice of peace of this ogt claim to spouse
	 */
	@Override
	public String getNameJusticeOfPeace() {
		return model.getNameJusticeOfPeace();
	}

	/**
	 * Returns the official amt claim of this ogt claim to spouse.
	 *
	 * @return the official amt claim of this ogt claim to spouse
	 */
	@Override
	public String getOfficialAmtClaim() {
		return model.getOfficialAmtClaim();
	}

	/**
	 * Returns the official amt voting of this ogt claim to spouse.
	 *
	 * @return the official amt voting of this ogt claim to spouse
	 */
	@Override
	public String getOfficialAmtVoting() {
		return model.getOfficialAmtVoting();
	}

	/**
	 * Returns the official amt voting date of this ogt claim to spouse.
	 *
	 * @return the official amt voting date of this ogt claim to spouse
	 */
	@Override
	public Date getOfficialAmtVotingDate() {
		return model.getOfficialAmtVotingDate();
	}

	/**
	 * Returns the official payment of this ogt claim to spouse.
	 *
	 * @return the official payment of this ogt claim to spouse
	 */
	@Override
	public String getOfficialPayment() {
		return model.getOfficialPayment();
	}

	/**
	 * Returns the official payment date of this ogt claim to spouse.
	 *
	 * @return the official payment date of this ogt claim to spouse
	 */
	@Override
	public Date getOfficialPaymentDate() {
		return model.getOfficialPaymentDate();
	}

	/**
	 * Returns the official section of this ogt claim to spouse.
	 *
	 * @return the official section of this ogt claim to spouse
	 */
	@Override
	public String getOfficialSection() {
		return model.getOfficialSection();
	}

	/**
	 * Returns the ogt application ID of this ogt claim to spouse.
	 *
	 * @return the ogt application ID of this ogt claim to spouse
	 */
	@Override
	public long getOgtApplicationId() {
		return model.getOgtApplicationId();
	}

	/**
	 * Returns the ogt claim to spouse ID of this ogt claim to spouse.
	 *
	 * @return the ogt claim to spouse ID of this ogt claim to spouse
	 */
	@Override
	public long getOgtClaimToSpouseId() {
		return model.getOgtClaimToSpouseId();
	}

	/**
	 * Returns the primary key of this ogt claim to spouse.
	 *
	 * @return the primary key of this ogt claim to spouse
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the spouse date of this ogt claim to spouse.
	 *
	 * @return the spouse date of this ogt claim to spouse
	 */
	@Override
	public Date getSpouseDate() {
		return model.getSpouseDate();
	}

	/**
	 * Returns the user ID of this ogt claim to spouse.
	 *
	 * @return the user ID of this ogt claim to spouse
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ogt claim to spouse.
	 *
	 * @return the user name of this ogt claim to spouse
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ogt claim to spouse.
	 *
	 * @return the user uuid of this ogt claim to spouse
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
	 * Sets the claim spouse desc of this ogt claim to spouse.
	 *
	 * @param claimSpouseDesc the claim spouse desc of this ogt claim to spouse
	 */
	@Override
	public void setClaimSpouseDesc(String claimSpouseDesc) {
		model.setClaimSpouseDesc(claimSpouseDesc);
	}

	/**
	 * Sets the company ID of this ogt claim to spouse.
	 *
	 * @param companyId the company ID of this ogt claim to spouse
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the comp person address of this ogt claim to spouse.
	 *
	 * @param compPersonAddress the comp person address of this ogt claim to spouse
	 */
	@Override
	public void setCompPersonAddress(String compPersonAddress) {
		model.setCompPersonAddress(compPersonAddress);
	}

	/**
	 * Sets the create date of this ogt claim to spouse.
	 *
	 * @param createDate the create date of this ogt claim to spouse
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this ogt claim to spouse.
	 *
	 * @param groupId the group ID of this ogt claim to spouse
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the justice peace parish of this ogt claim to spouse.
	 *
	 * @param justicePeaceParish the justice peace parish of this ogt claim to spouse
	 */
	@Override
	public void setJusticePeaceParish(String justicePeaceParish) {
		model.setJusticePeaceParish(justicePeaceParish);
	}

	/**
	 * Sets the modified date of this ogt claim to spouse.
	 *
	 * @param modifiedDate the modified date of this ogt claim to spouse
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name completion date of this ogt claim to spouse.
	 *
	 * @param nameCompletionDate the name completion date of this ogt claim to spouse
	 */
	@Override
	public void setNameCompletionDate(Date nameCompletionDate) {
		model.setNameCompletionDate(nameCompletionDate);
	}

	/**
	 * Sets the name completion form of this ogt claim to spouse.
	 *
	 * @param nameCompletionForm the name completion form of this ogt claim to spouse
	 */
	@Override
	public void setNameCompletionForm(String nameCompletionForm) {
		model.setNameCompletionForm(nameCompletionForm);
	}

	/**
	 * Sets the name justice date of this ogt claim to spouse.
	 *
	 * @param nameJusticeDate the name justice date of this ogt claim to spouse
	 */
	@Override
	public void setNameJusticeDate(Date nameJusticeDate) {
		model.setNameJusticeDate(nameJusticeDate);
	}

	/**
	 * Sets the name justice of peace of this ogt claim to spouse.
	 *
	 * @param nameJusticeOfPeace the name justice of peace of this ogt claim to spouse
	 */
	@Override
	public void setNameJusticeOfPeace(String nameJusticeOfPeace) {
		model.setNameJusticeOfPeace(nameJusticeOfPeace);
	}

	/**
	 * Sets the official amt claim of this ogt claim to spouse.
	 *
	 * @param officialAmtClaim the official amt claim of this ogt claim to spouse
	 */
	@Override
	public void setOfficialAmtClaim(String officialAmtClaim) {
		model.setOfficialAmtClaim(officialAmtClaim);
	}

	/**
	 * Sets the official amt voting of this ogt claim to spouse.
	 *
	 * @param officialAmtVoting the official amt voting of this ogt claim to spouse
	 */
	@Override
	public void setOfficialAmtVoting(String officialAmtVoting) {
		model.setOfficialAmtVoting(officialAmtVoting);
	}

	/**
	 * Sets the official amt voting date of this ogt claim to spouse.
	 *
	 * @param officialAmtVotingDate the official amt voting date of this ogt claim to spouse
	 */
	@Override
	public void setOfficialAmtVotingDate(Date officialAmtVotingDate) {
		model.setOfficialAmtVotingDate(officialAmtVotingDate);
	}

	/**
	 * Sets the official payment of this ogt claim to spouse.
	 *
	 * @param officialPayment the official payment of this ogt claim to spouse
	 */
	@Override
	public void setOfficialPayment(String officialPayment) {
		model.setOfficialPayment(officialPayment);
	}

	/**
	 * Sets the official payment date of this ogt claim to spouse.
	 *
	 * @param officialPaymentDate the official payment date of this ogt claim to spouse
	 */
	@Override
	public void setOfficialPaymentDate(Date officialPaymentDate) {
		model.setOfficialPaymentDate(officialPaymentDate);
	}

	/**
	 * Sets the official section of this ogt claim to spouse.
	 *
	 * @param officialSection the official section of this ogt claim to spouse
	 */
	@Override
	public void setOfficialSection(String officialSection) {
		model.setOfficialSection(officialSection);
	}

	/**
	 * Sets the ogt application ID of this ogt claim to spouse.
	 *
	 * @param ogtApplicationId the ogt application ID of this ogt claim to spouse
	 */
	@Override
	public void setOgtApplicationId(long ogtApplicationId) {
		model.setOgtApplicationId(ogtApplicationId);
	}

	/**
	 * Sets the ogt claim to spouse ID of this ogt claim to spouse.
	 *
	 * @param ogtClaimToSpouseId the ogt claim to spouse ID of this ogt claim to spouse
	 */
	@Override
	public void setOgtClaimToSpouseId(long ogtClaimToSpouseId) {
		model.setOgtClaimToSpouseId(ogtClaimToSpouseId);
	}

	/**
	 * Sets the primary key of this ogt claim to spouse.
	 *
	 * @param primaryKey the primary key of this ogt claim to spouse
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the spouse date of this ogt claim to spouse.
	 *
	 * @param spouseDate the spouse date of this ogt claim to spouse
	 */
	@Override
	public void setSpouseDate(Date spouseDate) {
		model.setSpouseDate(spouseDate);
	}

	/**
	 * Sets the user ID of this ogt claim to spouse.
	 *
	 * @param userId the user ID of this ogt claim to spouse
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ogt claim to spouse.
	 *
	 * @param userName the user name of this ogt claim to spouse
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ogt claim to spouse.
	 *
	 * @param userUuid the user uuid of this ogt claim to spouse
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
	protected OgtClaimToSpouseWrapper wrap(OgtClaimToSpouse ogtClaimToSpouse) {
		return new OgtClaimToSpouseWrapper(ogtClaimToSpouse);
	}

}