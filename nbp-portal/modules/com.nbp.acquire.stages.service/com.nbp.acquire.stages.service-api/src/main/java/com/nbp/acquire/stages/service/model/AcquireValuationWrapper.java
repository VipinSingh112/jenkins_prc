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
 * This class is a wrapper for {@link AcquireValuation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireValuation
 * @generated
 */
public class AcquireValuationWrapper
	extends BaseModelWrapper<AcquireValuation>
	implements AcquireValuation, ModelWrapper<AcquireValuation> {

	public AcquireValuationWrapper(AcquireValuation acquireValuation) {
		super(acquireValuation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("acquireValuationId", getAcquireValuationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("valuationNumber", getValuationNumber());
		attributes.put("valuationVolume", getValuationVolume());
		attributes.put("valuationFolio", getValuationFolio());
		attributes.put("valuationStatus", getValuationStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long acquireValuationId = (Long)attributes.get("acquireValuationId");

		if (acquireValuationId != null) {
			setAcquireValuationId(acquireValuationId);
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

		String valuationNumber = (String)attributes.get("valuationNumber");

		if (valuationNumber != null) {
			setValuationNumber(valuationNumber);
		}

		String valuationVolume = (String)attributes.get("valuationVolume");

		if (valuationVolume != null) {
			setValuationVolume(valuationVolume);
		}

		String valuationFolio = (String)attributes.get("valuationFolio");

		if (valuationFolio != null) {
			setValuationFolio(valuationFolio);
		}

		String valuationStatus = (String)attributes.get("valuationStatus");

		if (valuationStatus != null) {
			setValuationStatus(valuationStatus);
		}
	}

	@Override
	public AcquireValuation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acquire valuation ID of this acquire valuation.
	 *
	 * @return the acquire valuation ID of this acquire valuation
	 */
	@Override
	public long getAcquireValuationId() {
		return model.getAcquireValuationId();
	}

	/**
	 * Returns the case ID of this acquire valuation.
	 *
	 * @return the case ID of this acquire valuation
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this acquire valuation.
	 *
	 * @return the company ID of this acquire valuation
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acquire valuation.
	 *
	 * @return the create date of this acquire valuation
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acquire valuation.
	 *
	 * @return the group ID of this acquire valuation
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this acquire valuation.
	 *
	 * @return the modified date of this acquire valuation
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this acquire valuation.
	 *
	 * @return the primary key of this acquire valuation
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this acquire valuation.
	 *
	 * @return the user ID of this acquire valuation
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acquire valuation.
	 *
	 * @return the user name of this acquire valuation
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acquire valuation.
	 *
	 * @return the user uuid of this acquire valuation
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the valuation folio of this acquire valuation.
	 *
	 * @return the valuation folio of this acquire valuation
	 */
	@Override
	public String getValuationFolio() {
		return model.getValuationFolio();
	}

	/**
	 * Returns the valuation number of this acquire valuation.
	 *
	 * @return the valuation number of this acquire valuation
	 */
	@Override
	public String getValuationNumber() {
		return model.getValuationNumber();
	}

	/**
	 * Returns the valuation status of this acquire valuation.
	 *
	 * @return the valuation status of this acquire valuation
	 */
	@Override
	public String getValuationStatus() {
		return model.getValuationStatus();
	}

	/**
	 * Returns the valuation volume of this acquire valuation.
	 *
	 * @return the valuation volume of this acquire valuation
	 */
	@Override
	public String getValuationVolume() {
		return model.getValuationVolume();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the acquire valuation ID of this acquire valuation.
	 *
	 * @param acquireValuationId the acquire valuation ID of this acquire valuation
	 */
	@Override
	public void setAcquireValuationId(long acquireValuationId) {
		model.setAcquireValuationId(acquireValuationId);
	}

	/**
	 * Sets the case ID of this acquire valuation.
	 *
	 * @param caseId the case ID of this acquire valuation
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this acquire valuation.
	 *
	 * @param companyId the company ID of this acquire valuation
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acquire valuation.
	 *
	 * @param createDate the create date of this acquire valuation
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acquire valuation.
	 *
	 * @param groupId the group ID of this acquire valuation
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this acquire valuation.
	 *
	 * @param modifiedDate the modified date of this acquire valuation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this acquire valuation.
	 *
	 * @param primaryKey the primary key of this acquire valuation
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this acquire valuation.
	 *
	 * @param userId the user ID of this acquire valuation
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acquire valuation.
	 *
	 * @param userName the user name of this acquire valuation
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acquire valuation.
	 *
	 * @param userUuid the user uuid of this acquire valuation
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the valuation folio of this acquire valuation.
	 *
	 * @param valuationFolio the valuation folio of this acquire valuation
	 */
	@Override
	public void setValuationFolio(String valuationFolio) {
		model.setValuationFolio(valuationFolio);
	}

	/**
	 * Sets the valuation number of this acquire valuation.
	 *
	 * @param valuationNumber the valuation number of this acquire valuation
	 */
	@Override
	public void setValuationNumber(String valuationNumber) {
		model.setValuationNumber(valuationNumber);
	}

	/**
	 * Sets the valuation status of this acquire valuation.
	 *
	 * @param valuationStatus the valuation status of this acquire valuation
	 */
	@Override
	public void setValuationStatus(String valuationStatus) {
		model.setValuationStatus(valuationStatus);
	}

	/**
	 * Sets the valuation volume of this acquire valuation.
	 *
	 * @param valuationVolume the valuation volume of this acquire valuation
	 */
	@Override
	public void setValuationVolume(String valuationVolume) {
		model.setValuationVolume(valuationVolume);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected AcquireValuationWrapper wrap(AcquireValuation acquireValuation) {
		return new AcquireValuationWrapper(acquireValuation);
	}

}