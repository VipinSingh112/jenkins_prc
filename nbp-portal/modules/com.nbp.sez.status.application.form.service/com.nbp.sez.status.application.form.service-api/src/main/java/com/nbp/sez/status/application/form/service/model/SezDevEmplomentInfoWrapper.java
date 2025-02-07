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
 * This class is a wrapper for {@link SezDevEmplomentInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevEmplomentInfo
 * @generated
 */
public class SezDevEmplomentInfoWrapper
	extends BaseModelWrapper<SezDevEmplomentInfo>
	implements ModelWrapper<SezDevEmplomentInfo>, SezDevEmplomentInfo {

	public SezDevEmplomentInfoWrapper(SezDevEmplomentInfo sezDevEmplomentInfo) {
		super(sezDevEmplomentInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezDevEmplomentInfoId", getSezDevEmplomentInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("firstYearDirect", getFirstYearDirect());
		attributes.put("firstYearInDirect", getFirstYearInDirect());
		attributes.put("firstYearMale", getFirstYearMale());
		attributes.put("firstYearFemale", getFirstYearFemale());
		attributes.put("firstYearLocal", getFirstYearLocal());
		attributes.put("firstYearForeign", getFirstYearForeign());
		attributes.put("secondYearDirect", getSecondYearDirect());
		attributes.put("secondYearIndirect", getSecondYearIndirect());
		attributes.put("secondYearMale", getSecondYearMale());
		attributes.put("secondYearFemale", getSecondYearFemale());
		attributes.put("secondYearLocal", getSecondYearLocal());
		attributes.put("secondYearForeign", getSecondYearForeign());
		attributes.put("thirdYearDirect", getThirdYearDirect());
		attributes.put("thirdYearIndirect", getThirdYearIndirect());
		attributes.put("thirdYearMale", getThirdYearMale());
		attributes.put("thirdYearFemale", getThirdYearFemale());
		attributes.put("thirdYearLocal", getThirdYearLocal());
		attributes.put("thirdYearForeign", getThirdYearForeign());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezDevEmplomentInfoId = (Long)attributes.get(
			"sezDevEmplomentInfoId");

		if (sezDevEmplomentInfoId != null) {
			setSezDevEmplomentInfoId(sezDevEmplomentInfoId);
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

		String firstYearDirect = (String)attributes.get("firstYearDirect");

		if (firstYearDirect != null) {
			setFirstYearDirect(firstYearDirect);
		}

		String firstYearInDirect = (String)attributes.get("firstYearInDirect");

		if (firstYearInDirect != null) {
			setFirstYearInDirect(firstYearInDirect);
		}

		String firstYearMale = (String)attributes.get("firstYearMale");

		if (firstYearMale != null) {
			setFirstYearMale(firstYearMale);
		}

		String firstYearFemale = (String)attributes.get("firstYearFemale");

		if (firstYearFemale != null) {
			setFirstYearFemale(firstYearFemale);
		}

		String firstYearLocal = (String)attributes.get("firstYearLocal");

		if (firstYearLocal != null) {
			setFirstYearLocal(firstYearLocal);
		}

		String firstYearForeign = (String)attributes.get("firstYearForeign");

		if (firstYearForeign != null) {
			setFirstYearForeign(firstYearForeign);
		}

		String secondYearDirect = (String)attributes.get("secondYearDirect");

		if (secondYearDirect != null) {
			setSecondYearDirect(secondYearDirect);
		}

		String secondYearIndirect = (String)attributes.get(
			"secondYearIndirect");

		if (secondYearIndirect != null) {
			setSecondYearIndirect(secondYearIndirect);
		}

		String secondYearMale = (String)attributes.get("secondYearMale");

		if (secondYearMale != null) {
			setSecondYearMale(secondYearMale);
		}

		String secondYearFemale = (String)attributes.get("secondYearFemale");

		if (secondYearFemale != null) {
			setSecondYearFemale(secondYearFemale);
		}

		String secondYearLocal = (String)attributes.get("secondYearLocal");

		if (secondYearLocal != null) {
			setSecondYearLocal(secondYearLocal);
		}

		String secondYearForeign = (String)attributes.get("secondYearForeign");

		if (secondYearForeign != null) {
			setSecondYearForeign(secondYearForeign);
		}

		String thirdYearDirect = (String)attributes.get("thirdYearDirect");

		if (thirdYearDirect != null) {
			setThirdYearDirect(thirdYearDirect);
		}

		String thirdYearIndirect = (String)attributes.get("thirdYearIndirect");

		if (thirdYearIndirect != null) {
			setThirdYearIndirect(thirdYearIndirect);
		}

		String thirdYearMale = (String)attributes.get("thirdYearMale");

		if (thirdYearMale != null) {
			setThirdYearMale(thirdYearMale);
		}

		String thirdYearFemale = (String)attributes.get("thirdYearFemale");

		if (thirdYearFemale != null) {
			setThirdYearFemale(thirdYearFemale);
		}

		String thirdYearLocal = (String)attributes.get("thirdYearLocal");

		if (thirdYearLocal != null) {
			setThirdYearLocal(thirdYearLocal);
		}

		String thirdYearForeign = (String)attributes.get("thirdYearForeign");

		if (thirdYearForeign != null) {
			setThirdYearForeign(thirdYearForeign);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezDevEmplomentInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez dev emploment info.
	 *
	 * @return the company ID of this sez dev emploment info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez dev emploment info.
	 *
	 * @return the create date of this sez dev emploment info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the first year direct of this sez dev emploment info.
	 *
	 * @return the first year direct of this sez dev emploment info
	 */
	@Override
	public String getFirstYearDirect() {
		return model.getFirstYearDirect();
	}

	/**
	 * Returns the first year female of this sez dev emploment info.
	 *
	 * @return the first year female of this sez dev emploment info
	 */
	@Override
	public String getFirstYearFemale() {
		return model.getFirstYearFemale();
	}

	/**
	 * Returns the first year foreign of this sez dev emploment info.
	 *
	 * @return the first year foreign of this sez dev emploment info
	 */
	@Override
	public String getFirstYearForeign() {
		return model.getFirstYearForeign();
	}

	/**
	 * Returns the first year in direct of this sez dev emploment info.
	 *
	 * @return the first year in direct of this sez dev emploment info
	 */
	@Override
	public String getFirstYearInDirect() {
		return model.getFirstYearInDirect();
	}

	/**
	 * Returns the first year local of this sez dev emploment info.
	 *
	 * @return the first year local of this sez dev emploment info
	 */
	@Override
	public String getFirstYearLocal() {
		return model.getFirstYearLocal();
	}

	/**
	 * Returns the first year male of this sez dev emploment info.
	 *
	 * @return the first year male of this sez dev emploment info
	 */
	@Override
	public String getFirstYearMale() {
		return model.getFirstYearMale();
	}

	/**
	 * Returns the group ID of this sez dev emploment info.
	 *
	 * @return the group ID of this sez dev emploment info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez dev emploment info.
	 *
	 * @return the modified date of this sez dev emploment info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this sez dev emploment info.
	 *
	 * @return the primary key of this sez dev emploment info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the second year direct of this sez dev emploment info.
	 *
	 * @return the second year direct of this sez dev emploment info
	 */
	@Override
	public String getSecondYearDirect() {
		return model.getSecondYearDirect();
	}

	/**
	 * Returns the second year female of this sez dev emploment info.
	 *
	 * @return the second year female of this sez dev emploment info
	 */
	@Override
	public String getSecondYearFemale() {
		return model.getSecondYearFemale();
	}

	/**
	 * Returns the second year foreign of this sez dev emploment info.
	 *
	 * @return the second year foreign of this sez dev emploment info
	 */
	@Override
	public String getSecondYearForeign() {
		return model.getSecondYearForeign();
	}

	/**
	 * Returns the second year indirect of this sez dev emploment info.
	 *
	 * @return the second year indirect of this sez dev emploment info
	 */
	@Override
	public String getSecondYearIndirect() {
		return model.getSecondYearIndirect();
	}

	/**
	 * Returns the second year local of this sez dev emploment info.
	 *
	 * @return the second year local of this sez dev emploment info
	 */
	@Override
	public String getSecondYearLocal() {
		return model.getSecondYearLocal();
	}

	/**
	 * Returns the second year male of this sez dev emploment info.
	 *
	 * @return the second year male of this sez dev emploment info
	 */
	@Override
	public String getSecondYearMale() {
		return model.getSecondYearMale();
	}

	/**
	 * Returns the sez dev emploment info ID of this sez dev emploment info.
	 *
	 * @return the sez dev emploment info ID of this sez dev emploment info
	 */
	@Override
	public long getSezDevEmplomentInfoId() {
		return model.getSezDevEmplomentInfoId();
	}

	/**
	 * Returns the sez status application ID of this sez dev emploment info.
	 *
	 * @return the sez status application ID of this sez dev emploment info
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the third year direct of this sez dev emploment info.
	 *
	 * @return the third year direct of this sez dev emploment info
	 */
	@Override
	public String getThirdYearDirect() {
		return model.getThirdYearDirect();
	}

	/**
	 * Returns the third year female of this sez dev emploment info.
	 *
	 * @return the third year female of this sez dev emploment info
	 */
	@Override
	public String getThirdYearFemale() {
		return model.getThirdYearFemale();
	}

	/**
	 * Returns the third year foreign of this sez dev emploment info.
	 *
	 * @return the third year foreign of this sez dev emploment info
	 */
	@Override
	public String getThirdYearForeign() {
		return model.getThirdYearForeign();
	}

	/**
	 * Returns the third year indirect of this sez dev emploment info.
	 *
	 * @return the third year indirect of this sez dev emploment info
	 */
	@Override
	public String getThirdYearIndirect() {
		return model.getThirdYearIndirect();
	}

	/**
	 * Returns the third year local of this sez dev emploment info.
	 *
	 * @return the third year local of this sez dev emploment info
	 */
	@Override
	public String getThirdYearLocal() {
		return model.getThirdYearLocal();
	}

	/**
	 * Returns the third year male of this sez dev emploment info.
	 *
	 * @return the third year male of this sez dev emploment info
	 */
	@Override
	public String getThirdYearMale() {
		return model.getThirdYearMale();
	}

	/**
	 * Returns the user ID of this sez dev emploment info.
	 *
	 * @return the user ID of this sez dev emploment info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez dev emploment info.
	 *
	 * @return the user name of this sez dev emploment info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez dev emploment info.
	 *
	 * @return the user uuid of this sez dev emploment info
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
	 * Sets the company ID of this sez dev emploment info.
	 *
	 * @param companyId the company ID of this sez dev emploment info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez dev emploment info.
	 *
	 * @param createDate the create date of this sez dev emploment info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the first year direct of this sez dev emploment info.
	 *
	 * @param firstYearDirect the first year direct of this sez dev emploment info
	 */
	@Override
	public void setFirstYearDirect(String firstYearDirect) {
		model.setFirstYearDirect(firstYearDirect);
	}

	/**
	 * Sets the first year female of this sez dev emploment info.
	 *
	 * @param firstYearFemale the first year female of this sez dev emploment info
	 */
	@Override
	public void setFirstYearFemale(String firstYearFemale) {
		model.setFirstYearFemale(firstYearFemale);
	}

	/**
	 * Sets the first year foreign of this sez dev emploment info.
	 *
	 * @param firstYearForeign the first year foreign of this sez dev emploment info
	 */
	@Override
	public void setFirstYearForeign(String firstYearForeign) {
		model.setFirstYearForeign(firstYearForeign);
	}

	/**
	 * Sets the first year in direct of this sez dev emploment info.
	 *
	 * @param firstYearInDirect the first year in direct of this sez dev emploment info
	 */
	@Override
	public void setFirstYearInDirect(String firstYearInDirect) {
		model.setFirstYearInDirect(firstYearInDirect);
	}

	/**
	 * Sets the first year local of this sez dev emploment info.
	 *
	 * @param firstYearLocal the first year local of this sez dev emploment info
	 */
	@Override
	public void setFirstYearLocal(String firstYearLocal) {
		model.setFirstYearLocal(firstYearLocal);
	}

	/**
	 * Sets the first year male of this sez dev emploment info.
	 *
	 * @param firstYearMale the first year male of this sez dev emploment info
	 */
	@Override
	public void setFirstYearMale(String firstYearMale) {
		model.setFirstYearMale(firstYearMale);
	}

	/**
	 * Sets the group ID of this sez dev emploment info.
	 *
	 * @param groupId the group ID of this sez dev emploment info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez dev emploment info.
	 *
	 * @param modifiedDate the modified date of this sez dev emploment info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this sez dev emploment info.
	 *
	 * @param primaryKey the primary key of this sez dev emploment info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the second year direct of this sez dev emploment info.
	 *
	 * @param secondYearDirect the second year direct of this sez dev emploment info
	 */
	@Override
	public void setSecondYearDirect(String secondYearDirect) {
		model.setSecondYearDirect(secondYearDirect);
	}

	/**
	 * Sets the second year female of this sez dev emploment info.
	 *
	 * @param secondYearFemale the second year female of this sez dev emploment info
	 */
	@Override
	public void setSecondYearFemale(String secondYearFemale) {
		model.setSecondYearFemale(secondYearFemale);
	}

	/**
	 * Sets the second year foreign of this sez dev emploment info.
	 *
	 * @param secondYearForeign the second year foreign of this sez dev emploment info
	 */
	@Override
	public void setSecondYearForeign(String secondYearForeign) {
		model.setSecondYearForeign(secondYearForeign);
	}

	/**
	 * Sets the second year indirect of this sez dev emploment info.
	 *
	 * @param secondYearIndirect the second year indirect of this sez dev emploment info
	 */
	@Override
	public void setSecondYearIndirect(String secondYearIndirect) {
		model.setSecondYearIndirect(secondYearIndirect);
	}

	/**
	 * Sets the second year local of this sez dev emploment info.
	 *
	 * @param secondYearLocal the second year local of this sez dev emploment info
	 */
	@Override
	public void setSecondYearLocal(String secondYearLocal) {
		model.setSecondYearLocal(secondYearLocal);
	}

	/**
	 * Sets the second year male of this sez dev emploment info.
	 *
	 * @param secondYearMale the second year male of this sez dev emploment info
	 */
	@Override
	public void setSecondYearMale(String secondYearMale) {
		model.setSecondYearMale(secondYearMale);
	}

	/**
	 * Sets the sez dev emploment info ID of this sez dev emploment info.
	 *
	 * @param sezDevEmplomentInfoId the sez dev emploment info ID of this sez dev emploment info
	 */
	@Override
	public void setSezDevEmplomentInfoId(long sezDevEmplomentInfoId) {
		model.setSezDevEmplomentInfoId(sezDevEmplomentInfoId);
	}

	/**
	 * Sets the sez status application ID of this sez dev emploment info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez dev emploment info
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the third year direct of this sez dev emploment info.
	 *
	 * @param thirdYearDirect the third year direct of this sez dev emploment info
	 */
	@Override
	public void setThirdYearDirect(String thirdYearDirect) {
		model.setThirdYearDirect(thirdYearDirect);
	}

	/**
	 * Sets the third year female of this sez dev emploment info.
	 *
	 * @param thirdYearFemale the third year female of this sez dev emploment info
	 */
	@Override
	public void setThirdYearFemale(String thirdYearFemale) {
		model.setThirdYearFemale(thirdYearFemale);
	}

	/**
	 * Sets the third year foreign of this sez dev emploment info.
	 *
	 * @param thirdYearForeign the third year foreign of this sez dev emploment info
	 */
	@Override
	public void setThirdYearForeign(String thirdYearForeign) {
		model.setThirdYearForeign(thirdYearForeign);
	}

	/**
	 * Sets the third year indirect of this sez dev emploment info.
	 *
	 * @param thirdYearIndirect the third year indirect of this sez dev emploment info
	 */
	@Override
	public void setThirdYearIndirect(String thirdYearIndirect) {
		model.setThirdYearIndirect(thirdYearIndirect);
	}

	/**
	 * Sets the third year local of this sez dev emploment info.
	 *
	 * @param thirdYearLocal the third year local of this sez dev emploment info
	 */
	@Override
	public void setThirdYearLocal(String thirdYearLocal) {
		model.setThirdYearLocal(thirdYearLocal);
	}

	/**
	 * Sets the third year male of this sez dev emploment info.
	 *
	 * @param thirdYearMale the third year male of this sez dev emploment info
	 */
	@Override
	public void setThirdYearMale(String thirdYearMale) {
		model.setThirdYearMale(thirdYearMale);
	}

	/**
	 * Sets the user ID of this sez dev emploment info.
	 *
	 * @param userId the user ID of this sez dev emploment info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez dev emploment info.
	 *
	 * @param userName the user name of this sez dev emploment info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez dev emploment info.
	 *
	 * @param userUuid the user uuid of this sez dev emploment info
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
	protected SezDevEmplomentInfoWrapper wrap(
		SezDevEmplomentInfo sezDevEmplomentInfo) {

		return new SezDevEmplomentInfoWrapper(sezDevEmplomentInfo);
	}

}