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
 * The base model interface for the TourismBonaGroundTransportationAddress service. Represents a row in the &quot;nbp_tourism_bona_ground_ta&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportationAddressModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportationAddressImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransportationAddress
 * @generated
 */
@ProviderType
public interface TourismBonaGroundTransportationAddressModel
	extends BaseModel<TourismBonaGroundTransportationAddress>, GroupedModel,
			ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tourism bona ground transportation address model instance should use the {@link TourismBonaGroundTransportationAddress} interface instead.
	 */

	/**
	 * Returns the primary key of this tourism bona ground transportation address.
	 *
	 * @return the primary key of this tourism bona ground transportation address
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tourism bona ground transportation address.
	 *
	 * @param primaryKey the primary key of this tourism bona ground transportation address
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the tourism bona ground trans addres ID of this tourism bona ground transportation address.
	 *
	 * @return the tourism bona ground trans addres ID of this tourism bona ground transportation address
	 */
	public long getTourismBonaGroundTransAddresId();

	/**
	 * Sets the tourism bona ground trans addres ID of this tourism bona ground transportation address.
	 *
	 * @param tourismBonaGroundTransAddresId the tourism bona ground trans addres ID of this tourism bona ground transportation address
	 */
	public void setTourismBonaGroundTransAddresId(
		long tourismBonaGroundTransAddresId);

	/**
	 * Returns the group ID of this tourism bona ground transportation address.
	 *
	 * @return the group ID of this tourism bona ground transportation address
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this tourism bona ground transportation address.
	 *
	 * @param groupId the group ID of this tourism bona ground transportation address
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this tourism bona ground transportation address.
	 *
	 * @return the company ID of this tourism bona ground transportation address
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this tourism bona ground transportation address.
	 *
	 * @param companyId the company ID of this tourism bona ground transportation address
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this tourism bona ground transportation address.
	 *
	 * @return the user ID of this tourism bona ground transportation address
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this tourism bona ground transportation address.
	 *
	 * @param userId the user ID of this tourism bona ground transportation address
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this tourism bona ground transportation address.
	 *
	 * @return the user uuid of this tourism bona ground transportation address
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this tourism bona ground transportation address.
	 *
	 * @param userUuid the user uuid of this tourism bona ground transportation address
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this tourism bona ground transportation address.
	 *
	 * @return the user name of this tourism bona ground transportation address
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this tourism bona ground transportation address.
	 *
	 * @param userName the user name of this tourism bona ground transportation address
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this tourism bona ground transportation address.
	 *
	 * @return the create date of this tourism bona ground transportation address
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this tourism bona ground transportation address.
	 *
	 * @param createDate the create date of this tourism bona ground transportation address
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this tourism bona ground transportation address.
	 *
	 * @return the modified date of this tourism bona ground transportation address
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this tourism bona ground transportation address.
	 *
	 * @param modifiedDate the modified date of this tourism bona ground transportation address
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the address type of this tourism bona ground transportation address.
	 *
	 * @return the address type of this tourism bona ground transportation address
	 */
	@AutoEscape
	public String getAddressType();

	/**
	 * Sets the address type of this tourism bona ground transportation address.
	 *
	 * @param addressType the address type of this tourism bona ground transportation address
	 */
	public void setAddressType(String addressType);

	/**
	 * Returns the bona ground address of this tourism bona ground transportation address.
	 *
	 * @return the bona ground address of this tourism bona ground transportation address
	 */
	@AutoEscape
	public String getBonaGroundAddress();

	/**
	 * Sets the bona ground address of this tourism bona ground transportation address.
	 *
	 * @param bonaGroundAddress the bona ground address of this tourism bona ground transportation address
	 */
	public void setBonaGroundAddress(String bonaGroundAddress);

	/**
	 * Returns the tourism application ID of this tourism bona ground transportation address.
	 *
	 * @return the tourism application ID of this tourism bona ground transportation address
	 */
	public long getTourismApplicationId();

	/**
	 * Sets the tourism application ID of this tourism bona ground transportation address.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona ground transportation address
	 */
	public void setTourismApplicationId(long tourismApplicationId);

	/**
	 * Returns the tourism bona ground transport ID of this tourism bona ground transportation address.
	 *
	 * @return the tourism bona ground transport ID of this tourism bona ground transportation address
	 */
	public long getTourismBonaGroundTransportId();

	/**
	 * Sets the tourism bona ground transport ID of this tourism bona ground transportation address.
	 *
	 * @param tourismBonaGroundTransportId the tourism bona ground transport ID of this tourism bona ground transportation address
	 */
	public void setTourismBonaGroundTransportId(
		long tourismBonaGroundTransportId);

	@Override
	public TourismBonaGroundTransportationAddress cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}