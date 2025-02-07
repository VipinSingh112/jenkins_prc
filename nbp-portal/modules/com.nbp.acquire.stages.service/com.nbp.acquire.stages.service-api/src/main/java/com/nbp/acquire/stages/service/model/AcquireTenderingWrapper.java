/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AcquireTendering}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireTendering
 * @generated
 */
public class AcquireTenderingWrapper
	extends BaseModelWrapper<AcquireTendering>
	implements AcquireTendering, ModelWrapper<AcquireTendering> {

	public AcquireTenderingWrapper(AcquireTendering acquireTendering) {
		super(acquireTendering);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("acquireTenderingId", getAcquireTenderingId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("nameOfEachBidders", getNameOfEachBidders());
		attributes.put("bidPriceofeachBid", getBidPriceofeachBid());
		attributes.put("minPriceOfTenderOffer", getMinPriceOfTenderOffer());
		attributes.put("meetsMinimum", getMeetsMinimum());
		attributes.put("highestOffer", getHighestOffer());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long acquireTenderingId = (Long)attributes.get("acquireTenderingId");

		if (acquireTenderingId != null) {
			setAcquireTenderingId(acquireTenderingId);
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

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		String nameOfEachBidders = (String)attributes.get("nameOfEachBidders");

		if (nameOfEachBidders != null) {
			setNameOfEachBidders(nameOfEachBidders);
		}

		String bidPriceofeachBid = (String)attributes.get("bidPriceofeachBid");

		if (bidPriceofeachBid != null) {
			setBidPriceofeachBid(bidPriceofeachBid);
		}

		String minPriceOfTenderOffer = (String)attributes.get(
			"minPriceOfTenderOffer");

		if (minPriceOfTenderOffer != null) {
			setMinPriceOfTenderOffer(minPriceOfTenderOffer);
		}

		String meetsMinimum = (String)attributes.get("meetsMinimum");

		if (meetsMinimum != null) {
			setMeetsMinimum(meetsMinimum);
		}

		String highestOffer = (String)attributes.get("highestOffer");

		if (highestOffer != null) {
			setHighestOffer(highestOffer);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public AcquireTendering cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acquire tendering ID of this acquire tendering.
	 *
	 * @return the acquire tendering ID of this acquire tendering
	 */
	@Override
	public long getAcquireTenderingId() {
		return model.getAcquireTenderingId();
	}

	/**
	 * Returns the bid priceofeach bid of this acquire tendering.
	 *
	 * @return the bid priceofeach bid of this acquire tendering
	 */
	@Override
	public String getBidPriceofeachBid() {
		return model.getBidPriceofeachBid();
	}

	/**
	 * Returns the case ID of this acquire tendering.
	 *
	 * @return the case ID of this acquire tendering
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this acquire tendering.
	 *
	 * @return the company ID of this acquire tendering
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acquire tendering.
	 *
	 * @return the create date of this acquire tendering
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acquire tendering.
	 *
	 * @return the group ID of this acquire tendering
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the highest offer of this acquire tendering.
	 *
	 * @return the highest offer of this acquire tendering
	 */
	@Override
	public String getHighestOffer() {
		return model.getHighestOffer();
	}

	/**
	 * Returns the meets minimum of this acquire tendering.
	 *
	 * @return the meets minimum of this acquire tendering
	 */
	@Override
	public String getMeetsMinimum() {
		return model.getMeetsMinimum();
	}

	/**
	 * Returns the min price of tender offer of this acquire tendering.
	 *
	 * @return the min price of tender offer of this acquire tendering
	 */
	@Override
	public String getMinPriceOfTenderOffer() {
		return model.getMinPriceOfTenderOffer();
	}

	/**
	 * Returns the modified date of this acquire tendering.
	 *
	 * @return the modified date of this acquire tendering
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of each bidders of this acquire tendering.
	 *
	 * @return the name of each bidders of this acquire tendering
	 */
	@Override
	public String getNameOfEachBidders() {
		return model.getNameOfEachBidders();
	}

	/**
	 * Returns the primary key of this acquire tendering.
	 *
	 * @return the primary key of this acquire tendering
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this acquire tendering.
	 *
	 * @return the status of this acquire tendering
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this acquire tendering.
	 *
	 * @return the user ID of this acquire tendering
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acquire tendering.
	 *
	 * @return the user name of this acquire tendering
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acquire tendering.
	 *
	 * @return the user uuid of this acquire tendering
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
	 * Sets the acquire tendering ID of this acquire tendering.
	 *
	 * @param acquireTenderingId the acquire tendering ID of this acquire tendering
	 */
	@Override
	public void setAcquireTenderingId(long acquireTenderingId) {
		model.setAcquireTenderingId(acquireTenderingId);
	}

	/**
	 * Sets the bid priceofeach bid of this acquire tendering.
	 *
	 * @param bidPriceofeachBid the bid priceofeach bid of this acquire tendering
	 */
	@Override
	public void setBidPriceofeachBid(String bidPriceofeachBid) {
		model.setBidPriceofeachBid(bidPriceofeachBid);
	}

	/**
	 * Sets the case ID of this acquire tendering.
	 *
	 * @param caseId the case ID of this acquire tendering
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this acquire tendering.
	 *
	 * @param companyId the company ID of this acquire tendering
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acquire tendering.
	 *
	 * @param createDate the create date of this acquire tendering
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acquire tendering.
	 *
	 * @param groupId the group ID of this acquire tendering
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the highest offer of this acquire tendering.
	 *
	 * @param highestOffer the highest offer of this acquire tendering
	 */
	@Override
	public void setHighestOffer(String highestOffer) {
		model.setHighestOffer(highestOffer);
	}

	/**
	 * Sets the meets minimum of this acquire tendering.
	 *
	 * @param meetsMinimum the meets minimum of this acquire tendering
	 */
	@Override
	public void setMeetsMinimum(String meetsMinimum) {
		model.setMeetsMinimum(meetsMinimum);
	}

	/**
	 * Sets the min price of tender offer of this acquire tendering.
	 *
	 * @param minPriceOfTenderOffer the min price of tender offer of this acquire tendering
	 */
	@Override
	public void setMinPriceOfTenderOffer(String minPriceOfTenderOffer) {
		model.setMinPriceOfTenderOffer(minPriceOfTenderOffer);
	}

	/**
	 * Sets the modified date of this acquire tendering.
	 *
	 * @param modifiedDate the modified date of this acquire tendering
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of each bidders of this acquire tendering.
	 *
	 * @param nameOfEachBidders the name of each bidders of this acquire tendering
	 */
	@Override
	public void setNameOfEachBidders(String nameOfEachBidders) {
		model.setNameOfEachBidders(nameOfEachBidders);
	}

	/**
	 * Sets the primary key of this acquire tendering.
	 *
	 * @param primaryKey the primary key of this acquire tendering
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this acquire tendering.
	 *
	 * @param status the status of this acquire tendering
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this acquire tendering.
	 *
	 * @param userId the user ID of this acquire tendering
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acquire tendering.
	 *
	 * @param userName the user name of this acquire tendering
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acquire tendering.
	 *
	 * @param userUuid the user uuid of this acquire tendering
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
	protected AcquireTenderingWrapper wrap(AcquireTendering acquireTendering) {
		return new AcquireTenderingWrapper(acquireTendering);
	}

}