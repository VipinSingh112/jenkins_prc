/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the QualityEmploymentInfo service. Represents a row in the &quot;nbp_hsra_quality_employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.hsra.application.service.model.impl.QualityEmploymentInfoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.hsra.application.service.model.impl.QualityEmploymentInfoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualityEmploymentInfo
 * @generated
 */
@ProviderType
public interface QualityEmploymentInfoModel
	extends BaseModel<QualityEmploymentInfo>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a quality employment info model instance should use the {@link QualityEmploymentInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this quality employment info.
	 *
	 * @return the primary key of this quality employment info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this quality employment info.
	 *
	 * @param primaryKey the primary key of this quality employment info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the quality employment info ID of this quality employment info.
	 *
	 * @return the quality employment info ID of this quality employment info
	 */
	public long getQualityEmploymentInfoId();

	/**
	 * Sets the quality employment info ID of this quality employment info.
	 *
	 * @param qualityEmploymentInfoId the quality employment info ID of this quality employment info
	 */
	public void setQualityEmploymentInfoId(long qualityEmploymentInfoId);

	/**
	 * Returns the group ID of this quality employment info.
	 *
	 * @return the group ID of this quality employment info
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this quality employment info.
	 *
	 * @param groupId the group ID of this quality employment info
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this quality employment info.
	 *
	 * @return the company ID of this quality employment info
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this quality employment info.
	 *
	 * @param companyId the company ID of this quality employment info
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this quality employment info.
	 *
	 * @return the user ID of this quality employment info
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this quality employment info.
	 *
	 * @param userId the user ID of this quality employment info
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this quality employment info.
	 *
	 * @return the user uuid of this quality employment info
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this quality employment info.
	 *
	 * @param userUuid the user uuid of this quality employment info
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this quality employment info.
	 *
	 * @return the user name of this quality employment info
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this quality employment info.
	 *
	 * @param userName the user name of this quality employment info
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this quality employment info.
	 *
	 * @return the create date of this quality employment info
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this quality employment info.
	 *
	 * @param createDate the create date of this quality employment info
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this quality employment info.
	 *
	 * @return the modified date of this quality employment info
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this quality employment info.
	 *
	 * @param modifiedDate the modified date of this quality employment info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the company name of this quality employment info.
	 *
	 * @return the company name of this quality employment info
	 */
	@AutoEscape
	public String getCompanyName();

	/**
	 * Sets the company name of this quality employment info.
	 *
	 * @param companyName the company name of this quality employment info
	 */
	public void setCompanyName(String companyName);

	/**
	 * Returns the tele no of this quality employment info.
	 *
	 * @return the tele no of this quality employment info
	 */
	@AutoEscape
	public String getTeleNo();

	/**
	 * Sets the tele no of this quality employment info.
	 *
	 * @param teleNo the tele no of this quality employment info
	 */
	public void setTeleNo(String teleNo);

	/**
	 * Returns the address of this quality employment info.
	 *
	 * @return the address of this quality employment info
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this quality employment info.
	 *
	 * @param address the address of this quality employment info
	 */
	public void setAddress(String address);

	/**
	 * Returns the parish of this quality employment info.
	 *
	 * @return the parish of this quality employment info
	 */
	@AutoEscape
	public String getParish();

	/**
	 * Sets the parish of this quality employment info.
	 *
	 * @param parish the parish of this quality employment info
	 */
	public void setParish(String parish);

	/**
	 * Returns the mobile no of this quality employment info.
	 *
	 * @return the mobile no of this quality employment info
	 */
	@AutoEscape
	public String getMobileNo();

	/**
	 * Sets the mobile no of this quality employment info.
	 *
	 * @param mobileNo the mobile no of this quality employment info
	 */
	public void setMobileNo(String mobileNo);

	/**
	 * Returns the email address of this quality employment info.
	 *
	 * @return the email address of this quality employment info
	 */
	@AutoEscape
	public String getEmailAddress();

	/**
	 * Sets the email address of this quality employment info.
	 *
	 * @param emailAddress the email address of this quality employment info
	 */
	public void setEmailAddress(String emailAddress);

	/**
	 * Returns the hsra application ID of this quality employment info.
	 *
	 * @return the hsra application ID of this quality employment info
	 */
	public long getHsraApplicationId();

	/**
	 * Sets the hsra application ID of this quality employment info.
	 *
	 * @param hsraApplicationId the hsra application ID of this quality employment info
	 */
	public void setHsraApplicationId(long hsraApplicationId);

	@Override
	public QualityEmploymentInfo cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}