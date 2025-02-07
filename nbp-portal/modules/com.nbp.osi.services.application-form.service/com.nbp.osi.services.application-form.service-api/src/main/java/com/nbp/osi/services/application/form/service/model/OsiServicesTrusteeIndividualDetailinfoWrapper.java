/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OsiServicesTrusteeIndividualDetailinfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeIndividualDetailinfo
 * @generated
 */
public class OsiServicesTrusteeIndividualDetailinfoWrapper
	extends BaseModelWrapper<OsiServicesTrusteeIndividualDetailinfo>
	implements ModelWrapper<OsiServicesTrusteeIndividualDetailinfo>,
			   OsiServicesTrusteeIndividualDetailinfo {

	public OsiServicesTrusteeIndividualDetailinfoWrapper(
		OsiServicesTrusteeIndividualDetailinfo
			osiServicesTrusteeIndividualDetailinfo) {

		super(osiServicesTrusteeIndividualDetailinfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("osTIId", getOsTIId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("indiFamilyName", getIndiFamilyName());
		attributes.put("indiGivenName", getIndiGivenName());
		attributes.put("indiDateOfBirth", getIndiDateOfBirth());
		attributes.put("indiOtherLegalNames", getIndiOtherLegalNames());
		attributes.put("indiBusinessAddress", getIndiBusinessAddress());
		attributes.put("indiBusinessTeleNo", getIndiBusinessTeleNo());
		attributes.put("indiBusinessFaxNo", getIndiBusinessFaxNo());
		attributes.put("indiBusinessEmail", getIndiBusinessEmail());
		attributes.put("indiHomeAddress", getIndiHomeAddress());
		attributes.put("indiHomeTeleNo", getIndiHomeTeleNo());
		attributes.put("indiHomeFaxNo", getIndiHomeFaxNo());
		attributes.put("indiHomeEmail", getIndiHomeEmail());
		attributes.put("indiCurrentEmployer", getIndiCurrentEmployer());
		attributes.put("indiDateOfEmployment", getIndiDateOfEmployment());
		attributes.put("indiProfessionalOrg", getIndiProfessionalOrg());
		attributes.put(
			"osiServicesApplicationId", getOsiServicesApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long osTIId = (Long)attributes.get("osTIId");

		if (osTIId != null) {
			setOsTIId(osTIId);
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

		String indiFamilyName = (String)attributes.get("indiFamilyName");

		if (indiFamilyName != null) {
			setIndiFamilyName(indiFamilyName);
		}

		String indiGivenName = (String)attributes.get("indiGivenName");

		if (indiGivenName != null) {
			setIndiGivenName(indiGivenName);
		}

		Date indiDateOfBirth = (Date)attributes.get("indiDateOfBirth");

		if (indiDateOfBirth != null) {
			setIndiDateOfBirth(indiDateOfBirth);
		}

		String indiOtherLegalNames = (String)attributes.get(
			"indiOtherLegalNames");

		if (indiOtherLegalNames != null) {
			setIndiOtherLegalNames(indiOtherLegalNames);
		}

		String indiBusinessAddress = (String)attributes.get(
			"indiBusinessAddress");

		if (indiBusinessAddress != null) {
			setIndiBusinessAddress(indiBusinessAddress);
		}

		String indiBusinessTeleNo = (String)attributes.get(
			"indiBusinessTeleNo");

		if (indiBusinessTeleNo != null) {
			setIndiBusinessTeleNo(indiBusinessTeleNo);
		}

		String indiBusinessFaxNo = (String)attributes.get("indiBusinessFaxNo");

		if (indiBusinessFaxNo != null) {
			setIndiBusinessFaxNo(indiBusinessFaxNo);
		}

		String indiBusinessEmail = (String)attributes.get("indiBusinessEmail");

		if (indiBusinessEmail != null) {
			setIndiBusinessEmail(indiBusinessEmail);
		}

		String indiHomeAddress = (String)attributes.get("indiHomeAddress");

		if (indiHomeAddress != null) {
			setIndiHomeAddress(indiHomeAddress);
		}

		String indiHomeTeleNo = (String)attributes.get("indiHomeTeleNo");

		if (indiHomeTeleNo != null) {
			setIndiHomeTeleNo(indiHomeTeleNo);
		}

		String indiHomeFaxNo = (String)attributes.get("indiHomeFaxNo");

		if (indiHomeFaxNo != null) {
			setIndiHomeFaxNo(indiHomeFaxNo);
		}

		String indiHomeEmail = (String)attributes.get("indiHomeEmail");

		if (indiHomeEmail != null) {
			setIndiHomeEmail(indiHomeEmail);
		}

		String indiCurrentEmployer = (String)attributes.get(
			"indiCurrentEmployer");

		if (indiCurrentEmployer != null) {
			setIndiCurrentEmployer(indiCurrentEmployer);
		}

		Date indiDateOfEmployment = (Date)attributes.get(
			"indiDateOfEmployment");

		if (indiDateOfEmployment != null) {
			setIndiDateOfEmployment(indiDateOfEmployment);
		}

		String indiProfessionalOrg = (String)attributes.get(
			"indiProfessionalOrg");

		if (indiProfessionalOrg != null) {
			setIndiProfessionalOrg(indiProfessionalOrg);
		}

		Long osiServicesApplicationId = (Long)attributes.get(
			"osiServicesApplicationId");

		if (osiServicesApplicationId != null) {
			setOsiServicesApplicationId(osiServicesApplicationId);
		}
	}

	@Override
	public OsiServicesTrusteeIndividualDetailinfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this osi services trustee individual detailinfo.
	 *
	 * @return the company ID of this osi services trustee individual detailinfo
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi services trustee individual detailinfo.
	 *
	 * @return the create date of this osi services trustee individual detailinfo
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this osi services trustee individual detailinfo.
	 *
	 * @return the group ID of this osi services trustee individual detailinfo
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the indi business address of this osi services trustee individual detailinfo.
	 *
	 * @return the indi business address of this osi services trustee individual detailinfo
	 */
	@Override
	public String getIndiBusinessAddress() {
		return model.getIndiBusinessAddress();
	}

	/**
	 * Returns the indi business email of this osi services trustee individual detailinfo.
	 *
	 * @return the indi business email of this osi services trustee individual detailinfo
	 */
	@Override
	public String getIndiBusinessEmail() {
		return model.getIndiBusinessEmail();
	}

	/**
	 * Returns the indi business fax no of this osi services trustee individual detailinfo.
	 *
	 * @return the indi business fax no of this osi services trustee individual detailinfo
	 */
	@Override
	public String getIndiBusinessFaxNo() {
		return model.getIndiBusinessFaxNo();
	}

	/**
	 * Returns the indi business tele no of this osi services trustee individual detailinfo.
	 *
	 * @return the indi business tele no of this osi services trustee individual detailinfo
	 */
	@Override
	public String getIndiBusinessTeleNo() {
		return model.getIndiBusinessTeleNo();
	}

	/**
	 * Returns the indi current employer of this osi services trustee individual detailinfo.
	 *
	 * @return the indi current employer of this osi services trustee individual detailinfo
	 */
	@Override
	public String getIndiCurrentEmployer() {
		return model.getIndiCurrentEmployer();
	}

	/**
	 * Returns the indi date of birth of this osi services trustee individual detailinfo.
	 *
	 * @return the indi date of birth of this osi services trustee individual detailinfo
	 */
	@Override
	public Date getIndiDateOfBirth() {
		return model.getIndiDateOfBirth();
	}

	/**
	 * Returns the indi date of employment of this osi services trustee individual detailinfo.
	 *
	 * @return the indi date of employment of this osi services trustee individual detailinfo
	 */
	@Override
	public Date getIndiDateOfEmployment() {
		return model.getIndiDateOfEmployment();
	}

	/**
	 * Returns the indi family name of this osi services trustee individual detailinfo.
	 *
	 * @return the indi family name of this osi services trustee individual detailinfo
	 */
	@Override
	public String getIndiFamilyName() {
		return model.getIndiFamilyName();
	}

	/**
	 * Returns the indi given name of this osi services trustee individual detailinfo.
	 *
	 * @return the indi given name of this osi services trustee individual detailinfo
	 */
	@Override
	public String getIndiGivenName() {
		return model.getIndiGivenName();
	}

	/**
	 * Returns the indi home address of this osi services trustee individual detailinfo.
	 *
	 * @return the indi home address of this osi services trustee individual detailinfo
	 */
	@Override
	public String getIndiHomeAddress() {
		return model.getIndiHomeAddress();
	}

	/**
	 * Returns the indi home email of this osi services trustee individual detailinfo.
	 *
	 * @return the indi home email of this osi services trustee individual detailinfo
	 */
	@Override
	public String getIndiHomeEmail() {
		return model.getIndiHomeEmail();
	}

	/**
	 * Returns the indi home fax no of this osi services trustee individual detailinfo.
	 *
	 * @return the indi home fax no of this osi services trustee individual detailinfo
	 */
	@Override
	public String getIndiHomeFaxNo() {
		return model.getIndiHomeFaxNo();
	}

	/**
	 * Returns the indi home tele no of this osi services trustee individual detailinfo.
	 *
	 * @return the indi home tele no of this osi services trustee individual detailinfo
	 */
	@Override
	public String getIndiHomeTeleNo() {
		return model.getIndiHomeTeleNo();
	}

	/**
	 * Returns the indi other legal names of this osi services trustee individual detailinfo.
	 *
	 * @return the indi other legal names of this osi services trustee individual detailinfo
	 */
	@Override
	public String getIndiOtherLegalNames() {
		return model.getIndiOtherLegalNames();
	}

	/**
	 * Returns the indi professional org of this osi services trustee individual detailinfo.
	 *
	 * @return the indi professional org of this osi services trustee individual detailinfo
	 */
	@Override
	public String getIndiProfessionalOrg() {
		return model.getIndiProfessionalOrg();
	}

	/**
	 * Returns the modified date of this osi services trustee individual detailinfo.
	 *
	 * @return the modified date of this osi services trustee individual detailinfo
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi services application ID of this osi services trustee individual detailinfo.
	 *
	 * @return the osi services application ID of this osi services trustee individual detailinfo
	 */
	@Override
	public long getOsiServicesApplicationId() {
		return model.getOsiServicesApplicationId();
	}

	/**
	 * Returns the os ti ID of this osi services trustee individual detailinfo.
	 *
	 * @return the os ti ID of this osi services trustee individual detailinfo
	 */
	@Override
	public long getOsTIId() {
		return model.getOsTIId();
	}

	/**
	 * Returns the primary key of this osi services trustee individual detailinfo.
	 *
	 * @return the primary key of this osi services trustee individual detailinfo
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this osi services trustee individual detailinfo.
	 *
	 * @return the user ID of this osi services trustee individual detailinfo
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi services trustee individual detailinfo.
	 *
	 * @return the user name of this osi services trustee individual detailinfo
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi services trustee individual detailinfo.
	 *
	 * @return the user uuid of this osi services trustee individual detailinfo
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this osi services trustee individual detailinfo.
	 *
	 * @return the uuid of this osi services trustee individual detailinfo
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this osi services trustee individual detailinfo.
	 *
	 * @param companyId the company ID of this osi services trustee individual detailinfo
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi services trustee individual detailinfo.
	 *
	 * @param createDate the create date of this osi services trustee individual detailinfo
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this osi services trustee individual detailinfo.
	 *
	 * @param groupId the group ID of this osi services trustee individual detailinfo
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the indi business address of this osi services trustee individual detailinfo.
	 *
	 * @param indiBusinessAddress the indi business address of this osi services trustee individual detailinfo
	 */
	@Override
	public void setIndiBusinessAddress(String indiBusinessAddress) {
		model.setIndiBusinessAddress(indiBusinessAddress);
	}

	/**
	 * Sets the indi business email of this osi services trustee individual detailinfo.
	 *
	 * @param indiBusinessEmail the indi business email of this osi services trustee individual detailinfo
	 */
	@Override
	public void setIndiBusinessEmail(String indiBusinessEmail) {
		model.setIndiBusinessEmail(indiBusinessEmail);
	}

	/**
	 * Sets the indi business fax no of this osi services trustee individual detailinfo.
	 *
	 * @param indiBusinessFaxNo the indi business fax no of this osi services trustee individual detailinfo
	 */
	@Override
	public void setIndiBusinessFaxNo(String indiBusinessFaxNo) {
		model.setIndiBusinessFaxNo(indiBusinessFaxNo);
	}

	/**
	 * Sets the indi business tele no of this osi services trustee individual detailinfo.
	 *
	 * @param indiBusinessTeleNo the indi business tele no of this osi services trustee individual detailinfo
	 */
	@Override
	public void setIndiBusinessTeleNo(String indiBusinessTeleNo) {
		model.setIndiBusinessTeleNo(indiBusinessTeleNo);
	}

	/**
	 * Sets the indi current employer of this osi services trustee individual detailinfo.
	 *
	 * @param indiCurrentEmployer the indi current employer of this osi services trustee individual detailinfo
	 */
	@Override
	public void setIndiCurrentEmployer(String indiCurrentEmployer) {
		model.setIndiCurrentEmployer(indiCurrentEmployer);
	}

	/**
	 * Sets the indi date of birth of this osi services trustee individual detailinfo.
	 *
	 * @param indiDateOfBirth the indi date of birth of this osi services trustee individual detailinfo
	 */
	@Override
	public void setIndiDateOfBirth(Date indiDateOfBirth) {
		model.setIndiDateOfBirth(indiDateOfBirth);
	}

	/**
	 * Sets the indi date of employment of this osi services trustee individual detailinfo.
	 *
	 * @param indiDateOfEmployment the indi date of employment of this osi services trustee individual detailinfo
	 */
	@Override
	public void setIndiDateOfEmployment(Date indiDateOfEmployment) {
		model.setIndiDateOfEmployment(indiDateOfEmployment);
	}

	/**
	 * Sets the indi family name of this osi services trustee individual detailinfo.
	 *
	 * @param indiFamilyName the indi family name of this osi services trustee individual detailinfo
	 */
	@Override
	public void setIndiFamilyName(String indiFamilyName) {
		model.setIndiFamilyName(indiFamilyName);
	}

	/**
	 * Sets the indi given name of this osi services trustee individual detailinfo.
	 *
	 * @param indiGivenName the indi given name of this osi services trustee individual detailinfo
	 */
	@Override
	public void setIndiGivenName(String indiGivenName) {
		model.setIndiGivenName(indiGivenName);
	}

	/**
	 * Sets the indi home address of this osi services trustee individual detailinfo.
	 *
	 * @param indiHomeAddress the indi home address of this osi services trustee individual detailinfo
	 */
	@Override
	public void setIndiHomeAddress(String indiHomeAddress) {
		model.setIndiHomeAddress(indiHomeAddress);
	}

	/**
	 * Sets the indi home email of this osi services trustee individual detailinfo.
	 *
	 * @param indiHomeEmail the indi home email of this osi services trustee individual detailinfo
	 */
	@Override
	public void setIndiHomeEmail(String indiHomeEmail) {
		model.setIndiHomeEmail(indiHomeEmail);
	}

	/**
	 * Sets the indi home fax no of this osi services trustee individual detailinfo.
	 *
	 * @param indiHomeFaxNo the indi home fax no of this osi services trustee individual detailinfo
	 */
	@Override
	public void setIndiHomeFaxNo(String indiHomeFaxNo) {
		model.setIndiHomeFaxNo(indiHomeFaxNo);
	}

	/**
	 * Sets the indi home tele no of this osi services trustee individual detailinfo.
	 *
	 * @param indiHomeTeleNo the indi home tele no of this osi services trustee individual detailinfo
	 */
	@Override
	public void setIndiHomeTeleNo(String indiHomeTeleNo) {
		model.setIndiHomeTeleNo(indiHomeTeleNo);
	}

	/**
	 * Sets the indi other legal names of this osi services trustee individual detailinfo.
	 *
	 * @param indiOtherLegalNames the indi other legal names of this osi services trustee individual detailinfo
	 */
	@Override
	public void setIndiOtherLegalNames(String indiOtherLegalNames) {
		model.setIndiOtherLegalNames(indiOtherLegalNames);
	}

	/**
	 * Sets the indi professional org of this osi services trustee individual detailinfo.
	 *
	 * @param indiProfessionalOrg the indi professional org of this osi services trustee individual detailinfo
	 */
	@Override
	public void setIndiProfessionalOrg(String indiProfessionalOrg) {
		model.setIndiProfessionalOrg(indiProfessionalOrg);
	}

	/**
	 * Sets the modified date of this osi services trustee individual detailinfo.
	 *
	 * @param modifiedDate the modified date of this osi services trustee individual detailinfo
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi services application ID of this osi services trustee individual detailinfo.
	 *
	 * @param osiServicesApplicationId the osi services application ID of this osi services trustee individual detailinfo
	 */
	@Override
	public void setOsiServicesApplicationId(long osiServicesApplicationId) {
		model.setOsiServicesApplicationId(osiServicesApplicationId);
	}

	/**
	 * Sets the os ti ID of this osi services trustee individual detailinfo.
	 *
	 * @param osTIId the os ti ID of this osi services trustee individual detailinfo
	 */
	@Override
	public void setOsTIId(long osTIId) {
		model.setOsTIId(osTIId);
	}

	/**
	 * Sets the primary key of this osi services trustee individual detailinfo.
	 *
	 * @param primaryKey the primary key of this osi services trustee individual detailinfo
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this osi services trustee individual detailinfo.
	 *
	 * @param userId the user ID of this osi services trustee individual detailinfo
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi services trustee individual detailinfo.
	 *
	 * @param userName the user name of this osi services trustee individual detailinfo
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi services trustee individual detailinfo.
	 *
	 * @param userUuid the user uuid of this osi services trustee individual detailinfo
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this osi services trustee individual detailinfo.
	 *
	 * @param uuid the uuid of this osi services trustee individual detailinfo
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected OsiServicesTrusteeIndividualDetailinfoWrapper wrap(
		OsiServicesTrusteeIndividualDetailinfo
			osiServicesTrusteeIndividualDetailinfo) {

		return new OsiServicesTrusteeIndividualDetailinfoWrapper(
			osiServicesTrusteeIndividualDetailinfo);
	}

}