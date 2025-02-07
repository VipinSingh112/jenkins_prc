/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the MiicApplicantDetails service. Represents a row in the &quot;nbp_miic_applicant_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.miic.application.form.services.model.impl.MiicApplicantDetailsModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.miic.application.form.services.model.impl.MiicApplicantDetailsImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicantDetails
 * @generated
 */
@ProviderType
public interface MiicApplicantDetailsModel
	extends BaseModel<MiicApplicantDetails>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a miic applicant details model instance should use the {@link MiicApplicantDetails} interface instead.
	 */

	/**
	 * Returns the primary key of this miic applicant details.
	 *
	 * @return the primary key of this miic applicant details
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this miic applicant details.
	 *
	 * @param primaryKey the primary key of this miic applicant details
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the miic applicant details ID of this miic applicant details.
	 *
	 * @return the miic applicant details ID of this miic applicant details
	 */
	public long getMiicApplicantDetailsId();

	/**
	 * Sets the miic applicant details ID of this miic applicant details.
	 *
	 * @param miicApplicantDetailsId the miic applicant details ID of this miic applicant details
	 */
	public void setMiicApplicantDetailsId(long miicApplicantDetailsId);

	/**
	 * Returns the group ID of this miic applicant details.
	 *
	 * @return the group ID of this miic applicant details
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this miic applicant details.
	 *
	 * @param groupId the group ID of this miic applicant details
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this miic applicant details.
	 *
	 * @return the company ID of this miic applicant details
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this miic applicant details.
	 *
	 * @param companyId the company ID of this miic applicant details
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this miic applicant details.
	 *
	 * @return the user ID of this miic applicant details
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this miic applicant details.
	 *
	 * @param userId the user ID of this miic applicant details
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this miic applicant details.
	 *
	 * @return the user uuid of this miic applicant details
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this miic applicant details.
	 *
	 * @param userUuid the user uuid of this miic applicant details
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this miic applicant details.
	 *
	 * @return the user name of this miic applicant details
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this miic applicant details.
	 *
	 * @param userName the user name of this miic applicant details
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this miic applicant details.
	 *
	 * @return the create date of this miic applicant details
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this miic applicant details.
	 *
	 * @param createDate the create date of this miic applicant details
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this miic applicant details.
	 *
	 * @return the modified date of this miic applicant details
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this miic applicant details.
	 *
	 * @param modifiedDate the modified date of this miic applicant details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the nature of applicant of this miic applicant details.
	 *
	 * @return the nature of applicant of this miic applicant details
	 */
	@AutoEscape
	public String getNatureOfApplicant();

	/**
	 * Sets the nature of applicant of this miic applicant details.
	 *
	 * @param natureOfApplicant the nature of applicant of this miic applicant details
	 */
	public void setNatureOfApplicant(String natureOfApplicant);

	/**
	 * Returns the applicant name of this miic applicant details.
	 *
	 * @return the applicant name of this miic applicant details
	 */
	@AutoEscape
	public String getApplicantName();

	/**
	 * Sets the applicant name of this miic applicant details.
	 *
	 * @param applicantName  the applicant name of this miic applicant details
	 */
	public void setApplicantName(String applicantName);

	/**
	 * Returns the address of this miic applicant details.
	 *
	 * @return the address of this miic applicant details
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this miic applicant details.
	 *
	 * @param address the address of this miic applicant details
	 */
	public void setAddress(String address);

	/**
	 * Returns the email of this miic applicant details.
	 *
	 * @return the email of this miic applicant details
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this miic applicant details.
	 *
	 * @param email the email of this miic applicant details
	 */
	public void setEmail(String email);

	/**
	 * Returns the telephone of this miic applicant details.
	 *
	 * @return the telephone of this miic applicant details
	 */
	@AutoEscape
	public String getTelephone();

	/**
	 * Sets the telephone of this miic applicant details.
	 *
	 * @param telephone the telephone of this miic applicant details
	 */
	public void setTelephone(String telephone);

	/**
	 * Returns the date of application of this miic applicant details.
	 *
	 * @return the date of application of this miic applicant details
	 */
	public Date getDateOfApplication();

	/**
	 * Sets the date of application of this miic applicant details.
	 *
	 * @param dateOfApplication the date of application of this miic applicant details
	 */
	public void setDateOfApplication(Date dateOfApplication);

	/**
	 * Returns the trn number of this miic applicant details.
	 *
	 * @return the trn number of this miic applicant details
	 */
	@AutoEscape
	public String getTrnNumber();

	/**
	 * Sets the trn number of this miic applicant details.
	 *
	 * @param trnNumber the trn number of this miic applicant details
	 */
	public void setTrnNumber(String trnNumber);

	/**
	 * Returns the miic application ID of this miic applicant details.
	 *
	 * @return the miic application ID of this miic applicant details
	 */
	public long getMiicApplicationId();

	/**
	 * Sets the miic application ID of this miic applicant details.
	 *
	 * @param miicApplicationId the miic application ID of this miic applicant details
	 */
	public void setMiicApplicationId(long miicApplicationId);

	/**
	 * Returns the name of producer of this miic applicant details.
	 *
	 * @return the name of producer of this miic applicant details
	 */
	@AutoEscape
	public String getNameOfProducer();

	/**
	 * Sets the name of producer of this miic applicant details.
	 *
	 * @param nameOfProducer the name of producer of this miic applicant details
	 */
	public void setNameOfProducer(String nameOfProducer);

	/**
	 * Returns the company name of this miic applicant details.
	 *
	 * @return the company name of this miic applicant details
	 */
	@AutoEscape
	public String getCompanyName();

	/**
	 * Sets the company name of this miic applicant details.
	 *
	 * @param companyName the company name of this miic applicant details
	 */
	public void setCompanyName(String companyName);

	/**
	 * Returns the first name of this miic applicant details.
	 *
	 * @return the first name of this miic applicant details
	 */
	@AutoEscape
	public String getFirstName();

	/**
	 * Sets the first name of this miic applicant details.
	 *
	 * @param firstName the first name of this miic applicant details
	 */
	public void setFirstName(String firstName);

	/**
	 * Returns the last name of this miic applicant details.
	 *
	 * @return the last name of this miic applicant details
	 */
	@AutoEscape
	public String getLastName();

	/**
	 * Sets the last name of this miic applicant details.
	 *
	 * @param lastName the last name of this miic applicant details
	 */
	public void setLastName(String lastName);

	@Override
	public MiicApplicantDetails cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}