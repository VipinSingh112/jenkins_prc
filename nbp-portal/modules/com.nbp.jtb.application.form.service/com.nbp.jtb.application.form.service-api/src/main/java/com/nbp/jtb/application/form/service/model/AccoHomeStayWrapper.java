/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AccoHomeStay}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccoHomeStay
 * @generated
 */
public class AccoHomeStayWrapper
	extends BaseModelWrapper<AccoHomeStay>
	implements AccoHomeStay, ModelWrapper<AccoHomeStay> {

	public AccoHomeStayWrapper(AccoHomeStay accoHomeStay) {
		super(accoHomeStay);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("accoHomeStayId", getAccoHomeStayId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("homeAccoName", getHomeAccoName());
		attributes.put("homeOwnerName", getHomeOwnerName());
		attributes.put("propertyAddress", getPropertyAddress());
		attributes.put("homeTeleNo", getHomeTeleNo());
		attributes.put("homeMobile", getHomeMobile());
		attributes.put("homeEmail", getHomeEmail());
		attributes.put("homeEmployeeNo", getHomeEmployeeNo());
		attributes.put("website", getWebsite());
		attributes.put("propDirection", getPropDirection());
		attributes.put("numOfBedrooms", getNumOfBedrooms());
		attributes.put("numOfGuestBedroom", getNumOfGuestBedroom());
		attributes.put("withBathroom", getWithBathroom());
		attributes.put("sharedBathroom", getSharedBathroom());
		attributes.put("signDate", getSignDate());
		attributes.put("certifiedBy", getCertifiedBy());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accoHomeStayId = (Long)attributes.get("accoHomeStayId");

		if (accoHomeStayId != null) {
			setAccoHomeStayId(accoHomeStayId);
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

		String homeAccoName = (String)attributes.get("homeAccoName");

		if (homeAccoName != null) {
			setHomeAccoName(homeAccoName);
		}

		String homeOwnerName = (String)attributes.get("homeOwnerName");

		if (homeOwnerName != null) {
			setHomeOwnerName(homeOwnerName);
		}

		String propertyAddress = (String)attributes.get("propertyAddress");

		if (propertyAddress != null) {
			setPropertyAddress(propertyAddress);
		}

		String homeTeleNo = (String)attributes.get("homeTeleNo");

		if (homeTeleNo != null) {
			setHomeTeleNo(homeTeleNo);
		}

		String homeMobile = (String)attributes.get("homeMobile");

		if (homeMobile != null) {
			setHomeMobile(homeMobile);
		}

		String homeEmail = (String)attributes.get("homeEmail");

		if (homeEmail != null) {
			setHomeEmail(homeEmail);
		}

		String homeEmployeeNo = (String)attributes.get("homeEmployeeNo");

		if (homeEmployeeNo != null) {
			setHomeEmployeeNo(homeEmployeeNo);
		}

		String website = (String)attributes.get("website");

		if (website != null) {
			setWebsite(website);
		}

		String propDirection = (String)attributes.get("propDirection");

		if (propDirection != null) {
			setPropDirection(propDirection);
		}

		String numOfBedrooms = (String)attributes.get("numOfBedrooms");

		if (numOfBedrooms != null) {
			setNumOfBedrooms(numOfBedrooms);
		}

		String numOfGuestBedroom = (String)attributes.get("numOfGuestBedroom");

		if (numOfGuestBedroom != null) {
			setNumOfGuestBedroom(numOfGuestBedroom);
		}

		String withBathroom = (String)attributes.get("withBathroom");

		if (withBathroom != null) {
			setWithBathroom(withBathroom);
		}

		String sharedBathroom = (String)attributes.get("sharedBathroom");

		if (sharedBathroom != null) {
			setSharedBathroom(sharedBathroom);
		}

		Date signDate = (Date)attributes.get("signDate");

		if (signDate != null) {
			setSignDate(signDate);
		}

		String certifiedBy = (String)attributes.get("certifiedBy");

		if (certifiedBy != null) {
			setCertifiedBy(certifiedBy);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AccoHomeStay cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acco home stay ID of this acco home stay.
	 *
	 * @return the acco home stay ID of this acco home stay
	 */
	@Override
	public long getAccoHomeStayId() {
		return model.getAccoHomeStayId();
	}

	/**
	 * Returns the certified by of this acco home stay.
	 *
	 * @return the certified by of this acco home stay
	 */
	@Override
	public String getCertifiedBy() {
		return model.getCertifiedBy();
	}

	/**
	 * Returns the company ID of this acco home stay.
	 *
	 * @return the company ID of this acco home stay
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acco home stay.
	 *
	 * @return the create date of this acco home stay
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acco home stay.
	 *
	 * @return the group ID of this acco home stay
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the home acco name of this acco home stay.
	 *
	 * @return the home acco name of this acco home stay
	 */
	@Override
	public String getHomeAccoName() {
		return model.getHomeAccoName();
	}

	/**
	 * Returns the home email of this acco home stay.
	 *
	 * @return the home email of this acco home stay
	 */
	@Override
	public String getHomeEmail() {
		return model.getHomeEmail();
	}

	/**
	 * Returns the home employee no of this acco home stay.
	 *
	 * @return the home employee no of this acco home stay
	 */
	@Override
	public String getHomeEmployeeNo() {
		return model.getHomeEmployeeNo();
	}

	/**
	 * Returns the home mobile of this acco home stay.
	 *
	 * @return the home mobile of this acco home stay
	 */
	@Override
	public String getHomeMobile() {
		return model.getHomeMobile();
	}

	/**
	 * Returns the home owner name of this acco home stay.
	 *
	 * @return the home owner name of this acco home stay
	 */
	@Override
	public String getHomeOwnerName() {
		return model.getHomeOwnerName();
	}

	/**
	 * Returns the home tele no of this acco home stay.
	 *
	 * @return the home tele no of this acco home stay
	 */
	@Override
	public String getHomeTeleNo() {
		return model.getHomeTeleNo();
	}

	/**
	 * Returns the jtb application ID of this acco home stay.
	 *
	 * @return the jtb application ID of this acco home stay
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this acco home stay.
	 *
	 * @return the modified date of this acco home stay
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the num of bedrooms of this acco home stay.
	 *
	 * @return the num of bedrooms of this acco home stay
	 */
	@Override
	public String getNumOfBedrooms() {
		return model.getNumOfBedrooms();
	}

	/**
	 * Returns the num of guest bedroom of this acco home stay.
	 *
	 * @return the num of guest bedroom of this acco home stay
	 */
	@Override
	public String getNumOfGuestBedroom() {
		return model.getNumOfGuestBedroom();
	}

	/**
	 * Returns the primary key of this acco home stay.
	 *
	 * @return the primary key of this acco home stay
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the prop direction of this acco home stay.
	 *
	 * @return the prop direction of this acco home stay
	 */
	@Override
	public String getPropDirection() {
		return model.getPropDirection();
	}

	/**
	 * Returns the property address of this acco home stay.
	 *
	 * @return the property address of this acco home stay
	 */
	@Override
	public String getPropertyAddress() {
		return model.getPropertyAddress();
	}

	/**
	 * Returns the shared bathroom of this acco home stay.
	 *
	 * @return the shared bathroom of this acco home stay
	 */
	@Override
	public String getSharedBathroom() {
		return model.getSharedBathroom();
	}

	/**
	 * Returns the sign date of this acco home stay.
	 *
	 * @return the sign date of this acco home stay
	 */
	@Override
	public Date getSignDate() {
		return model.getSignDate();
	}

	/**
	 * Returns the user ID of this acco home stay.
	 *
	 * @return the user ID of this acco home stay
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acco home stay.
	 *
	 * @return the user name of this acco home stay
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acco home stay.
	 *
	 * @return the user uuid of this acco home stay
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acco home stay.
	 *
	 * @return the uuid of this acco home stay
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the website of this acco home stay.
	 *
	 * @return the website of this acco home stay
	 */
	@Override
	public String getWebsite() {
		return model.getWebsite();
	}

	/**
	 * Returns the with bathroom of this acco home stay.
	 *
	 * @return the with bathroom of this acco home stay
	 */
	@Override
	public String getWithBathroom() {
		return model.getWithBathroom();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the acco home stay ID of this acco home stay.
	 *
	 * @param accoHomeStayId the acco home stay ID of this acco home stay
	 */
	@Override
	public void setAccoHomeStayId(long accoHomeStayId) {
		model.setAccoHomeStayId(accoHomeStayId);
	}

	/**
	 * Sets the certified by of this acco home stay.
	 *
	 * @param certifiedBy the certified by of this acco home stay
	 */
	@Override
	public void setCertifiedBy(String certifiedBy) {
		model.setCertifiedBy(certifiedBy);
	}

	/**
	 * Sets the company ID of this acco home stay.
	 *
	 * @param companyId the company ID of this acco home stay
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acco home stay.
	 *
	 * @param createDate the create date of this acco home stay
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acco home stay.
	 *
	 * @param groupId the group ID of this acco home stay
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the home acco name of this acco home stay.
	 *
	 * @param homeAccoName the home acco name of this acco home stay
	 */
	@Override
	public void setHomeAccoName(String homeAccoName) {
		model.setHomeAccoName(homeAccoName);
	}

	/**
	 * Sets the home email of this acco home stay.
	 *
	 * @param homeEmail the home email of this acco home stay
	 */
	@Override
	public void setHomeEmail(String homeEmail) {
		model.setHomeEmail(homeEmail);
	}

	/**
	 * Sets the home employee no of this acco home stay.
	 *
	 * @param homeEmployeeNo the home employee no of this acco home stay
	 */
	@Override
	public void setHomeEmployeeNo(String homeEmployeeNo) {
		model.setHomeEmployeeNo(homeEmployeeNo);
	}

	/**
	 * Sets the home mobile of this acco home stay.
	 *
	 * @param homeMobile the home mobile of this acco home stay
	 */
	@Override
	public void setHomeMobile(String homeMobile) {
		model.setHomeMobile(homeMobile);
	}

	/**
	 * Sets the home owner name of this acco home stay.
	 *
	 * @param homeOwnerName the home owner name of this acco home stay
	 */
	@Override
	public void setHomeOwnerName(String homeOwnerName) {
		model.setHomeOwnerName(homeOwnerName);
	}

	/**
	 * Sets the home tele no of this acco home stay.
	 *
	 * @param homeTeleNo the home tele no of this acco home stay
	 */
	@Override
	public void setHomeTeleNo(String homeTeleNo) {
		model.setHomeTeleNo(homeTeleNo);
	}

	/**
	 * Sets the jtb application ID of this acco home stay.
	 *
	 * @param jtbApplicationId the jtb application ID of this acco home stay
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this acco home stay.
	 *
	 * @param modifiedDate the modified date of this acco home stay
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the num of bedrooms of this acco home stay.
	 *
	 * @param numOfBedrooms the num of bedrooms of this acco home stay
	 */
	@Override
	public void setNumOfBedrooms(String numOfBedrooms) {
		model.setNumOfBedrooms(numOfBedrooms);
	}

	/**
	 * Sets the num of guest bedroom of this acco home stay.
	 *
	 * @param numOfGuestBedroom the num of guest bedroom of this acco home stay
	 */
	@Override
	public void setNumOfGuestBedroom(String numOfGuestBedroom) {
		model.setNumOfGuestBedroom(numOfGuestBedroom);
	}

	/**
	 * Sets the primary key of this acco home stay.
	 *
	 * @param primaryKey the primary key of this acco home stay
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the prop direction of this acco home stay.
	 *
	 * @param propDirection the prop direction of this acco home stay
	 */
	@Override
	public void setPropDirection(String propDirection) {
		model.setPropDirection(propDirection);
	}

	/**
	 * Sets the property address of this acco home stay.
	 *
	 * @param propertyAddress the property address of this acco home stay
	 */
	@Override
	public void setPropertyAddress(String propertyAddress) {
		model.setPropertyAddress(propertyAddress);
	}

	/**
	 * Sets the shared bathroom of this acco home stay.
	 *
	 * @param sharedBathroom the shared bathroom of this acco home stay
	 */
	@Override
	public void setSharedBathroom(String sharedBathroom) {
		model.setSharedBathroom(sharedBathroom);
	}

	/**
	 * Sets the sign date of this acco home stay.
	 *
	 * @param signDate the sign date of this acco home stay
	 */
	@Override
	public void setSignDate(Date signDate) {
		model.setSignDate(signDate);
	}

	/**
	 * Sets the user ID of this acco home stay.
	 *
	 * @param userId the user ID of this acco home stay
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acco home stay.
	 *
	 * @param userName the user name of this acco home stay
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acco home stay.
	 *
	 * @param userUuid the user uuid of this acco home stay
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acco home stay.
	 *
	 * @param uuid the uuid of this acco home stay
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the website of this acco home stay.
	 *
	 * @param website the website of this acco home stay
	 */
	@Override
	public void setWebsite(String website) {
		model.setWebsite(website);
	}

	/**
	 * Sets the with bathroom of this acco home stay.
	 *
	 * @param withBathroom the with bathroom of this acco home stay
	 */
	@Override
	public void setWithBathroom(String withBathroom) {
		model.setWithBathroom(withBathroom);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected AccoHomeStayWrapper wrap(AccoHomeStay accoHomeStay) {
		return new AccoHomeStayWrapper(accoHomeStay);
	}

}