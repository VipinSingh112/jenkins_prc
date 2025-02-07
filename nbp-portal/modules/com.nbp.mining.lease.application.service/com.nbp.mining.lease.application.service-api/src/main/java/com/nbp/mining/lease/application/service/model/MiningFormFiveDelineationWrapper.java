/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MiningFormFiveDelineation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningFormFiveDelineation
 * @generated
 */
public class MiningFormFiveDelineationWrapper
	extends BaseModelWrapper<MiningFormFiveDelineation>
	implements MiningFormFiveDelineation,
			   ModelWrapper<MiningFormFiveDelineation> {

	public MiningFormFiveDelineationWrapper(
		MiningFormFiveDelineation miningFormFiveDelineation) {

		super(miningFormFiveDelineation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"miningFormFiveDelineationId", getMiningFormFiveDelineationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("approximatelyArea", getApproximatelyArea());
		attributes.put("location", getLocation());
		attributes.put("coordinates", getCoordinates());
		attributes.put("northSide", getNorthSide());
		attributes.put("eastSide", getEastSide());
		attributes.put("firstNorthSide", getFirstNorthSide());
		attributes.put("firstEastSide", getFirstEastSide());
		attributes.put("firstLocationGrid", getFirstLocationGrid());
		attributes.put("firstDegrees", getFirstDegrees());
		attributes.put("secondNorthSide", getSecondNorthSide());
		attributes.put("secondEastSide", getSecondEastSide());
		attributes.put("secondLocationGrid", getSecondLocationGrid());
		attributes.put("secondDegrees", getSecondDegrees());
		attributes.put("thirdCoordinates", getThirdCoordinates());
		attributes.put("thirdNorthSide", getThirdNorthSide());
		attributes.put("thirdEastSide", getThirdEastSide());
		attributes.put("thirdDegrees", getThirdDegrees());
		attributes.put("thirdGridLoc", getThirdGridLoc());
		attributes.put("thirdGridL", getThirdGridL());
		attributes.put("fourthCoordinates", getFourthCoordinates());
		attributes.put("fourthNorthSide", getFourthNorthSide());
		attributes.put("fourthEastSide", getFourthEastSide());
		attributes.put("fourthDegrees", getFourthDegrees());
		attributes.put("fourthGridLoc", getFourthGridLoc());
		attributes.put("fourthGridL", getFourthGridL());
		attributes.put("fifthCoordinates", getFifthCoordinates());
		attributes.put("fifthNorthSide", getFifthNorthSide());
		attributes.put("fifthEastSide", getFifthEastSide());
		attributes.put("fifthDegrees", getFifthDegrees());
		attributes.put("fifthGridLoc", getFifthGridLoc());
		attributes.put("fifthGridL", getFifthGridL());
		attributes.put(
			"miningLeaseApplicationId", getMiningLeaseApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long miningFormFiveDelineationId = (Long)attributes.get(
			"miningFormFiveDelineationId");

		if (miningFormFiveDelineationId != null) {
			setMiningFormFiveDelineationId(miningFormFiveDelineationId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String approximatelyArea = (String)attributes.get("approximatelyArea");

		if (approximatelyArea != null) {
			setApproximatelyArea(approximatelyArea);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String coordinates = (String)attributes.get("coordinates");

		if (coordinates != null) {
			setCoordinates(coordinates);
		}

		String northSide = (String)attributes.get("northSide");

		if (northSide != null) {
			setNorthSide(northSide);
		}

		String eastSide = (String)attributes.get("eastSide");

		if (eastSide != null) {
			setEastSide(eastSide);
		}

		String firstNorthSide = (String)attributes.get("firstNorthSide");

		if (firstNorthSide != null) {
			setFirstNorthSide(firstNorthSide);
		}

		String firstEastSide = (String)attributes.get("firstEastSide");

		if (firstEastSide != null) {
			setFirstEastSide(firstEastSide);
		}

		String firstLocationGrid = (String)attributes.get("firstLocationGrid");

		if (firstLocationGrid != null) {
			setFirstLocationGrid(firstLocationGrid);
		}

		String firstDegrees = (String)attributes.get("firstDegrees");

		if (firstDegrees != null) {
			setFirstDegrees(firstDegrees);
		}

		String secondNorthSide = (String)attributes.get("secondNorthSide");

		if (secondNorthSide != null) {
			setSecondNorthSide(secondNorthSide);
		}

		String secondEastSide = (String)attributes.get("secondEastSide");

		if (secondEastSide != null) {
			setSecondEastSide(secondEastSide);
		}

		String secondLocationGrid = (String)attributes.get(
			"secondLocationGrid");

		if (secondLocationGrid != null) {
			setSecondLocationGrid(secondLocationGrid);
		}

		String secondDegrees = (String)attributes.get("secondDegrees");

		if (secondDegrees != null) {
			setSecondDegrees(secondDegrees);
		}

		String thirdCoordinates = (String)attributes.get("thirdCoordinates");

		if (thirdCoordinates != null) {
			setThirdCoordinates(thirdCoordinates);
		}

		String thirdNorthSide = (String)attributes.get("thirdNorthSide");

		if (thirdNorthSide != null) {
			setThirdNorthSide(thirdNorthSide);
		}

		String thirdEastSide = (String)attributes.get("thirdEastSide");

		if (thirdEastSide != null) {
			setThirdEastSide(thirdEastSide);
		}

		String thirdDegrees = (String)attributes.get("thirdDegrees");

		if (thirdDegrees != null) {
			setThirdDegrees(thirdDegrees);
		}

		String thirdGridLoc = (String)attributes.get("thirdGridLoc");

		if (thirdGridLoc != null) {
			setThirdGridLoc(thirdGridLoc);
		}

		String thirdGridL = (String)attributes.get("thirdGridL");

		if (thirdGridL != null) {
			setThirdGridL(thirdGridL);
		}

		String fourthCoordinates = (String)attributes.get("fourthCoordinates");

		if (fourthCoordinates != null) {
			setFourthCoordinates(fourthCoordinates);
		}

		String fourthNorthSide = (String)attributes.get("fourthNorthSide");

		if (fourthNorthSide != null) {
			setFourthNorthSide(fourthNorthSide);
		}

		String fourthEastSide = (String)attributes.get("fourthEastSide");

		if (fourthEastSide != null) {
			setFourthEastSide(fourthEastSide);
		}

		String fourthDegrees = (String)attributes.get("fourthDegrees");

		if (fourthDegrees != null) {
			setFourthDegrees(fourthDegrees);
		}

		String fourthGridLoc = (String)attributes.get("fourthGridLoc");

		if (fourthGridLoc != null) {
			setFourthGridLoc(fourthGridLoc);
		}

		String fourthGridL = (String)attributes.get("fourthGridL");

		if (fourthGridL != null) {
			setFourthGridL(fourthGridL);
		}

		String fifthCoordinates = (String)attributes.get("fifthCoordinates");

		if (fifthCoordinates != null) {
			setFifthCoordinates(fifthCoordinates);
		}

		String fifthNorthSide = (String)attributes.get("fifthNorthSide");

		if (fifthNorthSide != null) {
			setFifthNorthSide(fifthNorthSide);
		}

		String fifthEastSide = (String)attributes.get("fifthEastSide");

		if (fifthEastSide != null) {
			setFifthEastSide(fifthEastSide);
		}

		String fifthDegrees = (String)attributes.get("fifthDegrees");

		if (fifthDegrees != null) {
			setFifthDegrees(fifthDegrees);
		}

		String fifthGridLoc = (String)attributes.get("fifthGridLoc");

		if (fifthGridLoc != null) {
			setFifthGridLoc(fifthGridLoc);
		}

		String fifthGridL = (String)attributes.get("fifthGridL");

		if (fifthGridL != null) {
			setFifthGridL(fifthGridL);
		}

		Long miningLeaseApplicationId = (Long)attributes.get(
			"miningLeaseApplicationId");

		if (miningLeaseApplicationId != null) {
			setMiningLeaseApplicationId(miningLeaseApplicationId);
		}
	}

	@Override
	public MiningFormFiveDelineation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the approximately area of this mining form five delineation.
	 *
	 * @return the approximately area of this mining form five delineation
	 */
	@Override
	public String getApproximatelyArea() {
		return model.getApproximatelyArea();
	}

	/**
	 * Returns the company ID of this mining form five delineation.
	 *
	 * @return the company ID of this mining form five delineation
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the coordinates of this mining form five delineation.
	 *
	 * @return the coordinates of this mining form five delineation
	 */
	@Override
	public String getCoordinates() {
		return model.getCoordinates();
	}

	/**
	 * Returns the create date of this mining form five delineation.
	 *
	 * @return the create date of this mining form five delineation
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the east side of this mining form five delineation.
	 *
	 * @return the east side of this mining form five delineation
	 */
	@Override
	public String getEastSide() {
		return model.getEastSide();
	}

	/**
	 * Returns the fifth coordinates of this mining form five delineation.
	 *
	 * @return the fifth coordinates of this mining form five delineation
	 */
	@Override
	public String getFifthCoordinates() {
		return model.getFifthCoordinates();
	}

	/**
	 * Returns the fifth degrees of this mining form five delineation.
	 *
	 * @return the fifth degrees of this mining form five delineation
	 */
	@Override
	public String getFifthDegrees() {
		return model.getFifthDegrees();
	}

	/**
	 * Returns the fifth east side of this mining form five delineation.
	 *
	 * @return the fifth east side of this mining form five delineation
	 */
	@Override
	public String getFifthEastSide() {
		return model.getFifthEastSide();
	}

	/**
	 * Returns the fifth grid l of this mining form five delineation.
	 *
	 * @return the fifth grid l of this mining form five delineation
	 */
	@Override
	public String getFifthGridL() {
		return model.getFifthGridL();
	}

	/**
	 * Returns the fifth grid loc of this mining form five delineation.
	 *
	 * @return the fifth grid loc of this mining form five delineation
	 */
	@Override
	public String getFifthGridLoc() {
		return model.getFifthGridLoc();
	}

	/**
	 * Returns the fifth north side of this mining form five delineation.
	 *
	 * @return the fifth north side of this mining form five delineation
	 */
	@Override
	public String getFifthNorthSide() {
		return model.getFifthNorthSide();
	}

	/**
	 * Returns the first degrees of this mining form five delineation.
	 *
	 * @return the first degrees of this mining form five delineation
	 */
	@Override
	public String getFirstDegrees() {
		return model.getFirstDegrees();
	}

	/**
	 * Returns the first east side of this mining form five delineation.
	 *
	 * @return the first east side of this mining form five delineation
	 */
	@Override
	public String getFirstEastSide() {
		return model.getFirstEastSide();
	}

	/**
	 * Returns the first location grid of this mining form five delineation.
	 *
	 * @return the first location grid of this mining form five delineation
	 */
	@Override
	public String getFirstLocationGrid() {
		return model.getFirstLocationGrid();
	}

	/**
	 * Returns the first north side of this mining form five delineation.
	 *
	 * @return the first north side of this mining form five delineation
	 */
	@Override
	public String getFirstNorthSide() {
		return model.getFirstNorthSide();
	}

	/**
	 * Returns the fourth coordinates of this mining form five delineation.
	 *
	 * @return the fourth coordinates of this mining form five delineation
	 */
	@Override
	public String getFourthCoordinates() {
		return model.getFourthCoordinates();
	}

	/**
	 * Returns the fourth degrees of this mining form five delineation.
	 *
	 * @return the fourth degrees of this mining form five delineation
	 */
	@Override
	public String getFourthDegrees() {
		return model.getFourthDegrees();
	}

	/**
	 * Returns the fourth east side of this mining form five delineation.
	 *
	 * @return the fourth east side of this mining form five delineation
	 */
	@Override
	public String getFourthEastSide() {
		return model.getFourthEastSide();
	}

	/**
	 * Returns the fourth grid l of this mining form five delineation.
	 *
	 * @return the fourth grid l of this mining form five delineation
	 */
	@Override
	public String getFourthGridL() {
		return model.getFourthGridL();
	}

	/**
	 * Returns the fourth grid loc of this mining form five delineation.
	 *
	 * @return the fourth grid loc of this mining form five delineation
	 */
	@Override
	public String getFourthGridLoc() {
		return model.getFourthGridLoc();
	}

	/**
	 * Returns the fourth north side of this mining form five delineation.
	 *
	 * @return the fourth north side of this mining form five delineation
	 */
	@Override
	public String getFourthNorthSide() {
		return model.getFourthNorthSide();
	}

	/**
	 * Returns the group ID of this mining form five delineation.
	 *
	 * @return the group ID of this mining form five delineation
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the location of this mining form five delineation.
	 *
	 * @return the location of this mining form five delineation
	 */
	@Override
	public String getLocation() {
		return model.getLocation();
	}

	/**
	 * Returns the mining form five delineation ID of this mining form five delineation.
	 *
	 * @return the mining form five delineation ID of this mining form five delineation
	 */
	@Override
	public long getMiningFormFiveDelineationId() {
		return model.getMiningFormFiveDelineationId();
	}

	/**
	 * Returns the mining lease application ID of this mining form five delineation.
	 *
	 * @return the mining lease application ID of this mining form five delineation
	 */
	@Override
	public long getMiningLeaseApplicationId() {
		return model.getMiningLeaseApplicationId();
	}

	/**
	 * Returns the modified date of this mining form five delineation.
	 *
	 * @return the modified date of this mining form five delineation
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the north side of this mining form five delineation.
	 *
	 * @return the north side of this mining form five delineation
	 */
	@Override
	public String getNorthSide() {
		return model.getNorthSide();
	}

	/**
	 * Returns the primary key of this mining form five delineation.
	 *
	 * @return the primary key of this mining form five delineation
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the second degrees of this mining form five delineation.
	 *
	 * @return the second degrees of this mining form five delineation
	 */
	@Override
	public String getSecondDegrees() {
		return model.getSecondDegrees();
	}

	/**
	 * Returns the second east side of this mining form five delineation.
	 *
	 * @return the second east side of this mining form five delineation
	 */
	@Override
	public String getSecondEastSide() {
		return model.getSecondEastSide();
	}

	/**
	 * Returns the second location grid of this mining form five delineation.
	 *
	 * @return the second location grid of this mining form five delineation
	 */
	@Override
	public String getSecondLocationGrid() {
		return model.getSecondLocationGrid();
	}

	/**
	 * Returns the second north side of this mining form five delineation.
	 *
	 * @return the second north side of this mining form five delineation
	 */
	@Override
	public String getSecondNorthSide() {
		return model.getSecondNorthSide();
	}

	/**
	 * Returns the third coordinates of this mining form five delineation.
	 *
	 * @return the third coordinates of this mining form five delineation
	 */
	@Override
	public String getThirdCoordinates() {
		return model.getThirdCoordinates();
	}

	/**
	 * Returns the third degrees of this mining form five delineation.
	 *
	 * @return the third degrees of this mining form five delineation
	 */
	@Override
	public String getThirdDegrees() {
		return model.getThirdDegrees();
	}

	/**
	 * Returns the third east side of this mining form five delineation.
	 *
	 * @return the third east side of this mining form five delineation
	 */
	@Override
	public String getThirdEastSide() {
		return model.getThirdEastSide();
	}

	/**
	 * Returns the third grid l of this mining form five delineation.
	 *
	 * @return the third grid l of this mining form five delineation
	 */
	@Override
	public String getThirdGridL() {
		return model.getThirdGridL();
	}

	/**
	 * Returns the third grid loc of this mining form five delineation.
	 *
	 * @return the third grid loc of this mining form five delineation
	 */
	@Override
	public String getThirdGridLoc() {
		return model.getThirdGridLoc();
	}

	/**
	 * Returns the third north side of this mining form five delineation.
	 *
	 * @return the third north side of this mining form five delineation
	 */
	@Override
	public String getThirdNorthSide() {
		return model.getThirdNorthSide();
	}

	/**
	 * Returns the user ID of this mining form five delineation.
	 *
	 * @return the user ID of this mining form five delineation
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this mining form five delineation.
	 *
	 * @return the user name of this mining form five delineation
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this mining form five delineation.
	 *
	 * @return the user uuid of this mining form five delineation
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the approximately area of this mining form five delineation.
	 *
	 * @param approximatelyArea the approximately area of this mining form five delineation
	 */
	@Override
	public void setApproximatelyArea(String approximatelyArea) {
		model.setApproximatelyArea(approximatelyArea);
	}

	/**
	 * Sets the company ID of this mining form five delineation.
	 *
	 * @param companyId the company ID of this mining form five delineation
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the coordinates of this mining form five delineation.
	 *
	 * @param coordinates the coordinates of this mining form five delineation
	 */
	@Override
	public void setCoordinates(String coordinates) {
		model.setCoordinates(coordinates);
	}

	/**
	 * Sets the create date of this mining form five delineation.
	 *
	 * @param createDate the create date of this mining form five delineation
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the east side of this mining form five delineation.
	 *
	 * @param eastSide the east side of this mining form five delineation
	 */
	@Override
	public void setEastSide(String eastSide) {
		model.setEastSide(eastSide);
	}

	/**
	 * Sets the fifth coordinates of this mining form five delineation.
	 *
	 * @param fifthCoordinates the fifth coordinates of this mining form five delineation
	 */
	@Override
	public void setFifthCoordinates(String fifthCoordinates) {
		model.setFifthCoordinates(fifthCoordinates);
	}

	/**
	 * Sets the fifth degrees of this mining form five delineation.
	 *
	 * @param fifthDegrees the fifth degrees of this mining form five delineation
	 */
	@Override
	public void setFifthDegrees(String fifthDegrees) {
		model.setFifthDegrees(fifthDegrees);
	}

	/**
	 * Sets the fifth east side of this mining form five delineation.
	 *
	 * @param fifthEastSide the fifth east side of this mining form five delineation
	 */
	@Override
	public void setFifthEastSide(String fifthEastSide) {
		model.setFifthEastSide(fifthEastSide);
	}

	/**
	 * Sets the fifth grid l of this mining form five delineation.
	 *
	 * @param fifthGridL the fifth grid l of this mining form five delineation
	 */
	@Override
	public void setFifthGridL(String fifthGridL) {
		model.setFifthGridL(fifthGridL);
	}

	/**
	 * Sets the fifth grid loc of this mining form five delineation.
	 *
	 * @param fifthGridLoc the fifth grid loc of this mining form five delineation
	 */
	@Override
	public void setFifthGridLoc(String fifthGridLoc) {
		model.setFifthGridLoc(fifthGridLoc);
	}

	/**
	 * Sets the fifth north side of this mining form five delineation.
	 *
	 * @param fifthNorthSide the fifth north side of this mining form five delineation
	 */
	@Override
	public void setFifthNorthSide(String fifthNorthSide) {
		model.setFifthNorthSide(fifthNorthSide);
	}

	/**
	 * Sets the first degrees of this mining form five delineation.
	 *
	 * @param firstDegrees the first degrees of this mining form five delineation
	 */
	@Override
	public void setFirstDegrees(String firstDegrees) {
		model.setFirstDegrees(firstDegrees);
	}

	/**
	 * Sets the first east side of this mining form five delineation.
	 *
	 * @param firstEastSide the first east side of this mining form five delineation
	 */
	@Override
	public void setFirstEastSide(String firstEastSide) {
		model.setFirstEastSide(firstEastSide);
	}

	/**
	 * Sets the first location grid of this mining form five delineation.
	 *
	 * @param firstLocationGrid the first location grid of this mining form five delineation
	 */
	@Override
	public void setFirstLocationGrid(String firstLocationGrid) {
		model.setFirstLocationGrid(firstLocationGrid);
	}

	/**
	 * Sets the first north side of this mining form five delineation.
	 *
	 * @param firstNorthSide the first north side of this mining form five delineation
	 */
	@Override
	public void setFirstNorthSide(String firstNorthSide) {
		model.setFirstNorthSide(firstNorthSide);
	}

	/**
	 * Sets the fourth coordinates of this mining form five delineation.
	 *
	 * @param fourthCoordinates the fourth coordinates of this mining form five delineation
	 */
	@Override
	public void setFourthCoordinates(String fourthCoordinates) {
		model.setFourthCoordinates(fourthCoordinates);
	}

	/**
	 * Sets the fourth degrees of this mining form five delineation.
	 *
	 * @param fourthDegrees the fourth degrees of this mining form five delineation
	 */
	@Override
	public void setFourthDegrees(String fourthDegrees) {
		model.setFourthDegrees(fourthDegrees);
	}

	/**
	 * Sets the fourth east side of this mining form five delineation.
	 *
	 * @param fourthEastSide the fourth east side of this mining form five delineation
	 */
	@Override
	public void setFourthEastSide(String fourthEastSide) {
		model.setFourthEastSide(fourthEastSide);
	}

	/**
	 * Sets the fourth grid l of this mining form five delineation.
	 *
	 * @param fourthGridL the fourth grid l of this mining form five delineation
	 */
	@Override
	public void setFourthGridL(String fourthGridL) {
		model.setFourthGridL(fourthGridL);
	}

	/**
	 * Sets the fourth grid loc of this mining form five delineation.
	 *
	 * @param fourthGridLoc the fourth grid loc of this mining form five delineation
	 */
	@Override
	public void setFourthGridLoc(String fourthGridLoc) {
		model.setFourthGridLoc(fourthGridLoc);
	}

	/**
	 * Sets the fourth north side of this mining form five delineation.
	 *
	 * @param fourthNorthSide the fourth north side of this mining form five delineation
	 */
	@Override
	public void setFourthNorthSide(String fourthNorthSide) {
		model.setFourthNorthSide(fourthNorthSide);
	}

	/**
	 * Sets the group ID of this mining form five delineation.
	 *
	 * @param groupId the group ID of this mining form five delineation
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the location of this mining form five delineation.
	 *
	 * @param location the location of this mining form five delineation
	 */
	@Override
	public void setLocation(String location) {
		model.setLocation(location);
	}

	/**
	 * Sets the mining form five delineation ID of this mining form five delineation.
	 *
	 * @param miningFormFiveDelineationId the mining form five delineation ID of this mining form five delineation
	 */
	@Override
	public void setMiningFormFiveDelineationId(
		long miningFormFiveDelineationId) {

		model.setMiningFormFiveDelineationId(miningFormFiveDelineationId);
	}

	/**
	 * Sets the mining lease application ID of this mining form five delineation.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID of this mining form five delineation
	 */
	@Override
	public void setMiningLeaseApplicationId(long miningLeaseApplicationId) {
		model.setMiningLeaseApplicationId(miningLeaseApplicationId);
	}

	/**
	 * Sets the modified date of this mining form five delineation.
	 *
	 * @param modifiedDate the modified date of this mining form five delineation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the north side of this mining form five delineation.
	 *
	 * @param northSide the north side of this mining form five delineation
	 */
	@Override
	public void setNorthSide(String northSide) {
		model.setNorthSide(northSide);
	}

	/**
	 * Sets the primary key of this mining form five delineation.
	 *
	 * @param primaryKey the primary key of this mining form five delineation
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the second degrees of this mining form five delineation.
	 *
	 * @param secondDegrees the second degrees of this mining form five delineation
	 */
	@Override
	public void setSecondDegrees(String secondDegrees) {
		model.setSecondDegrees(secondDegrees);
	}

	/**
	 * Sets the second east side of this mining form five delineation.
	 *
	 * @param secondEastSide the second east side of this mining form five delineation
	 */
	@Override
	public void setSecondEastSide(String secondEastSide) {
		model.setSecondEastSide(secondEastSide);
	}

	/**
	 * Sets the second location grid of this mining form five delineation.
	 *
	 * @param secondLocationGrid the second location grid of this mining form five delineation
	 */
	@Override
	public void setSecondLocationGrid(String secondLocationGrid) {
		model.setSecondLocationGrid(secondLocationGrid);
	}

	/**
	 * Sets the second north side of this mining form five delineation.
	 *
	 * @param secondNorthSide the second north side of this mining form five delineation
	 */
	@Override
	public void setSecondNorthSide(String secondNorthSide) {
		model.setSecondNorthSide(secondNorthSide);
	}

	/**
	 * Sets the third coordinates of this mining form five delineation.
	 *
	 * @param thirdCoordinates the third coordinates of this mining form five delineation
	 */
	@Override
	public void setThirdCoordinates(String thirdCoordinates) {
		model.setThirdCoordinates(thirdCoordinates);
	}

	/**
	 * Sets the third degrees of this mining form five delineation.
	 *
	 * @param thirdDegrees the third degrees of this mining form five delineation
	 */
	@Override
	public void setThirdDegrees(String thirdDegrees) {
		model.setThirdDegrees(thirdDegrees);
	}

	/**
	 * Sets the third east side of this mining form five delineation.
	 *
	 * @param thirdEastSide the third east side of this mining form five delineation
	 */
	@Override
	public void setThirdEastSide(String thirdEastSide) {
		model.setThirdEastSide(thirdEastSide);
	}

	/**
	 * Sets the third grid l of this mining form five delineation.
	 *
	 * @param thirdGridL the third grid l of this mining form five delineation
	 */
	@Override
	public void setThirdGridL(String thirdGridL) {
		model.setThirdGridL(thirdGridL);
	}

	/**
	 * Sets the third grid loc of this mining form five delineation.
	 *
	 * @param thirdGridLoc the third grid loc of this mining form five delineation
	 */
	@Override
	public void setThirdGridLoc(String thirdGridLoc) {
		model.setThirdGridLoc(thirdGridLoc);
	}

	/**
	 * Sets the third north side of this mining form five delineation.
	 *
	 * @param thirdNorthSide the third north side of this mining form five delineation
	 */
	@Override
	public void setThirdNorthSide(String thirdNorthSide) {
		model.setThirdNorthSide(thirdNorthSide);
	}

	/**
	 * Sets the user ID of this mining form five delineation.
	 *
	 * @param userId the user ID of this mining form five delineation
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this mining form five delineation.
	 *
	 * @param userName the user name of this mining form five delineation
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this mining form five delineation.
	 *
	 * @param userUuid the user uuid of this mining form five delineation
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected MiningFormFiveDelineationWrapper wrap(
		MiningFormFiveDelineation miningFormFiveDelineation) {

		return new MiningFormFiveDelineationWrapper(miningFormFiveDelineation);
	}

}