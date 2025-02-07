/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FactoriesStandardActInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesStandardActInfo
 * @generated
 */
public class FactoriesStandardActInfoWrapper
	extends BaseModelWrapper<FactoriesStandardActInfo>
	implements FactoriesStandardActInfo,
			   ModelWrapper<FactoriesStandardActInfo> {

	public FactoriesStandardActInfoWrapper(
		FactoriesStandardActInfo factoriesStandardActInfo) {

		super(factoriesStandardActInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("factoriesStandardActId", getFactoriesStandardActId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"standardsActEstablishmentName",
			getStandardsActEstablishmentName());
		attributes.put("standardsActAddParish", getStandardsActAddParish());
		attributes.put("standardsActAddress", getStandardsActAddress());
		attributes.put("standardsActTel", getStandardsActTel());
		attributes.put("standardsActWhatsAppNum", getStandardsActWhatsAppNum());
		attributes.put("standardsActEmail", getStandardsActEmail());
		attributes.put("standardsActFaxNum", getStandardsActFaxNum());
		attributes.put(
			"standardsActOperatorName", getStandardsActOperatorName());
		attributes.put(
			"standardsActOperatorAddress", getStandardsActOperatorAddress());
		attributes.put("standardsActParish", getStandardsActParish());
		attributes.put("standardsActOperatorTel", getStandardsActOperatorTel());
		attributes.put(
			"standardActProductManufactured",
			getStandardActProductManufactured());
		attributes.put(
			"standardActBrandManufactured", getStandardActBrandManufactured());
		attributes.put("standardsActProductSize", getStandardsActProductSize());
		attributes.put("standardsActLastDate", getStandardsActLastDate());
		attributes.put("standardsActPurpose", getStandardsActPurpose());
		attributes.put("standardsActDate", getStandardsActDate());
		attributes.put("establishmentBefore", getEstablishmentBefore());
		attributes.put("factoriesApplicationId", getFactoriesApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long factoriesStandardActId = (Long)attributes.get(
			"factoriesStandardActId");

		if (factoriesStandardActId != null) {
			setFactoriesStandardActId(factoriesStandardActId);
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

		String standardsActEstablishmentName = (String)attributes.get(
			"standardsActEstablishmentName");

		if (standardsActEstablishmentName != null) {
			setStandardsActEstablishmentName(standardsActEstablishmentName);
		}

		String standardsActAddParish = (String)attributes.get(
			"standardsActAddParish");

		if (standardsActAddParish != null) {
			setStandardsActAddParish(standardsActAddParish);
		}

		String standardsActAddress = (String)attributes.get(
			"standardsActAddress");

		if (standardsActAddress != null) {
			setStandardsActAddress(standardsActAddress);
		}

		String standardsActTel = (String)attributes.get("standardsActTel");

		if (standardsActTel != null) {
			setStandardsActTel(standardsActTel);
		}

		String standardsActWhatsAppNum = (String)attributes.get(
			"standardsActWhatsAppNum");

		if (standardsActWhatsAppNum != null) {
			setStandardsActWhatsAppNum(standardsActWhatsAppNum);
		}

		String standardsActEmail = (String)attributes.get("standardsActEmail");

		if (standardsActEmail != null) {
			setStandardsActEmail(standardsActEmail);
		}

		String standardsActFaxNum = (String)attributes.get(
			"standardsActFaxNum");

		if (standardsActFaxNum != null) {
			setStandardsActFaxNum(standardsActFaxNum);
		}

		String standardsActOperatorName = (String)attributes.get(
			"standardsActOperatorName");

		if (standardsActOperatorName != null) {
			setStandardsActOperatorName(standardsActOperatorName);
		}

		String standardsActOperatorAddress = (String)attributes.get(
			"standardsActOperatorAddress");

		if (standardsActOperatorAddress != null) {
			setStandardsActOperatorAddress(standardsActOperatorAddress);
		}

		String standardsActParish = (String)attributes.get(
			"standardsActParish");

		if (standardsActParish != null) {
			setStandardsActParish(standardsActParish);
		}

		String standardsActOperatorTel = (String)attributes.get(
			"standardsActOperatorTel");

		if (standardsActOperatorTel != null) {
			setStandardsActOperatorTel(standardsActOperatorTel);
		}

		String standardActProductManufactured = (String)attributes.get(
			"standardActProductManufactured");

		if (standardActProductManufactured != null) {
			setStandardActProductManufactured(standardActProductManufactured);
		}

		String standardActBrandManufactured = (String)attributes.get(
			"standardActBrandManufactured");

		if (standardActBrandManufactured != null) {
			setStandardActBrandManufactured(standardActBrandManufactured);
		}

		String standardsActProductSize = (String)attributes.get(
			"standardsActProductSize");

		if (standardsActProductSize != null) {
			setStandardsActProductSize(standardsActProductSize);
		}

		Date standardsActLastDate = (Date)attributes.get(
			"standardsActLastDate");

		if (standardsActLastDate != null) {
			setStandardsActLastDate(standardsActLastDate);
		}

		String standardsActPurpose = (String)attributes.get(
			"standardsActPurpose");

		if (standardsActPurpose != null) {
			setStandardsActPurpose(standardsActPurpose);
		}

		Date standardsActDate = (Date)attributes.get("standardsActDate");

		if (standardsActDate != null) {
			setStandardsActDate(standardsActDate);
		}

		String establishmentBefore = (String)attributes.get(
			"establishmentBefore");

		if (establishmentBefore != null) {
			setEstablishmentBefore(establishmentBefore);
		}

		Long factoriesApplicationId = (Long)attributes.get(
			"factoriesApplicationId");

		if (factoriesApplicationId != null) {
			setFactoriesApplicationId(factoriesApplicationId);
		}
	}

	@Override
	public FactoriesStandardActInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this factories standard act info.
	 *
	 * @return the company ID of this factories standard act info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this factories standard act info.
	 *
	 * @return the create date of this factories standard act info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the establishment before of this factories standard act info.
	 *
	 * @return the establishment before of this factories standard act info
	 */
	@Override
	public String getEstablishmentBefore() {
		return model.getEstablishmentBefore();
	}

	/**
	 * Returns the factories application ID of this factories standard act info.
	 *
	 * @return the factories application ID of this factories standard act info
	 */
	@Override
	public long getFactoriesApplicationId() {
		return model.getFactoriesApplicationId();
	}

	/**
	 * Returns the factories standard act ID of this factories standard act info.
	 *
	 * @return the factories standard act ID of this factories standard act info
	 */
	@Override
	public long getFactoriesStandardActId() {
		return model.getFactoriesStandardActId();
	}

	/**
	 * Returns the group ID of this factories standard act info.
	 *
	 * @return the group ID of this factories standard act info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this factories standard act info.
	 *
	 * @return the modified date of this factories standard act info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this factories standard act info.
	 *
	 * @return the primary key of this factories standard act info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the standard act brand manufactured of this factories standard act info.
	 *
	 * @return the standard act brand manufactured of this factories standard act info
	 */
	@Override
	public String getStandardActBrandManufactured() {
		return model.getStandardActBrandManufactured();
	}

	/**
	 * Returns the standard act product manufactured of this factories standard act info.
	 *
	 * @return the standard act product manufactured of this factories standard act info
	 */
	@Override
	public String getStandardActProductManufactured() {
		return model.getStandardActProductManufactured();
	}

	/**
	 * Returns the standards act add parish of this factories standard act info.
	 *
	 * @return the standards act add parish of this factories standard act info
	 */
	@Override
	public String getStandardsActAddParish() {
		return model.getStandardsActAddParish();
	}

	/**
	 * Returns the standards act address of this factories standard act info.
	 *
	 * @return the standards act address of this factories standard act info
	 */
	@Override
	public String getStandardsActAddress() {
		return model.getStandardsActAddress();
	}

	/**
	 * Returns the standards act date of this factories standard act info.
	 *
	 * @return the standards act date of this factories standard act info
	 */
	@Override
	public Date getStandardsActDate() {
		return model.getStandardsActDate();
	}

	/**
	 * Returns the standards act email of this factories standard act info.
	 *
	 * @return the standards act email of this factories standard act info
	 */
	@Override
	public String getStandardsActEmail() {
		return model.getStandardsActEmail();
	}

	/**
	 * Returns the standards act establishment name of this factories standard act info.
	 *
	 * @return the standards act establishment name of this factories standard act info
	 */
	@Override
	public String getStandardsActEstablishmentName() {
		return model.getStandardsActEstablishmentName();
	}

	/**
	 * Returns the standards act fax num of this factories standard act info.
	 *
	 * @return the standards act fax num of this factories standard act info
	 */
	@Override
	public String getStandardsActFaxNum() {
		return model.getStandardsActFaxNum();
	}

	/**
	 * Returns the standards act last date of this factories standard act info.
	 *
	 * @return the standards act last date of this factories standard act info
	 */
	@Override
	public Date getStandardsActLastDate() {
		return model.getStandardsActLastDate();
	}

	/**
	 * Returns the standards act operator address of this factories standard act info.
	 *
	 * @return the standards act operator address of this factories standard act info
	 */
	@Override
	public String getStandardsActOperatorAddress() {
		return model.getStandardsActOperatorAddress();
	}

	/**
	 * Returns the standards act operator name of this factories standard act info.
	 *
	 * @return the standards act operator name of this factories standard act info
	 */
	@Override
	public String getStandardsActOperatorName() {
		return model.getStandardsActOperatorName();
	}

	/**
	 * Returns the standards act operator tel of this factories standard act info.
	 *
	 * @return the standards act operator tel of this factories standard act info
	 */
	@Override
	public String getStandardsActOperatorTel() {
		return model.getStandardsActOperatorTel();
	}

	/**
	 * Returns the standards act parish of this factories standard act info.
	 *
	 * @return the standards act parish of this factories standard act info
	 */
	@Override
	public String getStandardsActParish() {
		return model.getStandardsActParish();
	}

	/**
	 * Returns the standards act product size of this factories standard act info.
	 *
	 * @return the standards act product size of this factories standard act info
	 */
	@Override
	public String getStandardsActProductSize() {
		return model.getStandardsActProductSize();
	}

	/**
	 * Returns the standards act purpose of this factories standard act info.
	 *
	 * @return the standards act purpose of this factories standard act info
	 */
	@Override
	public String getStandardsActPurpose() {
		return model.getStandardsActPurpose();
	}

	/**
	 * Returns the standards act tel of this factories standard act info.
	 *
	 * @return the standards act tel of this factories standard act info
	 */
	@Override
	public String getStandardsActTel() {
		return model.getStandardsActTel();
	}

	/**
	 * Returns the standards act whats app num of this factories standard act info.
	 *
	 * @return the standards act whats app num of this factories standard act info
	 */
	@Override
	public String getStandardsActWhatsAppNum() {
		return model.getStandardsActWhatsAppNum();
	}

	/**
	 * Returns the user ID of this factories standard act info.
	 *
	 * @return the user ID of this factories standard act info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this factories standard act info.
	 *
	 * @return the user name of this factories standard act info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this factories standard act info.
	 *
	 * @return the user uuid of this factories standard act info
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
	 * Sets the company ID of this factories standard act info.
	 *
	 * @param companyId the company ID of this factories standard act info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this factories standard act info.
	 *
	 * @param createDate the create date of this factories standard act info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the establishment before of this factories standard act info.
	 *
	 * @param establishmentBefore the establishment before of this factories standard act info
	 */
	@Override
	public void setEstablishmentBefore(String establishmentBefore) {
		model.setEstablishmentBefore(establishmentBefore);
	}

	/**
	 * Sets the factories application ID of this factories standard act info.
	 *
	 * @param factoriesApplicationId the factories application ID of this factories standard act info
	 */
	@Override
	public void setFactoriesApplicationId(long factoriesApplicationId) {
		model.setFactoriesApplicationId(factoriesApplicationId);
	}

	/**
	 * Sets the factories standard act ID of this factories standard act info.
	 *
	 * @param factoriesStandardActId the factories standard act ID of this factories standard act info
	 */
	@Override
	public void setFactoriesStandardActId(long factoriesStandardActId) {
		model.setFactoriesStandardActId(factoriesStandardActId);
	}

	/**
	 * Sets the group ID of this factories standard act info.
	 *
	 * @param groupId the group ID of this factories standard act info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this factories standard act info.
	 *
	 * @param modifiedDate the modified date of this factories standard act info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this factories standard act info.
	 *
	 * @param primaryKey the primary key of this factories standard act info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the standard act brand manufactured of this factories standard act info.
	 *
	 * @param standardActBrandManufactured the standard act brand manufactured of this factories standard act info
	 */
	@Override
	public void setStandardActBrandManufactured(
		String standardActBrandManufactured) {

		model.setStandardActBrandManufactured(standardActBrandManufactured);
	}

	/**
	 * Sets the standard act product manufactured of this factories standard act info.
	 *
	 * @param standardActProductManufactured the standard act product manufactured of this factories standard act info
	 */
	@Override
	public void setStandardActProductManufactured(
		String standardActProductManufactured) {

		model.setStandardActProductManufactured(standardActProductManufactured);
	}

	/**
	 * Sets the standards act add parish of this factories standard act info.
	 *
	 * @param standardsActAddParish the standards act add parish of this factories standard act info
	 */
	@Override
	public void setStandardsActAddParish(String standardsActAddParish) {
		model.setStandardsActAddParish(standardsActAddParish);
	}

	/**
	 * Sets the standards act address of this factories standard act info.
	 *
	 * @param standardsActAddress the standards act address of this factories standard act info
	 */
	@Override
	public void setStandardsActAddress(String standardsActAddress) {
		model.setStandardsActAddress(standardsActAddress);
	}

	/**
	 * Sets the standards act date of this factories standard act info.
	 *
	 * @param standardsActDate the standards act date of this factories standard act info
	 */
	@Override
	public void setStandardsActDate(Date standardsActDate) {
		model.setStandardsActDate(standardsActDate);
	}

	/**
	 * Sets the standards act email of this factories standard act info.
	 *
	 * @param standardsActEmail the standards act email of this factories standard act info
	 */
	@Override
	public void setStandardsActEmail(String standardsActEmail) {
		model.setStandardsActEmail(standardsActEmail);
	}

	/**
	 * Sets the standards act establishment name of this factories standard act info.
	 *
	 * @param standardsActEstablishmentName the standards act establishment name of this factories standard act info
	 */
	@Override
	public void setStandardsActEstablishmentName(
		String standardsActEstablishmentName) {

		model.setStandardsActEstablishmentName(standardsActEstablishmentName);
	}

	/**
	 * Sets the standards act fax num of this factories standard act info.
	 *
	 * @param standardsActFaxNum the standards act fax num of this factories standard act info
	 */
	@Override
	public void setStandardsActFaxNum(String standardsActFaxNum) {
		model.setStandardsActFaxNum(standardsActFaxNum);
	}

	/**
	 * Sets the standards act last date of this factories standard act info.
	 *
	 * @param standardsActLastDate the standards act last date of this factories standard act info
	 */
	@Override
	public void setStandardsActLastDate(Date standardsActLastDate) {
		model.setStandardsActLastDate(standardsActLastDate);
	}

	/**
	 * Sets the standards act operator address of this factories standard act info.
	 *
	 * @param standardsActOperatorAddress the standards act operator address of this factories standard act info
	 */
	@Override
	public void setStandardsActOperatorAddress(
		String standardsActOperatorAddress) {

		model.setStandardsActOperatorAddress(standardsActOperatorAddress);
	}

	/**
	 * Sets the standards act operator name of this factories standard act info.
	 *
	 * @param standardsActOperatorName the standards act operator name of this factories standard act info
	 */
	@Override
	public void setStandardsActOperatorName(String standardsActOperatorName) {
		model.setStandardsActOperatorName(standardsActOperatorName);
	}

	/**
	 * Sets the standards act operator tel of this factories standard act info.
	 *
	 * @param standardsActOperatorTel the standards act operator tel of this factories standard act info
	 */
	@Override
	public void setStandardsActOperatorTel(String standardsActOperatorTel) {
		model.setStandardsActOperatorTel(standardsActOperatorTel);
	}

	/**
	 * Sets the standards act parish of this factories standard act info.
	 *
	 * @param standardsActParish the standards act parish of this factories standard act info
	 */
	@Override
	public void setStandardsActParish(String standardsActParish) {
		model.setStandardsActParish(standardsActParish);
	}

	/**
	 * Sets the standards act product size of this factories standard act info.
	 *
	 * @param standardsActProductSize the standards act product size of this factories standard act info
	 */
	@Override
	public void setStandardsActProductSize(String standardsActProductSize) {
		model.setStandardsActProductSize(standardsActProductSize);
	}

	/**
	 * Sets the standards act purpose of this factories standard act info.
	 *
	 * @param standardsActPurpose the standards act purpose of this factories standard act info
	 */
	@Override
	public void setStandardsActPurpose(String standardsActPurpose) {
		model.setStandardsActPurpose(standardsActPurpose);
	}

	/**
	 * Sets the standards act tel of this factories standard act info.
	 *
	 * @param standardsActTel the standards act tel of this factories standard act info
	 */
	@Override
	public void setStandardsActTel(String standardsActTel) {
		model.setStandardsActTel(standardsActTel);
	}

	/**
	 * Sets the standards act whats app num of this factories standard act info.
	 *
	 * @param standardsActWhatsAppNum the standards act whats app num of this factories standard act info
	 */
	@Override
	public void setStandardsActWhatsAppNum(String standardsActWhatsAppNum) {
		model.setStandardsActWhatsAppNum(standardsActWhatsAppNum);
	}

	/**
	 * Sets the user ID of this factories standard act info.
	 *
	 * @param userId the user ID of this factories standard act info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this factories standard act info.
	 *
	 * @param userName the user name of this factories standard act info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this factories standard act info.
	 *
	 * @param userUuid the user uuid of this factories standard act info
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
	protected FactoriesStandardActInfoWrapper wrap(
		FactoriesStandardActInfo factoriesStandardActInfo) {

		return new FactoriesStandardActInfoWrapper(factoriesStandardActInfo);
	}

}