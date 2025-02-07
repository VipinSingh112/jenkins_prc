/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.application.form.services.model.OsiApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiApplication. This utility wraps
 * <code>com.nbp.osi.application.form.services.service.impl.OsiApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiApplicationLocalService
 * @generated
 */
public class OsiApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.application.form.services.service.impl.OsiApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplication the osi application
	 * @return the osi application that was added
	 */
	public static OsiApplication addOsiApplication(
		OsiApplication osiApplication) {

		return getService().addOsiApplication(osiApplication);
	}

	/**
	 * Creates a new osi application with the primary key. Does not add the osi application to the database.
	 *
	 * @param osiApplicationId the primary key for the new osi application
	 * @return the new osi application
	 */
	public static OsiApplication createOsiApplication(long osiApplicationId) {
		return getService().createOsiApplication(osiApplicationId);
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
	 * Deletes the osi application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplicationId the primary key of the osi application
	 * @return the osi application that was removed
	 * @throws PortalException if a osi application with the primary key could not be found
	 */
	public static OsiApplication deleteOsiApplication(long osiApplicationId)
		throws PortalException {

		return getService().deleteOsiApplication(osiApplicationId);
	}

	/**
	 * Deletes the osi application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplication the osi application
	 * @return the osi application that was removed
	 */
	public static OsiApplication deleteOsiApplication(
		OsiApplication osiApplication) {

		return getService().deleteOsiApplication(osiApplication);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.OsiApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.OsiApplicationModelImpl</code>.
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

	public static OsiApplication fetchOsiApplication(long osiApplicationId) {
		return getService().fetchOsiApplication(osiApplicationId);
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
	 * Returns the osi application with the primary key.
	 *
	 * @param osiApplicationId the primary key of the osi application
	 * @return the osi application
	 * @throws PortalException if a osi application with the primary key could not be found
	 */
	public static OsiApplication getOsiApplication(long osiApplicationId)
		throws PortalException {

		return getService().getOsiApplication(osiApplicationId);
	}

	public static List<OsiApplication> getOsiApplicationByAppStatus(
		int status) {

		return getService().getOsiApplicationByAppStatus(status);
	}

	public static List<OsiApplication> getOsiApplicationByS_U(
		int status, long userId) {

		return getService().getOsiApplicationByS_U(status, userId);
	}

	public static List<OsiApplication> getOsiApplicationByS_UId(
		long userId, int status) {

		return getService().getOsiApplicationByS_UId(userId, status);
	}

	public static List<OsiApplication> getOsiApplicationByStatus(int status) {
		return getService().getOsiApplicationByStatus(status);
	}

	public static List<OsiApplication> getOsiApplicationByStatus_UserId(
		int status, long userId) {

		return getService().getOsiApplicationByStatus_UserId(status, userId);
	}

	/**
	 * Returns a range of all the osi applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @return the range of osi applications
	 */
	public static List<OsiApplication> getOsiApplications(int start, int end) {
		return getService().getOsiApplications(start, end);
	}

	/**
	 * Returns the number of osi applications.
	 *
	 * @return the number of osi applications
	 */
	public static int getOsiApplicationsCount() {
		return getService().getOsiApplicationsCount();
	}

	public static OsiApplication getOsiByAppNum(String applicationNumber)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getService().getOsiByAppNum(applicationNumber);
	}

	public static OsiApplication getOsiByAT_AppNo(
			String applicationType, String appNumber)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getService().getOsiByAT_AppNo(applicationType, appNumber);
	}

	public static OsiApplication getOsiByCaseId(String caseId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getService().getOsiByCaseId(caseId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplication the osi application
	 * @return the osi application that was updated
	 */
	public static OsiApplication updateOsiApplication(
		OsiApplication osiApplication) {

		return getService().updateOsiApplication(osiApplication);
	}

	public static OsiApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OsiApplicationLocalService> _serviceSnapshot =
		new Snapshot<>(
			OsiApplicationLocalServiceUtil.class,
			OsiApplicationLocalService.class);

}