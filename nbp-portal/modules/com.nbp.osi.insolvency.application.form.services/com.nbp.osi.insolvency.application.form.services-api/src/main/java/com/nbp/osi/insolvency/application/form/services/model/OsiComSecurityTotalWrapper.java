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
 * This class is a wrapper for {@link OsiComSecurityTotal}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiComSecurityTotal
 * @generated
 */
public class OsiComSecurityTotalWrapper
	extends BaseModelWrapper<OsiComSecurityTotal>
	implements ModelWrapper<OsiComSecurityTotal>, OsiComSecurityTotal {

	public OsiComSecurityTotalWrapper(OsiComSecurityTotal osiComSecurityTotal) {
		super(osiComSecurityTotal);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("osiComSecurityTotalId", getOsiComSecurityTotalId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("comSecuritTotal", getComSecuritTotal());
		attributes.put("comAssetTotal", getComAssetTotal());
		attributes.put("comSecuritTotalValue", getComSecuritTotalValue());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long osiComSecurityTotalId = (Long)attributes.get(
			"osiComSecurityTotalId");

		if (osiComSecurityTotalId != null) {
			setOsiComSecurityTotalId(osiComSecurityTotalId);
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

		String comSecuritTotal = (String)attributes.get("comSecuritTotal");

		if (comSecuritTotal != null) {
			setComSecuritTotal(comSecuritTotal);
		}

		String comAssetTotal = (String)attributes.get("comAssetTotal");

		if (comAssetTotal != null) {
			setComAssetTotal(comAssetTotal);
		}

		String comSecuritTotalValue = (String)attributes.get(
			"comSecuritTotalValue");

		if (comSecuritTotalValue != null) {
			setComSecuritTotalValue(comSecuritTotalValue);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public OsiComSecurityTotal cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the com asset total of this osi com security total.
	 *
	 * @return the com asset total of this osi com security total
	 */
	@Override
	public String getComAssetTotal() {
		return model.getComAssetTotal();
	}

	/**
	 * Returns the company ID of this osi com security total.
	 *
	 * @return the company ID of this osi com security total
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the com securit total of this osi com security total.
	 *
	 * @return the com securit total of this osi com security total
	 */
	@Override
	public String getComSecuritTotal() {
		return model.getComSecuritTotal();
	}

	/**
	 * Returns the com securit total value of this osi com security total.
	 *
	 * @return the com securit total value of this osi com security total
	 */
	@Override
	public String getComSecuritTotalValue() {
		return model.getComSecuritTotalValue();
	}

	/**
	 * Returns the create date of this osi com security total.
	 *
	 * @return the create date of this osi com security total
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this osi com security total.
	 *
	 * @return the group ID of this osi com security total
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this osi com security total.
	 *
	 * @return the modified date of this osi com security total
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi com security total ID of this osi com security total.
	 *
	 * @return the osi com security total ID of this osi com security total
	 */
	@Override
	public long getOsiComSecurityTotalId() {
		return model.getOsiComSecurityTotalId();
	}

	/**
	 * Returns the osi insolvency ID of this osi com security total.
	 *
	 * @return the osi insolvency ID of this osi com security total
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this osi com security total.
	 *
	 * @return the primary key of this osi com security total
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this osi com security total.
	 *
	 * @return the user ID of this osi com security total
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi com security total.
	 *
	 * @return the user name of this osi com security total
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi com security total.
	 *
	 * @return the user uuid of this osi com security total
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
	 * Sets the com asset total of this osi com security total.
	 *
	 * @param comAssetTotal the com asset total of this osi com security total
	 */
	@Override
	public void setComAssetTotal(String comAssetTotal) {
		model.setComAssetTotal(comAssetTotal);
	}

	/**
	 * Sets the company ID of this osi com security total.
	 *
	 * @param companyId the company ID of this osi com security total
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the com securit total of this osi com security total.
	 *
	 * @param comSecuritTotal the com securit total of this osi com security total
	 */
	@Override
	public void setComSecuritTotal(String comSecuritTotal) {
		model.setComSecuritTotal(comSecuritTotal);
	}

	/**
	 * Sets the com securit total value of this osi com security total.
	 *
	 * @param comSecuritTotalValue the com securit total value of this osi com security total
	 */
	@Override
	public void setComSecuritTotalValue(String comSecuritTotalValue) {
		model.setComSecuritTotalValue(comSecuritTotalValue);
	}

	/**
	 * Sets the create date of this osi com security total.
	 *
	 * @param createDate the create date of this osi com security total
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this osi com security total.
	 *
	 * @param groupId the group ID of this osi com security total
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this osi com security total.
	 *
	 * @param modifiedDate the modified date of this osi com security total
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi com security total ID of this osi com security total.
	 *
	 * @param osiComSecurityTotalId the osi com security total ID of this osi com security total
	 */
	@Override
	public void setOsiComSecurityTotalId(long osiComSecurityTotalId) {
		model.setOsiComSecurityTotalId(osiComSecurityTotalId);
	}

	/**
	 * Sets the osi insolvency ID of this osi com security total.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this osi com security total
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this osi com security total.
	 *
	 * @param primaryKey the primary key of this osi com security total
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this osi com security total.
	 *
	 * @param userId the user ID of this osi com security total
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi com security total.
	 *
	 * @param userName the user name of this osi com security total
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi com security total.
	 *
	 * @param userUuid the user uuid of this osi com security total
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
	protected OsiComSecurityTotalWrapper wrap(
		OsiComSecurityTotal osiComSecurityTotal) {

		return new OsiComSecurityTotalWrapper(osiComSecurityTotal);
	}

}