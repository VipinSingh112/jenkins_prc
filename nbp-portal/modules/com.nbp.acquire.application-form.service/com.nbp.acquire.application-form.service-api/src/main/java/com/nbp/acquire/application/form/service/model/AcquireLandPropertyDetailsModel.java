/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the AcquireLandPropertyDetails service. Represents a row in the &quot;nbp_acquire_land_prop_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.acquire.application.form.service.model.impl.AcquireLandPropertyDetailsModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.acquire.application.form.service.model.impl.AcquireLandPropertyDetailsImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireLandPropertyDetails
 * @generated
 */
@ProviderType
public interface AcquireLandPropertyDetailsModel
	extends BaseModel<AcquireLandPropertyDetails>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a acquire land property details model instance should use the {@link AcquireLandPropertyDetails} interface instead.
	 */

	/**
	 * Returns the primary key of this acquire land property details.
	 *
	 * @return the primary key of this acquire land property details
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this acquire land property details.
	 *
	 * @param primaryKey the primary key of this acquire land property details
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the acquire land property details ID of this acquire land property details.
	 *
	 * @return the acquire land property details ID of this acquire land property details
	 */
	public long getAcquireLandPropertyDetailsId();

	/**
	 * Sets the acquire land property details ID of this acquire land property details.
	 *
	 * @param acquireLandPropertyDetailsId the acquire land property details ID of this acquire land property details
	 */
	public void setAcquireLandPropertyDetailsId(
		long acquireLandPropertyDetailsId);

	/**
	 * Returns the group ID of this acquire land property details.
	 *
	 * @return the group ID of this acquire land property details
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this acquire land property details.
	 *
	 * @param groupId the group ID of this acquire land property details
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this acquire land property details.
	 *
	 * @return the company ID of this acquire land property details
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this acquire land property details.
	 *
	 * @param companyId the company ID of this acquire land property details
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this acquire land property details.
	 *
	 * @return the user ID of this acquire land property details
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this acquire land property details.
	 *
	 * @param userId the user ID of this acquire land property details
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this acquire land property details.
	 *
	 * @return the user uuid of this acquire land property details
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this acquire land property details.
	 *
	 * @param userUuid the user uuid of this acquire land property details
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this acquire land property details.
	 *
	 * @return the user name of this acquire land property details
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this acquire land property details.
	 *
	 * @param userName the user name of this acquire land property details
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this acquire land property details.
	 *
	 * @return the create date of this acquire land property details
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this acquire land property details.
	 *
	 * @param createDate the create date of this acquire land property details
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this acquire land property details.
	 *
	 * @return the modified date of this acquire land property details
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this acquire land property details.
	 *
	 * @param modifiedDate the modified date of this acquire land property details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the land prop identified of this acquire land property details.
	 *
	 * @return the land prop identified of this acquire land property details
	 */
	@AutoEscape
	public String getLandPropIdentified();

	/**
	 * Sets the land prop identified of this acquire land property details.
	 *
	 * @param landPropIdentified the land prop identified of this acquire land property details
	 */
	public void setLandPropIdentified(String landPropIdentified);

	/**
	 * Returns the land prop addr of this acquire land property details.
	 *
	 * @return the land prop addr of this acquire land property details
	 */
	@AutoEscape
	public String getLandPropAddr();

	/**
	 * Sets the land prop addr of this acquire land property details.
	 *
	 * @param landPropAddr the land prop addr of this acquire land property details
	 */
	public void setLandPropAddr(String landPropAddr);

	/**
	 * Returns the land prop occupation of this acquire land property details.
	 *
	 * @return the land prop occupation of this acquire land property details
	 */
	@AutoEscape
	public String getLandPropOccupation();

	/**
	 * Sets the land prop occupation of this acquire land property details.
	 *
	 * @param landPropOccupation the land prop occupation of this acquire land property details
	 */
	public void setLandPropOccupation(String landPropOccupation);

	/**
	 * Returns the land prop occupation period of this acquire land property details.
	 *
	 * @return the land prop occupation period of this acquire land property details
	 */
	@AutoEscape
	public String getLandPropOccupationPeriod();

	/**
	 * Sets the land prop occupation period of this acquire land property details.
	 *
	 * @param landPropOccupationPeriod the land prop occupation period of this acquire land property details
	 */
	public void setLandPropOccupationPeriod(String landPropOccupationPeriod);

	/**
	 * Returns the land prop tenure type of this acquire land property details.
	 *
	 * @return the land prop tenure type of this acquire land property details
	 */
	@AutoEscape
	public String getLandPropTenureType();

	/**
	 * Sets the land prop tenure type of this acquire land property details.
	 *
	 * @param landPropTenureType the land prop tenure type of this acquire land property details
	 */
	public void setLandPropTenureType(String landPropTenureType);

	/**
	 * Returns the land prop desired loc of this acquire land property details.
	 *
	 * @return the land prop desired loc of this acquire land property details
	 */
	@AutoEscape
	public String getLandPropDesiredLoc();

	/**
	 * Sets the land prop desired loc of this acquire land property details.
	 *
	 * @param landPropDesiredLoc the land prop desired loc of this acquire land property details
	 */
	public void setLandPropDesiredLoc(String landPropDesiredLoc);

	/**
	 * Returns the land prop proposed use of this acquire land property details.
	 *
	 * @return the land prop proposed use of this acquire land property details
	 */
	@AutoEscape
	public String getLandPropProposedUse();

	/**
	 * Sets the land prop proposed use of this acquire land property details.
	 *
	 * @param landPropProposedUse the land prop proposed use of this acquire land property details
	 */
	public void setLandPropProposedUse(String landPropProposedUse);

	/**
	 * Returns the land prop proposed use other of this acquire land property details.
	 *
	 * @return the land prop proposed use other of this acquire land property details
	 */
	@AutoEscape
	public String getLandPropProposedUseOther();

	/**
	 * Sets the land prop proposed use other of this acquire land property details.
	 *
	 * @param landPropProposedUseOther the land prop proposed use other of this acquire land property details
	 */
	public void setLandPropProposedUseOther(String landPropProposedUseOther);

	/**
	 * Returns the land prop prop tenure type of this acquire land property details.
	 *
	 * @return the land prop prop tenure type of this acquire land property details
	 */
	@AutoEscape
	public String getLandPropPropTenureType();

	/**
	 * Sets the land prop prop tenure type of this acquire land property details.
	 *
	 * @param landPropPropTenureType the land prop prop tenure type of this acquire land property details
	 */
	public void setLandPropPropTenureType(String landPropPropTenureType);

	/**
	 * Returns the land prop applied of this acquire land property details.
	 *
	 * @return the land prop applied of this acquire land property details
	 */
	@AutoEscape
	public String getLandPropApplied();

	/**
	 * Sets the land prop applied of this acquire land property details.
	 *
	 * @param landPropApplied the land prop applied of this acquire land property details
	 */
	public void setLandPropApplied(String landPropApplied);

	/**
	 * Returns the land prop application date of this acquire land property details.
	 *
	 * @return the land prop application date of this acquire land property details
	 */
	public Date getLandPropApplicationDate();

	/**
	 * Sets the land prop application date of this acquire land property details.
	 *
	 * @param landPropApplicationDate the land prop application date of this acquire land property details
	 */
	public void setLandPropApplicationDate(Date landPropApplicationDate);

	/**
	 * Returns the land prop existing building of this acquire land property details.
	 *
	 * @return the land prop existing building of this acquire land property details
	 */
	@AutoEscape
	public String getLandPropExistingBuilding();

	/**
	 * Sets the land prop existing building of this acquire land property details.
	 *
	 * @param landPropExistingBuilding the land prop existing building of this acquire land property details
	 */
	public void setLandPropExistingBuilding(String landPropExistingBuilding);

	/**
	 * Returns the land prop existing building other of this acquire land property details.
	 *
	 * @return the land prop existing building other of this acquire land property details
	 */
	@AutoEscape
	public String getLandPropExistingBuildingOther();

	/**
	 * Sets the land prop existing building other of this acquire land property details.
	 *
	 * @param landPropExistingBuildingOther the land prop existing building other of this acquire land property details
	 */
	public void setLandPropExistingBuildingOther(
		String landPropExistingBuildingOther);

	/**
	 * Returns the land prop own of this acquire land property details.
	 *
	 * @return the land prop own of this acquire land property details
	 */
	@AutoEscape
	public String getLandPropOwn();

	/**
	 * Sets the land prop own of this acquire land property details.
	 *
	 * @param landPropOwn the land prop own of this acquire land property details
	 */
	public void setLandPropOwn(String landPropOwn);

	/**
	 * Returns the land prop gov acquired of this acquire land property details.
	 *
	 * @return the land prop gov acquired of this acquire land property details
	 */
	@AutoEscape
	public String getLandPropGovAcquired();

	/**
	 * Sets the land prop gov acquired of this acquire land property details.
	 *
	 * @param landPropGovAcquired the land prop gov acquired of this acquire land property details
	 */
	public void setLandPropGovAcquired(String landPropGovAcquired);

	/**
	 * Returns the land prop state details of this acquire land property details.
	 *
	 * @return the land prop state details of this acquire land property details
	 */
	@AutoEscape
	public String getLandPropStateDetails();

	/**
	 * Sets the land prop state details of this acquire land property details.
	 *
	 * @param landPropStateDetails the land prop state details of this acquire land property details
	 */
	public void setLandPropStateDetails(String landPropStateDetails);

	/**
	 * Returns the land prop payment method of this acquire land property details.
	 *
	 * @return the land prop payment method of this acquire land property details
	 */
	@AutoEscape
	public String getLandPropPaymentMethod();

	/**
	 * Sets the land prop payment method of this acquire land property details.
	 *
	 * @param landPropPaymentMethod the land prop payment method of this acquire land property details
	 */
	public void setLandPropPaymentMethod(String landPropPaymentMethod);

	/**
	 * Returns the land prop payment method other of this acquire land property details.
	 *
	 * @return the land prop payment method other of this acquire land property details
	 */
	@AutoEscape
	public String getLandPropPaymentMethodOther();

	/**
	 * Sets the land prop payment method other of this acquire land property details.
	 *
	 * @param landPropPaymentMethodOther the land prop payment method other of this acquire land property details
	 */
	public void setLandPropPaymentMethodOther(
		String landPropPaymentMethodOther);

	/**
	 * Returns the land prop comments of this acquire land property details.
	 *
	 * @return the land prop comments of this acquire land property details
	 */
	@AutoEscape
	public String getLandPropComments();

	/**
	 * Sets the land prop comments of this acquire land property details.
	 *
	 * @param landPropComments the land prop comments of this acquire land property details
	 */
	public void setLandPropComments(String landPropComments);

	/**
	 * Returns the acquire application ID of this acquire land property details.
	 *
	 * @return the acquire application ID of this acquire land property details
	 */
	public long getAcquireApplicationId();

	/**
	 * Sets the acquire application ID of this acquire land property details.
	 *
	 * @param acquireApplicationId the acquire application ID of this acquire land property details
	 */
	public void setAcquireApplicationId(long acquireApplicationId);

	@Override
	public AcquireLandPropertyDetails cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}