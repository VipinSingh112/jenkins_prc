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
 * The base model interface for the CreativeIndividualDetails service. Represents a row in the &quot;nbp_creative_individual_detail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.creative.application.form.service.model.impl.CreativeIndividualDetailsModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.creative.application.form.service.model.impl.CreativeIndividualDetailsImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualDetails
 * @generated
 */
@ProviderType
public interface CreativeIndividualDetailsModel
	extends BaseModel<CreativeIndividualDetails>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a creative individual details model instance should use the {@link CreativeIndividualDetails} interface instead.
	 */

	/**
	 * Returns the primary key of this creative individual details.
	 *
	 * @return the primary key of this creative individual details
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this creative individual details.
	 *
	 * @param primaryKey the primary key of this creative individual details
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the creative individual details ID of this creative individual details.
	 *
	 * @return the creative individual details ID of this creative individual details
	 */
	public long getCreativeIndividualDetailsId();

	/**
	 * Sets the creative individual details ID of this creative individual details.
	 *
	 * @param creativeIndividualDetailsId the creative individual details ID of this creative individual details
	 */
	public void setCreativeIndividualDetailsId(
		long creativeIndividualDetailsId);

	/**
	 * Returns the group ID of this creative individual details.
	 *
	 * @return the group ID of this creative individual details
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this creative individual details.
	 *
	 * @param groupId the group ID of this creative individual details
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this creative individual details.
	 *
	 * @return the company ID of this creative individual details
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this creative individual details.
	 *
	 * @param companyId the company ID of this creative individual details
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this creative individual details.
	 *
	 * @return the user ID of this creative individual details
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this creative individual details.
	 *
	 * @param userId the user ID of this creative individual details
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this creative individual details.
	 *
	 * @return the user uuid of this creative individual details
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this creative individual details.
	 *
	 * @param userUuid the user uuid of this creative individual details
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this creative individual details.
	 *
	 * @return the user name of this creative individual details
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this creative individual details.
	 *
	 * @param userName the user name of this creative individual details
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this creative individual details.
	 *
	 * @return the create date of this creative individual details
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this creative individual details.
	 *
	 * @param createDate the create date of this creative individual details
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this creative individual details.
	 *
	 * @return the modified date of this creative individual details
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this creative individual details.
	 *
	 * @param modifiedDate the modified date of this creative individual details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the sector of practice of this creative individual details.
	 *
	 * @return the sector of practice of this creative individual details
	 */
	@AutoEscape
	public String getSectorOfPractice();

	/**
	 * Sets the sector of practice of this creative individual details.
	 *
	 * @param sectorOfPractice the sector of practice of this creative individual details
	 */
	public void setSectorOfPractice(String sectorOfPractice);

	/**
	 * Returns the first name of this creative individual details.
	 *
	 * @return the first name of this creative individual details
	 */
	@AutoEscape
	public String getFirstName();

	/**
	 * Sets the first name of this creative individual details.
	 *
	 * @param firstName the first name of this creative individual details
	 */
	public void setFirstName(String firstName);

	/**
	 * Returns the middle name of this creative individual details.
	 *
	 * @return the middle name of this creative individual details
	 */
	@AutoEscape
	public String getMiddleName();

	/**
	 * Sets the middle name of this creative individual details.
	 *
	 * @param middleName the middle name of this creative individual details
	 */
	public void setMiddleName(String middleName);

	/**
	 * Returns the last name of this creative individual details.
	 *
	 * @return the last name of this creative individual details
	 */
	@AutoEscape
	public String getLastName();

	/**
	 * Sets the last name of this creative individual details.
	 *
	 * @param lastName the last name of this creative individual details
	 */
	public void setLastName(String lastName);

	/**
	 * Returns the trn of this creative individual details.
	 *
	 * @return the trn of this creative individual details
	 */
	@AutoEscape
	public String getTrn();

	/**
	 * Sets the trn of this creative individual details.
	 *
	 * @param trn the trn of this creative individual details
	 */
	public void setTrn(String trn);

	/**
	 * Returns the city of this creative individual details.
	 *
	 * @return the city of this creative individual details
	 */
	@AutoEscape
	public String getCity();

	/**
	 * Sets the city of this creative individual details.
	 *
	 * @param city the city of this creative individual details
	 */
	public void setCity(String city);

	/**
	 * Returns the country of this creative individual details.
	 *
	 * @return the country of this creative individual details
	 */
	@AutoEscape
	public String getCountry();

	/**
	 * Sets the country of this creative individual details.
	 *
	 * @param country the country of this creative individual details
	 */
	public void setCountry(String country);

	/**
	 * Returns the sex of this creative individual details.
	 *
	 * @return the sex of this creative individual details
	 */
	@AutoEscape
	public String getSex();

	/**
	 * Sets the sex of this creative individual details.
	 *
	 * @param sex the sex of this creative individual details
	 */
	public void setSex(String sex);

	/**
	 * Returns the cell of this creative individual details.
	 *
	 * @return the cell of this creative individual details
	 */
	@AutoEscape
	public String getCell();

	/**
	 * Sets the cell of this creative individual details.
	 *
	 * @param cell the cell of this creative individual details
	 */
	public void setCell(String cell);

	/**
	 * Returns the email of this creative individual details.
	 *
	 * @return the email of this creative individual details
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this creative individual details.
	 *
	 * @param email the email of this creative individual details
	 */
	public void setEmail(String email);

	/**
	 * Returns the are you student of this creative individual details.
	 *
	 * @return the are you student of this creative individual details
	 */
	@AutoEscape
	public String getAreYouStudent();

	/**
	 * Sets the are you student of this creative individual details.
	 *
	 * @param areYouStudent the are you student of this creative individual details
	 */
	public void setAreYouStudent(String areYouStudent);

	/**
	 * Returns the company email of this creative individual details.
	 *
	 * @return the company email of this creative individual details
	 */
	@AutoEscape
	public String getCompanyEmail();

	/**
	 * Sets the company email of this creative individual details.
	 *
	 * @param companyEmail the company email of this creative individual details
	 */
	public void setCompanyEmail(String companyEmail);

	/**
	 * Returns the company website of this creative individual details.
	 *
	 * @return the company website of this creative individual details
	 */
	@AutoEscape
	public String getCompanyWebsite();

	/**
	 * Sets the company website of this creative individual details.
	 *
	 * @param companyWebsite the company website of this creative individual details
	 */
	public void setCompanyWebsite(String companyWebsite);

	/**
	 * Returns the creative application ID of this creative individual details.
	 *
	 * @return the creative application ID of this creative individual details
	 */
	public long getCreativeApplicationId();

	/**
	 * Sets the creative application ID of this creative individual details.
	 *
	 * @param CreativeApplicationId the creative application ID of this creative individual details
	 */
	public void setCreativeApplicationId(long CreativeApplicationId);

	@Override
	public CreativeIndividualDetails cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}