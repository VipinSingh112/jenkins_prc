/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CreativeSocialMediaAddBox}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeSocialMediaAddBox
 * @generated
 */
public class CreativeSocialMediaAddBoxWrapper
	extends BaseModelWrapper<CreativeSocialMediaAddBox>
	implements CreativeSocialMediaAddBox,
			   ModelWrapper<CreativeSocialMediaAddBox> {

	public CreativeSocialMediaAddBoxWrapper(
		CreativeSocialMediaAddBox creativeSocialMediaAddBox) {

		super(creativeSocialMediaAddBox);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("creativeSocialBoxId", getCreativeSocialBoxId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("socialMedia", getSocialMedia());
		attributes.put("profileName", getProfileName());
		attributes.put("counterSocislMedia", getCounterSocislMedia());
		attributes.put("CreativeApplicationId", getCreativeApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long creativeSocialBoxId = (Long)attributes.get("creativeSocialBoxId");

		if (creativeSocialBoxId != null) {
			setCreativeSocialBoxId(creativeSocialBoxId);
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

		String socialMedia = (String)attributes.get("socialMedia");

		if (socialMedia != null) {
			setSocialMedia(socialMedia);
		}

		String profileName = (String)attributes.get("profileName");

		if (profileName != null) {
			setProfileName(profileName);
		}

		String counterSocislMedia = (String)attributes.get(
			"counterSocislMedia");

		if (counterSocislMedia != null) {
			setCounterSocislMedia(counterSocislMedia);
		}

		Long CreativeApplicationId = (Long)attributes.get(
			"CreativeApplicationId");

		if (CreativeApplicationId != null) {
			setCreativeApplicationId(CreativeApplicationId);
		}
	}

	@Override
	public CreativeSocialMediaAddBox cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this creative social media add box.
	 *
	 * @return the company ID of this creative social media add box
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter socisl media of this creative social media add box.
	 *
	 * @return the counter socisl media of this creative social media add box
	 */
	@Override
	public String getCounterSocislMedia() {
		return model.getCounterSocislMedia();
	}

	/**
	 * Returns the create date of this creative social media add box.
	 *
	 * @return the create date of this creative social media add box
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the creative application ID of this creative social media add box.
	 *
	 * @return the creative application ID of this creative social media add box
	 */
	@Override
	public long getCreativeApplicationId() {
		return model.getCreativeApplicationId();
	}

	/**
	 * Returns the creative social box ID of this creative social media add box.
	 *
	 * @return the creative social box ID of this creative social media add box
	 */
	@Override
	public long getCreativeSocialBoxId() {
		return model.getCreativeSocialBoxId();
	}

	/**
	 * Returns the group ID of this creative social media add box.
	 *
	 * @return the group ID of this creative social media add box
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this creative social media add box.
	 *
	 * @return the modified date of this creative social media add box
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this creative social media add box.
	 *
	 * @return the primary key of this creative social media add box
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the profile name of this creative social media add box.
	 *
	 * @return the profile name of this creative social media add box
	 */
	@Override
	public String getProfileName() {
		return model.getProfileName();
	}

	/**
	 * Returns the social media of this creative social media add box.
	 *
	 * @return the social media of this creative social media add box
	 */
	@Override
	public String getSocialMedia() {
		return model.getSocialMedia();
	}

	/**
	 * Returns the user ID of this creative social media add box.
	 *
	 * @return the user ID of this creative social media add box
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this creative social media add box.
	 *
	 * @return the user name of this creative social media add box
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this creative social media add box.
	 *
	 * @return the user uuid of this creative social media add box
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
	 * Sets the company ID of this creative social media add box.
	 *
	 * @param companyId the company ID of this creative social media add box
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter socisl media of this creative social media add box.
	 *
	 * @param counterSocislMedia the counter socisl media of this creative social media add box
	 */
	@Override
	public void setCounterSocislMedia(String counterSocislMedia) {
		model.setCounterSocislMedia(counterSocislMedia);
	}

	/**
	 * Sets the create date of this creative social media add box.
	 *
	 * @param createDate the create date of this creative social media add box
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the creative application ID of this creative social media add box.
	 *
	 * @param CreativeApplicationId the creative application ID of this creative social media add box
	 */
	@Override
	public void setCreativeApplicationId(long CreativeApplicationId) {
		model.setCreativeApplicationId(CreativeApplicationId);
	}

	/**
	 * Sets the creative social box ID of this creative social media add box.
	 *
	 * @param creativeSocialBoxId the creative social box ID of this creative social media add box
	 */
	@Override
	public void setCreativeSocialBoxId(long creativeSocialBoxId) {
		model.setCreativeSocialBoxId(creativeSocialBoxId);
	}

	/**
	 * Sets the group ID of this creative social media add box.
	 *
	 * @param groupId the group ID of this creative social media add box
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this creative social media add box.
	 *
	 * @param modifiedDate the modified date of this creative social media add box
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this creative social media add box.
	 *
	 * @param primaryKey the primary key of this creative social media add box
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the profile name of this creative social media add box.
	 *
	 * @param profileName the profile name of this creative social media add box
	 */
	@Override
	public void setProfileName(String profileName) {
		model.setProfileName(profileName);
	}

	/**
	 * Sets the social media of this creative social media add box.
	 *
	 * @param socialMedia the social media of this creative social media add box
	 */
	@Override
	public void setSocialMedia(String socialMedia) {
		model.setSocialMedia(socialMedia);
	}

	/**
	 * Sets the user ID of this creative social media add box.
	 *
	 * @param userId the user ID of this creative social media add box
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this creative social media add box.
	 *
	 * @param userName the user name of this creative social media add box
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this creative social media add box.
	 *
	 * @param userUuid the user uuid of this creative social media add box
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
	protected CreativeSocialMediaAddBoxWrapper wrap(
		CreativeSocialMediaAddBox creativeSocialMediaAddBox) {

		return new CreativeSocialMediaAddBoxWrapper(creativeSocialMediaAddBox);
	}

}