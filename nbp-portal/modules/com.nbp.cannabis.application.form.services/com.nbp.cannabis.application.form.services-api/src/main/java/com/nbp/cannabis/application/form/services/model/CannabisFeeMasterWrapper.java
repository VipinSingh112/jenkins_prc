/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CannabisFeeMaster}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisFeeMaster
 * @generated
 */
public class CannabisFeeMasterWrapper
	extends BaseModelWrapper<CannabisFeeMaster>
	implements CannabisFeeMaster, ModelWrapper<CannabisFeeMaster> {

	public CannabisFeeMasterWrapper(CannabisFeeMaster cannabisFeeMaster) {
		super(cannabisFeeMaster);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cannabisFeeMasterId", getCannabisFeeMasterId());
		attributes.put("category", getCategory());
		attributes.put("subCategory", getSubCategory());
		attributes.put("securityBond", getSecurityBond());
		attributes.put("licenseFee", getLicenseFee());
		attributes.put("remarks", getRemarks());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cannabisFeeMasterId = (Long)attributes.get("cannabisFeeMasterId");

		if (cannabisFeeMasterId != null) {
			setCannabisFeeMasterId(cannabisFeeMasterId);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String subCategory = (String)attributes.get("subCategory");

		if (subCategory != null) {
			setSubCategory(subCategory);
		}

		Double securityBond = (Double)attributes.get("securityBond");

		if (securityBond != null) {
			setSecurityBond(securityBond);
		}

		Double licenseFee = (Double)attributes.get("licenseFee");

		if (licenseFee != null) {
			setLicenseFee(licenseFee);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}
	}

	@Override
	public CannabisFeeMaster cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the cannabis fee master ID of this cannabis fee master.
	 *
	 * @return the cannabis fee master ID of this cannabis fee master
	 */
	@Override
	public long getCannabisFeeMasterId() {
		return model.getCannabisFeeMasterId();
	}

	/**
	 * Returns the category of this cannabis fee master.
	 *
	 * @return the category of this cannabis fee master
	 */
	@Override
	public String getCategory() {
		return model.getCategory();
	}

	/**
	 * Returns the license fee of this cannabis fee master.
	 *
	 * @return the license fee of this cannabis fee master
	 */
	@Override
	public double getLicenseFee() {
		return model.getLicenseFee();
	}

	/**
	 * Returns the primary key of this cannabis fee master.
	 *
	 * @return the primary key of this cannabis fee master
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the remarks of this cannabis fee master.
	 *
	 * @return the remarks of this cannabis fee master
	 */
	@Override
	public String getRemarks() {
		return model.getRemarks();
	}

	/**
	 * Returns the security bond of this cannabis fee master.
	 *
	 * @return the security bond of this cannabis fee master
	 */
	@Override
	public double getSecurityBond() {
		return model.getSecurityBond();
	}

	/**
	 * Returns the sub category of this cannabis fee master.
	 *
	 * @return the sub category of this cannabis fee master
	 */
	@Override
	public String getSubCategory() {
		return model.getSubCategory();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the cannabis fee master ID of this cannabis fee master.
	 *
	 * @param cannabisFeeMasterId the cannabis fee master ID of this cannabis fee master
	 */
	@Override
	public void setCannabisFeeMasterId(long cannabisFeeMasterId) {
		model.setCannabisFeeMasterId(cannabisFeeMasterId);
	}

	/**
	 * Sets the category of this cannabis fee master.
	 *
	 * @param category the category of this cannabis fee master
	 */
	@Override
	public void setCategory(String category) {
		model.setCategory(category);
	}

	/**
	 * Sets the license fee of this cannabis fee master.
	 *
	 * @param licenseFee the license fee of this cannabis fee master
	 */
	@Override
	public void setLicenseFee(double licenseFee) {
		model.setLicenseFee(licenseFee);
	}

	/**
	 * Sets the primary key of this cannabis fee master.
	 *
	 * @param primaryKey the primary key of this cannabis fee master
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the remarks of this cannabis fee master.
	 *
	 * @param remarks the remarks of this cannabis fee master
	 */
	@Override
	public void setRemarks(String remarks) {
		model.setRemarks(remarks);
	}

	/**
	 * Sets the security bond of this cannabis fee master.
	 *
	 * @param securityBond the security bond of this cannabis fee master
	 */
	@Override
	public void setSecurityBond(double securityBond) {
		model.setSecurityBond(securityBond);
	}

	/**
	 * Sets the sub category of this cannabis fee master.
	 *
	 * @param subCategory the sub category of this cannabis fee master
	 */
	@Override
	public void setSubCategory(String subCategory) {
		model.setSubCategory(subCategory);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected CannabisFeeMasterWrapper wrap(
		CannabisFeeMaster cannabisFeeMaster) {

		return new CannabisFeeMasterWrapper(cannabisFeeMaster);
	}

}