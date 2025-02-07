/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HSRAApplicationLicenseIssuanceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HSRAApplicationLicenseIssuanceLocalService
 * @generated
 */
public class HSRAApplicationLicenseIssuanceLocalServiceWrapper
	implements HSRAApplicationLicenseIssuanceLocalService,
			   ServiceWrapper<HSRAApplicationLicenseIssuanceLocalService> {

	public HSRAApplicationLicenseIssuanceLocalServiceWrapper() {
		this(null);
	}

	public HSRAApplicationLicenseIssuanceLocalServiceWrapper(
		HSRAApplicationLicenseIssuanceLocalService
			hsraApplicationLicenseIssuanceLocalService) {

		_hsraApplicationLicenseIssuanceLocalService =
			hsraApplicationLicenseIssuanceLocalService;
	}

	/**
	 * Adds the hsra application license issuance to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HSRAApplicationLicenseIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationLicenseIssuance the hsra application license issuance
	 * @return the hsra application license issuance that was added
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance
		addHSRAApplicationLicenseIssuance(
			com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance
				hsraApplicationLicenseIssuance) {

		return _hsraApplicationLicenseIssuanceLocalService.
			addHSRAApplicationLicenseIssuance(hsraApplicationLicenseIssuance);
	}

	/**
	 * Creates a new hsra application license issuance with the primary key. Does not add the hsra application license issuance to the database.
	 *
	 * @param hsraFullLicenseId the primary key for the new hsra application license issuance
	 * @return the new hsra application license issuance
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance
		createHSRAApplicationLicenseIssuance(long hsraFullLicenseId) {

		return _hsraApplicationLicenseIssuanceLocalService.
			createHSRAApplicationLicenseIssuance(hsraFullLicenseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationLicenseIssuanceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the hsra application license issuance from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HSRAApplicationLicenseIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationLicenseIssuance the hsra application license issuance
	 * @return the hsra application license issuance that was removed
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance
		deleteHSRAApplicationLicenseIssuance(
			com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance
				hsraApplicationLicenseIssuance) {

		return _hsraApplicationLicenseIssuanceLocalService.
			deleteHSRAApplicationLicenseIssuance(
				hsraApplicationLicenseIssuance);
	}

	/**
	 * Deletes the hsra application license issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HSRAApplicationLicenseIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraFullLicenseId the primary key of the hsra application license issuance
	 * @return the hsra application license issuance that was removed
	 * @throws PortalException if a hsra application license issuance with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance
			deleteHSRAApplicationLicenseIssuance(long hsraFullLicenseId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationLicenseIssuanceLocalService.
			deleteHSRAApplicationLicenseIssuance(hsraFullLicenseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationLicenseIssuanceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _hsraApplicationLicenseIssuanceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _hsraApplicationLicenseIssuanceLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _hsraApplicationLicenseIssuanceLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _hsraApplicationLicenseIssuanceLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _hsraApplicationLicenseIssuanceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _hsraApplicationLicenseIssuanceLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _hsraApplicationLicenseIssuanceLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _hsraApplicationLicenseIssuanceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance
		fetchHSRAApplicationLicenseIssuance(long hsraFullLicenseId) {

		return _hsraApplicationLicenseIssuanceLocalService.
			fetchHSRAApplicationLicenseIssuance(hsraFullLicenseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _hsraApplicationLicenseIssuanceLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the hsra application license issuance with the primary key.
	 *
	 * @param hsraFullLicenseId the primary key of the hsra application license issuance
	 * @return the hsra application license issuance
	 * @throws PortalException if a hsra application license issuance with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance
			getHSRAApplicationLicenseIssuance(long hsraFullLicenseId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationLicenseIssuanceLocalService.
			getHSRAApplicationLicenseIssuance(hsraFullLicenseId);
	}

	@Override
	public com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance
			getHSRAApplicationLicenseIssuanceByCI(String caseId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationLicenseIssuanceException {

		return _hsraApplicationLicenseIssuanceLocalService.
			getHSRAApplicationLicenseIssuanceByCI(caseId);
	}

	/**
	 * Returns a range of all the hsra application license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application license issuances
	 * @param end the upper bound of the range of hsra application license issuances (not inclusive)
	 * @return the range of hsra application license issuances
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance>
			getHSRAApplicationLicenseIssuances(int start, int end) {

		return _hsraApplicationLicenseIssuanceLocalService.
			getHSRAApplicationLicenseIssuances(start, end);
	}

	/**
	 * Returns the number of hsra application license issuances.
	 *
	 * @return the number of hsra application license issuances
	 */
	@Override
	public int getHSRAApplicationLicenseIssuancesCount() {
		return _hsraApplicationLicenseIssuanceLocalService.
			getHSRAApplicationLicenseIssuancesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _hsraApplicationLicenseIssuanceLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _hsraApplicationLicenseIssuanceLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationLicenseIssuanceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the hsra application license issuance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HSRAApplicationLicenseIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationLicenseIssuance the hsra application license issuance
	 * @return the hsra application license issuance that was updated
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance
		updateHSRAApplicationLicenseIssuance(
			com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance
				hsraApplicationLicenseIssuance) {

		return _hsraApplicationLicenseIssuanceLocalService.
			updateHSRAApplicationLicenseIssuance(
				hsraApplicationLicenseIssuance);
	}

	@Override
	public com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance
		updateHSRAApplicationLicenseIssuance(
			String caseId, String licenseNumber, java.util.Date dateOfIssue,
			java.util.Date expiryDate, String receiptNumber, String status) {

		return _hsraApplicationLicenseIssuanceLocalService.
			updateHSRAApplicationLicenseIssuance(
				caseId, licenseNumber, dateOfIssue, expiryDate, receiptNumber,
				status);
	}

	@Override
	public com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance
		updateHSRAApplicationLicenseIssuance(
			String caseId, String licenseNumber, java.util.Date dateOfIssue,
			String feePaid, String receiptNumber, java.util.Date dueDate,
			String leadTime) {

		return _hsraApplicationLicenseIssuanceLocalService.
			updateHSRAApplicationLicenseIssuance(
				caseId, licenseNumber, dateOfIssue, feePaid, receiptNumber,
				dueDate, leadTime);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _hsraApplicationLicenseIssuanceLocalService.getBasePersistence();
	}

	@Override
	public HSRAApplicationLicenseIssuanceLocalService getWrappedService() {
		return _hsraApplicationLicenseIssuanceLocalService;
	}

	@Override
	public void setWrappedService(
		HSRAApplicationLicenseIssuanceLocalService
			hsraApplicationLicenseIssuanceLocalService) {

		_hsraApplicationLicenseIssuanceLocalService =
			hsraApplicationLicenseIssuanceLocalService;
	}

	private HSRAApplicationLicenseIssuanceLocalService
		_hsraApplicationLicenseIssuanceLocalService;

}