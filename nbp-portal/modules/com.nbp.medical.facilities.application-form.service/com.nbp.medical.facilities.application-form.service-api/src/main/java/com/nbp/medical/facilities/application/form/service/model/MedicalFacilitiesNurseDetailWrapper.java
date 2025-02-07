/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MedicalFacilitiesNurseDetail}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesNurseDetail
 * @generated
 */
public class MedicalFacilitiesNurseDetailWrapper
	extends BaseModelWrapper<MedicalFacilitiesNurseDetail>
	implements MedicalFacilitiesNurseDetail,
			   ModelWrapper<MedicalFacilitiesNurseDetail> {

	public MedicalFacilitiesNurseDetailWrapper(
		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail) {

		super(medicalFacilitiesNurseDetail);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"medicalFacilitiesNurseDetailId",
			getMedicalFacilitiesNurseDetailId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("qNurseName", getQNurseName());
		attributes.put("qNurseQualification", getQNurseQualification());
		attributes.put("ratioOfQNurses", getRatioOfQNurses());
		attributes.put("counter", getCounter());
		attributes.put("medicalFacilitiesAppId", getMedicalFacilitiesAppId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long medicalFacilitiesNurseDetailId = (Long)attributes.get(
			"medicalFacilitiesNurseDetailId");

		if (medicalFacilitiesNurseDetailId != null) {
			setMedicalFacilitiesNurseDetailId(medicalFacilitiesNurseDetailId);
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

		String qNurseName = (String)attributes.get("qNurseName");

		if (qNurseName != null) {
			setQNurseName(qNurseName);
		}

		String qNurseQualification = (String)attributes.get(
			"qNurseQualification");

		if (qNurseQualification != null) {
			setQNurseQualification(qNurseQualification);
		}

		String ratioOfQNurses = (String)attributes.get("ratioOfQNurses");

		if (ratioOfQNurses != null) {
			setRatioOfQNurses(ratioOfQNurses);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long medicalFacilitiesAppId = (Long)attributes.get(
			"medicalFacilitiesAppId");

		if (medicalFacilitiesAppId != null) {
			setMedicalFacilitiesAppId(medicalFacilitiesAppId);
		}
	}

	@Override
	public MedicalFacilitiesNurseDetail cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this medical facilities nurse detail.
	 *
	 * @return the company ID of this medical facilities nurse detail
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this medical facilities nurse detail.
	 *
	 * @return the counter of this medical facilities nurse detail
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this medical facilities nurse detail.
	 *
	 * @return the create date of this medical facilities nurse detail
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this medical facilities nurse detail.
	 *
	 * @return the group ID of this medical facilities nurse detail
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the medical facilities app ID of this medical facilities nurse detail.
	 *
	 * @return the medical facilities app ID of this medical facilities nurse detail
	 */
	@Override
	public long getMedicalFacilitiesAppId() {
		return model.getMedicalFacilitiesAppId();
	}

	/**
	 * Returns the medical facilities nurse detail ID of this medical facilities nurse detail.
	 *
	 * @return the medical facilities nurse detail ID of this medical facilities nurse detail
	 */
	@Override
	public long getMedicalFacilitiesNurseDetailId() {
		return model.getMedicalFacilitiesNurseDetailId();
	}

	/**
	 * Returns the modified date of this medical facilities nurse detail.
	 *
	 * @return the modified date of this medical facilities nurse detail
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this medical facilities nurse detail.
	 *
	 * @return the primary key of this medical facilities nurse detail
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the q nurse name of this medical facilities nurse detail.
	 *
	 * @return the q nurse name of this medical facilities nurse detail
	 */
	@Override
	public String getQNurseName() {
		return model.getQNurseName();
	}

	/**
	 * Returns the q nurse qualification of this medical facilities nurse detail.
	 *
	 * @return the q nurse qualification of this medical facilities nurse detail
	 */
	@Override
	public String getQNurseQualification() {
		return model.getQNurseQualification();
	}

	/**
	 * Returns the ratio of q nurses of this medical facilities nurse detail.
	 *
	 * @return the ratio of q nurses of this medical facilities nurse detail
	 */
	@Override
	public String getRatioOfQNurses() {
		return model.getRatioOfQNurses();
	}

	/**
	 * Returns the user ID of this medical facilities nurse detail.
	 *
	 * @return the user ID of this medical facilities nurse detail
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this medical facilities nurse detail.
	 *
	 * @return the user name of this medical facilities nurse detail
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this medical facilities nurse detail.
	 *
	 * @return the user uuid of this medical facilities nurse detail
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this medical facilities nurse detail.
	 *
	 * @return the uuid of this medical facilities nurse detail
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
	 * Sets the company ID of this medical facilities nurse detail.
	 *
	 * @param companyId the company ID of this medical facilities nurse detail
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this medical facilities nurse detail.
	 *
	 * @param counter the counter of this medical facilities nurse detail
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this medical facilities nurse detail.
	 *
	 * @param createDate the create date of this medical facilities nurse detail
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this medical facilities nurse detail.
	 *
	 * @param groupId the group ID of this medical facilities nurse detail
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the medical facilities app ID of this medical facilities nurse detail.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID of this medical facilities nurse detail
	 */
	@Override
	public void setMedicalFacilitiesAppId(long medicalFacilitiesAppId) {
		model.setMedicalFacilitiesAppId(medicalFacilitiesAppId);
	}

	/**
	 * Sets the medical facilities nurse detail ID of this medical facilities nurse detail.
	 *
	 * @param medicalFacilitiesNurseDetailId the medical facilities nurse detail ID of this medical facilities nurse detail
	 */
	@Override
	public void setMedicalFacilitiesNurseDetailId(
		long medicalFacilitiesNurseDetailId) {

		model.setMedicalFacilitiesNurseDetailId(medicalFacilitiesNurseDetailId);
	}

	/**
	 * Sets the modified date of this medical facilities nurse detail.
	 *
	 * @param modifiedDate the modified date of this medical facilities nurse detail
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this medical facilities nurse detail.
	 *
	 * @param primaryKey the primary key of this medical facilities nurse detail
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the q nurse name of this medical facilities nurse detail.
	 *
	 * @param qNurseName the q nurse name of this medical facilities nurse detail
	 */
	@Override
	public void setQNurseName(String qNurseName) {
		model.setQNurseName(qNurseName);
	}

	/**
	 * Sets the q nurse qualification of this medical facilities nurse detail.
	 *
	 * @param qNurseQualification the q nurse qualification of this medical facilities nurse detail
	 */
	@Override
	public void setQNurseQualification(String qNurseQualification) {
		model.setQNurseQualification(qNurseQualification);
	}

	/**
	 * Sets the ratio of q nurses of this medical facilities nurse detail.
	 *
	 * @param ratioOfQNurses the ratio of q nurses of this medical facilities nurse detail
	 */
	@Override
	public void setRatioOfQNurses(String ratioOfQNurses) {
		model.setRatioOfQNurses(ratioOfQNurses);
	}

	/**
	 * Sets the user ID of this medical facilities nurse detail.
	 *
	 * @param userId the user ID of this medical facilities nurse detail
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this medical facilities nurse detail.
	 *
	 * @param userName the user name of this medical facilities nurse detail
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this medical facilities nurse detail.
	 *
	 * @param userUuid the user uuid of this medical facilities nurse detail
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this medical facilities nurse detail.
	 *
	 * @param uuid the uuid of this medical facilities nurse detail
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
	protected MedicalFacilitiesNurseDetailWrapper wrap(
		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail) {

		return new MedicalFacilitiesNurseDetailWrapper(
			medicalFacilitiesNurseDetail);
	}

}