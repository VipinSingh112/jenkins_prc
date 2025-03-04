/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the MedicalFacilitiesNurseDetail service. Represents a row in the &quot;nbp_medical_nurse_detail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseDetailModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseDetailImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesNurseDetail
 * @generated
 */
@ProviderType
public interface MedicalFacilitiesNurseDetailModel
	extends BaseModel<MedicalFacilitiesNurseDetail>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a medical facilities nurse detail model instance should use the {@link MedicalFacilitiesNurseDetail} interface instead.
	 */

	/**
	 * Returns the primary key of this medical facilities nurse detail.
	 *
	 * @return the primary key of this medical facilities nurse detail
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this medical facilities nurse detail.
	 *
	 * @param primaryKey the primary key of this medical facilities nurse detail
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this medical facilities nurse detail.
	 *
	 * @return the uuid of this medical facilities nurse detail
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this medical facilities nurse detail.
	 *
	 * @param uuid the uuid of this medical facilities nurse detail
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the medical facilities nurse detail ID of this medical facilities nurse detail.
	 *
	 * @return the medical facilities nurse detail ID of this medical facilities nurse detail
	 */
	public long getMedicalFacilitiesNurseDetailId();

	/**
	 * Sets the medical facilities nurse detail ID of this medical facilities nurse detail.
	 *
	 * @param medicalFacilitiesNurseDetailId the medical facilities nurse detail ID of this medical facilities nurse detail
	 */
	public void setMedicalFacilitiesNurseDetailId(
		long medicalFacilitiesNurseDetailId);

	/**
	 * Returns the group ID of this medical facilities nurse detail.
	 *
	 * @return the group ID of this medical facilities nurse detail
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this medical facilities nurse detail.
	 *
	 * @param groupId the group ID of this medical facilities nurse detail
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this medical facilities nurse detail.
	 *
	 * @return the company ID of this medical facilities nurse detail
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this medical facilities nurse detail.
	 *
	 * @param companyId the company ID of this medical facilities nurse detail
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this medical facilities nurse detail.
	 *
	 * @return the user ID of this medical facilities nurse detail
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this medical facilities nurse detail.
	 *
	 * @param userId the user ID of this medical facilities nurse detail
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this medical facilities nurse detail.
	 *
	 * @return the user uuid of this medical facilities nurse detail
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this medical facilities nurse detail.
	 *
	 * @param userUuid the user uuid of this medical facilities nurse detail
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this medical facilities nurse detail.
	 *
	 * @return the user name of this medical facilities nurse detail
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this medical facilities nurse detail.
	 *
	 * @param userName the user name of this medical facilities nurse detail
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this medical facilities nurse detail.
	 *
	 * @return the create date of this medical facilities nurse detail
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this medical facilities nurse detail.
	 *
	 * @param createDate the create date of this medical facilities nurse detail
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this medical facilities nurse detail.
	 *
	 * @return the modified date of this medical facilities nurse detail
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this medical facilities nurse detail.
	 *
	 * @param modifiedDate the modified date of this medical facilities nurse detail
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the q nurse name of this medical facilities nurse detail.
	 *
	 * @return the q nurse name of this medical facilities nurse detail
	 */
	@AutoEscape
	public String getQNurseName();

	/**
	 * Sets the q nurse name of this medical facilities nurse detail.
	 *
	 * @param qNurseName the q nurse name of this medical facilities nurse detail
	 */
	public void setQNurseName(String qNurseName);

	/**
	 * Returns the q nurse qualification of this medical facilities nurse detail.
	 *
	 * @return the q nurse qualification of this medical facilities nurse detail
	 */
	@AutoEscape
	public String getQNurseQualification();

	/**
	 * Sets the q nurse qualification of this medical facilities nurse detail.
	 *
	 * @param qNurseQualification the q nurse qualification of this medical facilities nurse detail
	 */
	public void setQNurseQualification(String qNurseQualification);

	/**
	 * Returns the ratio of q nurses of this medical facilities nurse detail.
	 *
	 * @return the ratio of q nurses of this medical facilities nurse detail
	 */
	@AutoEscape
	public String getRatioOfQNurses();

	/**
	 * Sets the ratio of q nurses of this medical facilities nurse detail.
	 *
	 * @param ratioOfQNurses the ratio of q nurses of this medical facilities nurse detail
	 */
	public void setRatioOfQNurses(String ratioOfQNurses);

	/**
	 * Returns the counter of this medical facilities nurse detail.
	 *
	 * @return the counter of this medical facilities nurse detail
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this medical facilities nurse detail.
	 *
	 * @param counter the counter of this medical facilities nurse detail
	 */
	public void setCounter(String counter);

	/**
	 * Returns the medical facilities app ID of this medical facilities nurse detail.
	 *
	 * @return the medical facilities app ID of this medical facilities nurse detail
	 */
	public long getMedicalFacilitiesAppId();

	/**
	 * Sets the medical facilities app ID of this medical facilities nurse detail.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID of this medical facilities nurse detail
	 */
	public void setMedicalFacilitiesAppId(long medicalFacilitiesAppId);

	@Override
	public MedicalFacilitiesNurseDetail cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}