/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link HealthcareEquipHeadingList}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthcareEquipHeadingList
 * @generated
 */
public class HealthcareEquipHeadingListWrapper
	extends BaseModelWrapper<HealthcareEquipHeadingList>
	implements HealthcareEquipHeadingList,
			   ModelWrapper<HealthcareEquipHeadingList> {

	public HealthcareEquipHeadingListWrapper(
		HealthcareEquipHeadingList healthcareEquipHeadingList) {

		super(healthcareEquipHeadingList);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"healthcareEquipHeadingListId", getHealthcareEquipHeadingListId());
		attributes.put("healthcareDescription", getHealthcareDescription());
		attributes.put("healthcareHsHeading", getHealthcareHsHeading());
		attributes.put("healthcareSubHeading", getHealthcareSubHeading());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long healthcareEquipHeadingListId = (Long)attributes.get(
			"healthcareEquipHeadingListId");

		if (healthcareEquipHeadingListId != null) {
			setHealthcareEquipHeadingListId(healthcareEquipHeadingListId);
		}

		String healthcareDescription = (String)attributes.get(
			"healthcareDescription");

		if (healthcareDescription != null) {
			setHealthcareDescription(healthcareDescription);
		}

		String healthcareHsHeading = (String)attributes.get(
			"healthcareHsHeading");

		if (healthcareHsHeading != null) {
			setHealthcareHsHeading(healthcareHsHeading);
		}

		String healthcareSubHeading = (String)attributes.get(
			"healthcareSubHeading");

		if (healthcareSubHeading != null) {
			setHealthcareSubHeading(healthcareSubHeading);
		}
	}

	@Override
	public HealthcareEquipHeadingList cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the healthcare description of this healthcare equip heading list.
	 *
	 * @return the healthcare description of this healthcare equip heading list
	 */
	@Override
	public String getHealthcareDescription() {
		return model.getHealthcareDescription();
	}

	/**
	 * Returns the healthcare equip heading list ID of this healthcare equip heading list.
	 *
	 * @return the healthcare equip heading list ID of this healthcare equip heading list
	 */
	@Override
	public long getHealthcareEquipHeadingListId() {
		return model.getHealthcareEquipHeadingListId();
	}

	/**
	 * Returns the healthcare hs heading of this healthcare equip heading list.
	 *
	 * @return the healthcare hs heading of this healthcare equip heading list
	 */
	@Override
	public String getHealthcareHsHeading() {
		return model.getHealthcareHsHeading();
	}

	/**
	 * Returns the healthcare sub heading of this healthcare equip heading list.
	 *
	 * @return the healthcare sub heading of this healthcare equip heading list
	 */
	@Override
	public String getHealthcareSubHeading() {
		return model.getHealthcareSubHeading();
	}

	/**
	 * Returns the primary key of this healthcare equip heading list.
	 *
	 * @return the primary key of this healthcare equip heading list
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
	 * Sets the healthcare description of this healthcare equip heading list.
	 *
	 * @param healthcareDescription the healthcare description of this healthcare equip heading list
	 */
	@Override
	public void setHealthcareDescription(String healthcareDescription) {
		model.setHealthcareDescription(healthcareDescription);
	}

	/**
	 * Sets the healthcare equip heading list ID of this healthcare equip heading list.
	 *
	 * @param healthcareEquipHeadingListId the healthcare equip heading list ID of this healthcare equip heading list
	 */
	@Override
	public void setHealthcareEquipHeadingListId(
		long healthcareEquipHeadingListId) {

		model.setHealthcareEquipHeadingListId(healthcareEquipHeadingListId);
	}

	/**
	 * Sets the healthcare hs heading of this healthcare equip heading list.
	 *
	 * @param healthcareHsHeading the healthcare hs heading of this healthcare equip heading list
	 */
	@Override
	public void setHealthcareHsHeading(String healthcareHsHeading) {
		model.setHealthcareHsHeading(healthcareHsHeading);
	}

	/**
	 * Sets the healthcare sub heading of this healthcare equip heading list.
	 *
	 * @param healthcareSubHeading the healthcare sub heading of this healthcare equip heading list
	 */
	@Override
	public void setHealthcareSubHeading(String healthcareSubHeading) {
		model.setHealthcareSubHeading(healthcareSubHeading);
	}

	/**
	 * Sets the primary key of this healthcare equip heading list.
	 *
	 * @param primaryKey the primary key of this healthcare equip heading list
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
	protected HealthcareEquipHeadingListWrapper wrap(
		HealthcareEquipHeadingList healthcareEquipHeadingList) {

		return new HealthcareEquipHeadingListWrapper(
			healthcareEquipHeadingList);
	}

}