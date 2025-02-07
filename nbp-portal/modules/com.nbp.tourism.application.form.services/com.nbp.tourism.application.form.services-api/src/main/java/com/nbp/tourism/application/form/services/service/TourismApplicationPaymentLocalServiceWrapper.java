/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismApplicationPaymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationPaymentLocalService
 * @generated
 */
public class TourismApplicationPaymentLocalServiceWrapper
	implements ServiceWrapper<TourismApplicationPaymentLocalService>,
			   TourismApplicationPaymentLocalService {

	public TourismApplicationPaymentLocalServiceWrapper() {
		this(null);
	}

	public TourismApplicationPaymentLocalServiceWrapper(
		TourismApplicationPaymentLocalService
			tourismApplicationPaymentLocalService) {

		_tourismApplicationPaymentLocalService =
			tourismApplicationPaymentLocalService;
	}

	/**
	 * Adds the tourism application payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplicationPayment the tourism application payment
	 * @return the tourism application payment that was added
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismApplicationPayment addTourismApplicationPayment(
				com.nbp.tourism.application.form.services.model.
					TourismApplicationPayment tourismApplicationPayment) {

		return _tourismApplicationPaymentLocalService.
			addTourismApplicationPayment(tourismApplicationPayment);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismApplicationPaymentLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism application payment with the primary key. Does not add the tourism application payment to the database.
	 *
	 * @param TourismApplicationPaymentId the primary key for the new tourism application payment
	 * @return the new tourism application payment
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismApplicationPayment createTourismApplicationPayment(
				long TourismApplicationPaymentId) {

		return _tourismApplicationPaymentLocalService.
			createTourismApplicationPayment(TourismApplicationPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismApplicationPaymentLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param TourismApplicationPaymentId the primary key of the tourism application payment
	 * @return the tourism application payment that was removed
	 * @throws PortalException if a tourism application payment with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismApplicationPayment deleteTourismApplicationPayment(
					long TourismApplicationPaymentId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismApplicationPaymentLocalService.
			deleteTourismApplicationPayment(TourismApplicationPaymentId);
	}

	/**
	 * Deletes the tourism application payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplicationPayment the tourism application payment
	 * @return the tourism application payment that was removed
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismApplicationPayment deleteTourismApplicationPayment(
				com.nbp.tourism.application.form.services.model.
					TourismApplicationPayment tourismApplicationPayment) {

		return _tourismApplicationPaymentLocalService.
			deleteTourismApplicationPayment(tourismApplicationPayment);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismApplicationPaymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismApplicationPaymentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismApplicationPaymentLocalService.dynamicQuery();
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

		return _tourismApplicationPaymentLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismApplicationPaymentModelImpl</code>.
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

		return _tourismApplicationPaymentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismApplicationPaymentModelImpl</code>.
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

		return _tourismApplicationPaymentLocalService.dynamicQuery(
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

		return _tourismApplicationPaymentLocalService.dynamicQueryCount(
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

		return _tourismApplicationPaymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismApplicationPayment fetchTourismApplicationPayment(
				long TourismApplicationPaymentId) {

		return _tourismApplicationPaymentLocalService.
			fetchTourismApplicationPayment(TourismApplicationPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismApplicationPaymentLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismApplicationPaymentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismApplicationPaymentLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismApplicationPaymentLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the tourism application payment with the primary key.
	 *
	 * @param TourismApplicationPaymentId the primary key of the tourism application payment
	 * @return the tourism application payment
	 * @throws PortalException if a tourism application payment with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismApplicationPayment getTourismApplicationPayment(
					long TourismApplicationPaymentId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismApplicationPaymentLocalService.
			getTourismApplicationPayment(TourismApplicationPaymentId);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismApplicationPayment
					getTourismApplicationPaymentbyTourismApplicationId(
						long tourismApplicationId)
				throws com.nbp.tourism.application.form.services.exception.
					NoSuchTourismApplicationPaymentException {

		return _tourismApplicationPaymentLocalService.
			getTourismApplicationPaymentbyTourismApplicationId(
				tourismApplicationId);
	}

	/**
	 * Returns a range of all the tourism application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application payments
	 * @param end the upper bound of the range of tourism application payments (not inclusive)
	 * @return the range of tourism application payments
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismApplicationPayment> getTourismApplicationPayments(
				int start, int end) {

		return _tourismApplicationPaymentLocalService.
			getTourismApplicationPayments(start, end);
	}

	/**
	 * Returns the number of tourism application payments.
	 *
	 * @return the number of tourism application payments
	 */
	@Override
	public int getTourismApplicationPaymentsCount() {
		return _tourismApplicationPaymentLocalService.
			getTourismApplicationPaymentsCount();
	}

	/**
	 * Updates the tourism application payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplicationPayment the tourism application payment
	 * @return the tourism application payment that was updated
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismApplicationPayment updateTourismApplicationPayment(
				com.nbp.tourism.application.form.services.model.
					TourismApplicationPayment tourismApplicationPayment) {

		return _tourismApplicationPaymentLocalService.
			updateTourismApplicationPayment(tourismApplicationPayment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismApplicationPaymentLocalService.getBasePersistence();
	}

	@Override
	public TourismApplicationPaymentLocalService getWrappedService() {
		return _tourismApplicationPaymentLocalService;
	}

	@Override
	public void setWrappedService(
		TourismApplicationPaymentLocalService
			tourismApplicationPaymentLocalService) {

		_tourismApplicationPaymentLocalService =
			tourismApplicationPaymentLocalService;
	}

	private TourismApplicationPaymentLocalService
		_tourismApplicationPaymentLocalService;

}