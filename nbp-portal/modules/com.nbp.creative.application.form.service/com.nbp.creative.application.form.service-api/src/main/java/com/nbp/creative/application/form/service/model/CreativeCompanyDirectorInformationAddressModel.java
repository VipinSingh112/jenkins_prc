/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the CreativeCompanyDirectorInformationAddress service. Represents a row in the &quot;nbp_creactive_company_dia&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyDirectorInformationAddressModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyDirectorInformationAddressImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDirectorInformationAddress
 * @generated
 */
@ProviderType
public interface CreativeCompanyDirectorInformationAddressModel
	extends BaseModel<CreativeCompanyDirectorInformationAddress>, GroupedModel,
			ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a creative company director information address model instance should use the {@link CreativeCompanyDirectorInformationAddress} interface instead.
	 */

	/**
	 * Returns the primary key of this creative company director information address.
	 *
	 * @return the primary key of this creative company director information address
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this creative company director information address.
	 *
	 * @param primaryKey the primary key of this creative company director information address
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the creative com director address ID of this creative company director information address.
	 *
	 * @return the creative com director address ID of this creative company director information address
	 */
	public long getCreativeComDirectorAddressId();

	/**
	 * Sets the creative com director address ID of this creative company director information address.
	 *
	 * @param creativeComDirectorAddressId the creative com director address ID of this creative company director information address
	 */
	public void setCreativeComDirectorAddressId(
		long creativeComDirectorAddressId);

	/**
	 * Returns the group ID of this creative company director information address.
	 *
	 * @return the group ID of this creative company director information address
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this creative company director information address.
	 *
	 * @param groupId the group ID of this creative company director information address
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this creative company director information address.
	 *
	 * @return the company ID of this creative company director information address
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this creative company director information address.
	 *
	 * @param companyId the company ID of this creative company director information address
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this creative company director information address.
	 *
	 * @return the user ID of this creative company director information address
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this creative company director information address.
	 *
	 * @param userId the user ID of this creative company director information address
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this creative company director information address.
	 *
	 * @return the user uuid of this creative company director information address
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this creative company director information address.
	 *
	 * @param userUuid the user uuid of this creative company director information address
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this creative company director information address.
	 *
	 * @return the user name of this creative company director information address
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this creative company director information address.
	 *
	 * @param userName the user name of this creative company director information address
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this creative company director information address.
	 *
	 * @return the create date of this creative company director information address
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this creative company director information address.
	 *
	 * @param createDate the create date of this creative company director information address
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this creative company director information address.
	 *
	 * @return the modified date of this creative company director information address
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this creative company director information address.
	 *
	 * @param modifiedDate the modified date of this creative company director information address
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the street address of this creative company director information address.
	 *
	 * @return the street address of this creative company director information address
	 */
	@AutoEscape
	public String getStreetAddress();

	/**
	 * Sets the street address of this creative company director information address.
	 *
	 * @param streetAddress the street address of this creative company director information address
	 */
	public void setStreetAddress(String streetAddress);

	/**
	 * Returns the street address line two of this creative company director information address.
	 *
	 * @return the street address line two of this creative company director information address
	 */
	@AutoEscape
	public String getStreetAddressLineTwo();

	/**
	 * Sets the street address line two of this creative company director information address.
	 *
	 * @param streetAddressLineTwo the street address line two of this creative company director information address
	 */
	public void setStreetAddressLineTwo(String streetAddressLineTwo);

	/**
	 * Returns the creative application ID of this creative company director information address.
	 *
	 * @return the creative application ID of this creative company director information address
	 */
	public long getCreativeApplicationId();

	/**
	 * Sets the creative application ID of this creative company director information address.
	 *
	 * @param CreativeApplicationId the creative application ID of this creative company director information address
	 */
	public void setCreativeApplicationId(long CreativeApplicationId);

	/**
	 * Returns the creative com director info ID of this creative company director information address.
	 *
	 * @return the creative com director info ID of this creative company director information address
	 */
	public long getCreativeComDirectorInfoId();

	/**
	 * Sets the creative com director info ID of this creative company director information address.
	 *
	 * @param creativeComDirectorInfoId the creative com director info ID of this creative company director information address
	 */
	public void setCreativeComDirectorInfoId(long creativeComDirectorInfoId);

	@Override
	public CreativeCompanyDirectorInformationAddress cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}