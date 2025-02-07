/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AccCerBodyPersonnel}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyPersonnel
 * @generated
 */
public class AccCerBodyPersonnelWrapper
	extends BaseModelWrapper<AccCerBodyPersonnel>
	implements AccCerBodyPersonnel, ModelWrapper<AccCerBodyPersonnel> {

	public AccCerBodyPersonnelWrapper(AccCerBodyPersonnel accCerBodyPersonnel) {
		super(accCerBodyPersonnel);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("accCerBodyPersonnelId", getAccCerBodyPersonnelId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("internalStaffSize", getInternalStaffSize());
		attributes.put("auditorsNum", getAuditorsNum());
		attributes.put("contractedPerNum", getContractedPerNum());
		attributes.put("bodyOutsource", getBodyOutsource());
		attributes.put("descSecurity", getDescSecurity());
		attributes.put("janaacApplicationId", getJanaacApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accCerBodyPersonnelId = (Long)attributes.get(
			"accCerBodyPersonnelId");

		if (accCerBodyPersonnelId != null) {
			setAccCerBodyPersonnelId(accCerBodyPersonnelId);
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

		String internalStaffSize = (String)attributes.get("internalStaffSize");

		if (internalStaffSize != null) {
			setInternalStaffSize(internalStaffSize);
		}

		String auditorsNum = (String)attributes.get("auditorsNum");

		if (auditorsNum != null) {
			setAuditorsNum(auditorsNum);
		}

		String contractedPerNum = (String)attributes.get("contractedPerNum");

		if (contractedPerNum != null) {
			setContractedPerNum(contractedPerNum);
		}

		String bodyOutsource = (String)attributes.get("bodyOutsource");

		if (bodyOutsource != null) {
			setBodyOutsource(bodyOutsource);
		}

		String descSecurity = (String)attributes.get("descSecurity");

		if (descSecurity != null) {
			setDescSecurity(descSecurity);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}
	}

	@Override
	public AccCerBodyPersonnel cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc cer body personnel ID of this acc cer body personnel.
	 *
	 * @return the acc cer body personnel ID of this acc cer body personnel
	 */
	@Override
	public long getAccCerBodyPersonnelId() {
		return model.getAccCerBodyPersonnelId();
	}

	/**
	 * Returns the auditors num of this acc cer body personnel.
	 *
	 * @return the auditors num of this acc cer body personnel
	 */
	@Override
	public String getAuditorsNum() {
		return model.getAuditorsNum();
	}

	/**
	 * Returns the body outsource of this acc cer body personnel.
	 *
	 * @return the body outsource of this acc cer body personnel
	 */
	@Override
	public String getBodyOutsource() {
		return model.getBodyOutsource();
	}

	/**
	 * Returns the company ID of this acc cer body personnel.
	 *
	 * @return the company ID of this acc cer body personnel
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contracted per num of this acc cer body personnel.
	 *
	 * @return the contracted per num of this acc cer body personnel
	 */
	@Override
	public String getContractedPerNum() {
		return model.getContractedPerNum();
	}

	/**
	 * Returns the create date of this acc cer body personnel.
	 *
	 * @return the create date of this acc cer body personnel
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the desc security of this acc cer body personnel.
	 *
	 * @return the desc security of this acc cer body personnel
	 */
	@Override
	public String getDescSecurity() {
		return model.getDescSecurity();
	}

	/**
	 * Returns the group ID of this acc cer body personnel.
	 *
	 * @return the group ID of this acc cer body personnel
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the internal staff size of this acc cer body personnel.
	 *
	 * @return the internal staff size of this acc cer body personnel
	 */
	@Override
	public String getInternalStaffSize() {
		return model.getInternalStaffSize();
	}

	/**
	 * Returns the janaac application ID of this acc cer body personnel.
	 *
	 * @return the janaac application ID of this acc cer body personnel
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this acc cer body personnel.
	 *
	 * @return the modified date of this acc cer body personnel
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this acc cer body personnel.
	 *
	 * @return the primary key of this acc cer body personnel
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this acc cer body personnel.
	 *
	 * @return the user ID of this acc cer body personnel
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc cer body personnel.
	 *
	 * @return the user name of this acc cer body personnel
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc cer body personnel.
	 *
	 * @return the user uuid of this acc cer body personnel
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc cer body personnel.
	 *
	 * @return the uuid of this acc cer body personnel
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
	 * Sets the acc cer body personnel ID of this acc cer body personnel.
	 *
	 * @param accCerBodyPersonnelId the acc cer body personnel ID of this acc cer body personnel
	 */
	@Override
	public void setAccCerBodyPersonnelId(long accCerBodyPersonnelId) {
		model.setAccCerBodyPersonnelId(accCerBodyPersonnelId);
	}

	/**
	 * Sets the auditors num of this acc cer body personnel.
	 *
	 * @param auditorsNum the auditors num of this acc cer body personnel
	 */
	@Override
	public void setAuditorsNum(String auditorsNum) {
		model.setAuditorsNum(auditorsNum);
	}

	/**
	 * Sets the body outsource of this acc cer body personnel.
	 *
	 * @param bodyOutsource the body outsource of this acc cer body personnel
	 */
	@Override
	public void setBodyOutsource(String bodyOutsource) {
		model.setBodyOutsource(bodyOutsource);
	}

	/**
	 * Sets the company ID of this acc cer body personnel.
	 *
	 * @param companyId the company ID of this acc cer body personnel
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contracted per num of this acc cer body personnel.
	 *
	 * @param contractedPerNum the contracted per num of this acc cer body personnel
	 */
	@Override
	public void setContractedPerNum(String contractedPerNum) {
		model.setContractedPerNum(contractedPerNum);
	}

	/**
	 * Sets the create date of this acc cer body personnel.
	 *
	 * @param createDate the create date of this acc cer body personnel
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the desc security of this acc cer body personnel.
	 *
	 * @param descSecurity the desc security of this acc cer body personnel
	 */
	@Override
	public void setDescSecurity(String descSecurity) {
		model.setDescSecurity(descSecurity);
	}

	/**
	 * Sets the group ID of this acc cer body personnel.
	 *
	 * @param groupId the group ID of this acc cer body personnel
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the internal staff size of this acc cer body personnel.
	 *
	 * @param internalStaffSize the internal staff size of this acc cer body personnel
	 */
	@Override
	public void setInternalStaffSize(String internalStaffSize) {
		model.setInternalStaffSize(internalStaffSize);
	}

	/**
	 * Sets the janaac application ID of this acc cer body personnel.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc cer body personnel
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this acc cer body personnel.
	 *
	 * @param modifiedDate the modified date of this acc cer body personnel
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this acc cer body personnel.
	 *
	 * @param primaryKey the primary key of this acc cer body personnel
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this acc cer body personnel.
	 *
	 * @param userId the user ID of this acc cer body personnel
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc cer body personnel.
	 *
	 * @param userName the user name of this acc cer body personnel
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc cer body personnel.
	 *
	 * @param userUuid the user uuid of this acc cer body personnel
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc cer body personnel.
	 *
	 * @param uuid the uuid of this acc cer body personnel
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
	protected AccCerBodyPersonnelWrapper wrap(
		AccCerBodyPersonnel accCerBodyPersonnel) {

		return new AccCerBodyPersonnelWrapper(accCerBodyPersonnel);
	}

}