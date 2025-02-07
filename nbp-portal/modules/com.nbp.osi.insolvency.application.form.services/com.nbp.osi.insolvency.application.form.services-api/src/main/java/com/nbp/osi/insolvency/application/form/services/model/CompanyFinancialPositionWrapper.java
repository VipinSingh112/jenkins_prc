/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CompanyFinancialPosition}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanyFinancialPosition
 * @generated
 */
public class CompanyFinancialPositionWrapper
	extends BaseModelWrapper<CompanyFinancialPosition>
	implements CompanyFinancialPosition,
			   ModelWrapper<CompanyFinancialPosition> {

	public CompanyFinancialPositionWrapper(
		CompanyFinancialPosition companyFinancialPosition) {

		super(companyFinancialPosition);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"companyFinancialPositionId", getCompanyFinancialPositionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("companySecured", getCompanySecured());
		attributes.put("companyUnsecured", getCompanyUnsecured());
		attributes.put("companyAmount", getCompanyAmount());
		attributes.put("companyDeficit", getCompanyDeficit());
		attributes.put("companyNetValue", getCompanyNetValue());
		attributes.put("companyAssetValue", getCompanyAssetValue());
		attributes.put("companyDisposableAsset", getCompanyDisposableAsset());
		attributes.put("companySurplus", getCompanySurplus());
		attributes.put("companySummary", getCompanySummary());
		attributes.put("companyProposal", getCompanyProposal());
		attributes.put("companyTrusteeResponse", getCompanyTrusteeResponse());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long companyFinancialPositionId = (Long)attributes.get(
			"companyFinancialPositionId");

		if (companyFinancialPositionId != null) {
			setCompanyFinancialPositionId(companyFinancialPositionId);
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

		String companySecured = (String)attributes.get("companySecured");

		if (companySecured != null) {
			setCompanySecured(companySecured);
		}

		String companyUnsecured = (String)attributes.get("companyUnsecured");

		if (companyUnsecured != null) {
			setCompanyUnsecured(companyUnsecured);
		}

		String companyAmount = (String)attributes.get("companyAmount");

		if (companyAmount != null) {
			setCompanyAmount(companyAmount);
		}

		String companyDeficit = (String)attributes.get("companyDeficit");

		if (companyDeficit != null) {
			setCompanyDeficit(companyDeficit);
		}

		String companyNetValue = (String)attributes.get("companyNetValue");

		if (companyNetValue != null) {
			setCompanyNetValue(companyNetValue);
		}

		String companyAssetValue = (String)attributes.get("companyAssetValue");

		if (companyAssetValue != null) {
			setCompanyAssetValue(companyAssetValue);
		}

		String companyDisposableAsset = (String)attributes.get(
			"companyDisposableAsset");

		if (companyDisposableAsset != null) {
			setCompanyDisposableAsset(companyDisposableAsset);
		}

		String companySurplus = (String)attributes.get("companySurplus");

		if (companySurplus != null) {
			setCompanySurplus(companySurplus);
		}

		String companySummary = (String)attributes.get("companySummary");

		if (companySummary != null) {
			setCompanySummary(companySummary);
		}

		String companyProposal = (String)attributes.get("companyProposal");

		if (companyProposal != null) {
			setCompanyProposal(companyProposal);
		}

		String companyTrusteeResponse = (String)attributes.get(
			"companyTrusteeResponse");

		if (companyTrusteeResponse != null) {
			setCompanyTrusteeResponse(companyTrusteeResponse);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public CompanyFinancialPosition cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company amount of this company financial position.
	 *
	 * @return the company amount of this company financial position
	 */
	@Override
	public String getCompanyAmount() {
		return model.getCompanyAmount();
	}

	/**
	 * Returns the company asset value of this company financial position.
	 *
	 * @return the company asset value of this company financial position
	 */
	@Override
	public String getCompanyAssetValue() {
		return model.getCompanyAssetValue();
	}

	/**
	 * Returns the company deficit of this company financial position.
	 *
	 * @return the company deficit of this company financial position
	 */
	@Override
	public String getCompanyDeficit() {
		return model.getCompanyDeficit();
	}

	/**
	 * Returns the company disposable asset of this company financial position.
	 *
	 * @return the company disposable asset of this company financial position
	 */
	@Override
	public String getCompanyDisposableAsset() {
		return model.getCompanyDisposableAsset();
	}

	/**
	 * Returns the company financial position ID of this company financial position.
	 *
	 * @return the company financial position ID of this company financial position
	 */
	@Override
	public long getCompanyFinancialPositionId() {
		return model.getCompanyFinancialPositionId();
	}

	/**
	 * Returns the company ID of this company financial position.
	 *
	 * @return the company ID of this company financial position
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company net value of this company financial position.
	 *
	 * @return the company net value of this company financial position
	 */
	@Override
	public String getCompanyNetValue() {
		return model.getCompanyNetValue();
	}

	/**
	 * Returns the company proposal of this company financial position.
	 *
	 * @return the company proposal of this company financial position
	 */
	@Override
	public String getCompanyProposal() {
		return model.getCompanyProposal();
	}

	/**
	 * Returns the company secured of this company financial position.
	 *
	 * @return the company secured of this company financial position
	 */
	@Override
	public String getCompanySecured() {
		return model.getCompanySecured();
	}

	/**
	 * Returns the company summary of this company financial position.
	 *
	 * @return the company summary of this company financial position
	 */
	@Override
	public String getCompanySummary() {
		return model.getCompanySummary();
	}

	/**
	 * Returns the company surplus of this company financial position.
	 *
	 * @return the company surplus of this company financial position
	 */
	@Override
	public String getCompanySurplus() {
		return model.getCompanySurplus();
	}

	/**
	 * Returns the company trustee response of this company financial position.
	 *
	 * @return the company trustee response of this company financial position
	 */
	@Override
	public String getCompanyTrusteeResponse() {
		return model.getCompanyTrusteeResponse();
	}

	/**
	 * Returns the company unsecured of this company financial position.
	 *
	 * @return the company unsecured of this company financial position
	 */
	@Override
	public String getCompanyUnsecured() {
		return model.getCompanyUnsecured();
	}

	/**
	 * Returns the create date of this company financial position.
	 *
	 * @return the create date of this company financial position
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this company financial position.
	 *
	 * @return the group ID of this company financial position
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this company financial position.
	 *
	 * @return the modified date of this company financial position
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency ID of this company financial position.
	 *
	 * @return the osi insolvency ID of this company financial position
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this company financial position.
	 *
	 * @return the primary key of this company financial position
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this company financial position.
	 *
	 * @return the user ID of this company financial position
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this company financial position.
	 *
	 * @return the user name of this company financial position
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this company financial position.
	 *
	 * @return the user uuid of this company financial position
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
	 * Sets the company amount of this company financial position.
	 *
	 * @param companyAmount the company amount of this company financial position
	 */
	@Override
	public void setCompanyAmount(String companyAmount) {
		model.setCompanyAmount(companyAmount);
	}

	/**
	 * Sets the company asset value of this company financial position.
	 *
	 * @param companyAssetValue the company asset value of this company financial position
	 */
	@Override
	public void setCompanyAssetValue(String companyAssetValue) {
		model.setCompanyAssetValue(companyAssetValue);
	}

	/**
	 * Sets the company deficit of this company financial position.
	 *
	 * @param companyDeficit the company deficit of this company financial position
	 */
	@Override
	public void setCompanyDeficit(String companyDeficit) {
		model.setCompanyDeficit(companyDeficit);
	}

	/**
	 * Sets the company disposable asset of this company financial position.
	 *
	 * @param companyDisposableAsset the company disposable asset of this company financial position
	 */
	@Override
	public void setCompanyDisposableAsset(String companyDisposableAsset) {
		model.setCompanyDisposableAsset(companyDisposableAsset);
	}

	/**
	 * Sets the company financial position ID of this company financial position.
	 *
	 * @param companyFinancialPositionId the company financial position ID of this company financial position
	 */
	@Override
	public void setCompanyFinancialPositionId(long companyFinancialPositionId) {
		model.setCompanyFinancialPositionId(companyFinancialPositionId);
	}

	/**
	 * Sets the company ID of this company financial position.
	 *
	 * @param companyId the company ID of this company financial position
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company net value of this company financial position.
	 *
	 * @param companyNetValue the company net value of this company financial position
	 */
	@Override
	public void setCompanyNetValue(String companyNetValue) {
		model.setCompanyNetValue(companyNetValue);
	}

	/**
	 * Sets the company proposal of this company financial position.
	 *
	 * @param companyProposal the company proposal of this company financial position
	 */
	@Override
	public void setCompanyProposal(String companyProposal) {
		model.setCompanyProposal(companyProposal);
	}

	/**
	 * Sets the company secured of this company financial position.
	 *
	 * @param companySecured the company secured of this company financial position
	 */
	@Override
	public void setCompanySecured(String companySecured) {
		model.setCompanySecured(companySecured);
	}

	/**
	 * Sets the company summary of this company financial position.
	 *
	 * @param companySummary the company summary of this company financial position
	 */
	@Override
	public void setCompanySummary(String companySummary) {
		model.setCompanySummary(companySummary);
	}

	/**
	 * Sets the company surplus of this company financial position.
	 *
	 * @param companySurplus the company surplus of this company financial position
	 */
	@Override
	public void setCompanySurplus(String companySurplus) {
		model.setCompanySurplus(companySurplus);
	}

	/**
	 * Sets the company trustee response of this company financial position.
	 *
	 * @param companyTrusteeResponse the company trustee response of this company financial position
	 */
	@Override
	public void setCompanyTrusteeResponse(String companyTrusteeResponse) {
		model.setCompanyTrusteeResponse(companyTrusteeResponse);
	}

	/**
	 * Sets the company unsecured of this company financial position.
	 *
	 * @param companyUnsecured the company unsecured of this company financial position
	 */
	@Override
	public void setCompanyUnsecured(String companyUnsecured) {
		model.setCompanyUnsecured(companyUnsecured);
	}

	/**
	 * Sets the create date of this company financial position.
	 *
	 * @param createDate the create date of this company financial position
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this company financial position.
	 *
	 * @param groupId the group ID of this company financial position
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this company financial position.
	 *
	 * @param modifiedDate the modified date of this company financial position
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency ID of this company financial position.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this company financial position
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this company financial position.
	 *
	 * @param primaryKey the primary key of this company financial position
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this company financial position.
	 *
	 * @param userId the user ID of this company financial position
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this company financial position.
	 *
	 * @param userName the user name of this company financial position
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this company financial position.
	 *
	 * @param userUuid the user uuid of this company financial position
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
	protected CompanyFinancialPositionWrapper wrap(
		CompanyFinancialPosition companyFinancialPosition) {

		return new CompanyFinancialPositionWrapper(companyFinancialPosition);
	}

}