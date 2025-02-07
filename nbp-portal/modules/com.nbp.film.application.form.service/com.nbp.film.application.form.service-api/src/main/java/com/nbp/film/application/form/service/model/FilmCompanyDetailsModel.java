/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the FilmCompanyDetails service. Represents a row in the &quot;nbp_film_company_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.film.application.form.service.model.impl.FilmCompanyDetailsModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.film.application.form.service.model.impl.FilmCompanyDetailsImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmCompanyDetails
 * @generated
 */
@ProviderType
public interface FilmCompanyDetailsModel
	extends BaseModel<FilmCompanyDetails>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a film company details model instance should use the {@link FilmCompanyDetails} interface instead.
	 */

	/**
	 * Returns the primary key of this film company details.
	 *
	 * @return the primary key of this film company details
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this film company details.
	 *
	 * @param primaryKey the primary key of this film company details
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the film company details ID of this film company details.
	 *
	 * @return the film company details ID of this film company details
	 */
	public long getFilmCompanyDetailsId();

	/**
	 * Sets the film company details ID of this film company details.
	 *
	 * @param filmCompanyDetailsId the film company details ID of this film company details
	 */
	public void setFilmCompanyDetailsId(long filmCompanyDetailsId);

	/**
	 * Returns the group ID of this film company details.
	 *
	 * @return the group ID of this film company details
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this film company details.
	 *
	 * @param groupId the group ID of this film company details
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this film company details.
	 *
	 * @return the company ID of this film company details
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this film company details.
	 *
	 * @param companyId the company ID of this film company details
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this film company details.
	 *
	 * @return the user ID of this film company details
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this film company details.
	 *
	 * @param userId the user ID of this film company details
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this film company details.
	 *
	 * @return the user uuid of this film company details
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this film company details.
	 *
	 * @param userUuid the user uuid of this film company details
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this film company details.
	 *
	 * @return the user name of this film company details
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this film company details.
	 *
	 * @param userName the user name of this film company details
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this film company details.
	 *
	 * @return the create date of this film company details
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this film company details.
	 *
	 * @param createDate the create date of this film company details
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this film company details.
	 *
	 * @return the modified date of this film company details
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this film company details.
	 *
	 * @param modifiedDate the modified date of this film company details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the company name of this film company details.
	 *
	 * @return the company name of this film company details
	 */
	@AutoEscape
	public String getCompanyName();

	/**
	 * Sets the company name of this film company details.
	 *
	 * @param companyName the company name of this film company details
	 */
	public void setCompanyName(String companyName);

	/**
	 * Returns the address of this film company details.
	 *
	 * @return the address of this film company details
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this film company details.
	 *
	 * @param address the address of this film company details
	 */
	public void setAddress(String address);

	/**
	 * Returns the country origin of this film company details.
	 *
	 * @return the country origin of this film company details
	 */
	@AutoEscape
	public String getCountryOrigin();

	/**
	 * Sets the country origin of this film company details.
	 *
	 * @param countryOrigin the country origin of this film company details
	 */
	public void setCountryOrigin(String countryOrigin);

	/**
	 * Returns the telephone number of this film company details.
	 *
	 * @return the telephone number of this film company details
	 */
	@AutoEscape
	public String getTelephoneNumber();

	/**
	 * Sets the telephone number of this film company details.
	 *
	 * @param telephoneNumber the telephone number of this film company details
	 */
	public void setTelephoneNumber(String telephoneNumber);

	/**
	 * Returns the mobile of this film company details.
	 *
	 * @return the mobile of this film company details
	 */
	@AutoEscape
	public String getMobile();

	/**
	 * Sets the mobile of this film company details.
	 *
	 * @param mobile the mobile of this film company details
	 */
	public void setMobile(String mobile);

	/**
	 * Returns the contact person of this film company details.
	 *
	 * @return the contact person of this film company details
	 */
	@AutoEscape
	public String getContactPerson();

	/**
	 * Sets the contact person of this film company details.
	 *
	 * @param contactPerson the contact person of this film company details
	 */
	public void setContactPerson(String contactPerson);

	/**
	 * Returns the email of this film company details.
	 *
	 * @return the email of this film company details
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this film company details.
	 *
	 * @param email the email of this film company details
	 */
	public void setEmail(String email);

	/**
	 * Returns the position of this film company details.
	 *
	 * @return the position of this film company details
	 */
	@AutoEscape
	public String getPosition();

	/**
	 * Sets the position of this film company details.
	 *
	 * @param position the position of this film company details
	 */
	public void setPosition(String position);

	/**
	 * Returns the film application ID of this film company details.
	 *
	 * @return the film application ID of this film company details
	 */
	public long getFilmApplicationId();

	/**
	 * Sets the film application ID of this film company details.
	 *
	 * @param filmApplicationId the film application ID of this film company details
	 */
	public void setFilmApplicationId(long filmApplicationId);

	@Override
	public FilmCompanyDetails cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}