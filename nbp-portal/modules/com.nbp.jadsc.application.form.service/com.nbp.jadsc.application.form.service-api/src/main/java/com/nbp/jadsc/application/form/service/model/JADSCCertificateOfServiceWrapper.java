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
 * This class is a wrapper for {@link JADSCCertificateOfService}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfService
 * @generated
 */
public class JADSCCertificateOfServiceWrapper
	extends BaseModelWrapper<JADSCCertificateOfService>
	implements JADSCCertificateOfService,
			   ModelWrapper<JADSCCertificateOfService> {

	public JADSCCertificateOfServiceWrapper(
		JADSCCertificateOfService jadscCertificateOfService) {

		super(jadscCertificateOfService);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("jadscCOSId", getJadscCOSId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("docSubmitDate", getDocSubmitDate());
		attributes.put("signatoryName", getSignatoryName());
		attributes.put("signatoryDate", getSignatoryDate());
		attributes.put("signatoryTelephone", getSignatoryTelephone());
		attributes.put("signatoryFax", getSignatoryFax());
		attributes.put("jadscApplicationId", getJadscApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long jadscCOSId = (Long)attributes.get("jadscCOSId");

		if (jadscCOSId != null) {
			setJadscCOSId(jadscCOSId);
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

		Date docSubmitDate = (Date)attributes.get("docSubmitDate");

		if (docSubmitDate != null) {
			setDocSubmitDate(docSubmitDate);
		}

		String signatoryName = (String)attributes.get("signatoryName");

		if (signatoryName != null) {
			setSignatoryName(signatoryName);
		}

		Date signatoryDate = (Date)attributes.get("signatoryDate");

		if (signatoryDate != null) {
			setSignatoryDate(signatoryDate);
		}

		String signatoryTelephone = (String)attributes.get(
			"signatoryTelephone");

		if (signatoryTelephone != null) {
			setSignatoryTelephone(signatoryTelephone);
		}

		String signatoryFax = (String)attributes.get("signatoryFax");

		if (signatoryFax != null) {
			setSignatoryFax(signatoryFax);
		}

		Long jadscApplicationId = (Long)attributes.get("jadscApplicationId");

		if (jadscApplicationId != null) {
			setJadscApplicationId(jadscApplicationId);
		}
	}

	@Override
	public JADSCCertificateOfService cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this jadsc certificate of service.
	 *
	 * @return the company ID of this jadsc certificate of service
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this jadsc certificate of service.
	 *
	 * @return the create date of this jadsc certificate of service
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the doc submit date of this jadsc certificate of service.
	 *
	 * @return the doc submit date of this jadsc certificate of service
	 */
	@Override
	public Date getDocSubmitDate() {
		return model.getDocSubmitDate();
	}

	/**
	 * Returns the group ID of this jadsc certificate of service.
	 *
	 * @return the group ID of this jadsc certificate of service
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jadsc application ID of this jadsc certificate of service.
	 *
	 * @return the jadsc application ID of this jadsc certificate of service
	 */
	@Override
	public long getJadscApplicationId() {
		return model.getJadscApplicationId();
	}

	/**
	 * Returns the jadsc cos ID of this jadsc certificate of service.
	 *
	 * @return the jadsc cos ID of this jadsc certificate of service
	 */
	@Override
	public long getJadscCOSId() {
		return model.getJadscCOSId();
	}

	/**
	 * Returns the modified date of this jadsc certificate of service.
	 *
	 * @return the modified date of this jadsc certificate of service
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this jadsc certificate of service.
	 *
	 * @return the primary key of this jadsc certificate of service
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the signatory date of this jadsc certificate of service.
	 *
	 * @return the signatory date of this jadsc certificate of service
	 */
	@Override
	public Date getSignatoryDate() {
		return model.getSignatoryDate();
	}

	/**
	 * Returns the signatory fax of this jadsc certificate of service.
	 *
	 * @return the signatory fax of this jadsc certificate of service
	 */
	@Override
	public String getSignatoryFax() {
		return model.getSignatoryFax();
	}

	/**
	 * Returns the signatory name of this jadsc certificate of service.
	 *
	 * @return the signatory name of this jadsc certificate of service
	 */
	@Override
	public String getSignatoryName() {
		return model.getSignatoryName();
	}

	/**
	 * Returns the signatory telephone of this jadsc certificate of service.
	 *
	 * @return the signatory telephone of this jadsc certificate of service
	 */
	@Override
	public String getSignatoryTelephone() {
		return model.getSignatoryTelephone();
	}

	/**
	 * Returns the user ID of this jadsc certificate of service.
	 *
	 * @return the user ID of this jadsc certificate of service
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jadsc certificate of service.
	 *
	 * @return the user name of this jadsc certificate of service
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jadsc certificate of service.
	 *
	 * @return the user uuid of this jadsc certificate of service
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this jadsc certificate of service.
	 *
	 * @return the uuid of this jadsc certificate of service
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
	 * Sets the company ID of this jadsc certificate of service.
	 *
	 * @param companyId the company ID of this jadsc certificate of service
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this jadsc certificate of service.
	 *
	 * @param createDate the create date of this jadsc certificate of service
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the doc submit date of this jadsc certificate of service.
	 *
	 * @param docSubmitDate the doc submit date of this jadsc certificate of service
	 */
	@Override
	public void setDocSubmitDate(Date docSubmitDate) {
		model.setDocSubmitDate(docSubmitDate);
	}

	/**
	 * Sets the group ID of this jadsc certificate of service.
	 *
	 * @param groupId the group ID of this jadsc certificate of service
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jadsc application ID of this jadsc certificate of service.
	 *
	 * @param jadscApplicationId the jadsc application ID of this jadsc certificate of service
	 */
	@Override
	public void setJadscApplicationId(long jadscApplicationId) {
		model.setJadscApplicationId(jadscApplicationId);
	}

	/**
	 * Sets the jadsc cos ID of this jadsc certificate of service.
	 *
	 * @param jadscCOSId the jadsc cos ID of this jadsc certificate of service
	 */
	@Override
	public void setJadscCOSId(long jadscCOSId) {
		model.setJadscCOSId(jadscCOSId);
	}

	/**
	 * Sets the modified date of this jadsc certificate of service.
	 *
	 * @param modifiedDate the modified date of this jadsc certificate of service
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this jadsc certificate of service.
	 *
	 * @param primaryKey the primary key of this jadsc certificate of service
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the signatory date of this jadsc certificate of service.
	 *
	 * @param signatoryDate the signatory date of this jadsc certificate of service
	 */
	@Override
	public void setSignatoryDate(Date signatoryDate) {
		model.setSignatoryDate(signatoryDate);
	}

	/**
	 * Sets the signatory fax of this jadsc certificate of service.
	 *
	 * @param signatoryFax the signatory fax of this jadsc certificate of service
	 */
	@Override
	public void setSignatoryFax(String signatoryFax) {
		model.setSignatoryFax(signatoryFax);
	}

	/**
	 * Sets the signatory name of this jadsc certificate of service.
	 *
	 * @param signatoryName the signatory name of this jadsc certificate of service
	 */
	@Override
	public void setSignatoryName(String signatoryName) {
		model.setSignatoryName(signatoryName);
	}

	/**
	 * Sets the signatory telephone of this jadsc certificate of service.
	 *
	 * @param signatoryTelephone the signatory telephone of this jadsc certificate of service
	 */
	@Override
	public void setSignatoryTelephone(String signatoryTelephone) {
		model.setSignatoryTelephone(signatoryTelephone);
	}

	/**
	 * Sets the user ID of this jadsc certificate of service.
	 *
	 * @param userId the user ID of this jadsc certificate of service
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jadsc certificate of service.
	 *
	 * @param userName the user name of this jadsc certificate of service
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jadsc certificate of service.
	 *
	 * @param userUuid the user uuid of this jadsc certificate of service
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this jadsc certificate of service.
	 *
	 * @param uuid the uuid of this jadsc certificate of service
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
	protected JADSCCertificateOfServiceWrapper wrap(
		JADSCCertificateOfService jadscCertificateOfService) {

		return new JADSCCertificateOfServiceWrapper(jadscCertificateOfService);
	}

}