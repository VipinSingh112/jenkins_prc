/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AcquireDocumentList}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDocumentList
 * @generated
 */
public class AcquireDocumentListWrapper
	extends BaseModelWrapper<AcquireDocumentList>
	implements AcquireDocumentList, ModelWrapper<AcquireDocumentList> {

	public AcquireDocumentListWrapper(AcquireDocumentList acquireDocumentList) {
		super(acquireDocumentList);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("acquireDocumentListId", getAcquireDocumentListId());
		attributes.put("documentType", getDocumentType());
		attributes.put("documentName", getDocumentName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long acquireDocumentListId = (Long)attributes.get(
			"acquireDocumentListId");

		if (acquireDocumentListId != null) {
			setAcquireDocumentListId(acquireDocumentListId);
		}

		String documentType = (String)attributes.get("documentType");

		if (documentType != null) {
			setDocumentType(documentType);
		}

		String documentName = (String)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}
	}

	@Override
	public AcquireDocumentList cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acquire document list ID of this acquire document list.
	 *
	 * @return the acquire document list ID of this acquire document list
	 */
	@Override
	public long getAcquireDocumentListId() {
		return model.getAcquireDocumentListId();
	}

	/**
	 * Returns the document name of this acquire document list.
	 *
	 * @return the document name of this acquire document list
	 */
	@Override
	public String getDocumentName() {
		return model.getDocumentName();
	}

	/**
	 * Returns the document type of this acquire document list.
	 *
	 * @return the document type of this acquire document list
	 */
	@Override
	public String getDocumentType() {
		return model.getDocumentType();
	}

	/**
	 * Returns the primary key of this acquire document list.
	 *
	 * @return the primary key of this acquire document list
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
	 * Sets the acquire document list ID of this acquire document list.
	 *
	 * @param acquireDocumentListId the acquire document list ID of this acquire document list
	 */
	@Override
	public void setAcquireDocumentListId(long acquireDocumentListId) {
		model.setAcquireDocumentListId(acquireDocumentListId);
	}

	/**
	 * Sets the document name of this acquire document list.
	 *
	 * @param documentName the document name of this acquire document list
	 */
	@Override
	public void setDocumentName(String documentName) {
		model.setDocumentName(documentName);
	}

	/**
	 * Sets the document type of this acquire document list.
	 *
	 * @param documentType the document type of this acquire document list
	 */
	@Override
	public void setDocumentType(String documentType) {
		model.setDocumentType(documentType);
	}

	/**
	 * Sets the primary key of this acquire document list.
	 *
	 * @param primaryKey the primary key of this acquire document list
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
	protected AcquireDocumentListWrapper wrap(
		AcquireDocumentList acquireDocumentList) {

		return new AcquireDocumentListWrapper(acquireDocumentList);
	}

}