/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the TourismNewAccoSignInfo service. Represents a row in the &quot;nbp_tourism_new_acco_signinfo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAccoSignInfoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAccoSignInfoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoSignInfo
 * @generated
 */
@ProviderType
public interface TourismNewAccoSignInfoModel
	extends BaseModel<TourismNewAccoSignInfo>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tourism new acco sign info model instance should use the {@link TourismNewAccoSignInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this tourism new acco sign info.
	 *
	 * @return the primary key of this tourism new acco sign info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tourism new acco sign info.
	 *
	 * @param primaryKey the primary key of this tourism new acco sign info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the tourism new acco sign info ID of this tourism new acco sign info.
	 *
	 * @return the tourism new acco sign info ID of this tourism new acco sign info
	 */
	public long getTourismNewAccoSignInfoId();

	/**
	 * Sets the tourism new acco sign info ID of this tourism new acco sign info.
	 *
	 * @param tourismNewAccoSignInfoId the tourism new acco sign info ID of this tourism new acco sign info
	 */
	public void setTourismNewAccoSignInfoId(long tourismNewAccoSignInfoId);

	/**
	 * Returns the group ID of this tourism new acco sign info.
	 *
	 * @return the group ID of this tourism new acco sign info
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this tourism new acco sign info.
	 *
	 * @param groupId the group ID of this tourism new acco sign info
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this tourism new acco sign info.
	 *
	 * @return the company ID of this tourism new acco sign info
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this tourism new acco sign info.
	 *
	 * @param companyId the company ID of this tourism new acco sign info
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this tourism new acco sign info.
	 *
	 * @return the user ID of this tourism new acco sign info
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this tourism new acco sign info.
	 *
	 * @param userId the user ID of this tourism new acco sign info
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this tourism new acco sign info.
	 *
	 * @return the user uuid of this tourism new acco sign info
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this tourism new acco sign info.
	 *
	 * @param userUuid the user uuid of this tourism new acco sign info
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this tourism new acco sign info.
	 *
	 * @return the user name of this tourism new acco sign info
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this tourism new acco sign info.
	 *
	 * @param userName the user name of this tourism new acco sign info
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this tourism new acco sign info.
	 *
	 * @return the create date of this tourism new acco sign info
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this tourism new acco sign info.
	 *
	 * @param createDate the create date of this tourism new acco sign info
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this tourism new acco sign info.
	 *
	 * @return the modified date of this tourism new acco sign info
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this tourism new acco sign info.
	 *
	 * @param modifiedDate the modified date of this tourism new acco sign info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the sign applicant name of this tourism new acco sign info.
	 *
	 * @return the sign applicant name of this tourism new acco sign info
	 */
	@AutoEscape
	public String getSignApplicantName();

	/**
	 * Sets the sign applicant name of this tourism new acco sign info.
	 *
	 * @param signApplicantName the sign applicant name of this tourism new acco sign info
	 */
	public void setSignApplicantName(String signApplicantName);

	/**
	 * Returns the sign applicant status of this tourism new acco sign info.
	 *
	 * @return the sign applicant status of this tourism new acco sign info
	 */
	@AutoEscape
	public String getSignApplicantStatus();

	/**
	 * Sets the sign applicant status of this tourism new acco sign info.
	 *
	 * @param signApplicantStatus the sign applicant status of this tourism new acco sign info
	 */
	public void setSignApplicantStatus(String signApplicantStatus);

	/**
	 * Returns the new sign date of this tourism new acco sign info.
	 *
	 * @return the new sign date of this tourism new acco sign info
	 */
	public Date getNewSignDate();

	/**
	 * Sets the new sign date of this tourism new acco sign info.
	 *
	 * @param newSignDate the new sign date of this tourism new acco sign info
	 */
	public void setNewSignDate(Date newSignDate);

	/**
	 * Returns the tourism application ID of this tourism new acco sign info.
	 *
	 * @return the tourism application ID of this tourism new acco sign info
	 */
	public long getTourismApplicationId();

	/**
	 * Sets the tourism application ID of this tourism new acco sign info.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism new acco sign info
	 */
	public void setTourismApplicationId(long tourismApplicationId);

	@Override
	public TourismNewAccoSignInfo cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}