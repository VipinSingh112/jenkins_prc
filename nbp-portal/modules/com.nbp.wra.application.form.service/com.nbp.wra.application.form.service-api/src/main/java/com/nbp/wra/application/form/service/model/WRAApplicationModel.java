/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the WRAApplication service. Represents a row in the &quot;nbp_wra_application&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.wra.application.form.service.model.impl.WRAApplicationModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.wra.application.form.service.model.impl.WRAApplicationImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WRAApplication
 * @generated
 */
@ProviderType
public interface WRAApplicationModel
	extends BaseModel<WRAApplication>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a wra application model instance should use the {@link WRAApplication} interface instead.
	 */

	/**
	 * Returns the primary key of this wra application.
	 *
	 * @return the primary key of this wra application
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this wra application.
	 *
	 * @param primaryKey the primary key of this wra application
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the wra application ID of this wra application.
	 *
	 * @return the wra application ID of this wra application
	 */
	public long getWraApplicationId();

	/**
	 * Sets the wra application ID of this wra application.
	 *
	 * @param wraApplicationId the wra application ID of this wra application
	 */
	public void setWraApplicationId(long wraApplicationId);

	/**
	 * Returns the group ID of this wra application.
	 *
	 * @return the group ID of this wra application
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this wra application.
	 *
	 * @param groupId the group ID of this wra application
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this wra application.
	 *
	 * @return the company ID of this wra application
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this wra application.
	 *
	 * @param companyId the company ID of this wra application
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this wra application.
	 *
	 * @return the user ID of this wra application
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this wra application.
	 *
	 * @param userId the user ID of this wra application
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this wra application.
	 *
	 * @return the user uuid of this wra application
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this wra application.
	 *
	 * @param userUuid the user uuid of this wra application
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this wra application.
	 *
	 * @return the user name of this wra application
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this wra application.
	 *
	 * @param userName the user name of this wra application
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this wra application.
	 *
	 * @return the create date of this wra application
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this wra application.
	 *
	 * @param createDate the create date of this wra application
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this wra application.
	 *
	 * @return the modified date of this wra application
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this wra application.
	 *
	 * @param modifiedDate the modified date of this wra application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the entity ID of this wra application.
	 *
	 * @return the entity ID of this wra application
	 */
	public Date getEntityId();

	/**
	 * Sets the entity ID of this wra application.
	 *
	 * @param entityId the entity ID of this wra application
	 */
	public void setEntityId(Date entityId);

	/**
	 * Returns the type of application of this wra application.
	 *
	 * @return the type of application of this wra application
	 */
	@AutoEscape
	public String getTypeOfApplication();

	/**
	 * Sets the type of application of this wra application.
	 *
	 * @param typeOfApplication the type of application of this wra application
	 */
	public void setTypeOfApplication(String typeOfApplication);

	/**
	 * Returns the type of transaction of this wra application.
	 *
	 * @return the type of transaction of this wra application
	 */
	@AutoEscape
	public String getTypeOfTransaction();

	/**
	 * Sets the type of transaction of this wra application.
	 *
	 * @param typeOfTransaction the type of transaction of this wra application
	 */
	public void setTypeOfTransaction(String typeOfTransaction);

	/**
	 * Returns the type of permit of this wra application.
	 *
	 * @return the type of permit of this wra application
	 */
	@AutoEscape
	public String getTypeOfPermit();

	/**
	 * Sets the type of permit of this wra application.
	 *
	 * @param typeOfPermit the type of permit of this wra application
	 */
	public void setTypeOfPermit(String typeOfPermit);

	/**
	 * Returns the type of transac permit of this wra application.
	 *
	 * @return the type of transac permit of this wra application
	 */
	@AutoEscape
	public String getTypeOfTransacPermit();

	/**
	 * Sets the type of transac permit of this wra application.
	 *
	 * @param typeOfTransacPermit the type of transac permit of this wra application
	 */
	public void setTypeOfTransacPermit(String typeOfTransacPermit);

	/**
	 * Returns the user water type cat of this wra application.
	 *
	 * @return the user water type cat of this wra application
	 */
	@AutoEscape
	public String getUserWaterTypeCat();

	/**
	 * Sets the user water type cat of this wra application.
	 *
	 * @param userWaterTypeCat the user water type cat of this wra application
	 */
	public void setUserWaterTypeCat(String userWaterTypeCat);

	/**
	 * Returns the consumptive sub cat of this wra application.
	 *
	 * @return the consumptive sub cat of this wra application
	 */
	@AutoEscape
	public String getConsumptiveSubCat();

	/**
	 * Sets the consumptive sub cat of this wra application.
	 *
	 * @param consumptiveSubCat the consumptive sub cat of this wra application
	 */
	public void setConsumptiveSubCat(String consumptiveSubCat);

	/**
	 * Returns the non consumptive sub cat of this wra application.
	 *
	 * @return the non consumptive sub cat of this wra application
	 */
	@AutoEscape
	public String getNonConsumptiveSubCat();

	/**
	 * Sets the non consumptive sub cat of this wra application.
	 *
	 * @param nonConsumptiveSubCat the non consumptive sub cat of this wra application
	 */
	public void setNonConsumptiveSubCat(String nonConsumptiveSubCat);

	/**
	 * Returns the industrial type sub cat of this wra application.
	 *
	 * @return the industrial type sub cat of this wra application
	 */
	@AutoEscape
	public String getIndustrialTypeSubCat();

	/**
	 * Sets the industrial type sub cat of this wra application.
	 *
	 * @param industrialTypeSubCat the industrial type sub cat of this wra application
	 */
	public void setIndustrialTypeSubCat(String industrialTypeSubCat);

	/**
	 * Returns the icm document path of this wra application.
	 *
	 * @return the icm document path of this wra application
	 */
	@AutoEscape
	public String getIcmDocumentPath();

	/**
	 * Sets the icm document path of this wra application.
	 *
	 * @param icmDocumentPath the icm document path of this wra application
	 */
	public void setIcmDocumentPath(String icmDocumentPath);

	/**
	 * Returns the status of this wra application.
	 *
	 * @return the status of this wra application
	 */
	public int getStatus();

	/**
	 * Sets the status of this wra application.
	 *
	 * @param status the status of this wra application
	 */
	public void setStatus(int status);

	/**
	 * Returns the case ID of this wra application.
	 *
	 * @return the case ID of this wra application
	 */
	@AutoEscape
	public String getCaseId();

	/**
	 * Sets the case ID of this wra application.
	 *
	 * @param caseId the case ID of this wra application
	 */
	public void setCaseId(String caseId);

	/**
	 * Returns the application number of this wra application.
	 *
	 * @return the application number of this wra application
	 */
	@AutoEscape
	public String getApplicationNumber();

	/**
	 * Sets the application number of this wra application.
	 *
	 * @param applicationNumber the application number of this wra application
	 */
	public void setApplicationNumber(String applicationNumber);

	/**
	 * Returns the pdf file entry ID of this wra application.
	 *
	 * @return the pdf file entry ID of this wra application
	 */
	public long getPdfFileEntryId();

	/**
	 * Sets the pdf file entry ID of this wra application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this wra application
	 */
	public void setPdfFileEntryId(long pdfFileEntryId);

	/**
	 * Returns the expired license app number of this wra application.
	 *
	 * @return the expired license app number of this wra application
	 */
	@AutoEscape
	public String getExpiredLicenseAppNumber();

	/**
	 * Sets the expired license app number of this wra application.
	 *
	 * @param expiredLicenseAppNumber the expired license app number of this wra application
	 */
	public void setExpiredLicenseAppNumber(String expiredLicenseAppNumber);

	/**
	 * Returns the app current stage name of this wra application.
	 *
	 * @return the app current stage name of this wra application
	 */
	@AutoEscape
	public String getAppCurrentStageName();

	/**
	 * Sets the app current stage name of this wra application.
	 *
	 * @param appCurrentStageName the app current stage name of this wra application
	 */
	public void setAppCurrentStageName(String appCurrentStageName);

	@Override
	public WRAApplication cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}