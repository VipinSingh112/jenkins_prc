/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the CompanySecretary service. Represents a row in the &quot;nbp_osi_company_secretary&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanySecretaryModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanySecretaryImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanySecretary
 * @generated
 */
@ProviderType
public interface CompanySecretaryModel
	extends BaseModel<CompanySecretary>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a company secretary model instance should use the {@link CompanySecretary} interface instead.
	 */

	/**
	 * Returns the primary key of this company secretary.
	 *
	 * @return the primary key of this company secretary
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this company secretary.
	 *
	 * @param primaryKey the primary key of this company secretary
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the company secretary ID of this company secretary.
	 *
	 * @return the company secretary ID of this company secretary
	 */
	public long getCompanySecretaryId();

	/**
	 * Sets the company secretary ID of this company secretary.
	 *
	 * @param companySecretaryId the company secretary ID of this company secretary
	 */
	public void setCompanySecretaryId(long companySecretaryId);

	/**
	 * Returns the group ID of this company secretary.
	 *
	 * @return the group ID of this company secretary
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this company secretary.
	 *
	 * @param groupId the group ID of this company secretary
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this company secretary.
	 *
	 * @return the company ID of this company secretary
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this company secretary.
	 *
	 * @param companyId the company ID of this company secretary
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this company secretary.
	 *
	 * @return the user ID of this company secretary
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this company secretary.
	 *
	 * @param userId the user ID of this company secretary
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this company secretary.
	 *
	 * @return the user uuid of this company secretary
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this company secretary.
	 *
	 * @param userUuid the user uuid of this company secretary
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this company secretary.
	 *
	 * @return the user name of this company secretary
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this company secretary.
	 *
	 * @param userName the user name of this company secretary
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this company secretary.
	 *
	 * @return the create date of this company secretary
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this company secretary.
	 *
	 * @param createDate the create date of this company secretary
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this company secretary.
	 *
	 * @return the modified date of this company secretary
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this company secretary.
	 *
	 * @param modifiedDate the modified date of this company secretary
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the secretary name of this company secretary.
	 *
	 * @return the secretary name of this company secretary
	 */
	@AutoEscape
	public String getSecretaryName();

	/**
	 * Sets the secretary name of this company secretary.
	 *
	 * @param secretaryName the secretary name of this company secretary
	 */
	public void setSecretaryName(String secretaryName);

	/**
	 * Returns the secretary date of this company secretary.
	 *
	 * @return the secretary date of this company secretary
	 */
	public Date getSecretaryDate();

	/**
	 * Sets the secretary date of this company secretary.
	 *
	 * @param secretaryDate the secretary date of this company secretary
	 */
	public void setSecretaryDate(Date secretaryDate);

	/**
	 * Returns the secretary occupation of this company secretary.
	 *
	 * @return the secretary occupation of this company secretary
	 */
	@AutoEscape
	public String getSecretaryOccupation();

	/**
	 * Sets the secretary occupation of this company secretary.
	 *
	 * @param secretaryOccupation the secretary occupation of this company secretary
	 */
	public void setSecretaryOccupation(String secretaryOccupation);

	/**
	 * Returns the secretary contact num of this company secretary.
	 *
	 * @return the secretary contact num of this company secretary
	 */
	@AutoEscape
	public String getSecretaryContactNum();

	/**
	 * Sets the secretary contact num of this company secretary.
	 *
	 * @param secretaryContactNum the secretary contact num of this company secretary
	 */
	public void setSecretaryContactNum(String secretaryContactNum);

	/**
	 * Returns the secretary address of this company secretary.
	 *
	 * @return the secretary address of this company secretary
	 */
	@AutoEscape
	public String getSecretaryAddress();

	/**
	 * Sets the secretary address of this company secretary.
	 *
	 * @param secretaryAddress the secretary address of this company secretary
	 */
	public void setSecretaryAddress(String secretaryAddress);

	/**
	 * Returns the secretary counter of this company secretary.
	 *
	 * @return the secretary counter of this company secretary
	 */
	@AutoEscape
	public String getSecretaryCounter();

	/**
	 * Sets the secretary counter of this company secretary.
	 *
	 * @param secretaryCounter the secretary counter of this company secretary
	 */
	public void setSecretaryCounter(String secretaryCounter);

	/**
	 * Returns the osi insolvency ID of this company secretary.
	 *
	 * @return the osi insolvency ID of this company secretary
	 */
	public long getOsiInsolvencyId();

	/**
	 * Sets the osi insolvency ID of this company secretary.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this company secretary
	 */
	public void setOsiInsolvencyId(long osiInsolvencyId);

	@Override
	public CompanySecretary cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}