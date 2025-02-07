/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QuarryTransferApplicantInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryTransferApplicantInfo
 * @generated
 */
public class QuarryTransferApplicantInfoWrapper
	extends BaseModelWrapper<QuarryTransferApplicantInfo>
	implements ModelWrapper<QuarryTransferApplicantInfo>,
			   QuarryTransferApplicantInfo {

	public QuarryTransferApplicantInfoWrapper(
		QuarryTransferApplicantInfo quarryTransferApplicantInfo) {

		super(quarryTransferApplicantInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("quarryTransferInfoId", getQuarryTransferInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("transferCompanyName", getTransferCompanyName());
		attributes.put("transferLicenceNumber", getTransferLicenceNumber());
		attributes.put("transferLicenseLease", getTransferLicenseLease());
		attributes.put("transferLeaseReason", getTransferLeaseReason());
		attributes.put("nameOfApplicant", getNameOfApplicant());
		attributes.put("telephone", getTelephone());
		attributes.put("email", getEmail());
		attributes.put("nationalityOfApplicant", getNationalityOfApplicant());
		attributes.put("addressInJamaica", getAddressInJamaica());
		attributes.put("nameOfDirector", getNameOfDirector());
		attributes.put("nationalityOfDirector", getNationalityOfDirector());
		attributes.put("dateOfTransfer", getDateOfTransfer());
		attributes.put("trnAndTcc", getTrnAndTcc());
		attributes.put("quarryApplicationId", getQuarryApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long quarryTransferInfoId = (Long)attributes.get(
			"quarryTransferInfoId");

		if (quarryTransferInfoId != null) {
			setQuarryTransferInfoId(quarryTransferInfoId);
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

		String transferCompanyName = (String)attributes.get(
			"transferCompanyName");

		if (transferCompanyName != null) {
			setTransferCompanyName(transferCompanyName);
		}

		String transferLicenceNumber = (String)attributes.get(
			"transferLicenceNumber");

		if (transferLicenceNumber != null) {
			setTransferLicenceNumber(transferLicenceNumber);
		}

		String transferLicenseLease = (String)attributes.get(
			"transferLicenseLease");

		if (transferLicenseLease != null) {
			setTransferLicenseLease(transferLicenseLease);
		}

		String transferLeaseReason = (String)attributes.get(
			"transferLeaseReason");

		if (transferLeaseReason != null) {
			setTransferLeaseReason(transferLeaseReason);
		}

		String nameOfApplicant = (String)attributes.get("nameOfApplicant");

		if (nameOfApplicant != null) {
			setNameOfApplicant(nameOfApplicant);
		}

		String telephone = (String)attributes.get("telephone");

		if (telephone != null) {
			setTelephone(telephone);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String nationalityOfApplicant = (String)attributes.get(
			"nationalityOfApplicant");

		if (nationalityOfApplicant != null) {
			setNationalityOfApplicant(nationalityOfApplicant);
		}

		String addressInJamaica = (String)attributes.get("addressInJamaica");

		if (addressInJamaica != null) {
			setAddressInJamaica(addressInJamaica);
		}

		String nameOfDirector = (String)attributes.get("nameOfDirector");

		if (nameOfDirector != null) {
			setNameOfDirector(nameOfDirector);
		}

		String nationalityOfDirector = (String)attributes.get(
			"nationalityOfDirector");

		if (nationalityOfDirector != null) {
			setNationalityOfDirector(nationalityOfDirector);
		}

		Date dateOfTransfer = (Date)attributes.get("dateOfTransfer");

		if (dateOfTransfer != null) {
			setDateOfTransfer(dateOfTransfer);
		}

		String trnAndTcc = (String)attributes.get("trnAndTcc");

		if (trnAndTcc != null) {
			setTrnAndTcc(trnAndTcc);
		}

		Long quarryApplicationId = (Long)attributes.get("quarryApplicationId");

		if (quarryApplicationId != null) {
			setQuarryApplicationId(quarryApplicationId);
		}
	}

	@Override
	public QuarryTransferApplicantInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address in jamaica of this quarry transfer applicant info.
	 *
	 * @return the address in jamaica of this quarry transfer applicant info
	 */
	@Override
	public String getAddressInJamaica() {
		return model.getAddressInJamaica();
	}

	/**
	 * Returns the company ID of this quarry transfer applicant info.
	 *
	 * @return the company ID of this quarry transfer applicant info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this quarry transfer applicant info.
	 *
	 * @return the create date of this quarry transfer applicant info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of transfer of this quarry transfer applicant info.
	 *
	 * @return the date of transfer of this quarry transfer applicant info
	 */
	@Override
	public Date getDateOfTransfer() {
		return model.getDateOfTransfer();
	}

	/**
	 * Returns the email of this quarry transfer applicant info.
	 *
	 * @return the email of this quarry transfer applicant info
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the group ID of this quarry transfer applicant info.
	 *
	 * @return the group ID of this quarry transfer applicant info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this quarry transfer applicant info.
	 *
	 * @return the modified date of this quarry transfer applicant info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of applicant of this quarry transfer applicant info.
	 *
	 * @return the name of applicant of this quarry transfer applicant info
	 */
	@Override
	public String getNameOfApplicant() {
		return model.getNameOfApplicant();
	}

	/**
	 * Returns the name of director of this quarry transfer applicant info.
	 *
	 * @return the name of director of this quarry transfer applicant info
	 */
	@Override
	public String getNameOfDirector() {
		return model.getNameOfDirector();
	}

	/**
	 * Returns the nationality of applicant of this quarry transfer applicant info.
	 *
	 * @return the nationality of applicant of this quarry transfer applicant info
	 */
	@Override
	public String getNationalityOfApplicant() {
		return model.getNationalityOfApplicant();
	}

	/**
	 * Returns the nationality of director of this quarry transfer applicant info.
	 *
	 * @return the nationality of director of this quarry transfer applicant info
	 */
	@Override
	public String getNationalityOfDirector() {
		return model.getNationalityOfDirector();
	}

	/**
	 * Returns the primary key of this quarry transfer applicant info.
	 *
	 * @return the primary key of this quarry transfer applicant info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quarry application ID of this quarry transfer applicant info.
	 *
	 * @return the quarry application ID of this quarry transfer applicant info
	 */
	@Override
	public long getQuarryApplicationId() {
		return model.getQuarryApplicationId();
	}

	/**
	 * Returns the quarry transfer info ID of this quarry transfer applicant info.
	 *
	 * @return the quarry transfer info ID of this quarry transfer applicant info
	 */
	@Override
	public long getQuarryTransferInfoId() {
		return model.getQuarryTransferInfoId();
	}

	/**
	 * Returns the telephone of this quarry transfer applicant info.
	 *
	 * @return the telephone of this quarry transfer applicant info
	 */
	@Override
	public String getTelephone() {
		return model.getTelephone();
	}

	/**
	 * Returns the transfer company name of this quarry transfer applicant info.
	 *
	 * @return the transfer company name of this quarry transfer applicant info
	 */
	@Override
	public String getTransferCompanyName() {
		return model.getTransferCompanyName();
	}

	/**
	 * Returns the transfer lease reason of this quarry transfer applicant info.
	 *
	 * @return the transfer lease reason of this quarry transfer applicant info
	 */
	@Override
	public String getTransferLeaseReason() {
		return model.getTransferLeaseReason();
	}

	/**
	 * Returns the transfer licence number of this quarry transfer applicant info.
	 *
	 * @return the transfer licence number of this quarry transfer applicant info
	 */
	@Override
	public String getTransferLicenceNumber() {
		return model.getTransferLicenceNumber();
	}

	/**
	 * Returns the transfer license lease of this quarry transfer applicant info.
	 *
	 * @return the transfer license lease of this quarry transfer applicant info
	 */
	@Override
	public String getTransferLicenseLease() {
		return model.getTransferLicenseLease();
	}

	/**
	 * Returns the trn and tcc of this quarry transfer applicant info.
	 *
	 * @return the trn and tcc of this quarry transfer applicant info
	 */
	@Override
	public String getTrnAndTcc() {
		return model.getTrnAndTcc();
	}

	/**
	 * Returns the user ID of this quarry transfer applicant info.
	 *
	 * @return the user ID of this quarry transfer applicant info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this quarry transfer applicant info.
	 *
	 * @return the user name of this quarry transfer applicant info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this quarry transfer applicant info.
	 *
	 * @return the user uuid of this quarry transfer applicant info
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
	 * Sets the address in jamaica of this quarry transfer applicant info.
	 *
	 * @param addressInJamaica the address in jamaica of this quarry transfer applicant info
	 */
	@Override
	public void setAddressInJamaica(String addressInJamaica) {
		model.setAddressInJamaica(addressInJamaica);
	}

	/**
	 * Sets the company ID of this quarry transfer applicant info.
	 *
	 * @param companyId the company ID of this quarry transfer applicant info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this quarry transfer applicant info.
	 *
	 * @param createDate the create date of this quarry transfer applicant info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of transfer of this quarry transfer applicant info.
	 *
	 * @param dateOfTransfer the date of transfer of this quarry transfer applicant info
	 */
	@Override
	public void setDateOfTransfer(Date dateOfTransfer) {
		model.setDateOfTransfer(dateOfTransfer);
	}

	/**
	 * Sets the email of this quarry transfer applicant info.
	 *
	 * @param email the email of this quarry transfer applicant info
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the group ID of this quarry transfer applicant info.
	 *
	 * @param groupId the group ID of this quarry transfer applicant info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this quarry transfer applicant info.
	 *
	 * @param modifiedDate the modified date of this quarry transfer applicant info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of applicant of this quarry transfer applicant info.
	 *
	 * @param nameOfApplicant the name of applicant of this quarry transfer applicant info
	 */
	@Override
	public void setNameOfApplicant(String nameOfApplicant) {
		model.setNameOfApplicant(nameOfApplicant);
	}

	/**
	 * Sets the name of director of this quarry transfer applicant info.
	 *
	 * @param nameOfDirector the name of director of this quarry transfer applicant info
	 */
	@Override
	public void setNameOfDirector(String nameOfDirector) {
		model.setNameOfDirector(nameOfDirector);
	}

	/**
	 * Sets the nationality of applicant of this quarry transfer applicant info.
	 *
	 * @param nationalityOfApplicant the nationality of applicant of this quarry transfer applicant info
	 */
	@Override
	public void setNationalityOfApplicant(String nationalityOfApplicant) {
		model.setNationalityOfApplicant(nationalityOfApplicant);
	}

	/**
	 * Sets the nationality of director of this quarry transfer applicant info.
	 *
	 * @param nationalityOfDirector the nationality of director of this quarry transfer applicant info
	 */
	@Override
	public void setNationalityOfDirector(String nationalityOfDirector) {
		model.setNationalityOfDirector(nationalityOfDirector);
	}

	/**
	 * Sets the primary key of this quarry transfer applicant info.
	 *
	 * @param primaryKey the primary key of this quarry transfer applicant info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quarry application ID of this quarry transfer applicant info.
	 *
	 * @param quarryApplicationId the quarry application ID of this quarry transfer applicant info
	 */
	@Override
	public void setQuarryApplicationId(long quarryApplicationId) {
		model.setQuarryApplicationId(quarryApplicationId);
	}

	/**
	 * Sets the quarry transfer info ID of this quarry transfer applicant info.
	 *
	 * @param quarryTransferInfoId the quarry transfer info ID of this quarry transfer applicant info
	 */
	@Override
	public void setQuarryTransferInfoId(long quarryTransferInfoId) {
		model.setQuarryTransferInfoId(quarryTransferInfoId);
	}

	/**
	 * Sets the telephone of this quarry transfer applicant info.
	 *
	 * @param telephone the telephone of this quarry transfer applicant info
	 */
	@Override
	public void setTelephone(String telephone) {
		model.setTelephone(telephone);
	}

	/**
	 * Sets the transfer company name of this quarry transfer applicant info.
	 *
	 * @param transferCompanyName the transfer company name of this quarry transfer applicant info
	 */
	@Override
	public void setTransferCompanyName(String transferCompanyName) {
		model.setTransferCompanyName(transferCompanyName);
	}

	/**
	 * Sets the transfer lease reason of this quarry transfer applicant info.
	 *
	 * @param transferLeaseReason the transfer lease reason of this quarry transfer applicant info
	 */
	@Override
	public void setTransferLeaseReason(String transferLeaseReason) {
		model.setTransferLeaseReason(transferLeaseReason);
	}

	/**
	 * Sets the transfer licence number of this quarry transfer applicant info.
	 *
	 * @param transferLicenceNumber the transfer licence number of this quarry transfer applicant info
	 */
	@Override
	public void setTransferLicenceNumber(String transferLicenceNumber) {
		model.setTransferLicenceNumber(transferLicenceNumber);
	}

	/**
	 * Sets the transfer license lease of this quarry transfer applicant info.
	 *
	 * @param transferLicenseLease the transfer license lease of this quarry transfer applicant info
	 */
	@Override
	public void setTransferLicenseLease(String transferLicenseLease) {
		model.setTransferLicenseLease(transferLicenseLease);
	}

	/**
	 * Sets the trn and tcc of this quarry transfer applicant info.
	 *
	 * @param trnAndTcc the trn and tcc of this quarry transfer applicant info
	 */
	@Override
	public void setTrnAndTcc(String trnAndTcc) {
		model.setTrnAndTcc(trnAndTcc);
	}

	/**
	 * Sets the user ID of this quarry transfer applicant info.
	 *
	 * @param userId the user ID of this quarry transfer applicant info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this quarry transfer applicant info.
	 *
	 * @param userName the user name of this quarry transfer applicant info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this quarry transfer applicant info.
	 *
	 * @param userUuid the user uuid of this quarry transfer applicant info
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
	protected QuarryTransferApplicantInfoWrapper wrap(
		QuarryTransferApplicantInfo quarryTransferApplicantInfo) {

		return new QuarryTransferApplicantInfoWrapper(
			quarryTransferApplicantInfo);
	}

}