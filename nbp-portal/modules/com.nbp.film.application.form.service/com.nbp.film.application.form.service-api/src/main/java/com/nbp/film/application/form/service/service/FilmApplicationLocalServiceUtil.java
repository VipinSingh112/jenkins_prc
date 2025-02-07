/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.film.application.form.service.model.FilmApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FilmApplication. This utility wraps
 * <code>com.nbp.film.application.form.service.service.impl.FilmApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationLocalService
 * @generated
 */
public class FilmApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.film.application.form.service.service.impl.FilmApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the film application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplication the film application
	 * @return the film application that was added
	 */
	public static FilmApplication addFilmApplication(
		FilmApplication filmApplication) {

		return getService().addFilmApplication(filmApplication);
	}

	/**
	 * Creates a new film application with the primary key. Does not add the film application to the database.
	 *
	 * @param filmApplicationId the primary key for the new film application
	 * @return the new film application
	 */
	public static FilmApplication createFilmApplication(
		long filmApplicationId) {

		return getService().createFilmApplication(filmApplicationId);
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
	 * Deletes the film application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplication the film application
	 * @return the film application that was removed
	 */
	public static FilmApplication deleteFilmApplication(
		FilmApplication filmApplication) {

		return getService().deleteFilmApplication(filmApplication);
	}

	/**
	 * Deletes the film application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationId the primary key of the film application
	 * @return the film application that was removed
	 * @throws PortalException if a film application with the primary key could not be found
	 */
	public static FilmApplication deleteFilmApplication(long filmApplicationId)
		throws PortalException {

		return getService().deleteFilmApplication(filmApplicationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmApplicationModelImpl</code>.
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

	public static FilmApplication fetchFilmApplication(long filmApplicationId) {
		return getService().fetchFilmApplication(filmApplicationId);
	}

	/**
	 * Returns the film application matching the UUID and group.
	 *
	 * @param uuid the film application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public static FilmApplication fetchFilmApplicationByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchFilmApplicationByUuidAndGroupId(uuid, groupId);
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

	/**
	 * Returns the film application with the primary key.
	 *
	 * @param filmApplicationId the primary key of the film application
	 * @return the film application
	 * @throws PortalException if a film application with the primary key could not be found
	 */
	public static FilmApplication getFilmApplication(long filmApplicationId)
		throws PortalException {

		return getService().getFilmApplication(filmApplicationId);
	}

	/**
	 * Returns the film application matching the UUID and group.
	 *
	 * @param uuid the film application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching film application
	 * @throws PortalException if a matching film application could not be found
	 */
	public static FilmApplication getFilmApplicationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getFilmApplicationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the film applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @return the range of film applications
	 */
	public static List<FilmApplication> getFilmApplications(
		int start, int end) {

		return getService().getFilmApplications(start, end);
	}

	/**
	 * Returns all the film applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the film applications
	 * @param companyId the primary key of the company
	 * @return the matching film applications, or an empty list if no matches were found
	 */
	public static List<FilmApplication> getFilmApplicationsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getFilmApplicationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of film applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the film applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching film applications, or an empty list if no matches were found
	 */
	public static List<FilmApplication> getFilmApplicationsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FilmApplication> orderByComparator) {

		return getService().getFilmApplicationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of film applications.
	 *
	 * @return the number of film applications
	 */
	public static int getFilmApplicationsCount() {
		return getService().getFilmApplicationsCount();
	}

	public static FilmApplication getFilmByAppNo(String filmApplicationNumber)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getService().getFilmByAppNo(filmApplicationNumber);
	}

	public static FilmApplication getFilmByCaseId(String caseId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getService().getFilmByCaseId(caseId);
	}

	public static List<FilmApplication> getFilmByS_U(int status, long userId) {
		return getService().getFilmByS_U(status, userId);
	}

	public static List<FilmApplication> getFilmByStatus(int status) {
		return getService().getFilmByStatus(status);
	}

	public static List<String> getFilmDistinctCategory() {
		return getService().getFilmDistinctCategory();
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
	 * Updates the film application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplication the film application
	 * @return the film application that was updated
	 */
	public static FilmApplication updateFilmApplication(
		FilmApplication filmApplication) {

		return getService().updateFilmApplication(filmApplication);
	}

	public static FilmApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FilmApplicationLocalService>
		_serviceSnapshot = new Snapshot<>(
			FilmApplicationLocalServiceUtil.class,
			FilmApplicationLocalService.class);

}