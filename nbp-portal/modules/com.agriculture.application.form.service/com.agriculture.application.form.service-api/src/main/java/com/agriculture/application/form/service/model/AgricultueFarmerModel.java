/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the AgricultueFarmer service. Represents a row in the &quot;agriculture_farmer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.agriculture.application.form.service.model.impl.AgricultueFarmerModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.agriculture.application.form.service.model.impl.AgricultueFarmerImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultueFarmer
 * @generated
 */
@ProviderType
public interface AgricultueFarmerModel
	extends BaseModel<AgricultueFarmer>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a agricultue farmer model instance should use the {@link AgricultueFarmer} interface instead.
	 */

	/**
	 * Returns the primary key of this agricultue farmer.
	 *
	 * @return the primary key of this agricultue farmer
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this agricultue farmer.
	 *
	 * @param primaryKey the primary key of this agricultue farmer
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the agricultue farmer ID of this agricultue farmer.
	 *
	 * @return the agricultue farmer ID of this agricultue farmer
	 */
	public long getAgricultueFarmerId();

	/**
	 * Sets the agricultue farmer ID of this agricultue farmer.
	 *
	 * @param agricultueFarmerId the agricultue farmer ID of this agricultue farmer
	 */
	public void setAgricultueFarmerId(long agricultueFarmerId);

	/**
	 * Returns the group ID of this agricultue farmer.
	 *
	 * @return the group ID of this agricultue farmer
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this agricultue farmer.
	 *
	 * @param groupId the group ID of this agricultue farmer
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this agricultue farmer.
	 *
	 * @return the company ID of this agricultue farmer
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this agricultue farmer.
	 *
	 * @param companyId the company ID of this agricultue farmer
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this agricultue farmer.
	 *
	 * @return the user ID of this agricultue farmer
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this agricultue farmer.
	 *
	 * @param userId the user ID of this agricultue farmer
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this agricultue farmer.
	 *
	 * @return the user uuid of this agricultue farmer
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this agricultue farmer.
	 *
	 * @param userUuid the user uuid of this agricultue farmer
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this agricultue farmer.
	 *
	 * @return the user name of this agricultue farmer
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this agricultue farmer.
	 *
	 * @param userName the user name of this agricultue farmer
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this agricultue farmer.
	 *
	 * @return the create date of this agricultue farmer
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this agricultue farmer.
	 *
	 * @param createDate the create date of this agricultue farmer
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this agricultue farmer.
	 *
	 * @return the modified date of this agricultue farmer
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this agricultue farmer.
	 *
	 * @param modifiedDate the modified date of this agricultue farmer
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the farmer detail of this agricultue farmer.
	 *
	 * @return the farmer detail of this agricultue farmer
	 */
	@AutoEscape
	public String getFarmerDetail();

	/**
	 * Sets the farmer detail of this agricultue farmer.
	 *
	 * @param farmerDetail the farmer detail of this agricultue farmer
	 */
	public void setFarmerDetail(String farmerDetail);

	/**
	 * Returns the name of applicant of this agricultue farmer.
	 *
	 * @return the name of applicant of this agricultue farmer
	 */
	@AutoEscape
	public String getNameOfApplicant();

	/**
	 * Sets the name of applicant of this agricultue farmer.
	 *
	 * @param nameOfApplicant the name of applicant of this agricultue farmer
	 */
	public void setNameOfApplicant(String nameOfApplicant);

	/**
	 * Returns the name of farm of this agricultue farmer.
	 *
	 * @return the name of farm of this agricultue farmer
	 */
	@AutoEscape
	public String getNameOfFarm();

	/**
	 * Sets the name of farm of this agricultue farmer.
	 *
	 * @param nameOfFarm the name of farm of this agricultue farmer
	 */
	public void setNameOfFarm(String nameOfFarm);

	/**
	 * Returns the name of proprietor of this agricultue farmer.
	 *
	 * @return the name of proprietor of this agricultue farmer
	 */
	@AutoEscape
	public String getNameOfProprietor();

	/**
	 * Sets the name of proprietor of this agricultue farmer.
	 *
	 * @param nameOfProprietor the name of proprietor of this agricultue farmer
	 */
	public void setNameOfProprietor(String nameOfProprietor);

	/**
	 * Returns the parish address of this agricultue farmer.
	 *
	 * @return the parish address of this agricultue farmer
	 */
	@AutoEscape
	public String getParishAddress();

	/**
	 * Sets the parish address of this agricultue farmer.
	 *
	 * @param parishAddress the parish address of this agricultue farmer
	 */
	public void setParishAddress(String parishAddress);

	/**
	 * Returns the local address of this agricultue farmer.
	 *
	 * @return the local address of this agricultue farmer
	 */
	@AutoEscape
	public String getLocalAddress();

	/**
	 * Sets the local address of this agricultue farmer.
	 *
	 * @param localAddress the local address of this agricultue farmer
	 */
	public void setLocalAddress(String localAddress);

	/**
	 * Returns the taxpayer registration number of this agricultue farmer.
	 *
	 * @return the taxpayer registration number of this agricultue farmer
	 */
	@AutoEscape
	public String getTaxpayerRegistrationNumber();

	/**
	 * Sets the taxpayer registration number of this agricultue farmer.
	 *
	 * @param taxpayerRegistrationNumber the taxpayer registration number of this agricultue farmer
	 */
	public void setTaxpayerRegistrationNumber(
		String taxpayerRegistrationNumber);

	/**
	 * Returns the farmer registration number of this agricultue farmer.
	 *
	 * @return the farmer registration number of this agricultue farmer
	 */
	@AutoEscape
	public String getFarmerRegistrationNumber();

	/**
	 * Sets the farmer registration number of this agricultue farmer.
	 *
	 * @param farmerRegistrationNumber the farmer registration number of this agricultue farmer
	 */
	public void setFarmerRegistrationNumber(String farmerRegistrationNumber);

	/**
	 * Returns the date of incorporation of this agricultue farmer.
	 *
	 * @return the date of incorporation of this agricultue farmer
	 */
	public Date getDateOfIncorporation();

	/**
	 * Sets the date of incorporation of this agricultue farmer.
	 *
	 * @param dateOfIncorporation the date of incorporation of this agricultue farmer
	 */
	public void setDateOfIncorporation(Date dateOfIncorporation);

	/**
	 * Returns the telephone number of this agricultue farmer.
	 *
	 * @return the telephone number of this agricultue farmer
	 */
	@AutoEscape
	public String getTelephoneNumber();

	/**
	 * Sets the telephone number of this agricultue farmer.
	 *
	 * @param telephoneNumber the telephone number of this agricultue farmer
	 */
	public void setTelephoneNumber(String telephoneNumber);

	/**
	 * Returns the email address of this agricultue farmer.
	 *
	 * @return the email address of this agricultue farmer
	 */
	@AutoEscape
	public String getEmailAddress();

	/**
	 * Sets the email address of this agricultue farmer.
	 *
	 * @param emailAddress the email address of this agricultue farmer
	 */
	public void setEmailAddress(String emailAddress);

	/**
	 * Returns the agriculture application ID of this agricultue farmer.
	 *
	 * @return the agriculture application ID of this agricultue farmer
	 */
	public long getAgricultureApplicationId();

	/**
	 * Sets the agriculture application ID of this agricultue farmer.
	 *
	 * @param agricultureApplicationId the agriculture application ID of this agricultue farmer
	 */
	public void setAgricultureApplicationId(long agricultureApplicationId);

	@Override
	public AgricultueFarmer cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}