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
 * This class is a wrapper for {@link PermitToDrillAWell}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PermitToDrillAWell
 * @generated
 */
public class PermitToDrillAWellWrapper
	extends BaseModelWrapper<PermitToDrillAWell>
	implements ModelWrapper<PermitToDrillAWell>, PermitToDrillAWell {

	public PermitToDrillAWellWrapper(PermitToDrillAWell permitToDrillAWell) {
		super(permitToDrillAWell);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("drillAWellApplicationId", getDrillAWellApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"permitDrillApplicationNum", getPermitDrillApplicationNum());
		attributes.put(
			"permitDrillingApplicantName", getPermitDrillingApplicantName());
		attributes.put(
			"permitDrillingMailingAddParish",
			getPermitDrillingMailingAddParish());
		attributes.put(
			"permitDrillingMailingAddress", getPermitDrillingMailingAddress());
		attributes.put(
			"permitDrillingEmailAddress", getPermitDrillingEmailAddress());
		attributes.put(
			"permitDrillingOfficePhone", getPermitDrillingOfficePhone());
		attributes.put(
			"permitDrillingMobilePhone", getPermitDrillingMobilePhone());
		attributes.put("wellDrillingHomePhone", getWellDrillingHomePhone());
		attributes.put(
			"permitDrillingWorkLocation", getPermitDrillingWorkLocation());
		attributes.put("permitDrillingLocation", getPermitDrillingLocation());
		attributes.put("permitDrillingNature", getPermitDrillingNature());
		attributes.put(
			"permitDrillingContractorName", getPermitDrillingContractorName());
		attributes.put(
			"permitDrillContractAddress", getPermitDrillContractAddress());
		attributes.put(
			"permitDrillingContractorAdd", getPermitDrillingContractorAdd());
		attributes.put("permitDrillingPurpose", getPermitDrillingPurpose());
		attributes.put(
			"permitDrillingBoreholeDepth", getPermitDrillingBoreholeDepth());
		attributes.put(
			"permitDrillingDiameterBorehole",
			getPermitDrillingDiameterBorehole());
		attributes.put("permitDrillingMethod", getPermitDrillingMethod());
		attributes.put(
			"permitDrillingConstMethod", getPermitDrillingConstMethod());
		attributes.put("permitDrillingSupplies", getPermitDrillingSupplies());
		attributes.put(
			"permitDrillingTechnicalInfo", getPermitDrillingTechnicalInfo());
		attributes.put("permitDrillingCubic", getPermitDrillingCubic());
		attributes.put("permitDrillingAuthority", getPermitDrillingAuthority());
		attributes.put(
			"applicantSignaturePermitBtn", getApplicantSignaturePermitBtn());
		attributes.put("permitDrillingSignDate", getPermitDrillingSignDate());
		attributes.put("wraApplicationId", getWraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long drillAWellApplicationId = (Long)attributes.get(
			"drillAWellApplicationId");

		if (drillAWellApplicationId != null) {
			setDrillAWellApplicationId(drillAWellApplicationId);
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

		String permitDrillApplicationNum = (String)attributes.get(
			"permitDrillApplicationNum");

		if (permitDrillApplicationNum != null) {
			setPermitDrillApplicationNum(permitDrillApplicationNum);
		}

		String permitDrillingApplicantName = (String)attributes.get(
			"permitDrillingApplicantName");

		if (permitDrillingApplicantName != null) {
			setPermitDrillingApplicantName(permitDrillingApplicantName);
		}

		String permitDrillingMailingAddParish = (String)attributes.get(
			"permitDrillingMailingAddParish");

		if (permitDrillingMailingAddParish != null) {
			setPermitDrillingMailingAddParish(permitDrillingMailingAddParish);
		}

		String permitDrillingMailingAddress = (String)attributes.get(
			"permitDrillingMailingAddress");

		if (permitDrillingMailingAddress != null) {
			setPermitDrillingMailingAddress(permitDrillingMailingAddress);
		}

		String permitDrillingEmailAddress = (String)attributes.get(
			"permitDrillingEmailAddress");

		if (permitDrillingEmailAddress != null) {
			setPermitDrillingEmailAddress(permitDrillingEmailAddress);
		}

		String permitDrillingOfficePhone = (String)attributes.get(
			"permitDrillingOfficePhone");

		if (permitDrillingOfficePhone != null) {
			setPermitDrillingOfficePhone(permitDrillingOfficePhone);
		}

		String permitDrillingMobilePhone = (String)attributes.get(
			"permitDrillingMobilePhone");

		if (permitDrillingMobilePhone != null) {
			setPermitDrillingMobilePhone(permitDrillingMobilePhone);
		}

		String wellDrillingHomePhone = (String)attributes.get(
			"wellDrillingHomePhone");

		if (wellDrillingHomePhone != null) {
			setWellDrillingHomePhone(wellDrillingHomePhone);
		}

		String permitDrillingWorkLocation = (String)attributes.get(
			"permitDrillingWorkLocation");

		if (permitDrillingWorkLocation != null) {
			setPermitDrillingWorkLocation(permitDrillingWorkLocation);
		}

		String permitDrillingLocation = (String)attributes.get(
			"permitDrillingLocation");

		if (permitDrillingLocation != null) {
			setPermitDrillingLocation(permitDrillingLocation);
		}

		String permitDrillingNature = (String)attributes.get(
			"permitDrillingNature");

		if (permitDrillingNature != null) {
			setPermitDrillingNature(permitDrillingNature);
		}

		String permitDrillingContractorName = (String)attributes.get(
			"permitDrillingContractorName");

		if (permitDrillingContractorName != null) {
			setPermitDrillingContractorName(permitDrillingContractorName);
		}

		String permitDrillContractAddress = (String)attributes.get(
			"permitDrillContractAddress");

		if (permitDrillContractAddress != null) {
			setPermitDrillContractAddress(permitDrillContractAddress);
		}

		String permitDrillingContractorAdd = (String)attributes.get(
			"permitDrillingContractorAdd");

		if (permitDrillingContractorAdd != null) {
			setPermitDrillingContractorAdd(permitDrillingContractorAdd);
		}

		String permitDrillingPurpose = (String)attributes.get(
			"permitDrillingPurpose");

		if (permitDrillingPurpose != null) {
			setPermitDrillingPurpose(permitDrillingPurpose);
		}

		String permitDrillingBoreholeDepth = (String)attributes.get(
			"permitDrillingBoreholeDepth");

		if (permitDrillingBoreholeDepth != null) {
			setPermitDrillingBoreholeDepth(permitDrillingBoreholeDepth);
		}

		String permitDrillingDiameterBorehole = (String)attributes.get(
			"permitDrillingDiameterBorehole");

		if (permitDrillingDiameterBorehole != null) {
			setPermitDrillingDiameterBorehole(permitDrillingDiameterBorehole);
		}

		String permitDrillingMethod = (String)attributes.get(
			"permitDrillingMethod");

		if (permitDrillingMethod != null) {
			setPermitDrillingMethod(permitDrillingMethod);
		}

		String permitDrillingConstMethod = (String)attributes.get(
			"permitDrillingConstMethod");

		if (permitDrillingConstMethod != null) {
			setPermitDrillingConstMethod(permitDrillingConstMethod);
		}

		String permitDrillingSupplies = (String)attributes.get(
			"permitDrillingSupplies");

		if (permitDrillingSupplies != null) {
			setPermitDrillingSupplies(permitDrillingSupplies);
		}

		String permitDrillingTechnicalInfo = (String)attributes.get(
			"permitDrillingTechnicalInfo");

		if (permitDrillingTechnicalInfo != null) {
			setPermitDrillingTechnicalInfo(permitDrillingTechnicalInfo);
		}

		String permitDrillingCubic = (String)attributes.get(
			"permitDrillingCubic");

		if (permitDrillingCubic != null) {
			setPermitDrillingCubic(permitDrillingCubic);
		}

		String permitDrillingAuthority = (String)attributes.get(
			"permitDrillingAuthority");

		if (permitDrillingAuthority != null) {
			setPermitDrillingAuthority(permitDrillingAuthority);
		}

		String applicantSignaturePermitBtn = (String)attributes.get(
			"applicantSignaturePermitBtn");

		if (applicantSignaturePermitBtn != null) {
			setApplicantSignaturePermitBtn(applicantSignaturePermitBtn);
		}

		Date permitDrillingSignDate = (Date)attributes.get(
			"permitDrillingSignDate");

		if (permitDrillingSignDate != null) {
			setPermitDrillingSignDate(permitDrillingSignDate);
		}

		Long wraApplicationId = (Long)attributes.get("wraApplicationId");

		if (wraApplicationId != null) {
			setWraApplicationId(wraApplicationId);
		}
	}

	@Override
	public PermitToDrillAWell cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the applicant signature permit btn of this permit to drill a well.
	 *
	 * @return the applicant signature permit btn of this permit to drill a well
	 */
	@Override
	public String getApplicantSignaturePermitBtn() {
		return model.getApplicantSignaturePermitBtn();
	}

	/**
	 * Returns the company ID of this permit to drill a well.
	 *
	 * @return the company ID of this permit to drill a well
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this permit to drill a well.
	 *
	 * @return the create date of this permit to drill a well
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the drill a well application ID of this permit to drill a well.
	 *
	 * @return the drill a well application ID of this permit to drill a well
	 */
	@Override
	public long getDrillAWellApplicationId() {
		return model.getDrillAWellApplicationId();
	}

	/**
	 * Returns the group ID of this permit to drill a well.
	 *
	 * @return the group ID of this permit to drill a well
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this permit to drill a well.
	 *
	 * @return the modified date of this permit to drill a well
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the permit drill application num of this permit to drill a well.
	 *
	 * @return the permit drill application num of this permit to drill a well
	 */
	@Override
	public String getPermitDrillApplicationNum() {
		return model.getPermitDrillApplicationNum();
	}

	/**
	 * Returns the permit drill contract address of this permit to drill a well.
	 *
	 * @return the permit drill contract address of this permit to drill a well
	 */
	@Override
	public String getPermitDrillContractAddress() {
		return model.getPermitDrillContractAddress();
	}

	/**
	 * Returns the permit drilling applicant name of this permit to drill a well.
	 *
	 * @return the permit drilling applicant name of this permit to drill a well
	 */
	@Override
	public String getPermitDrillingApplicantName() {
		return model.getPermitDrillingApplicantName();
	}

	/**
	 * Returns the permit drilling authority of this permit to drill a well.
	 *
	 * @return the permit drilling authority of this permit to drill a well
	 */
	@Override
	public String getPermitDrillingAuthority() {
		return model.getPermitDrillingAuthority();
	}

	/**
	 * Returns the permit drilling borehole depth of this permit to drill a well.
	 *
	 * @return the permit drilling borehole depth of this permit to drill a well
	 */
	@Override
	public String getPermitDrillingBoreholeDepth() {
		return model.getPermitDrillingBoreholeDepth();
	}

	/**
	 * Returns the permit drilling const method of this permit to drill a well.
	 *
	 * @return the permit drilling const method of this permit to drill a well
	 */
	@Override
	public String getPermitDrillingConstMethod() {
		return model.getPermitDrillingConstMethod();
	}

	/**
	 * Returns the permit drilling contractor add of this permit to drill a well.
	 *
	 * @return the permit drilling contractor add of this permit to drill a well
	 */
	@Override
	public String getPermitDrillingContractorAdd() {
		return model.getPermitDrillingContractorAdd();
	}

	/**
	 * Returns the permit drilling contractor name of this permit to drill a well.
	 *
	 * @return the permit drilling contractor name of this permit to drill a well
	 */
	@Override
	public String getPermitDrillingContractorName() {
		return model.getPermitDrillingContractorName();
	}

	/**
	 * Returns the permit drilling cubic of this permit to drill a well.
	 *
	 * @return the permit drilling cubic of this permit to drill a well
	 */
	@Override
	public String getPermitDrillingCubic() {
		return model.getPermitDrillingCubic();
	}

	/**
	 * Returns the permit drilling diameter borehole of this permit to drill a well.
	 *
	 * @return the permit drilling diameter borehole of this permit to drill a well
	 */
	@Override
	public String getPermitDrillingDiameterBorehole() {
		return model.getPermitDrillingDiameterBorehole();
	}

	/**
	 * Returns the permit drilling email address of this permit to drill a well.
	 *
	 * @return the permit drilling email address of this permit to drill a well
	 */
	@Override
	public String getPermitDrillingEmailAddress() {
		return model.getPermitDrillingEmailAddress();
	}

	/**
	 * Returns the permit drilling location of this permit to drill a well.
	 *
	 * @return the permit drilling location of this permit to drill a well
	 */
	@Override
	public String getPermitDrillingLocation() {
		return model.getPermitDrillingLocation();
	}

	/**
	 * Returns the permit drilling mailing add parish of this permit to drill a well.
	 *
	 * @return the permit drilling mailing add parish of this permit to drill a well
	 */
	@Override
	public String getPermitDrillingMailingAddParish() {
		return model.getPermitDrillingMailingAddParish();
	}

	/**
	 * Returns the permit drilling mailing address of this permit to drill a well.
	 *
	 * @return the permit drilling mailing address of this permit to drill a well
	 */
	@Override
	public String getPermitDrillingMailingAddress() {
		return model.getPermitDrillingMailingAddress();
	}

	/**
	 * Returns the permit drilling method of this permit to drill a well.
	 *
	 * @return the permit drilling method of this permit to drill a well
	 */
	@Override
	public String getPermitDrillingMethod() {
		return model.getPermitDrillingMethod();
	}

	/**
	 * Returns the permit drilling mobile phone of this permit to drill a well.
	 *
	 * @return the permit drilling mobile phone of this permit to drill a well
	 */
	@Override
	public String getPermitDrillingMobilePhone() {
		return model.getPermitDrillingMobilePhone();
	}

	/**
	 * Returns the permit drilling nature of this permit to drill a well.
	 *
	 * @return the permit drilling nature of this permit to drill a well
	 */
	@Override
	public String getPermitDrillingNature() {
		return model.getPermitDrillingNature();
	}

	/**
	 * Returns the permit drilling office phone of this permit to drill a well.
	 *
	 * @return the permit drilling office phone of this permit to drill a well
	 */
	@Override
	public String getPermitDrillingOfficePhone() {
		return model.getPermitDrillingOfficePhone();
	}

	/**
	 * Returns the permit drilling purpose of this permit to drill a well.
	 *
	 * @return the permit drilling purpose of this permit to drill a well
	 */
	@Override
	public String getPermitDrillingPurpose() {
		return model.getPermitDrillingPurpose();
	}

	/**
	 * Returns the permit drilling sign date of this permit to drill a well.
	 *
	 * @return the permit drilling sign date of this permit to drill a well
	 */
	@Override
	public Date getPermitDrillingSignDate() {
		return model.getPermitDrillingSignDate();
	}

	/**
	 * Returns the permit drilling supplies of this permit to drill a well.
	 *
	 * @return the permit drilling supplies of this permit to drill a well
	 */
	@Override
	public String getPermitDrillingSupplies() {
		return model.getPermitDrillingSupplies();
	}

	/**
	 * Returns the permit drilling technical info of this permit to drill a well.
	 *
	 * @return the permit drilling technical info of this permit to drill a well
	 */
	@Override
	public String getPermitDrillingTechnicalInfo() {
		return model.getPermitDrillingTechnicalInfo();
	}

	/**
	 * Returns the permit drilling work location of this permit to drill a well.
	 *
	 * @return the permit drilling work location of this permit to drill a well
	 */
	@Override
	public String getPermitDrillingWorkLocation() {
		return model.getPermitDrillingWorkLocation();
	}

	/**
	 * Returns the primary key of this permit to drill a well.
	 *
	 * @return the primary key of this permit to drill a well
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this permit to drill a well.
	 *
	 * @return the user ID of this permit to drill a well
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this permit to drill a well.
	 *
	 * @return the user name of this permit to drill a well
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this permit to drill a well.
	 *
	 * @return the user uuid of this permit to drill a well
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the well drilling home phone of this permit to drill a well.
	 *
	 * @return the well drilling home phone of this permit to drill a well
	 */
	@Override
	public String getWellDrillingHomePhone() {
		return model.getWellDrillingHomePhone();
	}

	/**
	 * Returns the wra application ID of this permit to drill a well.
	 *
	 * @return the wra application ID of this permit to drill a well
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
	 * Sets the applicant signature permit btn of this permit to drill a well.
	 *
	 * @param applicantSignaturePermitBtn the applicant signature permit btn of this permit to drill a well
	 */
	@Override
	public void setApplicantSignaturePermitBtn(
		String applicantSignaturePermitBtn) {

		model.setApplicantSignaturePermitBtn(applicantSignaturePermitBtn);
	}

	/**
	 * Sets the company ID of this permit to drill a well.
	 *
	 * @param companyId the company ID of this permit to drill a well
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this permit to drill a well.
	 *
	 * @param createDate the create date of this permit to drill a well
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the drill a well application ID of this permit to drill a well.
	 *
	 * @param drillAWellApplicationId the drill a well application ID of this permit to drill a well
	 */
	@Override
	public void setDrillAWellApplicationId(long drillAWellApplicationId) {
		model.setDrillAWellApplicationId(drillAWellApplicationId);
	}

	/**
	 * Sets the group ID of this permit to drill a well.
	 *
	 * @param groupId the group ID of this permit to drill a well
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this permit to drill a well.
	 *
	 * @param modifiedDate the modified date of this permit to drill a well
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the permit drill application num of this permit to drill a well.
	 *
	 * @param permitDrillApplicationNum the permit drill application num of this permit to drill a well
	 */
	@Override
	public void setPermitDrillApplicationNum(String permitDrillApplicationNum) {
		model.setPermitDrillApplicationNum(permitDrillApplicationNum);
	}

	/**
	 * Sets the permit drill contract address of this permit to drill a well.
	 *
	 * @param permitDrillContractAddress the permit drill contract address of this permit to drill a well
	 */
	@Override
	public void setPermitDrillContractAddress(
		String permitDrillContractAddress) {

		model.setPermitDrillContractAddress(permitDrillContractAddress);
	}

	/**
	 * Sets the permit drilling applicant name of this permit to drill a well.
	 *
	 * @param permitDrillingApplicantName the permit drilling applicant name of this permit to drill a well
	 */
	@Override
	public void setPermitDrillingApplicantName(
		String permitDrillingApplicantName) {

		model.setPermitDrillingApplicantName(permitDrillingApplicantName);
	}

	/**
	 * Sets the permit drilling authority of this permit to drill a well.
	 *
	 * @param permitDrillingAuthority the permit drilling authority of this permit to drill a well
	 */
	@Override
	public void setPermitDrillingAuthority(String permitDrillingAuthority) {
		model.setPermitDrillingAuthority(permitDrillingAuthority);
	}

	/**
	 * Sets the permit drilling borehole depth of this permit to drill a well.
	 *
	 * @param permitDrillingBoreholeDepth the permit drilling borehole depth of this permit to drill a well
	 */
	@Override
	public void setPermitDrillingBoreholeDepth(
		String permitDrillingBoreholeDepth) {

		model.setPermitDrillingBoreholeDepth(permitDrillingBoreholeDepth);
	}

	/**
	 * Sets the permit drilling const method of this permit to drill a well.
	 *
	 * @param permitDrillingConstMethod the permit drilling const method of this permit to drill a well
	 */
	@Override
	public void setPermitDrillingConstMethod(String permitDrillingConstMethod) {
		model.setPermitDrillingConstMethod(permitDrillingConstMethod);
	}

	/**
	 * Sets the permit drilling contractor add of this permit to drill a well.
	 *
	 * @param permitDrillingContractorAdd the permit drilling contractor add of this permit to drill a well
	 */
	@Override
	public void setPermitDrillingContractorAdd(
		String permitDrillingContractorAdd) {

		model.setPermitDrillingContractorAdd(permitDrillingContractorAdd);
	}

	/**
	 * Sets the permit drilling contractor name of this permit to drill a well.
	 *
	 * @param permitDrillingContractorName the permit drilling contractor name of this permit to drill a well
	 */
	@Override
	public void setPermitDrillingContractorName(
		String permitDrillingContractorName) {

		model.setPermitDrillingContractorName(permitDrillingContractorName);
	}

	/**
	 * Sets the permit drilling cubic of this permit to drill a well.
	 *
	 * @param permitDrillingCubic the permit drilling cubic of this permit to drill a well
	 */
	@Override
	public void setPermitDrillingCubic(String permitDrillingCubic) {
		model.setPermitDrillingCubic(permitDrillingCubic);
	}

	/**
	 * Sets the permit drilling diameter borehole of this permit to drill a well.
	 *
	 * @param permitDrillingDiameterBorehole the permit drilling diameter borehole of this permit to drill a well
	 */
	@Override
	public void setPermitDrillingDiameterBorehole(
		String permitDrillingDiameterBorehole) {

		model.setPermitDrillingDiameterBorehole(permitDrillingDiameterBorehole);
	}

	/**
	 * Sets the permit drilling email address of this permit to drill a well.
	 *
	 * @param permitDrillingEmailAddress the permit drilling email address of this permit to drill a well
	 */
	@Override
	public void setPermitDrillingEmailAddress(
		String permitDrillingEmailAddress) {

		model.setPermitDrillingEmailAddress(permitDrillingEmailAddress);
	}

	/**
	 * Sets the permit drilling location of this permit to drill a well.
	 *
	 * @param permitDrillingLocation the permit drilling location of this permit to drill a well
	 */
	@Override
	public void setPermitDrillingLocation(String permitDrillingLocation) {
		model.setPermitDrillingLocation(permitDrillingLocation);
	}

	/**
	 * Sets the permit drilling mailing add parish of this permit to drill a well.
	 *
	 * @param permitDrillingMailingAddParish the permit drilling mailing add parish of this permit to drill a well
	 */
	@Override
	public void setPermitDrillingMailingAddParish(
		String permitDrillingMailingAddParish) {

		model.setPermitDrillingMailingAddParish(permitDrillingMailingAddParish);
	}

	/**
	 * Sets the permit drilling mailing address of this permit to drill a well.
	 *
	 * @param permitDrillingMailingAddress the permit drilling mailing address of this permit to drill a well
	 */
	@Override
	public void setPermitDrillingMailingAddress(
		String permitDrillingMailingAddress) {

		model.setPermitDrillingMailingAddress(permitDrillingMailingAddress);
	}

	/**
	 * Sets the permit drilling method of this permit to drill a well.
	 *
	 * @param permitDrillingMethod the permit drilling method of this permit to drill a well
	 */
	@Override
	public void setPermitDrillingMethod(String permitDrillingMethod) {
		model.setPermitDrillingMethod(permitDrillingMethod);
	}

	/**
	 * Sets the permit drilling mobile phone of this permit to drill a well.
	 *
	 * @param permitDrillingMobilePhone the permit drilling mobile phone of this permit to drill a well
	 */
	@Override
	public void setPermitDrillingMobilePhone(String permitDrillingMobilePhone) {
		model.setPermitDrillingMobilePhone(permitDrillingMobilePhone);
	}

	/**
	 * Sets the permit drilling nature of this permit to drill a well.
	 *
	 * @param permitDrillingNature the permit drilling nature of this permit to drill a well
	 */
	@Override
	public void setPermitDrillingNature(String permitDrillingNature) {
		model.setPermitDrillingNature(permitDrillingNature);
	}

	/**
	 * Sets the permit drilling office phone of this permit to drill a well.
	 *
	 * @param permitDrillingOfficePhone the permit drilling office phone of this permit to drill a well
	 */
	@Override
	public void setPermitDrillingOfficePhone(String permitDrillingOfficePhone) {
		model.setPermitDrillingOfficePhone(permitDrillingOfficePhone);
	}

	/**
	 * Sets the permit drilling purpose of this permit to drill a well.
	 *
	 * @param permitDrillingPurpose the permit drilling purpose of this permit to drill a well
	 */
	@Override
	public void setPermitDrillingPurpose(String permitDrillingPurpose) {
		model.setPermitDrillingPurpose(permitDrillingPurpose);
	}

	/**
	 * Sets the permit drilling sign date of this permit to drill a well.
	 *
	 * @param permitDrillingSignDate the permit drilling sign date of this permit to drill a well
	 */
	@Override
	public void setPermitDrillingSignDate(Date permitDrillingSignDate) {
		model.setPermitDrillingSignDate(permitDrillingSignDate);
	}

	/**
	 * Sets the permit drilling supplies of this permit to drill a well.
	 *
	 * @param permitDrillingSupplies the permit drilling supplies of this permit to drill a well
	 */
	@Override
	public void setPermitDrillingSupplies(String permitDrillingSupplies) {
		model.setPermitDrillingSupplies(permitDrillingSupplies);
	}

	/**
	 * Sets the permit drilling technical info of this permit to drill a well.
	 *
	 * @param permitDrillingTechnicalInfo the permit drilling technical info of this permit to drill a well
	 */
	@Override
	public void setPermitDrillingTechnicalInfo(
		String permitDrillingTechnicalInfo) {

		model.setPermitDrillingTechnicalInfo(permitDrillingTechnicalInfo);
	}

	/**
	 * Sets the permit drilling work location of this permit to drill a well.
	 *
	 * @param permitDrillingWorkLocation the permit drilling work location of this permit to drill a well
	 */
	@Override
	public void setPermitDrillingWorkLocation(
		String permitDrillingWorkLocation) {

		model.setPermitDrillingWorkLocation(permitDrillingWorkLocation);
	}

	/**
	 * Sets the primary key of this permit to drill a well.
	 *
	 * @param primaryKey the primary key of this permit to drill a well
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this permit to drill a well.
	 *
	 * @param userId the user ID of this permit to drill a well
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this permit to drill a well.
	 *
	 * @param userName the user name of this permit to drill a well
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this permit to drill a well.
	 *
	 * @param userUuid the user uuid of this permit to drill a well
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the well drilling home phone of this permit to drill a well.
	 *
	 * @param wellDrillingHomePhone the well drilling home phone of this permit to drill a well
	 */
	@Override
	public void setWellDrillingHomePhone(String wellDrillingHomePhone) {
		model.setWellDrillingHomePhone(wellDrillingHomePhone);
	}

	/**
	 * Sets the wra application ID of this permit to drill a well.
	 *
	 * @param wraApplicationId the wra application ID of this permit to drill a well
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
	protected PermitToDrillAWellWrapper wrap(
		PermitToDrillAWell permitToDrillAWell) {

		return new PermitToDrillAWellWrapper(permitToDrillAWell);
	}

}