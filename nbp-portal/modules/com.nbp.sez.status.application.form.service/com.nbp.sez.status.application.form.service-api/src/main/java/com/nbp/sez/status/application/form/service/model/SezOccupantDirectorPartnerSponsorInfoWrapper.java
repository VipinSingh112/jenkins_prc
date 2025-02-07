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
 * This class is a wrapper for {@link SezOccupantDirectorPartnerSponsorInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantDirectorPartnerSponsorInfo
 * @generated
 */
public class SezOccupantDirectorPartnerSponsorInfoWrapper
	extends BaseModelWrapper<SezOccupantDirectorPartnerSponsorInfo>
	implements ModelWrapper<SezOccupantDirectorPartnerSponsorInfo>,
			   SezOccupantDirectorPartnerSponsorInfo {

	public SezOccupantDirectorPartnerSponsorInfoWrapper(
		SezOccupantDirectorPartnerSponsorInfo
			sezOccupantDirectorPartnerSponsorInfo) {

		super(sezOccupantDirectorPartnerSponsorInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezOccDirectSpoId", getSezOccDirectSpoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("occAppDate", getOccAppDate());
		attributes.put("occDirectorName", getOccDirectorName());
		attributes.put(
			"occDirectorStreetAddress", getOccDirectorStreetAddress());
		attributes.put("occDirectorZipCode", getOccDirectorZipCode());
		attributes.put("occDirectorCountry", getOccDirectorCountry());
		attributes.put("counter", getCounter());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezOccDirectSpoId = (Long)attributes.get("sezOccDirectSpoId");

		if (sezOccDirectSpoId != null) {
			setSezOccDirectSpoId(sezOccDirectSpoId);
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

		Date occAppDate = (Date)attributes.get("occAppDate");

		if (occAppDate != null) {
			setOccAppDate(occAppDate);
		}

		String occDirectorName = (String)attributes.get("occDirectorName");

		if (occDirectorName != null) {
			setOccDirectorName(occDirectorName);
		}

		String occDirectorStreetAddress = (String)attributes.get(
			"occDirectorStreetAddress");

		if (occDirectorStreetAddress != null) {
			setOccDirectorStreetAddress(occDirectorStreetAddress);
		}

		String occDirectorZipCode = (String)attributes.get(
			"occDirectorZipCode");

		if (occDirectorZipCode != null) {
			setOccDirectorZipCode(occDirectorZipCode);
		}

		String occDirectorCountry = (String)attributes.get(
			"occDirectorCountry");

		if (occDirectorCountry != null) {
			setOccDirectorCountry(occDirectorCountry);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezOccupantDirectorPartnerSponsorInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez occupant director partner sponsor info.
	 *
	 * @return the company ID of this sez occupant director partner sponsor info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this sez occupant director partner sponsor info.
	 *
	 * @return the counter of this sez occupant director partner sponsor info
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this sez occupant director partner sponsor info.
	 *
	 * @return the create date of this sez occupant director partner sponsor info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez occupant director partner sponsor info.
	 *
	 * @return the group ID of this sez occupant director partner sponsor info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez occupant director partner sponsor info.
	 *
	 * @return the modified date of this sez occupant director partner sponsor info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the occ app date of this sez occupant director partner sponsor info.
	 *
	 * @return the occ app date of this sez occupant director partner sponsor info
	 */
	@Override
	public Date getOccAppDate() {
		return model.getOccAppDate();
	}

	/**
	 * Returns the occ director country of this sez occupant director partner sponsor info.
	 *
	 * @return the occ director country of this sez occupant director partner sponsor info
	 */
	@Override
	public String getOccDirectorCountry() {
		return model.getOccDirectorCountry();
	}

	/**
	 * Returns the occ director name of this sez occupant director partner sponsor info.
	 *
	 * @return the occ director name of this sez occupant director partner sponsor info
	 */
	@Override
	public String getOccDirectorName() {
		return model.getOccDirectorName();
	}

	/**
	 * Returns the occ director street address of this sez occupant director partner sponsor info.
	 *
	 * @return the occ director street address of this sez occupant director partner sponsor info
	 */
	@Override
	public String getOccDirectorStreetAddress() {
		return model.getOccDirectorStreetAddress();
	}

	/**
	 * Returns the occ director zip code of this sez occupant director partner sponsor info.
	 *
	 * @return the occ director zip code of this sez occupant director partner sponsor info
	 */
	@Override
	public String getOccDirectorZipCode() {
		return model.getOccDirectorZipCode();
	}

	/**
	 * Returns the primary key of this sez occupant director partner sponsor info.
	 *
	 * @return the primary key of this sez occupant director partner sponsor info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez occ direct spo ID of this sez occupant director partner sponsor info.
	 *
	 * @return the sez occ direct spo ID of this sez occupant director partner sponsor info
	 */
	@Override
	public long getSezOccDirectSpoId() {
		return model.getSezOccDirectSpoId();
	}

	/**
	 * Returns the sez status application ID of this sez occupant director partner sponsor info.
	 *
	 * @return the sez status application ID of this sez occupant director partner sponsor info
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the user ID of this sez occupant director partner sponsor info.
	 *
	 * @return the user ID of this sez occupant director partner sponsor info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez occupant director partner sponsor info.
	 *
	 * @return the user name of this sez occupant director partner sponsor info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez occupant director partner sponsor info.
	 *
	 * @return the user uuid of this sez occupant director partner sponsor info
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
	 * Sets the company ID of this sez occupant director partner sponsor info.
	 *
	 * @param companyId the company ID of this sez occupant director partner sponsor info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this sez occupant director partner sponsor info.
	 *
	 * @param counter the counter of this sez occupant director partner sponsor info
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this sez occupant director partner sponsor info.
	 *
	 * @param createDate the create date of this sez occupant director partner sponsor info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez occupant director partner sponsor info.
	 *
	 * @param groupId the group ID of this sez occupant director partner sponsor info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez occupant director partner sponsor info.
	 *
	 * @param modifiedDate the modified date of this sez occupant director partner sponsor info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the occ app date of this sez occupant director partner sponsor info.
	 *
	 * @param occAppDate the occ app date of this sez occupant director partner sponsor info
	 */
	@Override
	public void setOccAppDate(Date occAppDate) {
		model.setOccAppDate(occAppDate);
	}

	/**
	 * Sets the occ director country of this sez occupant director partner sponsor info.
	 *
	 * @param occDirectorCountry the occ director country of this sez occupant director partner sponsor info
	 */
	@Override
	public void setOccDirectorCountry(String occDirectorCountry) {
		model.setOccDirectorCountry(occDirectorCountry);
	}

	/**
	 * Sets the occ director name of this sez occupant director partner sponsor info.
	 *
	 * @param occDirectorName the occ director name of this sez occupant director partner sponsor info
	 */
	@Override
	public void setOccDirectorName(String occDirectorName) {
		model.setOccDirectorName(occDirectorName);
	}

	/**
	 * Sets the occ director street address of this sez occupant director partner sponsor info.
	 *
	 * @param occDirectorStreetAddress the occ director street address of this sez occupant director partner sponsor info
	 */
	@Override
	public void setOccDirectorStreetAddress(String occDirectorStreetAddress) {
		model.setOccDirectorStreetAddress(occDirectorStreetAddress);
	}

	/**
	 * Sets the occ director zip code of this sez occupant director partner sponsor info.
	 *
	 * @param occDirectorZipCode the occ director zip code of this sez occupant director partner sponsor info
	 */
	@Override
	public void setOccDirectorZipCode(String occDirectorZipCode) {
		model.setOccDirectorZipCode(occDirectorZipCode);
	}

	/**
	 * Sets the primary key of this sez occupant director partner sponsor info.
	 *
	 * @param primaryKey the primary key of this sez occupant director partner sponsor info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez occ direct spo ID of this sez occupant director partner sponsor info.
	 *
	 * @param sezOccDirectSpoId the sez occ direct spo ID of this sez occupant director partner sponsor info
	 */
	@Override
	public void setSezOccDirectSpoId(long sezOccDirectSpoId) {
		model.setSezOccDirectSpoId(sezOccDirectSpoId);
	}

	/**
	 * Sets the sez status application ID of this sez occupant director partner sponsor info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez occupant director partner sponsor info
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the user ID of this sez occupant director partner sponsor info.
	 *
	 * @param userId the user ID of this sez occupant director partner sponsor info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez occupant director partner sponsor info.
	 *
	 * @param userName the user name of this sez occupant director partner sponsor info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez occupant director partner sponsor info.
	 *
	 * @param userUuid the user uuid of this sez occupant director partner sponsor info
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
	protected SezOccupantDirectorPartnerSponsorInfoWrapper wrap(
		SezOccupantDirectorPartnerSponsorInfo
			sezOccupantDirectorPartnerSponsorInfo) {

		return new SezOccupantDirectorPartnerSponsorInfoWrapper(
			sezOccupantDirectorPartnerSponsorInfo);
	}

}