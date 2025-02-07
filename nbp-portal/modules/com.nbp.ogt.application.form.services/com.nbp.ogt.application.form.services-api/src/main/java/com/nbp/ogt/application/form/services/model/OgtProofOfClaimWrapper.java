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
 * This class is a wrapper for {@link OgtProofOfClaim}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OgtProofOfClaim
 * @generated
 */
public class OgtProofOfClaimWrapper
	extends BaseModelWrapper<OgtProofOfClaim>
	implements ModelWrapper<OgtProofOfClaim>, OgtProofOfClaim {

	public OgtProofOfClaimWrapper(OgtProofOfClaim ogtProofOfClaim) {
		super(ogtProofOfClaim);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ogtProofOfClaimId", getOgtProofOfClaimId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("claimProofMatter", getClaimProofMatter());
		attributes.put("claimDebtorName", getClaimDebtorName());
		attributes.put("claimantName", getClaimantName());
		attributes.put("claimSentAddress", getClaimSentAddress());
		attributes.put("claimSentPhoneNum", getClaimSentPhoneNum());
		attributes.put("claimSentFaxNo", getClaimSentFaxNo());
		attributes.put("claimSentEmailAddr", getClaimSentEmailAddr());
		attributes.put("claimCompName", getClaimCompName());
		attributes.put("claimCertifyCheck", getClaimCertifyCheck());
		attributes.put("claimCompPosition", getClaimCompPosition());
		attributes.put("claimName", getClaimName());
		attributes.put("claimByCredDebtor", getClaimByCredDebtor());
		attributes.put("claimDateAppli", getClaimDateAppli());
		attributes.put("claimByDebtTotalVal", getClaimByDebtTotalVal());
		attributes.put("claimByDebtStatement", getClaimByDebtStatement());
		attributes.put("claimCategory", getClaimCategory());
		attributes.put("claimUnsecured", getClaimUnsecured());
		attributes.put("claimRegardingAmt", getClaimRegardingAmt());
		attributes.put("indicateCategoryOne", getIndicateCategoryOne());
		attributes.put("indicateCategoryTwo", getIndicateCategoryTwo());
		attributes.put("indicateCategoryThree", getIndicateCategoryThree());
		attributes.put("indicateCategoryFour", getIndicateCategoryFour());
		attributes.put("otherPleaseSpecify", getOtherPleaseSpecify());
		attributes.put("claimSecured", getClaimSecured());
		attributes.put("claimSecuredOne", getClaimSecuredOne());
		attributes.put("claimDesc", getClaimDesc());
		attributes.put("aboveNamedCreditor", getAboveNamedCreditor());
		attributes.put("paymentDetailDesc", getPaymentDetailDesc());
		attributes.put("inCaseOfBankruptcy", getInCaseOfBankruptcy());
		attributes.put("ogtApplicationId", getOgtApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ogtProofOfClaimId = (Long)attributes.get("ogtProofOfClaimId");

		if (ogtProofOfClaimId != null) {
			setOgtProofOfClaimId(ogtProofOfClaimId);
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

		String claimProofMatter = (String)attributes.get("claimProofMatter");

		if (claimProofMatter != null) {
			setClaimProofMatter(claimProofMatter);
		}

		String claimDebtorName = (String)attributes.get("claimDebtorName");

		if (claimDebtorName != null) {
			setClaimDebtorName(claimDebtorName);
		}

		String claimantName = (String)attributes.get("claimantName");

		if (claimantName != null) {
			setClaimantName(claimantName);
		}

		String claimSentAddress = (String)attributes.get("claimSentAddress");

		if (claimSentAddress != null) {
			setClaimSentAddress(claimSentAddress);
		}

		String claimSentPhoneNum = (String)attributes.get("claimSentPhoneNum");

		if (claimSentPhoneNum != null) {
			setClaimSentPhoneNum(claimSentPhoneNum);
		}

		String claimSentFaxNo = (String)attributes.get("claimSentFaxNo");

		if (claimSentFaxNo != null) {
			setClaimSentFaxNo(claimSentFaxNo);
		}

		String claimSentEmailAddr = (String)attributes.get(
			"claimSentEmailAddr");

		if (claimSentEmailAddr != null) {
			setClaimSentEmailAddr(claimSentEmailAddr);
		}

		String claimCompName = (String)attributes.get("claimCompName");

		if (claimCompName != null) {
			setClaimCompName(claimCompName);
		}

		String claimCertifyCheck = (String)attributes.get("claimCertifyCheck");

		if (claimCertifyCheck != null) {
			setClaimCertifyCheck(claimCertifyCheck);
		}

		String claimCompPosition = (String)attributes.get("claimCompPosition");

		if (claimCompPosition != null) {
			setClaimCompPosition(claimCompPosition);
		}

		String claimName = (String)attributes.get("claimName");

		if (claimName != null) {
			setClaimName(claimName);
		}

		String claimByCredDebtor = (String)attributes.get("claimByCredDebtor");

		if (claimByCredDebtor != null) {
			setClaimByCredDebtor(claimByCredDebtor);
		}

		Date claimDateAppli = (Date)attributes.get("claimDateAppli");

		if (claimDateAppli != null) {
			setClaimDateAppli(claimDateAppli);
		}

		String claimByDebtTotalVal = (String)attributes.get(
			"claimByDebtTotalVal");

		if (claimByDebtTotalVal != null) {
			setClaimByDebtTotalVal(claimByDebtTotalVal);
		}

		String claimByDebtStatement = (String)attributes.get(
			"claimByDebtStatement");

		if (claimByDebtStatement != null) {
			setClaimByDebtStatement(claimByDebtStatement);
		}

		String claimCategory = (String)attributes.get("claimCategory");

		if (claimCategory != null) {
			setClaimCategory(claimCategory);
		}

		String claimUnsecured = (String)attributes.get("claimUnsecured");

		if (claimUnsecured != null) {
			setClaimUnsecured(claimUnsecured);
		}

		String claimRegardingAmt = (String)attributes.get("claimRegardingAmt");

		if (claimRegardingAmt != null) {
			setClaimRegardingAmt(claimRegardingAmt);
		}

		String indicateCategoryOne = (String)attributes.get(
			"indicateCategoryOne");

		if (indicateCategoryOne != null) {
			setIndicateCategoryOne(indicateCategoryOne);
		}

		String indicateCategoryTwo = (String)attributes.get(
			"indicateCategoryTwo");

		if (indicateCategoryTwo != null) {
			setIndicateCategoryTwo(indicateCategoryTwo);
		}

		String indicateCategoryThree = (String)attributes.get(
			"indicateCategoryThree");

		if (indicateCategoryThree != null) {
			setIndicateCategoryThree(indicateCategoryThree);
		}

		String indicateCategoryFour = (String)attributes.get(
			"indicateCategoryFour");

		if (indicateCategoryFour != null) {
			setIndicateCategoryFour(indicateCategoryFour);
		}

		String otherPleaseSpecify = (String)attributes.get(
			"otherPleaseSpecify");

		if (otherPleaseSpecify != null) {
			setOtherPleaseSpecify(otherPleaseSpecify);
		}

		String claimSecured = (String)attributes.get("claimSecured");

		if (claimSecured != null) {
			setClaimSecured(claimSecured);
		}

		String claimSecuredOne = (String)attributes.get("claimSecuredOne");

		if (claimSecuredOne != null) {
			setClaimSecuredOne(claimSecuredOne);
		}

		String claimDesc = (String)attributes.get("claimDesc");

		if (claimDesc != null) {
			setClaimDesc(claimDesc);
		}

		String aboveNamedCreditor = (String)attributes.get(
			"aboveNamedCreditor");

		if (aboveNamedCreditor != null) {
			setAboveNamedCreditor(aboveNamedCreditor);
		}

		String paymentDetailDesc = (String)attributes.get("paymentDetailDesc");

		if (paymentDetailDesc != null) {
			setPaymentDetailDesc(paymentDetailDesc);
		}

		String inCaseOfBankruptcy = (String)attributes.get(
			"inCaseOfBankruptcy");

		if (inCaseOfBankruptcy != null) {
			setInCaseOfBankruptcy(inCaseOfBankruptcy);
		}

		Long ogtApplicationId = (Long)attributes.get("ogtApplicationId");

		if (ogtApplicationId != null) {
			setOgtApplicationId(ogtApplicationId);
		}
	}

	@Override
	public OgtProofOfClaim cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the above named creditor of this ogt proof of claim.
	 *
	 * @return the above named creditor of this ogt proof of claim
	 */
	@Override
	public String getAboveNamedCreditor() {
		return model.getAboveNamedCreditor();
	}

	/**
	 * Returns the claimant name of this ogt proof of claim.
	 *
	 * @return the claimant name of this ogt proof of claim
	 */
	@Override
	public String getClaimantName() {
		return model.getClaimantName();
	}

	/**
	 * Returns the claim by cred debtor of this ogt proof of claim.
	 *
	 * @return the claim by cred debtor of this ogt proof of claim
	 */
	@Override
	public String getClaimByCredDebtor() {
		return model.getClaimByCredDebtor();
	}

	/**
	 * Returns the claim by debt statement of this ogt proof of claim.
	 *
	 * @return the claim by debt statement of this ogt proof of claim
	 */
	@Override
	public String getClaimByDebtStatement() {
		return model.getClaimByDebtStatement();
	}

	/**
	 * Returns the claim by debt total val of this ogt proof of claim.
	 *
	 * @return the claim by debt total val of this ogt proof of claim
	 */
	@Override
	public String getClaimByDebtTotalVal() {
		return model.getClaimByDebtTotalVal();
	}

	/**
	 * Returns the claim category of this ogt proof of claim.
	 *
	 * @return the claim category of this ogt proof of claim
	 */
	@Override
	public String getClaimCategory() {
		return model.getClaimCategory();
	}

	/**
	 * Returns the claim certify check of this ogt proof of claim.
	 *
	 * @return the claim certify check of this ogt proof of claim
	 */
	@Override
	public String getClaimCertifyCheck() {
		return model.getClaimCertifyCheck();
	}

	/**
	 * Returns the claim comp name of this ogt proof of claim.
	 *
	 * @return the claim comp name of this ogt proof of claim
	 */
	@Override
	public String getClaimCompName() {
		return model.getClaimCompName();
	}

	/**
	 * Returns the claim comp position of this ogt proof of claim.
	 *
	 * @return the claim comp position of this ogt proof of claim
	 */
	@Override
	public String getClaimCompPosition() {
		return model.getClaimCompPosition();
	}

	/**
	 * Returns the claim date appli of this ogt proof of claim.
	 *
	 * @return the claim date appli of this ogt proof of claim
	 */
	@Override
	public Date getClaimDateAppli() {
		return model.getClaimDateAppli();
	}

	/**
	 * Returns the claim debtor name of this ogt proof of claim.
	 *
	 * @return the claim debtor name of this ogt proof of claim
	 */
	@Override
	public String getClaimDebtorName() {
		return model.getClaimDebtorName();
	}

	/**
	 * Returns the claim desc of this ogt proof of claim.
	 *
	 * @return the claim desc of this ogt proof of claim
	 */
	@Override
	public String getClaimDesc() {
		return model.getClaimDesc();
	}

	/**
	 * Returns the claim name of this ogt proof of claim.
	 *
	 * @return the claim name of this ogt proof of claim
	 */
	@Override
	public String getClaimName() {
		return model.getClaimName();
	}

	/**
	 * Returns the claim proof matter of this ogt proof of claim.
	 *
	 * @return the claim proof matter of this ogt proof of claim
	 */
	@Override
	public String getClaimProofMatter() {
		return model.getClaimProofMatter();
	}

	/**
	 * Returns the claim regarding amt of this ogt proof of claim.
	 *
	 * @return the claim regarding amt of this ogt proof of claim
	 */
	@Override
	public String getClaimRegardingAmt() {
		return model.getClaimRegardingAmt();
	}

	/**
	 * Returns the claim secured of this ogt proof of claim.
	 *
	 * @return the claim secured of this ogt proof of claim
	 */
	@Override
	public String getClaimSecured() {
		return model.getClaimSecured();
	}

	/**
	 * Returns the claim secured one of this ogt proof of claim.
	 *
	 * @return the claim secured one of this ogt proof of claim
	 */
	@Override
	public String getClaimSecuredOne() {
		return model.getClaimSecuredOne();
	}

	/**
	 * Returns the claim sent address of this ogt proof of claim.
	 *
	 * @return the claim sent address of this ogt proof of claim
	 */
	@Override
	public String getClaimSentAddress() {
		return model.getClaimSentAddress();
	}

	/**
	 * Returns the claim sent email addr of this ogt proof of claim.
	 *
	 * @return the claim sent email addr of this ogt proof of claim
	 */
	@Override
	public String getClaimSentEmailAddr() {
		return model.getClaimSentEmailAddr();
	}

	/**
	 * Returns the claim sent fax no of this ogt proof of claim.
	 *
	 * @return the claim sent fax no of this ogt proof of claim
	 */
	@Override
	public String getClaimSentFaxNo() {
		return model.getClaimSentFaxNo();
	}

	/**
	 * Returns the claim sent phone num of this ogt proof of claim.
	 *
	 * @return the claim sent phone num of this ogt proof of claim
	 */
	@Override
	public String getClaimSentPhoneNum() {
		return model.getClaimSentPhoneNum();
	}

	/**
	 * Returns the claim unsecured of this ogt proof of claim.
	 *
	 * @return the claim unsecured of this ogt proof of claim
	 */
	@Override
	public String getClaimUnsecured() {
		return model.getClaimUnsecured();
	}

	/**
	 * Returns the company ID of this ogt proof of claim.
	 *
	 * @return the company ID of this ogt proof of claim
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ogt proof of claim.
	 *
	 * @return the create date of this ogt proof of claim
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this ogt proof of claim.
	 *
	 * @return the group ID of this ogt proof of claim
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the in case of bankruptcy of this ogt proof of claim.
	 *
	 * @return the in case of bankruptcy of this ogt proof of claim
	 */
	@Override
	public String getInCaseOfBankruptcy() {
		return model.getInCaseOfBankruptcy();
	}

	/**
	 * Returns the indicate category four of this ogt proof of claim.
	 *
	 * @return the indicate category four of this ogt proof of claim
	 */
	@Override
	public String getIndicateCategoryFour() {
		return model.getIndicateCategoryFour();
	}

	/**
	 * Returns the indicate category one of this ogt proof of claim.
	 *
	 * @return the indicate category one of this ogt proof of claim
	 */
	@Override
	public String getIndicateCategoryOne() {
		return model.getIndicateCategoryOne();
	}

	/**
	 * Returns the indicate category three of this ogt proof of claim.
	 *
	 * @return the indicate category three of this ogt proof of claim
	 */
	@Override
	public String getIndicateCategoryThree() {
		return model.getIndicateCategoryThree();
	}

	/**
	 * Returns the indicate category two of this ogt proof of claim.
	 *
	 * @return the indicate category two of this ogt proof of claim
	 */
	@Override
	public String getIndicateCategoryTwo() {
		return model.getIndicateCategoryTwo();
	}

	/**
	 * Returns the modified date of this ogt proof of claim.
	 *
	 * @return the modified date of this ogt proof of claim
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ogt application ID of this ogt proof of claim.
	 *
	 * @return the ogt application ID of this ogt proof of claim
	 */
	@Override
	public long getOgtApplicationId() {
		return model.getOgtApplicationId();
	}

	/**
	 * Returns the ogt proof of claim ID of this ogt proof of claim.
	 *
	 * @return the ogt proof of claim ID of this ogt proof of claim
	 */
	@Override
	public long getOgtProofOfClaimId() {
		return model.getOgtProofOfClaimId();
	}

	/**
	 * Returns the other please specify of this ogt proof of claim.
	 *
	 * @return the other please specify of this ogt proof of claim
	 */
	@Override
	public String getOtherPleaseSpecify() {
		return model.getOtherPleaseSpecify();
	}

	/**
	 * Returns the payment detail desc of this ogt proof of claim.
	 *
	 * @return the payment detail desc of this ogt proof of claim
	 */
	@Override
	public String getPaymentDetailDesc() {
		return model.getPaymentDetailDesc();
	}

	/**
	 * Returns the primary key of this ogt proof of claim.
	 *
	 * @return the primary key of this ogt proof of claim
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this ogt proof of claim.
	 *
	 * @return the user ID of this ogt proof of claim
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ogt proof of claim.
	 *
	 * @return the user name of this ogt proof of claim
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ogt proof of claim.
	 *
	 * @return the user uuid of this ogt proof of claim
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
	 * Sets the above named creditor of this ogt proof of claim.
	 *
	 * @param aboveNamedCreditor the above named creditor of this ogt proof of claim
	 */
	@Override
	public void setAboveNamedCreditor(String aboveNamedCreditor) {
		model.setAboveNamedCreditor(aboveNamedCreditor);
	}

	/**
	 * Sets the claimant name of this ogt proof of claim.
	 *
	 * @param claimantName the claimant name of this ogt proof of claim
	 */
	@Override
	public void setClaimantName(String claimantName) {
		model.setClaimantName(claimantName);
	}

	/**
	 * Sets the claim by cred debtor of this ogt proof of claim.
	 *
	 * @param claimByCredDebtor the claim by cred debtor of this ogt proof of claim
	 */
	@Override
	public void setClaimByCredDebtor(String claimByCredDebtor) {
		model.setClaimByCredDebtor(claimByCredDebtor);
	}

	/**
	 * Sets the claim by debt statement of this ogt proof of claim.
	 *
	 * @param claimByDebtStatement the claim by debt statement of this ogt proof of claim
	 */
	@Override
	public void setClaimByDebtStatement(String claimByDebtStatement) {
		model.setClaimByDebtStatement(claimByDebtStatement);
	}

	/**
	 * Sets the claim by debt total val of this ogt proof of claim.
	 *
	 * @param claimByDebtTotalVal the claim by debt total val of this ogt proof of claim
	 */
	@Override
	public void setClaimByDebtTotalVal(String claimByDebtTotalVal) {
		model.setClaimByDebtTotalVal(claimByDebtTotalVal);
	}

	/**
	 * Sets the claim category of this ogt proof of claim.
	 *
	 * @param claimCategory the claim category of this ogt proof of claim
	 */
	@Override
	public void setClaimCategory(String claimCategory) {
		model.setClaimCategory(claimCategory);
	}

	/**
	 * Sets the claim certify check of this ogt proof of claim.
	 *
	 * @param claimCertifyCheck the claim certify check of this ogt proof of claim
	 */
	@Override
	public void setClaimCertifyCheck(String claimCertifyCheck) {
		model.setClaimCertifyCheck(claimCertifyCheck);
	}

	/**
	 * Sets the claim comp name of this ogt proof of claim.
	 *
	 * @param claimCompName the claim comp name of this ogt proof of claim
	 */
	@Override
	public void setClaimCompName(String claimCompName) {
		model.setClaimCompName(claimCompName);
	}

	/**
	 * Sets the claim comp position of this ogt proof of claim.
	 *
	 * @param claimCompPosition the claim comp position of this ogt proof of claim
	 */
	@Override
	public void setClaimCompPosition(String claimCompPosition) {
		model.setClaimCompPosition(claimCompPosition);
	}

	/**
	 * Sets the claim date appli of this ogt proof of claim.
	 *
	 * @param claimDateAppli the claim date appli of this ogt proof of claim
	 */
	@Override
	public void setClaimDateAppli(Date claimDateAppli) {
		model.setClaimDateAppli(claimDateAppli);
	}

	/**
	 * Sets the claim debtor name of this ogt proof of claim.
	 *
	 * @param claimDebtorName the claim debtor name of this ogt proof of claim
	 */
	@Override
	public void setClaimDebtorName(String claimDebtorName) {
		model.setClaimDebtorName(claimDebtorName);
	}

	/**
	 * Sets the claim desc of this ogt proof of claim.
	 *
	 * @param claimDesc the claim desc of this ogt proof of claim
	 */
	@Override
	public void setClaimDesc(String claimDesc) {
		model.setClaimDesc(claimDesc);
	}

	/**
	 * Sets the claim name of this ogt proof of claim.
	 *
	 * @param claimName the claim name of this ogt proof of claim
	 */
	@Override
	public void setClaimName(String claimName) {
		model.setClaimName(claimName);
	}

	/**
	 * Sets the claim proof matter of this ogt proof of claim.
	 *
	 * @param claimProofMatter the claim proof matter of this ogt proof of claim
	 */
	@Override
	public void setClaimProofMatter(String claimProofMatter) {
		model.setClaimProofMatter(claimProofMatter);
	}

	/**
	 * Sets the claim regarding amt of this ogt proof of claim.
	 *
	 * @param claimRegardingAmt the claim regarding amt of this ogt proof of claim
	 */
	@Override
	public void setClaimRegardingAmt(String claimRegardingAmt) {
		model.setClaimRegardingAmt(claimRegardingAmt);
	}

	/**
	 * Sets the claim secured of this ogt proof of claim.
	 *
	 * @param claimSecured the claim secured of this ogt proof of claim
	 */
	@Override
	public void setClaimSecured(String claimSecured) {
		model.setClaimSecured(claimSecured);
	}

	/**
	 * Sets the claim secured one of this ogt proof of claim.
	 *
	 * @param claimSecuredOne the claim secured one of this ogt proof of claim
	 */
	@Override
	public void setClaimSecuredOne(String claimSecuredOne) {
		model.setClaimSecuredOne(claimSecuredOne);
	}

	/**
	 * Sets the claim sent address of this ogt proof of claim.
	 *
	 * @param claimSentAddress the claim sent address of this ogt proof of claim
	 */
	@Override
	public void setClaimSentAddress(String claimSentAddress) {
		model.setClaimSentAddress(claimSentAddress);
	}

	/**
	 * Sets the claim sent email addr of this ogt proof of claim.
	 *
	 * @param claimSentEmailAddr the claim sent email addr of this ogt proof of claim
	 */
	@Override
	public void setClaimSentEmailAddr(String claimSentEmailAddr) {
		model.setClaimSentEmailAddr(claimSentEmailAddr);
	}

	/**
	 * Sets the claim sent fax no of this ogt proof of claim.
	 *
	 * @param claimSentFaxNo the claim sent fax no of this ogt proof of claim
	 */
	@Override
	public void setClaimSentFaxNo(String claimSentFaxNo) {
		model.setClaimSentFaxNo(claimSentFaxNo);
	}

	/**
	 * Sets the claim sent phone num of this ogt proof of claim.
	 *
	 * @param claimSentPhoneNum the claim sent phone num of this ogt proof of claim
	 */
	@Override
	public void setClaimSentPhoneNum(String claimSentPhoneNum) {
		model.setClaimSentPhoneNum(claimSentPhoneNum);
	}

	/**
	 * Sets the claim unsecured of this ogt proof of claim.
	 *
	 * @param claimUnsecured the claim unsecured of this ogt proof of claim
	 */
	@Override
	public void setClaimUnsecured(String claimUnsecured) {
		model.setClaimUnsecured(claimUnsecured);
	}

	/**
	 * Sets the company ID of this ogt proof of claim.
	 *
	 * @param companyId the company ID of this ogt proof of claim
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ogt proof of claim.
	 *
	 * @param createDate the create date of this ogt proof of claim
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this ogt proof of claim.
	 *
	 * @param groupId the group ID of this ogt proof of claim
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the in case of bankruptcy of this ogt proof of claim.
	 *
	 * @param inCaseOfBankruptcy the in case of bankruptcy of this ogt proof of claim
	 */
	@Override
	public void setInCaseOfBankruptcy(String inCaseOfBankruptcy) {
		model.setInCaseOfBankruptcy(inCaseOfBankruptcy);
	}

	/**
	 * Sets the indicate category four of this ogt proof of claim.
	 *
	 * @param indicateCategoryFour the indicate category four of this ogt proof of claim
	 */
	@Override
	public void setIndicateCategoryFour(String indicateCategoryFour) {
		model.setIndicateCategoryFour(indicateCategoryFour);
	}

	/**
	 * Sets the indicate category one of this ogt proof of claim.
	 *
	 * @param indicateCategoryOne the indicate category one of this ogt proof of claim
	 */
	@Override
	public void setIndicateCategoryOne(String indicateCategoryOne) {
		model.setIndicateCategoryOne(indicateCategoryOne);
	}

	/**
	 * Sets the indicate category three of this ogt proof of claim.
	 *
	 * @param indicateCategoryThree the indicate category three of this ogt proof of claim
	 */
	@Override
	public void setIndicateCategoryThree(String indicateCategoryThree) {
		model.setIndicateCategoryThree(indicateCategoryThree);
	}

	/**
	 * Sets the indicate category two of this ogt proof of claim.
	 *
	 * @param indicateCategoryTwo the indicate category two of this ogt proof of claim
	 */
	@Override
	public void setIndicateCategoryTwo(String indicateCategoryTwo) {
		model.setIndicateCategoryTwo(indicateCategoryTwo);
	}

	/**
	 * Sets the modified date of this ogt proof of claim.
	 *
	 * @param modifiedDate the modified date of this ogt proof of claim
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ogt application ID of this ogt proof of claim.
	 *
	 * @param ogtApplicationId the ogt application ID of this ogt proof of claim
	 */
	@Override
	public void setOgtApplicationId(long ogtApplicationId) {
		model.setOgtApplicationId(ogtApplicationId);
	}

	/**
	 * Sets the ogt proof of claim ID of this ogt proof of claim.
	 *
	 * @param ogtProofOfClaimId the ogt proof of claim ID of this ogt proof of claim
	 */
	@Override
	public void setOgtProofOfClaimId(long ogtProofOfClaimId) {
		model.setOgtProofOfClaimId(ogtProofOfClaimId);
	}

	/**
	 * Sets the other please specify of this ogt proof of claim.
	 *
	 * @param otherPleaseSpecify the other please specify of this ogt proof of claim
	 */
	@Override
	public void setOtherPleaseSpecify(String otherPleaseSpecify) {
		model.setOtherPleaseSpecify(otherPleaseSpecify);
	}

	/**
	 * Sets the payment detail desc of this ogt proof of claim.
	 *
	 * @param paymentDetailDesc the payment detail desc of this ogt proof of claim
	 */
	@Override
	public void setPaymentDetailDesc(String paymentDetailDesc) {
		model.setPaymentDetailDesc(paymentDetailDesc);
	}

	/**
	 * Sets the primary key of this ogt proof of claim.
	 *
	 * @param primaryKey the primary key of this ogt proof of claim
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this ogt proof of claim.
	 *
	 * @param userId the user ID of this ogt proof of claim
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ogt proof of claim.
	 *
	 * @param userName the user name of this ogt proof of claim
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ogt proof of claim.
	 *
	 * @param userUuid the user uuid of this ogt proof of claim
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
	protected OgtProofOfClaimWrapper wrap(OgtProofOfClaim ogtProofOfClaim) {
		return new OgtProofOfClaimWrapper(ogtProofOfClaim);
	}

}