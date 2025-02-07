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
 * This class is a wrapper for {@link OsiServicesAssignmentDetailinfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesAssignmentDetailinfo
 * @generated
 */
public class OsiServicesAssignmentDetailinfoWrapper
	extends BaseModelWrapper<OsiServicesAssignmentDetailinfo>
	implements ModelWrapper<OsiServicesAssignmentDetailinfo>,
			   OsiServicesAssignmentDetailinfo {

	public OsiServicesAssignmentDetailinfoWrapper(
		OsiServicesAssignmentDetailinfo osiServicesAssignmentDetailinfo) {

		super(osiServicesAssignmentDetailinfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("osiADId", getOsiADId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("assignmentName", getAssignmentName());
		attributes.put("assignmentDated", getAssignmentDated());
		attributes.put(
			"selectedAssignmentAttached", getSelectedAssignmentAttached());
		attributes.put("assignmentAddress", getAssignmentAddress());
		attributes.put("trusteeAct", getTrusteeAct());
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

		Long osiADId = (Long)attributes.get("osiADId");

		if (osiADId != null) {
			setOsiADId(osiADId);
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

		String assignmentName = (String)attributes.get("assignmentName");

		if (assignmentName != null) {
			setAssignmentName(assignmentName);
		}

		Date assignmentDated = (Date)attributes.get("assignmentDated");

		if (assignmentDated != null) {
			setAssignmentDated(assignmentDated);
		}

		String selectedAssignmentAttached = (String)attributes.get(
			"selectedAssignmentAttached");

		if (selectedAssignmentAttached != null) {
			setSelectedAssignmentAttached(selectedAssignmentAttached);
		}

		String assignmentAddress = (String)attributes.get("assignmentAddress");

		if (assignmentAddress != null) {
			setAssignmentAddress(assignmentAddress);
		}

		String trusteeAct = (String)attributes.get("trusteeAct");

		if (trusteeAct != null) {
			setTrusteeAct(trusteeAct);
		}

		Long osiServicesApplicationId = (Long)attributes.get(
			"osiServicesApplicationId");

		if (osiServicesApplicationId != null) {
			setOsiServicesApplicationId(osiServicesApplicationId);
		}
	}

	@Override
	public OsiServicesAssignmentDetailinfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the assignment address of this osi services assignment detailinfo.
	 *
	 * @return the assignment address of this osi services assignment detailinfo
	 */
	@Override
	public String getAssignmentAddress() {
		return model.getAssignmentAddress();
	}

	/**
	 * Returns the assignment dated of this osi services assignment detailinfo.
	 *
	 * @return the assignment dated of this osi services assignment detailinfo
	 */
	@Override
	public Date getAssignmentDated() {
		return model.getAssignmentDated();
	}

	/**
	 * Returns the assignment name of this osi services assignment detailinfo.
	 *
	 * @return the assignment name of this osi services assignment detailinfo
	 */
	@Override
	public String getAssignmentName() {
		return model.getAssignmentName();
	}

	/**
	 * Returns the company ID of this osi services assignment detailinfo.
	 *
	 * @return the company ID of this osi services assignment detailinfo
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi services assignment detailinfo.
	 *
	 * @return the create date of this osi services assignment detailinfo
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this osi services assignment detailinfo.
	 *
	 * @return the group ID of this osi services assignment detailinfo
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this osi services assignment detailinfo.
	 *
	 * @return the modified date of this osi services assignment detailinfo
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi ad ID of this osi services assignment detailinfo.
	 *
	 * @return the osi ad ID of this osi services assignment detailinfo
	 */
	@Override
	public long getOsiADId() {
		return model.getOsiADId();
	}

	/**
	 * Returns the osi services application ID of this osi services assignment detailinfo.
	 *
	 * @return the osi services application ID of this osi services assignment detailinfo
	 */
	@Override
	public long getOsiServicesApplicationId() {
		return model.getOsiServicesApplicationId();
	}

	/**
	 * Returns the primary key of this osi services assignment detailinfo.
	 *
	 * @return the primary key of this osi services assignment detailinfo
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the selected assignment attached of this osi services assignment detailinfo.
	 *
	 * @return the selected assignment attached of this osi services assignment detailinfo
	 */
	@Override
	public String getSelectedAssignmentAttached() {
		return model.getSelectedAssignmentAttached();
	}

	/**
	 * Returns the trustee act of this osi services assignment detailinfo.
	 *
	 * @return the trustee act of this osi services assignment detailinfo
	 */
	@Override
	public String getTrusteeAct() {
		return model.getTrusteeAct();
	}

	/**
	 * Returns the user ID of this osi services assignment detailinfo.
	 *
	 * @return the user ID of this osi services assignment detailinfo
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi services assignment detailinfo.
	 *
	 * @return the user name of this osi services assignment detailinfo
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi services assignment detailinfo.
	 *
	 * @return the user uuid of this osi services assignment detailinfo
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this osi services assignment detailinfo.
	 *
	 * @return the uuid of this osi services assignment detailinfo
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
	 * Sets the assignment address of this osi services assignment detailinfo.
	 *
	 * @param assignmentAddress the assignment address of this osi services assignment detailinfo
	 */
	@Override
	public void setAssignmentAddress(String assignmentAddress) {
		model.setAssignmentAddress(assignmentAddress);
	}

	/**
	 * Sets the assignment dated of this osi services assignment detailinfo.
	 *
	 * @param assignmentDated the assignment dated of this osi services assignment detailinfo
	 */
	@Override
	public void setAssignmentDated(Date assignmentDated) {
		model.setAssignmentDated(assignmentDated);
	}

	/**
	 * Sets the assignment name of this osi services assignment detailinfo.
	 *
	 * @param assignmentName the assignment name of this osi services assignment detailinfo
	 */
	@Override
	public void setAssignmentName(String assignmentName) {
		model.setAssignmentName(assignmentName);
	}

	/**
	 * Sets the company ID of this osi services assignment detailinfo.
	 *
	 * @param companyId the company ID of this osi services assignment detailinfo
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi services assignment detailinfo.
	 *
	 * @param createDate the create date of this osi services assignment detailinfo
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this osi services assignment detailinfo.
	 *
	 * @param groupId the group ID of this osi services assignment detailinfo
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this osi services assignment detailinfo.
	 *
	 * @param modifiedDate the modified date of this osi services assignment detailinfo
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi ad ID of this osi services assignment detailinfo.
	 *
	 * @param osiADId the osi ad ID of this osi services assignment detailinfo
	 */
	@Override
	public void setOsiADId(long osiADId) {
		model.setOsiADId(osiADId);
	}

	/**
	 * Sets the osi services application ID of this osi services assignment detailinfo.
	 *
	 * @param osiServicesApplicationId the osi services application ID of this osi services assignment detailinfo
	 */
	@Override
	public void setOsiServicesApplicationId(long osiServicesApplicationId) {
		model.setOsiServicesApplicationId(osiServicesApplicationId);
	}

	/**
	 * Sets the primary key of this osi services assignment detailinfo.
	 *
	 * @param primaryKey the primary key of this osi services assignment detailinfo
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the selected assignment attached of this osi services assignment detailinfo.
	 *
	 * @param selectedAssignmentAttached the selected assignment attached of this osi services assignment detailinfo
	 */
	@Override
	public void setSelectedAssignmentAttached(
		String selectedAssignmentAttached) {

		model.setSelectedAssignmentAttached(selectedAssignmentAttached);
	}

	/**
	 * Sets the trustee act of this osi services assignment detailinfo.
	 *
	 * @param trusteeAct the trustee act of this osi services assignment detailinfo
	 */
	@Override
	public void setTrusteeAct(String trusteeAct) {
		model.setTrusteeAct(trusteeAct);
	}

	/**
	 * Sets the user ID of this osi services assignment detailinfo.
	 *
	 * @param userId the user ID of this osi services assignment detailinfo
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi services assignment detailinfo.
	 *
	 * @param userName the user name of this osi services assignment detailinfo
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi services assignment detailinfo.
	 *
	 * @param userUuid the user uuid of this osi services assignment detailinfo
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this osi services assignment detailinfo.
	 *
	 * @param uuid the uuid of this osi services assignment detailinfo
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
	protected OsiServicesAssignmentDetailinfoWrapper wrap(
		OsiServicesAssignmentDetailinfo osiServicesAssignmentDetailinfo) {

		return new OsiServicesAssignmentDetailinfoWrapper(
			osiServicesAssignmentDetailinfo);
	}

}