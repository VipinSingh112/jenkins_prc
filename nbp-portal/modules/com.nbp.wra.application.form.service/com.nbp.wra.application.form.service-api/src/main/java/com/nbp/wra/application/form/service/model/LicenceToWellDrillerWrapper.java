/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link LicenceToWellDriller}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LicenceToWellDriller
 * @generated
 */
public class LicenceToWellDrillerWrapper
	extends BaseModelWrapper<LicenceToWellDriller>
	implements LicenceToWellDriller, ModelWrapper<LicenceToWellDriller> {

	public LicenceToWellDrillerWrapper(
		LicenceToWellDriller licenceToWellDriller) {

		super(licenceToWellDriller);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("licenceToWellDrillerId", getLicenceToWellDrillerId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"wellDrillingApplicationNo", getWellDrillingApplicationNo());
		attributes.put(
			"permitDrillingApplicantName", getPermitDrillingApplicantName());
		attributes.put(
			"permitDrillingAddressParish", getPermitDrillingAddressParish());
		attributes.put(
			"permitDrillingApplicantAddress",
			getPermitDrillingApplicantAddress());
		attributes.put("permitDrillingDOBDate", getPermitDrillingDOBDate());
		attributes.put(
			"permitDrillingEducational", getPermitDrillingEducational());
		attributes.put(
			"permitDrillingSpecificTraining",
			getPermitDrillingSpecificTraining());
		attributes.put(
			"permitDrillingSpecificExp", getPermitDrillingSpecificExp());
		attributes.put(
			"permitDrillingSelfEmployed", getPermitDrillingSelfEmployed());
		attributes.put("permitDrillingName", getPermitDrillingName());
		attributes.put(
			"permitDrillingPresentEmployer",
			getPermitDrillingPresentEmployer());
		attributes.put(
			"permitDrillingEmployerAddress",
			getPermitDrillingEmployerAddress());
		attributes.put(
			"permitDrillingFirstRefName", getPermitDrillingFirstRefName());
		attributes.put(
			"permitDrillingFirstRefAdd", getPermitDrillingFirstRefAdd());
		attributes.put(
			"permitDrillingSecondRefName", getPermitDrillingSecondRefName());
		attributes.put(
			"permitDrillingSecondRefAdd", getPermitDrillingSecondRefAdd());
		attributes.put("permitDrillingSignature", getPermitDrillingSignature());
		attributes.put(
			"permitDrillingSignatureDate", getPermitDrillingSignatureDate());
		attributes.put("wraApplicationId", getWraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long licenceToWellDrillerId = (Long)attributes.get(
			"licenceToWellDrillerId");

		if (licenceToWellDrillerId != null) {
			setLicenceToWellDrillerId(licenceToWellDrillerId);
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

		String wellDrillingApplicationNo = (String)attributes.get(
			"wellDrillingApplicationNo");

		if (wellDrillingApplicationNo != null) {
			setWellDrillingApplicationNo(wellDrillingApplicationNo);
		}

		String permitDrillingApplicantName = (String)attributes.get(
			"permitDrillingApplicantName");

		if (permitDrillingApplicantName != null) {
			setPermitDrillingApplicantName(permitDrillingApplicantName);
		}

		String permitDrillingAddressParish = (String)attributes.get(
			"permitDrillingAddressParish");

		if (permitDrillingAddressParish != null) {
			setPermitDrillingAddressParish(permitDrillingAddressParish);
		}

		String permitDrillingApplicantAddress = (String)attributes.get(
			"permitDrillingApplicantAddress");

		if (permitDrillingApplicantAddress != null) {
			setPermitDrillingApplicantAddress(permitDrillingApplicantAddress);
		}

		Date permitDrillingDOBDate = (Date)attributes.get(
			"permitDrillingDOBDate");

		if (permitDrillingDOBDate != null) {
			setPermitDrillingDOBDate(permitDrillingDOBDate);
		}

		String permitDrillingEducational = (String)attributes.get(
			"permitDrillingEducational");

		if (permitDrillingEducational != null) {
			setPermitDrillingEducational(permitDrillingEducational);
		}

		String permitDrillingSpecificTraining = (String)attributes.get(
			"permitDrillingSpecificTraining");

		if (permitDrillingSpecificTraining != null) {
			setPermitDrillingSpecificTraining(permitDrillingSpecificTraining);
		}

		String permitDrillingSpecificExp = (String)attributes.get(
			"permitDrillingSpecificExp");

		if (permitDrillingSpecificExp != null) {
			setPermitDrillingSpecificExp(permitDrillingSpecificExp);
		}

		String permitDrillingSelfEmployed = (String)attributes.get(
			"permitDrillingSelfEmployed");

		if (permitDrillingSelfEmployed != null) {
			setPermitDrillingSelfEmployed(permitDrillingSelfEmployed);
		}

		String permitDrillingName = (String)attributes.get(
			"permitDrillingName");

		if (permitDrillingName != null) {
			setPermitDrillingName(permitDrillingName);
		}

		String permitDrillingPresentEmployer = (String)attributes.get(
			"permitDrillingPresentEmployer");

		if (permitDrillingPresentEmployer != null) {
			setPermitDrillingPresentEmployer(permitDrillingPresentEmployer);
		}

		String permitDrillingEmployerAddress = (String)attributes.get(
			"permitDrillingEmployerAddress");

		if (permitDrillingEmployerAddress != null) {
			setPermitDrillingEmployerAddress(permitDrillingEmployerAddress);
		}

		String permitDrillingFirstRefName = (String)attributes.get(
			"permitDrillingFirstRefName");

		if (permitDrillingFirstRefName != null) {
			setPermitDrillingFirstRefName(permitDrillingFirstRefName);
		}

		String permitDrillingFirstRefAdd = (String)attributes.get(
			"permitDrillingFirstRefAdd");

		if (permitDrillingFirstRefAdd != null) {
			setPermitDrillingFirstRefAdd(permitDrillingFirstRefAdd);
		}

		String permitDrillingSecondRefName = (String)attributes.get(
			"permitDrillingSecondRefName");

		if (permitDrillingSecondRefName != null) {
			setPermitDrillingSecondRefName(permitDrillingSecondRefName);
		}

		String permitDrillingSecondRefAdd = (String)attributes.get(
			"permitDrillingSecondRefAdd");

		if (permitDrillingSecondRefAdd != null) {
			setPermitDrillingSecondRefAdd(permitDrillingSecondRefAdd);
		}

		String permitDrillingSignature = (String)attributes.get(
			"permitDrillingSignature");

		if (permitDrillingSignature != null) {
			setPermitDrillingSignature(permitDrillingSignature);
		}

		Date permitDrillingSignatureDate = (Date)attributes.get(
			"permitDrillingSignatureDate");

		if (permitDrillingSignatureDate != null) {
			setPermitDrillingSignatureDate(permitDrillingSignatureDate);
		}

		Long wraApplicationId = (Long)attributes.get("wraApplicationId");

		if (wraApplicationId != null) {
			setWraApplicationId(wraApplicationId);
		}
	}

	@Override
	public LicenceToWellDriller cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this licence to well driller.
	 *
	 * @return the company ID of this licence to well driller
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this licence to well driller.
	 *
	 * @return the create date of this licence to well driller
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this licence to well driller.
	 *
	 * @return the group ID of this licence to well driller
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the licence to well driller ID of this licence to well driller.
	 *
	 * @return the licence to well driller ID of this licence to well driller
	 */
	@Override
	public long getLicenceToWellDrillerId() {
		return model.getLicenceToWellDrillerId();
	}

	/**
	 * Returns the modified date of this licence to well driller.
	 *
	 * @return the modified date of this licence to well driller
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the permit drilling address parish of this licence to well driller.
	 *
	 * @return the permit drilling address parish of this licence to well driller
	 */
	@Override
	public String getPermitDrillingAddressParish() {
		return model.getPermitDrillingAddressParish();
	}

	/**
	 * Returns the permit drilling applicant address of this licence to well driller.
	 *
	 * @return the permit drilling applicant address of this licence to well driller
	 */
	@Override
	public String getPermitDrillingApplicantAddress() {
		return model.getPermitDrillingApplicantAddress();
	}

	/**
	 * Returns the permit drilling applicant name of this licence to well driller.
	 *
	 * @return the permit drilling applicant name of this licence to well driller
	 */
	@Override
	public String getPermitDrillingApplicantName() {
		return model.getPermitDrillingApplicantName();
	}

	/**
	 * Returns the permit drilling dob date of this licence to well driller.
	 *
	 * @return the permit drilling dob date of this licence to well driller
	 */
	@Override
	public Date getPermitDrillingDOBDate() {
		return model.getPermitDrillingDOBDate();
	}

	/**
	 * Returns the permit drilling educational of this licence to well driller.
	 *
	 * @return the permit drilling educational of this licence to well driller
	 */
	@Override
	public String getPermitDrillingEducational() {
		return model.getPermitDrillingEducational();
	}

	/**
	 * Returns the permit drilling employer address of this licence to well driller.
	 *
	 * @return the permit drilling employer address of this licence to well driller
	 */
	@Override
	public String getPermitDrillingEmployerAddress() {
		return model.getPermitDrillingEmployerAddress();
	}

	/**
	 * Returns the permit drilling first ref add of this licence to well driller.
	 *
	 * @return the permit drilling first ref add of this licence to well driller
	 */
	@Override
	public String getPermitDrillingFirstRefAdd() {
		return model.getPermitDrillingFirstRefAdd();
	}

	/**
	 * Returns the permit drilling first ref name of this licence to well driller.
	 *
	 * @return the permit drilling first ref name of this licence to well driller
	 */
	@Override
	public String getPermitDrillingFirstRefName() {
		return model.getPermitDrillingFirstRefName();
	}

	/**
	 * Returns the permit drilling name of this licence to well driller.
	 *
	 * @return the permit drilling name of this licence to well driller
	 */
	@Override
	public String getPermitDrillingName() {
		return model.getPermitDrillingName();
	}

	/**
	 * Returns the permit drilling present employer of this licence to well driller.
	 *
	 * @return the permit drilling present employer of this licence to well driller
	 */
	@Override
	public String getPermitDrillingPresentEmployer() {
		return model.getPermitDrillingPresentEmployer();
	}

	/**
	 * Returns the permit drilling second ref add of this licence to well driller.
	 *
	 * @return the permit drilling second ref add of this licence to well driller
	 */
	@Override
	public String getPermitDrillingSecondRefAdd() {
		return model.getPermitDrillingSecondRefAdd();
	}

	/**
	 * Returns the permit drilling second ref name of this licence to well driller.
	 *
	 * @return the permit drilling second ref name of this licence to well driller
	 */
	@Override
	public String getPermitDrillingSecondRefName() {
		return model.getPermitDrillingSecondRefName();
	}

	/**
	 * Returns the permit drilling self employed of this licence to well driller.
	 *
	 * @return the permit drilling self employed of this licence to well driller
	 */
	@Override
	public String getPermitDrillingSelfEmployed() {
		return model.getPermitDrillingSelfEmployed();
	}

	/**
	 * Returns the permit drilling signature of this licence to well driller.
	 *
	 * @return the permit drilling signature of this licence to well driller
	 */
	@Override
	public String getPermitDrillingSignature() {
		return model.getPermitDrillingSignature();
	}

	/**
	 * Returns the permit drilling signature date of this licence to well driller.
	 *
	 * @return the permit drilling signature date of this licence to well driller
	 */
	@Override
	public Date getPermitDrillingSignatureDate() {
		return model.getPermitDrillingSignatureDate();
	}

	/**
	 * Returns the permit drilling specific exp of this licence to well driller.
	 *
	 * @return the permit drilling specific exp of this licence to well driller
	 */
	@Override
	public String getPermitDrillingSpecificExp() {
		return model.getPermitDrillingSpecificExp();
	}

	/**
	 * Returns the permit drilling specific training of this licence to well driller.
	 *
	 * @return the permit drilling specific training of this licence to well driller
	 */
	@Override
	public String getPermitDrillingSpecificTraining() {
		return model.getPermitDrillingSpecificTraining();
	}

	/**
	 * Returns the primary key of this licence to well driller.
	 *
	 * @return the primary key of this licence to well driller
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this licence to well driller.
	 *
	 * @return the user ID of this licence to well driller
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this licence to well driller.
	 *
	 * @return the user name of this licence to well driller
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this licence to well driller.
	 *
	 * @return the user uuid of this licence to well driller
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the well drilling application no of this licence to well driller.
	 *
	 * @return the well drilling application no of this licence to well driller
	 */
	@Override
	public String getWellDrillingApplicationNo() {
		return model.getWellDrillingApplicationNo();
	}

	/**
	 * Returns the wra application ID of this licence to well driller.
	 *
	 * @return the wra application ID of this licence to well driller
	 */
	@Override
	public long getWraApplicationId() {
		return model.getWraApplicationId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this licence to well driller.
	 *
	 * @param companyId the company ID of this licence to well driller
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this licence to well driller.
	 *
	 * @param createDate the create date of this licence to well driller
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this licence to well driller.
	 *
	 * @param groupId the group ID of this licence to well driller
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the licence to well driller ID of this licence to well driller.
	 *
	 * @param licenceToWellDrillerId the licence to well driller ID of this licence to well driller
	 */
	@Override
	public void setLicenceToWellDrillerId(long licenceToWellDrillerId) {
		model.setLicenceToWellDrillerId(licenceToWellDrillerId);
	}

	/**
	 * Sets the modified date of this licence to well driller.
	 *
	 * @param modifiedDate the modified date of this licence to well driller
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the permit drilling address parish of this licence to well driller.
	 *
	 * @param permitDrillingAddressParish the permit drilling address parish of this licence to well driller
	 */
	@Override
	public void setPermitDrillingAddressParish(
		String permitDrillingAddressParish) {

		model.setPermitDrillingAddressParish(permitDrillingAddressParish);
	}

	/**
	 * Sets the permit drilling applicant address of this licence to well driller.
	 *
	 * @param permitDrillingApplicantAddress the permit drilling applicant address of this licence to well driller
	 */
	@Override
	public void setPermitDrillingApplicantAddress(
		String permitDrillingApplicantAddress) {

		model.setPermitDrillingApplicantAddress(permitDrillingApplicantAddress);
	}

	/**
	 * Sets the permit drilling applicant name of this licence to well driller.
	 *
	 * @param permitDrillingApplicantName the permit drilling applicant name of this licence to well driller
	 */
	@Override
	public void setPermitDrillingApplicantName(
		String permitDrillingApplicantName) {

		model.setPermitDrillingApplicantName(permitDrillingApplicantName);
	}

	/**
	 * Sets the permit drilling dob date of this licence to well driller.
	 *
	 * @param permitDrillingDOBDate the permit drilling dob date of this licence to well driller
	 */
	@Override
	public void setPermitDrillingDOBDate(Date permitDrillingDOBDate) {
		model.setPermitDrillingDOBDate(permitDrillingDOBDate);
	}

	/**
	 * Sets the permit drilling educational of this licence to well driller.
	 *
	 * @param permitDrillingEducational the permit drilling educational of this licence to well driller
	 */
	@Override
	public void setPermitDrillingEducational(String permitDrillingEducational) {
		model.setPermitDrillingEducational(permitDrillingEducational);
	}

	/**
	 * Sets the permit drilling employer address of this licence to well driller.
	 *
	 * @param permitDrillingEmployerAddress the permit drilling employer address of this licence to well driller
	 */
	@Override
	public void setPermitDrillingEmployerAddress(
		String permitDrillingEmployerAddress) {

		model.setPermitDrillingEmployerAddress(permitDrillingEmployerAddress);
	}

	/**
	 * Sets the permit drilling first ref add of this licence to well driller.
	 *
	 * @param permitDrillingFirstRefAdd the permit drilling first ref add of this licence to well driller
	 */
	@Override
	public void setPermitDrillingFirstRefAdd(String permitDrillingFirstRefAdd) {
		model.setPermitDrillingFirstRefAdd(permitDrillingFirstRefAdd);
	}

	/**
	 * Sets the permit drilling first ref name of this licence to well driller.
	 *
	 * @param permitDrillingFirstRefName the permit drilling first ref name of this licence to well driller
	 */
	@Override
	public void setPermitDrillingFirstRefName(
		String permitDrillingFirstRefName) {

		model.setPermitDrillingFirstRefName(permitDrillingFirstRefName);
	}

	/**
	 * Sets the permit drilling name of this licence to well driller.
	 *
	 * @param permitDrillingName the permit drilling name of this licence to well driller
	 */
	@Override
	public void setPermitDrillingName(String permitDrillingName) {
		model.setPermitDrillingName(permitDrillingName);
	}

	/**
	 * Sets the permit drilling present employer of this licence to well driller.
	 *
	 * @param permitDrillingPresentEmployer the permit drilling present employer of this licence to well driller
	 */
	@Override
	public void setPermitDrillingPresentEmployer(
		String permitDrillingPresentEmployer) {

		model.setPermitDrillingPresentEmployer(permitDrillingPresentEmployer);
	}

	/**
	 * Sets the permit drilling second ref add of this licence to well driller.
	 *
	 * @param permitDrillingSecondRefAdd the permit drilling second ref add of this licence to well driller
	 */
	@Override
	public void setPermitDrillingSecondRefAdd(
		String permitDrillingSecondRefAdd) {

		model.setPermitDrillingSecondRefAdd(permitDrillingSecondRefAdd);
	}

	/**
	 * Sets the permit drilling second ref name of this licence to well driller.
	 *
	 * @param permitDrillingSecondRefName the permit drilling second ref name of this licence to well driller
	 */
	@Override
	public void setPermitDrillingSecondRefName(
		String permitDrillingSecondRefName) {

		model.setPermitDrillingSecondRefName(permitDrillingSecondRefName);
	}

	/**
	 * Sets the permit drilling self employed of this licence to well driller.
	 *
	 * @param permitDrillingSelfEmployed the permit drilling self employed of this licence to well driller
	 */
	@Override
	public void setPermitDrillingSelfEmployed(
		String permitDrillingSelfEmployed) {

		model.setPermitDrillingSelfEmployed(permitDrillingSelfEmployed);
	}

	/**
	 * Sets the permit drilling signature of this licence to well driller.
	 *
	 * @param permitDrillingSignature the permit drilling signature of this licence to well driller
	 */
	@Override
	public void setPermitDrillingSignature(String permitDrillingSignature) {
		model.setPermitDrillingSignature(permitDrillingSignature);
	}

	/**
	 * Sets the permit drilling signature date of this licence to well driller.
	 *
	 * @param permitDrillingSignatureDate the permit drilling signature date of this licence to well driller
	 */
	@Override
	public void setPermitDrillingSignatureDate(
		Date permitDrillingSignatureDate) {

		model.setPermitDrillingSignatureDate(permitDrillingSignatureDate);
	}

	/**
	 * Sets the permit drilling specific exp of this licence to well driller.
	 *
	 * @param permitDrillingSpecificExp the permit drilling specific exp of this licence to well driller
	 */
	@Override
	public void setPermitDrillingSpecificExp(String permitDrillingSpecificExp) {
		model.setPermitDrillingSpecificExp(permitDrillingSpecificExp);
	}

	/**
	 * Sets the permit drilling specific training of this licence to well driller.
	 *
	 * @param permitDrillingSpecificTraining the permit drilling specific training of this licence to well driller
	 */
	@Override
	public void setPermitDrillingSpecificTraining(
		String permitDrillingSpecificTraining) {

		model.setPermitDrillingSpecificTraining(permitDrillingSpecificTraining);
	}

	/**
	 * Sets the primary key of this licence to well driller.
	 *
	 * @param primaryKey the primary key of this licence to well driller
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this licence to well driller.
	 *
	 * @param userId the user ID of this licence to well driller
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this licence to well driller.
	 *
	 * @param userName the user name of this licence to well driller
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this licence to well driller.
	 *
	 * @param userUuid the user uuid of this licence to well driller
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the well drilling application no of this licence to well driller.
	 *
	 * @param wellDrillingApplicationNo the well drilling application no of this licence to well driller
	 */
	@Override
	public void setWellDrillingApplicationNo(String wellDrillingApplicationNo) {
		model.setWellDrillingApplicationNo(wellDrillingApplicationNo);
	}

	/**
	 * Sets the wra application ID of this licence to well driller.
	 *
	 * @param wraApplicationId the wra application ID of this licence to well driller
	 */
	@Override
	public void setWraApplicationId(long wraApplicationId) {
		model.setWraApplicationId(wraApplicationId);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected LicenceToWellDrillerWrapper wrap(
		LicenceToWellDriller licenceToWellDriller) {

		return new LicenceToWellDrillerWrapper(licenceToWellDriller);
	}

}