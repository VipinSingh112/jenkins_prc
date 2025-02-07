/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FilmFullRegistrationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmFullRegistrationLocalService
 * @generated
 */
public class FilmFullRegistrationLocalServiceWrapper
	implements FilmFullRegistrationLocalService,
			   ServiceWrapper<FilmFullRegistrationLocalService> {

	public FilmFullRegistrationLocalServiceWrapper() {
		this(null);
	}

	public FilmFullRegistrationLocalServiceWrapper(
		FilmFullRegistrationLocalService filmFullRegistrationLocalService) {

		_filmFullRegistrationLocalService = filmFullRegistrationLocalService;
	}

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
	@Override
	public com.nbp.film.stages.services.model.FilmFullRegistration
		addFilmFullRegistration(
			com.nbp.film.stages.services.model.FilmFullRegistration
				filmFullRegistration) {

		return _filmFullRegistrationLocalService.addFilmFullRegistration(
			filmFullRegistration);
	}

	/**
	 * Creates a new film full registration with the primary key. Does not add the film full registration to the database.
	 *
	 * @param filmFullRegistrationId the primary key for the new film full registration
	 * @return the new film full registration
	 */
	@Override
	public com.nbp.film.stages.services.model.FilmFullRegistration
		createFilmFullRegistration(long filmFullRegistrationId) {

		return _filmFullRegistrationLocalService.createFilmFullRegistration(
			filmFullRegistrationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmFullRegistrationLocalService.createPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.film.stages.services.model.FilmFullRegistration
		deleteFilmFullRegistration(
			com.nbp.film.stages.services.model.FilmFullRegistration
				filmFullRegistration) {

		return _filmFullRegistrationLocalService.deleteFilmFullRegistration(
			filmFullRegistration);
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
	@Override
	public com.nbp.film.stages.services.model.FilmFullRegistration
			deleteFilmFullRegistration(long filmFullRegistrationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmFullRegistrationLocalService.deleteFilmFullRegistration(
			filmFullRegistrationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmFullRegistrationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _filmFullRegistrationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _filmFullRegistrationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _filmFullRegistrationLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _filmFullRegistrationLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _filmFullRegistrationLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _filmFullRegistrationLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _filmFullRegistrationLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _filmFullRegistrationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.film.stages.services.model.FilmFullRegistration
		fetchFilmFullRegistration(long filmFullRegistrationId) {

		return _filmFullRegistrationLocalService.fetchFilmFullRegistration(
			filmFullRegistrationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _filmFullRegistrationLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the film full registration with the primary key.
	 *
	 * @param filmFullRegistrationId the primary key of the film full registration
	 * @return the film full registration
	 * @throws PortalException if a film full registration with the primary key could not be found
	 */
	@Override
	public com.nbp.film.stages.services.model.FilmFullRegistration
			getFilmFullRegistration(long filmFullRegistrationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmFullRegistrationLocalService.getFilmFullRegistration(
			filmFullRegistrationId);
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
	@Override
	public java.util.List
		<com.nbp.film.stages.services.model.FilmFullRegistration>
			getFilmFullRegistrations(int start, int end) {

		return _filmFullRegistrationLocalService.getFilmFullRegistrations(
			start, end);
	}

	/**
	 * Returns the number of film full registrations.
	 *
	 * @return the number of film full registrations
	 */
	@Override
	public int getFilmFullRegistrationsCount() {
		return _filmFullRegistrationLocalService.
			getFilmFullRegistrationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _filmFullRegistrationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmFullRegistrationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmFullRegistrationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.film.stages.services.model.FilmFullRegistration
			getPharmaFullLIcense(String caseId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmFullRegistrationException {

		return _filmFullRegistrationLocalService.getPharmaFullLIcense(caseId);
	}

	@Override
	public com.nbp.film.stages.services.model.FilmFullRegistration
			getPharmaFullLIcense_By_RN(String registrationNUmber)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmFullRegistrationException {

		return _filmFullRegistrationLocalService.getPharmaFullLIcense_By_RN(
			registrationNUmber);
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
	@Override
	public com.nbp.film.stages.services.model.FilmFullRegistration
		updateFilmFullRegistration(
			com.nbp.film.stages.services.model.FilmFullRegistration
				filmFullRegistration) {

		return _filmFullRegistrationLocalService.updateFilmFullRegistration(
			filmFullRegistration);
	}

	@Override
	public com.nbp.film.stages.services.model.FilmFullRegistration
		updateFilmFullRegistration(
			String caseId, String nameofapplicant, String productionType,
			String registrationNumber, java.util.Date dateofRegistrationPermit,
			String productionTitle, java.util.Date productionDateFrom,
			java.util.Date productionDateTo, String termsAndConditions) {

		return _filmFullRegistrationLocalService.updateFilmFullRegistration(
			caseId, nameofapplicant, productionType, registrationNumber,
			dateofRegistrationPermit, productionTitle, productionDateFrom,
			productionDateTo, termsAndConditions);
	}

	@Override
	public com.nbp.film.stages.services.model.FilmFullRegistration
		updateFilmFullRegistration(
			String caseId, String duration, String nameofapplicant,
			String productionType, String registrationNumber,
			java.util.Date dateofRegistrationPermit, String productionTitle,
			java.util.Date productionDateFrom, java.util.Date productionDateTo,
			String termsAndConditions) {

		return _filmFullRegistrationLocalService.updateFilmFullRegistration(
			caseId, duration, nameofapplicant, productionType,
			registrationNumber, dateofRegistrationPermit, productionTitle,
			productionDateFrom, productionDateTo, termsAndConditions);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _filmFullRegistrationLocalService.getBasePersistence();
	}

	@Override
	public FilmFullRegistrationLocalService getWrappedService() {
		return _filmFullRegistrationLocalService;
	}

	@Override
	public void setWrappedService(
		FilmFullRegistrationLocalService filmFullRegistrationLocalService) {

		_filmFullRegistrationLocalService = filmFullRegistrationLocalService;
	}

	private FilmFullRegistrationLocalService _filmFullRegistrationLocalService;

}