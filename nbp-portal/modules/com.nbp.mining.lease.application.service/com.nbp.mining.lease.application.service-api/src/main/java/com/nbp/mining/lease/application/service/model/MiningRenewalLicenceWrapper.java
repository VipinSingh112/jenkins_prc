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
 * This class is a wrapper for {@link MiningRenewalLicence}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningRenewalLicence
 * @generated
 */
public class MiningRenewalLicenceWrapper
	extends BaseModelWrapper<MiningRenewalLicence>
	implements MiningRenewalLicence, ModelWrapper<MiningRenewalLicence> {

	public MiningRenewalLicenceWrapper(
		MiningRenewalLicence miningRenewalLicence) {

		super(miningRenewalLicence);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("miningRenewalLicenceId", getMiningRenewalLicenceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("renewApplicantName", getRenewApplicantName());
		attributes.put("renewTrnNum", getRenewTrnNum());
		attributes.put("renewApplicantLicNum", getRenewApplicantLicNum());
		attributes.put("stateWhetherRenewIs", getStateWhetherRenewIs());
		attributes.put("renewTelephone", getRenewTelephone());
		attributes.put("renewEmailAddr", getRenewEmailAddr());
		attributes.put(
			"renewNumOfApplicantLease", getRenewNumOfApplicantLease());
		attributes.put(
			"renApplicantDesireToMine", getRenApplicantDesireToMine());
		attributes.put("renewTermDesired", getRenewTermDesired());
		attributes.put("renewFeeCheck", getRenewFeeCheck());
		attributes.put("renewDate", getRenewDate());
		attributes.put(
			"miningLeaseApplicationId", getMiningLeaseApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long miningRenewalLicenceId = (Long)attributes.get(
			"miningRenewalLicenceId");

		if (miningRenewalLicenceId != null) {
			setMiningRenewalLicenceId(miningRenewalLicenceId);
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

		String renewApplicantName = (String)attributes.get(
			"renewApplicantName");

		if (renewApplicantName != null) {
			setRenewApplicantName(renewApplicantName);
		}

		String renewTrnNum = (String)attributes.get("renewTrnNum");

		if (renewTrnNum != null) {
			setRenewTrnNum(renewTrnNum);
		}

		String renewApplicantLicNum = (String)attributes.get(
			"renewApplicantLicNum");

		if (renewApplicantLicNum != null) {
			setRenewApplicantLicNum(renewApplicantLicNum);
		}

		String stateWhetherRenewIs = (String)attributes.get(
			"stateWhetherRenewIs");

		if (stateWhetherRenewIs != null) {
			setStateWhetherRenewIs(stateWhetherRenewIs);
		}

		String renewTelephone = (String)attributes.get("renewTelephone");

		if (renewTelephone != null) {
			setRenewTelephone(renewTelephone);
		}

		String renewEmailAddr = (String)attributes.get("renewEmailAddr");

		if (renewEmailAddr != null) {
			setRenewEmailAddr(renewEmailAddr);
		}

		String renewNumOfApplicantLease = (String)attributes.get(
			"renewNumOfApplicantLease");

		if (renewNumOfApplicantLease != null) {
			setRenewNumOfApplicantLease(renewNumOfApplicantLease);
		}

		String renApplicantDesireToMine = (String)attributes.get(
			"renApplicantDesireToMine");

		if (renApplicantDesireToMine != null) {
			setRenApplicantDesireToMine(renApplicantDesireToMine);
		}

		String renewTermDesired = (String)attributes.get("renewTermDesired");

		if (renewTermDesired != null) {
			setRenewTermDesired(renewTermDesired);
		}

		String renewFeeCheck = (String)attributes.get("renewFeeCheck");

		if (renewFeeCheck != null) {
			setRenewFeeCheck(renewFeeCheck);
		}

		Date renewDate = (Date)attributes.get("renewDate");

		if (renewDate != null) {
			setRenewDate(renewDate);
		}

		Long miningLeaseApplicationId = (Long)attributes.get(
			"miningLeaseApplicationId");

		if (miningLeaseApplicationId != null) {
			setMiningLeaseApplicationId(miningLeaseApplicationId);
		}
	}

	@Override
	public MiningRenewalLicence cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this mining renewal licence.
	 *
	 * @return the company ID of this mining renewal licence
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this mining renewal licence.
	 *
	 * @return the create date of this mining renewal licence
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this mining renewal licence.
	 *
	 * @return the group ID of this mining renewal licence
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the mining lease application ID of this mining renewal licence.
	 *
	 * @return the mining lease application ID of this mining renewal licence
	 */
	@Override
	public long getMiningLeaseApplicationId() {
		return model.getMiningLeaseApplicationId();
	}

	/**
	 * Returns the mining renewal licence ID of this mining renewal licence.
	 *
	 * @return the mining renewal licence ID of this mining renewal licence
	 */
	@Override
	public long getMiningRenewalLicenceId() {
		return model.getMiningRenewalLicenceId();
	}

	/**
	 * Returns the modified date of this mining renewal licence.
	 *
	 * @return the modified date of this mining renewal licence
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this mining renewal licence.
	 *
	 * @return the primary key of this mining renewal licence
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the ren applicant desire to mine of this mining renewal licence.
	 *
	 * @return the ren applicant desire to mine of this mining renewal licence
	 */
	@Override
	public String getRenApplicantDesireToMine() {
		return model.getRenApplicantDesireToMine();
	}

	/**
	 * Returns the renew applicant lic num of this mining renewal licence.
	 *
	 * @return the renew applicant lic num of this mining renewal licence
	 */
	@Override
	public String getRenewApplicantLicNum() {
		return model.getRenewApplicantLicNum();
	}

	/**
	 * Returns the renew applicant name of this mining renewal licence.
	 *
	 * @return the renew applicant name of this mining renewal licence
	 */
	@Override
	public String getRenewApplicantName() {
		return model.getRenewApplicantName();
	}

	/**
	 * Returns the renew date of this mining renewal licence.
	 *
	 * @return the renew date of this mining renewal licence
	 */
	@Override
	public Date getRenewDate() {
		return model.getRenewDate();
	}

	/**
	 * Returns the renew email addr of this mining renewal licence.
	 *
	 * @return the renew email addr of this mining renewal licence
	 */
	@Override
	public String getRenewEmailAddr() {
		return model.getRenewEmailAddr();
	}

	/**
	 * Returns the renew fee check of this mining renewal licence.
	 *
	 * @return the renew fee check of this mining renewal licence
	 */
	@Override
	public String getRenewFeeCheck() {
		return model.getRenewFeeCheck();
	}

	/**
	 * Returns the renew num of applicant lease of this mining renewal licence.
	 *
	 * @return the renew num of applicant lease of this mining renewal licence
	 */
	@Override
	public String getRenewNumOfApplicantLease() {
		return model.getRenewNumOfApplicantLease();
	}

	/**
	 * Returns the renew telephone of this mining renewal licence.
	 *
	 * @return the renew telephone of this mining renewal licence
	 */
	@Override
	public String getRenewTelephone() {
		return model.getRenewTelephone();
	}

	/**
	 * Returns the renew term desired of this mining renewal licence.
	 *
	 * @return the renew term desired of this mining renewal licence
	 */
	@Override
	public String getRenewTermDesired() {
		return model.getRenewTermDesired();
	}

	/**
	 * Returns the renew trn num of this mining renewal licence.
	 *
	 * @return the renew trn num of this mining renewal licence
	 */
	@Override
	public String getRenewTrnNum() {
		return model.getRenewTrnNum();
	}

	/**
	 * Returns the state whether renew is of this mining renewal licence.
	 *
	 * @return the state whether renew is of this mining renewal licence
	 */
	@Override
	public String getStateWhetherRenewIs() {
		return model.getStateWhetherRenewIs();
	}

	/**
	 * Returns the user ID of this mining renewal licence.
	 *
	 * @return the user ID of this mining renewal licence
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this mining renewal licence.
	 *
	 * @return the user name of this mining renewal licence
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this mining renewal licence.
	 *
	 * @return the user uuid of this mining renewal licence
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
	 * Sets the company ID of this mining renewal licence.
	 *
	 * @param companyId the company ID of this mining renewal licence
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this mining renewal licence.
	 *
	 * @param createDate the create date of this mining renewal licence
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this mining renewal licence.
	 *
	 * @param groupId the group ID of this mining renewal licence
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the mining lease application ID of this mining renewal licence.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID of this mining renewal licence
	 */
	@Override
	public void setMiningLeaseApplicationId(long miningLeaseApplicationId) {
		model.setMiningLeaseApplicationId(miningLeaseApplicationId);
	}

	/**
	 * Sets the mining renewal licence ID of this mining renewal licence.
	 *
	 * @param miningRenewalLicenceId the mining renewal licence ID of this mining renewal licence
	 */
	@Override
	public void setMiningRenewalLicenceId(long miningRenewalLicenceId) {
		model.setMiningRenewalLicenceId(miningRenewalLicenceId);
	}

	/**
	 * Sets the modified date of this mining renewal licence.
	 *
	 * @param modifiedDate the modified date of this mining renewal licence
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this mining renewal licence.
	 *
	 * @param primaryKey the primary key of this mining renewal licence
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the ren applicant desire to mine of this mining renewal licence.
	 *
	 * @param renApplicantDesireToMine the ren applicant desire to mine of this mining renewal licence
	 */
	@Override
	public void setRenApplicantDesireToMine(String renApplicantDesireToMine) {
		model.setRenApplicantDesireToMine(renApplicantDesireToMine);
	}

	/**
	 * Sets the renew applicant lic num of this mining renewal licence.
	 *
	 * @param renewApplicantLicNum the renew applicant lic num of this mining renewal licence
	 */
	@Override
	public void setRenewApplicantLicNum(String renewApplicantLicNum) {
		model.setRenewApplicantLicNum(renewApplicantLicNum);
	}

	/**
	 * Sets the renew applicant name of this mining renewal licence.
	 *
	 * @param renewApplicantName the renew applicant name of this mining renewal licence
	 */
	@Override
	public void setRenewApplicantName(String renewApplicantName) {
		model.setRenewApplicantName(renewApplicantName);
	}

	/**
	 * Sets the renew date of this mining renewal licence.
	 *
	 * @param renewDate the renew date of this mining renewal licence
	 */
	@Override
	public void setRenewDate(Date renewDate) {
		model.setRenewDate(renewDate);
	}

	/**
	 * Sets the renew email addr of this mining renewal licence.
	 *
	 * @param renewEmailAddr the renew email addr of this mining renewal licence
	 */
	@Override
	public void setRenewEmailAddr(String renewEmailAddr) {
		model.setRenewEmailAddr(renewEmailAddr);
	}

	/**
	 * Sets the renew fee check of this mining renewal licence.
	 *
	 * @param renewFeeCheck the renew fee check of this mining renewal licence
	 */
	@Override
	public void setRenewFeeCheck(String renewFeeCheck) {
		model.setRenewFeeCheck(renewFeeCheck);
	}

	/**
	 * Sets the renew num of applicant lease of this mining renewal licence.
	 *
	 * @param renewNumOfApplicantLease the renew num of applicant lease of this mining renewal licence
	 */
	@Override
	public void setRenewNumOfApplicantLease(String renewNumOfApplicantLease) {
		model.setRenewNumOfApplicantLease(renewNumOfApplicantLease);
	}

	/**
	 * Sets the renew telephone of this mining renewal licence.
	 *
	 * @param renewTelephone the renew telephone of this mining renewal licence
	 */
	@Override
	public void setRenewTelephone(String renewTelephone) {
		model.setRenewTelephone(renewTelephone);
	}

	/**
	 * Sets the renew term desired of this mining renewal licence.
	 *
	 * @param renewTermDesired the renew term desired of this mining renewal licence
	 */
	@Override
	public void setRenewTermDesired(String renewTermDesired) {
		model.setRenewTermDesired(renewTermDesired);
	}

	/**
	 * Sets the renew trn num of this mining renewal licence.
	 *
	 * @param renewTrnNum the renew trn num of this mining renewal licence
	 */
	@Override
	public void setRenewTrnNum(String renewTrnNum) {
		model.setRenewTrnNum(renewTrnNum);
	}

	/**
	 * Sets the state whether renew is of this mining renewal licence.
	 *
	 * @param stateWhetherRenewIs the state whether renew is of this mining renewal licence
	 */
	@Override
	public void setStateWhetherRenewIs(String stateWhetherRenewIs) {
		model.setStateWhetherRenewIs(stateWhetherRenewIs);
	}

	/**
	 * Sets the user ID of this mining renewal licence.
	 *
	 * @param userId the user ID of this mining renewal licence
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this mining renewal licence.
	 *
	 * @param userName the user name of this mining renewal licence
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this mining renewal licence.
	 *
	 * @param userUuid the user uuid of this mining renewal licence
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
	protected MiningRenewalLicenceWrapper wrap(
		MiningRenewalLicence miningRenewalLicence) {

		return new MiningRenewalLicenceWrapper(miningRenewalLicence);
	}

}