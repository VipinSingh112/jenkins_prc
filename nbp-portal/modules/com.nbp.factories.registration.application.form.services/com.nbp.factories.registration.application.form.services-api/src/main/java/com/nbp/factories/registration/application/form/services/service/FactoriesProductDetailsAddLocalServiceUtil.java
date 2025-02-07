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

import com.nbp.factories.registration.application.form.services.model.FactoriesProductDetailsAdd;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FactoriesProductDetailsAdd. This utility wraps
 * <code>com.nbp.factories.registration.application.form.services.service.impl.FactoriesProductDetailsAddLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesProductDetailsAddLocalService
 * @generated
 */
public class FactoriesProductDetailsAddLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.factories.registration.application.form.services.service.impl.FactoriesProductDetailsAddLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the factories product details add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesProductDetailsAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesProductDetailsAdd the factories product details add
	 * @return the factories product details add that was added
	 */
	public static FactoriesProductDetailsAdd addFactoriesProductDetailsAdd(
		FactoriesProductDetailsAdd factoriesProductDetailsAdd) {

		return getService().addFactoriesProductDetailsAdd(
			factoriesProductDetailsAdd);
	}

	/**
	 * Creates a new factories product details add with the primary key. Does not add the factories product details add to the database.
	 *
	 * @param factoriesProductDetailsAddId the primary key for the new factories product details add
	 * @return the new factories product details add
	 */
	public static FactoriesProductDetailsAdd createFactoriesProductDetailsAdd(
		long factoriesProductDetailsAddId) {

		return getService().createFactoriesProductDetailsAdd(
			factoriesProductDetailsAddId);
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
	 * Deletes the factories product details add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesProductDetailsAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesProductDetailsAdd the factories product details add
	 * @return the factories product details add that was removed
	 */
	public static FactoriesProductDetailsAdd deleteFactoriesProductDetailsAdd(
		FactoriesProductDetailsAdd factoriesProductDetailsAdd) {

		return getService().deleteFactoriesProductDetailsAdd(
			factoriesProductDetailsAdd);
	}

	/**
	 * Deletes the factories product details add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesProductDetailsAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesProductDetailsAddId the primary key of the factories product details add
	 * @return the factories product details add that was removed
	 * @throws PortalException if a factories product details add with the primary key could not be found
	 */
	public static FactoriesProductDetailsAdd deleteFactoriesProductDetailsAdd(
			long factoriesProductDetailsAddId)
		throws PortalException {

		return getService().deleteFactoriesProductDetailsAdd(
			factoriesProductDetailsAddId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesProductDetailsAddModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesProductDetailsAddModelImpl</code>.
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

	public static FactoriesProductDetailsAdd fetchFactoriesProductDetailsAdd(
		long factoriesProductDetailsAddId) {

		return getService().fetchFactoriesProductDetailsAdd(
			factoriesProductDetailsAddId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<FactoriesProductDetailsAdd> getFactoriesById(
		long factoriesApplicationId) {

		return getService().getFactoriesById(factoriesApplicationId);
	}

	/**
	 * Returns the factories product details add with the primary key.
	 *
	 * @param factoriesProductDetailsAddId the primary key of the factories product details add
	 * @return the factories product details add
	 * @throws PortalException if a factories product details add with the primary key could not be found
	 */
	public static FactoriesProductDetailsAdd getFactoriesProductDetailsAdd(
			long factoriesProductDetailsAddId)
		throws PortalException {

		return getService().getFactoriesProductDetailsAdd(
			factoriesProductDetailsAddId);
	}

	/**
	 * Returns a range of all the factories product details adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesProductDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories product details adds
	 * @param end the upper bound of the range of factories product details adds (not inclusive)
	 * @return the range of factories product details adds
	 */
	public static List<FactoriesProductDetailsAdd>
		getFactoriesProductDetailsAdds(int start, int end) {

		return getService().getFactoriesProductDetailsAdds(start, end);
	}

	/**
	 * Returns the number of factories product details adds.
	 *
	 * @return the number of factories product details adds
	 */
	public static int getFactoriesProductDetailsAddsCount() {
		return getService().getFactoriesProductDetailsAddsCount();
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
	 * Updates the factories product details add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesProductDetailsAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesProductDetailsAdd the factories product details add
	 * @return the factories product details add that was updated
	 */
	public static FactoriesProductDetailsAdd updateFactoriesProductDetailsAdd(
		FactoriesProductDetailsAdd factoriesProductDetailsAdd) {

		return getService().updateFactoriesProductDetailsAdd(
			factoriesProductDetailsAdd);
	}

	public static FactoriesProductDetailsAddLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FactoriesProductDetailsAddLocalService>
		_serviceSnapshot = new Snapshot<>(
			FactoriesProductDetailsAddLocalServiceUtil.class,
			FactoriesProductDetailsAddLocalService.class);

}