/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the AccoNonHotelRequiredLic service. Represents a row in the &quot;nbp_jtb_non_hotel_req_lic&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelRequiredLicModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelRequiredLicImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelRequiredLic
 * @generated
 */
@ProviderType
public interface AccoNonHotelRequiredLicModel
	extends BaseModel<AccoNonHotelRequiredLic>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a acco non hotel required lic model instance should use the {@link AccoNonHotelRequiredLic} interface instead.
	 */

	/**
	 * Returns the primary key of this acco non hotel required lic.
	 *
	 * @return the primary key of this acco non hotel required lic
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this acco non hotel required lic.
	 *
	 * @param primaryKey the primary key of this acco non hotel required lic
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the acco non hotel required lic ID of this acco non hotel required lic.
	 *
	 * @return the acco non hotel required lic ID of this acco non hotel required lic
	 */
	public long getAccoNonHotelRequiredLicId();

	/**
	 * Sets the acco non hotel required lic ID of this acco non hotel required lic.
	 *
	 * @param accoNonHotelRequiredLicId the acco non hotel required lic ID of this acco non hotel required lic
	 */
	public void setAccoNonHotelRequiredLicId(long accoNonHotelRequiredLicId);

	/**
	 * Returns the group ID of this acco non hotel required lic.
	 *
	 * @return the group ID of this acco non hotel required lic
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this acco non hotel required lic.
	 *
	 * @param groupId the group ID of this acco non hotel required lic
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this acco non hotel required lic.
	 *
	 * @return the company ID of this acco non hotel required lic
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this acco non hotel required lic.
	 *
	 * @param companyId the company ID of this acco non hotel required lic
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this acco non hotel required lic.
	 *
	 * @return the user ID of this acco non hotel required lic
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this acco non hotel required lic.
	 *
	 * @param userId the user ID of this acco non hotel required lic
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this acco non hotel required lic.
	 *
	 * @return the user uuid of this acco non hotel required lic
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this acco non hotel required lic.
	 *
	 * @param userUuid the user uuid of this acco non hotel required lic
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this acco non hotel required lic.
	 *
	 * @return the user name of this acco non hotel required lic
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this acco non hotel required lic.
	 *
	 * @param userName the user name of this acco non hotel required lic
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this acco non hotel required lic.
	 *
	 * @return the create date of this acco non hotel required lic
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this acco non hotel required lic.
	 *
	 * @param createDate the create date of this acco non hotel required lic
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this acco non hotel required lic.
	 *
	 * @return the modified date of this acco non hotel required lic
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this acco non hotel required lic.
	 *
	 * @param modifiedDate the modified date of this acco non hotel required lic
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the required licence of this acco non hotel required lic.
	 *
	 * @return the required licence of this acco non hotel required lic
	 */
	@AutoEscape
	public String getRequiredLicence();

	/**
	 * Sets the required licence of this acco non hotel required lic.
	 *
	 * @param requiredLicence the required licence of this acco non hotel required lic
	 */
	public void setRequiredLicence(String requiredLicence);

	/**
	 * Returns the required bedroom of this acco non hotel required lic.
	 *
	 * @return the required bedroom of this acco non hotel required lic
	 */
	@AutoEscape
	public String getRequiredBedroom();

	/**
	 * Sets the required bedroom of this acco non hotel required lic.
	 *
	 * @param requiredBedroom the required bedroom of this acco non hotel required lic
	 */
	public void setRequiredBedroom(String requiredBedroom);

	/**
	 * Returns the required bathroom of this acco non hotel required lic.
	 *
	 * @return the required bathroom of this acco non hotel required lic
	 */
	@AutoEscape
	public String getRequiredBathroom();

	/**
	 * Sets the required bathroom of this acco non hotel required lic.
	 *
	 * @param requiredBathroom the required bathroom of this acco non hotel required lic
	 */
	public void setRequiredBathroom(String requiredBathroom);

	/**
	 * Returns the jtb application ID of this acco non hotel required lic.
	 *
	 * @return the jtb application ID of this acco non hotel required lic
	 */
	public long getJtbApplicationId();

	/**
	 * Sets the jtb application ID of this acco non hotel required lic.
	 *
	 * @param jtbApplicationId the jtb application ID of this acco non hotel required lic
	 */
	public void setJtbApplicationId(long jtbApplicationId);

	@Override
	public AccoNonHotelRequiredLic cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}