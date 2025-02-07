/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SezDevProposedProject}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevProposedProject
 * @generated
 */
public class SezDevProposedProjectWrapper
	extends BaseModelWrapper<SezDevProposedProject>
	implements ModelWrapper<SezDevProposedProject>, SezDevProposedProject {

	public SezDevProposedProjectWrapper(
		SezDevProposedProject sezDevProposedProject) {

		super(sezDevProposedProject);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezDevProposedProjectId", getSezDevProposedProjectId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("previouslyFreeZone", getPreviouslyFreeZone());
		attributes.put("curentlyOperatingZone", getCurentlyOperatingZone());
		attributes.put("businessConductedZone", getBusinessConductedZone());
		attributes.put("locally", getLocally());
		attributes.put("overseas", getOverseas());
		attributes.put("proposedName", getProposedName());
		attributes.put("specialEconomicZone", getSpecialEconomicZone());
		attributes.put("pleaseDescribe", getPleaseDescribe());
		attributes.put("seaPortKm", getSeaPortKm());
		attributes.put("seaPortMi", getSeaPortMi());
		attributes.put("airportKm", getAirportKm());
		attributes.put("airportMi", getAirportMi());
		attributes.put("roadKm", getRoadKm());
		attributes.put("roadMi", getRoadMi());
		attributes.put("railKm", getRailKm());
		attributes.put("railMi", getRailMi());
		attributes.put("customProcessingKm", getCustomProcessingKm());
		attributes.put("customProcessingMi", getCustomProcessingMi());
		attributes.put(
			"indicateTheLandMeasurement", getIndicateTheLandMeasurement());
		attributes.put("building", getBuilding());
		attributes.put("landArea", getLandArea());
		attributes.put("ownerShip", getOwnerShip());
		attributes.put("otherPleaseSpecify", getOtherPleaseSpecify());
		attributes.put("landOwnerName", getLandOwnerName());
		attributes.put("lnadOwnerAddressOne", getLnadOwnerAddressOne());
		attributes.put("lnadOwnerAddressTwo", getLnadOwnerAddressTwo());
		attributes.put("lnadOwnerTenure", getLnadOwnerTenure());
		attributes.put("stepToAcquireLand", getStepToAcquireLand());
		attributes.put(
			"stateWheatherTheProposedArea", getStateWheatherTheProposedArea());
		attributes.put("applicantPreviously", getApplicantPreviously());
		attributes.put("pleaseProvideBrief", getPleaseProvideBrief());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezDevProposedProjectId = (Long)attributes.get(
			"sezDevProposedProjectId");

		if (sezDevProposedProjectId != null) {
			setSezDevProposedProjectId(sezDevProposedProjectId);
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

		String previouslyFreeZone = (String)attributes.get(
			"previouslyFreeZone");

		if (previouslyFreeZone != null) {
			setPreviouslyFreeZone(previouslyFreeZone);
		}

		String curentlyOperatingZone = (String)attributes.get(
			"curentlyOperatingZone");

		if (curentlyOperatingZone != null) {
			setCurentlyOperatingZone(curentlyOperatingZone);
		}

		String businessConductedZone = (String)attributes.get(
			"businessConductedZone");

		if (businessConductedZone != null) {
			setBusinessConductedZone(businessConductedZone);
		}

		String locally = (String)attributes.get("locally");

		if (locally != null) {
			setLocally(locally);
		}

		String overseas = (String)attributes.get("overseas");

		if (overseas != null) {
			setOverseas(overseas);
		}

		String proposedName = (String)attributes.get("proposedName");

		if (proposedName != null) {
			setProposedName(proposedName);
		}

		String specialEconomicZone = (String)attributes.get(
			"specialEconomicZone");

		if (specialEconomicZone != null) {
			setSpecialEconomicZone(specialEconomicZone);
		}

		String pleaseDescribe = (String)attributes.get("pleaseDescribe");

		if (pleaseDescribe != null) {
			setPleaseDescribe(pleaseDescribe);
		}

		String seaPortKm = (String)attributes.get("seaPortKm");

		if (seaPortKm != null) {
			setSeaPortKm(seaPortKm);
		}

		String seaPortMi = (String)attributes.get("seaPortMi");

		if (seaPortMi != null) {
			setSeaPortMi(seaPortMi);
		}

		String airportKm = (String)attributes.get("airportKm");

		if (airportKm != null) {
			setAirportKm(airportKm);
		}

		String airportMi = (String)attributes.get("airportMi");

		if (airportMi != null) {
			setAirportMi(airportMi);
		}

		String roadKm = (String)attributes.get("roadKm");

		if (roadKm != null) {
			setRoadKm(roadKm);
		}

		String roadMi = (String)attributes.get("roadMi");

		if (roadMi != null) {
			setRoadMi(roadMi);
		}

		String railKm = (String)attributes.get("railKm");

		if (railKm != null) {
			setRailKm(railKm);
		}

		String railMi = (String)attributes.get("railMi");

		if (railMi != null) {
			setRailMi(railMi);
		}

		String customProcessingKm = (String)attributes.get(
			"customProcessingKm");

		if (customProcessingKm != null) {
			setCustomProcessingKm(customProcessingKm);
		}

		String customProcessingMi = (String)attributes.get(
			"customProcessingMi");

		if (customProcessingMi != null) {
			setCustomProcessingMi(customProcessingMi);
		}

		String indicateTheLandMeasurement = (String)attributes.get(
			"indicateTheLandMeasurement");

		if (indicateTheLandMeasurement != null) {
			setIndicateTheLandMeasurement(indicateTheLandMeasurement);
		}

		String building = (String)attributes.get("building");

		if (building != null) {
			setBuilding(building);
		}

		String landArea = (String)attributes.get("landArea");

		if (landArea != null) {
			setLandArea(landArea);
		}

		String ownerShip = (String)attributes.get("ownerShip");

		if (ownerShip != null) {
			setOwnerShip(ownerShip);
		}

		String otherPleaseSpecify = (String)attributes.get(
			"otherPleaseSpecify");

		if (otherPleaseSpecify != null) {
			setOtherPleaseSpecify(otherPleaseSpecify);
		}

		String landOwnerName = (String)attributes.get("landOwnerName");

		if (landOwnerName != null) {
			setLandOwnerName(landOwnerName);
		}

		String lnadOwnerAddressOne = (String)attributes.get(
			"lnadOwnerAddressOne");

		if (lnadOwnerAddressOne != null) {
			setLnadOwnerAddressOne(lnadOwnerAddressOne);
		}

		String lnadOwnerAddressTwo = (String)attributes.get(
			"lnadOwnerAddressTwo");

		if (lnadOwnerAddressTwo != null) {
			setLnadOwnerAddressTwo(lnadOwnerAddressTwo);
		}

		String lnadOwnerTenure = (String)attributes.get("lnadOwnerTenure");

		if (lnadOwnerTenure != null) {
			setLnadOwnerTenure(lnadOwnerTenure);
		}

		String stepToAcquireLand = (String)attributes.get("stepToAcquireLand");

		if (stepToAcquireLand != null) {
			setStepToAcquireLand(stepToAcquireLand);
		}

		String stateWheatherTheProposedArea = (String)attributes.get(
			"stateWheatherTheProposedArea");

		if (stateWheatherTheProposedArea != null) {
			setStateWheatherTheProposedArea(stateWheatherTheProposedArea);
		}

		String applicantPreviously = (String)attributes.get(
			"applicantPreviously");

		if (applicantPreviously != null) {
			setApplicantPreviously(applicantPreviously);
		}

		String pleaseProvideBrief = (String)attributes.get(
			"pleaseProvideBrief");

		if (pleaseProvideBrief != null) {
			setPleaseProvideBrief(pleaseProvideBrief);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezDevProposedProject cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the airport km of this sez dev proposed project.
	 *
	 * @return the airport km of this sez dev proposed project
	 */
	@Override
	public String getAirportKm() {
		return model.getAirportKm();
	}

	/**
	 * Returns the airport mi of this sez dev proposed project.
	 *
	 * @return the airport mi of this sez dev proposed project
	 */
	@Override
	public String getAirportMi() {
		return model.getAirportMi();
	}

	/**
	 * Returns the applicant previously of this sez dev proposed project.
	 *
	 * @return the applicant previously of this sez dev proposed project
	 */
	@Override
	public String getApplicantPreviously() {
		return model.getApplicantPreviously();
	}

	/**
	 * Returns the building of this sez dev proposed project.
	 *
	 * @return the building of this sez dev proposed project
	 */
	@Override
	public String getBuilding() {
		return model.getBuilding();
	}

	/**
	 * Returns the business conducted zone of this sez dev proposed project.
	 *
	 * @return the business conducted zone of this sez dev proposed project
	 */
	@Override
	public String getBusinessConductedZone() {
		return model.getBusinessConductedZone();
	}

	/**
	 * Returns the company ID of this sez dev proposed project.
	 *
	 * @return the company ID of this sez dev proposed project
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez dev proposed project.
	 *
	 * @return the create date of this sez dev proposed project
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the curently operating zone of this sez dev proposed project.
	 *
	 * @return the curently operating zone of this sez dev proposed project
	 */
	@Override
	public String getCurentlyOperatingZone() {
		return model.getCurentlyOperatingZone();
	}

	/**
	 * Returns the custom processing km of this sez dev proposed project.
	 *
	 * @return the custom processing km of this sez dev proposed project
	 */
	@Override
	public String getCustomProcessingKm() {
		return model.getCustomProcessingKm();
	}

	/**
	 * Returns the custom processing mi of this sez dev proposed project.
	 *
	 * @return the custom processing mi of this sez dev proposed project
	 */
	@Override
	public String getCustomProcessingMi() {
		return model.getCustomProcessingMi();
	}

	/**
	 * Returns the group ID of this sez dev proposed project.
	 *
	 * @return the group ID of this sez dev proposed project
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the indicate the land measurement of this sez dev proposed project.
	 *
	 * @return the indicate the land measurement of this sez dev proposed project
	 */
	@Override
	public String getIndicateTheLandMeasurement() {
		return model.getIndicateTheLandMeasurement();
	}

	/**
	 * Returns the land area of this sez dev proposed project.
	 *
	 * @return the land area of this sez dev proposed project
	 */
	@Override
	public String getLandArea() {
		return model.getLandArea();
	}

	/**
	 * Returns the land owner name of this sez dev proposed project.
	 *
	 * @return the land owner name of this sez dev proposed project
	 */
	@Override
	public String getLandOwnerName() {
		return model.getLandOwnerName();
	}

	/**
	 * Returns the lnad owner address one of this sez dev proposed project.
	 *
	 * @return the lnad owner address one of this sez dev proposed project
	 */
	@Override
	public String getLnadOwnerAddressOne() {
		return model.getLnadOwnerAddressOne();
	}

	/**
	 * Returns the lnad owner address two of this sez dev proposed project.
	 *
	 * @return the lnad owner address two of this sez dev proposed project
	 */
	@Override
	public String getLnadOwnerAddressTwo() {
		return model.getLnadOwnerAddressTwo();
	}

	/**
	 * Returns the lnad owner tenure of this sez dev proposed project.
	 *
	 * @return the lnad owner tenure of this sez dev proposed project
	 */
	@Override
	public String getLnadOwnerTenure() {
		return model.getLnadOwnerTenure();
	}

	/**
	 * Returns the locally of this sez dev proposed project.
	 *
	 * @return the locally of this sez dev proposed project
	 */
	@Override
	public String getLocally() {
		return model.getLocally();
	}

	/**
	 * Returns the modified date of this sez dev proposed project.
	 *
	 * @return the modified date of this sez dev proposed project
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the other please specify of this sez dev proposed project.
	 *
	 * @return the other please specify of this sez dev proposed project
	 */
	@Override
	public String getOtherPleaseSpecify() {
		return model.getOtherPleaseSpecify();
	}

	/**
	 * Returns the overseas of this sez dev proposed project.
	 *
	 * @return the overseas of this sez dev proposed project
	 */
	@Override
	public String getOverseas() {
		return model.getOverseas();
	}

	/**
	 * Returns the owner ship of this sez dev proposed project.
	 *
	 * @return the owner ship of this sez dev proposed project
	 */
	@Override
	public String getOwnerShip() {
		return model.getOwnerShip();
	}

	/**
	 * Returns the please describe of this sez dev proposed project.
	 *
	 * @return the please describe of this sez dev proposed project
	 */
	@Override
	public String getPleaseDescribe() {
		return model.getPleaseDescribe();
	}

	/**
	 * Returns the please provide brief of this sez dev proposed project.
	 *
	 * @return the please provide brief of this sez dev proposed project
	 */
	@Override
	public String getPleaseProvideBrief() {
		return model.getPleaseProvideBrief();
	}

	/**
	 * Returns the previously free zone of this sez dev proposed project.
	 *
	 * @return the previously free zone of this sez dev proposed project
	 */
	@Override
	public String getPreviouslyFreeZone() {
		return model.getPreviouslyFreeZone();
	}

	/**
	 * Returns the primary key of this sez dev proposed project.
	 *
	 * @return the primary key of this sez dev proposed project
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposed name of this sez dev proposed project.
	 *
	 * @return the proposed name of this sez dev proposed project
	 */
	@Override
	public String getProposedName() {
		return model.getProposedName();
	}

	/**
	 * Returns the rail km of this sez dev proposed project.
	 *
	 * @return the rail km of this sez dev proposed project
	 */
	@Override
	public String getRailKm() {
		return model.getRailKm();
	}

	/**
	 * Returns the rail mi of this sez dev proposed project.
	 *
	 * @return the rail mi of this sez dev proposed project
	 */
	@Override
	public String getRailMi() {
		return model.getRailMi();
	}

	/**
	 * Returns the road km of this sez dev proposed project.
	 *
	 * @return the road km of this sez dev proposed project
	 */
	@Override
	public String getRoadKm() {
		return model.getRoadKm();
	}

	/**
	 * Returns the road mi of this sez dev proposed project.
	 *
	 * @return the road mi of this sez dev proposed project
	 */
	@Override
	public String getRoadMi() {
		return model.getRoadMi();
	}

	/**
	 * Returns the sea port km of this sez dev proposed project.
	 *
	 * @return the sea port km of this sez dev proposed project
	 */
	@Override
	public String getSeaPortKm() {
		return model.getSeaPortKm();
	}

	/**
	 * Returns the sea port mi of this sez dev proposed project.
	 *
	 * @return the sea port mi of this sez dev proposed project
	 */
	@Override
	public String getSeaPortMi() {
		return model.getSeaPortMi();
	}

	/**
	 * Returns the sez dev proposed project ID of this sez dev proposed project.
	 *
	 * @return the sez dev proposed project ID of this sez dev proposed project
	 */
	@Override
	public long getSezDevProposedProjectId() {
		return model.getSezDevProposedProjectId();
	}

	/**
	 * Returns the sez status application ID of this sez dev proposed project.
	 *
	 * @return the sez status application ID of this sez dev proposed project
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the special economic zone of this sez dev proposed project.
	 *
	 * @return the special economic zone of this sez dev proposed project
	 */
	@Override
	public String getSpecialEconomicZone() {
		return model.getSpecialEconomicZone();
	}

	/**
	 * Returns the state wheather the proposed area of this sez dev proposed project.
	 *
	 * @return the state wheather the proposed area of this sez dev proposed project
	 */
	@Override
	public String getStateWheatherTheProposedArea() {
		return model.getStateWheatherTheProposedArea();
	}

	/**
	 * Returns the step to acquire land of this sez dev proposed project.
	 *
	 * @return the step to acquire land of this sez dev proposed project
	 */
	@Override
	public String getStepToAcquireLand() {
		return model.getStepToAcquireLand();
	}

	/**
	 * Returns the user ID of this sez dev proposed project.
	 *
	 * @return the user ID of this sez dev proposed project
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez dev proposed project.
	 *
	 * @return the user name of this sez dev proposed project
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez dev proposed project.
	 *
	 * @return the user uuid of this sez dev proposed project
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
	 * Sets the airport km of this sez dev proposed project.
	 *
	 * @param airportKm the airport km of this sez dev proposed project
	 */
	@Override
	public void setAirportKm(String airportKm) {
		model.setAirportKm(airportKm);
	}

	/**
	 * Sets the airport mi of this sez dev proposed project.
	 *
	 * @param airportMi the airport mi of this sez dev proposed project
	 */
	@Override
	public void setAirportMi(String airportMi) {
		model.setAirportMi(airportMi);
	}

	/**
	 * Sets the applicant previously of this sez dev proposed project.
	 *
	 * @param applicantPreviously the applicant previously of this sez dev proposed project
	 */
	@Override
	public void setApplicantPreviously(String applicantPreviously) {
		model.setApplicantPreviously(applicantPreviously);
	}

	/**
	 * Sets the building of this sez dev proposed project.
	 *
	 * @param building the building of this sez dev proposed project
	 */
	@Override
	public void setBuilding(String building) {
		model.setBuilding(building);
	}

	/**
	 * Sets the business conducted zone of this sez dev proposed project.
	 *
	 * @param businessConductedZone the business conducted zone of this sez dev proposed project
	 */
	@Override
	public void setBusinessConductedZone(String businessConductedZone) {
		model.setBusinessConductedZone(businessConductedZone);
	}

	/**
	 * Sets the company ID of this sez dev proposed project.
	 *
	 * @param companyId the company ID of this sez dev proposed project
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez dev proposed project.
	 *
	 * @param createDate the create date of this sez dev proposed project
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the curently operating zone of this sez dev proposed project.
	 *
	 * @param curentlyOperatingZone the curently operating zone of this sez dev proposed project
	 */
	@Override
	public void setCurentlyOperatingZone(String curentlyOperatingZone) {
		model.setCurentlyOperatingZone(curentlyOperatingZone);
	}

	/**
	 * Sets the custom processing km of this sez dev proposed project.
	 *
	 * @param customProcessingKm the custom processing km of this sez dev proposed project
	 */
	@Override
	public void setCustomProcessingKm(String customProcessingKm) {
		model.setCustomProcessingKm(customProcessingKm);
	}

	/**
	 * Sets the custom processing mi of this sez dev proposed project.
	 *
	 * @param customProcessingMi the custom processing mi of this sez dev proposed project
	 */
	@Override
	public void setCustomProcessingMi(String customProcessingMi) {
		model.setCustomProcessingMi(customProcessingMi);
	}

	/**
	 * Sets the group ID of this sez dev proposed project.
	 *
	 * @param groupId the group ID of this sez dev proposed project
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the indicate the land measurement of this sez dev proposed project.
	 *
	 * @param indicateTheLandMeasurement the indicate the land measurement of this sez dev proposed project
	 */
	@Override
	public void setIndicateTheLandMeasurement(
		String indicateTheLandMeasurement) {

		model.setIndicateTheLandMeasurement(indicateTheLandMeasurement);
	}

	/**
	 * Sets the land area of this sez dev proposed project.
	 *
	 * @param landArea the land area of this sez dev proposed project
	 */
	@Override
	public void setLandArea(String landArea) {
		model.setLandArea(landArea);
	}

	/**
	 * Sets the land owner name of this sez dev proposed project.
	 *
	 * @param landOwnerName the land owner name of this sez dev proposed project
	 */
	@Override
	public void setLandOwnerName(String landOwnerName) {
		model.setLandOwnerName(landOwnerName);
	}

	/**
	 * Sets the lnad owner address one of this sez dev proposed project.
	 *
	 * @param lnadOwnerAddressOne the lnad owner address one of this sez dev proposed project
	 */
	@Override
	public void setLnadOwnerAddressOne(String lnadOwnerAddressOne) {
		model.setLnadOwnerAddressOne(lnadOwnerAddressOne);
	}

	/**
	 * Sets the lnad owner address two of this sez dev proposed project.
	 *
	 * @param lnadOwnerAddressTwo the lnad owner address two of this sez dev proposed project
	 */
	@Override
	public void setLnadOwnerAddressTwo(String lnadOwnerAddressTwo) {
		model.setLnadOwnerAddressTwo(lnadOwnerAddressTwo);
	}

	/**
	 * Sets the lnad owner tenure of this sez dev proposed project.
	 *
	 * @param lnadOwnerTenure the lnad owner tenure of this sez dev proposed project
	 */
	@Override
	public void setLnadOwnerTenure(String lnadOwnerTenure) {
		model.setLnadOwnerTenure(lnadOwnerTenure);
	}

	/**
	 * Sets the locally of this sez dev proposed project.
	 *
	 * @param locally the locally of this sez dev proposed project
	 */
	@Override
	public void setLocally(String locally) {
		model.setLocally(locally);
	}

	/**
	 * Sets the modified date of this sez dev proposed project.
	 *
	 * @param modifiedDate the modified date of this sez dev proposed project
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the other please specify of this sez dev proposed project.
	 *
	 * @param otherPleaseSpecify the other please specify of this sez dev proposed project
	 */
	@Override
	public void setOtherPleaseSpecify(String otherPleaseSpecify) {
		model.setOtherPleaseSpecify(otherPleaseSpecify);
	}

	/**
	 * Sets the overseas of this sez dev proposed project.
	 *
	 * @param overseas the overseas of this sez dev proposed project
	 */
	@Override
	public void setOverseas(String overseas) {
		model.setOverseas(overseas);
	}

	/**
	 * Sets the owner ship of this sez dev proposed project.
	 *
	 * @param ownerShip the owner ship of this sez dev proposed project
	 */
	@Override
	public void setOwnerShip(String ownerShip) {
		model.setOwnerShip(ownerShip);
	}

	/**
	 * Sets the please describe of this sez dev proposed project.
	 *
	 * @param pleaseDescribe the please describe of this sez dev proposed project
	 */
	@Override
	public void setPleaseDescribe(String pleaseDescribe) {
		model.setPleaseDescribe(pleaseDescribe);
	}

	/**
	 * Sets the please provide brief of this sez dev proposed project.
	 *
	 * @param pleaseProvideBrief the please provide brief of this sez dev proposed project
	 */
	@Override
	public void setPleaseProvideBrief(String pleaseProvideBrief) {
		model.setPleaseProvideBrief(pleaseProvideBrief);
	}

	/**
	 * Sets the previously free zone of this sez dev proposed project.
	 *
	 * @param previouslyFreeZone the previously free zone of this sez dev proposed project
	 */
	@Override
	public void setPreviouslyFreeZone(String previouslyFreeZone) {
		model.setPreviouslyFreeZone(previouslyFreeZone);
	}

	/**
	 * Sets the primary key of this sez dev proposed project.
	 *
	 * @param primaryKey the primary key of this sez dev proposed project
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposed name of this sez dev proposed project.
	 *
	 * @param proposedName the proposed name of this sez dev proposed project
	 */
	@Override
	public void setProposedName(String proposedName) {
		model.setProposedName(proposedName);
	}

	/**
	 * Sets the rail km of this sez dev proposed project.
	 *
	 * @param railKm the rail km of this sez dev proposed project
	 */
	@Override
	public void setRailKm(String railKm) {
		model.setRailKm(railKm);
	}

	/**
	 * Sets the rail mi of this sez dev proposed project.
	 *
	 * @param railMi the rail mi of this sez dev proposed project
	 */
	@Override
	public void setRailMi(String railMi) {
		model.setRailMi(railMi);
	}

	/**
	 * Sets the road km of this sez dev proposed project.
	 *
	 * @param roadKm the road km of this sez dev proposed project
	 */
	@Override
	public void setRoadKm(String roadKm) {
		model.setRoadKm(roadKm);
	}

	/**
	 * Sets the road mi of this sez dev proposed project.
	 *
	 * @param roadMi the road mi of this sez dev proposed project
	 */
	@Override
	public void setRoadMi(String roadMi) {
		model.setRoadMi(roadMi);
	}

	/**
	 * Sets the sea port km of this sez dev proposed project.
	 *
	 * @param seaPortKm the sea port km of this sez dev proposed project
	 */
	@Override
	public void setSeaPortKm(String seaPortKm) {
		model.setSeaPortKm(seaPortKm);
	}

	/**
	 * Sets the sea port mi of this sez dev proposed project.
	 *
	 * @param seaPortMi the sea port mi of this sez dev proposed project
	 */
	@Override
	public void setSeaPortMi(String seaPortMi) {
		model.setSeaPortMi(seaPortMi);
	}

	/**
	 * Sets the sez dev proposed project ID of this sez dev proposed project.
	 *
	 * @param sezDevProposedProjectId the sez dev proposed project ID of this sez dev proposed project
	 */
	@Override
	public void setSezDevProposedProjectId(long sezDevProposedProjectId) {
		model.setSezDevProposedProjectId(sezDevProposedProjectId);
	}

	/**
	 * Sets the sez status application ID of this sez dev proposed project.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez dev proposed project
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the special economic zone of this sez dev proposed project.
	 *
	 * @param specialEconomicZone the special economic zone of this sez dev proposed project
	 */
	@Override
	public void setSpecialEconomicZone(String specialEconomicZone) {
		model.setSpecialEconomicZone(specialEconomicZone);
	}

	/**
	 * Sets the state wheather the proposed area of this sez dev proposed project.
	 *
	 * @param stateWheatherTheProposedArea the state wheather the proposed area of this sez dev proposed project
	 */
	@Override
	public void setStateWheatherTheProposedArea(
		String stateWheatherTheProposedArea) {

		model.setStateWheatherTheProposedArea(stateWheatherTheProposedArea);
	}

	/**
	 * Sets the step to acquire land of this sez dev proposed project.
	 *
	 * @param stepToAcquireLand the step to acquire land of this sez dev proposed project
	 */
	@Override
	public void setStepToAcquireLand(String stepToAcquireLand) {
		model.setStepToAcquireLand(stepToAcquireLand);
	}

	/**
	 * Sets the user ID of this sez dev proposed project.
	 *
	 * @param userId the user ID of this sez dev proposed project
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez dev proposed project.
	 *
	 * @param userName the user name of this sez dev proposed project
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez dev proposed project.
	 *
	 * @param userUuid the user uuid of this sez dev proposed project
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
	protected SezDevProposedProjectWrapper wrap(
		SezDevProposedProject sezDevProposedProject) {

		return new SezDevProposedProjectWrapper(sezDevProposedProject);
	}

}