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
 * This class is a wrapper for {@link PharmaDocumentList}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaDocumentList
 * @generated
 */
public class PharmaDocumentListWrapper
	extends BaseModelWrapper<PharmaDocumentList>
	implements ModelWrapper<PharmaDocumentList>, PharmaDocumentList {

	public PharmaDocumentListWrapper(PharmaDocumentList pharmaDocumentList) {
		super(pharmaDocumentList);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("pharmaDocListId", getPharmaDocListId());
		attributes.put("pharmaAppType", getPharmaAppType());
		attributes.put("pharmaDocList", getPharmaDocList());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long pharmaDocListId = (Long)attributes.get("pharmaDocListId");

		if (pharmaDocListId != null) {
			setPharmaDocListId(pharmaDocListId);
		}

		String pharmaAppType = (String)attributes.get("pharmaAppType");

		if (pharmaAppType != null) {
			setPharmaAppType(pharmaAppType);
		}

		String pharmaDocList = (String)attributes.get("pharmaDocList");

		if (pharmaDocList != null) {
			setPharmaDocList(pharmaDocList);
		}
	}

	@Override
	public PharmaDocumentList cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the pharma app type of this pharma document list.
	 *
	 * @return the pharma app type of this pharma document list
	 */
	@Override
	public String getPharmaAppType() {
		return model.getPharmaAppType();
	}

	/**
	 * Returns the pharma doc list of this pharma document list.
	 *
	 * @return the pharma doc list of this pharma document list
	 */
	@Override
	public String getPharmaDocList() {
		return model.getPharmaDocList();
	}

	/**
	 * Returns the pharma doc list ID of this pharma document list.
	 *
	 * @return the pharma doc list ID of this pharma document list
	 */
	@Override
	public long getPharmaDocListId() {
		return model.getPharmaDocListId();
	}

	/**
	 * Returns the primary key of this pharma document list.
	 *
	 * @return the primary key of this pharma document list
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
	 * Sets the pharma app type of this pharma document list.
	 *
	 * @param pharmaAppType the pharma app type of this pharma document list
	 */
	@Override
	public void setPharmaAppType(String pharmaAppType) {
		model.setPharmaAppType(pharmaAppType);
	}

	/**
	 * Sets the pharma doc list of this pharma document list.
	 *
	 * @param pharmaDocList the pharma doc list of this pharma document list
	 */
	@Override
	public void setPharmaDocList(String pharmaDocList) {
		model.setPharmaDocList(pharmaDocList);
	}

	/**
	 * Sets the pharma doc list ID of this pharma document list.
	 *
	 * @param pharmaDocListId the pharma doc list ID of this pharma document list
	 */
	@Override
	public void setPharmaDocListId(long pharmaDocListId) {
		model.setPharmaDocListId(pharmaDocListId);
	}

	/**
	 * Sets the primary key of this pharma document list.
	 *
	 * @param primaryKey the primary key of this pharma document list
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
	protected PharmaDocumentListWrapper wrap(
		PharmaDocumentList pharmaDocumentList) {

		return new PharmaDocumentListWrapper(pharmaDocumentList);
	}

}