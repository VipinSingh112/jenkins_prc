/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismApplicationPayment;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for TourismApplicationPayment. This utility wraps
 * <code>com.nbp.tourism.application.form.services.service.impl.TourismApplicationPaymentLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationPaymentLocalService
 * @generated
 */
public class TourismApplicationPaymentLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.tourism.application.form.services.service.impl.TourismApplicationPaymentLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static TourismApplicationPayment addTourismApplicationPayment(
		TourismApplicationPayment tourismApplicationPayment) {

		return getService().addTourismApplicationPayment(
			tourismApplicationPayment);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tourism application payment with the primary key. Does not add the tourism application payment to the database.
	 *
	 * @param TourismApplicationPaymentId the primary key for the new tourism application payment
	 * @return the new tourism application payment
	 */
	public static TourismApplicationPayment createTourismApplicationPayment(
		long TourismApplicationPaymentId) {

		return getService().createTourismApplicationPayment(
			TourismApplicationPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	public static TourismApplicationPayment deleteTourismApplicationPayment(
			long TourismApplicationPaymentId)
		throws PortalException {

		return getService().deleteTourismApplicationPayment(
			TourismApplicationPaymentId);
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
	public static TourismApplicationPayment deleteTourismApplicationPayment(
		TourismApplicationPayment tourismApplicationPayment) {

		return getService().deleteTourismApplicationPayment(
			tourismApplicationPayment);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static TourismApplicationPayment fetchTourismApplicationPayment(
		long TourismApplicationPaymentId) {

		return getService().fetchTourismApplicationPayment(
			TourismApplicationPaymentId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the tourism application payment with the primary key.
	 *
	 * @param TourismApplicationPaymentId the primary key of the tourism application payment
	 * @return the tourism application payment
	 * @throws PortalException if a tourism application payment with the primary key could not be found
	 */
	public static TourismApplicationPayment getTourismApplicationPayment(
			long TourismApplicationPaymentId)
		throws PortalException {

		return getService().getTourismApplicationPayment(
			TourismApplicationPaymentId);
	}

	public static TourismApplicationPayment
			getTourismApplicationPaymentbyTourismApplicationId(
				long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationPaymentException {

		return getService().getTourismApplicationPaymentbyTourismApplicationId(
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
	public static List<TourismApplicationPayment> getTourismApplicationPayments(
		int start, int end) {

		return getService().getTourismApplicationPayments(start, end);
	}

	/**
	 * Returns the number of tourism application payments.
	 *
	 * @return the number of tourism application payments
	 */
	public static int getTourismApplicationPaymentsCount() {
		return getService().getTourismApplicationPaymentsCount();
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
	public static TourismApplicationPayment updateTourismApplicationPayment(
		TourismApplicationPayment tourismApplicationPayment) {

		return getService().updateTourismApplicationPayment(
			tourismApplicationPayment);
	}

	public static TourismApplicationPaymentLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<TourismApplicationPaymentLocalService>
		_serviceSnapshot = new Snapshot<>(
			TourismApplicationPaymentLocalServiceUtil.class,
			TourismApplicationPaymentLocalService.class);

}