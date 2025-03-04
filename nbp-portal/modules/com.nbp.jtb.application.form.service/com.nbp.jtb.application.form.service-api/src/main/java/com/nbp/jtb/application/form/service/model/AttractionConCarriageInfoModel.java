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
 * The base model interface for the AttractionConCarriageInfo service. Represents a row in the &quot;nbp_jtb_contract_carriage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.jtb.application.form.service.model.impl.AttractionConCarriageInfoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.jtb.application.form.service.model.impl.AttractionConCarriageInfoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionConCarriageInfo
 * @generated
 */
@ProviderType
public interface AttractionConCarriageInfoModel
	extends BaseModel<AttractionConCarriageInfo>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a attraction con carriage info model instance should use the {@link AttractionConCarriageInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this attraction con carriage info.
	 *
	 * @return the primary key of this attraction con carriage info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this attraction con carriage info.
	 *
	 * @param primaryKey the primary key of this attraction con carriage info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the attraction con carriage info ID of this attraction con carriage info.
	 *
	 * @return the attraction con carriage info ID of this attraction con carriage info
	 */
	public long getAttractionConCarriageInfoId();

	/**
	 * Sets the attraction con carriage info ID of this attraction con carriage info.
	 *
	 * @param attractionConCarriageInfoId the attraction con carriage info ID of this attraction con carriage info
	 */
	public void setAttractionConCarriageInfoId(
		long attractionConCarriageInfoId);

	/**
	 * Returns the group ID of this attraction con carriage info.
	 *
	 * @return the group ID of this attraction con carriage info
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this attraction con carriage info.
	 *
	 * @param groupId the group ID of this attraction con carriage info
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this attraction con carriage info.
	 *
	 * @return the company ID of this attraction con carriage info
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this attraction con carriage info.
	 *
	 * @param companyId the company ID of this attraction con carriage info
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this attraction con carriage info.
	 *
	 * @return the user ID of this attraction con carriage info
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this attraction con carriage info.
	 *
	 * @param userId the user ID of this attraction con carriage info
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this attraction con carriage info.
	 *
	 * @return the user uuid of this attraction con carriage info
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this attraction con carriage info.
	 *
	 * @param userUuid the user uuid of this attraction con carriage info
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this attraction con carriage info.
	 *
	 * @return the user name of this attraction con carriage info
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this attraction con carriage info.
	 *
	 * @param userName the user name of this attraction con carriage info
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this attraction con carriage info.
	 *
	 * @return the create date of this attraction con carriage info
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this attraction con carriage info.
	 *
	 * @param createDate the create date of this attraction con carriage info
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this attraction con carriage info.
	 *
	 * @return the modified date of this attraction con carriage info
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this attraction con carriage info.
	 *
	 * @param modifiedDate the modified date of this attraction con carriage info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the owner name of this attraction con carriage info.
	 *
	 * @return the owner name of this attraction con carriage info
	 */
	@AutoEscape
	public String getOwnerName();

	/**
	 * Sets the owner name of this attraction con carriage info.
	 *
	 * @param ownerName the owner name of this attraction con carriage info
	 */
	public void setOwnerName(String ownerName);

	/**
	 * Returns the home address of this attraction con carriage info.
	 *
	 * @return the home address of this attraction con carriage info
	 */
	@AutoEscape
	public String getHomeAddress();

	/**
	 * Sets the home address of this attraction con carriage info.
	 *
	 * @param homeAddress the home address of this attraction con carriage info
	 */
	public void setHomeAddress(String homeAddress);

	/**
	 * Returns the email of this attraction con carriage info.
	 *
	 * @return the email of this attraction con carriage info
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this attraction con carriage info.
	 *
	 * @param email the email of this attraction con carriage info
	 */
	public void setEmail(String email);

	/**
	 * Returns the telephone of this attraction con carriage info.
	 *
	 * @return the telephone of this attraction con carriage info
	 */
	@AutoEscape
	public String getTelephone();

	/**
	 * Sets the telephone of this attraction con carriage info.
	 *
	 * @param telephone the telephone of this attraction con carriage info
	 */
	public void setTelephone(String telephone);

	/**
	 * Returns the parish of this attraction con carriage info.
	 *
	 * @return the parish of this attraction con carriage info
	 */
	@AutoEscape
	public String getParish();

	/**
	 * Sets the parish of this attraction con carriage info.
	 *
	 * @param parish the parish of this attraction con carriage info
	 */
	public void setParish(String parish);

	/**
	 * Returns the new contract date of this attraction con carriage info.
	 *
	 * @return the new contract date of this attraction con carriage info
	 */
	public Date getNewContractDate();

	/**
	 * Sets the new contract date of this attraction con carriage info.
	 *
	 * @param newContractDate the new contract date of this attraction con carriage info
	 */
	public void setNewContractDate(Date newContractDate);

	/**
	 * Returns the new contarct vehicles no of this attraction con carriage info.
	 *
	 * @return the new contarct vehicles no of this attraction con carriage info
	 */
	@AutoEscape
	public String getNewContarctVehiclesNo();

	/**
	 * Sets the new contarct vehicles no of this attraction con carriage info.
	 *
	 * @param newContarctVehiclesNo the new contarct vehicles no of this attraction con carriage info
	 */
	public void setNewContarctVehiclesNo(String newContarctVehiclesNo);

	/**
	 * Returns the new contract trn of this attraction con carriage info.
	 *
	 * @return the new contract trn of this attraction con carriage info
	 */
	@AutoEscape
	public String getNewContractTrn();

	/**
	 * Sets the new contract trn of this attraction con carriage info.
	 *
	 * @param newContractTrn the new contract trn of this attraction con carriage info
	 */
	public void setNewContractTrn(String newContractTrn);

	/**
	 * Returns the contract organization of this attraction con carriage info.
	 *
	 * @return the contract organization of this attraction con carriage info
	 */
	@AutoEscape
	public String getContractOrganization();

	/**
	 * Sets the contract organization of this attraction con carriage info.
	 *
	 * @param contractOrganization the contract organization of this attraction con carriage info
	 */
	public void setContractOrganization(String contractOrganization);

	/**
	 * Returns the owner sign date of this attraction con carriage info.
	 *
	 * @return the owner sign date of this attraction con carriage info
	 */
	public Date getOwnerSignDate();

	/**
	 * Sets the owner sign date of this attraction con carriage info.
	 *
	 * @param ownerSignDate the owner sign date of this attraction con carriage info
	 */
	public void setOwnerSignDate(Date ownerSignDate);

	/**
	 * Returns the jtb application ID of this attraction con carriage info.
	 *
	 * @return the jtb application ID of this attraction con carriage info
	 */
	public long getJtbApplicationId();

	/**
	 * Sets the jtb application ID of this attraction con carriage info.
	 *
	 * @param jtbApplicationId the jtb application ID of this attraction con carriage info
	 */
	public void setJtbApplicationId(long jtbApplicationId);

	@Override
	public AttractionConCarriageInfo cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}