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
 * The base model interface for the TourismBonaAccommodationFormAddress service. Represents a row in the &quot;nbp_tourism_boma_acco_faoo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAccommodationFormAddressModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAccommodationFormAddressImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccommodationFormAddress
 * @generated
 */
@ProviderType
public interface TourismBonaAccommodationFormAddressModel
	extends BaseModel<TourismBonaAccommodationFormAddress>, GroupedModel,
			ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tourism bona accommodation form address model instance should use the {@link TourismBonaAccommodationFormAddress} interface instead.
	 */

	/**
	 * Returns the primary key of this tourism bona accommodation form address.
	 *
	 * @return the primary key of this tourism bona accommodation form address
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tourism bona accommodation form address.
	 *
	 * @param primaryKey the primary key of this tourism bona accommodation form address
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the tourism bona accommodation faoo ID of this tourism bona accommodation form address.
	 *
	 * @return the tourism bona accommodation faoo ID of this tourism bona accommodation form address
	 */
	public long getTourismBonaAccommodationFAOOId();

	/**
	 * Sets the tourism bona accommodation faoo ID of this tourism bona accommodation form address.
	 *
	 * @param tourismBonaAccommodationFAOOId the tourism bona accommodation faoo ID of this tourism bona accommodation form address
	 */
	public void setTourismBonaAccommodationFAOOId(
		long tourismBonaAccommodationFAOOId);

	/**
	 * Returns the group ID of this tourism bona accommodation form address.
	 *
	 * @return the group ID of this tourism bona accommodation form address
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this tourism bona accommodation form address.
	 *
	 * @param groupId the group ID of this tourism bona accommodation form address
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this tourism bona accommodation form address.
	 *
	 * @return the company ID of this tourism bona accommodation form address
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this tourism bona accommodation form address.
	 *
	 * @param companyId the company ID of this tourism bona accommodation form address
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this tourism bona accommodation form address.
	 *
	 * @return the user ID of this tourism bona accommodation form address
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this tourism bona accommodation form address.
	 *
	 * @param userId the user ID of this tourism bona accommodation form address
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this tourism bona accommodation form address.
	 *
	 * @return the user uuid of this tourism bona accommodation form address
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this tourism bona accommodation form address.
	 *
	 * @param userUuid the user uuid of this tourism bona accommodation form address
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this tourism bona accommodation form address.
	 *
	 * @return the user name of this tourism bona accommodation form address
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this tourism bona accommodation form address.
	 *
	 * @param userName the user name of this tourism bona accommodation form address
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this tourism bona accommodation form address.
	 *
	 * @return the create date of this tourism bona accommodation form address
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this tourism bona accommodation form address.
	 *
	 * @param createDate the create date of this tourism bona accommodation form address
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this tourism bona accommodation form address.
	 *
	 * @return the modified date of this tourism bona accommodation form address
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this tourism bona accommodation form address.
	 *
	 * @param modifiedDate the modified date of this tourism bona accommodation form address
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the address type of this tourism bona accommodation form address.
	 *
	 * @return the address type of this tourism bona accommodation form address
	 */
	@AutoEscape
	public String getAddressType();

	/**
	 * Sets the address type of this tourism bona accommodation form address.
	 *
	 * @param addressType the address type of this tourism bona accommodation form address
	 */
	public void setAddressType(String addressType);

	/**
	 * Returns the bona acco address of this tourism bona accommodation form address.
	 *
	 * @return the bona acco address of this tourism bona accommodation form address
	 */
	@AutoEscape
	public String getBonaAccoAddress();

	/**
	 * Sets the bona acco address of this tourism bona accommodation form address.
	 *
	 * @param bonaAccoAddress the bona acco address of this tourism bona accommodation form address
	 */
	public void setBonaAccoAddress(String bonaAccoAddress);

	/**
	 * Returns the bona acco telephone number of this tourism bona accommodation form address.
	 *
	 * @return the bona acco telephone number of this tourism bona accommodation form address
	 */
	@AutoEscape
	public String getBonaAccoTelephoneNumber();

	/**
	 * Sets the bona acco telephone number of this tourism bona accommodation form address.
	 *
	 * @param bonaAccoTelephoneNumber the bona acco telephone number of this tourism bona accommodation form address
	 */
	public void setBonaAccoTelephoneNumber(String bonaAccoTelephoneNumber);

	/**
	 * Returns the bona acco fax number of this tourism bona accommodation form address.
	 *
	 * @return the bona acco fax number of this tourism bona accommodation form address
	 */
	@AutoEscape
	public String getBonaAccoFaxNumber();

	/**
	 * Sets the bona acco fax number of this tourism bona accommodation form address.
	 *
	 * @param bonaAccoFaxNumber the bona acco fax number of this tourism bona accommodation form address
	 */
	public void setBonaAccoFaxNumber(String bonaAccoFaxNumber);

	/**
	 * Returns the bona acco email of this tourism bona accommodation form address.
	 *
	 * @return the bona acco email of this tourism bona accommodation form address
	 */
	@AutoEscape
	public String getBonaAccoEmail();

	/**
	 * Sets the bona acco email of this tourism bona accommodation form address.
	 *
	 * @param bonaAccoEmail the bona acco email of this tourism bona accommodation form address
	 */
	public void setBonaAccoEmail(String bonaAccoEmail);

	/**
	 * Returns the tourism application ID of this tourism bona accommodation form address.
	 *
	 * @return the tourism application ID of this tourism bona accommodation form address
	 */
	public long getTourismApplicationId();

	/**
	 * Sets the tourism application ID of this tourism bona accommodation form address.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona accommodation form address
	 */
	public void setTourismApplicationId(long tourismApplicationId);

	/**
	 * Returns the tourism bona af ID of this tourism bona accommodation form address.
	 *
	 * @return the tourism bona af ID of this tourism bona accommodation form address
	 */
	public long getTourismBonaAFId();

	/**
	 * Sets the tourism bona af ID of this tourism bona accommodation form address.
	 *
	 * @param tourismBonaAFId the tourism bona af ID of this tourism bona accommodation form address
	 */
	public void setTourismBonaAFId(long tourismBonaAFId);

	@Override
	public TourismBonaAccommodationFormAddress cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}