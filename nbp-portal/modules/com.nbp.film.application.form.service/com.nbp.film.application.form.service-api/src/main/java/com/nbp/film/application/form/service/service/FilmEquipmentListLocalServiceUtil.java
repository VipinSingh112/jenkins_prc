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

import com.nbp.film.application.form.service.model.FilmEquipmentList;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FilmEquipmentList. This utility wraps
 * <code>com.nbp.film.application.form.service.service.impl.FilmEquipmentListLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FilmEquipmentListLocalService
 * @generated
 */
public class FilmEquipmentListLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.film.application.form.service.service.impl.FilmEquipmentListLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the film equipment list to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmEquipmentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmEquipmentList the film equipment list
	 * @return the film equipment list that was added
	 */
	public static FilmEquipmentList addFilmEquipmentList(
		FilmEquipmentList filmEquipmentList) {

		return getService().addFilmEquipmentList(filmEquipmentList);
	}

	/**
	 * Creates a new film equipment list with the primary key. Does not add the film equipment list to the database.
	 *
	 * @param filmEquipmentListId the primary key for the new film equipment list
	 * @return the new film equipment list
	 */
	public static FilmEquipmentList createFilmEquipmentList(
		long filmEquipmentListId) {

		return getService().createFilmEquipmentList(filmEquipmentListId);
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
	 * Deletes the film equipment list from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmEquipmentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmEquipmentList the film equipment list
	 * @return the film equipment list that was removed
	 */
	public static FilmEquipmentList deleteFilmEquipmentList(
		FilmEquipmentList filmEquipmentList) {

		return getService().deleteFilmEquipmentList(filmEquipmentList);
	}

	/**
	 * Deletes the film equipment list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmEquipmentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmEquipmentListId the primary key of the film equipment list
	 * @return the film equipment list that was removed
	 * @throws PortalException if a film equipment list with the primary key could not be found
	 */
	public static FilmEquipmentList deleteFilmEquipmentList(
			long filmEquipmentListId)
		throws PortalException {

		return getService().deleteFilmEquipmentList(filmEquipmentListId);
	}

	public static void deleteMultipleFormData_BY_AppId(long applicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmEquipmentListException {

		getService().deleteMultipleFormData_BY_AppId(applicationId);
	}

	public static void deleteMultipleFormData_BY_Id(long applicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmEquipmentListException {

		getService().deleteMultipleFormData_BY_Id(applicationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmEquipmentListModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmEquipmentListModelImpl</code>.
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

	public static FilmEquipmentList fetchFilmEquipmentList(
		long filmEquipmentListId) {

		return getService().fetchFilmEquipmentList(filmEquipmentListId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<FilmEquipmentList> getFilmByAppId(long applicationId) {
		return getService().getFilmByAppId(applicationId);
	}

	public static FilmEquipmentList getFilmById(long filmById) {
		return getService().getFilmById(filmById);
	}

	/**
	 * Returns the film equipment list with the primary key.
	 *
	 * @param filmEquipmentListId the primary key of the film equipment list
	 * @return the film equipment list
	 * @throws PortalException if a film equipment list with the primary key could not be found
	 */
	public static FilmEquipmentList getFilmEquipmentList(
			long filmEquipmentListId)
		throws PortalException {

		return getService().getFilmEquipmentList(filmEquipmentListId);
	}

	/**
	 * Returns a range of all the film equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film equipment lists
	 * @param end the upper bound of the range of film equipment lists (not inclusive)
	 * @return the range of film equipment lists
	 */
	public static List<FilmEquipmentList> getFilmEquipmentLists(
		int start, int end) {

		return getService().getFilmEquipmentLists(start, end);
	}

	/**
	 * Returns the number of film equipment lists.
	 *
	 * @return the number of film equipment lists
	 */
	public static int getFilmEquipmentListsCount() {
		return getService().getFilmEquipmentListsCount();
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
	 * Updates the film equipment list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmEquipmentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmEquipmentList the film equipment list
	 * @return the film equipment list that was updated
	 */
	public static FilmEquipmentList updateFilmEquipmentList(
		FilmEquipmentList filmEquipmentList) {

		return getService().updateFilmEquipmentList(filmEquipmentList);
	}

	public static FilmEquipmentListLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FilmEquipmentListLocalService>
		_serviceSnapshot = new Snapshot<>(
			FilmEquipmentListLocalServiceUtil.class,
			FilmEquipmentListLocalService.class);

}