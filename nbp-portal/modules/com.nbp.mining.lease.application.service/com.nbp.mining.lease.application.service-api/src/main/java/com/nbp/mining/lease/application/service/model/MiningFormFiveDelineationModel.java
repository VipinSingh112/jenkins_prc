/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the MiningFormFiveDelineation service. Represents a row in the &quot;nbp_delineation_area&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.mining.lease.application.service.model.impl.MiningFormFiveDelineationModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.mining.lease.application.service.model.impl.MiningFormFiveDelineationImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningFormFiveDelineation
 * @generated
 */
@ProviderType
public interface MiningFormFiveDelineationModel
	extends BaseModel<MiningFormFiveDelineation>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a mining form five delineation model instance should use the {@link MiningFormFiveDelineation} interface instead.
	 */

	/**
	 * Returns the primary key of this mining form five delineation.
	 *
	 * @return the primary key of this mining form five delineation
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this mining form five delineation.
	 *
	 * @param primaryKey the primary key of this mining form five delineation
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the mining form five delineation ID of this mining form five delineation.
	 *
	 * @return the mining form five delineation ID of this mining form five delineation
	 */
	public long getMiningFormFiveDelineationId();

	/**
	 * Sets the mining form five delineation ID of this mining form five delineation.
	 *
	 * @param miningFormFiveDelineationId the mining form five delineation ID of this mining form five delineation
	 */
	public void setMiningFormFiveDelineationId(
		long miningFormFiveDelineationId);

	/**
	 * Returns the group ID of this mining form five delineation.
	 *
	 * @return the group ID of this mining form five delineation
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this mining form five delineation.
	 *
	 * @param groupId the group ID of this mining form five delineation
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this mining form five delineation.
	 *
	 * @return the company ID of this mining form five delineation
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this mining form five delineation.
	 *
	 * @param companyId the company ID of this mining form five delineation
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this mining form five delineation.
	 *
	 * @return the user ID of this mining form five delineation
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this mining form five delineation.
	 *
	 * @param userId the user ID of this mining form five delineation
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this mining form five delineation.
	 *
	 * @return the user uuid of this mining form five delineation
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this mining form five delineation.
	 *
	 * @param userUuid the user uuid of this mining form five delineation
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this mining form five delineation.
	 *
	 * @return the user name of this mining form five delineation
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this mining form five delineation.
	 *
	 * @param userName the user name of this mining form five delineation
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this mining form five delineation.
	 *
	 * @return the create date of this mining form five delineation
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this mining form five delineation.
	 *
	 * @param createDate the create date of this mining form five delineation
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this mining form five delineation.
	 *
	 * @return the modified date of this mining form five delineation
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this mining form five delineation.
	 *
	 * @param modifiedDate the modified date of this mining form five delineation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the approximately area of this mining form five delineation.
	 *
	 * @return the approximately area of this mining form five delineation
	 */
	@AutoEscape
	public String getApproximatelyArea();

	/**
	 * Sets the approximately area of this mining form five delineation.
	 *
	 * @param approximatelyArea the approximately area of this mining form five delineation
	 */
	public void setApproximatelyArea(String approximatelyArea);

	/**
	 * Returns the location of this mining form five delineation.
	 *
	 * @return the location of this mining form five delineation
	 */
	@AutoEscape
	public String getLocation();

	/**
	 * Sets the location of this mining form five delineation.
	 *
	 * @param location the location of this mining form five delineation
	 */
	public void setLocation(String location);

	/**
	 * Returns the coordinates of this mining form five delineation.
	 *
	 * @return the coordinates of this mining form five delineation
	 */
	@AutoEscape
	public String getCoordinates();

	/**
	 * Sets the coordinates of this mining form five delineation.
	 *
	 * @param coordinates the coordinates of this mining form five delineation
	 */
	public void setCoordinates(String coordinates);

	/**
	 * Returns the north side of this mining form five delineation.
	 *
	 * @return the north side of this mining form five delineation
	 */
	@AutoEscape
	public String getNorthSide();

	/**
	 * Sets the north side of this mining form five delineation.
	 *
	 * @param northSide the north side of this mining form five delineation
	 */
	public void setNorthSide(String northSide);

	/**
	 * Returns the east side of this mining form five delineation.
	 *
	 * @return the east side of this mining form five delineation
	 */
	@AutoEscape
	public String getEastSide();

	/**
	 * Sets the east side of this mining form five delineation.
	 *
	 * @param eastSide the east side of this mining form five delineation
	 */
	public void setEastSide(String eastSide);

	/**
	 * Returns the first north side of this mining form five delineation.
	 *
	 * @return the first north side of this mining form five delineation
	 */
	@AutoEscape
	public String getFirstNorthSide();

	/**
	 * Sets the first north side of this mining form five delineation.
	 *
	 * @param firstNorthSide the first north side of this mining form five delineation
	 */
	public void setFirstNorthSide(String firstNorthSide);

	/**
	 * Returns the first east side of this mining form five delineation.
	 *
	 * @return the first east side of this mining form five delineation
	 */
	@AutoEscape
	public String getFirstEastSide();

	/**
	 * Sets the first east side of this mining form five delineation.
	 *
	 * @param firstEastSide the first east side of this mining form five delineation
	 */
	public void setFirstEastSide(String firstEastSide);

	/**
	 * Returns the first location grid of this mining form five delineation.
	 *
	 * @return the first location grid of this mining form five delineation
	 */
	@AutoEscape
	public String getFirstLocationGrid();

	/**
	 * Sets the first location grid of this mining form five delineation.
	 *
	 * @param firstLocationGrid the first location grid of this mining form five delineation
	 */
	public void setFirstLocationGrid(String firstLocationGrid);

	/**
	 * Returns the first degrees of this mining form five delineation.
	 *
	 * @return the first degrees of this mining form five delineation
	 */
	@AutoEscape
	public String getFirstDegrees();

	/**
	 * Sets the first degrees of this mining form five delineation.
	 *
	 * @param firstDegrees the first degrees of this mining form five delineation
	 */
	public void setFirstDegrees(String firstDegrees);

	/**
	 * Returns the second north side of this mining form five delineation.
	 *
	 * @return the second north side of this mining form five delineation
	 */
	@AutoEscape
	public String getSecondNorthSide();

	/**
	 * Sets the second north side of this mining form five delineation.
	 *
	 * @param secondNorthSide the second north side of this mining form five delineation
	 */
	public void setSecondNorthSide(String secondNorthSide);

	/**
	 * Returns the second east side of this mining form five delineation.
	 *
	 * @return the second east side of this mining form five delineation
	 */
	@AutoEscape
	public String getSecondEastSide();

	/**
	 * Sets the second east side of this mining form five delineation.
	 *
	 * @param secondEastSide the second east side of this mining form five delineation
	 */
	public void setSecondEastSide(String secondEastSide);

	/**
	 * Returns the second location grid of this mining form five delineation.
	 *
	 * @return the second location grid of this mining form five delineation
	 */
	@AutoEscape
	public String getSecondLocationGrid();

	/**
	 * Sets the second location grid of this mining form five delineation.
	 *
	 * @param secondLocationGrid the second location grid of this mining form five delineation
	 */
	public void setSecondLocationGrid(String secondLocationGrid);

	/**
	 * Returns the second degrees of this mining form five delineation.
	 *
	 * @return the second degrees of this mining form five delineation
	 */
	@AutoEscape
	public String getSecondDegrees();

	/**
	 * Sets the second degrees of this mining form five delineation.
	 *
	 * @param secondDegrees the second degrees of this mining form five delineation
	 */
	public void setSecondDegrees(String secondDegrees);

	/**
	 * Returns the third coordinates of this mining form five delineation.
	 *
	 * @return the third coordinates of this mining form five delineation
	 */
	@AutoEscape
	public String getThirdCoordinates();

	/**
	 * Sets the third coordinates of this mining form five delineation.
	 *
	 * @param thirdCoordinates the third coordinates of this mining form five delineation
	 */
	public void setThirdCoordinates(String thirdCoordinates);

	/**
	 * Returns the third north side of this mining form five delineation.
	 *
	 * @return the third north side of this mining form five delineation
	 */
	@AutoEscape
	public String getThirdNorthSide();

	/**
	 * Sets the third north side of this mining form five delineation.
	 *
	 * @param thirdNorthSide the third north side of this mining form five delineation
	 */
	public void setThirdNorthSide(String thirdNorthSide);

	/**
	 * Returns the third east side of this mining form five delineation.
	 *
	 * @return the third east side of this mining form five delineation
	 */
	@AutoEscape
	public String getThirdEastSide();

	/**
	 * Sets the third east side of this mining form five delineation.
	 *
	 * @param thirdEastSide the third east side of this mining form five delineation
	 */
	public void setThirdEastSide(String thirdEastSide);

	/**
	 * Returns the third degrees of this mining form five delineation.
	 *
	 * @return the third degrees of this mining form five delineation
	 */
	@AutoEscape
	public String getThirdDegrees();

	/**
	 * Sets the third degrees of this mining form five delineation.
	 *
	 * @param thirdDegrees the third degrees of this mining form five delineation
	 */
	public void setThirdDegrees(String thirdDegrees);

	/**
	 * Returns the third grid loc of this mining form five delineation.
	 *
	 * @return the third grid loc of this mining form five delineation
	 */
	@AutoEscape
	public String getThirdGridLoc();

	/**
	 * Sets the third grid loc of this mining form five delineation.
	 *
	 * @param thirdGridLoc the third grid loc of this mining form five delineation
	 */
	public void setThirdGridLoc(String thirdGridLoc);

	/**
	 * Returns the third grid l of this mining form five delineation.
	 *
	 * @return the third grid l of this mining form five delineation
	 */
	@AutoEscape
	public String getThirdGridL();

	/**
	 * Sets the third grid l of this mining form five delineation.
	 *
	 * @param thirdGridL the third grid l of this mining form five delineation
	 */
	public void setThirdGridL(String thirdGridL);

	/**
	 * Returns the fourth coordinates of this mining form five delineation.
	 *
	 * @return the fourth coordinates of this mining form five delineation
	 */
	@AutoEscape
	public String getFourthCoordinates();

	/**
	 * Sets the fourth coordinates of this mining form five delineation.
	 *
	 * @param fourthCoordinates the fourth coordinates of this mining form five delineation
	 */
	public void setFourthCoordinates(String fourthCoordinates);

	/**
	 * Returns the fourth north side of this mining form five delineation.
	 *
	 * @return the fourth north side of this mining form five delineation
	 */
	@AutoEscape
	public String getFourthNorthSide();

	/**
	 * Sets the fourth north side of this mining form five delineation.
	 *
	 * @param fourthNorthSide the fourth north side of this mining form five delineation
	 */
	public void setFourthNorthSide(String fourthNorthSide);

	/**
	 * Returns the fourth east side of this mining form five delineation.
	 *
	 * @return the fourth east side of this mining form five delineation
	 */
	@AutoEscape
	public String getFourthEastSide();

	/**
	 * Sets the fourth east side of this mining form five delineation.
	 *
	 * @param fourthEastSide the fourth east side of this mining form five delineation
	 */
	public void setFourthEastSide(String fourthEastSide);

	/**
	 * Returns the fourth degrees of this mining form five delineation.
	 *
	 * @return the fourth degrees of this mining form five delineation
	 */
	@AutoEscape
	public String getFourthDegrees();

	/**
	 * Sets the fourth degrees of this mining form five delineation.
	 *
	 * @param fourthDegrees the fourth degrees of this mining form five delineation
	 */
	public void setFourthDegrees(String fourthDegrees);

	/**
	 * Returns the fourth grid loc of this mining form five delineation.
	 *
	 * @return the fourth grid loc of this mining form five delineation
	 */
	@AutoEscape
	public String getFourthGridLoc();

	/**
	 * Sets the fourth grid loc of this mining form five delineation.
	 *
	 * @param fourthGridLoc the fourth grid loc of this mining form five delineation
	 */
	public void setFourthGridLoc(String fourthGridLoc);

	/**
	 * Returns the fourth grid l of this mining form five delineation.
	 *
	 * @return the fourth grid l of this mining form five delineation
	 */
	@AutoEscape
	public String getFourthGridL();

	/**
	 * Sets the fourth grid l of this mining form five delineation.
	 *
	 * @param fourthGridL the fourth grid l of this mining form five delineation
	 */
	public void setFourthGridL(String fourthGridL);

	/**
	 * Returns the fifth coordinates of this mining form five delineation.
	 *
	 * @return the fifth coordinates of this mining form five delineation
	 */
	@AutoEscape
	public String getFifthCoordinates();

	/**
	 * Sets the fifth coordinates of this mining form five delineation.
	 *
	 * @param fifthCoordinates the fifth coordinates of this mining form five delineation
	 */
	public void setFifthCoordinates(String fifthCoordinates);

	/**
	 * Returns the fifth north side of this mining form five delineation.
	 *
	 * @return the fifth north side of this mining form five delineation
	 */
	@AutoEscape
	public String getFifthNorthSide();

	/**
	 * Sets the fifth north side of this mining form five delineation.
	 *
	 * @param fifthNorthSide the fifth north side of this mining form five delineation
	 */
	public void setFifthNorthSide(String fifthNorthSide);

	/**
	 * Returns the fifth east side of this mining form five delineation.
	 *
	 * @return the fifth east side of this mining form five delineation
	 */
	@AutoEscape
	public String getFifthEastSide();

	/**
	 * Sets the fifth east side of this mining form five delineation.
	 *
	 * @param fifthEastSide the fifth east side of this mining form five delineation
	 */
	public void setFifthEastSide(String fifthEastSide);

	/**
	 * Returns the fifth degrees of this mining form five delineation.
	 *
	 * @return the fifth degrees of this mining form five delineation
	 */
	@AutoEscape
	public String getFifthDegrees();

	/**
	 * Sets the fifth degrees of this mining form five delineation.
	 *
	 * @param fifthDegrees the fifth degrees of this mining form five delineation
	 */
	public void setFifthDegrees(String fifthDegrees);

	/**
	 * Returns the fifth grid loc of this mining form five delineation.
	 *
	 * @return the fifth grid loc of this mining form five delineation
	 */
	@AutoEscape
	public String getFifthGridLoc();

	/**
	 * Sets the fifth grid loc of this mining form five delineation.
	 *
	 * @param fifthGridLoc the fifth grid loc of this mining form five delineation
	 */
	public void setFifthGridLoc(String fifthGridLoc);

	/**
	 * Returns the fifth grid l of this mining form five delineation.
	 *
	 * @return the fifth grid l of this mining form five delineation
	 */
	@AutoEscape
	public String getFifthGridL();

	/**
	 * Sets the fifth grid l of this mining form five delineation.
	 *
	 * @param fifthGridL the fifth grid l of this mining form five delineation
	 */
	public void setFifthGridL(String fifthGridL);

	/**
	 * Returns the mining lease application ID of this mining form five delineation.
	 *
	 * @return the mining lease application ID of this mining form five delineation
	 */
	public long getMiningLeaseApplicationId();

	/**
	 * Sets the mining lease application ID of this mining form five delineation.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID of this mining form five delineation
	 */
	public void setMiningLeaseApplicationId(long miningLeaseApplicationId);

	@Override
	public MiningFormFiveDelineation cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}