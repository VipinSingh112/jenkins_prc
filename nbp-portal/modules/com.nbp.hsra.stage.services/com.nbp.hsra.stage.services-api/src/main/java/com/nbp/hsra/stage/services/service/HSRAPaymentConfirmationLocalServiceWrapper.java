/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HSRAPaymentConfirmationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HSRAPaymentConfirmationLocalService
 * @generated
 */
public class HSRAPaymentConfirmationLocalServiceWrapper
	implements HSRAPaymentConfirmationLocalService,
			   ServiceWrapper<HSRAPaymentConfirmationLocalService> {

	public HSRAPaymentConfirmationLocalServiceWrapper() {
		this(null);
	}

	public HSRAPaymentConfirmationLocalServiceWrapper(
		HSRAPaymentConfirmationLocalService
			hsraPaymentConfirmationLocalService) {

		_hsraPaymentConfirmationLocalService =
			hsraPaymentConfirmationLocalService;
	}

	/**
	 * Adds the hsra payment confirmation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HSRAPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraPaymentConfirmation the hsra payment confirmation
	 * @return the hsra payment confirmation that was added
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HSRAPaymentConfirmation
		addHSRAPaymentConfirmation(
			com.nbp.hsra.stage.services.model.HSRAPaymentConfirmation
				hsraPaymentConfirmation) {

		return _hsraPaymentConfirmationLocalService.addHSRAPaymentConfirmation(
			hsraPaymentConfirmation);
	}

	/**
	 * Creates a new hsra payment confirmation with the primary key. Does not add the hsra payment confirmation to the database.
	 *
	 * @param hsraPaymentId the primary key for the new hsra payment confirmation
	 * @return the new hsra payment confirmation
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HSRAPaymentConfirmation
		createHSRAPaymentConfirmation(long hsraPaymentId) {

		return _hsraPaymentConfirmationLocalService.
			createHSRAPaymentConfirmation(hsraPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraPaymentConfirmationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the hsra payment confirmation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HSRAPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraPaymentConfirmation the hsra payment confirmation
	 * @return the hsra payment confirmation that was removed
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HSRAPaymentConfirmation
		deleteHSRAPaymentConfirmation(
			com.nbp.hsra.stage.services.model.HSRAPaymentConfirmation
				hsraPaymentConfirmation) {

		return _hsraPaymentConfirmationLocalService.
			deleteHSRAPaymentConfirmation(hsraPaymentConfirmation);
	}

	/**
	 * Deletes the hsra payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HSRAPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraPaymentId the primary key of the hsra payment confirmation
	 * @return the hsra payment confirmation that was removed
	 * @throws PortalException if a hsra payment confirmation with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HSRAPaymentConfirmation
			deleteHSRAPaymentConfirmation(long hsraPaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraPaymentConfirmationLocalService.
			deleteHSRAPaymentConfirmation(hsraPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraPaymentConfirmationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _hsraPaymentConfirmationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _hsraPaymentConfirmationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _hsraPaymentConfirmationLocalService.dynamicQuery();
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

		return _hsraPaymentConfirmationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HSRAPaymentConfirmationModelImpl</code>.
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

		return _hsraPaymentConfirmationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HSRAPaymentConfirmationModelImpl</code>.
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

		return _hsraPaymentConfirmationLocalService.dynamicQuery(
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

		return _hsraPaymentConfirmationLocalService.dynamicQueryCount(
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

		return _hsraPaymentConfirmationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.stage.services.model.HSRAPaymentConfirmation
		fetchHSRAPaymentConfirmation(long hsraPaymentId) {

		return _hsraPaymentConfirmationLocalService.
			fetchHSRAPaymentConfirmation(hsraPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _hsraPaymentConfirmationLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the hsra payment confirmation with the primary key.
	 *
	 * @param hsraPaymentId the primary key of the hsra payment confirmation
	 * @return the hsra payment confirmation
	 * @throws PortalException if a hsra payment confirmation with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HSRAPaymentConfirmation
			getHSRAPaymentConfirmation(long hsraPaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraPaymentConfirmationLocalService.getHSRAPaymentConfirmation(
			hsraPaymentId);
	}

	@Override
	public com.nbp.hsra.stage.services.model.HSRAPaymentConfirmation
			getHSRAPaymentConfirmationByCI(String caseId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAPaymentConfirmationException {

		return _hsraPaymentConfirmationLocalService.
			getHSRAPaymentConfirmationByCI(caseId);
	}

	/**
	 * Returns a range of all the hsra payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HSRAPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra payment confirmations
	 * @param end the upper bound of the range of hsra payment confirmations (not inclusive)
	 * @return the range of hsra payment confirmations
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.stage.services.model.HSRAPaymentConfirmation>
			getHSRAPaymentConfirmations(int start, int end) {

		return _hsraPaymentConfirmationLocalService.getHSRAPaymentConfirmations(
			start, end);
	}

	@Override
	public java.util.List
		<com.nbp.hsra.stage.services.model.HSRAPaymentConfirmation>
			getHSRAPaymentConfirmations_List_By_CI(String caseId) {

		return _hsraPaymentConfirmationLocalService.
			getHSRAPaymentConfirmations_List_By_CI(caseId);
	}

	/**
	 * Returns the number of hsra payment confirmations.
	 *
	 * @return the number of hsra payment confirmations
	 */
	@Override
	public int getHSRAPaymentConfirmationsCount() {
		return _hsraPaymentConfirmationLocalService.
			getHSRAPaymentConfirmationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _hsraPaymentConfirmationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _hsraPaymentConfirmationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraPaymentConfirmationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the hsra payment confirmation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HSRAPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraPaymentConfirmation the hsra payment confirmation
	 * @return the hsra payment confirmation that was updated
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HSRAPaymentConfirmation
		updateHSRAPaymentConfirmation(
			com.nbp.hsra.stage.services.model.HSRAPaymentConfirmation
				hsraPaymentConfirmation) {

		return _hsraPaymentConfirmationLocalService.
			updateHSRAPaymentConfirmation(hsraPaymentConfirmation);
	}

	@Override
	public com.nbp.hsra.stage.services.model.HSRAPaymentConfirmation
		updateHSRAPaymentConfirmationData(
			String caseId, java.util.Date dateReceived, String amountDue,
			String amountreceived, String receiptNumber, String comments,
			String amountOutstanding, java.util.Date dueDate, String status) {

		return _hsraPaymentConfirmationLocalService.
			updateHSRAPaymentConfirmationData(
				caseId, dateReceived, amountDue, amountreceived, receiptNumber,
				comments, amountOutstanding, dueDate, status);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _hsraPaymentConfirmationLocalService.getBasePersistence();
	}

	@Override
	public HSRAPaymentConfirmationLocalService getWrappedService() {
		return _hsraPaymentConfirmationLocalService;
	}

	@Override
	public void setWrappedService(
		HSRAPaymentConfirmationLocalService
			hsraPaymentConfirmationLocalService) {

		_hsraPaymentConfirmationLocalService =
			hsraPaymentConfirmationLocalService;
	}

	private HSRAPaymentConfirmationLocalService
		_hsraPaymentConfirmationLocalService;

}