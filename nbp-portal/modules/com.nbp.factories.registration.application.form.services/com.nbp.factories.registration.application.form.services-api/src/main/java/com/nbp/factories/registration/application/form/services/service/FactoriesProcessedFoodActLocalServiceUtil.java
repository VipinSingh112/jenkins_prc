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

import com.nbp.factories.registration.application.form.services.model.FactoriesProcessedFoodAct;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FactoriesProcessedFoodAct. This utility wraps
 * <code>com.nbp.factories.registration.application.form.services.service.impl.FactoriesProcessedFoodActLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesProcessedFoodActLocalService
 * @generated
 */
public class FactoriesProcessedFoodActLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.factories.registration.application.form.services.service.impl.FactoriesProcessedFoodActLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the factories processed food act to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesProcessedFoodActLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesProcessedFoodAct the factories processed food act
	 * @return the factories processed food act that was added
	 */
	public static FactoriesProcessedFoodAct addFactoriesProcessedFoodAct(
		FactoriesProcessedFoodAct factoriesProcessedFoodAct) {

		return getService().addFactoriesProcessedFoodAct(
			factoriesProcessedFoodAct);
	}

	/**
	 * Creates a new factories processed food act with the primary key. Does not add the factories processed food act to the database.
	 *
	 * @param factoriesProcessedFoodActId the primary key for the new factories processed food act
	 * @return the new factories processed food act
	 */
	public static FactoriesProcessedFoodAct createFactoriesProcessedFoodAct(
		long factoriesProcessedFoodActId) {

		return getService().createFactoriesProcessedFoodAct(
			factoriesProcessedFoodActId);
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
	 * Deletes the factories processed food act from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesProcessedFoodActLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesProcessedFoodAct the factories processed food act
	 * @return the factories processed food act that was removed
	 */
	public static FactoriesProcessedFoodAct deleteFactoriesProcessedFoodAct(
		FactoriesProcessedFoodAct factoriesProcessedFoodAct) {

		return getService().deleteFactoriesProcessedFoodAct(
			factoriesProcessedFoodAct);
	}

	/**
	 * Deletes the factories processed food act with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesProcessedFoodActLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesProcessedFoodActId the primary key of the factories processed food act
	 * @return the factories processed food act that was removed
	 * @throws PortalException if a factories processed food act with the primary key could not be found
	 */
	public static FactoriesProcessedFoodAct deleteFactoriesProcessedFoodAct(
			long factoriesProcessedFoodActId)
		throws PortalException {

		return getService().deleteFactoriesProcessedFoodAct(
			factoriesProcessedFoodActId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesProcessedFoodActModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesProcessedFoodActModelImpl</code>.
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

	public static FactoriesProcessedFoodAct fetchFactoriesProcessedFoodAct(
		long factoriesProcessedFoodActId) {

		return getService().fetchFactoriesProcessedFoodAct(
			factoriesProcessedFoodActId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static FactoriesProcessedFoodAct getFactoriesById(long applicationId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesProcessedFoodActException {

		return getService().getFactoriesById(applicationId);
	}

	/**
	 * Returns the factories processed food act with the primary key.
	 *
	 * @param factoriesProcessedFoodActId the primary key of the factories processed food act
	 * @return the factories processed food act
	 * @throws PortalException if a factories processed food act with the primary key could not be found
	 */
	public static FactoriesProcessedFoodAct getFactoriesProcessedFoodAct(
			long factoriesProcessedFoodActId)
		throws PortalException {

		return getService().getFactoriesProcessedFoodAct(
			factoriesProcessedFoodActId);
	}

	/**
	 * Returns a range of all the factories processed food acts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesProcessedFoodActModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories processed food acts
	 * @param end the upper bound of the range of factories processed food acts (not inclusive)
	 * @return the range of factories processed food acts
	 */
	public static List<FactoriesProcessedFoodAct> getFactoriesProcessedFoodActs(
		int start, int end) {

		return getService().getFactoriesProcessedFoodActs(start, end);
	}

	/**
	 * Returns the number of factories processed food acts.
	 *
	 * @return the number of factories processed food acts
	 */
	public static int getFactoriesProcessedFoodActsCount() {
		return getService().getFactoriesProcessedFoodActsCount();
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
	 * Updates the factories processed food act in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesProcessedFoodActLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesProcessedFoodAct the factories processed food act
	 * @return the factories processed food act that was updated
	 */
	public static FactoriesProcessedFoodAct updateFactoriesProcessedFoodAct(
		FactoriesProcessedFoodAct factoriesProcessedFoodAct) {

		return getService().updateFactoriesProcessedFoodAct(
			factoriesProcessedFoodAct);
	}

	public static FactoriesProcessedFoodActLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FactoriesProcessedFoodActLocalService>
		_serviceSnapshot = new Snapshot<>(
			FactoriesProcessedFoodActLocalServiceUtil.class,
			FactoriesProcessedFoodActLocalService.class);

}