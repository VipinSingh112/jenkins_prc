/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezDevPropDevelopmentPlan;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for SezDevPropDevelopmentPlan. This utility wraps
 * <code>com.nbp.sez.status.application.form.service.service.impl.SezDevPropDevelopmentPlanLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevPropDevelopmentPlanLocalService
 * @generated
 */
public class SezDevPropDevelopmentPlanLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.sez.status.application.form.service.service.impl.SezDevPropDevelopmentPlanLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the sez dev prop development plan to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevPropDevelopmentPlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevPropDevelopmentPlan the sez dev prop development plan
	 * @return the sez dev prop development plan that was added
	 */
	public static SezDevPropDevelopmentPlan addSezDevPropDevelopmentPlan(
		SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan) {

		return getService().addSezDevPropDevelopmentPlan(
			sezDevPropDevelopmentPlan);
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
	 * Creates a new sez dev prop development plan with the primary key. Does not add the sez dev prop development plan to the database.
	 *
	 * @param sezDevPropDevelopmentPlanId the primary key for the new sez dev prop development plan
	 * @return the new sez dev prop development plan
	 */
	public static SezDevPropDevelopmentPlan createSezDevPropDevelopmentPlan(
		long sezDevPropDevelopmentPlanId) {

		return getService().createSezDevPropDevelopmentPlan(
			sezDevPropDevelopmentPlanId);
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
	 * Deletes the sez dev prop development plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevPropDevelopmentPlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevPropDevelopmentPlanId the primary key of the sez dev prop development plan
	 * @return the sez dev prop development plan that was removed
	 * @throws PortalException if a sez dev prop development plan with the primary key could not be found
	 */
	public static SezDevPropDevelopmentPlan deleteSezDevPropDevelopmentPlan(
			long sezDevPropDevelopmentPlanId)
		throws PortalException {

		return getService().deleteSezDevPropDevelopmentPlan(
			sezDevPropDevelopmentPlanId);
	}

	/**
	 * Deletes the sez dev prop development plan from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevPropDevelopmentPlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevPropDevelopmentPlan the sez dev prop development plan
	 * @return the sez dev prop development plan that was removed
	 */
	public static SezDevPropDevelopmentPlan deleteSezDevPropDevelopmentPlan(
		SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan) {

		return getService().deleteSezDevPropDevelopmentPlan(
			sezDevPropDevelopmentPlan);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevPropDevelopmentPlanModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevPropDevelopmentPlanModelImpl</code>.
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

	public static SezDevPropDevelopmentPlan fetchSezDevPropDevelopmentPlan(
		long sezDevPropDevelopmentPlanId) {

		return getService().fetchSezDevPropDevelopmentPlan(
			sezDevPropDevelopmentPlanId);
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

	public static SezDevPropDevelopmentPlan getSezById(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevPropDevelopmentPlanException {

		return getService().getSezById(sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev prop development plan with the primary key.
	 *
	 * @param sezDevPropDevelopmentPlanId the primary key of the sez dev prop development plan
	 * @return the sez dev prop development plan
	 * @throws PortalException if a sez dev prop development plan with the primary key could not be found
	 */
	public static SezDevPropDevelopmentPlan getSezDevPropDevelopmentPlan(
			long sezDevPropDevelopmentPlanId)
		throws PortalException {

		return getService().getSezDevPropDevelopmentPlan(
			sezDevPropDevelopmentPlanId);
	}

	/**
	 * Returns a range of all the sez dev prop development plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevPropDevelopmentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev prop development plans
	 * @param end the upper bound of the range of sez dev prop development plans (not inclusive)
	 * @return the range of sez dev prop development plans
	 */
	public static List<SezDevPropDevelopmentPlan> getSezDevPropDevelopmentPlans(
		int start, int end) {

		return getService().getSezDevPropDevelopmentPlans(start, end);
	}

	/**
	 * Returns the number of sez dev prop development plans.
	 *
	 * @return the number of sez dev prop development plans
	 */
	public static int getSezDevPropDevelopmentPlansCount() {
		return getService().getSezDevPropDevelopmentPlansCount();
	}

	/**
	 * Updates the sez dev prop development plan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevPropDevelopmentPlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevPropDevelopmentPlan the sez dev prop development plan
	 * @return the sez dev prop development plan that was updated
	 */
	public static SezDevPropDevelopmentPlan updateSezDevPropDevelopmentPlan(
		SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan) {

		return getService().updateSezDevPropDevelopmentPlan(
			sezDevPropDevelopmentPlan);
	}

	public static SezDevPropDevelopmentPlanLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<SezDevPropDevelopmentPlanLocalService>
		_serviceSnapshot = new Snapshot<>(
			SezDevPropDevelopmentPlanLocalServiceUtil.class,
			SezDevPropDevelopmentPlanLocalService.class);

}