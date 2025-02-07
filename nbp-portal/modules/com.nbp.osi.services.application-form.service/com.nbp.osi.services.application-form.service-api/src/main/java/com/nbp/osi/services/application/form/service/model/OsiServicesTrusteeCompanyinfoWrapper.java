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
 * This class is a wrapper for {@link OsiServicesTrusteeCompanyinfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeCompanyinfo
 * @generated
 */
public class OsiServicesTrusteeCompanyinfoWrapper
	extends BaseModelWrapper<OsiServicesTrusteeCompanyinfo>
	implements ModelWrapper<OsiServicesTrusteeCompanyinfo>,
			   OsiServicesTrusteeCompanyinfo {

	public OsiServicesTrusteeCompanyinfoWrapper(
		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo) {

		super(osiServicesTrusteeCompanyinfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("osiTrusId", getOsiTrusId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("comCorporationName", getComCorporationName());
		attributes.put("comHeadOfficeAddress", getComHeadOfficeAddress());
		attributes.put("comTeleNo", getComTeleNo());
		attributes.put("comFaxNo", getComFaxNo());
		attributes.put("comEmail", getComEmail());
		attributes.put("otherCountry", getOtherCountry());
		attributes.put("comIncorporationDate", getComIncorporationDate());
		attributes.put("comLicenceRequest", getComLicenceRequest());
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

		Long osiTrusId = (Long)attributes.get("osiTrusId");

		if (osiTrusId != null) {
			setOsiTrusId(osiTrusId);
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

		String comCorporationName = (String)attributes.get(
			"comCorporationName");

		if (comCorporationName != null) {
			setComCorporationName(comCorporationName);
		}

		String comHeadOfficeAddress = (String)attributes.get(
			"comHeadOfficeAddress");

		if (comHeadOfficeAddress != null) {
			setComHeadOfficeAddress(comHeadOfficeAddress);
		}

		String comTeleNo = (String)attributes.get("comTeleNo");

		if (comTeleNo != null) {
			setComTeleNo(comTeleNo);
		}

		String comFaxNo = (String)attributes.get("comFaxNo");

		if (comFaxNo != null) {
			setComFaxNo(comFaxNo);
		}

		String comEmail = (String)attributes.get("comEmail");

		if (comEmail != null) {
			setComEmail(comEmail);
		}

		String otherCountry = (String)attributes.get("otherCountry");

		if (otherCountry != null) {
			setOtherCountry(otherCountry);
		}

		Date comIncorporationDate = (Date)attributes.get(
			"comIncorporationDate");

		if (comIncorporationDate != null) {
			setComIncorporationDate(comIncorporationDate);
		}

		String comLicenceRequest = (String)attributes.get("comLicenceRequest");

		if (comLicenceRequest != null) {
			setComLicenceRequest(comLicenceRequest);
		}

		Long osiServicesApplicationId = (Long)attributes.get(
			"osiServicesApplicationId");

		if (osiServicesApplicationId != null) {
			setOsiServicesApplicationId(osiServicesApplicationId);
		}
	}

	@Override
	public OsiServicesTrusteeCompanyinfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the com corporation name of this osi services trustee companyinfo.
	 *
	 * @return the com corporation name of this osi services trustee companyinfo
	 */
	@Override
	public String getComCorporationName() {
		return model.getComCorporationName();
	}

	/**
	 * Returns the com email of this osi services trustee companyinfo.
	 *
	 * @return the com email of this osi services trustee companyinfo
	 */
	@Override
	public String getComEmail() {
		return model.getComEmail();
	}

	/**
	 * Returns the com fax no of this osi services trustee companyinfo.
	 *
	 * @return the com fax no of this osi services trustee companyinfo
	 */
	@Override
	public String getComFaxNo() {
		return model.getComFaxNo();
	}

	/**
	 * Returns the com head office address of this osi services trustee companyinfo.
	 *
	 * @return the com head office address of this osi services trustee companyinfo
	 */
	@Override
	public String getComHeadOfficeAddress() {
		return model.getComHeadOfficeAddress();
	}

	/**
	 * Returns the com incorporation date of this osi services trustee companyinfo.
	 *
	 * @return the com incorporation date of this osi services trustee companyinfo
	 */
	@Override
	public Date getComIncorporationDate() {
		return model.getComIncorporationDate();
	}

	/**
	 * Returns the com licence request of this osi services trustee companyinfo.
	 *
	 * @return the com licence request of this osi services trustee companyinfo
	 */
	@Override
	public String getComLicenceRequest() {
		return model.getComLicenceRequest();
	}

	/**
	 * Returns the company ID of this osi services trustee companyinfo.
	 *
	 * @return the company ID of this osi services trustee companyinfo
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the com tele no of this osi services trustee companyinfo.
	 *
	 * @return the com tele no of this osi services trustee companyinfo
	 */
	@Override
	public String getComTeleNo() {
		return model.getComTeleNo();
	}

	/**
	 * Returns the create date of this osi services trustee companyinfo.
	 *
	 * @return the create date of this osi services trustee companyinfo
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this osi services trustee companyinfo.
	 *
	 * @return the group ID of this osi services trustee companyinfo
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this osi services trustee companyinfo.
	 *
	 * @return the modified date of this osi services trustee companyinfo
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi services application ID of this osi services trustee companyinfo.
	 *
	 * @return the osi services application ID of this osi services trustee companyinfo
	 */
	@Override
	public long getOsiServicesApplicationId() {
		return model.getOsiServicesApplicationId();
	}

	/**
	 * Returns the osi trus ID of this osi services trustee companyinfo.
	 *
	 * @return the osi trus ID of this osi services trustee companyinfo
	 */
	@Override
	public long getOsiTrusId() {
		return model.getOsiTrusId();
	}

	/**
	 * Returns the other country of this osi services trustee companyinfo.
	 *
	 * @return the other country of this osi services trustee companyinfo
	 */
	@Override
	public String getOtherCountry() {
		return model.getOtherCountry();
	}

	/**
	 * Returns the primary key of this osi services trustee companyinfo.
	 *
	 * @return the primary key of this osi services trustee companyinfo
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this osi services trustee companyinfo.
	 *
	 * @return the user ID of this osi services trustee companyinfo
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi services trustee companyinfo.
	 *
	 * @return the user name of this osi services trustee companyinfo
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi services trustee companyinfo.
	 *
	 * @return the user uuid of this osi services trustee companyinfo
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this osi services trustee companyinfo.
	 *
	 * @return the uuid of this osi services trustee companyinfo
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
	 * Sets the com corporation name of this osi services trustee companyinfo.
	 *
	 * @param comCorporationName the com corporation name of this osi services trustee companyinfo
	 */
	@Override
	public void setComCorporationName(String comCorporationName) {
		model.setComCorporationName(comCorporationName);
	}

	/**
	 * Sets the com email of this osi services trustee companyinfo.
	 *
	 * @param comEmail the com email of this osi services trustee companyinfo
	 */
	@Override
	public void setComEmail(String comEmail) {
		model.setComEmail(comEmail);
	}

	/**
	 * Sets the com fax no of this osi services trustee companyinfo.
	 *
	 * @param comFaxNo the com fax no of this osi services trustee companyinfo
	 */
	@Override
	public void setComFaxNo(String comFaxNo) {
		model.setComFaxNo(comFaxNo);
	}

	/**
	 * Sets the com head office address of this osi services trustee companyinfo.
	 *
	 * @param comHeadOfficeAddress the com head office address of this osi services trustee companyinfo
	 */
	@Override
	public void setComHeadOfficeAddress(String comHeadOfficeAddress) {
		model.setComHeadOfficeAddress(comHeadOfficeAddress);
	}

	/**
	 * Sets the com incorporation date of this osi services trustee companyinfo.
	 *
	 * @param comIncorporationDate the com incorporation date of this osi services trustee companyinfo
	 */
	@Override
	public void setComIncorporationDate(Date comIncorporationDate) {
		model.setComIncorporationDate(comIncorporationDate);
	}

	/**
	 * Sets the com licence request of this osi services trustee companyinfo.
	 *
	 * @param comLicenceRequest the com licence request of this osi services trustee companyinfo
	 */
	@Override
	public void setComLicenceRequest(String comLicenceRequest) {
		model.setComLicenceRequest(comLicenceRequest);
	}

	/**
	 * Sets the company ID of this osi services trustee companyinfo.
	 *
	 * @param companyId the company ID of this osi services trustee companyinfo
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the com tele no of this osi services trustee companyinfo.
	 *
	 * @param comTeleNo the com tele no of this osi services trustee companyinfo
	 */
	@Override
	public void setComTeleNo(String comTeleNo) {
		model.setComTeleNo(comTeleNo);
	}

	/**
	 * Sets the create date of this osi services trustee companyinfo.
	 *
	 * @param createDate the create date of this osi services trustee companyinfo
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this osi services trustee companyinfo.
	 *
	 * @param groupId the group ID of this osi services trustee companyinfo
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this osi services trustee companyinfo.
	 *
	 * @param modifiedDate the modified date of this osi services trustee companyinfo
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi services application ID of this osi services trustee companyinfo.
	 *
	 * @param osiServicesApplicationId the osi services application ID of this osi services trustee companyinfo
	 */
	@Override
	public void setOsiServicesApplicationId(long osiServicesApplicationId) {
		model.setOsiServicesApplicationId(osiServicesApplicationId);
	}

	/**
	 * Sets the osi trus ID of this osi services trustee companyinfo.
	 *
	 * @param osiTrusId the osi trus ID of this osi services trustee companyinfo
	 */
	@Override
	public void setOsiTrusId(long osiTrusId) {
		model.setOsiTrusId(osiTrusId);
	}

	/**
	 * Sets the other country of this osi services trustee companyinfo.
	 *
	 * @param otherCountry the other country of this osi services trustee companyinfo
	 */
	@Override
	public void setOtherCountry(String otherCountry) {
		model.setOtherCountry(otherCountry);
	}

	/**
	 * Sets the primary key of this osi services trustee companyinfo.
	 *
	 * @param primaryKey the primary key of this osi services trustee companyinfo
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this osi services trustee companyinfo.
	 *
	 * @param userId the user ID of this osi services trustee companyinfo
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi services trustee companyinfo.
	 *
	 * @param userName the user name of this osi services trustee companyinfo
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi services trustee companyinfo.
	 *
	 * @param userUuid the user uuid of this osi services trustee companyinfo
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this osi services trustee companyinfo.
	 *
	 * @param uuid the uuid of this osi services trustee companyinfo
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
	protected OsiServicesTrusteeCompanyinfoWrapper wrap(
		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo) {

		return new OsiServicesTrusteeCompanyinfoWrapper(
			osiServicesTrusteeCompanyinfo);
	}

}