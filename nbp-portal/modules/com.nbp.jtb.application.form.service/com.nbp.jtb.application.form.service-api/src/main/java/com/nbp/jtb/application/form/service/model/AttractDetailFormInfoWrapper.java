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
 * This class is a wrapper for {@link AttractDetailFormInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractDetailFormInfo
 * @generated
 */
public class AttractDetailFormInfoWrapper
	extends BaseModelWrapper<AttractDetailFormInfo>
	implements AttractDetailFormInfo, ModelWrapper<AttractDetailFormInfo> {

	public AttractDetailFormInfoWrapper(
		AttractDetailFormInfo attractDetailFormInfo) {

		super(attractDetailFormInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("attractDetailFormInfoId", getAttractDetailFormInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("newAttractionsOwnerName", getNewAttractionsOwnerName());
		attributes.put("newAttractionsLocation", getNewAttractionsLocation());
		attributes.put("newAttractionsMailing", getNewAttractionsMailing());
		attributes.put("newAttractionsTelephone", getNewAttractionsTelephone());
		attributes.put("newAttractionsFaxNum", getNewAttractionsFaxNum());
		attributes.put("newAttractionsEmailAddr", getNewAttractionsEmailAddr());
		attributes.put("newAttractionsEmpNum", getNewAttractionsEmpNum());
		attributes.put("newAttractionsParish", getNewAttractionsParish());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attractDetailFormInfoId = (Long)attributes.get(
			"attractDetailFormInfoId");

		if (attractDetailFormInfoId != null) {
			setAttractDetailFormInfoId(attractDetailFormInfoId);
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

		String newAttractionsOwnerName = (String)attributes.get(
			"newAttractionsOwnerName");

		if (newAttractionsOwnerName != null) {
			setNewAttractionsOwnerName(newAttractionsOwnerName);
		}

		String newAttractionsLocation = (String)attributes.get(
			"newAttractionsLocation");

		if (newAttractionsLocation != null) {
			setNewAttractionsLocation(newAttractionsLocation);
		}

		String newAttractionsMailing = (String)attributes.get(
			"newAttractionsMailing");

		if (newAttractionsMailing != null) {
			setNewAttractionsMailing(newAttractionsMailing);
		}

		String newAttractionsTelephone = (String)attributes.get(
			"newAttractionsTelephone");

		if (newAttractionsTelephone != null) {
			setNewAttractionsTelephone(newAttractionsTelephone);
		}

		String newAttractionsFaxNum = (String)attributes.get(
			"newAttractionsFaxNum");

		if (newAttractionsFaxNum != null) {
			setNewAttractionsFaxNum(newAttractionsFaxNum);
		}

		String newAttractionsEmailAddr = (String)attributes.get(
			"newAttractionsEmailAddr");

		if (newAttractionsEmailAddr != null) {
			setNewAttractionsEmailAddr(newAttractionsEmailAddr);
		}

		String newAttractionsEmpNum = (String)attributes.get(
			"newAttractionsEmpNum");

		if (newAttractionsEmpNum != null) {
			setNewAttractionsEmpNum(newAttractionsEmpNum);
		}

		String newAttractionsParish = (String)attributes.get(
			"newAttractionsParish");

		if (newAttractionsParish != null) {
			setNewAttractionsParish(newAttractionsParish);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AttractDetailFormInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the attract detail form info ID of this attract detail form info.
	 *
	 * @return the attract detail form info ID of this attract detail form info
	 */
	@Override
	public long getAttractDetailFormInfoId() {
		return model.getAttractDetailFormInfoId();
	}

	/**
	 * Returns the company ID of this attract detail form info.
	 *
	 * @return the company ID of this attract detail form info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this attract detail form info.
	 *
	 * @return the create date of this attract detail form info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this attract detail form info.
	 *
	 * @return the group ID of this attract detail form info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb application ID of this attract detail form info.
	 *
	 * @return the jtb application ID of this attract detail form info
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this attract detail form info.
	 *
	 * @return the modified date of this attract detail form info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the new attractions email addr of this attract detail form info.
	 *
	 * @return the new attractions email addr of this attract detail form info
	 */
	@Override
	public String getNewAttractionsEmailAddr() {
		return model.getNewAttractionsEmailAddr();
	}

	/**
	 * Returns the new attractions emp num of this attract detail form info.
	 *
	 * @return the new attractions emp num of this attract detail form info
	 */
	@Override
	public String getNewAttractionsEmpNum() {
		return model.getNewAttractionsEmpNum();
	}

	/**
	 * Returns the new attractions fax num of this attract detail form info.
	 *
	 * @return the new attractions fax num of this attract detail form info
	 */
	@Override
	public String getNewAttractionsFaxNum() {
		return model.getNewAttractionsFaxNum();
	}

	/**
	 * Returns the new attractions location of this attract detail form info.
	 *
	 * @return the new attractions location of this attract detail form info
	 */
	@Override
	public String getNewAttractionsLocation() {
		return model.getNewAttractionsLocation();
	}

	/**
	 * Returns the new attractions mailing of this attract detail form info.
	 *
	 * @return the new attractions mailing of this attract detail form info
	 */
	@Override
	public String getNewAttractionsMailing() {
		return model.getNewAttractionsMailing();
	}

	/**
	 * Returns the new attractions owner name of this attract detail form info.
	 *
	 * @return the new attractions owner name of this attract detail form info
	 */
	@Override
	public String getNewAttractionsOwnerName() {
		return model.getNewAttractionsOwnerName();
	}

	/**
	 * Returns the new attractions parish of this attract detail form info.
	 *
	 * @return the new attractions parish of this attract detail form info
	 */
	@Override
	public String getNewAttractionsParish() {
		return model.getNewAttractionsParish();
	}

	/**
	 * Returns the new attractions telephone of this attract detail form info.
	 *
	 * @return the new attractions telephone of this attract detail form info
	 */
	@Override
	public String getNewAttractionsTelephone() {
		return model.getNewAttractionsTelephone();
	}

	/**
	 * Returns the primary key of this attract detail form info.
	 *
	 * @return the primary key of this attract detail form info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this attract detail form info.
	 *
	 * @return the user ID of this attract detail form info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this attract detail form info.
	 *
	 * @return the user name of this attract detail form info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this attract detail form info.
	 *
	 * @return the user uuid of this attract detail form info
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
	 * Sets the attract detail form info ID of this attract detail form info.
	 *
	 * @param attractDetailFormInfoId the attract detail form info ID of this attract detail form info
	 */
	@Override
	public void setAttractDetailFormInfoId(long attractDetailFormInfoId) {
		model.setAttractDetailFormInfoId(attractDetailFormInfoId);
	}

	/**
	 * Sets the company ID of this attract detail form info.
	 *
	 * @param companyId the company ID of this attract detail form info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this attract detail form info.
	 *
	 * @param createDate the create date of this attract detail form info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this attract detail form info.
	 *
	 * @param groupId the group ID of this attract detail form info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb application ID of this attract detail form info.
	 *
	 * @param jtbApplicationId the jtb application ID of this attract detail form info
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this attract detail form info.
	 *
	 * @param modifiedDate the modified date of this attract detail form info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the new attractions email addr of this attract detail form info.
	 *
	 * @param newAttractionsEmailAddr the new attractions email addr of this attract detail form info
	 */
	@Override
	public void setNewAttractionsEmailAddr(String newAttractionsEmailAddr) {
		model.setNewAttractionsEmailAddr(newAttractionsEmailAddr);
	}

	/**
	 * Sets the new attractions emp num of this attract detail form info.
	 *
	 * @param newAttractionsEmpNum the new attractions emp num of this attract detail form info
	 */
	@Override
	public void setNewAttractionsEmpNum(String newAttractionsEmpNum) {
		model.setNewAttractionsEmpNum(newAttractionsEmpNum);
	}

	/**
	 * Sets the new attractions fax num of this attract detail form info.
	 *
	 * @param newAttractionsFaxNum the new attractions fax num of this attract detail form info
	 */
	@Override
	public void setNewAttractionsFaxNum(String newAttractionsFaxNum) {
		model.setNewAttractionsFaxNum(newAttractionsFaxNum);
	}

	/**
	 * Sets the new attractions location of this attract detail form info.
	 *
	 * @param newAttractionsLocation the new attractions location of this attract detail form info
	 */
	@Override
	public void setNewAttractionsLocation(String newAttractionsLocation) {
		model.setNewAttractionsLocation(newAttractionsLocation);
	}

	/**
	 * Sets the new attractions mailing of this attract detail form info.
	 *
	 * @param newAttractionsMailing the new attractions mailing of this attract detail form info
	 */
	@Override
	public void setNewAttractionsMailing(String newAttractionsMailing) {
		model.setNewAttractionsMailing(newAttractionsMailing);
	}

	/**
	 * Sets the new attractions owner name of this attract detail form info.
	 *
	 * @param newAttractionsOwnerName the new attractions owner name of this attract detail form info
	 */
	@Override
	public void setNewAttractionsOwnerName(String newAttractionsOwnerName) {
		model.setNewAttractionsOwnerName(newAttractionsOwnerName);
	}

	/**
	 * Sets the new attractions parish of this attract detail form info.
	 *
	 * @param newAttractionsParish the new attractions parish of this attract detail form info
	 */
	@Override
	public void setNewAttractionsParish(String newAttractionsParish) {
		model.setNewAttractionsParish(newAttractionsParish);
	}

	/**
	 * Sets the new attractions telephone of this attract detail form info.
	 *
	 * @param newAttractionsTelephone the new attractions telephone of this attract detail form info
	 */
	@Override
	public void setNewAttractionsTelephone(String newAttractionsTelephone) {
		model.setNewAttractionsTelephone(newAttractionsTelephone);
	}

	/**
	 * Sets the primary key of this attract detail form info.
	 *
	 * @param primaryKey the primary key of this attract detail form info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this attract detail form info.
	 *
	 * @param userId the user ID of this attract detail form info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this attract detail form info.
	 *
	 * @param userName the user name of this attract detail form info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this attract detail form info.
	 *
	 * @param userUuid the user uuid of this attract detail form info
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
	protected AttractDetailFormInfoWrapper wrap(
		AttractDetailFormInfo attractDetailFormInfo) {

		return new AttractDetailFormInfoWrapper(attractDetailFormInfo);
	}

}