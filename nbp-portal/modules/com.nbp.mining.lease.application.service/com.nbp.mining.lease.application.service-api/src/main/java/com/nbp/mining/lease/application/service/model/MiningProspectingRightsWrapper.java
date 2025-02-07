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
 * This class is a wrapper for {@link MiningProspectingRights}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingRights
 * @generated
 */
public class MiningProspectingRightsWrapper
	extends BaseModelWrapper<MiningProspectingRights>
	implements MiningProspectingRights, ModelWrapper<MiningProspectingRights> {

	public MiningProspectingRightsWrapper(
		MiningProspectingRights miningProspectingRights) {

		super(miningProspectingRights);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("prospectingRightsId", getProspectingRightsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nameOfApplicant", getNameOfApplicant());
		attributes.put("trnNum", getTrnNum());
		attributes.put("nationalityOfApplicant", getNationalityOfApplicant());
		attributes.put("ageOfApplicant", getAgeOfApplicant());
		attributes.put("telephoneNum", getTelephoneNum());
		attributes.put("emailAddr", getEmailAddr());
		attributes.put("addressInJamaica", getAddressInJamaica());
		attributes.put("applicantProspectAcc", getApplicantProspectAcc());
		attributes.put("otherPersonName", getOtherPersonName());
		attributes.put("otherPersonAddr", getOtherPersonAddr());
		attributes.put("prevApplication", getPrevApplication());
		attributes.put("offenceMiningAct", getOffenceMiningAct());
		attributes.put("validProspectRight", getValidProspectRight());
		attributes.put("surrenderProspectRight", getSurrenderProspectRight());
		attributes.put("prospectRightsFeeCheck", getProspectRightsFeeCheck());
		attributes.put(
			"miningLeaseApplicationId", getMiningLeaseApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long prospectingRightsId = (Long)attributes.get("prospectingRightsId");

		if (prospectingRightsId != null) {
			setProspectingRightsId(prospectingRightsId);
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

		String nameOfApplicant = (String)attributes.get("nameOfApplicant");

		if (nameOfApplicant != null) {
			setNameOfApplicant(nameOfApplicant);
		}

		String trnNum = (String)attributes.get("trnNum");

		if (trnNum != null) {
			setTrnNum(trnNum);
		}

		String nationalityOfApplicant = (String)attributes.get(
			"nationalityOfApplicant");

		if (nationalityOfApplicant != null) {
			setNationalityOfApplicant(nationalityOfApplicant);
		}

		String ageOfApplicant = (String)attributes.get("ageOfApplicant");

		if (ageOfApplicant != null) {
			setAgeOfApplicant(ageOfApplicant);
		}

		String telephoneNum = (String)attributes.get("telephoneNum");

		if (telephoneNum != null) {
			setTelephoneNum(telephoneNum);
		}

		String emailAddr = (String)attributes.get("emailAddr");

		if (emailAddr != null) {
			setEmailAddr(emailAddr);
		}

		String addressInJamaica = (String)attributes.get("addressInJamaica");

		if (addressInJamaica != null) {
			setAddressInJamaica(addressInJamaica);
		}

		String applicantProspectAcc = (String)attributes.get(
			"applicantProspectAcc");

		if (applicantProspectAcc != null) {
			setApplicantProspectAcc(applicantProspectAcc);
		}

		String otherPersonName = (String)attributes.get("otherPersonName");

		if (otherPersonName != null) {
			setOtherPersonName(otherPersonName);
		}

		String otherPersonAddr = (String)attributes.get("otherPersonAddr");

		if (otherPersonAddr != null) {
			setOtherPersonAddr(otherPersonAddr);
		}

		String prevApplication = (String)attributes.get("prevApplication");

		if (prevApplication != null) {
			setPrevApplication(prevApplication);
		}

		String offenceMiningAct = (String)attributes.get("offenceMiningAct");

		if (offenceMiningAct != null) {
			setOffenceMiningAct(offenceMiningAct);
		}

		String validProspectRight = (String)attributes.get(
			"validProspectRight");

		if (validProspectRight != null) {
			setValidProspectRight(validProspectRight);
		}

		String surrenderProspectRight = (String)attributes.get(
			"surrenderProspectRight");

		if (surrenderProspectRight != null) {
			setSurrenderProspectRight(surrenderProspectRight);
		}

		String prospectRightsFeeCheck = (String)attributes.get(
			"prospectRightsFeeCheck");

		if (prospectRightsFeeCheck != null) {
			setProspectRightsFeeCheck(prospectRightsFeeCheck);
		}

		Long miningLeaseApplicationId = (Long)attributes.get(
			"miningLeaseApplicationId");

		if (miningLeaseApplicationId != null) {
			setMiningLeaseApplicationId(miningLeaseApplicationId);
		}
	}

	@Override
	public MiningProspectingRights cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address in jamaica of this mining prospecting rights.
	 *
	 * @return the address in jamaica of this mining prospecting rights
	 */
	@Override
	public String getAddressInJamaica() {
		return model.getAddressInJamaica();
	}

	/**
	 * Returns the age of applicant of this mining prospecting rights.
	 *
	 * @return the age of applicant of this mining prospecting rights
	 */
	@Override
	public String getAgeOfApplicant() {
		return model.getAgeOfApplicant();
	}

	/**
	 * Returns the applicant prospect acc of this mining prospecting rights.
	 *
	 * @return the applicant prospect acc of this mining prospecting rights
	 */
	@Override
	public String getApplicantProspectAcc() {
		return model.getApplicantProspectAcc();
	}

	/**
	 * Returns the company ID of this mining prospecting rights.
	 *
	 * @return the company ID of this mining prospecting rights
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this mining prospecting rights.
	 *
	 * @return the create date of this mining prospecting rights
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email addr of this mining prospecting rights.
	 *
	 * @return the email addr of this mining prospecting rights
	 */
	@Override
	public String getEmailAddr() {
		return model.getEmailAddr();
	}

	/**
	 * Returns the group ID of this mining prospecting rights.
	 *
	 * @return the group ID of this mining prospecting rights
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the mining lease application ID of this mining prospecting rights.
	 *
	 * @return the mining lease application ID of this mining prospecting rights
	 */
	@Override
	public long getMiningLeaseApplicationId() {
		return model.getMiningLeaseApplicationId();
	}

	/**
	 * Returns the modified date of this mining prospecting rights.
	 *
	 * @return the modified date of this mining prospecting rights
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of applicant of this mining prospecting rights.
	 *
	 * @return the name of applicant of this mining prospecting rights
	 */
	@Override
	public String getNameOfApplicant() {
		return model.getNameOfApplicant();
	}

	/**
	 * Returns the nationality of applicant of this mining prospecting rights.
	 *
	 * @return the nationality of applicant of this mining prospecting rights
	 */
	@Override
	public String getNationalityOfApplicant() {
		return model.getNationalityOfApplicant();
	}

	/**
	 * Returns the offence mining act of this mining prospecting rights.
	 *
	 * @return the offence mining act of this mining prospecting rights
	 */
	@Override
	public String getOffenceMiningAct() {
		return model.getOffenceMiningAct();
	}

	/**
	 * Returns the other person addr of this mining prospecting rights.
	 *
	 * @return the other person addr of this mining prospecting rights
	 */
	@Override
	public String getOtherPersonAddr() {
		return model.getOtherPersonAddr();
	}

	/**
	 * Returns the other person name of this mining prospecting rights.
	 *
	 * @return the other person name of this mining prospecting rights
	 */
	@Override
	public String getOtherPersonName() {
		return model.getOtherPersonName();
	}

	/**
	 * Returns the prev application of this mining prospecting rights.
	 *
	 * @return the prev application of this mining prospecting rights
	 */
	@Override
	public String getPrevApplication() {
		return model.getPrevApplication();
	}

	/**
	 * Returns the primary key of this mining prospecting rights.
	 *
	 * @return the primary key of this mining prospecting rights
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the prospecting rights ID of this mining prospecting rights.
	 *
	 * @return the prospecting rights ID of this mining prospecting rights
	 */
	@Override
	public long getProspectingRightsId() {
		return model.getProspectingRightsId();
	}

	/**
	 * Returns the prospect rights fee check of this mining prospecting rights.
	 *
	 * @return the prospect rights fee check of this mining prospecting rights
	 */
	@Override
	public String getProspectRightsFeeCheck() {
		return model.getProspectRightsFeeCheck();
	}

	/**
	 * Returns the surrender prospect right of this mining prospecting rights.
	 *
	 * @return the surrender prospect right of this mining prospecting rights
	 */
	@Override
	public String getSurrenderProspectRight() {
		return model.getSurrenderProspectRight();
	}

	/**
	 * Returns the telephone num of this mining prospecting rights.
	 *
	 * @return the telephone num of this mining prospecting rights
	 */
	@Override
	public String getTelephoneNum() {
		return model.getTelephoneNum();
	}

	/**
	 * Returns the trn num of this mining prospecting rights.
	 *
	 * @return the trn num of this mining prospecting rights
	 */
	@Override
	public String getTrnNum() {
		return model.getTrnNum();
	}

	/**
	 * Returns the user ID of this mining prospecting rights.
	 *
	 * @return the user ID of this mining prospecting rights
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this mining prospecting rights.
	 *
	 * @return the user name of this mining prospecting rights
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this mining prospecting rights.
	 *
	 * @return the user uuid of this mining prospecting rights
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the valid prospect right of this mining prospecting rights.
	 *
	 * @return the valid prospect right of this mining prospecting rights
	 */
	@Override
	public String getValidProspectRight() {
		return model.getValidProspectRight();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the address in jamaica of this mining prospecting rights.
	 *
	 * @param addressInJamaica the address in jamaica of this mining prospecting rights
	 */
	@Override
	public void setAddressInJamaica(String addressInJamaica) {
		model.setAddressInJamaica(addressInJamaica);
	}

	/**
	 * Sets the age of applicant of this mining prospecting rights.
	 *
	 * @param ageOfApplicant the age of applicant of this mining prospecting rights
	 */
	@Override
	public void setAgeOfApplicant(String ageOfApplicant) {
		model.setAgeOfApplicant(ageOfApplicant);
	}

	/**
	 * Sets the applicant prospect acc of this mining prospecting rights.
	 *
	 * @param applicantProspectAcc the applicant prospect acc of this mining prospecting rights
	 */
	@Override
	public void setApplicantProspectAcc(String applicantProspectAcc) {
		model.setApplicantProspectAcc(applicantProspectAcc);
	}

	/**
	 * Sets the company ID of this mining prospecting rights.
	 *
	 * @param companyId the company ID of this mining prospecting rights
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this mining prospecting rights.
	 *
	 * @param createDate the create date of this mining prospecting rights
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email addr of this mining prospecting rights.
	 *
	 * @param emailAddr the email addr of this mining prospecting rights
	 */
	@Override
	public void setEmailAddr(String emailAddr) {
		model.setEmailAddr(emailAddr);
	}

	/**
	 * Sets the group ID of this mining prospecting rights.
	 *
	 * @param groupId the group ID of this mining prospecting rights
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the mining lease application ID of this mining prospecting rights.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID of this mining prospecting rights
	 */
	@Override
	public void setMiningLeaseApplicationId(long miningLeaseApplicationId) {
		model.setMiningLeaseApplicationId(miningLeaseApplicationId);
	}

	/**
	 * Sets the modified date of this mining prospecting rights.
	 *
	 * @param modifiedDate the modified date of this mining prospecting rights
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of applicant of this mining prospecting rights.
	 *
	 * @param nameOfApplicant the name of applicant of this mining prospecting rights
	 */
	@Override
	public void setNameOfApplicant(String nameOfApplicant) {
		model.setNameOfApplicant(nameOfApplicant);
	}

	/**
	 * Sets the nationality of applicant of this mining prospecting rights.
	 *
	 * @param nationalityOfApplicant the nationality of applicant of this mining prospecting rights
	 */
	@Override
	public void setNationalityOfApplicant(String nationalityOfApplicant) {
		model.setNationalityOfApplicant(nationalityOfApplicant);
	}

	/**
	 * Sets the offence mining act of this mining prospecting rights.
	 *
	 * @param offenceMiningAct the offence mining act of this mining prospecting rights
	 */
	@Override
	public void setOffenceMiningAct(String offenceMiningAct) {
		model.setOffenceMiningAct(offenceMiningAct);
	}

	/**
	 * Sets the other person addr of this mining prospecting rights.
	 *
	 * @param otherPersonAddr the other person addr of this mining prospecting rights
	 */
	@Override
	public void setOtherPersonAddr(String otherPersonAddr) {
		model.setOtherPersonAddr(otherPersonAddr);
	}

	/**
	 * Sets the other person name of this mining prospecting rights.
	 *
	 * @param otherPersonName the other person name of this mining prospecting rights
	 */
	@Override
	public void setOtherPersonName(String otherPersonName) {
		model.setOtherPersonName(otherPersonName);
	}

	/**
	 * Sets the prev application of this mining prospecting rights.
	 *
	 * @param prevApplication the prev application of this mining prospecting rights
	 */
	@Override
	public void setPrevApplication(String prevApplication) {
		model.setPrevApplication(prevApplication);
	}

	/**
	 * Sets the primary key of this mining prospecting rights.
	 *
	 * @param primaryKey the primary key of this mining prospecting rights
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the prospecting rights ID of this mining prospecting rights.
	 *
	 * @param prospectingRightsId the prospecting rights ID of this mining prospecting rights
	 */
	@Override
	public void setProspectingRightsId(long prospectingRightsId) {
		model.setProspectingRightsId(prospectingRightsId);
	}

	/**
	 * Sets the prospect rights fee check of this mining prospecting rights.
	 *
	 * @param prospectRightsFeeCheck the prospect rights fee check of this mining prospecting rights
	 */
	@Override
	public void setProspectRightsFeeCheck(String prospectRightsFeeCheck) {
		model.setProspectRightsFeeCheck(prospectRightsFeeCheck);
	}

	/**
	 * Sets the surrender prospect right of this mining prospecting rights.
	 *
	 * @param surrenderProspectRight the surrender prospect right of this mining prospecting rights
	 */
	@Override
	public void setSurrenderProspectRight(String surrenderProspectRight) {
		model.setSurrenderProspectRight(surrenderProspectRight);
	}

	/**
	 * Sets the telephone num of this mining prospecting rights.
	 *
	 * @param telephoneNum the telephone num of this mining prospecting rights
	 */
	@Override
	public void setTelephoneNum(String telephoneNum) {
		model.setTelephoneNum(telephoneNum);
	}

	/**
	 * Sets the trn num of this mining prospecting rights.
	 *
	 * @param trnNum the trn num of this mining prospecting rights
	 */
	@Override
	public void setTrnNum(String trnNum) {
		model.setTrnNum(trnNum);
	}

	/**
	 * Sets the user ID of this mining prospecting rights.
	 *
	 * @param userId the user ID of this mining prospecting rights
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this mining prospecting rights.
	 *
	 * @param userName the user name of this mining prospecting rights
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this mining prospecting rights.
	 *
	 * @param userUuid the user uuid of this mining prospecting rights
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the valid prospect right of this mining prospecting rights.
	 *
	 * @param validProspectRight the valid prospect right of this mining prospecting rights
	 */
	@Override
	public void setValidProspectRight(String validProspectRight) {
		model.setValidProspectRight(validProspectRight);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected MiningProspectingRightsWrapper wrap(
		MiningProspectingRights miningProspectingRights) {

		return new MiningProspectingRightsWrapper(miningProspectingRights);
	}

}