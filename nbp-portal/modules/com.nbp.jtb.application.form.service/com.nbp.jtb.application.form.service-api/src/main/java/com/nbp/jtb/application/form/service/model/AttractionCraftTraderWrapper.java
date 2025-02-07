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
 * This class is a wrapper for {@link AttractionCraftTrader}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCraftTrader
 * @generated
 */
public class AttractionCraftTraderWrapper
	extends BaseModelWrapper<AttractionCraftTrader>
	implements AttractionCraftTrader, ModelWrapper<AttractionCraftTrader> {

	public AttractionCraftTraderWrapper(
		AttractionCraftTrader attractionCraftTrader) {

		super(attractionCraftTrader);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("attractionCraftTraderId", getAttractionCraftTraderId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("craftTradersAppliOwner", getCraftTradersAppliOwner());
		attributes.put(
			"craftTradersAppliAddress", getCraftTradersAppliAddress());
		attributes.put(
			"craftTradersAppliPhoneNo", getCraftTradersAppliPhoneNo());
		attributes.put("craftTradersAppliEmail", getCraftTradersAppliEmail());
		attributes.put("occupyLocation", getOccupyLocation());
		attributes.put("craftTraderGoodsType", getCraftTraderGoodsType());
		attributes.put("craftTraderName", getCraftTraderName());
		attributes.put("craftTraderPosition", getCraftTraderPosition());
		attributes.put("craftTraderMinisterAddr", getCraftTraderMinisterAddr());
		attributes.put("craftTraderMinisterName", getCraftTraderMinisterName());
		attributes.put(
			"craftTraderMinisterNamePos", getCraftTraderMinisterNamePos());
		attributes.put("craftTraderAddressOwner", getCraftTraderAddressOwner());
		attributes.put("craftTraderSignDate", getCraftTraderSignDate());
		attributes.put("craftTraderAssistSiDate", getCraftTraderAssistSiDate());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attractionCraftTraderId = (Long)attributes.get(
			"attractionCraftTraderId");

		if (attractionCraftTraderId != null) {
			setAttractionCraftTraderId(attractionCraftTraderId);
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

		String craftTradersAppliOwner = (String)attributes.get(
			"craftTradersAppliOwner");

		if (craftTradersAppliOwner != null) {
			setCraftTradersAppliOwner(craftTradersAppliOwner);
		}

		String craftTradersAppliAddress = (String)attributes.get(
			"craftTradersAppliAddress");

		if (craftTradersAppliAddress != null) {
			setCraftTradersAppliAddress(craftTradersAppliAddress);
		}

		String craftTradersAppliPhoneNo = (String)attributes.get(
			"craftTradersAppliPhoneNo");

		if (craftTradersAppliPhoneNo != null) {
			setCraftTradersAppliPhoneNo(craftTradersAppliPhoneNo);
		}

		String craftTradersAppliEmail = (String)attributes.get(
			"craftTradersAppliEmail");

		if (craftTradersAppliEmail != null) {
			setCraftTradersAppliEmail(craftTradersAppliEmail);
		}

		String occupyLocation = (String)attributes.get("occupyLocation");

		if (occupyLocation != null) {
			setOccupyLocation(occupyLocation);
		}

		String craftTraderGoodsType = (String)attributes.get(
			"craftTraderGoodsType");

		if (craftTraderGoodsType != null) {
			setCraftTraderGoodsType(craftTraderGoodsType);
		}

		String craftTraderName = (String)attributes.get("craftTraderName");

		if (craftTraderName != null) {
			setCraftTraderName(craftTraderName);
		}

		String craftTraderPosition = (String)attributes.get(
			"craftTraderPosition");

		if (craftTraderPosition != null) {
			setCraftTraderPosition(craftTraderPosition);
		}

		String craftTraderMinisterAddr = (String)attributes.get(
			"craftTraderMinisterAddr");

		if (craftTraderMinisterAddr != null) {
			setCraftTraderMinisterAddr(craftTraderMinisterAddr);
		}

		String craftTraderMinisterName = (String)attributes.get(
			"craftTraderMinisterName");

		if (craftTraderMinisterName != null) {
			setCraftTraderMinisterName(craftTraderMinisterName);
		}

		String craftTraderMinisterNamePos = (String)attributes.get(
			"craftTraderMinisterNamePos");

		if (craftTraderMinisterNamePos != null) {
			setCraftTraderMinisterNamePos(craftTraderMinisterNamePos);
		}

		String craftTraderAddressOwner = (String)attributes.get(
			"craftTraderAddressOwner");

		if (craftTraderAddressOwner != null) {
			setCraftTraderAddressOwner(craftTraderAddressOwner);
		}

		Date craftTraderSignDate = (Date)attributes.get("craftTraderSignDate");

		if (craftTraderSignDate != null) {
			setCraftTraderSignDate(craftTraderSignDate);
		}

		Date craftTraderAssistSiDate = (Date)attributes.get(
			"craftTraderAssistSiDate");

		if (craftTraderAssistSiDate != null) {
			setCraftTraderAssistSiDate(craftTraderAssistSiDate);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AttractionCraftTrader cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the attraction craft trader ID of this attraction craft trader.
	 *
	 * @return the attraction craft trader ID of this attraction craft trader
	 */
	@Override
	public long getAttractionCraftTraderId() {
		return model.getAttractionCraftTraderId();
	}

	/**
	 * Returns the company ID of this attraction craft trader.
	 *
	 * @return the company ID of this attraction craft trader
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the craft trader address owner of this attraction craft trader.
	 *
	 * @return the craft trader address owner of this attraction craft trader
	 */
	@Override
	public String getCraftTraderAddressOwner() {
		return model.getCraftTraderAddressOwner();
	}

	/**
	 * Returns the craft trader assist si date of this attraction craft trader.
	 *
	 * @return the craft trader assist si date of this attraction craft trader
	 */
	@Override
	public Date getCraftTraderAssistSiDate() {
		return model.getCraftTraderAssistSiDate();
	}

	/**
	 * Returns the craft trader goods type of this attraction craft trader.
	 *
	 * @return the craft trader goods type of this attraction craft trader
	 */
	@Override
	public String getCraftTraderGoodsType() {
		return model.getCraftTraderGoodsType();
	}

	/**
	 * Returns the craft trader minister addr of this attraction craft trader.
	 *
	 * @return the craft trader minister addr of this attraction craft trader
	 */
	@Override
	public String getCraftTraderMinisterAddr() {
		return model.getCraftTraderMinisterAddr();
	}

	/**
	 * Returns the craft trader minister name of this attraction craft trader.
	 *
	 * @return the craft trader minister name of this attraction craft trader
	 */
	@Override
	public String getCraftTraderMinisterName() {
		return model.getCraftTraderMinisterName();
	}

	/**
	 * Returns the craft trader minister name pos of this attraction craft trader.
	 *
	 * @return the craft trader minister name pos of this attraction craft trader
	 */
	@Override
	public String getCraftTraderMinisterNamePos() {
		return model.getCraftTraderMinisterNamePos();
	}

	/**
	 * Returns the craft trader name of this attraction craft trader.
	 *
	 * @return the craft trader name of this attraction craft trader
	 */
	@Override
	public String getCraftTraderName() {
		return model.getCraftTraderName();
	}

	/**
	 * Returns the craft trader position of this attraction craft trader.
	 *
	 * @return the craft trader position of this attraction craft trader
	 */
	@Override
	public String getCraftTraderPosition() {
		return model.getCraftTraderPosition();
	}

	/**
	 * Returns the craft traders appli address of this attraction craft trader.
	 *
	 * @return the craft traders appli address of this attraction craft trader
	 */
	@Override
	public String getCraftTradersAppliAddress() {
		return model.getCraftTradersAppliAddress();
	}

	/**
	 * Returns the craft traders appli email of this attraction craft trader.
	 *
	 * @return the craft traders appli email of this attraction craft trader
	 */
	@Override
	public String getCraftTradersAppliEmail() {
		return model.getCraftTradersAppliEmail();
	}

	/**
	 * Returns the craft traders appli owner of this attraction craft trader.
	 *
	 * @return the craft traders appli owner of this attraction craft trader
	 */
	@Override
	public String getCraftTradersAppliOwner() {
		return model.getCraftTradersAppliOwner();
	}

	/**
	 * Returns the craft traders appli phone no of this attraction craft trader.
	 *
	 * @return the craft traders appli phone no of this attraction craft trader
	 */
	@Override
	public String getCraftTradersAppliPhoneNo() {
		return model.getCraftTradersAppliPhoneNo();
	}

	/**
	 * Returns the craft trader sign date of this attraction craft trader.
	 *
	 * @return the craft trader sign date of this attraction craft trader
	 */
	@Override
	public Date getCraftTraderSignDate() {
		return model.getCraftTraderSignDate();
	}

	/**
	 * Returns the create date of this attraction craft trader.
	 *
	 * @return the create date of this attraction craft trader
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this attraction craft trader.
	 *
	 * @return the group ID of this attraction craft trader
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb application ID of this attraction craft trader.
	 *
	 * @return the jtb application ID of this attraction craft trader
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this attraction craft trader.
	 *
	 * @return the modified date of this attraction craft trader
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the occupy location of this attraction craft trader.
	 *
	 * @return the occupy location of this attraction craft trader
	 */
	@Override
	public String getOccupyLocation() {
		return model.getOccupyLocation();
	}

	/**
	 * Returns the primary key of this attraction craft trader.
	 *
	 * @return the primary key of this attraction craft trader
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this attraction craft trader.
	 *
	 * @return the user ID of this attraction craft trader
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this attraction craft trader.
	 *
	 * @return the user name of this attraction craft trader
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this attraction craft trader.
	 *
	 * @return the user uuid of this attraction craft trader
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
	 * Sets the attraction craft trader ID of this attraction craft trader.
	 *
	 * @param attractionCraftTraderId the attraction craft trader ID of this attraction craft trader
	 */
	@Override
	public void setAttractionCraftTraderId(long attractionCraftTraderId) {
		model.setAttractionCraftTraderId(attractionCraftTraderId);
	}

	/**
	 * Sets the company ID of this attraction craft trader.
	 *
	 * @param companyId the company ID of this attraction craft trader
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the craft trader address owner of this attraction craft trader.
	 *
	 * @param craftTraderAddressOwner the craft trader address owner of this attraction craft trader
	 */
	@Override
	public void setCraftTraderAddressOwner(String craftTraderAddressOwner) {
		model.setCraftTraderAddressOwner(craftTraderAddressOwner);
	}

	/**
	 * Sets the craft trader assist si date of this attraction craft trader.
	 *
	 * @param craftTraderAssistSiDate the craft trader assist si date of this attraction craft trader
	 */
	@Override
	public void setCraftTraderAssistSiDate(Date craftTraderAssistSiDate) {
		model.setCraftTraderAssistSiDate(craftTraderAssistSiDate);
	}

	/**
	 * Sets the craft trader goods type of this attraction craft trader.
	 *
	 * @param craftTraderGoodsType the craft trader goods type of this attraction craft trader
	 */
	@Override
	public void setCraftTraderGoodsType(String craftTraderGoodsType) {
		model.setCraftTraderGoodsType(craftTraderGoodsType);
	}

	/**
	 * Sets the craft trader minister addr of this attraction craft trader.
	 *
	 * @param craftTraderMinisterAddr the craft trader minister addr of this attraction craft trader
	 */
	@Override
	public void setCraftTraderMinisterAddr(String craftTraderMinisterAddr) {
		model.setCraftTraderMinisterAddr(craftTraderMinisterAddr);
	}

	/**
	 * Sets the craft trader minister name of this attraction craft trader.
	 *
	 * @param craftTraderMinisterName the craft trader minister name of this attraction craft trader
	 */
	@Override
	public void setCraftTraderMinisterName(String craftTraderMinisterName) {
		model.setCraftTraderMinisterName(craftTraderMinisterName);
	}

	/**
	 * Sets the craft trader minister name pos of this attraction craft trader.
	 *
	 * @param craftTraderMinisterNamePos the craft trader minister name pos of this attraction craft trader
	 */
	@Override
	public void setCraftTraderMinisterNamePos(
		String craftTraderMinisterNamePos) {

		model.setCraftTraderMinisterNamePos(craftTraderMinisterNamePos);
	}

	/**
	 * Sets the craft trader name of this attraction craft trader.
	 *
	 * @param craftTraderName the craft trader name of this attraction craft trader
	 */
	@Override
	public void setCraftTraderName(String craftTraderName) {
		model.setCraftTraderName(craftTraderName);
	}

	/**
	 * Sets the craft trader position of this attraction craft trader.
	 *
	 * @param craftTraderPosition the craft trader position of this attraction craft trader
	 */
	@Override
	public void setCraftTraderPosition(String craftTraderPosition) {
		model.setCraftTraderPosition(craftTraderPosition);
	}

	/**
	 * Sets the craft traders appli address of this attraction craft trader.
	 *
	 * @param craftTradersAppliAddress the craft traders appli address of this attraction craft trader
	 */
	@Override
	public void setCraftTradersAppliAddress(String craftTradersAppliAddress) {
		model.setCraftTradersAppliAddress(craftTradersAppliAddress);
	}

	/**
	 * Sets the craft traders appli email of this attraction craft trader.
	 *
	 * @param craftTradersAppliEmail the craft traders appli email of this attraction craft trader
	 */
	@Override
	public void setCraftTradersAppliEmail(String craftTradersAppliEmail) {
		model.setCraftTradersAppliEmail(craftTradersAppliEmail);
	}

	/**
	 * Sets the craft traders appli owner of this attraction craft trader.
	 *
	 * @param craftTradersAppliOwner the craft traders appli owner of this attraction craft trader
	 */
	@Override
	public void setCraftTradersAppliOwner(String craftTradersAppliOwner) {
		model.setCraftTradersAppliOwner(craftTradersAppliOwner);
	}

	/**
	 * Sets the craft traders appli phone no of this attraction craft trader.
	 *
	 * @param craftTradersAppliPhoneNo the craft traders appli phone no of this attraction craft trader
	 */
	@Override
	public void setCraftTradersAppliPhoneNo(String craftTradersAppliPhoneNo) {
		model.setCraftTradersAppliPhoneNo(craftTradersAppliPhoneNo);
	}

	/**
	 * Sets the craft trader sign date of this attraction craft trader.
	 *
	 * @param craftTraderSignDate the craft trader sign date of this attraction craft trader
	 */
	@Override
	public void setCraftTraderSignDate(Date craftTraderSignDate) {
		model.setCraftTraderSignDate(craftTraderSignDate);
	}

	/**
	 * Sets the create date of this attraction craft trader.
	 *
	 * @param createDate the create date of this attraction craft trader
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this attraction craft trader.
	 *
	 * @param groupId the group ID of this attraction craft trader
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb application ID of this attraction craft trader.
	 *
	 * @param jtbApplicationId the jtb application ID of this attraction craft trader
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this attraction craft trader.
	 *
	 * @param modifiedDate the modified date of this attraction craft trader
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the occupy location of this attraction craft trader.
	 *
	 * @param occupyLocation the occupy location of this attraction craft trader
	 */
	@Override
	public void setOccupyLocation(String occupyLocation) {
		model.setOccupyLocation(occupyLocation);
	}

	/**
	 * Sets the primary key of this attraction craft trader.
	 *
	 * @param primaryKey the primary key of this attraction craft trader
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this attraction craft trader.
	 *
	 * @param userId the user ID of this attraction craft trader
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this attraction craft trader.
	 *
	 * @param userName the user name of this attraction craft trader
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this attraction craft trader.
	 *
	 * @param userUuid the user uuid of this attraction craft trader
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
	protected AttractionCraftTraderWrapper wrap(
		AttractionCraftTrader attractionCraftTrader) {

		return new AttractionCraftTraderWrapper(attractionCraftTrader);
	}

}