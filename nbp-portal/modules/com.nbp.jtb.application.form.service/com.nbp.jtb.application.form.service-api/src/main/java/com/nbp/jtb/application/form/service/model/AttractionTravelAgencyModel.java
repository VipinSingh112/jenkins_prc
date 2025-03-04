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
 * The base model interface for the AttractionTravelAgency service. Represents a row in the &quot;nbp_jtb_tarvel_agency&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.jtb.application.form.service.model.impl.AttractionTravelAgencyModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.jtb.application.form.service.model.impl.AttractionTravelAgencyImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionTravelAgency
 * @generated
 */
@ProviderType
public interface AttractionTravelAgencyModel
	extends BaseModel<AttractionTravelAgency>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a attraction travel agency model instance should use the {@link AttractionTravelAgency} interface instead.
	 */

	/**
	 * Returns the primary key of this attraction travel agency.
	 *
	 * @return the primary key of this attraction travel agency
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this attraction travel agency.
	 *
	 * @param primaryKey the primary key of this attraction travel agency
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the attraction travel agency ID of this attraction travel agency.
	 *
	 * @return the attraction travel agency ID of this attraction travel agency
	 */
	public long getAttractionTravelAgencyId();

	/**
	 * Sets the attraction travel agency ID of this attraction travel agency.
	 *
	 * @param attractionTravelAgencyId the attraction travel agency ID of this attraction travel agency
	 */
	public void setAttractionTravelAgencyId(long attractionTravelAgencyId);

	/**
	 * Returns the group ID of this attraction travel agency.
	 *
	 * @return the group ID of this attraction travel agency
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this attraction travel agency.
	 *
	 * @param groupId the group ID of this attraction travel agency
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this attraction travel agency.
	 *
	 * @return the company ID of this attraction travel agency
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this attraction travel agency.
	 *
	 * @param companyId the company ID of this attraction travel agency
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this attraction travel agency.
	 *
	 * @return the user ID of this attraction travel agency
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this attraction travel agency.
	 *
	 * @param userId the user ID of this attraction travel agency
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this attraction travel agency.
	 *
	 * @return the user uuid of this attraction travel agency
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this attraction travel agency.
	 *
	 * @param userUuid the user uuid of this attraction travel agency
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this attraction travel agency.
	 *
	 * @return the user name of this attraction travel agency
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this attraction travel agency.
	 *
	 * @param userName the user name of this attraction travel agency
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this attraction travel agency.
	 *
	 * @return the create date of this attraction travel agency
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this attraction travel agency.
	 *
	 * @param createDate the create date of this attraction travel agency
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this attraction travel agency.
	 *
	 * @return the modified date of this attraction travel agency
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this attraction travel agency.
	 *
	 * @param modifiedDate the modified date of this attraction travel agency
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the applicant name of this attraction travel agency.
	 *
	 * @return the applicant name of this attraction travel agency
	 */
	@AutoEscape
	public String getApplicantName();

	/**
	 * Sets the applicant name of this attraction travel agency.
	 *
	 * @param applicantName the applicant name of this attraction travel agency
	 */
	public void setApplicantName(String applicantName);

	/**
	 * Returns the agency address of this attraction travel agency.
	 *
	 * @return the agency address of this attraction travel agency
	 */
	@AutoEscape
	public String getAgencyAddress();

	/**
	 * Sets the agency address of this attraction travel agency.
	 *
	 * @param agencyAddress the agency address of this attraction travel agency
	 */
	public void setAgencyAddress(String agencyAddress);

	/**
	 * Returns the agency telephone of this attraction travel agency.
	 *
	 * @return the agency telephone of this attraction travel agency
	 */
	@AutoEscape
	public String getAgencyTelephone();

	/**
	 * Sets the agency telephone of this attraction travel agency.
	 *
	 * @param agencyTelephone the agency telephone of this attraction travel agency
	 */
	public void setAgencyTelephone(String agencyTelephone);

	/**
	 * Returns the agency name of this attraction travel agency.
	 *
	 * @return the agency name of this attraction travel agency
	 */
	@AutoEscape
	public String getAgencyName();

	/**
	 * Sets the agency name of this attraction travel agency.
	 *
	 * @param agencyName the agency name of this attraction travel agency
	 */
	public void setAgencyName(String agencyName);

	/**
	 * Returns the agency address sec of this attraction travel agency.
	 *
	 * @return the agency address sec of this attraction travel agency
	 */
	@AutoEscape
	public String getAgencyAddressSec();

	/**
	 * Sets the agency address sec of this attraction travel agency.
	 *
	 * @param agencyAddressSec the agency address sec of this attraction travel agency
	 */
	public void setAgencyAddressSec(String agencyAddressSec);

	/**
	 * Returns the agency telephone num of this attraction travel agency.
	 *
	 * @return the agency telephone num of this attraction travel agency
	 */
	@AutoEscape
	public String getAgencyTelephoneNum();

	/**
	 * Sets the agency telephone num of this attraction travel agency.
	 *
	 * @param agencyTelephoneNum the agency telephone num of this attraction travel agency
	 */
	public void setAgencyTelephoneNum(String agencyTelephoneNum);

	/**
	 * Returns the is registered of this attraction travel agency.
	 *
	 * @return the is registered of this attraction travel agency
	 */
	@AutoEscape
	public String getIsRegistered();

	/**
	 * Sets the is registered of this attraction travel agency.
	 *
	 * @param isRegistered the is registered of this attraction travel agency
	 */
	public void setIsRegistered(String isRegistered);

	/**
	 * Returns the regst particulars of this attraction travel agency.
	 *
	 * @return the regst particulars of this attraction travel agency
	 */
	@AutoEscape
	public String getRegstParticulars();

	/**
	 * Sets the regst particulars of this attraction travel agency.
	 *
	 * @param regstParticulars the regst particulars of this attraction travel agency
	 */
	public void setRegstParticulars(String regstParticulars);

	/**
	 * Returns the proprietor name of this attraction travel agency.
	 *
	 * @return the proprietor name of this attraction travel agency
	 */
	@AutoEscape
	public String getProprietorName();

	/**
	 * Sets the proprietor name of this attraction travel agency.
	 *
	 * @param proprietorName the proprietor name of this attraction travel agency
	 */
	public void setProprietorName(String proprietorName);

	/**
	 * Returns the manager name of this attraction travel agency.
	 *
	 * @return the manager name of this attraction travel agency
	 */
	@AutoEscape
	public String getManagerName();

	/**
	 * Sets the manager name of this attraction travel agency.
	 *
	 * @param managerName the manager name of this attraction travel agency
	 */
	public void setManagerName(String managerName);

	/**
	 * Returns the manager address of this attraction travel agency.
	 *
	 * @return the manager address of this attraction travel agency
	 */
	@AutoEscape
	public String getManagerAddress();

	/**
	 * Sets the manager address of this attraction travel agency.
	 *
	 * @param managerAddress the manager address of this attraction travel agency
	 */
	public void setManagerAddress(String managerAddress);

	/**
	 * Returns the secretary name of this attraction travel agency.
	 *
	 * @return the secretary name of this attraction travel agency
	 */
	@AutoEscape
	public String getSecretaryName();

	/**
	 * Sets the secretary name of this attraction travel agency.
	 *
	 * @param secretaryName the secretary name of this attraction travel agency
	 */
	public void setSecretaryName(String secretaryName);

	/**
	 * Returns the secretary address of this attraction travel agency.
	 *
	 * @return the secretary address of this attraction travel agency
	 */
	@AutoEscape
	public String getSecretaryAddress();

	/**
	 * Sets the secretary address of this attraction travel agency.
	 *
	 * @param secretaryAddress the secretary address of this attraction travel agency
	 */
	public void setSecretaryAddress(String secretaryAddress);

	/**
	 * Returns the banker name of this attraction travel agency.
	 *
	 * @return the banker name of this attraction travel agency
	 */
	@AutoEscape
	public String getBankerName();

	/**
	 * Sets the banker name of this attraction travel agency.
	 *
	 * @param bankerName the banker name of this attraction travel agency
	 */
	public void setBankerName(String bankerName);

	/**
	 * Returns the bonding company name of this attraction travel agency.
	 *
	 * @return the bonding company name of this attraction travel agency
	 */
	@AutoEscape
	public String getBondingCompanyName();

	/**
	 * Sets the bonding company name of this attraction travel agency.
	 *
	 * @param bondingCompanyName the bonding company name of this attraction travel agency
	 */
	public void setBondingCompanyName(String bondingCompanyName);

	/**
	 * Returns the bonding company address of this attraction travel agency.
	 *
	 * @return the bonding company address of this attraction travel agency
	 */
	@AutoEscape
	public String getBondingCompanyAddress();

	/**
	 * Sets the bonding company address of this attraction travel agency.
	 *
	 * @param bondingCompanyAddress the bonding company address of this attraction travel agency
	 */
	public void setBondingCompanyAddress(String bondingCompanyAddress);

	/**
	 * Returns the auditors name of this attraction travel agency.
	 *
	 * @return the auditors name of this attraction travel agency
	 */
	@AutoEscape
	public String getAuditorsName();

	/**
	 * Sets the auditors name of this attraction travel agency.
	 *
	 * @param auditorsName the auditors name of this attraction travel agency
	 */
	public void setAuditorsName(String auditorsName);

	/**
	 * Returns the auditors address of this attraction travel agency.
	 *
	 * @return the auditors address of this attraction travel agency
	 */
	@AutoEscape
	public String getAuditorsAddress();

	/**
	 * Sets the auditors address of this attraction travel agency.
	 *
	 * @param auditorsAddress the auditors address of this attraction travel agency
	 */
	public void setAuditorsAddress(String auditorsAddress);

	/**
	 * Returns the number of employees of this attraction travel agency.
	 *
	 * @return the number of employees of this attraction travel agency
	 */
	@AutoEscape
	public String getNumberOfEmployees();

	/**
	 * Sets the number of employees of this attraction travel agency.
	 *
	 * @param numberOfEmployees the number of employees of this attraction travel agency
	 */
	public void setNumberOfEmployees(String numberOfEmployees);

	/**
	 * Returns the sign date of this attraction travel agency.
	 *
	 * @return the sign date of this attraction travel agency
	 */
	public Date getSignDate();

	/**
	 * Sets the sign date of this attraction travel agency.
	 *
	 * @param signDate the sign date of this attraction travel agency
	 */
	public void setSignDate(Date signDate);

	/**
	 * Returns the jtb application ID of this attraction travel agency.
	 *
	 * @return the jtb application ID of this attraction travel agency
	 */
	public long getJtbApplicationId();

	/**
	 * Sets the jtb application ID of this attraction travel agency.
	 *
	 * @param jtbApplicationId the jtb application ID of this attraction travel agency
	 */
	public void setJtbApplicationId(long jtbApplicationId);

	@Override
	public AttractionTravelAgency cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}