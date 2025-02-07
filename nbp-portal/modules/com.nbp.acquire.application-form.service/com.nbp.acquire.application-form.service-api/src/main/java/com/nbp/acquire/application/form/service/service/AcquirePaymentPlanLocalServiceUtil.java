/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.application.form.service.model.AcquirePaymentPlan;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AcquirePaymentPlan. This utility wraps
 * <code>com.nbp.acquire.application.form.service.service.impl.AcquirePaymentPlanLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePaymentPlanLocalService
 * @generated
 */
public class AcquirePaymentPlanLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.acquire.application.form.service.service.impl.AcquirePaymentPlanLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acquire payment plan to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquirePaymentPlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquirePaymentPlan the acquire payment plan
	 * @return the acquire payment plan that was added
	 */
	public static AcquirePaymentPlan addAcquirePaymentPlan(
		AcquirePaymentPlan acquirePaymentPlan) {

		return getService().addAcquirePaymentPlan(acquirePaymentPlan);
	}

	/**
	 * Creates a new acquire payment plan with the primary key. Does not add the acquire payment plan to the database.
	 *
	 * @param acquirePaymentPlanId the primary key for the new acquire payment plan
	 * @return the new acquire payment plan
	 */
	public static AcquirePaymentPlan createAcquirePaymentPlan(
		long acquirePaymentPlanId) {

		return getService().createAcquirePaymentPlan(acquirePaymentPlanId);
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
	 * Deletes the acquire payment plan from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquirePaymentPlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquirePaymentPlan the acquire payment plan
	 * @return the acquire payment plan that was removed
	 */
	public static AcquirePaymentPlan deleteAcquirePaymentPlan(
		AcquirePaymentPlan acquirePaymentPlan) {

		return getService().deleteAcquirePaymentPlan(acquirePaymentPlan);
	}

	/**
	 * Deletes the acquire payment plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquirePaymentPlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquirePaymentPlanId the primary key of the acquire payment plan
	 * @return the acquire payment plan that was removed
	 * @throws PortalException if a acquire payment plan with the primary key could not be found
	 */
	public static AcquirePaymentPlan deleteAcquirePaymentPlan(
			long acquirePaymentPlanId)
		throws PortalException {

		return getService().deleteAcquirePaymentPlan(acquirePaymentPlanId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquirePaymentPlanModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquirePaymentPlanModelImpl</code>.
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

	public static AcquirePaymentPlan fetchAcquirePaymentPlan(
		long acquirePaymentPlanId) {

		return getService().fetchAcquirePaymentPlan(acquirePaymentPlanId);
	}

	/**
	 * Returns the acquire payment plan with the primary key.
	 *
	 * @param acquirePaymentPlanId the primary key of the acquire payment plan
	 * @return the acquire payment plan
	 * @throws PortalException if a acquire payment plan with the primary key could not be found
	 */
	public static AcquirePaymentPlan getAcquirePaymentPlan(
			long acquirePaymentPlanId)
		throws PortalException {

		return getService().getAcquirePaymentPlan(acquirePaymentPlanId);
	}

	public static AcquirePaymentPlan getAcquirePaymentPlanById(
			long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquirePropertyDetailsException {

		return getService().getAcquirePaymentPlanById(acquireApplicationId);
	}

	/**
	 * Returns a range of all the acquire payment plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquirePaymentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire payment plans
	 * @param end the upper bound of the range of acquire payment plans (not inclusive)
	 * @return the range of acquire payment plans
	 */
	public static List<AcquirePaymentPlan> getAcquirePaymentPlans(
		int start, int end) {

		return getService().getAcquirePaymentPlans(start, end);
	}

	/**
	 * Returns the number of acquire payment plans.
	 *
	 * @return the number of acquire payment plans
	 */
	public static int getAcquirePaymentPlansCount() {
		return getService().getAcquirePaymentPlansCount();
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
	 * Updates the acquire payment plan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquirePaymentPlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquirePaymentPlan the acquire payment plan
	 * @return the acquire payment plan that was updated
	 */
	public static AcquirePaymentPlan updateAcquirePaymentPlan(
		AcquirePaymentPlan acquirePaymentPlan) {

		return getService().updateAcquirePaymentPlan(acquirePaymentPlan);
	}

	public static AcquirePaymentPlanLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AcquirePaymentPlanLocalService>
		_serviceSnapshot = new Snapshot<>(
			AcquirePaymentPlanLocalServiceUtil.class,
			AcquirePaymentPlanLocalService.class);

}