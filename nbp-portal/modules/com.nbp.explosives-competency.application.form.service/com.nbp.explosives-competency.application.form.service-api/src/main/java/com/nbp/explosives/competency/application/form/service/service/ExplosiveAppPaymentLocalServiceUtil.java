/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.explosives.competency.application.form.service.model.ExplosiveAppPayment;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ExplosiveAppPayment. This utility wraps
 * <code>com.nbp.explosives.competency.application.form.service.service.impl.ExplosiveAppPaymentLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveAppPaymentLocalService
 * @generated
 */
public class ExplosiveAppPaymentLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.explosives.competency.application.form.service.service.impl.ExplosiveAppPaymentLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the explosive app payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveAppPayment the explosive app payment
	 * @return the explosive app payment that was added
	 */
	public static ExplosiveAppPayment addExplosiveAppPayment(
		ExplosiveAppPayment explosiveAppPayment) {

		return getService().addExplosiveAppPayment(explosiveAppPayment);
	}

	/**
	 * Creates a new explosive app payment with the primary key. Does not add the explosive app payment to the database.
	 *
	 * @param explosiveAppPaymentId the primary key for the new explosive app payment
	 * @return the new explosive app payment
	 */
	public static ExplosiveAppPayment createExplosiveAppPayment(
		long explosiveAppPaymentId) {

		return getService().createExplosiveAppPayment(explosiveAppPaymentId);
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
	 * Deletes the explosive app payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveAppPayment the explosive app payment
	 * @return the explosive app payment that was removed
	 */
	public static ExplosiveAppPayment deleteExplosiveAppPayment(
		ExplosiveAppPayment explosiveAppPayment) {

		return getService().deleteExplosiveAppPayment(explosiveAppPayment);
	}

	/**
	 * Deletes the explosive app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveAppPaymentId the primary key of the explosive app payment
	 * @return the explosive app payment that was removed
	 * @throws PortalException if a explosive app payment with the primary key could not be found
	 */
	public static ExplosiveAppPayment deleteExplosiveAppPayment(
			long explosiveAppPaymentId)
		throws PortalException {

		return getService().deleteExplosiveAppPayment(explosiveAppPaymentId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosiveAppPaymentModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosiveAppPaymentModelImpl</code>.
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

	public static ExplosiveAppPayment fetchExplosiveAppPayment(
		long explosiveAppPaymentId) {

		return getService().fetchExplosiveAppPayment(explosiveAppPaymentId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the explosive app payment with the primary key.
	 *
	 * @param explosiveAppPaymentId the primary key of the explosive app payment
	 * @return the explosive app payment
	 * @throws PortalException if a explosive app payment with the primary key could not be found
	 */
	public static ExplosiveAppPayment getExplosiveAppPayment(
			long explosiveAppPaymentId)
		throws PortalException {

		return getService().getExplosiveAppPayment(explosiveAppPaymentId);
	}

	/**
	 * Returns a range of all the explosive app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosiveAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive app payments
	 * @param end the upper bound of the range of explosive app payments (not inclusive)
	 * @return the range of explosive app payments
	 */
	public static List<ExplosiveAppPayment> getExplosiveAppPayments(
		int start, int end) {

		return getService().getExplosiveAppPayments(start, end);
	}

	/**
	 * Returns the number of explosive app payments.
	 *
	 * @return the number of explosive app payments
	 */
	public static int getExplosiveAppPaymentsCount() {
		return getService().getExplosiveAppPaymentsCount();
	}

	public static ExplosiveAppPayment getExplosiveById(
			long explosivesApplicationId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosiveAppPaymentException {

		return getService().getExplosiveById(explosivesApplicationId);
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
	 * Updates the explosive app payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveAppPayment the explosive app payment
	 * @return the explosive app payment that was updated
	 */
	public static ExplosiveAppPayment updateExplosiveAppPayment(
		ExplosiveAppPayment explosiveAppPayment) {

		return getService().updateExplosiveAppPayment(explosiveAppPayment);
	}

	public static ExplosiveAppPaymentLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ExplosiveAppPaymentLocalService>
		_serviceSnapshot = new Snapshot<>(
			ExplosiveAppPaymentLocalServiceUtil.class,
			ExplosiveAppPaymentLocalService.class);

}