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
 * This class is a wrapper for {@link JADSCCertificateOfServiceAddForm}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfServiceAddForm
 * @generated
 */
public class JADSCCertificateOfServiceAddFormWrapper
	extends BaseModelWrapper<JADSCCertificateOfServiceAddForm>
	implements JADSCCertificateOfServiceAddForm,
			   ModelWrapper<JADSCCertificateOfServiceAddForm> {

	public JADSCCertificateOfServiceAddFormWrapper(
		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm) {

		super(jadscCertificateOfServiceAddForm);
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
		attributes.put("docServeCom", getDocServeCom());
		attributes.put("docServeAddress", getDocServeAddress());
		attributes.put("docServeName", getDocServeName());
		attributes.put("counter", getCounter());
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

		String docServeCom = (String)attributes.get("docServeCom");

		if (docServeCom != null) {
			setDocServeCom(docServeCom);
		}

		String docServeAddress = (String)attributes.get("docServeAddress");

		if (docServeAddress != null) {
			setDocServeAddress(docServeAddress);
		}

		String docServeName = (String)attributes.get("docServeName");

		if (docServeName != null) {
			setDocServeName(docServeName);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long jadscApplicationId = (Long)attributes.get("jadscApplicationId");

		if (jadscApplicationId != null) {
			setJadscApplicationId(jadscApplicationId);
		}
	}

	@Override
	public JADSCCertificateOfServiceAddForm cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this jadsc certificate of service add form.
	 *
	 * @return the company ID of this jadsc certificate of service add form
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this jadsc certificate of service add form.
	 *
	 * @return the counter of this jadsc certificate of service add form
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this jadsc certificate of service add form.
	 *
	 * @return the create date of this jadsc certificate of service add form
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the doc serve address of this jadsc certificate of service add form.
	 *
	 * @return the doc serve address of this jadsc certificate of service add form
	 */
	@Override
	public String getDocServeAddress() {
		return model.getDocServeAddress();
	}

	/**
	 * Returns the doc serve com of this jadsc certificate of service add form.
	 *
	 * @return the doc serve com of this jadsc certificate of service add form
	 */
	@Override
	public String getDocServeCom() {
		return model.getDocServeCom();
	}

	/**
	 * Returns the doc serve name of this jadsc certificate of service add form.
	 *
	 * @return the doc serve name of this jadsc certificate of service add form
	 */
	@Override
	public String getDocServeName() {
		return model.getDocServeName();
	}

	/**
	 * Returns the group ID of this jadsc certificate of service add form.
	 *
	 * @return the group ID of this jadsc certificate of service add form
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jadsc application ID of this jadsc certificate of service add form.
	 *
	 * @return the jadsc application ID of this jadsc certificate of service add form
	 */
	@Override
	public long getJadscApplicationId() {
		return model.getJadscApplicationId();
	}

	/**
	 * Returns the jadsc cos ID of this jadsc certificate of service add form.
	 *
	 * @return the jadsc cos ID of this jadsc certificate of service add form
	 */
	@Override
	public long getJadscCOSId() {
		return model.getJadscCOSId();
	}

	/**
	 * Returns the modified date of this jadsc certificate of service add form.
	 *
	 * @return the modified date of this jadsc certificate of service add form
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this jadsc certificate of service add form.
	 *
	 * @return the primary key of this jadsc certificate of service add form
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this jadsc certificate of service add form.
	 *
	 * @return the user ID of this jadsc certificate of service add form
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jadsc certificate of service add form.
	 *
	 * @return the user name of this jadsc certificate of service add form
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jadsc certificate of service add form.
	 *
	 * @return the user uuid of this jadsc certificate of service add form
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this jadsc certificate of service add form.
	 *
	 * @return the uuid of this jadsc certificate of service add form
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
	 * Sets the company ID of this jadsc certificate of service add form.
	 *
	 * @param companyId the company ID of this jadsc certificate of service add form
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this jadsc certificate of service add form.
	 *
	 * @param counter the counter of this jadsc certificate of service add form
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this jadsc certificate of service add form.
	 *
	 * @param createDate the create date of this jadsc certificate of service add form
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the doc serve address of this jadsc certificate of service add form.
	 *
	 * @param docServeAddress the doc serve address of this jadsc certificate of service add form
	 */
	@Override
	public void setDocServeAddress(String docServeAddress) {
		model.setDocServeAddress(docServeAddress);
	}

	/**
	 * Sets the doc serve com of this jadsc certificate of service add form.
	 *
	 * @param docServeCom the doc serve com of this jadsc certificate of service add form
	 */
	@Override
	public void setDocServeCom(String docServeCom) {
		model.setDocServeCom(docServeCom);
	}

	/**
	 * Sets the doc serve name of this jadsc certificate of service add form.
	 *
	 * @param docServeName the doc serve name of this jadsc certificate of service add form
	 */
	@Override
	public void setDocServeName(String docServeName) {
		model.setDocServeName(docServeName);
	}

	/**
	 * Sets the group ID of this jadsc certificate of service add form.
	 *
	 * @param groupId the group ID of this jadsc certificate of service add form
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jadsc application ID of this jadsc certificate of service add form.
	 *
	 * @param jadscApplicationId the jadsc application ID of this jadsc certificate of service add form
	 */
	@Override
	public void setJadscApplicationId(long jadscApplicationId) {
		model.setJadscApplicationId(jadscApplicationId);
	}

	/**
	 * Sets the jadsc cos ID of this jadsc certificate of service add form.
	 *
	 * @param jadscCOSId the jadsc cos ID of this jadsc certificate of service add form
	 */
	@Override
	public void setJadscCOSId(long jadscCOSId) {
		model.setJadscCOSId(jadscCOSId);
	}

	/**
	 * Sets the modified date of this jadsc certificate of service add form.
	 *
	 * @param modifiedDate the modified date of this jadsc certificate of service add form
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this jadsc certificate of service add form.
	 *
	 * @param primaryKey the primary key of this jadsc certificate of service add form
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this jadsc certificate of service add form.
	 *
	 * @param userId the user ID of this jadsc certificate of service add form
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jadsc certificate of service add form.
	 *
	 * @param userName the user name of this jadsc certificate of service add form
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jadsc certificate of service add form.
	 *
	 * @param userUuid the user uuid of this jadsc certificate of service add form
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this jadsc certificate of service add form.
	 *
	 * @param uuid the uuid of this jadsc certificate of service add form
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
	protected JADSCCertificateOfServiceAddFormWrapper wrap(
		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm) {

		return new JADSCCertificateOfServiceAddFormWrapper(
			jadscCertificateOfServiceAddForm);
	}

}