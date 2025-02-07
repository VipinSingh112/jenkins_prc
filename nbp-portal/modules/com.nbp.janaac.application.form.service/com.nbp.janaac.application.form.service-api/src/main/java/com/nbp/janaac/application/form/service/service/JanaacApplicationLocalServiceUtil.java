/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.JanaacApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JanaacApplication. This utility wraps
 * <code>com.nbp.janaac.application.form.service.service.impl.JanaacApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacApplicationLocalService
 * @generated
 */
public class JanaacApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.JanaacApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the janaac application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacApplication the janaac application
	 * @return the janaac application that was added
	 */
	public static JanaacApplication addJanaacApplication(
		JanaacApplication janaacApplication) {

		return getService().addJanaacApplication(janaacApplication);
	}

	/**
	 * Creates a new janaac application with the primary key. Does not add the janaac application to the database.
	 *
	 * @param janaacApplicationId the primary key for the new janaac application
	 * @return the new janaac application
	 */
	public static JanaacApplication createJanaacApplication(
		long janaacApplicationId) {

		return getService().createJanaacApplication(janaacApplicationId);
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
	 * Deletes the janaac application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacApplication the janaac application
	 * @return the janaac application that was removed
	 */
	public static JanaacApplication deleteJanaacApplication(
		JanaacApplication janaacApplication) {

		return getService().deleteJanaacApplication(janaacApplication);
	}

	/**
	 * Deletes the janaac application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacApplicationId the primary key of the janaac application
	 * @return the janaac application that was removed
	 * @throws PortalException if a janaac application with the primary key could not be found
	 */
	public static JanaacApplication deleteJanaacApplication(
			long janaacApplicationId)
		throws PortalException {

		return getService().deleteJanaacApplication(janaacApplicationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.JanaacApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.JanaacApplicationModelImpl</code>.
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

	public static JanaacApplication fetchJanaacApplication(
		long janaacApplicationId) {

		return getService().fetchJanaacApplication(janaacApplicationId);
	}

	/**
	 * Returns the janaac application matching the UUID and group.
	 *
	 * @param uuid the janaac application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public static JanaacApplication fetchJanaacApplicationByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchJanaacApplicationByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static JanaacApplication getJANAAC_By_app_no(String appNo)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getService().getJANAAC_By_app_no(appNo);
	}

	public static List<JanaacApplication> getJANAAC_By_status(int status) {
		return getService().getJANAAC_By_status(status);
	}

	public static JanaacApplication getJANAAC_ByCaseId(String caseId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getService().getJANAAC_ByCaseId(caseId);
	}

	public static List<JanaacApplication> getJANAAC_ByS_U(
		long userId, int status) {

		return getService().getJANAAC_ByS_U(userId, status);
	}

	/**
	 * Returns the janaac application with the primary key.
	 *
	 * @param janaacApplicationId the primary key of the janaac application
	 * @return the janaac application
	 * @throws PortalException if a janaac application with the primary key could not be found
	 */
	public static JanaacApplication getJanaacApplication(
			long janaacApplicationId)
		throws PortalException {

		return getService().getJanaacApplication(janaacApplicationId);
	}

	/**
	 * Returns the janaac application matching the UUID and group.
	 *
	 * @param uuid the janaac application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching janaac application
	 * @throws PortalException if a matching janaac application could not be found
	 */
	public static JanaacApplication getJanaacApplicationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getJanaacApplicationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the janaac applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @return the range of janaac applications
	 */
	public static List<JanaacApplication> getJanaacApplications(
		int start, int end) {

		return getService().getJanaacApplications(start, end);
	}

	/**
	 * Returns all the janaac applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the janaac applications
	 * @param companyId the primary key of the company
	 * @return the matching janaac applications, or an empty list if no matches were found
	 */
	public static List<JanaacApplication>
		getJanaacApplicationsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getJanaacApplicationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of janaac applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the janaac applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching janaac applications, or an empty list if no matches were found
	 */
	public static List<JanaacApplication>
		getJanaacApplicationsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<JanaacApplication> orderByComparator) {

		return getService().getJanaacApplicationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of janaac applications.
	 *
	 * @return the number of janaac applications
	 */
	public static int getJanaacApplicationsCount() {
		return getService().getJanaacApplicationsCount();
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
	 * Updates the janaac application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacApplication the janaac application
	 * @return the janaac application that was updated
	 */
	public static JanaacApplication updateJanaacApplication(
		JanaacApplication janaacApplication) {

		return getService().updateJanaacApplication(janaacApplication);
	}

	public static JanaacApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<JanaacApplicationLocalService>
		_serviceSnapshot = new Snapshot<>(
			JanaacApplicationLocalServiceUtil.class,
			JanaacApplicationLocalService.class);

}