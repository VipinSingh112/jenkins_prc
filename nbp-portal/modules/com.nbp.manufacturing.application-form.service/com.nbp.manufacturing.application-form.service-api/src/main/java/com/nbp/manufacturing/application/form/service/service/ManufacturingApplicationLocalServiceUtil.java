/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.form.service.model.ManufacturingApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ManufacturingApplication. This utility wraps
 * <code>com.nbp.manufacturing.application.form.service.service.impl.ManufacturingApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingApplicationLocalService
 * @generated
 */
public class ManufacturingApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.manufacturing.application.form.service.service.impl.ManufacturingApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the manufacturing application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingApplication the manufacturing application
	 * @return the manufacturing application that was added
	 */
	public static ManufacturingApplication addManufacturingApplication(
		ManufacturingApplication manufacturingApplication) {

		return getService().addManufacturingApplication(
			manufacturingApplication);
	}

	/**
	 * Creates a new manufacturing application with the primary key. Does not add the manufacturing application to the database.
	 *
	 * @param manufacturingApplicationId the primary key for the new manufacturing application
	 * @return the new manufacturing application
	 */
	public static ManufacturingApplication createManufacturingApplication(
		long manufacturingApplicationId) {

		return getService().createManufacturingApplication(
			manufacturingApplicationId);
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
	 * Deletes the manufacturing application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingApplicationId the primary key of the manufacturing application
	 * @return the manufacturing application that was removed
	 * @throws PortalException if a manufacturing application with the primary key could not be found
	 */
	public static ManufacturingApplication deleteManufacturingApplication(
			long manufacturingApplicationId)
		throws PortalException {

		return getService().deleteManufacturingApplication(
			manufacturingApplicationId);
	}

	/**
	 * Deletes the manufacturing application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingApplication the manufacturing application
	 * @return the manufacturing application that was removed
	 */
	public static ManufacturingApplication deleteManufacturingApplication(
		ManufacturingApplication manufacturingApplication) {

		return getService().deleteManufacturingApplication(
			manufacturingApplication);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManufacturingApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManufacturingApplicationModelImpl</code>.
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

	public static ManufacturingApplication fetchManufacturingApplication(
		long manufacturingApplicationId) {

		return getService().fetchManufacturingApplication(
			manufacturingApplicationId);
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
	 * Returns the manufacturing application with the primary key.
	 *
	 * @param manufacturingApplicationId the primary key of the manufacturing application
	 * @return the manufacturing application
	 * @throws PortalException if a manufacturing application with the primary key could not be found
	 */
	public static ManufacturingApplication getManufacturingApplication(
			long manufacturingApplicationId)
		throws PortalException {

		return getService().getManufacturingApplication(
			manufacturingApplicationId);
	}

	/**
	 * Returns a range of all the manufacturing applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @return the range of manufacturing applications
	 */
	public static List<ManufacturingApplication> getManufacturingApplications(
		int start, int end) {

		return getService().getManufacturingApplications(start, end);
	}

	/**
	 * Returns the number of manufacturing applications.
	 *
	 * @return the number of manufacturing applications
	 */
	public static int getManufacturingApplicationsCount() {
		return getService().getManufacturingApplicationsCount();
	}

	public static ManufacturingApplication getManufacturingByAppNum(
			String applicationNumber)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManufacturingApplicationException {

		return getService().getManufacturingByAppNum(applicationNumber);
	}

	public static ManufacturingApplication getManufacturingByCaseId(
			String caseId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManufacturingApplicationException {

		return getService().getManufacturingByCaseId(caseId);
	}

	public static ManufacturingApplication getManufacturingByRT_AppNo(
			String requestType, String appNumber)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManufacturingApplicationException {

		return getService().getManufacturingByRT_AppNo(requestType, appNumber);
	}

	public static List<ManufacturingApplication> getManufacturingByS_U(
		long userID, int status) {

		return getService().getManufacturingByS_U(userID, status);
	}

	public static List<ManufacturingApplication> getManufacturingByStatus(
		int status) {

		return getService().getManufacturingByStatus(status);
	}

	public static List<String> getManuFacturingDistinctStages() {
		return getService().getManuFacturingDistinctStages();
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
	 * Updates the manufacturing application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingApplication the manufacturing application
	 * @return the manufacturing application that was updated
	 */
	public static ManufacturingApplication updateManufacturingApplication(
		ManufacturingApplication manufacturingApplication) {

		return getService().updateManufacturingApplication(
			manufacturingApplication);
	}

	public static ManufacturingApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ManufacturingApplicationLocalService>
		_serviceSnapshot = new Snapshot<>(
			ManufacturingApplicationLocalServiceUtil.class,
			ManufacturingApplicationLocalService.class);

}