/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the SezDevProposedProject service. Represents a row in the &quot;nbp_sez_dev_proposed_project&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.sez.status.application.form.service.model.impl.SezDevProposedProjectModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.sez.status.application.form.service.model.impl.SezDevProposedProjectImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevProposedProject
 * @generated
 */
@ProviderType
public interface SezDevProposedProjectModel
	extends BaseModel<SezDevProposedProject>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sez dev proposed project model instance should use the {@link SezDevProposedProject} interface instead.
	 */

	/**
	 * Returns the primary key of this sez dev proposed project.
	 *
	 * @return the primary key of this sez dev proposed project
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sez dev proposed project.
	 *
	 * @param primaryKey the primary key of this sez dev proposed project
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sez dev proposed project ID of this sez dev proposed project.
	 *
	 * @return the sez dev proposed project ID of this sez dev proposed project
	 */
	public long getSezDevProposedProjectId();

	/**
	 * Sets the sez dev proposed project ID of this sez dev proposed project.
	 *
	 * @param sezDevProposedProjectId the sez dev proposed project ID of this sez dev proposed project
	 */
	public void setSezDevProposedProjectId(long sezDevProposedProjectId);

	/**
	 * Returns the group ID of this sez dev proposed project.
	 *
	 * @return the group ID of this sez dev proposed project
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this sez dev proposed project.
	 *
	 * @param groupId the group ID of this sez dev proposed project
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this sez dev proposed project.
	 *
	 * @return the company ID of this sez dev proposed project
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this sez dev proposed project.
	 *
	 * @param companyId the company ID of this sez dev proposed project
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this sez dev proposed project.
	 *
	 * @return the user ID of this sez dev proposed project
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this sez dev proposed project.
	 *
	 * @param userId the user ID of this sez dev proposed project
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this sez dev proposed project.
	 *
	 * @return the user uuid of this sez dev proposed project
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this sez dev proposed project.
	 *
	 * @param userUuid the user uuid of this sez dev proposed project
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this sez dev proposed project.
	 *
	 * @return the user name of this sez dev proposed project
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this sez dev proposed project.
	 *
	 * @param userName the user name of this sez dev proposed project
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this sez dev proposed project.
	 *
	 * @return the create date of this sez dev proposed project
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this sez dev proposed project.
	 *
	 * @param createDate the create date of this sez dev proposed project
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this sez dev proposed project.
	 *
	 * @return the modified date of this sez dev proposed project
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this sez dev proposed project.
	 *
	 * @param modifiedDate the modified date of this sez dev proposed project
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the previously free zone of this sez dev proposed project.
	 *
	 * @return the previously free zone of this sez dev proposed project
	 */
	@AutoEscape
	public String getPreviouslyFreeZone();

	/**
	 * Sets the previously free zone of this sez dev proposed project.
	 *
	 * @param previouslyFreeZone the previously free zone of this sez dev proposed project
	 */
	public void setPreviouslyFreeZone(String previouslyFreeZone);

	/**
	 * Returns the curently operating zone of this sez dev proposed project.
	 *
	 * @return the curently operating zone of this sez dev proposed project
	 */
	@AutoEscape
	public String getCurentlyOperatingZone();

	/**
	 * Sets the curently operating zone of this sez dev proposed project.
	 *
	 * @param curentlyOperatingZone the curently operating zone of this sez dev proposed project
	 */
	public void setCurentlyOperatingZone(String curentlyOperatingZone);

	/**
	 * Returns the business conducted zone of this sez dev proposed project.
	 *
	 * @return the business conducted zone of this sez dev proposed project
	 */
	@AutoEscape
	public String getBusinessConductedZone();

	/**
	 * Sets the business conducted zone of this sez dev proposed project.
	 *
	 * @param businessConductedZone the business conducted zone of this sez dev proposed project
	 */
	public void setBusinessConductedZone(String businessConductedZone);

	/**
	 * Returns the locally of this sez dev proposed project.
	 *
	 * @return the locally of this sez dev proposed project
	 */
	@AutoEscape
	public String getLocally();

	/**
	 * Sets the locally of this sez dev proposed project.
	 *
	 * @param locally the locally of this sez dev proposed project
	 */
	public void setLocally(String locally);

	/**
	 * Returns the overseas of this sez dev proposed project.
	 *
	 * @return the overseas of this sez dev proposed project
	 */
	@AutoEscape
	public String getOverseas();

	/**
	 * Sets the overseas of this sez dev proposed project.
	 *
	 * @param overseas the overseas of this sez dev proposed project
	 */
	public void setOverseas(String overseas);

	/**
	 * Returns the proposed name of this sez dev proposed project.
	 *
	 * @return the proposed name of this sez dev proposed project
	 */
	@AutoEscape
	public String getProposedName();

	/**
	 * Sets the proposed name of this sez dev proposed project.
	 *
	 * @param proposedName the proposed name of this sez dev proposed project
	 */
	public void setProposedName(String proposedName);

	/**
	 * Returns the special economic zone of this sez dev proposed project.
	 *
	 * @return the special economic zone of this sez dev proposed project
	 */
	@AutoEscape
	public String getSpecialEconomicZone();

	/**
	 * Sets the special economic zone of this sez dev proposed project.
	 *
	 * @param specialEconomicZone the special economic zone of this sez dev proposed project
	 */
	public void setSpecialEconomicZone(String specialEconomicZone);

	/**
	 * Returns the please describe of this sez dev proposed project.
	 *
	 * @return the please describe of this sez dev proposed project
	 */
	@AutoEscape
	public String getPleaseDescribe();

	/**
	 * Sets the please describe of this sez dev proposed project.
	 *
	 * @param pleaseDescribe the please describe of this sez dev proposed project
	 */
	public void setPleaseDescribe(String pleaseDescribe);

	/**
	 * Returns the sea port km of this sez dev proposed project.
	 *
	 * @return the sea port km of this sez dev proposed project
	 */
	@AutoEscape
	public String getSeaPortKm();

	/**
	 * Sets the sea port km of this sez dev proposed project.
	 *
	 * @param seaPortKm the sea port km of this sez dev proposed project
	 */
	public void setSeaPortKm(String seaPortKm);

	/**
	 * Returns the sea port mi of this sez dev proposed project.
	 *
	 * @return the sea port mi of this sez dev proposed project
	 */
	@AutoEscape
	public String getSeaPortMi();

	/**
	 * Sets the sea port mi of this sez dev proposed project.
	 *
	 * @param seaPortMi the sea port mi of this sez dev proposed project
	 */
	public void setSeaPortMi(String seaPortMi);

	/**
	 * Returns the airport km of this sez dev proposed project.
	 *
	 * @return the airport km of this sez dev proposed project
	 */
	@AutoEscape
	public String getAirportKm();

	/**
	 * Sets the airport km of this sez dev proposed project.
	 *
	 * @param airportKm the airport km of this sez dev proposed project
	 */
	public void setAirportKm(String airportKm);

	/**
	 * Returns the airport mi of this sez dev proposed project.
	 *
	 * @return the airport mi of this sez dev proposed project
	 */
	@AutoEscape
	public String getAirportMi();

	/**
	 * Sets the airport mi of this sez dev proposed project.
	 *
	 * @param airportMi the airport mi of this sez dev proposed project
	 */
	public void setAirportMi(String airportMi);

	/**
	 * Returns the road km of this sez dev proposed project.
	 *
	 * @return the road km of this sez dev proposed project
	 */
	@AutoEscape
	public String getRoadKm();

	/**
	 * Sets the road km of this sez dev proposed project.
	 *
	 * @param roadKm the road km of this sez dev proposed project
	 */
	public void setRoadKm(String roadKm);

	/**
	 * Returns the road mi of this sez dev proposed project.
	 *
	 * @return the road mi of this sez dev proposed project
	 */
	@AutoEscape
	public String getRoadMi();

	/**
	 * Sets the road mi of this sez dev proposed project.
	 *
	 * @param roadMi the road mi of this sez dev proposed project
	 */
	public void setRoadMi(String roadMi);

	/**
	 * Returns the rail km of this sez dev proposed project.
	 *
	 * @return the rail km of this sez dev proposed project
	 */
	@AutoEscape
	public String getRailKm();

	/**
	 * Sets the rail km of this sez dev proposed project.
	 *
	 * @param railKm the rail km of this sez dev proposed project
	 */
	public void setRailKm(String railKm);

	/**
	 * Returns the rail mi of this sez dev proposed project.
	 *
	 * @return the rail mi of this sez dev proposed project
	 */
	@AutoEscape
	public String getRailMi();

	/**
	 * Sets the rail mi of this sez dev proposed project.
	 *
	 * @param railMi the rail mi of this sez dev proposed project
	 */
	public void setRailMi(String railMi);

	/**
	 * Returns the custom processing km of this sez dev proposed project.
	 *
	 * @return the custom processing km of this sez dev proposed project
	 */
	@AutoEscape
	public String getCustomProcessingKm();

	/**
	 * Sets the custom processing km of this sez dev proposed project.
	 *
	 * @param customProcessingKm the custom processing km of this sez dev proposed project
	 */
	public void setCustomProcessingKm(String customProcessingKm);

	/**
	 * Returns the custom processing mi of this sez dev proposed project.
	 *
	 * @return the custom processing mi of this sez dev proposed project
	 */
	@AutoEscape
	public String getCustomProcessingMi();

	/**
	 * Sets the custom processing mi of this sez dev proposed project.
	 *
	 * @param customProcessingMi the custom processing mi of this sez dev proposed project
	 */
	public void setCustomProcessingMi(String customProcessingMi);

	/**
	 * Returns the indicate the land measurement of this sez dev proposed project.
	 *
	 * @return the indicate the land measurement of this sez dev proposed project
	 */
	@AutoEscape
	public String getIndicateTheLandMeasurement();

	/**
	 * Sets the indicate the land measurement of this sez dev proposed project.
	 *
	 * @param indicateTheLandMeasurement the indicate the land measurement of this sez dev proposed project
	 */
	public void setIndicateTheLandMeasurement(
		String indicateTheLandMeasurement);

	/**
	 * Returns the building of this sez dev proposed project.
	 *
	 * @return the building of this sez dev proposed project
	 */
	@AutoEscape
	public String getBuilding();

	/**
	 * Sets the building of this sez dev proposed project.
	 *
	 * @param building the building of this sez dev proposed project
	 */
	public void setBuilding(String building);

	/**
	 * Returns the land area of this sez dev proposed project.
	 *
	 * @return the land area of this sez dev proposed project
	 */
	@AutoEscape
	public String getLandArea();

	/**
	 * Sets the land area of this sez dev proposed project.
	 *
	 * @param landArea the land area of this sez dev proposed project
	 */
	public void setLandArea(String landArea);

	/**
	 * Returns the owner ship of this sez dev proposed project.
	 *
	 * @return the owner ship of this sez dev proposed project
	 */
	@AutoEscape
	public String getOwnerShip();

	/**
	 * Sets the owner ship of this sez dev proposed project.
	 *
	 * @param ownerShip the owner ship of this sez dev proposed project
	 */
	public void setOwnerShip(String ownerShip);

	/**
	 * Returns the other please specify of this sez dev proposed project.
	 *
	 * @return the other please specify of this sez dev proposed project
	 */
	@AutoEscape
	public String getOtherPleaseSpecify();

	/**
	 * Sets the other please specify of this sez dev proposed project.
	 *
	 * @param otherPleaseSpecify the other please specify of this sez dev proposed project
	 */
	public void setOtherPleaseSpecify(String otherPleaseSpecify);

	/**
	 * Returns the land owner name of this sez dev proposed project.
	 *
	 * @return the land owner name of this sez dev proposed project
	 */
	@AutoEscape
	public String getLandOwnerName();

	/**
	 * Sets the land owner name of this sez dev proposed project.
	 *
	 * @param landOwnerName the land owner name of this sez dev proposed project
	 */
	public void setLandOwnerName(String landOwnerName);

	/**
	 * Returns the lnad owner address one of this sez dev proposed project.
	 *
	 * @return the lnad owner address one of this sez dev proposed project
	 */
	@AutoEscape
	public String getLnadOwnerAddressOne();

	/**
	 * Sets the lnad owner address one of this sez dev proposed project.
	 *
	 * @param lnadOwnerAddressOne the lnad owner address one of this sez dev proposed project
	 */
	public void setLnadOwnerAddressOne(String lnadOwnerAddressOne);

	/**
	 * Returns the lnad owner address two of this sez dev proposed project.
	 *
	 * @return the lnad owner address two of this sez dev proposed project
	 */
	@AutoEscape
	public String getLnadOwnerAddressTwo();

	/**
	 * Sets the lnad owner address two of this sez dev proposed project.
	 *
	 * @param lnadOwnerAddressTwo the lnad owner address two of this sez dev proposed project
	 */
	public void setLnadOwnerAddressTwo(String lnadOwnerAddressTwo);

	/**
	 * Returns the lnad owner tenure of this sez dev proposed project.
	 *
	 * @return the lnad owner tenure of this sez dev proposed project
	 */
	@AutoEscape
	public String getLnadOwnerTenure();

	/**
	 * Sets the lnad owner tenure of this sez dev proposed project.
	 *
	 * @param lnadOwnerTenure the lnad owner tenure of this sez dev proposed project
	 */
	public void setLnadOwnerTenure(String lnadOwnerTenure);

	/**
	 * Returns the step to acquire land of this sez dev proposed project.
	 *
	 * @return the step to acquire land of this sez dev proposed project
	 */
	@AutoEscape
	public String getStepToAcquireLand();

	/**
	 * Sets the step to acquire land of this sez dev proposed project.
	 *
	 * @param stepToAcquireLand the step to acquire land of this sez dev proposed project
	 */
	public void setStepToAcquireLand(String stepToAcquireLand);

	/**
	 * Returns the state wheather the proposed area of this sez dev proposed project.
	 *
	 * @return the state wheather the proposed area of this sez dev proposed project
	 */
	@AutoEscape
	public String getStateWheatherTheProposedArea();

	/**
	 * Sets the state wheather the proposed area of this sez dev proposed project.
	 *
	 * @param stateWheatherTheProposedArea the state wheather the proposed area of this sez dev proposed project
	 */
	public void setStateWheatherTheProposedArea(
		String stateWheatherTheProposedArea);

	/**
	 * Returns the applicant previously of this sez dev proposed project.
	 *
	 * @return the applicant previously of this sez dev proposed project
	 */
	@AutoEscape
	public String getApplicantPreviously();

	/**
	 * Sets the applicant previously of this sez dev proposed project.
	 *
	 * @param applicantPreviously the applicant previously of this sez dev proposed project
	 */
	public void setApplicantPreviously(String applicantPreviously);

	/**
	 * Returns the please provide brief of this sez dev proposed project.
	 *
	 * @return the please provide brief of this sez dev proposed project
	 */
	@AutoEscape
	public String getPleaseProvideBrief();

	/**
	 * Sets the please provide brief of this sez dev proposed project.
	 *
	 * @param pleaseProvideBrief the please provide brief of this sez dev proposed project
	 */
	public void setPleaseProvideBrief(String pleaseProvideBrief);

	/**
	 * Returns the sez status application ID of this sez dev proposed project.
	 *
	 * @return the sez status application ID of this sez dev proposed project
	 */
	public long getSezStatusApplicationId();

	/**
	 * Sets the sez status application ID of this sez dev proposed project.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez dev proposed project
	 */
	public void setSezStatusApplicationId(long sezStatusApplicationId);

	@Override
	public SezDevProposedProject cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}