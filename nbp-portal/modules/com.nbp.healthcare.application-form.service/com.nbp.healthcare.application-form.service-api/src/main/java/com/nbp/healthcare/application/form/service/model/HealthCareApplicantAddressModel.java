/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the HealthCareApplicantAddress service. Represents a row in the &quot;nbp_healthcare_applicant_add&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicantAddressModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicantAddressImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicantAddress
 * @generated
 */
@ProviderType
public interface HealthCareApplicantAddressModel
	extends BaseModel<HealthCareApplicantAddress>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a health care applicant address model instance should use the {@link HealthCareApplicantAddress} interface instead.
	 */

	/**
	 * Returns the primary key of this health care applicant address.
	 *
	 * @return the primary key of this health care applicant address
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this health care applicant address.
	 *
	 * @param primaryKey the primary key of this health care applicant address
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the health care applicant address ID of this health care applicant address.
	 *
	 * @return the health care applicant address ID of this health care applicant address
	 */
	public long getHealthCareApplicantAddressId();

	/**
	 * Sets the health care applicant address ID of this health care applicant address.
	 *
	 * @param healthCareApplicantAddressId the health care applicant address ID of this health care applicant address
	 */
	public void setHealthCareApplicantAddressId(
		long healthCareApplicantAddressId);

	/**
	 * Returns the group ID of this health care applicant address.
	 *
	 * @return the group ID of this health care applicant address
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this health care applicant address.
	 *
	 * @param groupId the group ID of this health care applicant address
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this health care applicant address.
	 *
	 * @return the company ID of this health care applicant address
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this health care applicant address.
	 *
	 * @param companyId the company ID of this health care applicant address
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this health care applicant address.
	 *
	 * @return the user ID of this health care applicant address
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this health care applicant address.
	 *
	 * @param userId the user ID of this health care applicant address
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this health care applicant address.
	 *
	 * @return the user uuid of this health care applicant address
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this health care applicant address.
	 *
	 * @param userUuid the user uuid of this health care applicant address
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this health care applicant address.
	 *
	 * @return the user name of this health care applicant address
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this health care applicant address.
	 *
	 * @param userName the user name of this health care applicant address
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this health care applicant address.
	 *
	 * @return the create date of this health care applicant address
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this health care applicant address.
	 *
	 * @param createDate the create date of this health care applicant address
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this health care applicant address.
	 *
	 * @return the modified date of this health care applicant address
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this health care applicant address.
	 *
	 * @param modifiedDate the modified date of this health care applicant address
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the applicant mailing address of this health care applicant address.
	 *
	 * @return the applicant mailing address of this health care applicant address
	 */
	@AutoEscape
	public String getApplicantMailingAddress();

	/**
	 * Sets the applicant mailing address of this health care applicant address.
	 *
	 * @param applicantMailingAddress the applicant mailing address of this health care applicant address
	 */
	public void setApplicantMailingAddress(String applicantMailingAddress);

	/**
	 * Returns the health care application ID of this health care applicant address.
	 *
	 * @return the health care application ID of this health care applicant address
	 */
	public long getHealthCareApplicationId();

	/**
	 * Sets the health care application ID of this health care applicant address.
	 *
	 * @param healthCareApplicationId the health care application ID of this health care applicant address
	 */
	public void setHealthCareApplicationId(long healthCareApplicationId);

	/**
	 * Returns the health care applicant info ID of this health care applicant address.
	 *
	 * @return the health care applicant info ID of this health care applicant address
	 */
	public long getHealthCareApplicantInfoId();

	/**
	 * Sets the health care applicant info ID of this health care applicant address.
	 *
	 * @param healthCareApplicantInfoId the health care applicant info ID of this health care applicant address
	 */
	public void setHealthCareApplicantInfoId(long healthCareApplicantInfoId);

	@Override
	public HealthCareApplicantAddress cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}