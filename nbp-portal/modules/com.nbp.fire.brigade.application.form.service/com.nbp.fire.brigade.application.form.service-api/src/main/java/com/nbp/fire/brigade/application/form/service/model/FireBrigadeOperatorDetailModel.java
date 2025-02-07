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
 * The base model interface for the FireBrigadeOperatorDetail service. Represents a row in the &quot;nbp_fire_operator_detail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeOperatorDetailModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeOperatorDetailImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeOperatorDetail
 * @generated
 */
@ProviderType
public interface FireBrigadeOperatorDetailModel
	extends BaseModel<FireBrigadeOperatorDetail>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a fire brigade operator detail model instance should use the {@link FireBrigadeOperatorDetail} interface instead.
	 */

	/**
	 * Returns the primary key of this fire brigade operator detail.
	 *
	 * @return the primary key of this fire brigade operator detail
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this fire brigade operator detail.
	 *
	 * @param primaryKey the primary key of this fire brigade operator detail
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the fire brigade operator detail ID of this fire brigade operator detail.
	 *
	 * @return the fire brigade operator detail ID of this fire brigade operator detail
	 */
	public long getFireBrigadeOperatorDetailId();

	/**
	 * Sets the fire brigade operator detail ID of this fire brigade operator detail.
	 *
	 * @param fireBrigadeOperatorDetailId the fire brigade operator detail ID of this fire brigade operator detail
	 */
	public void setFireBrigadeOperatorDetailId(
		long fireBrigadeOperatorDetailId);

	/**
	 * Returns the group ID of this fire brigade operator detail.
	 *
	 * @return the group ID of this fire brigade operator detail
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this fire brigade operator detail.
	 *
	 * @param groupId the group ID of this fire brigade operator detail
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this fire brigade operator detail.
	 *
	 * @return the company ID of this fire brigade operator detail
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this fire brigade operator detail.
	 *
	 * @param companyId the company ID of this fire brigade operator detail
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this fire brigade operator detail.
	 *
	 * @return the user ID of this fire brigade operator detail
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this fire brigade operator detail.
	 *
	 * @param userId the user ID of this fire brigade operator detail
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this fire brigade operator detail.
	 *
	 * @return the user uuid of this fire brigade operator detail
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this fire brigade operator detail.
	 *
	 * @param userUuid the user uuid of this fire brigade operator detail
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this fire brigade operator detail.
	 *
	 * @return the user name of this fire brigade operator detail
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this fire brigade operator detail.
	 *
	 * @param userName the user name of this fire brigade operator detail
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this fire brigade operator detail.
	 *
	 * @return the create date of this fire brigade operator detail
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this fire brigade operator detail.
	 *
	 * @param createDate the create date of this fire brigade operator detail
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this fire brigade operator detail.
	 *
	 * @return the modified date of this fire brigade operator detail
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this fire brigade operator detail.
	 *
	 * @param modifiedDate the modified date of this fire brigade operator detail
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the operator name of this fire brigade operator detail.
	 *
	 * @return the operator name of this fire brigade operator detail
	 */
	@AutoEscape
	public String getOperatorName();

	/**
	 * Sets the operator name of this fire brigade operator detail.
	 *
	 * @param operatorName the operator name of this fire brigade operator detail
	 */
	public void setOperatorName(String operatorName);

	/**
	 * Returns the business name of this fire brigade operator detail.
	 *
	 * @return the business name of this fire brigade operator detail
	 */
	@AutoEscape
	public String getBusinessName();

	/**
	 * Sets the business name of this fire brigade operator detail.
	 *
	 * @param businessName the business name of this fire brigade operator detail
	 */
	public void setBusinessName(String businessName);

	/**
	 * Returns the address of this fire brigade operator detail.
	 *
	 * @return the address of this fire brigade operator detail
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this fire brigade operator detail.
	 *
	 * @param address the address of this fire brigade operator detail
	 */
	public void setAddress(String address);

	/**
	 * Returns the premises uses of this fire brigade operator detail.
	 *
	 * @return the premises uses of this fire brigade operator detail
	 */
	@AutoEscape
	public String getPremisesUses();

	/**
	 * Sets the premises uses of this fire brigade operator detail.
	 *
	 * @param premisesUses the premises uses of this fire brigade operator detail
	 */
	public void setPremisesUses(String premisesUses);

	/**
	 * Returns the premises occupancy of this fire brigade operator detail.
	 *
	 * @return the premises occupancy of this fire brigade operator detail
	 */
	@AutoEscape
	public String getPremisesOccupancy();

	/**
	 * Sets the premises occupancy of this fire brigade operator detail.
	 *
	 * @param premisesOccupancy the premises occupancy of this fire brigade operator detail
	 */
	public void setPremisesOccupancy(String premisesOccupancy);

	/**
	 * Returns the premises business of this fire brigade operator detail.
	 *
	 * @return the premises business of this fire brigade operator detail
	 */
	@AutoEscape
	public String getPremisesBusiness();

	/**
	 * Sets the premises business of this fire brigade operator detail.
	 *
	 * @param premisesBusiness the premises business of this fire brigade operator detail
	 */
	public void setPremisesBusiness(String premisesBusiness);

	/**
	 * Returns the max working persons of this fire brigade operator detail.
	 *
	 * @return the max working persons of this fire brigade operator detail
	 */
	@AutoEscape
	public String getMaxWorkingPersons();

	/**
	 * Sets the max working persons of this fire brigade operator detail.
	 *
	 * @param maxWorkingPersons the max working persons of this fire brigade operator detail
	 */
	public void setMaxWorkingPersons(String maxWorkingPersons);

	/**
	 * Returns the max num persons at any one time of this fire brigade operator detail.
	 *
	 * @return the max num persons at any one time of this fire brigade operator detail
	 */
	@AutoEscape
	public String getMaxNumPersonsAtAnyOneTime();

	/**
	 * Sets the max num persons at any one time of this fire brigade operator detail.
	 *
	 * @param maxNumPersonsAtAnyOneTime the max num persons at any one time of this fire brigade operator detail
	 */
	public void setMaxNumPersonsAtAnyOneTime(String maxNumPersonsAtAnyOneTime);

	/**
	 * Returns the fire brigade application ID of this fire brigade operator detail.
	 *
	 * @return the fire brigade application ID of this fire brigade operator detail
	 */
	public long getFireBrigadeApplicationId();

	/**
	 * Sets the fire brigade application ID of this fire brigade operator detail.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID of this fire brigade operator detail
	 */
	public void setFireBrigadeApplicationId(long fireBrigadeApplicationId);

	@Override
	public FireBrigadeOperatorDetail cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}