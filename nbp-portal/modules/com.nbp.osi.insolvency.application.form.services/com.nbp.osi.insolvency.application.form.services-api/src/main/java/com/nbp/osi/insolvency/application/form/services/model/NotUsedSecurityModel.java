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
 * The base model interface for the NotUsedSecurity service. Represents a row in the &quot;nbp_not_used_security&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.osi.insolvency.application.form.services.model.impl.NotUsedSecurityModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.osi.insolvency.application.form.services.model.impl.NotUsedSecurityImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NotUsedSecurity
 * @generated
 */
@ProviderType
public interface NotUsedSecurityModel
	extends BaseModel<NotUsedSecurity>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a not used security model instance should use the {@link NotUsedSecurity} interface instead.
	 */

	/**
	 * Returns the primary key of this not used security.
	 *
	 * @return the primary key of this not used security
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this not used security.
	 *
	 * @param primaryKey the primary key of this not used security
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the not used security ID of this not used security.
	 *
	 * @return the not used security ID of this not used security
	 */
	public long getNotUsedSecurityId();

	/**
	 * Sets the not used security ID of this not used security.
	 *
	 * @param notUsedSecurityId the not used security ID of this not used security
	 */
	public void setNotUsedSecurityId(long notUsedSecurityId);

	/**
	 * Returns the group ID of this not used security.
	 *
	 * @return the group ID of this not used security
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this not used security.
	 *
	 * @param groupId the group ID of this not used security
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this not used security.
	 *
	 * @return the company ID of this not used security
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this not used security.
	 *
	 * @param companyId the company ID of this not used security
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this not used security.
	 *
	 * @return the user ID of this not used security
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this not used security.
	 *
	 * @param userId the user ID of this not used security
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this not used security.
	 *
	 * @return the user uuid of this not used security
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this not used security.
	 *
	 * @param userUuid the user uuid of this not used security
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this not used security.
	 *
	 * @return the user name of this not used security
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this not used security.
	 *
	 * @param userName the user name of this not used security
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this not used security.
	 *
	 * @return the create date of this not used security
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this not used security.
	 *
	 * @param createDate the create date of this not used security
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this not used security.
	 *
	 * @return the modified date of this not used security
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this not used security.
	 *
	 * @param modifiedDate the modified date of this not used security
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the real property of this not used security.
	 *
	 * @return the real property of this not used security
	 */
	@AutoEscape
	public String getRealProperty();

	/**
	 * Sets the real property of this not used security.
	 *
	 * @param realProperty the real property of this not used security
	 */
	public void setRealProperty(String realProperty);

	/**
	 * Returns the not used location of this not used security.
	 *
	 * @return the not used location of this not used security
	 */
	@AutoEscape
	public String getNotUsedLocation();

	/**
	 * Sets the not used location of this not used security.
	 *
	 * @param notUsedLocation the not used location of this not used security
	 */
	public void setNotUsedLocation(String notUsedLocation);

	/**
	 * Returns the not used description of this not used security.
	 *
	 * @return the not used description of this not used security
	 */
	@AutoEscape
	public String getNotUsedDescription();

	/**
	 * Sets the not used description of this not used security.
	 *
	 * @param notUsedDescription the not used description of this not used security
	 */
	public void setNotUsedDescription(String notUsedDescription);

	/**
	 * Returns the not used counter of this not used security.
	 *
	 * @return the not used counter of this not used security
	 */
	@AutoEscape
	public String getNotUsedCounter();

	/**
	 * Sets the not used counter of this not used security.
	 *
	 * @param notUsedCounter the not used counter of this not used security
	 */
	public void setNotUsedCounter(String notUsedCounter);

	/**
	 * Returns the not used value of this not used security.
	 *
	 * @return the not used value of this not used security
	 */
	@AutoEscape
	public String getNotUsedValue();

	/**
	 * Sets the not used value of this not used security.
	 *
	 * @param notUsedValue the not used value of this not used security
	 */
	public void setNotUsedValue(String notUsedValue);

	/**
	 * Returns the not net value of this not used security.
	 *
	 * @return the not net value of this not used security
	 */
	@AutoEscape
	public String getNotNetValue();

	/**
	 * Sets the not net value of this not used security.
	 *
	 * @param notNetValue the not net value of this not used security
	 */
	public void setNotNetValue(String notNetValue);

	/**
	 * Returns the osi insolvency ID of this not used security.
	 *
	 * @return the osi insolvency ID of this not used security
	 */
	public long getOsiInsolvencyId();

	/**
	 * Sets the osi insolvency ID of this not used security.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this not used security
	 */
	public void setOsiInsolvencyId(long osiInsolvencyId);

	@Override
	public NotUsedSecurity cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}