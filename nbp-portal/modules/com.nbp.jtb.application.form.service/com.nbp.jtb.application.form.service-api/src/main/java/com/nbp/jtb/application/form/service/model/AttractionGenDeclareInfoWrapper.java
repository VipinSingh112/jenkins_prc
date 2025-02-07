/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AttractionGenDeclareInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionGenDeclareInfo
 * @generated
 */
public class AttractionGenDeclareInfoWrapper
	extends BaseModelWrapper<AttractionGenDeclareInfo>
	implements AttractionGenDeclareInfo,
			   ModelWrapper<AttractionGenDeclareInfo> {

	public AttractionGenDeclareInfoWrapper(
		AttractionGenDeclareInfo attractionGenDeclareInfo) {

		super(attractionGenDeclareInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"attractionGenDeclareInfoId", getAttractionGenDeclareInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"newAttractionsGenOwnerName", getNewAttractionsGenOwnerName());
		attributes.put(
			"newAttractionsCompanyLaw", getNewAttractionsCompanyLaw());
		attributes.put("newAttractionsDate", getNewAttractionsDate());
		attributes.put("newAttractionsName", getNewAttractionsName());
		attributes.put("newAttractionsStartDate", getNewAttractionsStartDate());
		attributes.put(
			"newAttractionsSituatedLand", getNewAttractionsSituatedLand());
		attributes.put(
			"newAttractionsActivities", getNewAttractionsActivities());
		attributes.put("attractionNewDate", getAttractionNewDate());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attractionGenDeclareInfoId = (Long)attributes.get(
			"attractionGenDeclareInfoId");

		if (attractionGenDeclareInfoId != null) {
			setAttractionGenDeclareInfoId(attractionGenDeclareInfoId);
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

		String newAttractionsGenOwnerName = (String)attributes.get(
			"newAttractionsGenOwnerName");

		if (newAttractionsGenOwnerName != null) {
			setNewAttractionsGenOwnerName(newAttractionsGenOwnerName);
		}

		String newAttractionsCompanyLaw = (String)attributes.get(
			"newAttractionsCompanyLaw");

		if (newAttractionsCompanyLaw != null) {
			setNewAttractionsCompanyLaw(newAttractionsCompanyLaw);
		}

		Date newAttractionsDate = (Date)attributes.get("newAttractionsDate");

		if (newAttractionsDate != null) {
			setNewAttractionsDate(newAttractionsDate);
		}

		String newAttractionsName = (String)attributes.get(
			"newAttractionsName");

		if (newAttractionsName != null) {
			setNewAttractionsName(newAttractionsName);
		}

		Date newAttractionsStartDate = (Date)attributes.get(
			"newAttractionsStartDate");

		if (newAttractionsStartDate != null) {
			setNewAttractionsStartDate(newAttractionsStartDate);
		}

		String newAttractionsSituatedLand = (String)attributes.get(
			"newAttractionsSituatedLand");

		if (newAttractionsSituatedLand != null) {
			setNewAttractionsSituatedLand(newAttractionsSituatedLand);
		}

		String newAttractionsActivities = (String)attributes.get(
			"newAttractionsActivities");

		if (newAttractionsActivities != null) {
			setNewAttractionsActivities(newAttractionsActivities);
		}

		Date attractionNewDate = (Date)attributes.get("attractionNewDate");

		if (attractionNewDate != null) {
			setAttractionNewDate(attractionNewDate);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AttractionGenDeclareInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the attraction gen declare info ID of this attraction gen declare info.
	 *
	 * @return the attraction gen declare info ID of this attraction gen declare info
	 */
	@Override
	public long getAttractionGenDeclareInfoId() {
		return model.getAttractionGenDeclareInfoId();
	}

	/**
	 * Returns the attraction new date of this attraction gen declare info.
	 *
	 * @return the attraction new date of this attraction gen declare info
	 */
	@Override
	public Date getAttractionNewDate() {
		return model.getAttractionNewDate();
	}

	/**
	 * Returns the company ID of this attraction gen declare info.
	 *
	 * @return the company ID of this attraction gen declare info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this attraction gen declare info.
	 *
	 * @return the create date of this attraction gen declare info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this attraction gen declare info.
	 *
	 * @return the group ID of this attraction gen declare info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb application ID of this attraction gen declare info.
	 *
	 * @return the jtb application ID of this attraction gen declare info
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this attraction gen declare info.
	 *
	 * @return the modified date of this attraction gen declare info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the new attractions activities of this attraction gen declare info.
	 *
	 * @return the new attractions activities of this attraction gen declare info
	 */
	@Override
	public String getNewAttractionsActivities() {
		return model.getNewAttractionsActivities();
	}

	/**
	 * Returns the new attractions company law of this attraction gen declare info.
	 *
	 * @return the new attractions company law of this attraction gen declare info
	 */
	@Override
	public String getNewAttractionsCompanyLaw() {
		return model.getNewAttractionsCompanyLaw();
	}

	/**
	 * Returns the new attractions date of this attraction gen declare info.
	 *
	 * @return the new attractions date of this attraction gen declare info
	 */
	@Override
	public Date getNewAttractionsDate() {
		return model.getNewAttractionsDate();
	}

	/**
	 * Returns the new attractions gen owner name of this attraction gen declare info.
	 *
	 * @return the new attractions gen owner name of this attraction gen declare info
	 */
	@Override
	public String getNewAttractionsGenOwnerName() {
		return model.getNewAttractionsGenOwnerName();
	}

	/**
	 * Returns the new attractions name of this attraction gen declare info.
	 *
	 * @return the new attractions name of this attraction gen declare info
	 */
	@Override
	public String getNewAttractionsName() {
		return model.getNewAttractionsName();
	}

	/**
	 * Returns the new attractions situated land of this attraction gen declare info.
	 *
	 * @return the new attractions situated land of this attraction gen declare info
	 */
	@Override
	public String getNewAttractionsSituatedLand() {
		return model.getNewAttractionsSituatedLand();
	}

	/**
	 * Returns the new attractions start date of this attraction gen declare info.
	 *
	 * @return the new attractions start date of this attraction gen declare info
	 */
	@Override
	public Date getNewAttractionsStartDate() {
		return model.getNewAttractionsStartDate();
	}

	/**
	 * Returns the primary key of this attraction gen declare info.
	 *
	 * @return the primary key of this attraction gen declare info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this attraction gen declare info.
	 *
	 * @return the user ID of this attraction gen declare info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this attraction gen declare info.
	 *
	 * @return the user name of this attraction gen declare info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this attraction gen declare info.
	 *
	 * @return the user uuid of this attraction gen declare info
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
	 * Sets the attraction gen declare info ID of this attraction gen declare info.
	 *
	 * @param attractionGenDeclareInfoId the attraction gen declare info ID of this attraction gen declare info
	 */
	@Override
	public void setAttractionGenDeclareInfoId(long attractionGenDeclareInfoId) {
		model.setAttractionGenDeclareInfoId(attractionGenDeclareInfoId);
	}

	/**
	 * Sets the attraction new date of this attraction gen declare info.
	 *
	 * @param attractionNewDate the attraction new date of this attraction gen declare info
	 */
	@Override
	public void setAttractionNewDate(Date attractionNewDate) {
		model.setAttractionNewDate(attractionNewDate);
	}

	/**
	 * Sets the company ID of this attraction gen declare info.
	 *
	 * @param companyId the company ID of this attraction gen declare info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this attraction gen declare info.
	 *
	 * @param createDate the create date of this attraction gen declare info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this attraction gen declare info.
	 *
	 * @param groupId the group ID of this attraction gen declare info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb application ID of this attraction gen declare info.
	 *
	 * @param jtbApplicationId the jtb application ID of this attraction gen declare info
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this attraction gen declare info.
	 *
	 * @param modifiedDate the modified date of this attraction gen declare info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the new attractions activities of this attraction gen declare info.
	 *
	 * @param newAttractionsActivities the new attractions activities of this attraction gen declare info
	 */
	@Override
	public void setNewAttractionsActivities(String newAttractionsActivities) {
		model.setNewAttractionsActivities(newAttractionsActivities);
	}

	/**
	 * Sets the new attractions company law of this attraction gen declare info.
	 *
	 * @param newAttractionsCompanyLaw the new attractions company law of this attraction gen declare info
	 */
	@Override
	public void setNewAttractionsCompanyLaw(String newAttractionsCompanyLaw) {
		model.setNewAttractionsCompanyLaw(newAttractionsCompanyLaw);
	}

	/**
	 * Sets the new attractions date of this attraction gen declare info.
	 *
	 * @param newAttractionsDate the new attractions date of this attraction gen declare info
	 */
	@Override
	public void setNewAttractionsDate(Date newAttractionsDate) {
		model.setNewAttractionsDate(newAttractionsDate);
	}

	/**
	 * Sets the new attractions gen owner name of this attraction gen declare info.
	 *
	 * @param newAttractionsGenOwnerName the new attractions gen owner name of this attraction gen declare info
	 */
	@Override
	public void setNewAttractionsGenOwnerName(
		String newAttractionsGenOwnerName) {

		model.setNewAttractionsGenOwnerName(newAttractionsGenOwnerName);
	}

	/**
	 * Sets the new attractions name of this attraction gen declare info.
	 *
	 * @param newAttractionsName the new attractions name of this attraction gen declare info
	 */
	@Override
	public void setNewAttractionsName(String newAttractionsName) {
		model.setNewAttractionsName(newAttractionsName);
	}

	/**
	 * Sets the new attractions situated land of this attraction gen declare info.
	 *
	 * @param newAttractionsSituatedLand the new attractions situated land of this attraction gen declare info
	 */
	@Override
	public void setNewAttractionsSituatedLand(
		String newAttractionsSituatedLand) {

		model.setNewAttractionsSituatedLand(newAttractionsSituatedLand);
	}

	/**
	 * Sets the new attractions start date of this attraction gen declare info.
	 *
	 * @param newAttractionsStartDate the new attractions start date of this attraction gen declare info
	 */
	@Override
	public void setNewAttractionsStartDate(Date newAttractionsStartDate) {
		model.setNewAttractionsStartDate(newAttractionsStartDate);
	}

	/**
	 * Sets the primary key of this attraction gen declare info.
	 *
	 * @param primaryKey the primary key of this attraction gen declare info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this attraction gen declare info.
	 *
	 * @param userId the user ID of this attraction gen declare info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this attraction gen declare info.
	 *
	 * @param userName the user name of this attraction gen declare info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this attraction gen declare info.
	 *
	 * @param userUuid the user uuid of this attraction gen declare info
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
	protected AttractionGenDeclareInfoWrapper wrap(
		AttractionGenDeclareInfo attractionGenDeclareInfo) {

		return new AttractionGenDeclareInfoWrapper(attractionGenDeclareInfo);
	}

}