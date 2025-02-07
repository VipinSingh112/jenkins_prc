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

import com.nbp.factories.registration.application.form.services.model.FactoriesStandardActInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FactoriesStandardActInfo. This utility wraps
 * <code>com.nbp.factories.registration.application.form.services.service.impl.FactoriesStandardActInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesStandardActInfoLocalService
 * @generated
 */
public class FactoriesStandardActInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.factories.registration.application.form.services.service.impl.FactoriesStandardActInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the factories standard act info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesStandardActInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesStandardActInfo the factories standard act info
	 * @return the factories standard act info that was added
	 */
	public static FactoriesStandardActInfo addFactoriesStandardActInfo(
		FactoriesStandardActInfo factoriesStandardActInfo) {

		return getService().addFactoriesStandardActInfo(
			factoriesStandardActInfo);
	}

	/**
	 * Creates a new factories standard act info with the primary key. Does not add the factories standard act info to the database.
	 *
	 * @param factoriesStandardActId the primary key for the new factories standard act info
	 * @return the new factories standard act info
	 */
	public static FactoriesStandardActInfo createFactoriesStandardActInfo(
		long factoriesStandardActId) {

		return getService().createFactoriesStandardActInfo(
			factoriesStandardActId);
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
	 * Deletes the factories standard act info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesStandardActInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesStandardActInfo the factories standard act info
	 * @return the factories standard act info that was removed
	 */
	public static FactoriesStandardActInfo deleteFactoriesStandardActInfo(
		FactoriesStandardActInfo factoriesStandardActInfo) {

		return getService().deleteFactoriesStandardActInfo(
			factoriesStandardActInfo);
	}

	/**
	 * Deletes the factories standard act info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesStandardActInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesStandardActId the primary key of the factories standard act info
	 * @return the factories standard act info that was removed
	 * @throws PortalException if a factories standard act info with the primary key could not be found
	 */
	public static FactoriesStandardActInfo deleteFactoriesStandardActInfo(
			long factoriesStandardActId)
		throws PortalException {

		return getService().deleteFactoriesStandardActInfo(
			factoriesStandardActId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesStandardActInfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesStandardActInfoModelImpl</code>.
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

	public static FactoriesStandardActInfo fetchFactoriesStandardActInfo(
		long factoriesStandardActId) {

		return getService().fetchFactoriesStandardActInfo(
			factoriesStandardActId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the factories standard act info with the primary key.
	 *
	 * @param factoriesStandardActId the primary key of the factories standard act info
	 * @return the factories standard act info
	 * @throws PortalException if a factories standard act info with the primary key could not be found
	 */
	public static FactoriesStandardActInfo getFactoriesStandardActInfo(
			long factoriesStandardActId)
		throws PortalException {

		return getService().getFactoriesStandardActInfo(factoriesStandardActId);
	}

	/**
	 * Returns a range of all the factories standard act infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesStandardActInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories standard act infos
	 * @param end the upper bound of the range of factories standard act infos (not inclusive)
	 * @return the range of factories standard act infos
	 */
	public static List<FactoriesStandardActInfo> getFactoriesStandardActInfos(
		int start, int end) {

		return getService().getFactoriesStandardActInfos(start, end);
	}

	/**
	 * Returns the number of factories standard act infos.
	 *
	 * @return the number of factories standard act infos
	 */
	public static int getFactoriesStandardActInfosCount() {
		return getService().getFactoriesStandardActInfosCount();
	}

	public static FactoriesStandardActInfo getFactoryStandardActBy_Id(
			long factoriesApplicationId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesStandardActInfoException {

		return getService().getFactoryStandardActBy_Id(factoriesApplicationId);
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
	 * Updates the factories standard act info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesStandardActInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesStandardActInfo the factories standard act info
	 * @return the factories standard act info that was updated
	 */
	public static FactoriesStandardActInfo updateFactoriesStandardActInfo(
		FactoriesStandardActInfo factoriesStandardActInfo) {

		return getService().updateFactoriesStandardActInfo(
			factoriesStandardActInfo);
	}

	public static FactoriesStandardActInfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FactoriesStandardActInfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			FactoriesStandardActInfoLocalServiceUtil.class,
			FactoriesStandardActInfoLocalService.class);

}