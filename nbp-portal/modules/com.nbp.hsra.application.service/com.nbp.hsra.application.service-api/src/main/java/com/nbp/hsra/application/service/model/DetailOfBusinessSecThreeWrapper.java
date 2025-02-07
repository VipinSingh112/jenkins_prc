/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DetailOfBusinessSecThree}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfBusinessSecThree
 * @generated
 */
public class DetailOfBusinessSecThreeWrapper
	extends BaseModelWrapper<DetailOfBusinessSecThree>
	implements DetailOfBusinessSecThree,
			   ModelWrapper<DetailOfBusinessSecThree> {

	public DetailOfBusinessSecThreeWrapper(
		DetailOfBusinessSecThree detailOfBusinessSecThree) {

		super(detailOfBusinessSecThree);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"detailOfBusinessSecThreeId", getDetailOfBusinessSecThreeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("businessType", getBusinessType());
		attributes.put("nuclearBusinessNumber", getNuclearBusinessNumber());
		attributes.put("nuclearCorporationNum", getNuclearCorporationNum());
		attributes.put("nuclearPublicAct", getNuclearPublicAct());
		attributes.put("nuclearName", getNuclearName());
		attributes.put("nuclearAddressThird", getNuclearAddressThird());
		attributes.put("nuclearThirdParish", getNuclearThirdParish());
		attributes.put("nuclearTelephoneNum", getNuclearTelephoneNum());
		attributes.put("nuclearfaxNumber", getNuclearfaxNumber());
		attributes.put("nuclearEmailAdd", getNuclearEmailAdd());
		attributes.put("nuclearFinancial", getNuclearFinancial());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long detailOfBusinessSecThreeId = (Long)attributes.get(
			"detailOfBusinessSecThreeId");

		if (detailOfBusinessSecThreeId != null) {
			setDetailOfBusinessSecThreeId(detailOfBusinessSecThreeId);
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

		String businessType = (String)attributes.get("businessType");

		if (businessType != null) {
			setBusinessType(businessType);
		}

		String nuclearBusinessNumber = (String)attributes.get(
			"nuclearBusinessNumber");

		if (nuclearBusinessNumber != null) {
			setNuclearBusinessNumber(nuclearBusinessNumber);
		}

		String nuclearCorporationNum = (String)attributes.get(
			"nuclearCorporationNum");

		if (nuclearCorporationNum != null) {
			setNuclearCorporationNum(nuclearCorporationNum);
		}

		String nuclearPublicAct = (String)attributes.get("nuclearPublicAct");

		if (nuclearPublicAct != null) {
			setNuclearPublicAct(nuclearPublicAct);
		}

		String nuclearName = (String)attributes.get("nuclearName");

		if (nuclearName != null) {
			setNuclearName(nuclearName);
		}

		String nuclearAddressThird = (String)attributes.get(
			"nuclearAddressThird");

		if (nuclearAddressThird != null) {
			setNuclearAddressThird(nuclearAddressThird);
		}

		String nuclearThirdParish = (String)attributes.get(
			"nuclearThirdParish");

		if (nuclearThirdParish != null) {
			setNuclearThirdParish(nuclearThirdParish);
		}

		String nuclearTelephoneNum = (String)attributes.get(
			"nuclearTelephoneNum");

		if (nuclearTelephoneNum != null) {
			setNuclearTelephoneNum(nuclearTelephoneNum);
		}

		String nuclearfaxNumber = (String)attributes.get("nuclearfaxNumber");

		if (nuclearfaxNumber != null) {
			setNuclearfaxNumber(nuclearfaxNumber);
		}

		String nuclearEmailAdd = (String)attributes.get("nuclearEmailAdd");

		if (nuclearEmailAdd != null) {
			setNuclearEmailAdd(nuclearEmailAdd);
		}

		String nuclearFinancial = (String)attributes.get("nuclearFinancial");

		if (nuclearFinancial != null) {
			setNuclearFinancial(nuclearFinancial);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public DetailOfBusinessSecThree cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the business type of this detail of business sec three.
	 *
	 * @return the business type of this detail of business sec three
	 */
	@Override
	public String getBusinessType() {
		return model.getBusinessType();
	}

	/**
	 * Returns the company ID of this detail of business sec three.
	 *
	 * @return the company ID of this detail of business sec three
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this detail of business sec three.
	 *
	 * @return the create date of this detail of business sec three
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the detail of business sec three ID of this detail of business sec three.
	 *
	 * @return the detail of business sec three ID of this detail of business sec three
	 */
	@Override
	public long getDetailOfBusinessSecThreeId() {
		return model.getDetailOfBusinessSecThreeId();
	}

	/**
	 * Returns the group ID of this detail of business sec three.
	 *
	 * @return the group ID of this detail of business sec three
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this detail of business sec three.
	 *
	 * @return the hsra application ID of this detail of business sec three
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the modified date of this detail of business sec three.
	 *
	 * @return the modified date of this detail of business sec three
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nuclear address third of this detail of business sec three.
	 *
	 * @return the nuclear address third of this detail of business sec three
	 */
	@Override
	public String getNuclearAddressThird() {
		return model.getNuclearAddressThird();
	}

	/**
	 * Returns the nuclear business number of this detail of business sec three.
	 *
	 * @return the nuclear business number of this detail of business sec three
	 */
	@Override
	public String getNuclearBusinessNumber() {
		return model.getNuclearBusinessNumber();
	}

	/**
	 * Returns the nuclear corporation num of this detail of business sec three.
	 *
	 * @return the nuclear corporation num of this detail of business sec three
	 */
	@Override
	public String getNuclearCorporationNum() {
		return model.getNuclearCorporationNum();
	}

	/**
	 * Returns the nuclear email add of this detail of business sec three.
	 *
	 * @return the nuclear email add of this detail of business sec three
	 */
	@Override
	public String getNuclearEmailAdd() {
		return model.getNuclearEmailAdd();
	}

	/**
	 * Returns the nuclearfax number of this detail of business sec three.
	 *
	 * @return the nuclearfax number of this detail of business sec three
	 */
	@Override
	public String getNuclearfaxNumber() {
		return model.getNuclearfaxNumber();
	}

	/**
	 * Returns the nuclear financial of this detail of business sec three.
	 *
	 * @return the nuclear financial of this detail of business sec three
	 */
	@Override
	public String getNuclearFinancial() {
		return model.getNuclearFinancial();
	}

	/**
	 * Returns the nuclear name of this detail of business sec three.
	 *
	 * @return the nuclear name of this detail of business sec three
	 */
	@Override
	public String getNuclearName() {
		return model.getNuclearName();
	}

	/**
	 * Returns the nuclear public act of this detail of business sec three.
	 *
	 * @return the nuclear public act of this detail of business sec three
	 */
	@Override
	public String getNuclearPublicAct() {
		return model.getNuclearPublicAct();
	}

	/**
	 * Returns the nuclear telephone num of this detail of business sec three.
	 *
	 * @return the nuclear telephone num of this detail of business sec three
	 */
	@Override
	public String getNuclearTelephoneNum() {
		return model.getNuclearTelephoneNum();
	}

	/**
	 * Returns the nuclear third parish of this detail of business sec three.
	 *
	 * @return the nuclear third parish of this detail of business sec three
	 */
	@Override
	public String getNuclearThirdParish() {
		return model.getNuclearThirdParish();
	}

	/**
	 * Returns the primary key of this detail of business sec three.
	 *
	 * @return the primary key of this detail of business sec three
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this detail of business sec three.
	 *
	 * @return the user ID of this detail of business sec three
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this detail of business sec three.
	 *
	 * @return the user name of this detail of business sec three
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this detail of business sec three.
	 *
	 * @return the user uuid of this detail of business sec three
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
	 * Sets the business type of this detail of business sec three.
	 *
	 * @param businessType the business type of this detail of business sec three
	 */
	@Override
	public void setBusinessType(String businessType) {
		model.setBusinessType(businessType);
	}

	/**
	 * Sets the company ID of this detail of business sec three.
	 *
	 * @param companyId the company ID of this detail of business sec three
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this detail of business sec three.
	 *
	 * @param createDate the create date of this detail of business sec three
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the detail of business sec three ID of this detail of business sec three.
	 *
	 * @param detailOfBusinessSecThreeId the detail of business sec three ID of this detail of business sec three
	 */
	@Override
	public void setDetailOfBusinessSecThreeId(long detailOfBusinessSecThreeId) {
		model.setDetailOfBusinessSecThreeId(detailOfBusinessSecThreeId);
	}

	/**
	 * Sets the group ID of this detail of business sec three.
	 *
	 * @param groupId the group ID of this detail of business sec three
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this detail of business sec three.
	 *
	 * @param hsraApplicationId the hsra application ID of this detail of business sec three
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the modified date of this detail of business sec three.
	 *
	 * @param modifiedDate the modified date of this detail of business sec three
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nuclear address third of this detail of business sec three.
	 *
	 * @param nuclearAddressThird the nuclear address third of this detail of business sec three
	 */
	@Override
	public void setNuclearAddressThird(String nuclearAddressThird) {
		model.setNuclearAddressThird(nuclearAddressThird);
	}

	/**
	 * Sets the nuclear business number of this detail of business sec three.
	 *
	 * @param nuclearBusinessNumber the nuclear business number of this detail of business sec three
	 */
	@Override
	public void setNuclearBusinessNumber(String nuclearBusinessNumber) {
		model.setNuclearBusinessNumber(nuclearBusinessNumber);
	}

	/**
	 * Sets the nuclear corporation num of this detail of business sec three.
	 *
	 * @param nuclearCorporationNum the nuclear corporation num of this detail of business sec three
	 */
	@Override
	public void setNuclearCorporationNum(String nuclearCorporationNum) {
		model.setNuclearCorporationNum(nuclearCorporationNum);
	}

	/**
	 * Sets the nuclear email add of this detail of business sec three.
	 *
	 * @param nuclearEmailAdd the nuclear email add of this detail of business sec three
	 */
	@Override
	public void setNuclearEmailAdd(String nuclearEmailAdd) {
		model.setNuclearEmailAdd(nuclearEmailAdd);
	}

	/**
	 * Sets the nuclearfax number of this detail of business sec three.
	 *
	 * @param nuclearfaxNumber the nuclearfax number of this detail of business sec three
	 */
	@Override
	public void setNuclearfaxNumber(String nuclearfaxNumber) {
		model.setNuclearfaxNumber(nuclearfaxNumber);
	}

	/**
	 * Sets the nuclear financial of this detail of business sec three.
	 *
	 * @param nuclearFinancial the nuclear financial of this detail of business sec three
	 */
	@Override
	public void setNuclearFinancial(String nuclearFinancial) {
		model.setNuclearFinancial(nuclearFinancial);
	}

	/**
	 * Sets the nuclear name of this detail of business sec three.
	 *
	 * @param nuclearName the nuclear name of this detail of business sec three
	 */
	@Override
	public void setNuclearName(String nuclearName) {
		model.setNuclearName(nuclearName);
	}

	/**
	 * Sets the nuclear public act of this detail of business sec three.
	 *
	 * @param nuclearPublicAct the nuclear public act of this detail of business sec three
	 */
	@Override
	public void setNuclearPublicAct(String nuclearPublicAct) {
		model.setNuclearPublicAct(nuclearPublicAct);
	}

	/**
	 * Sets the nuclear telephone num of this detail of business sec three.
	 *
	 * @param nuclearTelephoneNum the nuclear telephone num of this detail of business sec three
	 */
	@Override
	public void setNuclearTelephoneNum(String nuclearTelephoneNum) {
		model.setNuclearTelephoneNum(nuclearTelephoneNum);
	}

	/**
	 * Sets the nuclear third parish of this detail of business sec three.
	 *
	 * @param nuclearThirdParish the nuclear third parish of this detail of business sec three
	 */
	@Override
	public void setNuclearThirdParish(String nuclearThirdParish) {
		model.setNuclearThirdParish(nuclearThirdParish);
	}

	/**
	 * Sets the primary key of this detail of business sec three.
	 *
	 * @param primaryKey the primary key of this detail of business sec three
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this detail of business sec three.
	 *
	 * @param userId the user ID of this detail of business sec three
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this detail of business sec three.
	 *
	 * @param userName the user name of this detail of business sec three
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this detail of business sec three.
	 *
	 * @param userUuid the user uuid of this detail of business sec three
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
	protected DetailOfBusinessSecThreeWrapper wrap(
		DetailOfBusinessSecThree detailOfBusinessSecThree) {

		return new DetailOfBusinessSecThreeWrapper(detailOfBusinessSecThree);
	}

}