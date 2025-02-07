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
 * This class is a wrapper for {@link ShareholdersHoldings}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShareholdersHoldings
 * @generated
 */
public class ShareholdersHoldingsWrapper
	extends BaseModelWrapper<ShareholdersHoldings>
	implements ModelWrapper<ShareholdersHoldings>, ShareholdersHoldings {

	public ShareholdersHoldingsWrapper(
		ShareholdersHoldings shareholdersHoldings) {

		super(shareholdersHoldings);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("shareholdersHoldingsId", getShareholdersHoldingsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("shareholderName", getShareholderName());
		attributes.put("shareholderDate", getShareholderDate());
		attributes.put("shareholderOccupation", getShareholderOccupation());
		attributes.put("shareholderShares", getShareholderShares());
		attributes.put("shareholderAddress", getShareholderAddress());
		attributes.put("shareholderCounter", getShareholderCounter());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long shareholdersHoldingsId = (Long)attributes.get(
			"shareholdersHoldingsId");

		if (shareholdersHoldingsId != null) {
			setShareholdersHoldingsId(shareholdersHoldingsId);
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

		String shareholderName = (String)attributes.get("shareholderName");

		if (shareholderName != null) {
			setShareholderName(shareholderName);
		}

		Date shareholderDate = (Date)attributes.get("shareholderDate");

		if (shareholderDate != null) {
			setShareholderDate(shareholderDate);
		}

		String shareholderOccupation = (String)attributes.get(
			"shareholderOccupation");

		if (shareholderOccupation != null) {
			setShareholderOccupation(shareholderOccupation);
		}

		String shareholderShares = (String)attributes.get("shareholderShares");

		if (shareholderShares != null) {
			setShareholderShares(shareholderShares);
		}

		String shareholderAddress = (String)attributes.get(
			"shareholderAddress");

		if (shareholderAddress != null) {
			setShareholderAddress(shareholderAddress);
		}

		String shareholderCounter = (String)attributes.get(
			"shareholderCounter");

		if (shareholderCounter != null) {
			setShareholderCounter(shareholderCounter);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public ShareholdersHoldings cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this shareholders holdings.
	 *
	 * @return the company ID of this shareholders holdings
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this shareholders holdings.
	 *
	 * @return the create date of this shareholders holdings
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this shareholders holdings.
	 *
	 * @return the group ID of this shareholders holdings
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this shareholders holdings.
	 *
	 * @return the modified date of this shareholders holdings
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency ID of this shareholders holdings.
	 *
	 * @return the osi insolvency ID of this shareholders holdings
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this shareholders holdings.
	 *
	 * @return the primary key of this shareholders holdings
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the shareholder address of this shareholders holdings.
	 *
	 * @return the shareholder address of this shareholders holdings
	 */
	@Override
	public String getShareholderAddress() {
		return model.getShareholderAddress();
	}

	/**
	 * Returns the shareholder counter of this shareholders holdings.
	 *
	 * @return the shareholder counter of this shareholders holdings
	 */
	@Override
	public String getShareholderCounter() {
		return model.getShareholderCounter();
	}

	/**
	 * Returns the shareholder date of this shareholders holdings.
	 *
	 * @return the shareholder date of this shareholders holdings
	 */
	@Override
	public Date getShareholderDate() {
		return model.getShareholderDate();
	}

	/**
	 * Returns the shareholder name of this shareholders holdings.
	 *
	 * @return the shareholder name of this shareholders holdings
	 */
	@Override
	public String getShareholderName() {
		return model.getShareholderName();
	}

	/**
	 * Returns the shareholder occupation of this shareholders holdings.
	 *
	 * @return the shareholder occupation of this shareholders holdings
	 */
	@Override
	public String getShareholderOccupation() {
		return model.getShareholderOccupation();
	}

	/**
	 * Returns the shareholder shares of this shareholders holdings.
	 *
	 * @return the shareholder shares of this shareholders holdings
	 */
	@Override
	public String getShareholderShares() {
		return model.getShareholderShares();
	}

	/**
	 * Returns the shareholders holdings ID of this shareholders holdings.
	 *
	 * @return the shareholders holdings ID of this shareholders holdings
	 */
	@Override
	public long getShareholdersHoldingsId() {
		return model.getShareholdersHoldingsId();
	}

	/**
	 * Returns the user ID of this shareholders holdings.
	 *
	 * @return the user ID of this shareholders holdings
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this shareholders holdings.
	 *
	 * @return the user name of this shareholders holdings
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this shareholders holdings.
	 *
	 * @return the user uuid of this shareholders holdings
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
	 * Sets the company ID of this shareholders holdings.
	 *
	 * @param companyId the company ID of this shareholders holdings
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this shareholders holdings.
	 *
	 * @param createDate the create date of this shareholders holdings
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this shareholders holdings.
	 *
	 * @param groupId the group ID of this shareholders holdings
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this shareholders holdings.
	 *
	 * @param modifiedDate the modified date of this shareholders holdings
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency ID of this shareholders holdings.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this shareholders holdings
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this shareholders holdings.
	 *
	 * @param primaryKey the primary key of this shareholders holdings
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the shareholder address of this shareholders holdings.
	 *
	 * @param shareholderAddress the shareholder address of this shareholders holdings
	 */
	@Override
	public void setShareholderAddress(String shareholderAddress) {
		model.setShareholderAddress(shareholderAddress);
	}

	/**
	 * Sets the shareholder counter of this shareholders holdings.
	 *
	 * @param shareholderCounter the shareholder counter of this shareholders holdings
	 */
	@Override
	public void setShareholderCounter(String shareholderCounter) {
		model.setShareholderCounter(shareholderCounter);
	}

	/**
	 * Sets the shareholder date of this shareholders holdings.
	 *
	 * @param shareholderDate the shareholder date of this shareholders holdings
	 */
	@Override
	public void setShareholderDate(Date shareholderDate) {
		model.setShareholderDate(shareholderDate);
	}

	/**
	 * Sets the shareholder name of this shareholders holdings.
	 *
	 * @param shareholderName the shareholder name of this shareholders holdings
	 */
	@Override
	public void setShareholderName(String shareholderName) {
		model.setShareholderName(shareholderName);
	}

	/**
	 * Sets the shareholder occupation of this shareholders holdings.
	 *
	 * @param shareholderOccupation the shareholder occupation of this shareholders holdings
	 */
	@Override
	public void setShareholderOccupation(String shareholderOccupation) {
		model.setShareholderOccupation(shareholderOccupation);
	}

	/**
	 * Sets the shareholder shares of this shareholders holdings.
	 *
	 * @param shareholderShares the shareholder shares of this shareholders holdings
	 */
	@Override
	public void setShareholderShares(String shareholderShares) {
		model.setShareholderShares(shareholderShares);
	}

	/**
	 * Sets the shareholders holdings ID of this shareholders holdings.
	 *
	 * @param shareholdersHoldingsId the shareholders holdings ID of this shareholders holdings
	 */
	@Override
	public void setShareholdersHoldingsId(long shareholdersHoldingsId) {
		model.setShareholdersHoldingsId(shareholdersHoldingsId);
	}

	/**
	 * Sets the user ID of this shareholders holdings.
	 *
	 * @param userId the user ID of this shareholders holdings
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this shareholders holdings.
	 *
	 * @param userName the user name of this shareholders holdings
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this shareholders holdings.
	 *
	 * @param userUuid the user uuid of this shareholders holdings
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
	protected ShareholdersHoldingsWrapper wrap(
		ShareholdersHoldings shareholdersHoldings) {

		return new ShareholdersHoldingsWrapper(shareholdersHoldings);
	}

}