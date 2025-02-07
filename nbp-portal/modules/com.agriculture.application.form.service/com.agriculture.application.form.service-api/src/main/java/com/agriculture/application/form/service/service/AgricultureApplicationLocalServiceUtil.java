/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.agriculture.application.form.service.model.AgricultureApplication;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AgricultureApplication. This utility wraps
 * <code>com.agriculture.application.form.service.service.impl.AgricultureApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApplicationLocalService
 * @generated
 */
public class AgricultureApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.agriculture.application.form.service.service.impl.AgricultureApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the agriculture application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureApplication the agriculture application
	 * @return the agriculture application that was added
	 */
	public static AgricultureApplication addAgricultureApplication(
		AgricultureApplication agricultureApplication) {

		return getService().addAgricultureApplication(agricultureApplication);
	}

	/**
	 * Creates a new agriculture application with the primary key. Does not add the agriculture application to the database.
	 *
	 * @param agricultureApplicationId the primary key for the new agriculture application
	 * @return the new agriculture application
	 */
	public static AgricultureApplication createAgricultureApplication(
		long agricultureApplicationId) {

		return getService().createAgricultureApplication(
			agricultureApplicationId);
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
	 * Deletes the agriculture application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureApplication the agriculture application
	 * @return the agriculture application that was removed
	 */
	public static AgricultureApplication deleteAgricultureApplication(
		AgricultureApplication agricultureApplication) {

		return getService().deleteAgricultureApplication(
			agricultureApplication);
	}

	/**
	 * Deletes the agriculture application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureApplicationId the primary key of the agriculture application
	 * @return the agriculture application that was removed
	 * @throws PortalException if a agriculture application with the primary key could not be found
	 */
	public static AgricultureApplication deleteAgricultureApplication(
			long agricultureApplicationId)
		throws PortalException {

		return getService().deleteAgricultureApplication(
			agricultureApplicationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureApplicationModelImpl</code>.
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

	public static AgricultureApplication fetchAgricultureApplication(
		long agricultureApplicationId) {

		return getService().fetchAgricultureApplication(
			agricultureApplicationId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the agriculture application with the primary key.
	 *
	 * @param agricultureApplicationId the primary key of the agriculture application
	 * @return the agriculture application
	 * @throws PortalException if a agriculture application with the primary key could not be found
	 */
	public static AgricultureApplication getAgricultureApplication(
			long agricultureApplicationId)
		throws PortalException {

		return getService().getAgricultureApplication(agricultureApplicationId);
	}

	public static List<AgricultureApplication> getAgricultureApplicationByS_U(
		long userId, int status) {

		return getService().getAgricultureApplicationByS_U(userId, status);
	}

	/**
	 * Returns a range of all the agriculture applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @return the range of agriculture applications
	 */
	public static List<AgricultureApplication> getAgricultureApplications(
		int start, int end) {

		return getService().getAgricultureApplications(start, end);
	}

	/**
	 * Returns the number of agriculture applications.
	 *
	 * @return the number of agriculture applications
	 */
	public static int getAgricultureApplicationsCount() {
		return getService().getAgricultureApplicationsCount();
	}

	public static AgricultureApplication getAgricultureBy_CI(String caseId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return getService().getAgricultureBy_CI(caseId);
	}

	public static AgricultureApplication getAgricultureBy_RT_AppNo(
			String caseId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return getService().getAgricultureBy_RT_AppNo(caseId);
	}

	public static AgricultureApplication getAgricultureBy_RT_AppNo(
			String expiredAppLicenseNumber, String requestType)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return getService().getAgricultureBy_RT_AppNo(
			expiredAppLicenseNumber, requestType);
	}

	public static AgricultureApplication getAgricultureByAppNo(
			String applicationNumber)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return getService().getAgricultureByAppNo(applicationNumber);
	}

	public static List<AgricultureApplication> getAgricultureByStatus(
		int status) {

		return getService().getAgricultureByStatus(status);
	}

	public static List<String> getAgricultureDistinctCategory() {
		return getService().getAgricultureDistinctCategory();
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
	 * Updates the agriculture application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureApplication the agriculture application
	 * @return the agriculture application that was updated
	 */
	public static AgricultureApplication updateAgricultureApplication(
		AgricultureApplication agricultureApplication) {

		return getService().updateAgricultureApplication(
			agricultureApplication);
	}

	public static AgricultureApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AgricultureApplicationLocalService>
		_serviceSnapshot = new Snapshot<>(
			AgricultureApplicationLocalServiceUtil.class,
			AgricultureApplicationLocalService.class);

}