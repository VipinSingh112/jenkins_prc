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
 * The base model interface for the CannabisConditionalLicense service. Represents a row in the &quot;nbp_cannabis_con_license&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.npm.cannabis.application.stages.services.model.impl.CannabisConditionalLicenseModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.npm.cannabis.application.stages.services.model.impl.CannabisConditionalLicenseImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConditionalLicense
 * @generated
 */
@ProviderType
public interface CannabisConditionalLicenseModel
	extends BaseModel<CannabisConditionalLicense>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a cannabis conditional license model instance should use the {@link CannabisConditionalLicense} interface instead.
	 */

	/**
	 * Returns the primary key of this cannabis conditional license.
	 *
	 * @return the primary key of this cannabis conditional license
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this cannabis conditional license.
	 *
	 * @param primaryKey the primary key of this cannabis conditional license
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the cannabis conditonal license ID of this cannabis conditional license.
	 *
	 * @return the cannabis conditonal license ID of this cannabis conditional license
	 */
	public long getCannabisConditonalLicenseId();

	/**
	 * Sets the cannabis conditonal license ID of this cannabis conditional license.
	 *
	 * @param cannabisConditonalLicenseId the cannabis conditonal license ID of this cannabis conditional license
	 */
	public void setCannabisConditonalLicenseId(
		long cannabisConditonalLicenseId);

	/**
	 * Returns the group ID of this cannabis conditional license.
	 *
	 * @return the group ID of this cannabis conditional license
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this cannabis conditional license.
	 *
	 * @param groupId the group ID of this cannabis conditional license
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this cannabis conditional license.
	 *
	 * @return the company ID of this cannabis conditional license
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this cannabis conditional license.
	 *
	 * @param companyId the company ID of this cannabis conditional license
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this cannabis conditional license.
	 *
	 * @return the user ID of this cannabis conditional license
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this cannabis conditional license.
	 *
	 * @param userId the user ID of this cannabis conditional license
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this cannabis conditional license.
	 *
	 * @return the user uuid of this cannabis conditional license
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this cannabis conditional license.
	 *
	 * @param userUuid the user uuid of this cannabis conditional license
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this cannabis conditional license.
	 *
	 * @return the user name of this cannabis conditional license
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this cannabis conditional license.
	 *
	 * @param userName the user name of this cannabis conditional license
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this cannabis conditional license.
	 *
	 * @return the create date of this cannabis conditional license
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this cannabis conditional license.
	 *
	 * @param createDate the create date of this cannabis conditional license
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this cannabis conditional license.
	 *
	 * @return the modified date of this cannabis conditional license
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this cannabis conditional license.
	 *
	 * @param modifiedDate the modified date of this cannabis conditional license
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the entity number of this cannabis conditional license.
	 *
	 * @return the entity number of this cannabis conditional license
	 */
	@AutoEscape
	public String getEntityNumber();

	/**
	 * Sets the entity number of this cannabis conditional license.
	 *
	 * @param entityNumber the entity number of this cannabis conditional license
	 */
	public void setEntityNumber(String entityNumber);

	/**
	 * Returns the entity name of this cannabis conditional license.
	 *
	 * @return the entity name of this cannabis conditional license
	 */
	@AutoEscape
	public String getEntityName();

	/**
	 * Sets the entity name of this cannabis conditional license.
	 *
	 * @param entityName the entity name of this cannabis conditional license
	 */
	public void setEntityName(String entityName);

	/**
	 * Returns the category tier of this cannabis conditional license.
	 *
	 * @return the category tier of this cannabis conditional license
	 */
	@AutoEscape
	public String getCategoryTier();

	/**
	 * Sets the category tier of this cannabis conditional license.
	 *
	 * @param categoryTier the category tier of this cannabis conditional license
	 */
	public void setCategoryTier(String categoryTier);

	/**
	 * Returns the number of the extension of this cannabis conditional license.
	 *
	 * @return the number of the extension of this cannabis conditional license
	 */
	public int getNumberOfTheExtension();

	/**
	 * Sets the number of the extension of this cannabis conditional license.
	 *
	 * @param numberOfTheExtension the number of the extension of this cannabis conditional license
	 */
	public void setNumberOfTheExtension(int numberOfTheExtension);

	/**
	 * Returns the list of preconditions of this cannabis conditional license.
	 *
	 * @return the list of preconditions of this cannabis conditional license
	 */
	@AutoEscape
	public String getListOfPreconditions();

	/**
	 * Sets the list of preconditions of this cannabis conditional license.
	 *
	 * @param ListOfPreconditions the list of preconditions of this cannabis conditional license
	 */
	public void setListOfPreconditions(String ListOfPreconditions);

	/**
	 * Returns the payent amt due of this cannabis conditional license.
	 *
	 * @return the payent amt due of this cannabis conditional license
	 */
	@AutoEscape
	public String getPayentAmtDue();

	/**
	 * Sets the payent amt due of this cannabis conditional license.
	 *
	 * @param payentAmtDue the payent amt due of this cannabis conditional license
	 */
	public void setPayentAmtDue(String payentAmtDue);

	/**
	 * Returns the issue date of this cannabis conditional license.
	 *
	 * @return the issue date of this cannabis conditional license
	 */
	public Date getIssueDate();

	/**
	 * Sets the issue date of this cannabis conditional license.
	 *
	 * @param issueDate the issue date of this cannabis conditional license
	 */
	public void setIssueDate(Date issueDate);

	/**
	 * Returns the expiration date of this cannabis conditional license.
	 *
	 * @return the expiration date of this cannabis conditional license
	 */
	public Date getExpirationDate();

	/**
	 * Sets the expiration date of this cannabis conditional license.
	 *
	 * @param expirationDate the expiration date of this cannabis conditional license
	 */
	public void setExpirationDate(Date expirationDate);

	/**
	 * Returns the cannabis application ID of this cannabis conditional license.
	 *
	 * @return the cannabis application ID of this cannabis conditional license
	 */
	public long getCannabisApplicationId();

	/**
	 * Sets the cannabis application ID of this cannabis conditional license.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this cannabis conditional license
	 */
	public void setCannabisApplicationId(long cannabisApplicationId);

	/**
	 * Returns the updated by source of this cannabis conditional license.
	 *
	 * @return the updated by source of this cannabis conditional license
	 */
	@AutoEscape
	public String getUpdatedBySource();

	/**
	 * Sets the updated by source of this cannabis conditional license.
	 *
	 * @param updatedBySource the updated by source of this cannabis conditional license
	 */
	public void setUpdatedBySource(String updatedBySource);

	/**
	 * Returns the status of this cannabis conditional license.
	 *
	 * @return the status of this cannabis conditional license
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this cannabis conditional license.
	 *
	 * @param status the status of this cannabis conditional license
	 */
	public void setStatus(String status);

	/**
	 * Returns the case ID of this cannabis conditional license.
	 *
	 * @return the case ID of this cannabis conditional license
	 */
	@AutoEscape
	public String getCaseId();

	/**
	 * Sets the case ID of this cannabis conditional license.
	 *
	 * @param caseId the case ID of this cannabis conditional license
	 */
	public void setCaseId(String caseId);

	/**
	 * Returns the conditional license file ID of this cannabis conditional license.
	 *
	 * @return the conditional license file ID of this cannabis conditional license
	 */
	public long getConditionalLicenseFileId();

	/**
	 * Sets the conditional license file ID of this cannabis conditional license.
	 *
	 * @param conditionalLicenseFileId the conditional license file ID of this cannabis conditional license
	 */
	public void setConditionalLicenseFileId(long conditionalLicenseFileId);

	@Override
	public CannabisConditionalLicense cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}