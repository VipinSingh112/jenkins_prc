/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.film.stages.services.model.FilmDeskVerification;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FilmDeskVerification. This utility wraps
 * <code>com.nbp.film.stages.services.service.impl.FilmDeskVerificationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FilmDeskVerificationLocalService
 * @generated
 */
public class FilmDeskVerificationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.film.stages.services.service.impl.FilmDeskVerificationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the film desk verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmDeskVerification the film desk verification
	 * @return the film desk verification that was added
	 */
	public static FilmDeskVerification addFilmDeskVerification(
		FilmDeskVerification filmDeskVerification) {

		return getService().addFilmDeskVerification(filmDeskVerification);
	}

	/**
	 * Creates a new film desk verification with the primary key. Does not add the film desk verification to the database.
	 *
	 * @param filmDeskVerificaId the primary key for the new film desk verification
	 * @return the new film desk verification
	 */
	public static FilmDeskVerification createFilmDeskVerification(
		long filmDeskVerificaId) {

		return getService().createFilmDeskVerification(filmDeskVerificaId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	public static void deleteFilmByDeskVerificationId(long filmApplicationId) {
		getService().deleteFilmByDeskVerificationId(filmApplicationId);
	}

	/**
	 * Deletes the film desk verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmDeskVerification the film desk verification
	 * @return the film desk verification that was removed
	 */
	public static FilmDeskVerification deleteFilmDeskVerification(
		FilmDeskVerification filmDeskVerification) {

		return getService().deleteFilmDeskVerification(filmDeskVerification);
	}

	/**
	 * Deletes the film desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmDeskVerificaId the primary key of the film desk verification
	 * @return the film desk verification that was removed
	 * @throws PortalException if a film desk verification with the primary key could not be found
	 */
	public static FilmDeskVerification deleteFilmDeskVerification(
			long filmDeskVerificaId)
		throws PortalException {

		return getService().deleteFilmDeskVerification(filmDeskVerificaId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.stages.services.model.impl.FilmDeskVerificationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.stages.services.model.impl.FilmDeskVerificationModelImpl</code>.
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

	public static FilmDeskVerification fetchFilmDeskVerification(
		long filmDeskVerificaId) {

		return getService().fetchFilmDeskVerification(filmDeskVerificaId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<FilmDeskVerification> getDeskVerificationFilmById(
		long filmApplicationId) {

		return getService().getDeskVerificationFilmById(filmApplicationId);
	}

	/**
	 * Returns the film desk verification with the primary key.
	 *
	 * @param filmDeskVerificaId the primary key of the film desk verification
	 * @return the film desk verification
	 * @throws PortalException if a film desk verification with the primary key could not be found
	 */
	public static FilmDeskVerification getFilmDeskVerification(
			long filmDeskVerificaId)
		throws PortalException {

		return getService().getFilmDeskVerification(filmDeskVerificaId);
	}

	/**
	 * Returns a range of all the film desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.stages.services.model.impl.FilmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film desk verifications
	 * @param end the upper bound of the range of film desk verifications (not inclusive)
	 * @return the range of film desk verifications
	 */
	public static List<FilmDeskVerification> getFilmDeskVerifications(
		int start, int end) {

		return getService().getFilmDeskVerifications(start, end);
	}

	/**
	 * Returns the number of film desk verifications.
	 *
	 * @return the number of film desk verifications
	 */
	public static int getFilmDeskVerificationsCount() {
		return getService().getFilmDeskVerificationsCount();
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
	 * Updates the film desk verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmDeskVerification the film desk verification
	 * @return the film desk verification that was updated
	 */
	public static FilmDeskVerification updateFilmDeskVerification(
		FilmDeskVerification filmDeskVerification) {

		return getService().updateFilmDeskVerification(filmDeskVerification);
	}

	public static FilmDeskVerificationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FilmDeskVerificationLocalService>
		_serviceSnapshot = new Snapshot<>(
			FilmDeskVerificationLocalServiceUtil.class,
			FilmDeskVerificationLocalService.class);

}