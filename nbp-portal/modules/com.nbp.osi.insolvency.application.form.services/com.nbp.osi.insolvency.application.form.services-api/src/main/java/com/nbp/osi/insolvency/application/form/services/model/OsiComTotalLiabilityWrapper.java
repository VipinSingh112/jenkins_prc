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
 * This class is a wrapper for {@link OsiComTotalLiability}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiComTotalLiability
 * @generated
 */
public class OsiComTotalLiabilityWrapper
	extends BaseModelWrapper<OsiComTotalLiability>
	implements ModelWrapper<OsiComTotalLiability>, OsiComTotalLiability {

	public OsiComTotalLiabilityWrapper(
		OsiComTotalLiability osiComTotalLiability) {

		super(osiComTotalLiability);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("osiComTotalLiabilityId", getOsiComTotalLiabilityId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("totalLiability", getTotalLiability());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long osiComTotalLiabilityId = (Long)attributes.get(
			"osiComTotalLiabilityId");

		if (osiComTotalLiabilityId != null) {
			setOsiComTotalLiabilityId(osiComTotalLiabilityId);
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

		String totalLiability = (String)attributes.get("totalLiability");

		if (totalLiability != null) {
			setTotalLiability(totalLiability);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public OsiComTotalLiability cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this osi com total liability.
	 *
	 * @return the company ID of this osi com total liability
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi com total liability.
	 *
	 * @return the create date of this osi com total liability
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this osi com total liability.
	 *
	 * @return the group ID of this osi com total liability
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this osi com total liability.
	 *
	 * @return the modified date of this osi com total liability
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi com total liability ID of this osi com total liability.
	 *
	 * @return the osi com total liability ID of this osi com total liability
	 */
	@Override
	public long getOsiComTotalLiabilityId() {
		return model.getOsiComTotalLiabilityId();
	}

	/**
	 * Returns the osi insolvency ID of this osi com total liability.
	 *
	 * @return the osi insolvency ID of this osi com total liability
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this osi com total liability.
	 *
	 * @return the primary key of this osi com total liability
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the total liability of this osi com total liability.
	 *
	 * @return the total liability of this osi com total liability
	 */
	@Override
	public String getTotalLiability() {
		return model.getTotalLiability();
	}

	/**
	 * Returns the user ID of this osi com total liability.
	 *
	 * @return the user ID of this osi com total liability
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi com total liability.
	 *
	 * @return the user name of this osi com total liability
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi com total liability.
	 *
	 * @return the user uuid of this osi com total liability
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
	 * Sets the company ID of this osi com total liability.
	 *
	 * @param companyId the company ID of this osi com total liability
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi com total liability.
	 *
	 * @param createDate the create date of this osi com total liability
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this osi com total liability.
	 *
	 * @param groupId the group ID of this osi com total liability
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this osi com total liability.
	 *
	 * @param modifiedDate the modified date of this osi com total liability
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi com total liability ID of this osi com total liability.
	 *
	 * @param osiComTotalLiabilityId the osi com total liability ID of this osi com total liability
	 */
	@Override
	public void setOsiComTotalLiabilityId(long osiComTotalLiabilityId) {
		model.setOsiComTotalLiabilityId(osiComTotalLiabilityId);
	}

	/**
	 * Sets the osi insolvency ID of this osi com total liability.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this osi com total liability
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this osi com total liability.
	 *
	 * @param primaryKey the primary key of this osi com total liability
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the total liability of this osi com total liability.
	 *
	 * @param totalLiability the total liability of this osi com total liability
	 */
	@Override
	public void setTotalLiability(String totalLiability) {
		model.setTotalLiability(totalLiability);
	}

	/**
	 * Sets the user ID of this osi com total liability.
	 *
	 * @param userId the user ID of this osi com total liability
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi com total liability.
	 *
	 * @param userName the user name of this osi com total liability
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi com total liability.
	 *
	 * @param userUuid the user uuid of this osi com total liability
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
	protected OsiComTotalLiabilityWrapper wrap(
		OsiComTotalLiability osiComTotalLiability) {

		return new OsiComTotalLiabilityWrapper(osiComTotalLiability);
	}

}