/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the sezDeveloperUndertaking service. Represents a row in the &quot;nbp_sez_dev_undertaking&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.sez.status.application.form.service.model.impl.sezDeveloperUndertakingModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.sez.status.application.form.service.model.impl.sezDeveloperUndertakingImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see sezDeveloperUndertaking
 * @generated
 */
@ProviderType
public interface sezDeveloperUndertakingModel
	extends BaseModel<sezDeveloperUndertaking>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sez developer undertaking model instance should use the {@link sezDeveloperUndertaking} interface instead.
	 */

	/**
	 * Returns the primary key of this sez developer undertaking.
	 *
	 * @return the primary key of this sez developer undertaking
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sez developer undertaking.
	 *
	 * @param primaryKey the primary key of this sez developer undertaking
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sez developer undertaking ID of this sez developer undertaking.
	 *
	 * @return the sez developer undertaking ID of this sez developer undertaking
	 */
	public long getSezDeveloperUndertakingId();

	/**
	 * Sets the sez developer undertaking ID of this sez developer undertaking.
	 *
	 * @param sezDeveloperUndertakingId the sez developer undertaking ID of this sez developer undertaking
	 */
	public void setSezDeveloperUndertakingId(long sezDeveloperUndertakingId);

	/**
	 * Returns the group ID of this sez developer undertaking.
	 *
	 * @return the group ID of this sez developer undertaking
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this sez developer undertaking.
	 *
	 * @param groupId the group ID of this sez developer undertaking
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this sez developer undertaking.
	 *
	 * @return the company ID of this sez developer undertaking
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this sez developer undertaking.
	 *
	 * @param companyId the company ID of this sez developer undertaking
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this sez developer undertaking.
	 *
	 * @return the user ID of this sez developer undertaking
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this sez developer undertaking.
	 *
	 * @param userId the user ID of this sez developer undertaking
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this sez developer undertaking.
	 *
	 * @return the user uuid of this sez developer undertaking
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this sez developer undertaking.
	 *
	 * @param userUuid the user uuid of this sez developer undertaking
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this sez developer undertaking.
	 *
	 * @return the user name of this sez developer undertaking
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this sez developer undertaking.
	 *
	 * @param userName the user name of this sez developer undertaking
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this sez developer undertaking.
	 *
	 * @return the create date of this sez developer undertaking
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this sez developer undertaking.
	 *
	 * @param createDate the create date of this sez developer undertaking
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this sez developer undertaking.
	 *
	 * @return the modified date of this sez developer undertaking
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this sez developer undertaking.
	 *
	 * @param modifiedDate the modified date of this sez developer undertaking
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the title of applicant of this sez developer undertaking.
	 *
	 * @return the title of applicant of this sez developer undertaking
	 */
	@AutoEscape
	public String getTitleOfApplicant();

	/**
	 * Sets the title of applicant of this sez developer undertaking.
	 *
	 * @param titleOfApplicant the title of applicant of this sez developer undertaking
	 */
	public void setTitleOfApplicant(String titleOfApplicant);

	/**
	 * Returns the name of applicant of this sez developer undertaking.
	 *
	 * @return the name of applicant of this sez developer undertaking
	 */
	@AutoEscape
	public String getNameOfApplicant();

	/**
	 * Sets the name of applicant of this sez developer undertaking.
	 *
	 * @param nameOfApplicant the name of applicant of this sez developer undertaking
	 */
	public void setNameOfApplicant(String nameOfApplicant);

	/**
	 * Returns the telephone num of this sez developer undertaking.
	 *
	 * @return the telephone num of this sez developer undertaking
	 */
	@AutoEscape
	public String getTelephoneNum();

	/**
	 * Sets the telephone num of this sez developer undertaking.
	 *
	 * @param telephoneNum the telephone num of this sez developer undertaking
	 */
	public void setTelephoneNum(String telephoneNum);

	/**
	 * Returns the email address of this sez developer undertaking.
	 *
	 * @return the email address of this sez developer undertaking
	 */
	@AutoEscape
	public String getEmailAddress();

	/**
	 * Sets the email address of this sez developer undertaking.
	 *
	 * @param emailAddress the email address of this sez developer undertaking
	 */
	public void setEmailAddress(String emailAddress);

	/**
	 * Returns the applicant signature date of this sez developer undertaking.
	 *
	 * @return the applicant signature date of this sez developer undertaking
	 */
	public Date getApplicantSignatureDate();

	/**
	 * Sets the applicant signature date of this sez developer undertaking.
	 *
	 * @param applicantSignatureDate the applicant signature date of this sez developer undertaking
	 */
	public void setApplicantSignatureDate(Date applicantSignatureDate);

	/**
	 * Returns the name of notary public of this sez developer undertaking.
	 *
	 * @return the name of notary public of this sez developer undertaking
	 */
	@AutoEscape
	public String getNameOfNotaryPublic();

	/**
	 * Sets the name of notary public of this sez developer undertaking.
	 *
	 * @param nameOfNotaryPublic the name of notary public of this sez developer undertaking
	 */
	public void setNameOfNotaryPublic(String nameOfNotaryPublic);

	/**
	 * Returns the public notary signature date of this sez developer undertaking.
	 *
	 * @return the public notary signature date of this sez developer undertaking
	 */
	public Date getPublicNotarySignatureDate();

	/**
	 * Sets the public notary signature date of this sez developer undertaking.
	 *
	 * @param publicNotarySignatureDate the public notary signature date of this sez developer undertaking
	 */
	public void setPublicNotarySignatureDate(Date publicNotarySignatureDate);

	/**
	 * Returns the sez status application ID of this sez developer undertaking.
	 *
	 * @return the sez status application ID of this sez developer undertaking
	 */
	public long getSezStatusApplicationId();

	/**
	 * Sets the sez status application ID of this sez developer undertaking.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez developer undertaking
	 */
	public void setSezStatusApplicationId(long sezStatusApplicationId);

	@Override
	public sezDeveloperUndertaking cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}