/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.CannabisApplicationPayment;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CannabisApplicationPayment. This utility wraps
 * <code>com.nbp.cannabis.application.form.services.service.impl.CannabisApplicationPaymentLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationPaymentLocalService
 * @generated
 */
public class CannabisApplicationPaymentLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.cannabis.application.form.services.service.impl.CannabisApplicationPaymentLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the cannabis application payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationPayment the cannabis application payment
	 * @return the cannabis application payment that was added
	 */
	public static CannabisApplicationPayment addCannabisApplicationPayment(
		CannabisApplicationPayment cannabisApplicationPayment) {

		return getService().addCannabisApplicationPayment(
			cannabisApplicationPayment);
	}

	/**
	 * Creates a new cannabis application payment with the primary key. Does not add the cannabis application payment to the database.
	 *
	 * @param cannabisApplicationPaymentId the primary key for the new cannabis application payment
	 * @return the new cannabis application payment
	 */
	public static CannabisApplicationPayment createCannabisApplicationPayment(
		long cannabisApplicationPaymentId) {

		return getService().createCannabisApplicationPayment(
			cannabisApplicationPaymentId);
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
	 * Deletes the cannabis application payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationPayment the cannabis application payment
	 * @return the cannabis application payment that was removed
	 */
	public static CannabisApplicationPayment deleteCannabisApplicationPayment(
		CannabisApplicationPayment cannabisApplicationPayment) {

		return getService().deleteCannabisApplicationPayment(
			cannabisApplicationPayment);
	}

	/**
	 * Deletes the cannabis application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationPaymentId the primary key of the cannabis application payment
	 * @return the cannabis application payment that was removed
	 * @throws PortalException if a cannabis application payment with the primary key could not be found
	 */
	public static CannabisApplicationPayment deleteCannabisApplicationPayment(
			long cannabisApplicationPaymentId)
		throws PortalException {

		return getService().deleteCannabisApplicationPayment(
			cannabisApplicationPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationPaymentModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationPaymentModelImpl</code>.
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

	public static CannabisApplicationPayment fetchCannabisApplicationPayment(
		long cannabisApplicationPaymentId) {

		return getService().fetchCannabisApplicationPayment(
			cannabisApplicationPaymentId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the cannabis application payment with the primary key.
	 *
	 * @param cannabisApplicationPaymentId the primary key of the cannabis application payment
	 * @return the cannabis application payment
	 * @throws PortalException if a cannabis application payment with the primary key could not be found
	 */
	public static CannabisApplicationPayment getCannabisApplicationPayment(
			long cannabisApplicationPaymentId)
		throws PortalException {

		return getService().getCannabisApplicationPayment(
			cannabisApplicationPaymentId);
	}

	public static CannabisApplicationPayment
			getCannabisApplicationPaymentByCannabisAppId(
				long cannabisApplicationId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationPaymentException {

		return getService().getCannabisApplicationPaymentByCannabisAppId(
			cannabisApplicationId);
	}

	/**
	 * Returns a range of all the cannabis application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application payments
	 * @param end the upper bound of the range of cannabis application payments (not inclusive)
	 * @return the range of cannabis application payments
	 */
	public static List<CannabisApplicationPayment>
		getCannabisApplicationPayments(int start, int end) {

		return getService().getCannabisApplicationPayments(start, end);
	}

	/**
	 * Returns the number of cannabis application payments.
	 *
	 * @return the number of cannabis application payments
	 */
	public static int getCannabisApplicationPaymentsCount() {
		return getService().getCannabisApplicationPaymentsCount();
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
	 * Updates the cannabis application payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationPayment the cannabis application payment
	 * @return the cannabis application payment that was updated
	 */
	public static CannabisApplicationPayment updateCannabisApplicationPayment(
		CannabisApplicationPayment cannabisApplicationPayment) {

		return getService().updateCannabisApplicationPayment(
			cannabisApplicationPayment);
	}

	public static CannabisApplicationPaymentLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CannabisApplicationPaymentLocalService>
		_serviceSnapshot = new Snapshot<>(
			CannabisApplicationPaymentLocalServiceUtil.class,
			CannabisApplicationPaymentLocalService.class);

}