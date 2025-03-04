/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the QuarryMaterialInformationEquipmentList service. Represents a row in the &quot;nbp_quarry_material_List_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.quary.application.form.service.model.impl.QuarryMaterialInformationEquipmentListModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.quary.application.form.service.model.impl.QuarryMaterialInformationEquipmentListImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryMaterialInformationEquipmentList
 * @generated
 */
@ProviderType
public interface QuarryMaterialInformationEquipmentListModel
	extends BaseModel<QuarryMaterialInformationEquipmentList>, GroupedModel,
			ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a quarry material information equipment list model instance should use the {@link QuarryMaterialInformationEquipmentList} interface instead.
	 */

	/**
	 * Returns the primary key of this quarry material information equipment list.
	 *
	 * @return the primary key of this quarry material information equipment list
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this quarry material information equipment list.
	 *
	 * @param primaryKey the primary key of this quarry material information equipment list
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the material info ID of this quarry material information equipment list.
	 *
	 * @return the material info ID of this quarry material information equipment list
	 */
	public long getMaterialInfoId();

	/**
	 * Sets the material info ID of this quarry material information equipment list.
	 *
	 * @param materialInfoId the material info ID of this quarry material information equipment list
	 */
	public void setMaterialInfoId(long materialInfoId);

	/**
	 * Returns the group ID of this quarry material information equipment list.
	 *
	 * @return the group ID of this quarry material information equipment list
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this quarry material information equipment list.
	 *
	 * @param groupId the group ID of this quarry material information equipment list
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this quarry material information equipment list.
	 *
	 * @return the company ID of this quarry material information equipment list
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this quarry material information equipment list.
	 *
	 * @param companyId the company ID of this quarry material information equipment list
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this quarry material information equipment list.
	 *
	 * @return the user ID of this quarry material information equipment list
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this quarry material information equipment list.
	 *
	 * @param userId the user ID of this quarry material information equipment list
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this quarry material information equipment list.
	 *
	 * @return the user uuid of this quarry material information equipment list
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this quarry material information equipment list.
	 *
	 * @param userUuid the user uuid of this quarry material information equipment list
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this quarry material information equipment list.
	 *
	 * @return the user name of this quarry material information equipment list
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this quarry material information equipment list.
	 *
	 * @param userName the user name of this quarry material information equipment list
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this quarry material information equipment list.
	 *
	 * @return the create date of this quarry material information equipment list
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this quarry material information equipment list.
	 *
	 * @param createDate the create date of this quarry material information equipment list
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this quarry material information equipment list.
	 *
	 * @return the modified date of this quarry material information equipment list
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this quarry material information equipment list.
	 *
	 * @param modifiedDate the modified date of this quarry material information equipment list
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the machine name of this quarry material information equipment list.
	 *
	 * @return the machine name of this quarry material information equipment list
	 */
	@AutoEscape
	public String getMachineName();

	/**
	 * Sets the machine name of this quarry material information equipment list.
	 *
	 * @param machineName the machine name of this quarry material information equipment list
	 */
	public void setMachineName(String machineName);

	/**
	 * Returns the quantity of this quarry material information equipment list.
	 *
	 * @return the quantity of this quarry material information equipment list
	 */
	@AutoEscape
	public String getQuantity();

	/**
	 * Sets the quantity of this quarry material information equipment list.
	 *
	 * @param quantity the quantity of this quarry material information equipment list
	 */
	public void setQuantity(String quantity);

	/**
	 * Returns the located on permises of this quarry material information equipment list.
	 *
	 * @return the located on permises of this quarry material information equipment list
	 */
	@AutoEscape
	public String getLocatedOnPermises();

	/**
	 * Sets the located on permises of this quarry material information equipment list.
	 *
	 * @param locatedOnPermises the located on permises of this quarry material information equipment list
	 */
	public void setLocatedOnPermises(String locatedOnPermises);

	/**
	 * Returns the is manchine name checked of this quarry material information equipment list.
	 *
	 * @return the is manchine name checked of this quarry material information equipment list
	 */
	@AutoEscape
	public String getIsManchineNameChecked();

	/**
	 * Sets the is manchine name checked of this quarry material information equipment list.
	 *
	 * @param isManchineNameChecked the is manchine name checked of this quarry material information equipment list
	 */
	public void setIsManchineNameChecked(String isManchineNameChecked);

	/**
	 * Returns the other value of this quarry material information equipment list.
	 *
	 * @return the other value of this quarry material information equipment list
	 */
	@AutoEscape
	public String getOtherValue();

	/**
	 * Sets the other value of this quarry material information equipment list.
	 *
	 * @param otherValue the other value of this quarry material information equipment list
	 */
	public void setOtherValue(String otherValue);

	/**
	 * Returns the quarry application ID of this quarry material information equipment list.
	 *
	 * @return the quarry application ID of this quarry material information equipment list
	 */
	public long getQuarryApplicationId();

	/**
	 * Sets the quarry application ID of this quarry material information equipment list.
	 *
	 * @param quarryApplicationId the quarry application ID of this quarry material information equipment list
	 */
	public void setQuarryApplicationId(long quarryApplicationId);

	@Override
	public QuarryMaterialInformationEquipmentList cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}