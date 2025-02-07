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
 * This class is a wrapper for {@link FinancialPosition}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FinancialPosition
 * @generated
 */
public class FinancialPositionWrapper
	extends BaseModelWrapper<FinancialPosition>
	implements FinancialPosition, ModelWrapper<FinancialPosition> {

	public FinancialPositionWrapper(FinancialPosition financialPosition) {
		super(financialPosition);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("financialPositionId", getFinancialPositionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("securedLiabilities", getSecuredLiabilities());
		attributes.put("unsecuredLiabilities", getUnsecuredLiabilities());
		attributes.put("amountLiabilities", getAmountLiabilities());
		attributes.put("deficitLiabilities", getDeficitLiabilities());
		attributes.put("assestsUsedAsSecurity", getAssestsUsedAsSecurity());
		attributes.put(
			"assestsNotUsedAsSecurity", getAssestsNotUsedAsSecurity());
		attributes.put("assestsDisposable", getAssestsDisposable());
		attributes.put("assestsSurplus", getAssestsSurplus());
		attributes.put("assestsSummary", getAssestsSummary());
		attributes.put("assestsProposal", getAssestsProposal());
		attributes.put("assestsTrusteeResponse", getAssestsTrusteeResponse());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long financialPositionId = (Long)attributes.get("financialPositionId");

		if (financialPositionId != null) {
			setFinancialPositionId(financialPositionId);
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

		String securedLiabilities = (String)attributes.get(
			"securedLiabilities");

		if (securedLiabilities != null) {
			setSecuredLiabilities(securedLiabilities);
		}

		String unsecuredLiabilities = (String)attributes.get(
			"unsecuredLiabilities");

		if (unsecuredLiabilities != null) {
			setUnsecuredLiabilities(unsecuredLiabilities);
		}

		String amountLiabilities = (String)attributes.get("amountLiabilities");

		if (amountLiabilities != null) {
			setAmountLiabilities(amountLiabilities);
		}

		String deficitLiabilities = (String)attributes.get(
			"deficitLiabilities");

		if (deficitLiabilities != null) {
			setDeficitLiabilities(deficitLiabilities);
		}

		String assestsUsedAsSecurity = (String)attributes.get(
			"assestsUsedAsSecurity");

		if (assestsUsedAsSecurity != null) {
			setAssestsUsedAsSecurity(assestsUsedAsSecurity);
		}

		String assestsNotUsedAsSecurity = (String)attributes.get(
			"assestsNotUsedAsSecurity");

		if (assestsNotUsedAsSecurity != null) {
			setAssestsNotUsedAsSecurity(assestsNotUsedAsSecurity);
		}

		String assestsDisposable = (String)attributes.get("assestsDisposable");

		if (assestsDisposable != null) {
			setAssestsDisposable(assestsDisposable);
		}

		String assestsSurplus = (String)attributes.get("assestsSurplus");

		if (assestsSurplus != null) {
			setAssestsSurplus(assestsSurplus);
		}

		String assestsSummary = (String)attributes.get("assestsSummary");

		if (assestsSummary != null) {
			setAssestsSummary(assestsSummary);
		}

		String assestsProposal = (String)attributes.get("assestsProposal");

		if (assestsProposal != null) {
			setAssestsProposal(assestsProposal);
		}

		String assestsTrusteeResponse = (String)attributes.get(
			"assestsTrusteeResponse");

		if (assestsTrusteeResponse != null) {
			setAssestsTrusteeResponse(assestsTrusteeResponse);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public FinancialPosition cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the amount liabilities of this financial position.
	 *
	 * @return the amount liabilities of this financial position
	 */
	@Override
	public String getAmountLiabilities() {
		return model.getAmountLiabilities();
	}

	/**
	 * Returns the assests disposable of this financial position.
	 *
	 * @return the assests disposable of this financial position
	 */
	@Override
	public String getAssestsDisposable() {
		return model.getAssestsDisposable();
	}

	/**
	 * Returns the assests not used as security of this financial position.
	 *
	 * @return the assests not used as security of this financial position
	 */
	@Override
	public String getAssestsNotUsedAsSecurity() {
		return model.getAssestsNotUsedAsSecurity();
	}

	/**
	 * Returns the assests proposal of this financial position.
	 *
	 * @return the assests proposal of this financial position
	 */
	@Override
	public String getAssestsProposal() {
		return model.getAssestsProposal();
	}

	/**
	 * Returns the assests summary of this financial position.
	 *
	 * @return the assests summary of this financial position
	 */
	@Override
	public String getAssestsSummary() {
		return model.getAssestsSummary();
	}

	/**
	 * Returns the assests surplus of this financial position.
	 *
	 * @return the assests surplus of this financial position
	 */
	@Override
	public String getAssestsSurplus() {
		return model.getAssestsSurplus();
	}

	/**
	 * Returns the assests trustee response of this financial position.
	 *
	 * @return the assests trustee response of this financial position
	 */
	@Override
	public String getAssestsTrusteeResponse() {
		return model.getAssestsTrusteeResponse();
	}

	/**
	 * Returns the assests used as security of this financial position.
	 *
	 * @return the assests used as security of this financial position
	 */
	@Override
	public String getAssestsUsedAsSecurity() {
		return model.getAssestsUsedAsSecurity();
	}

	/**
	 * Returns the company ID of this financial position.
	 *
	 * @return the company ID of this financial position
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this financial position.
	 *
	 * @return the create date of this financial position
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the deficit liabilities of this financial position.
	 *
	 * @return the deficit liabilities of this financial position
	 */
	@Override
	public String getDeficitLiabilities() {
		return model.getDeficitLiabilities();
	}

	/**
	 * Returns the financial position ID of this financial position.
	 *
	 * @return the financial position ID of this financial position
	 */
	@Override
	public long getFinancialPositionId() {
		return model.getFinancialPositionId();
	}

	/**
	 * Returns the group ID of this financial position.
	 *
	 * @return the group ID of this financial position
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this financial position.
	 *
	 * @return the modified date of this financial position
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency ID of this financial position.
	 *
	 * @return the osi insolvency ID of this financial position
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this financial position.
	 *
	 * @return the primary key of this financial position
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the secured liabilities of this financial position.
	 *
	 * @return the secured liabilities of this financial position
	 */
	@Override
	public String getSecuredLiabilities() {
		return model.getSecuredLiabilities();
	}

	/**
	 * Returns the unsecured liabilities of this financial position.
	 *
	 * @return the unsecured liabilities of this financial position
	 */
	@Override
	public String getUnsecuredLiabilities() {
		return model.getUnsecuredLiabilities();
	}

	/**
	 * Returns the user ID of this financial position.
	 *
	 * @return the user ID of this financial position
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this financial position.
	 *
	 * @return the user name of this financial position
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this financial position.
	 *
	 * @return the user uuid of this financial position
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
	 * Sets the amount liabilities of this financial position.
	 *
	 * @param amountLiabilities the amount liabilities of this financial position
	 */
	@Override
	public void setAmountLiabilities(String amountLiabilities) {
		model.setAmountLiabilities(amountLiabilities);
	}

	/**
	 * Sets the assests disposable of this financial position.
	 *
	 * @param assestsDisposable the assests disposable of this financial position
	 */
	@Override
	public void setAssestsDisposable(String assestsDisposable) {
		model.setAssestsDisposable(assestsDisposable);
	}

	/**
	 * Sets the assests not used as security of this financial position.
	 *
	 * @param assestsNotUsedAsSecurity the assests not used as security of this financial position
	 */
	@Override
	public void setAssestsNotUsedAsSecurity(String assestsNotUsedAsSecurity) {
		model.setAssestsNotUsedAsSecurity(assestsNotUsedAsSecurity);
	}

	/**
	 * Sets the assests proposal of this financial position.
	 *
	 * @param assestsProposal the assests proposal of this financial position
	 */
	@Override
	public void setAssestsProposal(String assestsProposal) {
		model.setAssestsProposal(assestsProposal);
	}

	/**
	 * Sets the assests summary of this financial position.
	 *
	 * @param assestsSummary the assests summary of this financial position
	 */
	@Override
	public void setAssestsSummary(String assestsSummary) {
		model.setAssestsSummary(assestsSummary);
	}

	/**
	 * Sets the assests surplus of this financial position.
	 *
	 * @param assestsSurplus the assests surplus of this financial position
	 */
	@Override
	public void setAssestsSurplus(String assestsSurplus) {
		model.setAssestsSurplus(assestsSurplus);
	}

	/**
	 * Sets the assests trustee response of this financial position.
	 *
	 * @param assestsTrusteeResponse the assests trustee response of this financial position
	 */
	@Override
	public void setAssestsTrusteeResponse(String assestsTrusteeResponse) {
		model.setAssestsTrusteeResponse(assestsTrusteeResponse);
	}

	/**
	 * Sets the assests used as security of this financial position.
	 *
	 * @param assestsUsedAsSecurity the assests used as security of this financial position
	 */
	@Override
	public void setAssestsUsedAsSecurity(String assestsUsedAsSecurity) {
		model.setAssestsUsedAsSecurity(assestsUsedAsSecurity);
	}

	/**
	 * Sets the company ID of this financial position.
	 *
	 * @param companyId the company ID of this financial position
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this financial position.
	 *
	 * @param createDate the create date of this financial position
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the deficit liabilities of this financial position.
	 *
	 * @param deficitLiabilities the deficit liabilities of this financial position
	 */
	@Override
	public void setDeficitLiabilities(String deficitLiabilities) {
		model.setDeficitLiabilities(deficitLiabilities);
	}

	/**
	 * Sets the financial position ID of this financial position.
	 *
	 * @param financialPositionId the financial position ID of this financial position
	 */
	@Override
	public void setFinancialPositionId(long financialPositionId) {
		model.setFinancialPositionId(financialPositionId);
	}

	/**
	 * Sets the group ID of this financial position.
	 *
	 * @param groupId the group ID of this financial position
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this financial position.
	 *
	 * @param modifiedDate the modified date of this financial position
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency ID of this financial position.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this financial position
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this financial position.
	 *
	 * @param primaryKey the primary key of this financial position
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the secured liabilities of this financial position.
	 *
	 * @param securedLiabilities the secured liabilities of this financial position
	 */
	@Override
	public void setSecuredLiabilities(String securedLiabilities) {
		model.setSecuredLiabilities(securedLiabilities);
	}

	/**
	 * Sets the unsecured liabilities of this financial position.
	 *
	 * @param unsecuredLiabilities the unsecured liabilities of this financial position
	 */
	@Override
	public void setUnsecuredLiabilities(String unsecuredLiabilities) {
		model.setUnsecuredLiabilities(unsecuredLiabilities);
	}

	/**
	 * Sets the user ID of this financial position.
	 *
	 * @param userId the user ID of this financial position
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this financial position.
	 *
	 * @param userName the user name of this financial position
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this financial position.
	 *
	 * @param userUuid the user uuid of this financial position
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
	protected FinancialPositionWrapper wrap(
		FinancialPosition financialPosition) {

		return new FinancialPositionWrapper(financialPosition);
	}

}