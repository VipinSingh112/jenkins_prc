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
 * This class is a wrapper for {@link MiningProspectingLicense}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingLicense
 * @generated
 */
public class MiningProspectingLicenseWrapper
	extends BaseModelWrapper<MiningProspectingLicense>
	implements MiningProspectingLicense,
			   ModelWrapper<MiningProspectingLicense> {

	public MiningProspectingLicenseWrapper(
		MiningProspectingLicense miningProspectingLicense) {

		super(miningProspectingLicense);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"miningProspectingLicenseId", getMiningProspectingLicenseId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nameOfApplicant", getNameOfApplicant());
		attributes.put("trnNumber", getTrnNumber());
		attributes.put("nationalityOfApplicant", getNationalityOfApplicant());
		attributes.put("addressInJamaica", getAddressInJamaica());
		attributes.put("telephoneNumber", getTelephoneNumber());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("numberOfApplicant", getNumberOfApplicant());
		attributes.put("nameOfTheAgent", getNameOfTheAgent());
		attributes.put("numberOfThisProspecting", getNumberOfThisProspecting());
		attributes.put("prospectingRight", getProspectingRight());
		attributes.put("parish", getParish());
		attributes.put("licence", getLicence());
		attributes.put("stateTheNearestLandmark", getStateTheNearestLandmark());
		attributes.put("approximateArea", getApproximateArea());
		attributes.put(
			"mineralForWhichApplicant", getMineralForWhichApplicant());
		attributes.put("copyOfArticle", getCopyOfArticle());
		attributes.put("dateUponTheLocation", getDateUponTheLocation());
		attributes.put("proslicenceFeeCheck", getProslicenceFeeCheck());
		attributes.put("dateSurrender", getDateSurrender());
		attributes.put("areaOfApproximately", getAreaOfApproximately());
		attributes.put("locationBeacon", getLocationBeacon());
		attributes.put("intersectionCoordinates", getIntersectionCoordinates());
		attributes.put("northTopographical", getNorthTopographical());
		attributes.put("eastTopographical", getEastTopographical());
		attributes.put("firstCornerOfNorth", getFirstCornerOfNorth());
		attributes.put("firstCornerOfEast", getFirstCornerOfEast());
		attributes.put(
			"firstCornerApproximateMeter", getFirstCornerApproximateMeter());
		attributes.put(
			"firstCornerApproximateDegree", getFirstCornerApproximateDegree());
		attributes.put("secondCornerOfNorth", getSecondCornerOfNorth());
		attributes.put("secondCornerOfEast", getSecondCornerOfEast());
		attributes.put(
			"secondCornerApproximateMeter", getSecondCornerApproximateMeter());
		attributes.put(
			"secondCornerApproximateDegree",
			getSecondCornerApproximateDegree());
		attributes.put("thirdCornerOfNorth", getThirdCornerOfNorth());
		attributes.put("thirdCornerOfEast", getThirdCornerOfEast());
		attributes.put(
			"thirdCornerApproximateMeter", getThirdCornerApproximateMeter());
		attributes.put(
			"thirdCornerApproximateDegree", getThirdCornerApproximateDegree());
		attributes.put("fourthCornerOfNorth", getFourthCornerOfNorth());
		attributes.put("fourthCornerOfEast", getFourthCornerOfEast());
		attributes.put(
			"fourthCornerApproximateMeter", getFourthCornerApproximateMeter());
		attributes.put(
			"fourthCornerApproximateDegree",
			getFourthCornerApproximateDegree());
		attributes.put("fifthCornerOfNorth", getFifthCornerOfNorth());
		attributes.put("fifthCornerOfEast", getFifthCornerOfEast());
		attributes.put(
			"fifthCornerApproximateMeter", getFifthCornerApproximateMeter());
		attributes.put(
			"fifthCornerApproximateDegree", getFifthCornerApproximateDegree());
		attributes.put(
			"miningLeaseApplicationId", getMiningLeaseApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long miningProspectingLicenseId = (Long)attributes.get(
			"miningProspectingLicenseId");

		if (miningProspectingLicenseId != null) {
			setMiningProspectingLicenseId(miningProspectingLicenseId);
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

		String nameOfApplicant = (String)attributes.get("nameOfApplicant");

		if (nameOfApplicant != null) {
			setNameOfApplicant(nameOfApplicant);
		}

		String trnNumber = (String)attributes.get("trnNumber");

		if (trnNumber != null) {
			setTrnNumber(trnNumber);
		}

		String nationalityOfApplicant = (String)attributes.get(
			"nationalityOfApplicant");

		if (nationalityOfApplicant != null) {
			setNationalityOfApplicant(nationalityOfApplicant);
		}

		String addressInJamaica = (String)attributes.get("addressInJamaica");

		if (addressInJamaica != null) {
			setAddressInJamaica(addressInJamaica);
		}

		String telephoneNumber = (String)attributes.get("telephoneNumber");

		if (telephoneNumber != null) {
			setTelephoneNumber(telephoneNumber);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String numberOfApplicant = (String)attributes.get("numberOfApplicant");

		if (numberOfApplicant != null) {
			setNumberOfApplicant(numberOfApplicant);
		}

		String nameOfTheAgent = (String)attributes.get("nameOfTheAgent");

		if (nameOfTheAgent != null) {
			setNameOfTheAgent(nameOfTheAgent);
		}

		String numberOfThisProspecting = (String)attributes.get(
			"numberOfThisProspecting");

		if (numberOfThisProspecting != null) {
			setNumberOfThisProspecting(numberOfThisProspecting);
		}

		String prospectingRight = (String)attributes.get("prospectingRight");

		if (prospectingRight != null) {
			setProspectingRight(prospectingRight);
		}

		String parish = (String)attributes.get("parish");

		if (parish != null) {
			setParish(parish);
		}

		String licence = (String)attributes.get("licence");

		if (licence != null) {
			setLicence(licence);
		}

		String stateTheNearestLandmark = (String)attributes.get(
			"stateTheNearestLandmark");

		if (stateTheNearestLandmark != null) {
			setStateTheNearestLandmark(stateTheNearestLandmark);
		}

		String approximateArea = (String)attributes.get("approximateArea");

		if (approximateArea != null) {
			setApproximateArea(approximateArea);
		}

		String mineralForWhichApplicant = (String)attributes.get(
			"mineralForWhichApplicant");

		if (mineralForWhichApplicant != null) {
			setMineralForWhichApplicant(mineralForWhichApplicant);
		}

		String copyOfArticle = (String)attributes.get("copyOfArticle");

		if (copyOfArticle != null) {
			setCopyOfArticle(copyOfArticle);
		}

		Date dateUponTheLocation = (Date)attributes.get("dateUponTheLocation");

		if (dateUponTheLocation != null) {
			setDateUponTheLocation(dateUponTheLocation);
		}

		String proslicenceFeeCheck = (String)attributes.get(
			"proslicenceFeeCheck");

		if (proslicenceFeeCheck != null) {
			setProslicenceFeeCheck(proslicenceFeeCheck);
		}

		Date dateSurrender = (Date)attributes.get("dateSurrender");

		if (dateSurrender != null) {
			setDateSurrender(dateSurrender);
		}

		String areaOfApproximately = (String)attributes.get(
			"areaOfApproximately");

		if (areaOfApproximately != null) {
			setAreaOfApproximately(areaOfApproximately);
		}

		String locationBeacon = (String)attributes.get("locationBeacon");

		if (locationBeacon != null) {
			setLocationBeacon(locationBeacon);
		}

		String intersectionCoordinates = (String)attributes.get(
			"intersectionCoordinates");

		if (intersectionCoordinates != null) {
			setIntersectionCoordinates(intersectionCoordinates);
		}

		String northTopographical = (String)attributes.get(
			"northTopographical");

		if (northTopographical != null) {
			setNorthTopographical(northTopographical);
		}

		String eastTopographical = (String)attributes.get("eastTopographical");

		if (eastTopographical != null) {
			setEastTopographical(eastTopographical);
		}

		String firstCornerOfNorth = (String)attributes.get(
			"firstCornerOfNorth");

		if (firstCornerOfNorth != null) {
			setFirstCornerOfNorth(firstCornerOfNorth);
		}

		String firstCornerOfEast = (String)attributes.get("firstCornerOfEast");

		if (firstCornerOfEast != null) {
			setFirstCornerOfEast(firstCornerOfEast);
		}

		String firstCornerApproximateMeter = (String)attributes.get(
			"firstCornerApproximateMeter");

		if (firstCornerApproximateMeter != null) {
			setFirstCornerApproximateMeter(firstCornerApproximateMeter);
		}

		String firstCornerApproximateDegree = (String)attributes.get(
			"firstCornerApproximateDegree");

		if (firstCornerApproximateDegree != null) {
			setFirstCornerApproximateDegree(firstCornerApproximateDegree);
		}

		String secondCornerOfNorth = (String)attributes.get(
			"secondCornerOfNorth");

		if (secondCornerOfNorth != null) {
			setSecondCornerOfNorth(secondCornerOfNorth);
		}

		String secondCornerOfEast = (String)attributes.get(
			"secondCornerOfEast");

		if (secondCornerOfEast != null) {
			setSecondCornerOfEast(secondCornerOfEast);
		}

		String secondCornerApproximateMeter = (String)attributes.get(
			"secondCornerApproximateMeter");

		if (secondCornerApproximateMeter != null) {
			setSecondCornerApproximateMeter(secondCornerApproximateMeter);
		}

		String secondCornerApproximateDegree = (String)attributes.get(
			"secondCornerApproximateDegree");

		if (secondCornerApproximateDegree != null) {
			setSecondCornerApproximateDegree(secondCornerApproximateDegree);
		}

		String thirdCornerOfNorth = (String)attributes.get(
			"thirdCornerOfNorth");

		if (thirdCornerOfNorth != null) {
			setThirdCornerOfNorth(thirdCornerOfNorth);
		}

		String thirdCornerOfEast = (String)attributes.get("thirdCornerOfEast");

		if (thirdCornerOfEast != null) {
			setThirdCornerOfEast(thirdCornerOfEast);
		}

		String thirdCornerApproximateMeter = (String)attributes.get(
			"thirdCornerApproximateMeter");

		if (thirdCornerApproximateMeter != null) {
			setThirdCornerApproximateMeter(thirdCornerApproximateMeter);
		}

		String thirdCornerApproximateDegree = (String)attributes.get(
			"thirdCornerApproximateDegree");

		if (thirdCornerApproximateDegree != null) {
			setThirdCornerApproximateDegree(thirdCornerApproximateDegree);
		}

		String fourthCornerOfNorth = (String)attributes.get(
			"fourthCornerOfNorth");

		if (fourthCornerOfNorth != null) {
			setFourthCornerOfNorth(fourthCornerOfNorth);
		}

		String fourthCornerOfEast = (String)attributes.get(
			"fourthCornerOfEast");

		if (fourthCornerOfEast != null) {
			setFourthCornerOfEast(fourthCornerOfEast);
		}

		String fourthCornerApproximateMeter = (String)attributes.get(
			"fourthCornerApproximateMeter");

		if (fourthCornerApproximateMeter != null) {
			setFourthCornerApproximateMeter(fourthCornerApproximateMeter);
		}

		String fourthCornerApproximateDegree = (String)attributes.get(
			"fourthCornerApproximateDegree");

		if (fourthCornerApproximateDegree != null) {
			setFourthCornerApproximateDegree(fourthCornerApproximateDegree);
		}

		String fifthCornerOfNorth = (String)attributes.get(
			"fifthCornerOfNorth");

		if (fifthCornerOfNorth != null) {
			setFifthCornerOfNorth(fifthCornerOfNorth);
		}

		String fifthCornerOfEast = (String)attributes.get("fifthCornerOfEast");

		if (fifthCornerOfEast != null) {
			setFifthCornerOfEast(fifthCornerOfEast);
		}

		String fifthCornerApproximateMeter = (String)attributes.get(
			"fifthCornerApproximateMeter");

		if (fifthCornerApproximateMeter != null) {
			setFifthCornerApproximateMeter(fifthCornerApproximateMeter);
		}

		String fifthCornerApproximateDegree = (String)attributes.get(
			"fifthCornerApproximateDegree");

		if (fifthCornerApproximateDegree != null) {
			setFifthCornerApproximateDegree(fifthCornerApproximateDegree);
		}

		Long miningLeaseApplicationId = (Long)attributes.get(
			"miningLeaseApplicationId");

		if (miningLeaseApplicationId != null) {
			setMiningLeaseApplicationId(miningLeaseApplicationId);
		}
	}

	@Override
	public MiningProspectingLicense cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address in jamaica of this mining prospecting license.
	 *
	 * @return the address in jamaica of this mining prospecting license
	 */
	@Override
	public String getAddressInJamaica() {
		return model.getAddressInJamaica();
	}

	/**
	 * Returns the approximate area of this mining prospecting license.
	 *
	 * @return the approximate area of this mining prospecting license
	 */
	@Override
	public String getApproximateArea() {
		return model.getApproximateArea();
	}

	/**
	 * Returns the area of approximately of this mining prospecting license.
	 *
	 * @return the area of approximately of this mining prospecting license
	 */
	@Override
	public String getAreaOfApproximately() {
		return model.getAreaOfApproximately();
	}

	/**
	 * Returns the company ID of this mining prospecting license.
	 *
	 * @return the company ID of this mining prospecting license
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the copy of article of this mining prospecting license.
	 *
	 * @return the copy of article of this mining prospecting license
	 */
	@Override
	public String getCopyOfArticle() {
		return model.getCopyOfArticle();
	}

	/**
	 * Returns the create date of this mining prospecting license.
	 *
	 * @return the create date of this mining prospecting license
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date surrender of this mining prospecting license.
	 *
	 * @return the date surrender of this mining prospecting license
	 */
	@Override
	public Date getDateSurrender() {
		return model.getDateSurrender();
	}

	/**
	 * Returns the date upon the location of this mining prospecting license.
	 *
	 * @return the date upon the location of this mining prospecting license
	 */
	@Override
	public Date getDateUponTheLocation() {
		return model.getDateUponTheLocation();
	}

	/**
	 * Returns the east topographical of this mining prospecting license.
	 *
	 * @return the east topographical of this mining prospecting license
	 */
	@Override
	public String getEastTopographical() {
		return model.getEastTopographical();
	}

	/**
	 * Returns the email address of this mining prospecting license.
	 *
	 * @return the email address of this mining prospecting license
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the fifth corner approximate degree of this mining prospecting license.
	 *
	 * @return the fifth corner approximate degree of this mining prospecting license
	 */
	@Override
	public String getFifthCornerApproximateDegree() {
		return model.getFifthCornerApproximateDegree();
	}

	/**
	 * Returns the fifth corner approximate meter of this mining prospecting license.
	 *
	 * @return the fifth corner approximate meter of this mining prospecting license
	 */
	@Override
	public String getFifthCornerApproximateMeter() {
		return model.getFifthCornerApproximateMeter();
	}

	/**
	 * Returns the fifth corner of east of this mining prospecting license.
	 *
	 * @return the fifth corner of east of this mining prospecting license
	 */
	@Override
	public String getFifthCornerOfEast() {
		return model.getFifthCornerOfEast();
	}

	/**
	 * Returns the fifth corner of north of this mining prospecting license.
	 *
	 * @return the fifth corner of north of this mining prospecting license
	 */
	@Override
	public String getFifthCornerOfNorth() {
		return model.getFifthCornerOfNorth();
	}

	/**
	 * Returns the first corner approximate degree of this mining prospecting license.
	 *
	 * @return the first corner approximate degree of this mining prospecting license
	 */
	@Override
	public String getFirstCornerApproximateDegree() {
		return model.getFirstCornerApproximateDegree();
	}

	/**
	 * Returns the first corner approximate meter of this mining prospecting license.
	 *
	 * @return the first corner approximate meter of this mining prospecting license
	 */
	@Override
	public String getFirstCornerApproximateMeter() {
		return model.getFirstCornerApproximateMeter();
	}

	/**
	 * Returns the first corner of east of this mining prospecting license.
	 *
	 * @return the first corner of east of this mining prospecting license
	 */
	@Override
	public String getFirstCornerOfEast() {
		return model.getFirstCornerOfEast();
	}

	/**
	 * Returns the first corner of north of this mining prospecting license.
	 *
	 * @return the first corner of north of this mining prospecting license
	 */
	@Override
	public String getFirstCornerOfNorth() {
		return model.getFirstCornerOfNorth();
	}

	/**
	 * Returns the fourth corner approximate degree of this mining prospecting license.
	 *
	 * @return the fourth corner approximate degree of this mining prospecting license
	 */
	@Override
	public String getFourthCornerApproximateDegree() {
		return model.getFourthCornerApproximateDegree();
	}

	/**
	 * Returns the fourth corner approximate meter of this mining prospecting license.
	 *
	 * @return the fourth corner approximate meter of this mining prospecting license
	 */
	@Override
	public String getFourthCornerApproximateMeter() {
		return model.getFourthCornerApproximateMeter();
	}

	/**
	 * Returns the fourth corner of east of this mining prospecting license.
	 *
	 * @return the fourth corner of east of this mining prospecting license
	 */
	@Override
	public String getFourthCornerOfEast() {
		return model.getFourthCornerOfEast();
	}

	/**
	 * Returns the fourth corner of north of this mining prospecting license.
	 *
	 * @return the fourth corner of north of this mining prospecting license
	 */
	@Override
	public String getFourthCornerOfNorth() {
		return model.getFourthCornerOfNorth();
	}

	/**
	 * Returns the group ID of this mining prospecting license.
	 *
	 * @return the group ID of this mining prospecting license
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the intersection coordinates of this mining prospecting license.
	 *
	 * @return the intersection coordinates of this mining prospecting license
	 */
	@Override
	public String getIntersectionCoordinates() {
		return model.getIntersectionCoordinates();
	}

	/**
	 * Returns the licence of this mining prospecting license.
	 *
	 * @return the licence of this mining prospecting license
	 */
	@Override
	public String getLicence() {
		return model.getLicence();
	}

	/**
	 * Returns the location beacon of this mining prospecting license.
	 *
	 * @return the location beacon of this mining prospecting license
	 */
	@Override
	public String getLocationBeacon() {
		return model.getLocationBeacon();
	}

	/**
	 * Returns the mineral for which applicant of this mining prospecting license.
	 *
	 * @return the mineral for which applicant of this mining prospecting license
	 */
	@Override
	public String getMineralForWhichApplicant() {
		return model.getMineralForWhichApplicant();
	}

	/**
	 * Returns the mining lease application ID of this mining prospecting license.
	 *
	 * @return the mining lease application ID of this mining prospecting license
	 */
	@Override
	public long getMiningLeaseApplicationId() {
		return model.getMiningLeaseApplicationId();
	}

	/**
	 * Returns the mining prospecting license ID of this mining prospecting license.
	 *
	 * @return the mining prospecting license ID of this mining prospecting license
	 */
	@Override
	public long getMiningProspectingLicenseId() {
		return model.getMiningProspectingLicenseId();
	}

	/**
	 * Returns the modified date of this mining prospecting license.
	 *
	 * @return the modified date of this mining prospecting license
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of applicant of this mining prospecting license.
	 *
	 * @return the name of applicant of this mining prospecting license
	 */
	@Override
	public String getNameOfApplicant() {
		return model.getNameOfApplicant();
	}

	/**
	 * Returns the name of the agent of this mining prospecting license.
	 *
	 * @return the name of the agent of this mining prospecting license
	 */
	@Override
	public String getNameOfTheAgent() {
		return model.getNameOfTheAgent();
	}

	/**
	 * Returns the nationality of applicant of this mining prospecting license.
	 *
	 * @return the nationality of applicant of this mining prospecting license
	 */
	@Override
	public String getNationalityOfApplicant() {
		return model.getNationalityOfApplicant();
	}

	/**
	 * Returns the north topographical of this mining prospecting license.
	 *
	 * @return the north topographical of this mining prospecting license
	 */
	@Override
	public String getNorthTopographical() {
		return model.getNorthTopographical();
	}

	/**
	 * Returns the number of applicant of this mining prospecting license.
	 *
	 * @return the number of applicant of this mining prospecting license
	 */
	@Override
	public String getNumberOfApplicant() {
		return model.getNumberOfApplicant();
	}

	/**
	 * Returns the number of this prospecting of this mining prospecting license.
	 *
	 * @return the number of this prospecting of this mining prospecting license
	 */
	@Override
	public String getNumberOfThisProspecting() {
		return model.getNumberOfThisProspecting();
	}

	/**
	 * Returns the parish of this mining prospecting license.
	 *
	 * @return the parish of this mining prospecting license
	 */
	@Override
	public String getParish() {
		return model.getParish();
	}

	/**
	 * Returns the primary key of this mining prospecting license.
	 *
	 * @return the primary key of this mining prospecting license
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proslicence fee check of this mining prospecting license.
	 *
	 * @return the proslicence fee check of this mining prospecting license
	 */
	@Override
	public String getProslicenceFeeCheck() {
		return model.getProslicenceFeeCheck();
	}

	/**
	 * Returns the prospecting right of this mining prospecting license.
	 *
	 * @return the prospecting right of this mining prospecting license
	 */
	@Override
	public String getProspectingRight() {
		return model.getProspectingRight();
	}

	/**
	 * Returns the second corner approximate degree of this mining prospecting license.
	 *
	 * @return the second corner approximate degree of this mining prospecting license
	 */
	@Override
	public String getSecondCornerApproximateDegree() {
		return model.getSecondCornerApproximateDegree();
	}

	/**
	 * Returns the second corner approximate meter of this mining prospecting license.
	 *
	 * @return the second corner approximate meter of this mining prospecting license
	 */
	@Override
	public String getSecondCornerApproximateMeter() {
		return model.getSecondCornerApproximateMeter();
	}

	/**
	 * Returns the second corner of east of this mining prospecting license.
	 *
	 * @return the second corner of east of this mining prospecting license
	 */
	@Override
	public String getSecondCornerOfEast() {
		return model.getSecondCornerOfEast();
	}

	/**
	 * Returns the second corner of north of this mining prospecting license.
	 *
	 * @return the second corner of north of this mining prospecting license
	 */
	@Override
	public String getSecondCornerOfNorth() {
		return model.getSecondCornerOfNorth();
	}

	/**
	 * Returns the state the nearest landmark of this mining prospecting license.
	 *
	 * @return the state the nearest landmark of this mining prospecting license
	 */
	@Override
	public String getStateTheNearestLandmark() {
		return model.getStateTheNearestLandmark();
	}

	/**
	 * Returns the telephone number of this mining prospecting license.
	 *
	 * @return the telephone number of this mining prospecting license
	 */
	@Override
	public String getTelephoneNumber() {
		return model.getTelephoneNumber();
	}

	/**
	 * Returns the third corner approximate degree of this mining prospecting license.
	 *
	 * @return the third corner approximate degree of this mining prospecting license
	 */
	@Override
	public String getThirdCornerApproximateDegree() {
		return model.getThirdCornerApproximateDegree();
	}

	/**
	 * Returns the third corner approximate meter of this mining prospecting license.
	 *
	 * @return the third corner approximate meter of this mining prospecting license
	 */
	@Override
	public String getThirdCornerApproximateMeter() {
		return model.getThirdCornerApproximateMeter();
	}

	/**
	 * Returns the third corner of east of this mining prospecting license.
	 *
	 * @return the third corner of east of this mining prospecting license
	 */
	@Override
	public String getThirdCornerOfEast() {
		return model.getThirdCornerOfEast();
	}

	/**
	 * Returns the third corner of north of this mining prospecting license.
	 *
	 * @return the third corner of north of this mining prospecting license
	 */
	@Override
	public String getThirdCornerOfNorth() {
		return model.getThirdCornerOfNorth();
	}

	/**
	 * Returns the trn number of this mining prospecting license.
	 *
	 * @return the trn number of this mining prospecting license
	 */
	@Override
	public String getTrnNumber() {
		return model.getTrnNumber();
	}

	/**
	 * Returns the user ID of this mining prospecting license.
	 *
	 * @return the user ID of this mining prospecting license
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this mining prospecting license.
	 *
	 * @return the user name of this mining prospecting license
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this mining prospecting license.
	 *
	 * @return the user uuid of this mining prospecting license
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
	 * Sets the address in jamaica of this mining prospecting license.
	 *
	 * @param addressInJamaica the address in jamaica of this mining prospecting license
	 */
	@Override
	public void setAddressInJamaica(String addressInJamaica) {
		model.setAddressInJamaica(addressInJamaica);
	}

	/**
	 * Sets the approximate area of this mining prospecting license.
	 *
	 * @param approximateArea the approximate area of this mining prospecting license
	 */
	@Override
	public void setApproximateArea(String approximateArea) {
		model.setApproximateArea(approximateArea);
	}

	/**
	 * Sets the area of approximately of this mining prospecting license.
	 *
	 * @param areaOfApproximately the area of approximately of this mining prospecting license
	 */
	@Override
	public void setAreaOfApproximately(String areaOfApproximately) {
		model.setAreaOfApproximately(areaOfApproximately);
	}

	/**
	 * Sets the company ID of this mining prospecting license.
	 *
	 * @param companyId the company ID of this mining prospecting license
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the copy of article of this mining prospecting license.
	 *
	 * @param copyOfArticle the copy of article of this mining prospecting license
	 */
	@Override
	public void setCopyOfArticle(String copyOfArticle) {
		model.setCopyOfArticle(copyOfArticle);
	}

	/**
	 * Sets the create date of this mining prospecting license.
	 *
	 * @param createDate the create date of this mining prospecting license
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date surrender of this mining prospecting license.
	 *
	 * @param dateSurrender the date surrender of this mining prospecting license
	 */
	@Override
	public void setDateSurrender(Date dateSurrender) {
		model.setDateSurrender(dateSurrender);
	}

	/**
	 * Sets the date upon the location of this mining prospecting license.
	 *
	 * @param dateUponTheLocation the date upon the location of this mining prospecting license
	 */
	@Override
	public void setDateUponTheLocation(Date dateUponTheLocation) {
		model.setDateUponTheLocation(dateUponTheLocation);
	}

	/**
	 * Sets the east topographical of this mining prospecting license.
	 *
	 * @param eastTopographical the east topographical of this mining prospecting license
	 */
	@Override
	public void setEastTopographical(String eastTopographical) {
		model.setEastTopographical(eastTopographical);
	}

	/**
	 * Sets the email address of this mining prospecting license.
	 *
	 * @param emailAddress the email address of this mining prospecting license
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the fifth corner approximate degree of this mining prospecting license.
	 *
	 * @param fifthCornerApproximateDegree the fifth corner approximate degree of this mining prospecting license
	 */
	@Override
	public void setFifthCornerApproximateDegree(
		String fifthCornerApproximateDegree) {

		model.setFifthCornerApproximateDegree(fifthCornerApproximateDegree);
	}

	/**
	 * Sets the fifth corner approximate meter of this mining prospecting license.
	 *
	 * @param fifthCornerApproximateMeter the fifth corner approximate meter of this mining prospecting license
	 */
	@Override
	public void setFifthCornerApproximateMeter(
		String fifthCornerApproximateMeter) {

		model.setFifthCornerApproximateMeter(fifthCornerApproximateMeter);
	}

	/**
	 * Sets the fifth corner of east of this mining prospecting license.
	 *
	 * @param fifthCornerOfEast the fifth corner of east of this mining prospecting license
	 */
	@Override
	public void setFifthCornerOfEast(String fifthCornerOfEast) {
		model.setFifthCornerOfEast(fifthCornerOfEast);
	}

	/**
	 * Sets the fifth corner of north of this mining prospecting license.
	 *
	 * @param fifthCornerOfNorth the fifth corner of north of this mining prospecting license
	 */
	@Override
	public void setFifthCornerOfNorth(String fifthCornerOfNorth) {
		model.setFifthCornerOfNorth(fifthCornerOfNorth);
	}

	/**
	 * Sets the first corner approximate degree of this mining prospecting license.
	 *
	 * @param firstCornerApproximateDegree the first corner approximate degree of this mining prospecting license
	 */
	@Override
	public void setFirstCornerApproximateDegree(
		String firstCornerApproximateDegree) {

		model.setFirstCornerApproximateDegree(firstCornerApproximateDegree);
	}

	/**
	 * Sets the first corner approximate meter of this mining prospecting license.
	 *
	 * @param firstCornerApproximateMeter the first corner approximate meter of this mining prospecting license
	 */
	@Override
	public void setFirstCornerApproximateMeter(
		String firstCornerApproximateMeter) {

		model.setFirstCornerApproximateMeter(firstCornerApproximateMeter);
	}

	/**
	 * Sets the first corner of east of this mining prospecting license.
	 *
	 * @param firstCornerOfEast the first corner of east of this mining prospecting license
	 */
	@Override
	public void setFirstCornerOfEast(String firstCornerOfEast) {
		model.setFirstCornerOfEast(firstCornerOfEast);
	}

	/**
	 * Sets the first corner of north of this mining prospecting license.
	 *
	 * @param firstCornerOfNorth the first corner of north of this mining prospecting license
	 */
	@Override
	public void setFirstCornerOfNorth(String firstCornerOfNorth) {
		model.setFirstCornerOfNorth(firstCornerOfNorth);
	}

	/**
	 * Sets the fourth corner approximate degree of this mining prospecting license.
	 *
	 * @param fourthCornerApproximateDegree the fourth corner approximate degree of this mining prospecting license
	 */
	@Override
	public void setFourthCornerApproximateDegree(
		String fourthCornerApproximateDegree) {

		model.setFourthCornerApproximateDegree(fourthCornerApproximateDegree);
	}

	/**
	 * Sets the fourth corner approximate meter of this mining prospecting license.
	 *
	 * @param fourthCornerApproximateMeter the fourth corner approximate meter of this mining prospecting license
	 */
	@Override
	public void setFourthCornerApproximateMeter(
		String fourthCornerApproximateMeter) {

		model.setFourthCornerApproximateMeter(fourthCornerApproximateMeter);
	}

	/**
	 * Sets the fourth corner of east of this mining prospecting license.
	 *
	 * @param fourthCornerOfEast the fourth corner of east of this mining prospecting license
	 */
	@Override
	public void setFourthCornerOfEast(String fourthCornerOfEast) {
		model.setFourthCornerOfEast(fourthCornerOfEast);
	}

	/**
	 * Sets the fourth corner of north of this mining prospecting license.
	 *
	 * @param fourthCornerOfNorth the fourth corner of north of this mining prospecting license
	 */
	@Override
	public void setFourthCornerOfNorth(String fourthCornerOfNorth) {
		model.setFourthCornerOfNorth(fourthCornerOfNorth);
	}

	/**
	 * Sets the group ID of this mining prospecting license.
	 *
	 * @param groupId the group ID of this mining prospecting license
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the intersection coordinates of this mining prospecting license.
	 *
	 * @param intersectionCoordinates the intersection coordinates of this mining prospecting license
	 */
	@Override
	public void setIntersectionCoordinates(String intersectionCoordinates) {
		model.setIntersectionCoordinates(intersectionCoordinates);
	}

	/**
	 * Sets the licence of this mining prospecting license.
	 *
	 * @param licence the licence of this mining prospecting license
	 */
	@Override
	public void setLicence(String licence) {
		model.setLicence(licence);
	}

	/**
	 * Sets the location beacon of this mining prospecting license.
	 *
	 * @param locationBeacon the location beacon of this mining prospecting license
	 */
	@Override
	public void setLocationBeacon(String locationBeacon) {
		model.setLocationBeacon(locationBeacon);
	}

	/**
	 * Sets the mineral for which applicant of this mining prospecting license.
	 *
	 * @param mineralForWhichApplicant the mineral for which applicant of this mining prospecting license
	 */
	@Override
	public void setMineralForWhichApplicant(String mineralForWhichApplicant) {
		model.setMineralForWhichApplicant(mineralForWhichApplicant);
	}

	/**
	 * Sets the mining lease application ID of this mining prospecting license.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID of this mining prospecting license
	 */
	@Override
	public void setMiningLeaseApplicationId(long miningLeaseApplicationId) {
		model.setMiningLeaseApplicationId(miningLeaseApplicationId);
	}

	/**
	 * Sets the mining prospecting license ID of this mining prospecting license.
	 *
	 * @param miningProspectingLicenseId the mining prospecting license ID of this mining prospecting license
	 */
	@Override
	public void setMiningProspectingLicenseId(long miningProspectingLicenseId) {
		model.setMiningProspectingLicenseId(miningProspectingLicenseId);
	}

	/**
	 * Sets the modified date of this mining prospecting license.
	 *
	 * @param modifiedDate the modified date of this mining prospecting license
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of applicant of this mining prospecting license.
	 *
	 * @param nameOfApplicant the name of applicant of this mining prospecting license
	 */
	@Override
	public void setNameOfApplicant(String nameOfApplicant) {
		model.setNameOfApplicant(nameOfApplicant);
	}

	/**
	 * Sets the name of the agent of this mining prospecting license.
	 *
	 * @param nameOfTheAgent the name of the agent of this mining prospecting license
	 */
	@Override
	public void setNameOfTheAgent(String nameOfTheAgent) {
		model.setNameOfTheAgent(nameOfTheAgent);
	}

	/**
	 * Sets the nationality of applicant of this mining prospecting license.
	 *
	 * @param nationalityOfApplicant the nationality of applicant of this mining prospecting license
	 */
	@Override
	public void setNationalityOfApplicant(String nationalityOfApplicant) {
		model.setNationalityOfApplicant(nationalityOfApplicant);
	}

	/**
	 * Sets the north topographical of this mining prospecting license.
	 *
	 * @param northTopographical the north topographical of this mining prospecting license
	 */
	@Override
	public void setNorthTopographical(String northTopographical) {
		model.setNorthTopographical(northTopographical);
	}

	/**
	 * Sets the number of applicant of this mining prospecting license.
	 *
	 * @param numberOfApplicant the number of applicant of this mining prospecting license
	 */
	@Override
	public void setNumberOfApplicant(String numberOfApplicant) {
		model.setNumberOfApplicant(numberOfApplicant);
	}

	/**
	 * Sets the number of this prospecting of this mining prospecting license.
	 *
	 * @param numberOfThisProspecting the number of this prospecting of this mining prospecting license
	 */
	@Override
	public void setNumberOfThisProspecting(String numberOfThisProspecting) {
		model.setNumberOfThisProspecting(numberOfThisProspecting);
	}

	/**
	 * Sets the parish of this mining prospecting license.
	 *
	 * @param parish the parish of this mining prospecting license
	 */
	@Override
	public void setParish(String parish) {
		model.setParish(parish);
	}

	/**
	 * Sets the primary key of this mining prospecting license.
	 *
	 * @param primaryKey the primary key of this mining prospecting license
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proslicence fee check of this mining prospecting license.
	 *
	 * @param proslicenceFeeCheck the proslicence fee check of this mining prospecting license
	 */
	@Override
	public void setProslicenceFeeCheck(String proslicenceFeeCheck) {
		model.setProslicenceFeeCheck(proslicenceFeeCheck);
	}

	/**
	 * Sets the prospecting right of this mining prospecting license.
	 *
	 * @param prospectingRight the prospecting right of this mining prospecting license
	 */
	@Override
	public void setProspectingRight(String prospectingRight) {
		model.setProspectingRight(prospectingRight);
	}

	/**
	 * Sets the second corner approximate degree of this mining prospecting license.
	 *
	 * @param secondCornerApproximateDegree the second corner approximate degree of this mining prospecting license
	 */
	@Override
	public void setSecondCornerApproximateDegree(
		String secondCornerApproximateDegree) {

		model.setSecondCornerApproximateDegree(secondCornerApproximateDegree);
	}

	/**
	 * Sets the second corner approximate meter of this mining prospecting license.
	 *
	 * @param secondCornerApproximateMeter the second corner approximate meter of this mining prospecting license
	 */
	@Override
	public void setSecondCornerApproximateMeter(
		String secondCornerApproximateMeter) {

		model.setSecondCornerApproximateMeter(secondCornerApproximateMeter);
	}

	/**
	 * Sets the second corner of east of this mining prospecting license.
	 *
	 * @param secondCornerOfEast the second corner of east of this mining prospecting license
	 */
	@Override
	public void setSecondCornerOfEast(String secondCornerOfEast) {
		model.setSecondCornerOfEast(secondCornerOfEast);
	}

	/**
	 * Sets the second corner of north of this mining prospecting license.
	 *
	 * @param secondCornerOfNorth the second corner of north of this mining prospecting license
	 */
	@Override
	public void setSecondCornerOfNorth(String secondCornerOfNorth) {
		model.setSecondCornerOfNorth(secondCornerOfNorth);
	}

	/**
	 * Sets the state the nearest landmark of this mining prospecting license.
	 *
	 * @param stateTheNearestLandmark the state the nearest landmark of this mining prospecting license
	 */
	@Override
	public void setStateTheNearestLandmark(String stateTheNearestLandmark) {
		model.setStateTheNearestLandmark(stateTheNearestLandmark);
	}

	/**
	 * Sets the telephone number of this mining prospecting license.
	 *
	 * @param telephoneNumber the telephone number of this mining prospecting license
	 */
	@Override
	public void setTelephoneNumber(String telephoneNumber) {
		model.setTelephoneNumber(telephoneNumber);
	}

	/**
	 * Sets the third corner approximate degree of this mining prospecting license.
	 *
	 * @param thirdCornerApproximateDegree the third corner approximate degree of this mining prospecting license
	 */
	@Override
	public void setThirdCornerApproximateDegree(
		String thirdCornerApproximateDegree) {

		model.setThirdCornerApproximateDegree(thirdCornerApproximateDegree);
	}

	/**
	 * Sets the third corner approximate meter of this mining prospecting license.
	 *
	 * @param thirdCornerApproximateMeter the third corner approximate meter of this mining prospecting license
	 */
	@Override
	public void setThirdCornerApproximateMeter(
		String thirdCornerApproximateMeter) {

		model.setThirdCornerApproximateMeter(thirdCornerApproximateMeter);
	}

	/**
	 * Sets the third corner of east of this mining prospecting license.
	 *
	 * @param thirdCornerOfEast the third corner of east of this mining prospecting license
	 */
	@Override
	public void setThirdCornerOfEast(String thirdCornerOfEast) {
		model.setThirdCornerOfEast(thirdCornerOfEast);
	}

	/**
	 * Sets the third corner of north of this mining prospecting license.
	 *
	 * @param thirdCornerOfNorth the third corner of north of this mining prospecting license
	 */
	@Override
	public void setThirdCornerOfNorth(String thirdCornerOfNorth) {
		model.setThirdCornerOfNorth(thirdCornerOfNorth);
	}

	/**
	 * Sets the trn number of this mining prospecting license.
	 *
	 * @param trnNumber the trn number of this mining prospecting license
	 */
	@Override
	public void setTrnNumber(String trnNumber) {
		model.setTrnNumber(trnNumber);
	}

	/**
	 * Sets the user ID of this mining prospecting license.
	 *
	 * @param userId the user ID of this mining prospecting license
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this mining prospecting license.
	 *
	 * @param userName the user name of this mining prospecting license
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this mining prospecting license.
	 *
	 * @param userUuid the user uuid of this mining prospecting license
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
	protected MiningProspectingLicenseWrapper wrap(
		MiningProspectingLicense miningProspectingLicense) {

		return new MiningProspectingLicenseWrapper(miningProspectingLicense);
	}

}