/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PharmaSubCategoriesMapping}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaSubCategoriesMapping
 * @generated
 */
public class PharmaSubCategoriesMappingWrapper
	extends BaseModelWrapper<PharmaSubCategoriesMapping>
	implements ModelWrapper<PharmaSubCategoriesMapping>,
			   PharmaSubCategoriesMapping {

	public PharmaSubCategoriesMappingWrapper(
		PharmaSubCategoriesMapping pharmaSubCategoriesMapping) {

		super(pharmaSubCategoriesMapping);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"pharmaSubCategoriesMappingId", getPharmaSubCategoriesMappingId());
		attributes.put("pharmaSubCategory", getPharmaSubCategory());
		attributes.put(
			"pharmaSubCategoryMapValue", getPharmaSubCategoryMapValue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long pharmaSubCategoriesMappingId = (Long)attributes.get(
			"pharmaSubCategoriesMappingId");

		if (pharmaSubCategoriesMappingId != null) {
			setPharmaSubCategoriesMappingId(pharmaSubCategoriesMappingId);
		}

		String pharmaSubCategory = (String)attributes.get("pharmaSubCategory");

		if (pharmaSubCategory != null) {
			setPharmaSubCategory(pharmaSubCategory);
		}

		String pharmaSubCategoryMapValue = (String)attributes.get(
			"pharmaSubCategoryMapValue");

		if (pharmaSubCategoryMapValue != null) {
			setPharmaSubCategoryMapValue(pharmaSubCategoryMapValue);
		}
	}

	@Override
	public PharmaSubCategoriesMapping cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the pharma sub categories mapping ID of this pharma sub categories mapping.
	 *
	 * @return the pharma sub categories mapping ID of this pharma sub categories mapping
	 */
	@Override
	public long getPharmaSubCategoriesMappingId() {
		return model.getPharmaSubCategoriesMappingId();
	}

	/**
	 * Returns the pharma sub category of this pharma sub categories mapping.
	 *
	 * @return the pharma sub category of this pharma sub categories mapping
	 */
	@Override
	public String getPharmaSubCategory() {
		return model.getPharmaSubCategory();
	}

	/**
	 * Returns the pharma sub category map value of this pharma sub categories mapping.
	 *
	 * @return the pharma sub category map value of this pharma sub categories mapping
	 */
	@Override
	public String getPharmaSubCategoryMapValue() {
		return model.getPharmaSubCategoryMapValue();
	}

	/**
	 * Returns the primary key of this pharma sub categories mapping.
	 *
	 * @return the primary key of this pharma sub categories mapping
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the pharma sub categories mapping ID of this pharma sub categories mapping.
	 *
	 * @param pharmaSubCategoriesMappingId the pharma sub categories mapping ID of this pharma sub categories mapping
	 */
	@Override
	public void setPharmaSubCategoriesMappingId(
		long pharmaSubCategoriesMappingId) {

		model.setPharmaSubCategoriesMappingId(pharmaSubCategoriesMappingId);
	}

	/**
	 * Sets the pharma sub category of this pharma sub categories mapping.
	 *
	 * @param pharmaSubCategory the pharma sub category of this pharma sub categories mapping
	 */
	@Override
	public void setPharmaSubCategory(String pharmaSubCategory) {
		model.setPharmaSubCategory(pharmaSubCategory);
	}

	/**
	 * Sets the pharma sub category map value of this pharma sub categories mapping.
	 *
	 * @param pharmaSubCategoryMapValue the pharma sub category map value of this pharma sub categories mapping
	 */
	@Override
	public void setPharmaSubCategoryMapValue(String pharmaSubCategoryMapValue) {
		model.setPharmaSubCategoryMapValue(pharmaSubCategoryMapValue);
	}

	/**
	 * Sets the primary key of this pharma sub categories mapping.
	 *
	 * @param primaryKey the primary key of this pharma sub categories mapping
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected PharmaSubCategoriesMappingWrapper wrap(
		PharmaSubCategoriesMapping pharmaSubCategoriesMapping) {

		return new PharmaSubCategoriesMappingWrapper(
			pharmaSubCategoriesMapping);
	}

}