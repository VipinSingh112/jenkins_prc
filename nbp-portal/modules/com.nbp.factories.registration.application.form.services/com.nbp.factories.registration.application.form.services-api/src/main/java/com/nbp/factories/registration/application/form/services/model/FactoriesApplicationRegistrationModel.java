/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the FactoriesApplicationRegistration service. Represents a row in the &quot;nbp_factories_application&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesApplicationRegistrationModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesApplicationRegistrationImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesApplicationRegistration
 * @generated
 */
@ProviderType
public interface FactoriesApplicationRegistrationModel
	extends BaseModel<FactoriesApplicationRegistration>, GroupedModel,
			ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a factories application registration model instance should use the {@link FactoriesApplicationRegistration} interface instead.
	 */

	/**
	 * Returns the primary key of this factories application registration.
	 *
	 * @return the primary key of this factories application registration
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this factories application registration.
	 *
	 * @param primaryKey the primary key of this factories application registration
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the factories application ID of this factories application registration.
	 *
	 * @return the factories application ID of this factories application registration
	 */
	public long getFactoriesApplicationId();

	/**
	 * Sets the factories application ID of this factories application registration.
	 *
	 * @param factoriesApplicationId the factories application ID of this factories application registration
	 */
	public void setFactoriesApplicationId(long factoriesApplicationId);

	/**
	 * Returns the group ID of this factories application registration.
	 *
	 * @return the group ID of this factories application registration
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this factories application registration.
	 *
	 * @param groupId the group ID of this factories application registration
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this factories application registration.
	 *
	 * @return the company ID of this factories application registration
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this factories application registration.
	 *
	 * @param companyId the company ID of this factories application registration
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this factories application registration.
	 *
	 * @return the user ID of this factories application registration
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this factories application registration.
	 *
	 * @param userId the user ID of this factories application registration
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this factories application registration.
	 *
	 * @return the user uuid of this factories application registration
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this factories application registration.
	 *
	 * @param userUuid the user uuid of this factories application registration
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this factories application registration.
	 *
	 * @return the user name of this factories application registration
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this factories application registration.
	 *
	 * @param userName the user name of this factories application registration
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this factories application registration.
	 *
	 * @return the create date of this factories application registration
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this factories application registration.
	 *
	 * @param createDate the create date of this factories application registration
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this factories application registration.
	 *
	 * @return the modified date of this factories application registration
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this factories application registration.
	 *
	 * @param modifiedDate the modified date of this factories application registration
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the entity ID of this factories application registration.
	 *
	 * @return the entity ID of this factories application registration
	 */
	@AutoEscape
	public String getEntityId();

	/**
	 * Sets the entity ID of this factories application registration.
	 *
	 * @param entityId the entity ID of this factories application registration
	 */
	public void setEntityId(String entityId);

	/**
	 * Returns the status of this factories application registration.
	 *
	 * @return the status of this factories application registration
	 */
	public int getStatus();

	/**
	 * Sets the status of this factories application registration.
	 *
	 * @param status the status of this factories application registration
	 */
	public void setStatus(int status);

	/**
	 * Returns the application number of this factories application registration.
	 *
	 * @return the application number of this factories application registration
	 */
	@AutoEscape
	public String getApplicationNumber();

	/**
	 * Sets the application number of this factories application registration.
	 *
	 * @param applicationNumber the application number of this factories application registration
	 */
	public void setApplicationNumber(String applicationNumber);

	/**
	 * Returns the case ID of this factories application registration.
	 *
	 * @return the case ID of this factories application registration
	 */
	@AutoEscape
	public String getCaseId();

	/**
	 * Sets the case ID of this factories application registration.
	 *
	 * @param caseId the case ID of this factories application registration
	 */
	public void setCaseId(String caseId);

	/**
	 * Returns the expired license app number of this factories application registration.
	 *
	 * @return the expired license app number of this factories application registration
	 */
	@AutoEscape
	public String getExpiredLicenseAppNumber();

	/**
	 * Sets the expired license app number of this factories application registration.
	 *
	 * @param expiredLicenseAppNumber the expired license app number of this factories application registration
	 */
	public void setExpiredLicenseAppNumber(String expiredLicenseAppNumber);

	/**
	 * Returns the icm document path of this factories application registration.
	 *
	 * @return the icm document path of this factories application registration
	 */
	@AutoEscape
	public String getIcmDocumentPath();

	/**
	 * Sets the icm document path of this factories application registration.
	 *
	 * @param icmDocumentPath the icm document path of this factories application registration
	 */
	public void setIcmDocumentPath(String icmDocumentPath);

	/**
	 * Returns the product category of this factories application registration.
	 *
	 * @return the product category of this factories application registration
	 */
	@AutoEscape
	public String getProductCategory();

	/**
	 * Sets the product category of this factories application registration.
	 *
	 * @param productCategory the product category of this factories application registration
	 */
	public void setProductCategory(String productCategory);

	/**
	 * Returns the are you processing of this factories application registration.
	 *
	 * @return the are you processing of this factories application registration
	 */
	@AutoEscape
	public String getAreYouProcessing();

	/**
	 * Sets the are you processing of this factories application registration.
	 *
	 * @param areYouProcessing the are you processing of this factories application registration
	 */
	public void setAreYouProcessing(String areYouProcessing);

	/**
	 * Returns the type of transaction of this factories application registration.
	 *
	 * @return the type of transaction of this factories application registration
	 */
	@AutoEscape
	public String getTypeOfTransaction();

	/**
	 * Sets the type of transaction of this factories application registration.
	 *
	 * @param typeOfTransaction the type of transaction of this factories application registration
	 */
	public void setTypeOfTransaction(String typeOfTransaction);

	/**
	 * Returns the pdf file entry ID of this factories application registration.
	 *
	 * @return the pdf file entry ID of this factories application registration
	 */
	public long getPdfFileEntryId();

	/**
	 * Sets the pdf file entry ID of this factories application registration.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this factories application registration
	 */
	public void setPdfFileEntryId(long pdfFileEntryId);

	/**
	 * Returns the app current stage name of this factories application registration.
	 *
	 * @return the app current stage name of this factories application registration
	 */
	@AutoEscape
	public String getAppCurrentStageName();

	/**
	 * Sets the app current stage name of this factories application registration.
	 *
	 * @param appCurrentStageName the app current stage name of this factories application registration
	 */
	public void setAppCurrentStageName(String appCurrentStageName);

	@Override
	public FactoriesApplicationRegistration cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}