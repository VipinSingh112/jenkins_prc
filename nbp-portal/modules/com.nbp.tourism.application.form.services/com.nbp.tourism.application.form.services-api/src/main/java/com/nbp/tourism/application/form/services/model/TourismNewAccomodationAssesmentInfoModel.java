/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the TourismNewAccomodationAssesmentInfo service. Represents a row in the &quot;nbp_tourism_new_acco_assesm&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAccomodationAssesmentInfoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAccomodationAssesmentInfoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccomodationAssesmentInfo
 * @generated
 */
@ProviderType
public interface TourismNewAccomodationAssesmentInfoModel
	extends BaseModel<TourismNewAccomodationAssesmentInfo>, GroupedModel,
			ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tourism new accomodation assesment info model instance should use the {@link TourismNewAccomodationAssesmentInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this tourism new accomodation assesment info.
	 *
	 * @return the primary key of this tourism new accomodation assesment info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tourism new accomodation assesment info.
	 *
	 * @param primaryKey the primary key of this tourism new accomodation assesment info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the tourism new accomodation asses ID of this tourism new accomodation assesment info.
	 *
	 * @return the tourism new accomodation asses ID of this tourism new accomodation assesment info
	 */
	public long getTourismNewAccomodationAssesId();

	/**
	 * Sets the tourism new accomodation asses ID of this tourism new accomodation assesment info.
	 *
	 * @param tourismNewAccomodationAssesId the tourism new accomodation asses ID of this tourism new accomodation assesment info
	 */
	public void setTourismNewAccomodationAssesId(
		long tourismNewAccomodationAssesId);

	/**
	 * Returns the group ID of this tourism new accomodation assesment info.
	 *
	 * @return the group ID of this tourism new accomodation assesment info
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this tourism new accomodation assesment info.
	 *
	 * @param groupId the group ID of this tourism new accomodation assesment info
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this tourism new accomodation assesment info.
	 *
	 * @return the company ID of this tourism new accomodation assesment info
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this tourism new accomodation assesment info.
	 *
	 * @param companyId the company ID of this tourism new accomodation assesment info
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this tourism new accomodation assesment info.
	 *
	 * @return the user ID of this tourism new accomodation assesment info
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this tourism new accomodation assesment info.
	 *
	 * @param userId the user ID of this tourism new accomodation assesment info
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this tourism new accomodation assesment info.
	 *
	 * @return the user uuid of this tourism new accomodation assesment info
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this tourism new accomodation assesment info.
	 *
	 * @param userUuid the user uuid of this tourism new accomodation assesment info
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this tourism new accomodation assesment info.
	 *
	 * @return the user name of this tourism new accomodation assesment info
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this tourism new accomodation assesment info.
	 *
	 * @param userName the user name of this tourism new accomodation assesment info
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this tourism new accomodation assesment info.
	 *
	 * @return the create date of this tourism new accomodation assesment info
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this tourism new accomodation assesment info.
	 *
	 * @param createDate the create date of this tourism new accomodation assesment info
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this tourism new accomodation assesment info.
	 *
	 * @return the modified date of this tourism new accomodation assesment info
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this tourism new accomodation assesment info.
	 *
	 * @param modifiedDate the modified date of this tourism new accomodation assesment info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the country origin of this tourism new accomodation assesment info.
	 *
	 * @return the country origin of this tourism new accomodation assesment info
	 */
	@AutoEscape
	public String getCountryOrigin();

	/**
	 * Sets the country origin of this tourism new accomodation assesment info.
	 *
	 * @param countryOrigin the country origin of this tourism new accomodation assesment info
	 */
	public void setCountryOrigin(String countryOrigin);

	/**
	 * Returns the joint venture of this tourism new accomodation assesment info.
	 *
	 * @return the joint venture of this tourism new accomodation assesment info
	 */
	@AutoEscape
	public String getJointVenture();

	/**
	 * Sets the joint venture of this tourism new accomodation assesment info.
	 *
	 * @param jointVenture the joint venture of this tourism new accomodation assesment info
	 */
	public void setJointVenture(String jointVenture);

	/**
	 * Returns the local per of this tourism new accomodation assesment info.
	 *
	 * @return the local per of this tourism new accomodation assesment info
	 */
	@AutoEscape
	public String getLocalPer();

	/**
	 * Sets the local per of this tourism new accomodation assesment info.
	 *
	 * @param localPer the local per of this tourism new accomodation assesment info
	 */
	public void setLocalPer(String localPer);

	/**
	 * Returns the foreign per of this tourism new accomodation assesment info.
	 *
	 * @return the foreign per of this tourism new accomodation assesment info
	 */
	@AutoEscape
	public String getForeignPer();

	/**
	 * Sets the foreign per of this tourism new accomodation assesment info.
	 *
	 * @param foreignPer the foreign per of this tourism new accomodation assesment info
	 */
	public void setForeignPer(String foreignPer);

	/**
	 * Returns the capital invest of this tourism new accomodation assesment info.
	 *
	 * @return the capital invest of this tourism new accomodation assesment info
	 */
	@AutoEscape
	public String getCapitalInvest();

	/**
	 * Sets the capital invest of this tourism new accomodation assesment info.
	 *
	 * @param capitalInvest the capital invest of this tourism new accomodation assesment info
	 */
	public void setCapitalInvest(String capitalInvest);

	/**
	 * Returns the source attach of this tourism new accomodation assesment info.
	 *
	 * @return the source attach of this tourism new accomodation assesment info
	 */
	@AutoEscape
	public String getSourceAttach();

	/**
	 * Sets the source attach of this tourism new accomodation assesment info.
	 *
	 * @param sourceAttach the source attach of this tourism new accomodation assesment info
	 */
	public void setSourceAttach(String sourceAttach);

	/**
	 * Returns the share capital of this tourism new accomodation assesment info.
	 *
	 * @return the share capital of this tourism new accomodation assesment info
	 */
	@AutoEscape
	public String getShareCapital();

	/**
	 * Sets the share capital of this tourism new accomodation assesment info.
	 *
	 * @param shareCapital the share capital of this tourism new accomodation assesment info
	 */
	public void setShareCapital(String shareCapital);

	/**
	 * Returns the loan capital of this tourism new accomodation assesment info.
	 *
	 * @return the loan capital of this tourism new accomodation assesment info
	 */
	@AutoEscape
	public String getLoanCapital();

	/**
	 * Sets the loan capital of this tourism new accomodation assesment info.
	 *
	 * @param loanCapital the loan capital of this tourism new accomodation assesment info
	 */
	public void setLoanCapital(String loanCapital);

	/**
	 * Returns the other of this tourism new accomodation assesment info.
	 *
	 * @return the other of this tourism new accomodation assesment info
	 */
	@AutoEscape
	public String getOther();

	/**
	 * Sets the other of this tourism new accomodation assesment info.
	 *
	 * @param other the other of this tourism new accomodation assesment info
	 */
	public void setOther(String other);

	/**
	 * Returns the tourism application ID of this tourism new accomodation assesment info.
	 *
	 * @return the tourism application ID of this tourism new accomodation assesment info
	 */
	public long getTourismApplicationId();

	/**
	 * Sets the tourism application ID of this tourism new accomodation assesment info.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism new accomodation assesment info
	 */
	public void setTourismApplicationId(long tourismApplicationId);

	@Override
	public TourismNewAccomodationAssesmentInfo cloneWithOriginalValues();

}