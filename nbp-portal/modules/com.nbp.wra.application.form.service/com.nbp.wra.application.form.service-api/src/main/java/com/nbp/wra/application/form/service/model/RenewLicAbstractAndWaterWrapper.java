/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RenewLicAbstractAndWater}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RenewLicAbstractAndWater
 * @generated
 */
public class RenewLicAbstractAndWaterWrapper
	extends BaseModelWrapper<RenewLicAbstractAndWater>
	implements ModelWrapper<RenewLicAbstractAndWater>,
			   RenewLicAbstractAndWater {

	public RenewLicAbstractAndWaterWrapper(
		RenewLicAbstractAndWater renewLicAbstractAndWater) {

		super(renewLicAbstractAndWater);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"renewLicAbstractAndWaterId", getRenewLicAbstractAndWaterId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("renewName", getRenewName());
		attributes.put("renewContact", getRenewContact());
		attributes.put("renewJobTitle", getRenewJobTitle());
		attributes.put("renewTelephoneNum", getRenewTelephoneNum());
		attributes.put("renewFaxNum", getRenewFaxNum());
		attributes.put("renewParishLocation", getRenewParishLocation());
		attributes.put("renewAddress", getRenewAddress());
		attributes.put("renewSourceName", getRenewSourceName());
		attributes.put("renewDetailsParishAdd", getRenewDetailsParishAdd());
		attributes.put("renewDetailsLocation", getRenewDetailsLocation());
		attributes.put("renewAbstractionRate", getRenewAbstractionRate());
		attributes.put("renewDetailsUse", getRenewDetailsUse());
		attributes.put("renewAbstractionMethod", getRenewAbstractionMethod());
		attributes.put("attachedDevice", getAttachedDevice());
		attributes.put("renewStateDevice", getRenewStateDevice());
		attributes.put("abstractionData", getAbstractionData());
		attributes.put("renewSignName", getRenewSignName());
		attributes.put("renewDate", getRenewDate());
		attributes.put("wraApplicationId", getWraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long renewLicAbstractAndWaterId = (Long)attributes.get(
			"renewLicAbstractAndWaterId");

		if (renewLicAbstractAndWaterId != null) {
			setRenewLicAbstractAndWaterId(renewLicAbstractAndWaterId);
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

		String renewName = (String)attributes.get("renewName");

		if (renewName != null) {
			setRenewName(renewName);
		}

		String renewContact = (String)attributes.get("renewContact");

		if (renewContact != null) {
			setRenewContact(renewContact);
		}

		String renewJobTitle = (String)attributes.get("renewJobTitle");

		if (renewJobTitle != null) {
			setRenewJobTitle(renewJobTitle);
		}

		String renewTelephoneNum = (String)attributes.get("renewTelephoneNum");

		if (renewTelephoneNum != null) {
			setRenewTelephoneNum(renewTelephoneNum);
		}

		String renewFaxNum = (String)attributes.get("renewFaxNum");

		if (renewFaxNum != null) {
			setRenewFaxNum(renewFaxNum);
		}

		String renewParishLocation = (String)attributes.get(
			"renewParishLocation");

		if (renewParishLocation != null) {
			setRenewParishLocation(renewParishLocation);
		}

		String renewAddress = (String)attributes.get("renewAddress");

		if (renewAddress != null) {
			setRenewAddress(renewAddress);
		}

		String renewSourceName = (String)attributes.get("renewSourceName");

		if (renewSourceName != null) {
			setRenewSourceName(renewSourceName);
		}

		String renewDetailsParishAdd = (String)attributes.get(
			"renewDetailsParishAdd");

		if (renewDetailsParishAdd != null) {
			setRenewDetailsParishAdd(renewDetailsParishAdd);
		}

		String renewDetailsLocation = (String)attributes.get(
			"renewDetailsLocation");

		if (renewDetailsLocation != null) {
			setRenewDetailsLocation(renewDetailsLocation);
		}

		String renewAbstractionRate = (String)attributes.get(
			"renewAbstractionRate");

		if (renewAbstractionRate != null) {
			setRenewAbstractionRate(renewAbstractionRate);
		}

		String renewDetailsUse = (String)attributes.get("renewDetailsUse");

		if (renewDetailsUse != null) {
			setRenewDetailsUse(renewDetailsUse);
		}

		String renewAbstractionMethod = (String)attributes.get(
			"renewAbstractionMethod");

		if (renewAbstractionMethod != null) {
			setRenewAbstractionMethod(renewAbstractionMethod);
		}

		String attachedDevice = (String)attributes.get("attachedDevice");

		if (attachedDevice != null) {
			setAttachedDevice(attachedDevice);
		}

		String renewStateDevice = (String)attributes.get("renewStateDevice");

		if (renewStateDevice != null) {
			setRenewStateDevice(renewStateDevice);
		}

		String abstractionData = (String)attributes.get("abstractionData");

		if (abstractionData != null) {
			setAbstractionData(abstractionData);
		}

		String renewSignName = (String)attributes.get("renewSignName");

		if (renewSignName != null) {
			setRenewSignName(renewSignName);
		}

		Date renewDate = (Date)attributes.get("renewDate");

		if (renewDate != null) {
			setRenewDate(renewDate);
		}

		Long wraApplicationId = (Long)attributes.get("wraApplicationId");

		if (wraApplicationId != null) {
			setWraApplicationId(wraApplicationId);
		}
	}

	@Override
	public RenewLicAbstractAndWater cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the abstraction data of this renew lic abstract and water.
	 *
	 * @return the abstraction data of this renew lic abstract and water
	 */
	@Override
	public String getAbstractionData() {
		return model.getAbstractionData();
	}

	/**
	 * Returns the attached device of this renew lic abstract and water.
	 *
	 * @return the attached device of this renew lic abstract and water
	 */
	@Override
	public String getAttachedDevice() {
		return model.getAttachedDevice();
	}

	/**
	 * Returns the company ID of this renew lic abstract and water.
	 *
	 * @return the company ID of this renew lic abstract and water
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this renew lic abstract and water.
	 *
	 * @return the create date of this renew lic abstract and water
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this renew lic abstract and water.
	 *
	 * @return the group ID of this renew lic abstract and water
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this renew lic abstract and water.
	 *
	 * @return the modified date of this renew lic abstract and water
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this renew lic abstract and water.
	 *
	 * @return the primary key of this renew lic abstract and water
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the renew abstraction method of this renew lic abstract and water.
	 *
	 * @return the renew abstraction method of this renew lic abstract and water
	 */
	@Override
	public String getRenewAbstractionMethod() {
		return model.getRenewAbstractionMethod();
	}

	/**
	 * Returns the renew abstraction rate of this renew lic abstract and water.
	 *
	 * @return the renew abstraction rate of this renew lic abstract and water
	 */
	@Override
	public String getRenewAbstractionRate() {
		return model.getRenewAbstractionRate();
	}

	/**
	 * Returns the renew address of this renew lic abstract and water.
	 *
	 * @return the renew address of this renew lic abstract and water
	 */
	@Override
	public String getRenewAddress() {
		return model.getRenewAddress();
	}

	/**
	 * Returns the renew contact of this renew lic abstract and water.
	 *
	 * @return the renew contact of this renew lic abstract and water
	 */
	@Override
	public String getRenewContact() {
		return model.getRenewContact();
	}

	/**
	 * Returns the renew date of this renew lic abstract and water.
	 *
	 * @return the renew date of this renew lic abstract and water
	 */
	@Override
	public Date getRenewDate() {
		return model.getRenewDate();
	}

	/**
	 * Returns the renew details location of this renew lic abstract and water.
	 *
	 * @return the renew details location of this renew lic abstract and water
	 */
	@Override
	public String getRenewDetailsLocation() {
		return model.getRenewDetailsLocation();
	}

	/**
	 * Returns the renew details parish add of this renew lic abstract and water.
	 *
	 * @return the renew details parish add of this renew lic abstract and water
	 */
	@Override
	public String getRenewDetailsParishAdd() {
		return model.getRenewDetailsParishAdd();
	}

	/**
	 * Returns the renew details use of this renew lic abstract and water.
	 *
	 * @return the renew details use of this renew lic abstract and water
	 */
	@Override
	public String getRenewDetailsUse() {
		return model.getRenewDetailsUse();
	}

	/**
	 * Returns the renew fax num of this renew lic abstract and water.
	 *
	 * @return the renew fax num of this renew lic abstract and water
	 */
	@Override
	public String getRenewFaxNum() {
		return model.getRenewFaxNum();
	}

	/**
	 * Returns the renew job title of this renew lic abstract and water.
	 *
	 * @return the renew job title of this renew lic abstract and water
	 */
	@Override
	public String getRenewJobTitle() {
		return model.getRenewJobTitle();
	}

	/**
	 * Returns the renew lic abstract and water ID of this renew lic abstract and water.
	 *
	 * @return the renew lic abstract and water ID of this renew lic abstract and water
	 */
	@Override
	public long getRenewLicAbstractAndWaterId() {
		return model.getRenewLicAbstractAndWaterId();
	}

	/**
	 * Returns the renew name of this renew lic abstract and water.
	 *
	 * @return the renew name of this renew lic abstract and water
	 */
	@Override
	public String getRenewName() {
		return model.getRenewName();
	}

	/**
	 * Returns the renew parish location of this renew lic abstract and water.
	 *
	 * @return the renew parish location of this renew lic abstract and water
	 */
	@Override
	public String getRenewParishLocation() {
		return model.getRenewParishLocation();
	}

	/**
	 * Returns the renew sign name of this renew lic abstract and water.
	 *
	 * @return the renew sign name of this renew lic abstract and water
	 */
	@Override
	public String getRenewSignName() {
		return model.getRenewSignName();
	}

	/**
	 * Returns the renew source name of this renew lic abstract and water.
	 *
	 * @return the renew source name of this renew lic abstract and water
	 */
	@Override
	public String getRenewSourceName() {
		return model.getRenewSourceName();
	}

	/**
	 * Returns the renew state device of this renew lic abstract and water.
	 *
	 * @return the renew state device of this renew lic abstract and water
	 */
	@Override
	public String getRenewStateDevice() {
		return model.getRenewStateDevice();
	}

	/**
	 * Returns the renew telephone num of this renew lic abstract and water.
	 *
	 * @return the renew telephone num of this renew lic abstract and water
	 */
	@Override
	public String getRenewTelephoneNum() {
		return model.getRenewTelephoneNum();
	}

	/**
	 * Returns the user ID of this renew lic abstract and water.
	 *
	 * @return the user ID of this renew lic abstract and water
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this renew lic abstract and water.
	 *
	 * @return the user name of this renew lic abstract and water
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this renew lic abstract and water.
	 *
	 * @return the user uuid of this renew lic abstract and water
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the wra application ID of this renew lic abstract and water.
	 *
	 * @return the wra application ID of this renew lic abstract and water
	 */
	@Override
	public long getWraApplicationId() {
		return model.getWraApplicationId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the abstraction data of this renew lic abstract and water.
	 *
	 * @param abstractionData the abstraction data of this renew lic abstract and water
	 */
	@Override
	public void setAbstractionData(String abstractionData) {
		model.setAbstractionData(abstractionData);
	}

	/**
	 * Sets the attached device of this renew lic abstract and water.
	 *
	 * @param attachedDevice the attached device of this renew lic abstract and water
	 */
	@Override
	public void setAttachedDevice(String attachedDevice) {
		model.setAttachedDevice(attachedDevice);
	}

	/**
	 * Sets the company ID of this renew lic abstract and water.
	 *
	 * @param companyId the company ID of this renew lic abstract and water
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this renew lic abstract and water.
	 *
	 * @param createDate the create date of this renew lic abstract and water
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this renew lic abstract and water.
	 *
	 * @param groupId the group ID of this renew lic abstract and water
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this renew lic abstract and water.
	 *
	 * @param modifiedDate the modified date of this renew lic abstract and water
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this renew lic abstract and water.
	 *
	 * @param primaryKey the primary key of this renew lic abstract and water
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the renew abstraction method of this renew lic abstract and water.
	 *
	 * @param renewAbstractionMethod the renew abstraction method of this renew lic abstract and water
	 */
	@Override
	public void setRenewAbstractionMethod(String renewAbstractionMethod) {
		model.setRenewAbstractionMethod(renewAbstractionMethod);
	}

	/**
	 * Sets the renew abstraction rate of this renew lic abstract and water.
	 *
	 * @param renewAbstractionRate the renew abstraction rate of this renew lic abstract and water
	 */
	@Override
	public void setRenewAbstractionRate(String renewAbstractionRate) {
		model.setRenewAbstractionRate(renewAbstractionRate);
	}

	/**
	 * Sets the renew address of this renew lic abstract and water.
	 *
	 * @param renewAddress the renew address of this renew lic abstract and water
	 */
	@Override
	public void setRenewAddress(String renewAddress) {
		model.setRenewAddress(renewAddress);
	}

	/**
	 * Sets the renew contact of this renew lic abstract and water.
	 *
	 * @param renewContact the renew contact of this renew lic abstract and water
	 */
	@Override
	public void setRenewContact(String renewContact) {
		model.setRenewContact(renewContact);
	}

	/**
	 * Sets the renew date of this renew lic abstract and water.
	 *
	 * @param renewDate the renew date of this renew lic abstract and water
	 */
	@Override
	public void setRenewDate(Date renewDate) {
		model.setRenewDate(renewDate);
	}

	/**
	 * Sets the renew details location of this renew lic abstract and water.
	 *
	 * @param renewDetailsLocation the renew details location of this renew lic abstract and water
	 */
	@Override
	public void setRenewDetailsLocation(String renewDetailsLocation) {
		model.setRenewDetailsLocation(renewDetailsLocation);
	}

	/**
	 * Sets the renew details parish add of this renew lic abstract and water.
	 *
	 * @param renewDetailsParishAdd the renew details parish add of this renew lic abstract and water
	 */
	@Override
	public void setRenewDetailsParishAdd(String renewDetailsParishAdd) {
		model.setRenewDetailsParishAdd(renewDetailsParishAdd);
	}

	/**
	 * Sets the renew details use of this renew lic abstract and water.
	 *
	 * @param renewDetailsUse the renew details use of this renew lic abstract and water
	 */
	@Override
	public void setRenewDetailsUse(String renewDetailsUse) {
		model.setRenewDetailsUse(renewDetailsUse);
	}

	/**
	 * Sets the renew fax num of this renew lic abstract and water.
	 *
	 * @param renewFaxNum the renew fax num of this renew lic abstract and water
	 */
	@Override
	public void setRenewFaxNum(String renewFaxNum) {
		model.setRenewFaxNum(renewFaxNum);
	}

	/**
	 * Sets the renew job title of this renew lic abstract and water.
	 *
	 * @param renewJobTitle the renew job title of this renew lic abstract and water
	 */
	@Override
	public void setRenewJobTitle(String renewJobTitle) {
		model.setRenewJobTitle(renewJobTitle);
	}

	/**
	 * Sets the renew lic abstract and water ID of this renew lic abstract and water.
	 *
	 * @param renewLicAbstractAndWaterId the renew lic abstract and water ID of this renew lic abstract and water
	 */
	@Override
	public void setRenewLicAbstractAndWaterId(long renewLicAbstractAndWaterId) {
		model.setRenewLicAbstractAndWaterId(renewLicAbstractAndWaterId);
	}

	/**
	 * Sets the renew name of this renew lic abstract and water.
	 *
	 * @param renewName the renew name of this renew lic abstract and water
	 */
	@Override
	public void setRenewName(String renewName) {
		model.setRenewName(renewName);
	}

	/**
	 * Sets the renew parish location of this renew lic abstract and water.
	 *
	 * @param renewParishLocation the renew parish location of this renew lic abstract and water
	 */
	@Override
	public void setRenewParishLocation(String renewParishLocation) {
		model.setRenewParishLocation(renewParishLocation);
	}

	/**
	 * Sets the renew sign name of this renew lic abstract and water.
	 *
	 * @param renewSignName the renew sign name of this renew lic abstract and water
	 */
	@Override
	public void setRenewSignName(String renewSignName) {
		model.setRenewSignName(renewSignName);
	}

	/**
	 * Sets the renew source name of this renew lic abstract and water.
	 *
	 * @param renewSourceName the renew source name of this renew lic abstract and water
	 */
	@Override
	public void setRenewSourceName(String renewSourceName) {
		model.setRenewSourceName(renewSourceName);
	}

	/**
	 * Sets the renew state device of this renew lic abstract and water.
	 *
	 * @param renewStateDevice the renew state device of this renew lic abstract and water
	 */
	@Override
	public void setRenewStateDevice(String renewStateDevice) {
		model.setRenewStateDevice(renewStateDevice);
	}

	/**
	 * Sets the renew telephone num of this renew lic abstract and water.
	 *
	 * @param renewTelephoneNum the renew telephone num of this renew lic abstract and water
	 */
	@Override
	public void setRenewTelephoneNum(String renewTelephoneNum) {
		model.setRenewTelephoneNum(renewTelephoneNum);
	}

	/**
	 * Sets the user ID of this renew lic abstract and water.
	 *
	 * @param userId the user ID of this renew lic abstract and water
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this renew lic abstract and water.
	 *
	 * @param userName the user name of this renew lic abstract and water
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this renew lic abstract and water.
	 *
	 * @param userUuid the user uuid of this renew lic abstract and water
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the wra application ID of this renew lic abstract and water.
	 *
	 * @param wraApplicationId the wra application ID of this renew lic abstract and water
	 */
	@Override
	public void setWraApplicationId(long wraApplicationId) {
		model.setWraApplicationId(wraApplicationId);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected RenewLicAbstractAndWaterWrapper wrap(
		RenewLicAbstractAndWater renewLicAbstractAndWater) {

		return new RenewLicAbstractAndWaterWrapper(renewLicAbstractAndWater);
	}

}