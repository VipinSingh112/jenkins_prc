/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the CannabisLicense service. Represents a row in the &quot;nbp_cannabis_license&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.npm.cannabis.application.stages.services.model.impl.CannabisLicenseModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.npm.cannabis.application.stages.services.model.impl.CannabisLicenseImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicense
 * @generated
 */
@ProviderType
public interface CannabisLicenseModel
	extends BaseModel<CannabisLicense>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a cannabis license model instance should use the {@link CannabisLicense} interface instead.
	 */

	/**
	 * Returns the primary key of this cannabis license.
	 *
	 * @return the primary key of this cannabis license
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this cannabis license.
	 *
	 * @param primaryKey the primary key of this cannabis license
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the cannabis license ID of this cannabis license.
	 *
	 * @return the cannabis license ID of this cannabis license
	 */
	public long getCannabisLicenseId();

	/**
	 * Sets the cannabis license ID of this cannabis license.
	 *
	 * @param cannabisLicenseId the cannabis license ID of this cannabis license
	 */
	public void setCannabisLicenseId(long cannabisLicenseId);

	/**
	 * Returns the group ID of this cannabis license.
	 *
	 * @return the group ID of this cannabis license
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this cannabis license.
	 *
	 * @param groupId the group ID of this cannabis license
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this cannabis license.
	 *
	 * @return the company ID of this cannabis license
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this cannabis license.
	 *
	 * @param companyId the company ID of this cannabis license
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this cannabis license.
	 *
	 * @return the user ID of this cannabis license
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this cannabis license.
	 *
	 * @param userId the user ID of this cannabis license
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this cannabis license.
	 *
	 * @return the user uuid of this cannabis license
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this cannabis license.
	 *
	 * @param userUuid the user uuid of this cannabis license
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this cannabis license.
	 *
	 * @return the user name of this cannabis license
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this cannabis license.
	 *
	 * @param userName the user name of this cannabis license
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this cannabis license.
	 *
	 * @return the create date of this cannabis license
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this cannabis license.
	 *
	 * @param createDate the create date of this cannabis license
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this cannabis license.
	 *
	 * @return the modified date of this cannabis license
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this cannabis license.
	 *
	 * @param modifiedDate the modified date of this cannabis license
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the entity number of this cannabis license.
	 *
	 * @return the entity number of this cannabis license
	 */
	@AutoEscape
	public String getEntityNumber();

	/**
	 * Sets the entity number of this cannabis license.
	 *
	 * @param entityNumber the entity number of this cannabis license
	 */
	public void setEntityNumber(String entityNumber);

	/**
	 * Returns the entity name of this cannabis license.
	 *
	 * @return the entity name of this cannabis license
	 */
	@AutoEscape
	public String getEntityName();

	/**
	 * Sets the entity name of this cannabis license.
	 *
	 * @param entityName the entity name of this cannabis license
	 */
	public void setEntityName(String entityName);

	/**
	 * Returns the category tier of this cannabis license.
	 *
	 * @return the category tier of this cannabis license
	 */
	@AutoEscape
	public String getCategoryTier();

	/**
	 * Sets the category tier of this cannabis license.
	 *
	 * @param categoryTier the category tier of this cannabis license
	 */
	public void setCategoryTier(String categoryTier);

	/**
	 * Returns the number of the extension of this cannabis license.
	 *
	 * @return the number of the extension of this cannabis license
	 */
	@AutoEscape
	public String getNumberOfTheExtension();

	/**
	 * Sets the number of the extension of this cannabis license.
	 *
	 * @param numberOfTheExtension the number of the extension of this cannabis license
	 */
	public void setNumberOfTheExtension(String numberOfTheExtension);

	/**
	 * Returns the list of conditions of this cannabis license.
	 *
	 * @return the list of conditions of this cannabis license
	 */
	@AutoEscape
	public String getListOfConditions();

	/**
	 * Sets the list of conditions of this cannabis license.
	 *
	 * @param ListOfConditions the list of conditions of this cannabis license
	 */
	public void setListOfConditions(String ListOfConditions);

	/**
	 * Returns the payent amt due of this cannabis license.
	 *
	 * @return the payent amt due of this cannabis license
	 */
	@AutoEscape
	public String getPayentAmtDue();

	/**
	 * Sets the payent amt due of this cannabis license.
	 *
	 * @param payentAmtDue the payent amt due of this cannabis license
	 */
	public void setPayentAmtDue(String payentAmtDue);

	/**
	 * Returns the issue date of this cannabis license.
	 *
	 * @return the issue date of this cannabis license
	 */
	public Date getIssueDate();

	/**
	 * Sets the issue date of this cannabis license.
	 *
	 * @param issueDate the issue date of this cannabis license
	 */
	public void setIssueDate(Date issueDate);

	/**
	 * Returns the expiration date of this cannabis license.
	 *
	 * @return the expiration date of this cannabis license
	 */
	public Date getExpirationDate();

	/**
	 * Sets the expiration date of this cannabis license.
	 *
	 * @param expirationDate the expiration date of this cannabis license
	 */
	public void setExpirationDate(Date expirationDate);

	/**
	 * Returns the cannabis application ID of this cannabis license.
	 *
	 * @return the cannabis application ID of this cannabis license
	 */
	public long getCannabisApplicationId();

	/**
	 * Sets the cannabis application ID of this cannabis license.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this cannabis license
	 */
	public void setCannabisApplicationId(long cannabisApplicationId);

	/**
	 * Returns the updated by source of this cannabis license.
	 *
	 * @return the updated by source of this cannabis license
	 */
	@AutoEscape
	public String getUpdatedBySource();

	/**
	 * Sets the updated by source of this cannabis license.
	 *
	 * @param updatedBySource the updated by source of this cannabis license
	 */
	public void setUpdatedBySource(String updatedBySource);

	/**
	 * Returns the name of bpm step of this cannabis license.
	 *
	 * @return the name of bpm step of this cannabis license
	 */
	@AutoEscape
	public String getNameOfBPMStep();

	/**
	 * Sets the name of bpm step of this cannabis license.
	 *
	 * @param nameOfBPMStep the name of bpm step of this cannabis license
	 */
	public void setNameOfBPMStep(String nameOfBPMStep);

	/**
	 * Returns the license conditions fulfilled of this cannabis license.
	 *
	 * @return the license conditions fulfilled of this cannabis license
	 */
	@AutoEscape
	public String getLicenseConditionsFulfilled();

	/**
	 * Sets the license conditions fulfilled of this cannabis license.
	 *
	 * @param licenseConditionsFulfilled the license conditions fulfilled of this cannabis license
	 */
	public void setLicenseConditionsFulfilled(
		String licenseConditionsFulfilled);

	/**
	 * Returns the date fulfilled of this cannabis license.
	 *
	 * @return the date fulfilled of this cannabis license
	 */
	@AutoEscape
	public String getDateFulfilled();

	/**
	 * Sets the date fulfilled of this cannabis license.
	 *
	 * @param dateFulfilled the date fulfilled of this cannabis license
	 */
	public void setDateFulfilled(String dateFulfilled);

	/**
	 * Returns the fee option selected of this cannabis license.
	 *
	 * @return the fee option selected of this cannabis license
	 */
	@AutoEscape
	public String getFeeOptionSelected();

	/**
	 * Sets the fee option selected of this cannabis license.
	 *
	 * @param feeOptionSelected the fee option selected of this cannabis license
	 */
	public void setFeeOptionSelected(String feeOptionSelected);

	/**
	 * Returns the fee amount of this cannabis license.
	 *
	 * @return the fee amount of this cannabis license
	 */
	@AutoEscape
	public String getFeeAmount();

	/**
	 * Sets the fee amount of this cannabis license.
	 *
	 * @param feeAmount the fee amount of this cannabis license
	 */
	public void setFeeAmount(String feeAmount);

	/**
	 * Returns the fee paid date of this cannabis license.
	 *
	 * @return the fee paid date of this cannabis license
	 */
	public Date getFeePaidDate();

	/**
	 * Sets the fee paid date of this cannabis license.
	 *
	 * @param feePaidDate the fee paid date of this cannabis license
	 */
	public void setFeePaidDate(Date feePaidDate);

	/**
	 * Returns the bpm user name role of this cannabis license.
	 *
	 * @return the bpm user name role of this cannabis license
	 */
	@AutoEscape
	public String getBpmUserNameRole();

	/**
	 * Sets the bpm user name role of this cannabis license.
	 *
	 * @param bpmUserNameRole the bpm user name role of this cannabis license
	 */
	public void setBpmUserNameRole(String bpmUserNameRole);

	/**
	 * Returns the stage name of this cannabis license.
	 *
	 * @return the stage name of this cannabis license
	 */
	@AutoEscape
	public String getStageName();

	/**
	 * Sets the stage name of this cannabis license.
	 *
	 * @param stageName the stage name of this cannabis license
	 */
	public void setStageName(String stageName);

	/**
	 * Returns the status of this cannabis license.
	 *
	 * @return the status of this cannabis license
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this cannabis license.
	 *
	 * @param status the status of this cannabis license
	 */
	public void setStatus(String status);

	/**
	 * Returns the case ID of this cannabis license.
	 *
	 * @return the case ID of this cannabis license
	 */
	@AutoEscape
	public String getCaseId();

	/**
	 * Sets the case ID of this cannabis license.
	 *
	 * @param caseId the case ID of this cannabis license
	 */
	public void setCaseId(String caseId);

	/**
	 * Returns the license number of this cannabis license.
	 *
	 * @return the license number of this cannabis license
	 */
	@AutoEscape
	public String getLicenseNumber();

	/**
	 * Sets the license number of this cannabis license.
	 *
	 * @param licenseNumber the license number of this cannabis license
	 */
	public void setLicenseNumber(String licenseNumber);

	/**
	 * Returns the license file ID of this cannabis license.
	 *
	 * @return the license file ID of this cannabis license
	 */
	public long getLicenseFileId();

	/**
	 * Sets the license file ID of this cannabis license.
	 *
	 * @param licenseFileId the license file ID of this cannabis license
	 */
	public void setLicenseFileId(long licenseFileId);

	@Override
	public CannabisLicense cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}