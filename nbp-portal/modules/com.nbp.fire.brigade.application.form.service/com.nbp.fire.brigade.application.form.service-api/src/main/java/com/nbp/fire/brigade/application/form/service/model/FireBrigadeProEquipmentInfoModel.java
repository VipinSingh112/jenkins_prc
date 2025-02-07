/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the FireBrigadeProEquipmentInfo service. Represents a row in the &quot;nbp_fire_pro_equipment_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeProEquipmentInfoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeProEquipmentInfoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeProEquipmentInfo
 * @generated
 */
@ProviderType
public interface FireBrigadeProEquipmentInfoModel
	extends BaseModel<FireBrigadeProEquipmentInfo>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a fire brigade pro equipment info model instance should use the {@link FireBrigadeProEquipmentInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this fire brigade pro equipment info.
	 *
	 * @return the primary key of this fire brigade pro equipment info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this fire brigade pro equipment info.
	 *
	 * @param primaryKey the primary key of this fire brigade pro equipment info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the fire brigade pro equipment info ID of this fire brigade pro equipment info.
	 *
	 * @return the fire brigade pro equipment info ID of this fire brigade pro equipment info
	 */
	public long getFireBrigadeProEquipmentInfoId();

	/**
	 * Sets the fire brigade pro equipment info ID of this fire brigade pro equipment info.
	 *
	 * @param fireBrigadeProEquipmentInfoId the fire brigade pro equipment info ID of this fire brigade pro equipment info
	 */
	public void setFireBrigadeProEquipmentInfoId(
		long fireBrigadeProEquipmentInfoId);

	/**
	 * Returns the group ID of this fire brigade pro equipment info.
	 *
	 * @return the group ID of this fire brigade pro equipment info
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this fire brigade pro equipment info.
	 *
	 * @param groupId the group ID of this fire brigade pro equipment info
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this fire brigade pro equipment info.
	 *
	 * @return the company ID of this fire brigade pro equipment info
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this fire brigade pro equipment info.
	 *
	 * @param companyId the company ID of this fire brigade pro equipment info
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this fire brigade pro equipment info.
	 *
	 * @return the user ID of this fire brigade pro equipment info
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this fire brigade pro equipment info.
	 *
	 * @param userId the user ID of this fire brigade pro equipment info
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this fire brigade pro equipment info.
	 *
	 * @return the user uuid of this fire brigade pro equipment info
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this fire brigade pro equipment info.
	 *
	 * @param userUuid the user uuid of this fire brigade pro equipment info
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this fire brigade pro equipment info.
	 *
	 * @return the user name of this fire brigade pro equipment info
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this fire brigade pro equipment info.
	 *
	 * @param userName the user name of this fire brigade pro equipment info
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this fire brigade pro equipment info.
	 *
	 * @return the create date of this fire brigade pro equipment info
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this fire brigade pro equipment info.
	 *
	 * @param createDate the create date of this fire brigade pro equipment info
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this fire brigade pro equipment info.
	 *
	 * @return the modified date of this fire brigade pro equipment info
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this fire brigade pro equipment info.
	 *
	 * @param modifiedDate the modified date of this fire brigade pro equipment info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the equipment protection pre of this fire brigade pro equipment info.
	 *
	 * @return the equipment protection pre of this fire brigade pro equipment info
	 */
	@AutoEscape
	public String getEquipmentProtectionPre();

	/**
	 * Sets the equipment protection pre of this fire brigade pro equipment info.
	 *
	 * @param equipmentProtectionPre the equipment protection pre of this fire brigade pro equipment info
	 */
	public void setEquipmentProtectionPre(String equipmentProtectionPre);

	/**
	 * Returns the equipment protection one of this fire brigade pro equipment info.
	 *
	 * @return the equipment protection one of this fire brigade pro equipment info
	 */
	@AutoEscape
	public String getEquipmentProtectionOne();

	/**
	 * Sets the equipment protection one of this fire brigade pro equipment info.
	 *
	 * @param equipmentProtectionOne the equipment protection one of this fire brigade pro equipment info
	 */
	public void setEquipmentProtectionOne(String equipmentProtectionOne);

	/**
	 * Returns the equipment protection two of this fire brigade pro equipment info.
	 *
	 * @return the equipment protection two of this fire brigade pro equipment info
	 */
	@AutoEscape
	public String getEquipmentProtectionTwo();

	/**
	 * Sets the equipment protection two of this fire brigade pro equipment info.
	 *
	 * @param equipmentProtectionTwo the equipment protection two of this fire brigade pro equipment info
	 */
	public void setEquipmentProtectionTwo(String equipmentProtectionTwo);

	/**
	 * Returns the equipment protection three of this fire brigade pro equipment info.
	 *
	 * @return the equipment protection three of this fire brigade pro equipment info
	 */
	@AutoEscape
	public String getEquipmentProtectionThree();

	/**
	 * Sets the equipment protection three of this fire brigade pro equipment info.
	 *
	 * @param equipmentProtectionThree the equipment protection three of this fire brigade pro equipment info
	 */
	public void setEquipmentProtectionThree(String equipmentProtectionThree);

	/**
	 * Returns the equipment protection four of this fire brigade pro equipment info.
	 *
	 * @return the equipment protection four of this fire brigade pro equipment info
	 */
	@AutoEscape
	public String getEquipmentProtectionFour();

	/**
	 * Sets the equipment protection four of this fire brigade pro equipment info.
	 *
	 * @param equipmentProtectionFour the equipment protection four of this fire brigade pro equipment info
	 */
	public void setEquipmentProtectionFour(String equipmentProtectionFour);

	/**
	 * Returns the equipment protection five of this fire brigade pro equipment info.
	 *
	 * @return the equipment protection five of this fire brigade pro equipment info
	 */
	@AutoEscape
	public String getEquipmentProtectionFive();

	/**
	 * Sets the equipment protection five of this fire brigade pro equipment info.
	 *
	 * @param equipmentProtectionFive the equipment protection five of this fire brigade pro equipment info
	 */
	public void setEquipmentProtectionFive(String equipmentProtectionFive);

	/**
	 * Returns the equipment protection six of this fire brigade pro equipment info.
	 *
	 * @return the equipment protection six of this fire brigade pro equipment info
	 */
	@AutoEscape
	public String getEquipmentProtectionSix();

	/**
	 * Sets the equipment protection six of this fire brigade pro equipment info.
	 *
	 * @param equipmentProtectionSix the equipment protection six of this fire brigade pro equipment info
	 */
	public void setEquipmentProtectionSix(String equipmentProtectionSix);

	/**
	 * Returns the other equipment of this fire brigade pro equipment info.
	 *
	 * @return the other equipment of this fire brigade pro equipment info
	 */
	@AutoEscape
	public String getOtherEquipment();

	/**
	 * Sets the other equipment of this fire brigade pro equipment info.
	 *
	 * @param otherEquipment the other equipment of this fire brigade pro equipment info
	 */
	public void setOtherEquipment(String otherEquipment);

	/**
	 * Returns the fire brigade application ID of this fire brigade pro equipment info.
	 *
	 * @return the fire brigade application ID of this fire brigade pro equipment info
	 */
	public long getFireBrigadeApplicationId();

	/**
	 * Sets the fire brigade application ID of this fire brigade pro equipment info.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID of this fire brigade pro equipment info
	 */
	public void setFireBrigadeApplicationId(long fireBrigadeApplicationId);

	@Override
	public FireBrigadeProEquipmentInfo cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}