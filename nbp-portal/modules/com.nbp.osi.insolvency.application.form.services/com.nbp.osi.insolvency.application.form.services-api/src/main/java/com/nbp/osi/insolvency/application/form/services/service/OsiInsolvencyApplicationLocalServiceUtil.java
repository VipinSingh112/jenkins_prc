/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiInsolvencyApplication. This utility wraps
 * <code>com.nbp.osi.insolvency.application.form.services.service.impl.OsiInsolvencyApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyApplicationLocalService
 * @generated
 */
public class OsiInsolvencyApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.insolvency.application.form.services.service.impl.OsiInsolvencyApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi insolvency application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyApplication the osi insolvency application
	 * @return the osi insolvency application that was added
	 */
	public static OsiInsolvencyApplication addOsiInsolvencyApplication(
		OsiInsolvencyApplication osiInsolvencyApplication) {

		return getService().addOsiInsolvencyApplication(
			osiInsolvencyApplication);
	}

	/**
	 * Creates a new osi insolvency application with the primary key. Does not add the osi insolvency application to the database.
	 *
	 * @param osiInsolvencyId the primary key for the new osi insolvency application
	 * @return the new osi insolvency application
	 */
	public static OsiInsolvencyApplication createOsiInsolvencyApplication(
		long osiInsolvencyId) {

		return getService().createOsiInsolvencyApplication(osiInsolvencyId);
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
	 * Deletes the osi insolvency application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyId the primary key of the osi insolvency application
	 * @return the osi insolvency application that was removed
	 * @throws PortalException if a osi insolvency application with the primary key could not be found
	 */
	public static OsiInsolvencyApplication deleteOsiInsolvencyApplication(
			long osiInsolvencyId)
		throws PortalException {

		return getService().deleteOsiInsolvencyApplication(osiInsolvencyId);
	}

	/**
	 * Deletes the osi insolvency application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyApplication the osi insolvency application
	 * @return the osi insolvency application that was removed
	 */
	public static OsiInsolvencyApplication deleteOsiInsolvencyApplication(
		OsiInsolvencyApplication osiInsolvencyApplication) {

		return getService().deleteOsiInsolvencyApplication(
			osiInsolvencyApplication);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvencyApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvencyApplicationModelImpl</code>.
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

	public static OsiInsolvencyApplication fetchOsiInsolvencyApplication(
		long osiInsolvencyId) {

		return getService().fetchOsiInsolvencyApplication(osiInsolvencyId);
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
	 * Returns the osi insolvency application with the primary key.
	 *
	 * @param osiInsolvencyId the primary key of the osi insolvency application
	 * @return the osi insolvency application
	 * @throws PortalException if a osi insolvency application with the primary key could not be found
	 */
	public static OsiInsolvencyApplication getOsiInsolvencyApplication(
			long osiInsolvencyId)
		throws PortalException {

		return getService().getOsiInsolvencyApplication(osiInsolvencyId);
	}

	public static List<OsiInsolvencyApplication>
		getOsiInsolvencyApplicationByS_U(int status, long userId) {

		return getService().getOsiInsolvencyApplicationByS_U(status, userId);
	}

	public static List<OsiInsolvencyApplication>
		getOsiInsolvencyApplicationByS_UId(long userId, int status) {

		return getService().getOsiInsolvencyApplicationByS_UId(userId, status);
	}

	public static List<OsiInsolvencyApplication>
		getOsiInsolvencyApplicationByStatus(int status) {

		return getService().getOsiInsolvencyApplicationByStatus(status);
	}

	/**
	 * Returns a range of all the osi insolvency applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @return the range of osi insolvency applications
	 */
	public static List<OsiInsolvencyApplication> getOsiInsolvencyApplications(
		int start, int end) {

		return getService().getOsiInsolvencyApplications(start, end);
	}

	/**
	 * Returns the number of osi insolvency applications.
	 *
	 * @return the number of osi insolvency applications
	 */
	public static int getOsiInsolvencyApplicationsCount() {
		return getService().getOsiInsolvencyApplicationsCount();
	}

	public static List<OsiInsolvencyApplication>
		getOsiInsolvencyByApplicationStatus_Status(
			String applicantStatus, int status) {

		return getService().getOsiInsolvencyByApplicationStatus_Status(
			applicantStatus, status);
	}

	public static OsiInsolvencyApplication getOsiInsolvencyByAppNum(
			String applicationNumber)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getService().getOsiInsolvencyByAppNum(applicationNumber);
	}

	public static OsiInsolvencyApplication getOsiInsolvencyByCaseId(
			String caseId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getService().getOsiInsolvencyByCaseId(caseId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi insolvency application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyApplication the osi insolvency application
	 * @return the osi insolvency application that was updated
	 */
	public static OsiInsolvencyApplication updateOsiInsolvencyApplication(
		OsiInsolvencyApplication osiInsolvencyApplication) {

		return getService().updateOsiInsolvencyApplication(
			osiInsolvencyApplication);
	}

	public static OsiInsolvencyApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OsiInsolvencyApplicationLocalService>
		_serviceSnapshot = new Snapshot<>(
			OsiInsolvencyApplicationLocalServiceUtil.class,
			OsiInsolvencyApplicationLocalService.class);

}