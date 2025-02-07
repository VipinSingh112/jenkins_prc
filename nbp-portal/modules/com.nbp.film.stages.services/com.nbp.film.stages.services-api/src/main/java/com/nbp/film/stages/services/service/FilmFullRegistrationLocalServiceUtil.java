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

import com.nbp.film.stages.services.model.FilmFullRegistration;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FilmFullRegistration. This utility wraps
 * <code>com.nbp.film.stages.services.service.impl.FilmFullRegistrationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FilmFullRegistrationLocalService
 * @generated
 */
public class FilmFullRegistrationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.film.stages.services.service.impl.FilmFullRegistrationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the film full registration to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmFullRegistrationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmFullRegistration the film full registration
	 * @return the film full registration that was added
	 */
	public static FilmFullRegistration addFilmFullRegistration(
		FilmFullRegistration filmFullRegistration) {

		return getService().addFilmFullRegistration(filmFullRegistration);
	}

	/**
	 * Creates a new film full registration with the primary key. Does not add the film full registration to the database.
	 *
	 * @param filmFullRegistrationId the primary key for the new film full registration
	 * @return the new film full registration
	 */
	public static FilmFullRegistration createFilmFullRegistration(
		long filmFullRegistrationId) {

		return getService().createFilmFullRegistration(filmFullRegistrationId);
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
	 * Deletes the film full registration from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmFullRegistrationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmFullRegistration the film full registration
	 * @return the film full registration that was removed
	 */
	public static FilmFullRegistration deleteFilmFullRegistration(
		FilmFullRegistration filmFullRegistration) {

		return getService().deleteFilmFullRegistration(filmFullRegistration);
	}

	/**
	 * Deletes the film full registration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmFullRegistrationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmFullRegistrationId the primary key of the film full registration
	 * @return the film full registration that was removed
	 * @throws PortalException if a film full registration with the primary key could not be found
	 */
	public static FilmFullRegistration deleteFilmFullRegistration(
			long filmFullRegistrationId)
		throws PortalException {

		return getService().deleteFilmFullRegistration(filmFullRegistrationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.stages.services.model.impl.FilmFullRegistrationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.stages.services.model.impl.FilmFullRegistrationModelImpl</code>.
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

	public static FilmFullRegistration fetchFilmFullRegistration(
		long filmFullRegistrationId) {

		return getService().fetchFilmFullRegistration(filmFullRegistrationId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the film full registration with the primary key.
	 *
	 * @param filmFullRegistrationId the primary key of the film full registration
	 * @return the film full registration
	 * @throws PortalException if a film full registration with the primary key could not be found
	 */
	public static FilmFullRegistration getFilmFullRegistration(
			long filmFullRegistrationId)
		throws PortalException {

		return getService().getFilmFullRegistration(filmFullRegistrationId);
	}

	/**
	 * Returns a range of all the film full registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.stages.services.model.impl.FilmFullRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film full registrations
	 * @param end the upper bound of the range of film full registrations (not inclusive)
	 * @return the range of film full registrations
	 */
	public static List<FilmFullRegistration> getFilmFullRegistrations(
		int start, int end) {

		return getService().getFilmFullRegistrations(start, end);
	}

	/**
	 * Returns the number of film full registrations.
	 *
	 * @return the number of film full registrations
	 */
	public static int getFilmFullRegistrationsCount() {
		return getService().getFilmFullRegistrationsCount();
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

	public static FilmFullRegistration getPharmaFullLIcense(String caseId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmFullRegistrationException {

		return getService().getPharmaFullLIcense(caseId);
	}

	public static FilmFullRegistration getPharmaFullLIcense_By_RN(
			String registrationNUmber)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmFullRegistrationException {

		return getService().getPharmaFullLIcense_By_RN(registrationNUmber);
	}

	/**
	 * Updates the film full registration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmFullRegistrationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmFullRegistration the film full registration
	 * @return the film full registration that was updated
	 */
	public static FilmFullRegistration updateFilmFullRegistration(
		FilmFullRegistration filmFullRegistration) {

		return getService().updateFilmFullRegistration(filmFullRegistration);
	}

	public static FilmFullRegistration updateFilmFullRegistration(
		String caseId, String nameofapplicant, String productionType,
		String registrationNumber, java.util.Date dateofRegistrationPermit,
		String productionTitle, java.util.Date productionDateFrom,
		java.util.Date productionDateTo, String termsAndConditions) {

		return getService().updateFilmFullRegistration(
			caseId, nameofapplicant, productionType, registrationNumber,
			dateofRegistrationPermit, productionTitle, productionDateFrom,
			productionDateTo, termsAndConditions);
	}

	public static FilmFullRegistration updateFilmFullRegistration(
		String caseId, String duration, String nameofapplicant,
		String productionType, String registrationNumber,
		java.util.Date dateofRegistrationPermit, String productionTitle,
		java.util.Date productionDateFrom, java.util.Date productionDateTo,
		String termsAndConditions) {

		return getService().updateFilmFullRegistration(
			caseId, duration, nameofapplicant, productionType,
			registrationNumber, dateofRegistrationPermit, productionTitle,
			productionDateFrom, productionDateTo, termsAndConditions);
	}

	public static FilmFullRegistrationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FilmFullRegistrationLocalService>
		_serviceSnapshot = new Snapshot<>(
			FilmFullRegistrationLocalServiceUtil.class,
			FilmFullRegistrationLocalService.class);

}