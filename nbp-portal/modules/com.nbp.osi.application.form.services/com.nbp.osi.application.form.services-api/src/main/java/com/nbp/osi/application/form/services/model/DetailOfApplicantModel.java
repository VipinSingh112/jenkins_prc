/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the DetailOfApplicant service. Represents a row in the &quot;nbp_osi_applicant_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.osi.application.form.services.model.impl.DetailOfApplicantModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.osi.application.form.services.model.impl.DetailOfApplicantImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfApplicant
 * @generated
 */
@ProviderType
public interface DetailOfApplicantModel
	extends BaseModel<DetailOfApplicant>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a detail of applicant model instance should use the {@link DetailOfApplicant} interface instead.
	 */

	/**
	 * Returns the primary key of this detail of applicant.
	 *
	 * @return the primary key of this detail of applicant
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this detail of applicant.
	 *
	 * @param primaryKey the primary key of this detail of applicant
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this detail of applicant.
	 *
	 * @return the uuid of this detail of applicant
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this detail of applicant.
	 *
	 * @param uuid the uuid of this detail of applicant
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the detail of applicant ID of this detail of applicant.
	 *
	 * @return the detail of applicant ID of this detail of applicant
	 */
	public long getDetailOfApplicantId();

	/**
	 * Sets the detail of applicant ID of this detail of applicant.
	 *
	 * @param detailOfApplicantId the detail of applicant ID of this detail of applicant
	 */
	public void setDetailOfApplicantId(long detailOfApplicantId);

	/**
	 * Returns the group ID of this detail of applicant.
	 *
	 * @return the group ID of this detail of applicant
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this detail of applicant.
	 *
	 * @param groupId the group ID of this detail of applicant
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this detail of applicant.
	 *
	 * @return the company ID of this detail of applicant
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this detail of applicant.
	 *
	 * @param companyId the company ID of this detail of applicant
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this detail of applicant.
	 *
	 * @return the user ID of this detail of applicant
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this detail of applicant.
	 *
	 * @param userId the user ID of this detail of applicant
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this detail of applicant.
	 *
	 * @return the user uuid of this detail of applicant
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this detail of applicant.
	 *
	 * @param userUuid the user uuid of this detail of applicant
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this detail of applicant.
	 *
	 * @return the user name of this detail of applicant
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this detail of applicant.
	 *
	 * @param userName the user name of this detail of applicant
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this detail of applicant.
	 *
	 * @return the create date of this detail of applicant
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this detail of applicant.
	 *
	 * @param createDate the create date of this detail of applicant
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this detail of applicant.
	 *
	 * @return the modified date of this detail of applicant
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this detail of applicant.
	 *
	 * @param modifiedDate the modified date of this detail of applicant
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the applicant name of this detail of applicant.
	 *
	 * @return the applicant name of this detail of applicant
	 */
	@AutoEscape
	public String getApplicantName();

	/**
	 * Sets the applicant name of this detail of applicant.
	 *
	 * @param applicantName the applicant name of this detail of applicant
	 */
	public void setApplicantName(String applicantName);

	/**
	 * Returns the applicant middle name of this detail of applicant.
	 *
	 * @return the applicant middle name of this detail of applicant
	 */
	@AutoEscape
	public String getApplicantMiddleName();

	/**
	 * Sets the applicant middle name of this detail of applicant.
	 *
	 * @param applicantMiddleName the applicant middle name of this detail of applicant
	 */
	public void setApplicantMiddleName(String applicantMiddleName);

	/**
	 * Returns the applicant last name of this detail of applicant.
	 *
	 * @return the applicant last name of this detail of applicant
	 */
	@AutoEscape
	public String getApplicantLastName();

	/**
	 * Sets the applicant last name of this detail of applicant.
	 *
	 * @param applicantLastName the applicant last name of this detail of applicant
	 */
	public void setApplicantLastName(String applicantLastName);

	/**
	 * Returns the applicant address of this detail of applicant.
	 *
	 * @return the applicant address of this detail of applicant
	 */
	@AutoEscape
	public String getApplicantAddress();

	/**
	 * Sets the applicant address of this detail of applicant.
	 *
	 * @param applicantAddress the applicant address of this detail of applicant
	 */
	public void setApplicantAddress(String applicantAddress);

	/**
	 * Returns the applicant email of this detail of applicant.
	 *
	 * @return the applicant email of this detail of applicant
	 */
	@AutoEscape
	public String getApplicantEmail();

	/**
	 * Sets the applicant email of this detail of applicant.
	 *
	 * @param applicantEmail the applicant email of this detail of applicant
	 */
	public void setApplicantEmail(String applicantEmail);

	/**
	 * Returns the applicant tele num of this detail of applicant.
	 *
	 * @return the applicant tele num of this detail of applicant
	 */
	@AutoEscape
	public String getApplicantTeleNum();

	/**
	 * Sets the applicant tele num of this detail of applicant.
	 *
	 * @param applicantTeleNum the applicant tele num of this detail of applicant
	 */
	public void setApplicantTeleNum(String applicantTeleNum);

	/**
	 * Returns the applicant trn of this detail of applicant.
	 *
	 * @return the applicant trn of this detail of applicant
	 */
	@AutoEscape
	public String getApplicantTrn();

	/**
	 * Sets the applicant trn of this detail of applicant.
	 *
	 * @param applicantTrn the applicant trn of this detail of applicant
	 */
	public void setApplicantTrn(String applicantTrn);

	/**
	 * Returns the applicant ID number of this detail of applicant.
	 *
	 * @return the applicant ID number of this detail of applicant
	 */
	@AutoEscape
	public String getApplicantIdNumber();

	/**
	 * Sets the applicant ID number of this detail of applicant.
	 *
	 * @param applicantIdNumber the applicant ID number of this detail of applicant
	 */
	public void setApplicantIdNumber(String applicantIdNumber);

	/**
	 * Returns the applicant dob of this detail of applicant.
	 *
	 * @return the applicant dob of this detail of applicant
	 */
	public Date getApplicantDob();

	/**
	 * Sets the applicant dob of this detail of applicant.
	 *
	 * @param applicantDob the applicant dob of this detail of applicant
	 */
	public void setApplicantDob(Date applicantDob);

	/**
	 * Returns the applicant occupation of this detail of applicant.
	 *
	 * @return the applicant occupation of this detail of applicant
	 */
	@AutoEscape
	public String getApplicantOccupation();

	/**
	 * Sets the applicant occupation of this detail of applicant.
	 *
	 * @param applicantOccupation the applicant occupation of this detail of applicant
	 */
	public void setApplicantOccupation(String applicantOccupation);

	/**
	 * Returns the osi application ID of this detail of applicant.
	 *
	 * @return the osi application ID of this detail of applicant
	 */
	public long getOsiApplicationId();

	/**
	 * Sets the osi application ID of this detail of applicant.
	 *
	 * @param osiApplicationId the osi application ID of this detail of applicant
	 */
	public void setOsiApplicationId(long osiApplicationId);

	@Override
	public DetailOfApplicant cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}