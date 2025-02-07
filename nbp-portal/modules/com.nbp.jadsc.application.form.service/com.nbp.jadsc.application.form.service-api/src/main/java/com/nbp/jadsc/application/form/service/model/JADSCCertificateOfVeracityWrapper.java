/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link JADSCCertificateOfVeracity}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfVeracity
 * @generated
 */
public class JADSCCertificateOfVeracityWrapper
	extends BaseModelWrapper<JADSCCertificateOfVeracity>
	implements JADSCCertificateOfVeracity,
			   ModelWrapper<JADSCCertificateOfVeracity> {

	public JADSCCertificateOfVeracityWrapper(
		JADSCCertificateOfVeracity jadscCertificateOfVeracity) {

		super(jadscCertificateOfVeracity);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("jadscCOVId", getJadscCOVId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("veracityComName", getVeracityComName());
		attributes.put("veracityComPosition", getVeracityComPosition());
		attributes.put("veracityComCompany", getVeracityComCompany());
		attributes.put("veracitySignedDate", getVeracitySignedDate());
		attributes.put("veracitySignedTelephone", getVeracitySignedTelephone());
		attributes.put("veracitySignedFax", getVeracitySignedFax());
		attributes.put("veracitySignedAddress", getVeracitySignedAddress());
		attributes.put("jadscApplicationId", getJadscApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long jadscCOVId = (Long)attributes.get("jadscCOVId");

		if (jadscCOVId != null) {
			setJadscCOVId(jadscCOVId);
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

		String veracityComName = (String)attributes.get("veracityComName");

		if (veracityComName != null) {
			setVeracityComName(veracityComName);
		}

		String veracityComPosition = (String)attributes.get(
			"veracityComPosition");

		if (veracityComPosition != null) {
			setVeracityComPosition(veracityComPosition);
		}

		String veracityComCompany = (String)attributes.get(
			"veracityComCompany");

		if (veracityComCompany != null) {
			setVeracityComCompany(veracityComCompany);
		}

		Date veracitySignedDate = (Date)attributes.get("veracitySignedDate");

		if (veracitySignedDate != null) {
			setVeracitySignedDate(veracitySignedDate);
		}

		String veracitySignedTelephone = (String)attributes.get(
			"veracitySignedTelephone");

		if (veracitySignedTelephone != null) {
			setVeracitySignedTelephone(veracitySignedTelephone);
		}

		String veracitySignedFax = (String)attributes.get("veracitySignedFax");

		if (veracitySignedFax != null) {
			setVeracitySignedFax(veracitySignedFax);
		}

		String veracitySignedAddress = (String)attributes.get(
			"veracitySignedAddress");

		if (veracitySignedAddress != null) {
			setVeracitySignedAddress(veracitySignedAddress);
		}

		Long jadscApplicationId = (Long)attributes.get("jadscApplicationId");

		if (jadscApplicationId != null) {
			setJadscApplicationId(jadscApplicationId);
		}
	}

	@Override
	public JADSCCertificateOfVeracity cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this jadsc certificate of veracity.
	 *
	 * @return the company ID of this jadsc certificate of veracity
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this jadsc certificate of veracity.
	 *
	 * @return the create date of this jadsc certificate of veracity
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this jadsc certificate of veracity.
	 *
	 * @return the group ID of this jadsc certificate of veracity
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jadsc application ID of this jadsc certificate of veracity.
	 *
	 * @return the jadsc application ID of this jadsc certificate of veracity
	 */
	@Override
	public long getJadscApplicationId() {
		return model.getJadscApplicationId();
	}

	/**
	 * Returns the jadsc cov ID of this jadsc certificate of veracity.
	 *
	 * @return the jadsc cov ID of this jadsc certificate of veracity
	 */
	@Override
	public long getJadscCOVId() {
		return model.getJadscCOVId();
	}

	/**
	 * Returns the modified date of this jadsc certificate of veracity.
	 *
	 * @return the modified date of this jadsc certificate of veracity
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this jadsc certificate of veracity.
	 *
	 * @return the primary key of this jadsc certificate of veracity
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this jadsc certificate of veracity.
	 *
	 * @return the user ID of this jadsc certificate of veracity
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jadsc certificate of veracity.
	 *
	 * @return the user name of this jadsc certificate of veracity
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jadsc certificate of veracity.
	 *
	 * @return the user uuid of this jadsc certificate of veracity
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this jadsc certificate of veracity.
	 *
	 * @return the uuid of this jadsc certificate of veracity
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the veracity com company of this jadsc certificate of veracity.
	 *
	 * @return the veracity com company of this jadsc certificate of veracity
	 */
	@Override
	public String getVeracityComCompany() {
		return model.getVeracityComCompany();
	}

	/**
	 * Returns the veracity com name of this jadsc certificate of veracity.
	 *
	 * @return the veracity com name of this jadsc certificate of veracity
	 */
	@Override
	public String getVeracityComName() {
		return model.getVeracityComName();
	}

	/**
	 * Returns the veracity com position of this jadsc certificate of veracity.
	 *
	 * @return the veracity com position of this jadsc certificate of veracity
	 */
	@Override
	public String getVeracityComPosition() {
		return model.getVeracityComPosition();
	}

	/**
	 * Returns the veracity signed address of this jadsc certificate of veracity.
	 *
	 * @return the veracity signed address of this jadsc certificate of veracity
	 */
	@Override
	public String getVeracitySignedAddress() {
		return model.getVeracitySignedAddress();
	}

	/**
	 * Returns the veracity signed date of this jadsc certificate of veracity.
	 *
	 * @return the veracity signed date of this jadsc certificate of veracity
	 */
	@Override
	public Date getVeracitySignedDate() {
		return model.getVeracitySignedDate();
	}

	/**
	 * Returns the veracity signed fax of this jadsc certificate of veracity.
	 *
	 * @return the veracity signed fax of this jadsc certificate of veracity
	 */
	@Override
	public String getVeracitySignedFax() {
		return model.getVeracitySignedFax();
	}

	/**
	 * Returns the veracity signed telephone of this jadsc certificate of veracity.
	 *
	 * @return the veracity signed telephone of this jadsc certificate of veracity
	 */
	@Override
	public String getVeracitySignedTelephone() {
		return model.getVeracitySignedTelephone();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this jadsc certificate of veracity.
	 *
	 * @param companyId the company ID of this jadsc certificate of veracity
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this jadsc certificate of veracity.
	 *
	 * @param createDate the create date of this jadsc certificate of veracity
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this jadsc certificate of veracity.
	 *
	 * @param groupId the group ID of this jadsc certificate of veracity
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jadsc application ID of this jadsc certificate of veracity.
	 *
	 * @param jadscApplicationId the jadsc application ID of this jadsc certificate of veracity
	 */
	@Override
	public void setJadscApplicationId(long jadscApplicationId) {
		model.setJadscApplicationId(jadscApplicationId);
	}

	/**
	 * Sets the jadsc cov ID of this jadsc certificate of veracity.
	 *
	 * @param jadscCOVId the jadsc cov ID of this jadsc certificate of veracity
	 */
	@Override
	public void setJadscCOVId(long jadscCOVId) {
		model.setJadscCOVId(jadscCOVId);
	}

	/**
	 * Sets the modified date of this jadsc certificate of veracity.
	 *
	 * @param modifiedDate the modified date of this jadsc certificate of veracity
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this jadsc certificate of veracity.
	 *
	 * @param primaryKey the primary key of this jadsc certificate of veracity
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this jadsc certificate of veracity.
	 *
	 * @param userId the user ID of this jadsc certificate of veracity
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jadsc certificate of veracity.
	 *
	 * @param userName the user name of this jadsc certificate of veracity
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jadsc certificate of veracity.
	 *
	 * @param userUuid the user uuid of this jadsc certificate of veracity
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this jadsc certificate of veracity.
	 *
	 * @param uuid the uuid of this jadsc certificate of veracity
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the veracity com company of this jadsc certificate of veracity.
	 *
	 * @param veracityComCompany the veracity com company of this jadsc certificate of veracity
	 */
	@Override
	public void setVeracityComCompany(String veracityComCompany) {
		model.setVeracityComCompany(veracityComCompany);
	}

	/**
	 * Sets the veracity com name of this jadsc certificate of veracity.
	 *
	 * @param veracityComName the veracity com name of this jadsc certificate of veracity
	 */
	@Override
	public void setVeracityComName(String veracityComName) {
		model.setVeracityComName(veracityComName);
	}

	/**
	 * Sets the veracity com position of this jadsc certificate of veracity.
	 *
	 * @param veracityComPosition the veracity com position of this jadsc certificate of veracity
	 */
	@Override
	public void setVeracityComPosition(String veracityComPosition) {
		model.setVeracityComPosition(veracityComPosition);
	}

	/**
	 * Sets the veracity signed address of this jadsc certificate of veracity.
	 *
	 * @param veracitySignedAddress the veracity signed address of this jadsc certificate of veracity
	 */
	@Override
	public void setVeracitySignedAddress(String veracitySignedAddress) {
		model.setVeracitySignedAddress(veracitySignedAddress);
	}

	/**
	 * Sets the veracity signed date of this jadsc certificate of veracity.
	 *
	 * @param veracitySignedDate the veracity signed date of this jadsc certificate of veracity
	 */
	@Override
	public void setVeracitySignedDate(Date veracitySignedDate) {
		model.setVeracitySignedDate(veracitySignedDate);
	}

	/**
	 * Sets the veracity signed fax of this jadsc certificate of veracity.
	 *
	 * @param veracitySignedFax the veracity signed fax of this jadsc certificate of veracity
	 */
	@Override
	public void setVeracitySignedFax(String veracitySignedFax) {
		model.setVeracitySignedFax(veracitySignedFax);
	}

	/**
	 * Sets the veracity signed telephone of this jadsc certificate of veracity.
	 *
	 * @param veracitySignedTelephone the veracity signed telephone of this jadsc certificate of veracity
	 */
	@Override
	public void setVeracitySignedTelephone(String veracitySignedTelephone) {
		model.setVeracitySignedTelephone(veracitySignedTelephone);
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
	protected JADSCCertificateOfVeracityWrapper wrap(
		JADSCCertificateOfVeracity jadscCertificateOfVeracity) {

		return new JADSCCertificateOfVeracityWrapper(
			jadscCertificateOfVeracity);
	}

}