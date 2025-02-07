/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.application.form.service.model.WRAAppPayment;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for WRAAppPayment. This utility wraps
 * <code>com.nbp.wra.application.form.service.service.impl.WRAAppPaymentLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see WRAAppPaymentLocalService
 * @generated
 */
public class WRAAppPaymentLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.wra.application.form.service.service.impl.WRAAppPaymentLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the wra app payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraAppPayment the wra app payment
	 * @return the wra app payment that was added
	 */
	public static WRAAppPayment addWRAAppPayment(WRAAppPayment wraAppPayment) {
		return getService().addWRAAppPayment(wraAppPayment);
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
	 * Creates a new wra app payment with the primary key. Does not add the wra app payment to the database.
	 *
	 * @param wraAppPaymentId the primary key for the new wra app payment
	 * @return the new wra app payment
	 */
	public static WRAAppPayment createWRAAppPayment(long wraAppPaymentId) {
		return getService().createWRAAppPayment(wraAppPaymentId);
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
	 * Deletes the wra app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraAppPaymentId the primary key of the wra app payment
	 * @return the wra app payment that was removed
	 * @throws PortalException if a wra app payment with the primary key could not be found
	 */
	public static WRAAppPayment deleteWRAAppPayment(long wraAppPaymentId)
		throws PortalException {

		return getService().deleteWRAAppPayment(wraAppPaymentId);
	}

	/**
	 * Deletes the wra app payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraAppPayment the wra app payment
	 * @return the wra app payment that was removed
	 */
	public static WRAAppPayment deleteWRAAppPayment(
		WRAAppPayment wraAppPayment) {

		return getService().deleteWRAAppPayment(wraAppPayment);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.WRAAppPaymentModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.WRAAppPaymentModelImpl</code>.
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

	public static WRAAppPayment fetchWRAAppPayment(long wraAppPaymentId) {
		return getService().fetchWRAAppPayment(wraAppPaymentId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static WRAAppPayment getgetWRA_By_Id(long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAAppPaymentException {

		return getService().getgetWRA_By_Id(wraApplicationId);
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
	 * Returns the wra app payment with the primary key.
	 *
	 * @param wraAppPaymentId the primary key of the wra app payment
	 * @return the wra app payment
	 * @throws PortalException if a wra app payment with the primary key could not be found
	 */
	public static WRAAppPayment getWRAAppPayment(long wraAppPaymentId)
		throws PortalException {

		return getService().getWRAAppPayment(wraAppPaymentId);
	}

	/**
	 * Returns a range of all the wra app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.WRAAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app payments
	 * @param end the upper bound of the range of wra app payments (not inclusive)
	 * @return the range of wra app payments
	 */
	public static List<WRAAppPayment> getWRAAppPayments(int start, int end) {
		return getService().getWRAAppPayments(start, end);
	}

	/**
	 * Returns the number of wra app payments.
	 *
	 * @return the number of wra app payments
	 */
	public static int getWRAAppPaymentsCount() {
		return getService().getWRAAppPaymentsCount();
	}

	/**
	 * Updates the wra app payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraAppPayment the wra app payment
	 * @return the wra app payment that was updated
	 */
	public static WRAAppPayment updateWRAAppPayment(
		WRAAppPayment wraAppPayment) {

		return getService().updateWRAAppPayment(wraAppPayment);
	}

	public static WRAAppPaymentLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<WRAAppPaymentLocalService> _serviceSnapshot =
		new Snapshot<>(
			WRAAppPaymentLocalServiceUtil.class,
			WRAAppPaymentLocalService.class);

}