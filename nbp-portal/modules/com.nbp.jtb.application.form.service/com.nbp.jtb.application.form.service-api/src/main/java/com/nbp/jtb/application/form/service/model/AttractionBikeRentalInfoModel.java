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
 * The base model interface for the AttractionBikeRentalInfo service. Represents a row in the &quot;nbp_jtb_bike_rental&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.jtb.application.form.service.model.impl.AttractionBikeRentalInfoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.jtb.application.form.service.model.impl.AttractionBikeRentalInfoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionBikeRentalInfo
 * @generated
 */
@ProviderType
public interface AttractionBikeRentalInfoModel
	extends BaseModel<AttractionBikeRentalInfo>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a attraction bike rental info model instance should use the {@link AttractionBikeRentalInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this attraction bike rental info.
	 *
	 * @return the primary key of this attraction bike rental info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this attraction bike rental info.
	 *
	 * @param primaryKey the primary key of this attraction bike rental info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the attraction bike rental info ID of this attraction bike rental info.
	 *
	 * @return the attraction bike rental info ID of this attraction bike rental info
	 */
	public long getAttractionBikeRentalInfoId();

	/**
	 * Sets the attraction bike rental info ID of this attraction bike rental info.
	 *
	 * @param attractionBikeRentalInfoId the attraction bike rental info ID of this attraction bike rental info
	 */
	public void setAttractionBikeRentalInfoId(long attractionBikeRentalInfoId);

	/**
	 * Returns the group ID of this attraction bike rental info.
	 *
	 * @return the group ID of this attraction bike rental info
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this attraction bike rental info.
	 *
	 * @param groupId the group ID of this attraction bike rental info
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this attraction bike rental info.
	 *
	 * @return the company ID of this attraction bike rental info
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this attraction bike rental info.
	 *
	 * @param companyId the company ID of this attraction bike rental info
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this attraction bike rental info.
	 *
	 * @return the user ID of this attraction bike rental info
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this attraction bike rental info.
	 *
	 * @param userId the user ID of this attraction bike rental info
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this attraction bike rental info.
	 *
	 * @return the user uuid of this attraction bike rental info
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this attraction bike rental info.
	 *
	 * @param userUuid the user uuid of this attraction bike rental info
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this attraction bike rental info.
	 *
	 * @return the user name of this attraction bike rental info
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this attraction bike rental info.
	 *
	 * @param userName the user name of this attraction bike rental info
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this attraction bike rental info.
	 *
	 * @return the create date of this attraction bike rental info
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this attraction bike rental info.
	 *
	 * @param createDate the create date of this attraction bike rental info
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this attraction bike rental info.
	 *
	 * @return the modified date of this attraction bike rental info
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this attraction bike rental info.
	 *
	 * @param modifiedDate the modified date of this attraction bike rental info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the applicant name of this attraction bike rental info.
	 *
	 * @return the applicant name of this attraction bike rental info
	 */
	@AutoEscape
	public String getApplicantName();

	/**
	 * Sets the applicant name of this attraction bike rental info.
	 *
	 * @param applicantName the applicant name of this attraction bike rental info
	 */
	public void setApplicantName(String applicantName);

	/**
	 * Returns the address of this attraction bike rental info.
	 *
	 * @return the address of this attraction bike rental info
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this attraction bike rental info.
	 *
	 * @param address the address of this attraction bike rental info
	 */
	public void setAddress(String address);

	/**
	 * Returns the company name of this attraction bike rental info.
	 *
	 * @return the company name of this attraction bike rental info
	 */
	@AutoEscape
	public String getCompanyName();

	/**
	 * Sets the company name of this attraction bike rental info.
	 *
	 * @param companyName the company name of this attraction bike rental info
	 */
	public void setCompanyName(String companyName);

	/**
	 * Returns the exact location of this attraction bike rental info.
	 *
	 * @return the exact location of this attraction bike rental info
	 */
	@AutoEscape
	public String getExactLocation();

	/**
	 * Sets the exact location of this attraction bike rental info.
	 *
	 * @param exactLocation the exact location of this attraction bike rental info
	 */
	public void setExactLocation(String exactLocation);

	/**
	 * Returns the telephone of this attraction bike rental info.
	 *
	 * @return the telephone of this attraction bike rental info
	 */
	@AutoEscape
	public String getTelephone();

	/**
	 * Sets the telephone of this attraction bike rental info.
	 *
	 * @param telephone the telephone of this attraction bike rental info
	 */
	public void setTelephone(String telephone);

	/**
	 * Returns the email of this attraction bike rental info.
	 *
	 * @return the email of this attraction bike rental info
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this attraction bike rental info.
	 *
	 * @param email the email of this attraction bike rental info
	 */
	public void setEmail(String email);

	/**
	 * Returns the registration date of this attraction bike rental info.
	 *
	 * @return the registration date of this attraction bike rental info
	 */
	public Date getRegistrationDate();

	/**
	 * Sets the registration date of this attraction bike rental info.
	 *
	 * @param registrationDate the registration date of this attraction bike rental info
	 */
	public void setRegistrationDate(Date registrationDate);

	/**
	 * Returns the manager name of this attraction bike rental info.
	 *
	 * @return the manager name of this attraction bike rental info
	 */
	@AutoEscape
	public String getManagerName();

	/**
	 * Sets the manager name of this attraction bike rental info.
	 *
	 * @param managerName the manager name of this attraction bike rental info
	 */
	public void setManagerName(String managerName);

	/**
	 * Returns the number of bikes of this attraction bike rental info.
	 *
	 * @return the number of bikes of this attraction bike rental info
	 */
	@AutoEscape
	public String getNumberOfBikes();

	/**
	 * Sets the number of bikes of this attraction bike rental info.
	 *
	 * @param numberOfBikes the number of bikes of this attraction bike rental info
	 */
	public void setNumberOfBikes(String numberOfBikes);

	/**
	 * Returns the number of helmets of this attraction bike rental info.
	 *
	 * @return the number of helmets of this attraction bike rental info
	 */
	@AutoEscape
	public String getNumberOfHelmets();

	/**
	 * Sets the number of helmets of this attraction bike rental info.
	 *
	 * @param numberOfHelmets the number of helmets of this attraction bike rental info
	 */
	public void setNumberOfHelmets(String numberOfHelmets);

	/**
	 * Returns the number of employees of this attraction bike rental info.
	 *
	 * @return the number of employees of this attraction bike rental info
	 */
	@AutoEscape
	public String getNumberOfEmployees();

	/**
	 * Sets the number of employees of this attraction bike rental info.
	 *
	 * @param numberOfEmployees the number of employees of this attraction bike rental info
	 */
	public void setNumberOfEmployees(String numberOfEmployees);

	/**
	 * Returns the signature date of this attraction bike rental info.
	 *
	 * @return the signature date of this attraction bike rental info
	 */
	public Date getSignatureDate();

	/**
	 * Sets the signature date of this attraction bike rental info.
	 *
	 * @param signatureDate the signature date of this attraction bike rental info
	 */
	public void setSignatureDate(Date signatureDate);

	/**
	 * Returns the motor bike industry of this attraction bike rental info.
	 *
	 * @return the motor bike industry of this attraction bike rental info
	 */
	@AutoEscape
	public String getMotorBikeIndustry();

	/**
	 * Sets the motor bike industry of this attraction bike rental info.
	 *
	 * @param motorBikeIndustry the motor bike industry of this attraction bike rental info
	 */
	public void setMotorBikeIndustry(String motorBikeIndustry);

	/**
	 * Returns the jtb application ID of this attraction bike rental info.
	 *
	 * @return the jtb application ID of this attraction bike rental info
	 */
	public long getJtbApplicationId();

	/**
	 * Sets the jtb application ID of this attraction bike rental info.
	 *
	 * @param jtbApplicationId the jtb application ID of this attraction bike rental info
	 */
	public void setJtbApplicationId(long jtbApplicationId);

	@Override
	public AttractionBikeRentalInfo cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}