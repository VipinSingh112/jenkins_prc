/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.factories.registration.application.form.services.model.FactoriesAppPayment;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FactoriesAppPayment. This utility wraps
 * <code>com.nbp.factories.registration.application.form.services.service.impl.FactoriesAppPaymentLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesAppPaymentLocalService
 * @generated
 */
public class FactoriesAppPaymentLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.factories.registration.application.form.services.service.impl.FactoriesAppPaymentLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the factories app payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesAppPayment the factories app payment
	 * @return the factories app payment that was added
	 */
	public static FactoriesAppPayment addFactoriesAppPayment(
		FactoriesAppPayment factoriesAppPayment) {

		return getService().addFactoriesAppPayment(factoriesAppPayment);
	}

	/**
	 * Creates a new factories app payment with the primary key. Does not add the factories app payment to the database.
	 *
	 * @param factoriesAppPaymentId the primary key for the new factories app payment
	 * @return the new factories app payment
	 */
	public static FactoriesAppPayment createFactoriesAppPayment(
		long factoriesAppPaymentId) {

		return getService().createFactoriesAppPayment(factoriesAppPaymentId);
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
	 * Deletes the factories app payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesAppPayment the factories app payment
	 * @return the factories app payment that was removed
	 */
	public static FactoriesAppPayment deleteFactoriesAppPayment(
		FactoriesAppPayment factoriesAppPayment) {

		return getService().deleteFactoriesAppPayment(factoriesAppPayment);
	}

	/**
	 * Deletes the factories app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesAppPaymentId the primary key of the factories app payment
	 * @return the factories app payment that was removed
	 * @throws PortalException if a factories app payment with the primary key could not be found
	 */
	public static FactoriesAppPayment deleteFactoriesAppPayment(
			long factoriesAppPaymentId)
		throws PortalException {

		return getService().deleteFactoriesAppPayment(factoriesAppPaymentId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesAppPaymentModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesAppPaymentModelImpl</code>.
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

	public static FactoriesAppPayment fetchFactoriesAppPayment(
		long factoriesAppPaymentId) {

		return getService().fetchFactoriesAppPayment(factoriesAppPaymentId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the factories app payment with the primary key.
	 *
	 * @param factoriesAppPaymentId the primary key of the factories app payment
	 * @return the factories app payment
	 * @throws PortalException if a factories app payment with the primary key could not be found
	 */
	public static FactoriesAppPayment getFactoriesAppPayment(
			long factoriesAppPaymentId)
		throws PortalException {

		return getService().getFactoriesAppPayment(factoriesAppPaymentId);
	}

	/**
	 * Returns a range of all the factories app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories app payments
	 * @param end the upper bound of the range of factories app payments (not inclusive)
	 * @return the range of factories app payments
	 */
	public static List<FactoriesAppPayment> getFactoriesAppPayments(
		int start, int end) {

		return getService().getFactoriesAppPayments(start, end);
	}

	/**
	 * Returns the number of factories app payments.
	 *
	 * @return the number of factories app payments
	 */
	public static int getFactoriesAppPaymentsCount() {
		return getService().getFactoriesAppPaymentsCount();
	}

	public static FactoriesAppPayment getFactoriesRegistrationById(
			long factoriesApplicationId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesAppPaymentException {

		return getService().getFactoriesRegistrationById(
			factoriesApplicationId);
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
	 * Updates the factories app payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesAppPayment the factories app payment
	 * @return the factories app payment that was updated
	 */
	public static FactoriesAppPayment updateFactoriesAppPayment(
		FactoriesAppPayment factoriesAppPayment) {

		return getService().updateFactoriesAppPayment(factoriesAppPayment);
	}

	public static FactoriesAppPaymentLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FactoriesAppPaymentLocalService>
		_serviceSnapshot = new Snapshot<>(
			FactoriesAppPaymentLocalServiceUtil.class,
			FactoriesAppPaymentLocalService.class);

}