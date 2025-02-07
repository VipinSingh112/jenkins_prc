/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.agriculture.application.form.service.model.AgricultureLivestock;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AgricultureLivestock. This utility wraps
 * <code>com.agriculture.application.form.service.service.impl.AgricultureLivestockLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureLivestockLocalService
 * @generated
 */
public class AgricultureLivestockLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.agriculture.application.form.service.service.impl.AgricultureLivestockLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the agriculture livestock to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureLivestockLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureLivestock the agriculture livestock
	 * @return the agriculture livestock that was added
	 */
	public static AgricultureLivestock addAgricultureLivestock(
		AgricultureLivestock agricultureLivestock) {

		return getService().addAgricultureLivestock(agricultureLivestock);
	}

	/**
	 * Creates a new agriculture livestock with the primary key. Does not add the agriculture livestock to the database.
	 *
	 * @param agricultureLivestockId the primary key for the new agriculture livestock
	 * @return the new agriculture livestock
	 */
	public static AgricultureLivestock createAgricultureLivestock(
		long agricultureLivestockId) {

		return getService().createAgricultureLivestock(agricultureLivestockId);
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
	 * Deletes the agriculture livestock from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureLivestockLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureLivestock the agriculture livestock
	 * @return the agriculture livestock that was removed
	 */
	public static AgricultureLivestock deleteAgricultureLivestock(
		AgricultureLivestock agricultureLivestock) {

		return getService().deleteAgricultureLivestock(agricultureLivestock);
	}

	/**
	 * Deletes the agriculture livestock with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureLivestockLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureLivestockId the primary key of the agriculture livestock
	 * @return the agriculture livestock that was removed
	 * @throws PortalException if a agriculture livestock with the primary key could not be found
	 */
	public static AgricultureLivestock deleteAgricultureLivestock(
			long agricultureLivestockId)
		throws PortalException {

		return getService().deleteAgricultureLivestock(agricultureLivestockId);
	}

	public static void deleteAgriLivestockById(long applicationId) {
		getService().deleteAgriLivestockById(applicationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureLivestockModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureLivestockModelImpl</code>.
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

	public static AgricultureLivestock fetchAgricultureLivestock(
		long agricultureLivestockId) {

		return getService().fetchAgricultureLivestock(agricultureLivestockId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static AgricultureLivestock getAgricultureById(long ApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureLivestockException {

		return getService().getAgricultureById(ApplicationId);
	}

	/**
	 * Returns the agriculture livestock with the primary key.
	 *
	 * @param agricultureLivestockId the primary key of the agriculture livestock
	 * @return the agriculture livestock
	 * @throws PortalException if a agriculture livestock with the primary key could not be found
	 */
	public static AgricultureLivestock getAgricultureLivestock(
			long agricultureLivestockId)
		throws PortalException {

		return getService().getAgricultureLivestock(agricultureLivestockId);
	}

	/**
	 * Returns a range of all the agriculture livestocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture livestocks
	 * @param end the upper bound of the range of agriculture livestocks (not inclusive)
	 * @return the range of agriculture livestocks
	 */
	public static List<AgricultureLivestock> getAgricultureLivestocks(
		int start, int end) {

		return getService().getAgricultureLivestocks(start, end);
	}

	/**
	 * Returns the number of agriculture livestocks.
	 *
	 * @return the number of agriculture livestocks
	 */
	public static int getAgricultureLivestocksCount() {
		return getService().getAgricultureLivestocksCount();
	}

	public static List<AgricultureLivestock> getAL_by_AAI(
		long agricultureApplicationId) {

		return getService().getAL_by_AAI(agricultureApplicationId);
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
	 * Updates the agriculture livestock in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureLivestockLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureLivestock the agriculture livestock
	 * @return the agriculture livestock that was updated
	 */
	public static AgricultureLivestock updateAgricultureLivestock(
		AgricultureLivestock agricultureLivestock) {

		return getService().updateAgricultureLivestock(agricultureLivestock);
	}

	public static AgricultureLivestockLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AgricultureLivestockLocalService>
		_serviceSnapshot = new Snapshot<>(
			AgricultureLivestockLocalServiceUtil.class,
			AgricultureLivestockLocalService.class);

}