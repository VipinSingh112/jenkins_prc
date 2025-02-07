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
 * The base model interface for the FactoriesStandardActInfo service. Represents a row in the &quot;nbp_factories_stand_act_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesStandardActInfoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesStandardActInfoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesStandardActInfo
 * @generated
 */
@ProviderType
public interface FactoriesStandardActInfoModel
	extends BaseModel<FactoriesStandardActInfo>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a factories standard act info model instance should use the {@link FactoriesStandardActInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this factories standard act info.
	 *
	 * @return the primary key of this factories standard act info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this factories standard act info.
	 *
	 * @param primaryKey the primary key of this factories standard act info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the factories standard act ID of this factories standard act info.
	 *
	 * @return the factories standard act ID of this factories standard act info
	 */
	public long getFactoriesStandardActId();

	/**
	 * Sets the factories standard act ID of this factories standard act info.
	 *
	 * @param factoriesStandardActId the factories standard act ID of this factories standard act info
	 */
	public void setFactoriesStandardActId(long factoriesStandardActId);

	/**
	 * Returns the group ID of this factories standard act info.
	 *
	 * @return the group ID of this factories standard act info
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this factories standard act info.
	 *
	 * @param groupId the group ID of this factories standard act info
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this factories standard act info.
	 *
	 * @return the company ID of this factories standard act info
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this factories standard act info.
	 *
	 * @param companyId the company ID of this factories standard act info
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this factories standard act info.
	 *
	 * @return the user ID of this factories standard act info
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this factories standard act info.
	 *
	 * @param userId the user ID of this factories standard act info
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this factories standard act info.
	 *
	 * @return the user uuid of this factories standard act info
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this factories standard act info.
	 *
	 * @param userUuid the user uuid of this factories standard act info
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this factories standard act info.
	 *
	 * @return the user name of this factories standard act info
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this factories standard act info.
	 *
	 * @param userName the user name of this factories standard act info
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this factories standard act info.
	 *
	 * @return the create date of this factories standard act info
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this factories standard act info.
	 *
	 * @param createDate the create date of this factories standard act info
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this factories standard act info.
	 *
	 * @return the modified date of this factories standard act info
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this factories standard act info.
	 *
	 * @param modifiedDate the modified date of this factories standard act info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the standards act establishment name of this factories standard act info.
	 *
	 * @return the standards act establishment name of this factories standard act info
	 */
	@AutoEscape
	public String getStandardsActEstablishmentName();

	/**
	 * Sets the standards act establishment name of this factories standard act info.
	 *
	 * @param standardsActEstablishmentName the standards act establishment name of this factories standard act info
	 */
	public void setStandardsActEstablishmentName(
		String standardsActEstablishmentName);

	/**
	 * Returns the standards act add parish of this factories standard act info.
	 *
	 * @return the standards act add parish of this factories standard act info
	 */
	@AutoEscape
	public String getStandardsActAddParish();

	/**
	 * Sets the standards act add parish of this factories standard act info.
	 *
	 * @param standardsActAddParish the standards act add parish of this factories standard act info
	 */
	public void setStandardsActAddParish(String standardsActAddParish);

	/**
	 * Returns the standards act address of this factories standard act info.
	 *
	 * @return the standards act address of this factories standard act info
	 */
	@AutoEscape
	public String getStandardsActAddress();

	/**
	 * Sets the standards act address of this factories standard act info.
	 *
	 * @param standardsActAddress the standards act address of this factories standard act info
	 */
	public void setStandardsActAddress(String standardsActAddress);

	/**
	 * Returns the standards act tel of this factories standard act info.
	 *
	 * @return the standards act tel of this factories standard act info
	 */
	@AutoEscape
	public String getStandardsActTel();

	/**
	 * Sets the standards act tel of this factories standard act info.
	 *
	 * @param standardsActTel the standards act tel of this factories standard act info
	 */
	public void setStandardsActTel(String standardsActTel);

	/**
	 * Returns the standards act whats app num of this factories standard act info.
	 *
	 * @return the standards act whats app num of this factories standard act info
	 */
	@AutoEscape
	public String getStandardsActWhatsAppNum();

	/**
	 * Sets the standards act whats app num of this factories standard act info.
	 *
	 * @param standardsActWhatsAppNum the standards act whats app num of this factories standard act info
	 */
	public void setStandardsActWhatsAppNum(String standardsActWhatsAppNum);

	/**
	 * Returns the standards act email of this factories standard act info.
	 *
	 * @return the standards act email of this factories standard act info
	 */
	@AutoEscape
	public String getStandardsActEmail();

	/**
	 * Sets the standards act email of this factories standard act info.
	 *
	 * @param standardsActEmail the standards act email of this factories standard act info
	 */
	public void setStandardsActEmail(String standardsActEmail);

	/**
	 * Returns the standards act fax num of this factories standard act info.
	 *
	 * @return the standards act fax num of this factories standard act info
	 */
	@AutoEscape
	public String getStandardsActFaxNum();

	/**
	 * Sets the standards act fax num of this factories standard act info.
	 *
	 * @param standardsActFaxNum the standards act fax num of this factories standard act info
	 */
	public void setStandardsActFaxNum(String standardsActFaxNum);

	/**
	 * Returns the standards act operator name of this factories standard act info.
	 *
	 * @return the standards act operator name of this factories standard act info
	 */
	@AutoEscape
	public String getStandardsActOperatorName();

	/**
	 * Sets the standards act operator name of this factories standard act info.
	 *
	 * @param standardsActOperatorName the standards act operator name of this factories standard act info
	 */
	public void setStandardsActOperatorName(String standardsActOperatorName);

	/**
	 * Returns the standards act operator address of this factories standard act info.
	 *
	 * @return the standards act operator address of this factories standard act info
	 */
	@AutoEscape
	public String getStandardsActOperatorAddress();

	/**
	 * Sets the standards act operator address of this factories standard act info.
	 *
	 * @param standardsActOperatorAddress the standards act operator address of this factories standard act info
	 */
	public void setStandardsActOperatorAddress(
		String standardsActOperatorAddress);

	/**
	 * Returns the standards act parish of this factories standard act info.
	 *
	 * @return the standards act parish of this factories standard act info
	 */
	@AutoEscape
	public String getStandardsActParish();

	/**
	 * Sets the standards act parish of this factories standard act info.
	 *
	 * @param standardsActParish the standards act parish of this factories standard act info
	 */
	public void setStandardsActParish(String standardsActParish);

	/**
	 * Returns the standards act operator tel of this factories standard act info.
	 *
	 * @return the standards act operator tel of this factories standard act info
	 */
	@AutoEscape
	public String getStandardsActOperatorTel();

	/**
	 * Sets the standards act operator tel of this factories standard act info.
	 *
	 * @param standardsActOperatorTel the standards act operator tel of this factories standard act info
	 */
	public void setStandardsActOperatorTel(String standardsActOperatorTel);

	/**
	 * Returns the standard act product manufactured of this factories standard act info.
	 *
	 * @return the standard act product manufactured of this factories standard act info
	 */
	@AutoEscape
	public String getStandardActProductManufactured();

	/**
	 * Sets the standard act product manufactured of this factories standard act info.
	 *
	 * @param standardActProductManufactured the standard act product manufactured of this factories standard act info
	 */
	public void setStandardActProductManufactured(
		String standardActProductManufactured);

	/**
	 * Returns the standard act brand manufactured of this factories standard act info.
	 *
	 * @return the standard act brand manufactured of this factories standard act info
	 */
	@AutoEscape
	public String getStandardActBrandManufactured();

	/**
	 * Sets the standard act brand manufactured of this factories standard act info.
	 *
	 * @param standardActBrandManufactured the standard act brand manufactured of this factories standard act info
	 */
	public void setStandardActBrandManufactured(
		String standardActBrandManufactured);

	/**
	 * Returns the standards act product size of this factories standard act info.
	 *
	 * @return the standards act product size of this factories standard act info
	 */
	@AutoEscape
	public String getStandardsActProductSize();

	/**
	 * Sets the standards act product size of this factories standard act info.
	 *
	 * @param standardsActProductSize the standards act product size of this factories standard act info
	 */
	public void setStandardsActProductSize(String standardsActProductSize);

	/**
	 * Returns the standards act last date of this factories standard act info.
	 *
	 * @return the standards act last date of this factories standard act info
	 */
	public Date getStandardsActLastDate();

	/**
	 * Sets the standards act last date of this factories standard act info.
	 *
	 * @param standardsActLastDate the standards act last date of this factories standard act info
	 */
	public void setStandardsActLastDate(Date standardsActLastDate);

	/**
	 * Returns the standards act purpose of this factories standard act info.
	 *
	 * @return the standards act purpose of this factories standard act info
	 */
	@AutoEscape
	public String getStandardsActPurpose();

	/**
	 * Sets the standards act purpose of this factories standard act info.
	 *
	 * @param standardsActPurpose the standards act purpose of this factories standard act info
	 */
	public void setStandardsActPurpose(String standardsActPurpose);

	/**
	 * Returns the standards act date of this factories standard act info.
	 *
	 * @return the standards act date of this factories standard act info
	 */
	public Date getStandardsActDate();

	/**
	 * Sets the standards act date of this factories standard act info.
	 *
	 * @param standardsActDate the standards act date of this factories standard act info
	 */
	public void setStandardsActDate(Date standardsActDate);

	/**
	 * Returns the establishment before of this factories standard act info.
	 *
	 * @return the establishment before of this factories standard act info
	 */
	@AutoEscape
	public String getEstablishmentBefore();

	/**
	 * Sets the establishment before of this factories standard act info.
	 *
	 * @param establishmentBefore the establishment before of this factories standard act info
	 */
	public void setEstablishmentBefore(String establishmentBefore);

	/**
	 * Returns the factories application ID of this factories standard act info.
	 *
	 * @return the factories application ID of this factories standard act info
	 */
	public long getFactoriesApplicationId();

	/**
	 * Sets the factories application ID of this factories standard act info.
	 *
	 * @param factoriesApplicationId the factories application ID of this factories standard act info
	 */
	public void setFactoriesApplicationId(long factoriesApplicationId);

	@Override
	public FactoriesStandardActInfo cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}