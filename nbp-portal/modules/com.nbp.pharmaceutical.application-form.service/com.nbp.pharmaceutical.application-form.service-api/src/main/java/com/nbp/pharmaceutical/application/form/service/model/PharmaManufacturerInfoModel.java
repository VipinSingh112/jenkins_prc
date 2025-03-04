/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the PharmaManufacturerInfo service. Represents a row in the &quot;nbp_pharma_manufacturer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaManufacturerInfoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaManufacturerInfoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaManufacturerInfo
 * @generated
 */
@ProviderType
public interface PharmaManufacturerInfoModel
	extends BaseModel<PharmaManufacturerInfo>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a pharma manufacturer info model instance should use the {@link PharmaManufacturerInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this pharma manufacturer info.
	 *
	 * @return the primary key of this pharma manufacturer info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this pharma manufacturer info.
	 *
	 * @param primaryKey the primary key of this pharma manufacturer info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the pharma manufacturer info ID of this pharma manufacturer info.
	 *
	 * @return the pharma manufacturer info ID of this pharma manufacturer info
	 */
	public long getPharmaManufacturerInfoId();

	/**
	 * Sets the pharma manufacturer info ID of this pharma manufacturer info.
	 *
	 * @param pharmaManufacturerInfoId the pharma manufacturer info ID of this pharma manufacturer info
	 */
	public void setPharmaManufacturerInfoId(long pharmaManufacturerInfoId);

	/**
	 * Returns the group ID of this pharma manufacturer info.
	 *
	 * @return the group ID of this pharma manufacturer info
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this pharma manufacturer info.
	 *
	 * @param groupId the group ID of this pharma manufacturer info
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this pharma manufacturer info.
	 *
	 * @return the company ID of this pharma manufacturer info
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this pharma manufacturer info.
	 *
	 * @param companyId the company ID of this pharma manufacturer info
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this pharma manufacturer info.
	 *
	 * @return the user ID of this pharma manufacturer info
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this pharma manufacturer info.
	 *
	 * @param userId the user ID of this pharma manufacturer info
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this pharma manufacturer info.
	 *
	 * @return the user uuid of this pharma manufacturer info
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this pharma manufacturer info.
	 *
	 * @param userUuid the user uuid of this pharma manufacturer info
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this pharma manufacturer info.
	 *
	 * @return the user name of this pharma manufacturer info
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this pharma manufacturer info.
	 *
	 * @param userName the user name of this pharma manufacturer info
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this pharma manufacturer info.
	 *
	 * @return the create date of this pharma manufacturer info
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this pharma manufacturer info.
	 *
	 * @param createDate the create date of this pharma manufacturer info
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this pharma manufacturer info.
	 *
	 * @return the modified date of this pharma manufacturer info
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this pharma manufacturer info.
	 *
	 * @param modifiedDate the modified date of this pharma manufacturer info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the pharma drug manufacturer name of this pharma manufacturer info.
	 *
	 * @return the pharma drug manufacturer name of this pharma manufacturer info
	 */
	@AutoEscape
	public String getPharmaDrugManufacturerName();

	/**
	 * Sets the pharma drug manufacturer name of this pharma manufacturer info.
	 *
	 * @param pharmaDrugManufacturerName the pharma drug manufacturer name of this pharma manufacturer info
	 */
	public void setPharmaDrugManufacturerName(
		String pharmaDrugManufacturerName);

	/**
	 * Returns the pharma drug manufacturer add of this pharma manufacturer info.
	 *
	 * @return the pharma drug manufacturer add of this pharma manufacturer info
	 */
	@AutoEscape
	public String getPharmaDrugManufacturerAdd();

	/**
	 * Sets the pharma drug manufacturer add of this pharma manufacturer info.
	 *
	 * @param pharmaDrugManufacturerAdd the pharma drug manufacturer add of this pharma manufacturer info
	 */
	public void setPharmaDrugManufacturerAdd(String pharmaDrugManufacturerAdd);

	/**
	 * Returns the pharma drug deisgnation of this pharma manufacturer info.
	 *
	 * @return the pharma drug deisgnation of this pharma manufacturer info
	 */
	@AutoEscape
	public String getPharmaDrugDeisgnation();

	/**
	 * Sets the pharma drug deisgnation of this pharma manufacturer info.
	 *
	 * @param pharmaDrugDeisgnation the pharma drug deisgnation of this pharma manufacturer info
	 */
	public void setPharmaDrugDeisgnation(String pharmaDrugDeisgnation);

	/**
	 * Returns the pharma market auth name of this pharma manufacturer info.
	 *
	 * @return the pharma market auth name of this pharma manufacturer info
	 */
	@AutoEscape
	public String getPharmaMarketAuthName();

	/**
	 * Sets the pharma market auth name of this pharma manufacturer info.
	 *
	 * @param pharmaMarketAuthName the pharma market auth name of this pharma manufacturer info
	 */
	public void setPharmaMarketAuthName(String pharmaMarketAuthName);

	/**
	 * Returns the pharma market auth address of this pharma manufacturer info.
	 *
	 * @return the pharma market auth address of this pharma manufacturer info
	 */
	@AutoEscape
	public String getPharmaMarketAuthAddress();

	/**
	 * Sets the pharma market auth address of this pharma manufacturer info.
	 *
	 * @param pharmaMarketAuthAddress the pharma market auth address of this pharma manufacturer info
	 */
	public void setPharmaMarketAuthAddress(String pharmaMarketAuthAddress);

	/**
	 * Returns the pharma regu officer name of this pharma manufacturer info.
	 *
	 * @return the pharma regu officer name of this pharma manufacturer info
	 */
	@AutoEscape
	public String getPharmaReguOfficerName();

	/**
	 * Sets the pharma regu officer name of this pharma manufacturer info.
	 *
	 * @param pharmaReguOfficerName the pharma regu officer name of this pharma manufacturer info
	 */
	public void setPharmaReguOfficerName(String pharmaReguOfficerName);

	/**
	 * Returns the pharma regu officer contact of this pharma manufacturer info.
	 *
	 * @return the pharma regu officer contact of this pharma manufacturer info
	 */
	@AutoEscape
	public String getPharmaReguOfficerContact();

	/**
	 * Sets the pharma regu officer contact of this pharma manufacturer info.
	 *
	 * @param pharmaReguOfficerContact the pharma regu officer contact of this pharma manufacturer info
	 */
	public void setPharmaReguOfficerContact(String pharmaReguOfficerContact);

	/**
	 * Returns the pharma drug applic name of this pharma manufacturer info.
	 *
	 * @return the pharma drug applic name of this pharma manufacturer info
	 */
	@AutoEscape
	public String getPharmaDrugApplicName();

	/**
	 * Sets the pharma drug applic name of this pharma manufacturer info.
	 *
	 * @param pharmaDrugApplicName the pharma drug applic name of this pharma manufacturer info
	 */
	public void setPharmaDrugApplicName(String pharmaDrugApplicName);

	/**
	 * Returns the pharma drug applic address of this pharma manufacturer info.
	 *
	 * @return the pharma drug applic address of this pharma manufacturer info
	 */
	@AutoEscape
	public String getPharmaDrugApplicAddress();

	/**
	 * Sets the pharma drug applic address of this pharma manufacturer info.
	 *
	 * @param pharmaDrugApplicAddress the pharma drug applic address of this pharma manufacturer info
	 */
	public void setPharmaDrugApplicAddress(String pharmaDrugApplicAddress);

	/**
	 * Returns the pharma local repr name of this pharma manufacturer info.
	 *
	 * @return the pharma local repr name of this pharma manufacturer info
	 */
	@AutoEscape
	public String getPharmaLocalReprName();

	/**
	 * Sets the pharma local repr name of this pharma manufacturer info.
	 *
	 * @param pharmaLocalReprName the pharma local repr name of this pharma manufacturer info
	 */
	public void setPharmaLocalReprName(String pharmaLocalReprName);

	/**
	 * Returns the pharma local repr contact of this pharma manufacturer info.
	 *
	 * @return the pharma local repr contact of this pharma manufacturer info
	 */
	@AutoEscape
	public String getPharmaLocalReprContact();

	/**
	 * Sets the pharma local repr contact of this pharma manufacturer info.
	 *
	 * @param pharmaLocalReprContact the pharma local repr contact of this pharma manufacturer info
	 */
	public void setPharmaLocalReprContact(String pharmaLocalReprContact);

	/**
	 * Returns the pharma local repr add of this pharma manufacturer info.
	 *
	 * @return the pharma local repr add of this pharma manufacturer info
	 */
	@AutoEscape
	public String getPharmaLocalReprAdd();

	/**
	 * Sets the pharma local repr add of this pharma manufacturer info.
	 *
	 * @param pharmaLocalReprAdd the pharma local repr add of this pharma manufacturer info
	 */
	public void setPharmaLocalReprAdd(String pharmaLocalReprAdd);

	/**
	 * Returns the pharma local dist name of this pharma manufacturer info.
	 *
	 * @return the pharma local dist name of this pharma manufacturer info
	 */
	@AutoEscape
	public String getPharmaLocalDistName();

	/**
	 * Sets the pharma local dist name of this pharma manufacturer info.
	 *
	 * @param pharmaLocalDistName the pharma local dist name of this pharma manufacturer info
	 */
	public void setPharmaLocalDistName(String pharmaLocalDistName);

	/**
	 * Returns the pharma local dist address of this pharma manufacturer info.
	 *
	 * @return the pharma local dist address of this pharma manufacturer info
	 */
	@AutoEscape
	public String getPharmaLocalDistAddress();

	/**
	 * Sets the pharma local dist address of this pharma manufacturer info.
	 *
	 * @param pharmaLocalDistAddress the pharma local dist address of this pharma manufacturer info
	 */
	public void setPharmaLocalDistAddress(String pharmaLocalDistAddress);

	/**
	 * Returns the pharma local dist contact of this pharma manufacturer info.
	 *
	 * @return the pharma local dist contact of this pharma manufacturer info
	 */
	@AutoEscape
	public String getPharmaLocalDistContact();

	/**
	 * Sets the pharma local dist contact of this pharma manufacturer info.
	 *
	 * @param pharmaLocalDistContact the pharma local dist contact of this pharma manufacturer info
	 */
	public void setPharmaLocalDistContact(String pharmaLocalDistContact);

	/**
	 * Returns the pharma application ID of this pharma manufacturer info.
	 *
	 * @return the pharma application ID of this pharma manufacturer info
	 */
	public long getPharmaApplicationId();

	/**
	 * Sets the pharma application ID of this pharma manufacturer info.
	 *
	 * @param pharmaApplicationId the pharma application ID of this pharma manufacturer info
	 */
	public void setPharmaApplicationId(long pharmaApplicationId);

	@Override
	public PharmaManufacturerInfo cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}