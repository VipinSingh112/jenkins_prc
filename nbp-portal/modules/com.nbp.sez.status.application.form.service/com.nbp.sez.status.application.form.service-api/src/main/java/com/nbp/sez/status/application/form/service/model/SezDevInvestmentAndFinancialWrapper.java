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
 * This class is a wrapper for {@link SezDevInvestmentAndFinancial}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevInvestmentAndFinancial
 * @generated
 */
public class SezDevInvestmentAndFinancialWrapper
	extends BaseModelWrapper<SezDevInvestmentAndFinancial>
	implements ModelWrapper<SezDevInvestmentAndFinancial>,
			   SezDevInvestmentAndFinancial {

	public SezDevInvestmentAndFinancialWrapper(
		SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial) {

		super(sezDevInvestmentAndFinancial);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"sezDevInvestmentAndFinancialId",
			getSezDevInvestmentAndFinancialId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("valueOfLand", getValueOfLand());
		attributes.put("buildingFactoryDevelop", getBuildingFactoryDevelop());
		attributes.put("onSiteInfrastructure", getOnSiteInfrastructure());
		attributes.put("port", getPort());
		attributes.put("airPort", getAirPort());
		attributes.put("other", getOther());
		attributes.put("total", getTotal());
		attributes.put("totalLocalDirector", getTotalLocalDirector());
		attributes.put("totalForeignDirector", getTotalForeignDirector());
		attributes.put("companyName", getCompanyName());
		attributes.put("resisdentAddress", getResisdentAddress());
		attributes.put("sourceOfFunds", getSourceOfFunds());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezDevInvestmentAndFinancialId = (Long)attributes.get(
			"sezDevInvestmentAndFinancialId");

		if (sezDevInvestmentAndFinancialId != null) {
			setSezDevInvestmentAndFinancialId(sezDevInvestmentAndFinancialId);
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

		String valueOfLand = (String)attributes.get("valueOfLand");

		if (valueOfLand != null) {
			setValueOfLand(valueOfLand);
		}

		String buildingFactoryDevelop = (String)attributes.get(
			"buildingFactoryDevelop");

		if (buildingFactoryDevelop != null) {
			setBuildingFactoryDevelop(buildingFactoryDevelop);
		}

		String onSiteInfrastructure = (String)attributes.get(
			"onSiteInfrastructure");

		if (onSiteInfrastructure != null) {
			setOnSiteInfrastructure(onSiteInfrastructure);
		}

		String port = (String)attributes.get("port");

		if (port != null) {
			setPort(port);
		}

		String airPort = (String)attributes.get("airPort");

		if (airPort != null) {
			setAirPort(airPort);
		}

		String other = (String)attributes.get("other");

		if (other != null) {
			setOther(other);
		}

		String total = (String)attributes.get("total");

		if (total != null) {
			setTotal(total);
		}

		String totalLocalDirector = (String)attributes.get(
			"totalLocalDirector");

		if (totalLocalDirector != null) {
			setTotalLocalDirector(totalLocalDirector);
		}

		String totalForeignDirector = (String)attributes.get(
			"totalForeignDirector");

		if (totalForeignDirector != null) {
			setTotalForeignDirector(totalForeignDirector);
		}

		String companyName = (String)attributes.get("companyName");

		if (companyName != null) {
			setCompanyName(companyName);
		}

		String resisdentAddress = (String)attributes.get("resisdentAddress");

		if (resisdentAddress != null) {
			setResisdentAddress(resisdentAddress);
		}

		String sourceOfFunds = (String)attributes.get("sourceOfFunds");

		if (sourceOfFunds != null) {
			setSourceOfFunds(sourceOfFunds);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezDevInvestmentAndFinancial cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the air port of this sez dev investment and financial.
	 *
	 * @return the air port of this sez dev investment and financial
	 */
	@Override
	public String getAirPort() {
		return model.getAirPort();
	}

	/**
	 * Returns the building factory develop of this sez dev investment and financial.
	 *
	 * @return the building factory develop of this sez dev investment and financial
	 */
	@Override
	public String getBuildingFactoryDevelop() {
		return model.getBuildingFactoryDevelop();
	}

	/**
	 * Returns the company ID of this sez dev investment and financial.
	 *
	 * @return the company ID of this sez dev investment and financial
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company name of this sez dev investment and financial.
	 *
	 * @return the company name of this sez dev investment and financial
	 */
	@Override
	public String getCompanyName() {
		return model.getCompanyName();
	}

	/**
	 * Returns the create date of this sez dev investment and financial.
	 *
	 * @return the create date of this sez dev investment and financial
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez dev investment and financial.
	 *
	 * @return the group ID of this sez dev investment and financial
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez dev investment and financial.
	 *
	 * @return the modified date of this sez dev investment and financial
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the on site infrastructure of this sez dev investment and financial.
	 *
	 * @return the on site infrastructure of this sez dev investment and financial
	 */
	@Override
	public String getOnSiteInfrastructure() {
		return model.getOnSiteInfrastructure();
	}

	/**
	 * Returns the other of this sez dev investment and financial.
	 *
	 * @return the other of this sez dev investment and financial
	 */
	@Override
	public String getOther() {
		return model.getOther();
	}

	/**
	 * Returns the port of this sez dev investment and financial.
	 *
	 * @return the port of this sez dev investment and financial
	 */
	@Override
	public String getPort() {
		return model.getPort();
	}

	/**
	 * Returns the primary key of this sez dev investment and financial.
	 *
	 * @return the primary key of this sez dev investment and financial
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the resisdent address of this sez dev investment and financial.
	 *
	 * @return the resisdent address of this sez dev investment and financial
	 */
	@Override
	public String getResisdentAddress() {
		return model.getResisdentAddress();
	}

	/**
	 * Returns the sez dev investment and financial ID of this sez dev investment and financial.
	 *
	 * @return the sez dev investment and financial ID of this sez dev investment and financial
	 */
	@Override
	public long getSezDevInvestmentAndFinancialId() {
		return model.getSezDevInvestmentAndFinancialId();
	}

	/**
	 * Returns the sez status application ID of this sez dev investment and financial.
	 *
	 * @return the sez status application ID of this sez dev investment and financial
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the source of funds of this sez dev investment and financial.
	 *
	 * @return the source of funds of this sez dev investment and financial
	 */
	@Override
	public String getSourceOfFunds() {
		return model.getSourceOfFunds();
	}

	/**
	 * Returns the total of this sez dev investment and financial.
	 *
	 * @return the total of this sez dev investment and financial
	 */
	@Override
	public String getTotal() {
		return model.getTotal();
	}

	/**
	 * Returns the total foreign director of this sez dev investment and financial.
	 *
	 * @return the total foreign director of this sez dev investment and financial
	 */
	@Override
	public String getTotalForeignDirector() {
		return model.getTotalForeignDirector();
	}

	/**
	 * Returns the total local director of this sez dev investment and financial.
	 *
	 * @return the total local director of this sez dev investment and financial
	 */
	@Override
	public String getTotalLocalDirector() {
		return model.getTotalLocalDirector();
	}

	/**
	 * Returns the user ID of this sez dev investment and financial.
	 *
	 * @return the user ID of this sez dev investment and financial
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez dev investment and financial.
	 *
	 * @return the user name of this sez dev investment and financial
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez dev investment and financial.
	 *
	 * @return the user uuid of this sez dev investment and financial
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the value of land of this sez dev investment and financial.
	 *
	 * @return the value of land of this sez dev investment and financial
	 */
	@Override
	public String getValueOfLand() {
		return model.getValueOfLand();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the air port of this sez dev investment and financial.
	 *
	 * @param airPort the air port of this sez dev investment and financial
	 */
	@Override
	public void setAirPort(String airPort) {
		model.setAirPort(airPort);
	}

	/**
	 * Sets the building factory develop of this sez dev investment and financial.
	 *
	 * @param buildingFactoryDevelop the building factory develop of this sez dev investment and financial
	 */
	@Override
	public void setBuildingFactoryDevelop(String buildingFactoryDevelop) {
		model.setBuildingFactoryDevelop(buildingFactoryDevelop);
	}

	/**
	 * Sets the company ID of this sez dev investment and financial.
	 *
	 * @param companyId the company ID of this sez dev investment and financial
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company name of this sez dev investment and financial.
	 *
	 * @param companyName the company name of this sez dev investment and financial
	 */
	@Override
	public void setCompanyName(String companyName) {
		model.setCompanyName(companyName);
	}

	/**
	 * Sets the create date of this sez dev investment and financial.
	 *
	 * @param createDate the create date of this sez dev investment and financial
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez dev investment and financial.
	 *
	 * @param groupId the group ID of this sez dev investment and financial
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez dev investment and financial.
	 *
	 * @param modifiedDate the modified date of this sez dev investment and financial
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the on site infrastructure of this sez dev investment and financial.
	 *
	 * @param onSiteInfrastructure the on site infrastructure of this sez dev investment and financial
	 */
	@Override
	public void setOnSiteInfrastructure(String onSiteInfrastructure) {
		model.setOnSiteInfrastructure(onSiteInfrastructure);
	}

	/**
	 * Sets the other of this sez dev investment and financial.
	 *
	 * @param other the other of this sez dev investment and financial
	 */
	@Override
	public void setOther(String other) {
		model.setOther(other);
	}

	/**
	 * Sets the port of this sez dev investment and financial.
	 *
	 * @param port the port of this sez dev investment and financial
	 */
	@Override
	public void setPort(String port) {
		model.setPort(port);
	}

	/**
	 * Sets the primary key of this sez dev investment and financial.
	 *
	 * @param primaryKey the primary key of this sez dev investment and financial
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the resisdent address of this sez dev investment and financial.
	 *
	 * @param resisdentAddress the resisdent address of this sez dev investment and financial
	 */
	@Override
	public void setResisdentAddress(String resisdentAddress) {
		model.setResisdentAddress(resisdentAddress);
	}

	/**
	 * Sets the sez dev investment and financial ID of this sez dev investment and financial.
	 *
	 * @param sezDevInvestmentAndFinancialId the sez dev investment and financial ID of this sez dev investment and financial
	 */
	@Override
	public void setSezDevInvestmentAndFinancialId(
		long sezDevInvestmentAndFinancialId) {

		model.setSezDevInvestmentAndFinancialId(sezDevInvestmentAndFinancialId);
	}

	/**
	 * Sets the sez status application ID of this sez dev investment and financial.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez dev investment and financial
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the source of funds of this sez dev investment and financial.
	 *
	 * @param sourceOfFunds the source of funds of this sez dev investment and financial
	 */
	@Override
	public void setSourceOfFunds(String sourceOfFunds) {
		model.setSourceOfFunds(sourceOfFunds);
	}

	/**
	 * Sets the total of this sez dev investment and financial.
	 *
	 * @param total the total of this sez dev investment and financial
	 */
	@Override
	public void setTotal(String total) {
		model.setTotal(total);
	}

	/**
	 * Sets the total foreign director of this sez dev investment and financial.
	 *
	 * @param totalForeignDirector the total foreign director of this sez dev investment and financial
	 */
	@Override
	public void setTotalForeignDirector(String totalForeignDirector) {
		model.setTotalForeignDirector(totalForeignDirector);
	}

	/**
	 * Sets the total local director of this sez dev investment and financial.
	 *
	 * @param totalLocalDirector the total local director of this sez dev investment and financial
	 */
	@Override
	public void setTotalLocalDirector(String totalLocalDirector) {
		model.setTotalLocalDirector(totalLocalDirector);
	}

	/**
	 * Sets the user ID of this sez dev investment and financial.
	 *
	 * @param userId the user ID of this sez dev investment and financial
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez dev investment and financial.
	 *
	 * @param userName the user name of this sez dev investment and financial
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez dev investment and financial.
	 *
	 * @param userUuid the user uuid of this sez dev investment and financial
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the value of land of this sez dev investment and financial.
	 *
	 * @param valueOfLand the value of land of this sez dev investment and financial
	 */
	@Override
	public void setValueOfLand(String valueOfLand) {
		model.setValueOfLand(valueOfLand);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected SezDevInvestmentAndFinancialWrapper wrap(
		SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial) {

		return new SezDevInvestmentAndFinancialWrapper(
			sezDevInvestmentAndFinancial);
	}

}