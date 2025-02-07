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
 * This class is a wrapper for {@link CreativeDirectorListinAddBox}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeDirectorListinAddBox
 * @generated
 */
public class CreativeDirectorListinAddBoxWrapper
	extends BaseModelWrapper<CreativeDirectorListinAddBox>
	implements CreativeDirectorListinAddBox,
			   ModelWrapper<CreativeDirectorListinAddBox> {

	public CreativeDirectorListinAddBoxWrapper(
		CreativeDirectorListinAddBox creativeDirectorListinAddBox) {

		super(creativeDirectorListinAddBox);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("creativeDirectorBoxId", getCreativeDirectorBoxId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("fullName", getFullName());
		attributes.put("title", getTitle());
		attributes.put("trn", getTrn());
		attributes.put("directorCountre", getDirectorCountre());
		attributes.put("CreativeApplicationId", getCreativeApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long creativeDirectorBoxId = (Long)attributes.get(
			"creativeDirectorBoxId");

		if (creativeDirectorBoxId != null) {
			setCreativeDirectorBoxId(creativeDirectorBoxId);
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

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String trn = (String)attributes.get("trn");

		if (trn != null) {
			setTrn(trn);
		}

		String directorCountre = (String)attributes.get("directorCountre");

		if (directorCountre != null) {
			setDirectorCountre(directorCountre);
		}

		Long CreativeApplicationId = (Long)attributes.get(
			"CreativeApplicationId");

		if (CreativeApplicationId != null) {
			setCreativeApplicationId(CreativeApplicationId);
		}
	}

	@Override
	public CreativeDirectorListinAddBox cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this creative director listin add box.
	 *
	 * @return the company ID of this creative director listin add box
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this creative director listin add box.
	 *
	 * @return the create date of this creative director listin add box
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the creative application ID of this creative director listin add box.
	 *
	 * @return the creative application ID of this creative director listin add box
	 */
	@Override
	public long getCreativeApplicationId() {
		return model.getCreativeApplicationId();
	}

	/**
	 * Returns the creative director box ID of this creative director listin add box.
	 *
	 * @return the creative director box ID of this creative director listin add box
	 */
	@Override
	public long getCreativeDirectorBoxId() {
		return model.getCreativeDirectorBoxId();
	}

	/**
	 * Returns the director countre of this creative director listin add box.
	 *
	 * @return the director countre of this creative director listin add box
	 */
	@Override
	public String getDirectorCountre() {
		return model.getDirectorCountre();
	}

	/**
	 * Returns the full name of this creative director listin add box.
	 *
	 * @return the full name of this creative director listin add box
	 */
	@Override
	public String getFullName() {
		return model.getFullName();
	}

	/**
	 * Returns the group ID of this creative director listin add box.
	 *
	 * @return the group ID of this creative director listin add box
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this creative director listin add box.
	 *
	 * @return the modified date of this creative director listin add box
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this creative director listin add box.
	 *
	 * @return the primary key of this creative director listin add box
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the title of this creative director listin add box.
	 *
	 * @return the title of this creative director listin add box
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the trn of this creative director listin add box.
	 *
	 * @return the trn of this creative director listin add box
	 */
	@Override
	public String getTrn() {
		return model.getTrn();
	}

	/**
	 * Returns the user ID of this creative director listin add box.
	 *
	 * @return the user ID of this creative director listin add box
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this creative director listin add box.
	 *
	 * @return the user name of this creative director listin add box
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this creative director listin add box.
	 *
	 * @return the user uuid of this creative director listin add box
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
	 * Sets the company ID of this creative director listin add box.
	 *
	 * @param companyId the company ID of this creative director listin add box
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this creative director listin add box.
	 *
	 * @param createDate the create date of this creative director listin add box
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the creative application ID of this creative director listin add box.
	 *
	 * @param CreativeApplicationId the creative application ID of this creative director listin add box
	 */
	@Override
	public void setCreativeApplicationId(long CreativeApplicationId) {
		model.setCreativeApplicationId(CreativeApplicationId);
	}

	/**
	 * Sets the creative director box ID of this creative director listin add box.
	 *
	 * @param creativeDirectorBoxId the creative director box ID of this creative director listin add box
	 */
	@Override
	public void setCreativeDirectorBoxId(long creativeDirectorBoxId) {
		model.setCreativeDirectorBoxId(creativeDirectorBoxId);
	}

	/**
	 * Sets the director countre of this creative director listin add box.
	 *
	 * @param directorCountre the director countre of this creative director listin add box
	 */
	@Override
	public void setDirectorCountre(String directorCountre) {
		model.setDirectorCountre(directorCountre);
	}

	/**
	 * Sets the full name of this creative director listin add box.
	 *
	 * @param fullName the full name of this creative director listin add box
	 */
	@Override
	public void setFullName(String fullName) {
		model.setFullName(fullName);
	}

	/**
	 * Sets the group ID of this creative director listin add box.
	 *
	 * @param groupId the group ID of this creative director listin add box
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this creative director listin add box.
	 *
	 * @param modifiedDate the modified date of this creative director listin add box
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this creative director listin add box.
	 *
	 * @param primaryKey the primary key of this creative director listin add box
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the title of this creative director listin add box.
	 *
	 * @param title the title of this creative director listin add box
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	/**
	 * Sets the trn of this creative director listin add box.
	 *
	 * @param trn the trn of this creative director listin add box
	 */
	@Override
	public void setTrn(String trn) {
		model.setTrn(trn);
	}

	/**
	 * Sets the user ID of this creative director listin add box.
	 *
	 * @param userId the user ID of this creative director listin add box
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this creative director listin add box.
	 *
	 * @param userName the user name of this creative director listin add box
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this creative director listin add box.
	 *
	 * @param userUuid the user uuid of this creative director listin add box
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
	protected CreativeDirectorListinAddBoxWrapper wrap(
		CreativeDirectorListinAddBox creativeDirectorListinAddBox) {

		return new CreativeDirectorListinAddBoxWrapper(
			creativeDirectorListinAddBox);
	}

}