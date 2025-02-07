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
 * This class is a wrapper for {@link CannabisSupportingDocumentsMaster}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisSupportingDocumentsMaster
 * @generated
 */
public class CannabisSupportingDocumentsMasterWrapper
	extends BaseModelWrapper<CannabisSupportingDocumentsMaster>
	implements CannabisSupportingDocumentsMaster,
			   ModelWrapper<CannabisSupportingDocumentsMaster> {

	public CannabisSupportingDocumentsMasterWrapper(
		CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster) {

		super(cannabisSupportingDocumentsMaster);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"cannabisSupportingDocMasterId",
			getCannabisSupportingDocMasterId());
		attributes.put("applicationType", getApplicationType());
		attributes.put("documentTye", getDocumentTye());
		attributes.put("landType", getLandType());
		attributes.put("userType", getUserType());
		attributes.put("documentName", getDocumentName());
		attributes.put("remarks", getRemarks());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cannabisSupportingDocMasterId = (Long)attributes.get(
			"cannabisSupportingDocMasterId");

		if (cannabisSupportingDocMasterId != null) {
			setCannabisSupportingDocMasterId(cannabisSupportingDocMasterId);
		}

		String applicationType = (String)attributes.get("applicationType");

		if (applicationType != null) {
			setApplicationType(applicationType);
		}

		String documentTye = (String)attributes.get("documentTye");

		if (documentTye != null) {
			setDocumentTye(documentTye);
		}

		String landType = (String)attributes.get("landType");

		if (landType != null) {
			setLandType(landType);
		}

		String userType = (String)attributes.get("userType");

		if (userType != null) {
			setUserType(userType);
		}

		String documentName = (String)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public CannabisSupportingDocumentsMaster cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the application type of this cannabis supporting documents master.
	 *
	 * @return the application type of this cannabis supporting documents master
	 */
	@Override
	public String getApplicationType() {
		return model.getApplicationType();
	}

	/**
	 * Returns the cannabis supporting doc master ID of this cannabis supporting documents master.
	 *
	 * @return the cannabis supporting doc master ID of this cannabis supporting documents master
	 */
	@Override
	public long getCannabisSupportingDocMasterId() {
		return model.getCannabisSupportingDocMasterId();
	}

	/**
	 * Returns the document name of this cannabis supporting documents master.
	 *
	 * @return the document name of this cannabis supporting documents master
	 */
	@Override
	public String getDocumentName() {
		return model.getDocumentName();
	}

	/**
	 * Returns the document tye of this cannabis supporting documents master.
	 *
	 * @return the document tye of this cannabis supporting documents master
	 */
	@Override
	public String getDocumentTye() {
		return model.getDocumentTye();
	}

	/**
	 * Returns the land type of this cannabis supporting documents master.
	 *
	 * @return the land type of this cannabis supporting documents master
	 */
	@Override
	public String getLandType() {
		return model.getLandType();
	}

	/**
	 * Returns the primary key of this cannabis supporting documents master.
	 *
	 * @return the primary key of this cannabis supporting documents master
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the remarks of this cannabis supporting documents master.
	 *
	 * @return the remarks of this cannabis supporting documents master
	 */
	@Override
	public String getRemarks() {
		return model.getRemarks();
	}

	/**
	 * Returns the status of this cannabis supporting documents master.
	 *
	 * @return the status of this cannabis supporting documents master
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user type of this cannabis supporting documents master.
	 *
	 * @return the user type of this cannabis supporting documents master
	 */
	@Override
	public String getUserType() {
		return model.getUserType();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the application type of this cannabis supporting documents master.
	 *
	 * @param applicationType the application type of this cannabis supporting documents master
	 */
	@Override
	public void setApplicationType(String applicationType) {
		model.setApplicationType(applicationType);
	}

	/**
	 * Sets the cannabis supporting doc master ID of this cannabis supporting documents master.
	 *
	 * @param cannabisSupportingDocMasterId the cannabis supporting doc master ID of this cannabis supporting documents master
	 */
	@Override
	public void setCannabisSupportingDocMasterId(
		long cannabisSupportingDocMasterId) {

		model.setCannabisSupportingDocMasterId(cannabisSupportingDocMasterId);
	}

	/**
	 * Sets the document name of this cannabis supporting documents master.
	 *
	 * @param documentName the document name of this cannabis supporting documents master
	 */
	@Override
	public void setDocumentName(String documentName) {
		model.setDocumentName(documentName);
	}

	/**
	 * Sets the document tye of this cannabis supporting documents master.
	 *
	 * @param documentTye the document tye of this cannabis supporting documents master
	 */
	@Override
	public void setDocumentTye(String documentTye) {
		model.setDocumentTye(documentTye);
	}

	/**
	 * Sets the land type of this cannabis supporting documents master.
	 *
	 * @param landType the land type of this cannabis supporting documents master
	 */
	@Override
	public void setLandType(String landType) {
		model.setLandType(landType);
	}

	/**
	 * Sets the primary key of this cannabis supporting documents master.
	 *
	 * @param primaryKey the primary key of this cannabis supporting documents master
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the remarks of this cannabis supporting documents master.
	 *
	 * @param remarks the remarks of this cannabis supporting documents master
	 */
	@Override
	public void setRemarks(String remarks) {
		model.setRemarks(remarks);
	}

	/**
	 * Sets the status of this cannabis supporting documents master.
	 *
	 * @param status the status of this cannabis supporting documents master
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user type of this cannabis supporting documents master.
	 *
	 * @param userType the user type of this cannabis supporting documents master
	 */
	@Override
	public void setUserType(String userType) {
		model.setUserType(userType);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected CannabisSupportingDocumentsMasterWrapper wrap(
		CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster) {

		return new CannabisSupportingDocumentsMasterWrapper(
			cannabisSupportingDocumentsMaster);
	}

}