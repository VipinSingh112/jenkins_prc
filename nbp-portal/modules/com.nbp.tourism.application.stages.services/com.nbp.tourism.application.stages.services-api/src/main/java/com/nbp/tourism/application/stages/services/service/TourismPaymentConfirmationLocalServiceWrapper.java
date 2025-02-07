/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismPaymentConfirmationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismPaymentConfirmationLocalService
 * @generated
 */
public class TourismPaymentConfirmationLocalServiceWrapper
	implements ServiceWrapper<TourismPaymentConfirmationLocalService>,
			   TourismPaymentConfirmationLocalService {

	public TourismPaymentConfirmationLocalServiceWrapper() {
		this(null);
	}

	public TourismPaymentConfirmationLocalServiceWrapper(
		TourismPaymentConfirmationLocalService
			tourismPaymentConfirmationLocalService) {

		_tourismPaymentConfirmationLocalService =
			tourismPaymentConfirmationLocalService;
	}

	/**
	 * Adds the tourism payment confirmation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismPaymentConfirmation the tourism payment confirmation
	 * @return the tourism payment confirmation that was added
	 */
	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismPaymentConfirmation addTourismPaymentConfirmation(
				com.nbp.tourism.application.stages.services.model.
					TourismPaymentConfirmation tourismPaymentConfirmation) {

		return _tourismPaymentConfirmationLocalService.
			addTourismPaymentConfirmation(tourismPaymentConfirmation);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismPaymentConfirmationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism payment confirmation with the primary key. Does not add the tourism payment confirmation to the database.
	 *
	 * @param tourismPaymentId the primary key for the new tourism payment confirmation
	 * @return the new tourism payment confirmation
	 */
	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismPaymentConfirmation createTourismPaymentConfirmation(
				long tourismPaymentId) {

		return _tourismPaymentConfirmationLocalService.
			createTourismPaymentConfirmation(tourismPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismPaymentConfirmationLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismPaymentId the primary key of the tourism payment confirmation
	 * @return the tourism payment confirmation that was removed
	 * @throws PortalException if a tourism payment confirmation with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismPaymentConfirmation deleteTourismPaymentConfirmation(
					long tourismPaymentId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismPaymentConfirmationLocalService.
			deleteTourismPaymentConfirmation(tourismPaymentId);
	}

	/**
	 * Deletes the tourism payment confirmation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismPaymentConfirmation the tourism payment confirmation
	 * @return the tourism payment confirmation that was removed
	 */
	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismPaymentConfirmation deleteTourismPaymentConfirmation(
				com.nbp.tourism.application.stages.services.model.
					TourismPaymentConfirmation tourismPaymentConfirmation) {

		return _tourismPaymentConfirmationLocalService.
			deleteTourismPaymentConfirmation(tourismPaymentConfirmation);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismPaymentConfirmationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismPaymentConfirmationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismPaymentConfirmationLocalService.dynamicQuery();
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

		return _tourismPaymentConfirmationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.stages.services.model.impl.TourismPaymentConfirmationModelImpl</code>.
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

		return _tourismPaymentConfirmationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.stages.services.model.impl.TourismPaymentConfirmationModelImpl</code>.
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

		return _tourismPaymentConfirmationLocalService.dynamicQuery(
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

		return _tourismPaymentConfirmationLocalService.dynamicQueryCount(
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

		return _tourismPaymentConfirmationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismPaymentConfirmation fetchTourismPaymentConfirmation(
				long tourismPaymentId) {

		return _tourismPaymentConfirmationLocalService.
			fetchTourismPaymentConfirmation(tourismPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismPaymentConfirmationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismPaymentConfirmationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismPaymentConfirmationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismPaymentConfirmationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismPaymentConfirmation getTourismPaymentBy_CI(String caseId)
				throws com.nbp.tourism.application.stages.services.exception.
					NoSuchTourismPaymentConfirmationException {

		return _tourismPaymentConfirmationLocalService.getTourismPaymentBy_CI(
			caseId);
	}

	/**
	 * Returns the tourism payment confirmation with the primary key.
	 *
	 * @param tourismPaymentId the primary key of the tourism payment confirmation
	 * @return the tourism payment confirmation
	 * @throws PortalException if a tourism payment confirmation with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismPaymentConfirmation getTourismPaymentConfirmation(
					long tourismPaymentId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismPaymentConfirmationLocalService.
			getTourismPaymentConfirmation(tourismPaymentId);
	}

	/**
	 * Returns a range of all the tourism payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.stages.services.model.impl.TourismPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism payment confirmations
	 * @param end the upper bound of the range of tourism payment confirmations (not inclusive)
	 * @return the range of tourism payment confirmations
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.stages.services.model.
			TourismPaymentConfirmation> getTourismPaymentConfirmations(
				int start, int end) {

		return _tourismPaymentConfirmationLocalService.
			getTourismPaymentConfirmations(start, end);
	}

	@Override
	public java.util.List
		<com.nbp.tourism.application.stages.services.model.
			TourismPaymentConfirmation> getTourismPaymentConfirmations_By_CI(
				String caseId) {

		return _tourismPaymentConfirmationLocalService.
			getTourismPaymentConfirmations_By_CI(caseId);
	}

	/**
	 * Returns the number of tourism payment confirmations.
	 *
	 * @return the number of tourism payment confirmations
	 */
	@Override
	public int getTourismPaymentConfirmationsCount() {
		return _tourismPaymentConfirmationLocalService.
			getTourismPaymentConfirmationsCount();
	}

	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismPaymentConfirmation updateTourismPaymentConfirmation(
				String caseId, java.util.Date dateReceived, String amountDue,
				String amountReceived, String receiptNumber, String comment,
				String amountOutstanding, java.util.Date dueDate,
				String status) {

		return _tourismPaymentConfirmationLocalService.
			updateTourismPaymentConfirmation(
				caseId, dateReceived, amountDue, amountReceived, receiptNumber,
				comment, amountOutstanding, dueDate, status);
	}

	/**
	 * Updates the tourism payment confirmation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismPaymentConfirmation the tourism payment confirmation
	 * @return the tourism payment confirmation that was updated
	 */
	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismPaymentConfirmation updateTourismPaymentConfirmation(
				com.nbp.tourism.application.stages.services.model.
					TourismPaymentConfirmation tourismPaymentConfirmation) {

		return _tourismPaymentConfirmationLocalService.
			updateTourismPaymentConfirmation(tourismPaymentConfirmation);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismPaymentConfirmationLocalService.getBasePersistence();
	}

	@Override
	public TourismPaymentConfirmationLocalService getWrappedService() {
		return _tourismPaymentConfirmationLocalService;
	}

	@Override
	public void setWrappedService(
		TourismPaymentConfirmationLocalService
			tourismPaymentConfirmationLocalService) {

		_tourismPaymentConfirmationLocalService =
			tourismPaymentConfirmationLocalService;
	}

	private TourismPaymentConfirmationLocalService
		_tourismPaymentConfirmationLocalService;

}