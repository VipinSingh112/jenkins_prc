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
 * This class is a wrapper for {@link AccoNonHotelGenDec}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelGenDec
 * @generated
 */
public class AccoNonHotelGenDecWrapper
	extends BaseModelWrapper<AccoNonHotelGenDec>
	implements AccoNonHotelGenDec, ModelWrapper<AccoNonHotelGenDec> {

	public AccoNonHotelGenDecWrapper(AccoNonHotelGenDec accoNonHotelGenDec) {
		super(accoNonHotelGenDec);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("accoNonHotelGenDecId", getAccoNonHotelGenDecId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nhAccoOperatorName", getNhAccoOperatorName());
		attributes.put("dateFrom", getDateFrom());
		attributes.put("dateTo", getDateTo());
		attributes.put("nhAccoSince", getNhAccoSince());
		attributes.put("nhAccoDate", getNhAccoDate());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accoNonHotelGenDecId = (Long)attributes.get(
			"accoNonHotelGenDecId");

		if (accoNonHotelGenDecId != null) {
			setAccoNonHotelGenDecId(accoNonHotelGenDecId);
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

		String nhAccoOperatorName = (String)attributes.get(
			"nhAccoOperatorName");

		if (nhAccoOperatorName != null) {
			setNhAccoOperatorName(nhAccoOperatorName);
		}

		Date dateFrom = (Date)attributes.get("dateFrom");

		if (dateFrom != null) {
			setDateFrom(dateFrom);
		}

		Date dateTo = (Date)attributes.get("dateTo");

		if (dateTo != null) {
			setDateTo(dateTo);
		}

		Date nhAccoSince = (Date)attributes.get("nhAccoSince");

		if (nhAccoSince != null) {
			setNhAccoSince(nhAccoSince);
		}

		Date nhAccoDate = (Date)attributes.get("nhAccoDate");

		if (nhAccoDate != null) {
			setNhAccoDate(nhAccoDate);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AccoNonHotelGenDec cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acco non hotel gen dec ID of this acco non hotel gen dec.
	 *
	 * @return the acco non hotel gen dec ID of this acco non hotel gen dec
	 */
	@Override
	public long getAccoNonHotelGenDecId() {
		return model.getAccoNonHotelGenDecId();
	}

	/**
	 * Returns the company ID of this acco non hotel gen dec.
	 *
	 * @return the company ID of this acco non hotel gen dec
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acco non hotel gen dec.
	 *
	 * @return the create date of this acco non hotel gen dec
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date from of this acco non hotel gen dec.
	 *
	 * @return the date from of this acco non hotel gen dec
	 */
	@Override
	public Date getDateFrom() {
		return model.getDateFrom();
	}

	/**
	 * Returns the date to of this acco non hotel gen dec.
	 *
	 * @return the date to of this acco non hotel gen dec
	 */
	@Override
	public Date getDateTo() {
		return model.getDateTo();
	}

	/**
	 * Returns the group ID of this acco non hotel gen dec.
	 *
	 * @return the group ID of this acco non hotel gen dec
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb application ID of this acco non hotel gen dec.
	 *
	 * @return the jtb application ID of this acco non hotel gen dec
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this acco non hotel gen dec.
	 *
	 * @return the modified date of this acco non hotel gen dec
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nh acco date of this acco non hotel gen dec.
	 *
	 * @return the nh acco date of this acco non hotel gen dec
	 */
	@Override
	public Date getNhAccoDate() {
		return model.getNhAccoDate();
	}

	/**
	 * Returns the nh acco operator name of this acco non hotel gen dec.
	 *
	 * @return the nh acco operator name of this acco non hotel gen dec
	 */
	@Override
	public String getNhAccoOperatorName() {
		return model.getNhAccoOperatorName();
	}

	/**
	 * Returns the nh acco since of this acco non hotel gen dec.
	 *
	 * @return the nh acco since of this acco non hotel gen dec
	 */
	@Override
	public Date getNhAccoSince() {
		return model.getNhAccoSince();
	}

	/**
	 * Returns the primary key of this acco non hotel gen dec.
	 *
	 * @return the primary key of this acco non hotel gen dec
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this acco non hotel gen dec.
	 *
	 * @return the user ID of this acco non hotel gen dec
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acco non hotel gen dec.
	 *
	 * @return the user name of this acco non hotel gen dec
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acco non hotel gen dec.
	 *
	 * @return the user uuid of this acco non hotel gen dec
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acco non hotel gen dec.
	 *
	 * @return the uuid of this acco non hotel gen dec
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the acco non hotel gen dec ID of this acco non hotel gen dec.
	 *
	 * @param accoNonHotelGenDecId the acco non hotel gen dec ID of this acco non hotel gen dec
	 */
	@Override
	public void setAccoNonHotelGenDecId(long accoNonHotelGenDecId) {
		model.setAccoNonHotelGenDecId(accoNonHotelGenDecId);
	}

	/**
	 * Sets the company ID of this acco non hotel gen dec.
	 *
	 * @param companyId the company ID of this acco non hotel gen dec
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acco non hotel gen dec.
	 *
	 * @param createDate the create date of this acco non hotel gen dec
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date from of this acco non hotel gen dec.
	 *
	 * @param dateFrom the date from of this acco non hotel gen dec
	 */
	@Override
	public void setDateFrom(Date dateFrom) {
		model.setDateFrom(dateFrom);
	}

	/**
	 * Sets the date to of this acco non hotel gen dec.
	 *
	 * @param dateTo the date to of this acco non hotel gen dec
	 */
	@Override
	public void setDateTo(Date dateTo) {
		model.setDateTo(dateTo);
	}

	/**
	 * Sets the group ID of this acco non hotel gen dec.
	 *
	 * @param groupId the group ID of this acco non hotel gen dec
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb application ID of this acco non hotel gen dec.
	 *
	 * @param jtbApplicationId the jtb application ID of this acco non hotel gen dec
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this acco non hotel gen dec.
	 *
	 * @param modifiedDate the modified date of this acco non hotel gen dec
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nh acco date of this acco non hotel gen dec.
	 *
	 * @param nhAccoDate the nh acco date of this acco non hotel gen dec
	 */
	@Override
	public void setNhAccoDate(Date nhAccoDate) {
		model.setNhAccoDate(nhAccoDate);
	}

	/**
	 * Sets the nh acco operator name of this acco non hotel gen dec.
	 *
	 * @param nhAccoOperatorName the nh acco operator name of this acco non hotel gen dec
	 */
	@Override
	public void setNhAccoOperatorName(String nhAccoOperatorName) {
		model.setNhAccoOperatorName(nhAccoOperatorName);
	}

	/**
	 * Sets the nh acco since of this acco non hotel gen dec.
	 *
	 * @param nhAccoSince the nh acco since of this acco non hotel gen dec
	 */
	@Override
	public void setNhAccoSince(Date nhAccoSince) {
		model.setNhAccoSince(nhAccoSince);
	}

	/**
	 * Sets the primary key of this acco non hotel gen dec.
	 *
	 * @param primaryKey the primary key of this acco non hotel gen dec
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this acco non hotel gen dec.
	 *
	 * @param userId the user ID of this acco non hotel gen dec
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acco non hotel gen dec.
	 *
	 * @param userName the user name of this acco non hotel gen dec
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acco non hotel gen dec.
	 *
	 * @param userUuid the user uuid of this acco non hotel gen dec
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acco non hotel gen dec.
	 *
	 * @param uuid the uuid of this acco non hotel gen dec
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
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
	protected AccoNonHotelGenDecWrapper wrap(
		AccoNonHotelGenDec accoNonHotelGenDec) {

		return new AccoNonHotelGenDecWrapper(accoNonHotelGenDec);
	}

}