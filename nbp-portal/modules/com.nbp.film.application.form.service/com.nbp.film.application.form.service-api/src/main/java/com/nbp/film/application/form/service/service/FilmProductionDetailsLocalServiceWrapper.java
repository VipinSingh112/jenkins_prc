/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FilmProductionDetailsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmProductionDetailsLocalService
 * @generated
 */
public class FilmProductionDetailsLocalServiceWrapper
	implements FilmProductionDetailsLocalService,
			   ServiceWrapper<FilmProductionDetailsLocalService> {

	public FilmProductionDetailsLocalServiceWrapper() {
		this(null);
	}

	public FilmProductionDetailsLocalServiceWrapper(
		FilmProductionDetailsLocalService filmProductionDetailsLocalService) {

		_filmProductionDetailsLocalService = filmProductionDetailsLocalService;
	}

	/**
	 * Adds the film production details to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmProductionDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmProductionDetails the film production details
	 * @return the film production details that was added
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmProductionDetails
		addFilmProductionDetails(
			com.nbp.film.application.form.service.model.FilmProductionDetails
				filmProductionDetails) {

		return _filmProductionDetailsLocalService.addFilmProductionDetails(
			filmProductionDetails);
	}

	/**
	 * Creates a new film production details with the primary key. Does not add the film production details to the database.
	 *
	 * @param filmProductionDetailsId the primary key for the new film production details
	 * @return the new film production details
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmProductionDetails
		createFilmProductionDetails(long filmProductionDetailsId) {

		return _filmProductionDetailsLocalService.createFilmProductionDetails(
			filmProductionDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmProductionDetailsLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the film production details from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmProductionDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmProductionDetails the film production details
	 * @return the film production details that was removed
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmProductionDetails
		deleteFilmProductionDetails(
			com.nbp.film.application.form.service.model.FilmProductionDetails
				filmProductionDetails) {

		return _filmProductionDetailsLocalService.deleteFilmProductionDetails(
			filmProductionDetails);
	}

	/**
	 * Deletes the film production details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmProductionDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmProductionDetailsId the primary key of the film production details
	 * @return the film production details that was removed
	 * @throws PortalException if a film production details with the primary key could not be found
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmProductionDetails
			deleteFilmProductionDetails(long filmProductionDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmProductionDetailsLocalService.deleteFilmProductionDetails(
			filmProductionDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmProductionDetailsLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _filmProductionDetailsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _filmProductionDetailsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _filmProductionDetailsLocalService.dynamicQuery();
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

		return _filmProductionDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmProductionDetailsModelImpl</code>.
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

		return _filmProductionDetailsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmProductionDetailsModelImpl</code>.
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

		return _filmProductionDetailsLocalService.dynamicQuery(
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

		return _filmProductionDetailsLocalService.dynamicQueryCount(
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

		return _filmProductionDetailsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.film.application.form.service.model.FilmProductionDetails
		fetchFilmProductionDetails(long filmProductionDetailsId) {

		return _filmProductionDetailsLocalService.fetchFilmProductionDetails(
			filmProductionDetailsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _filmProductionDetailsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.film.application.form.service.model.FilmProductionDetails
		getFilmById(long filmById) {

		return _filmProductionDetailsLocalService.getFilmById(filmById);
	}

	/**
	 * Returns the film production details with the primary key.
	 *
	 * @param filmProductionDetailsId the primary key of the film production details
	 * @return the film production details
	 * @throws PortalException if a film production details with the primary key could not be found
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmProductionDetails
			getFilmProductionDetails(long filmProductionDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmProductionDetailsLocalService.getFilmProductionDetails(
			filmProductionDetailsId);
	}

	/**
	 * Returns a range of all the film production detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmProductionDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film production detailses
	 * @param end the upper bound of the range of film production detailses (not inclusive)
	 * @return the range of film production detailses
	 */
	@Override
	public java.util.List
		<com.nbp.film.application.form.service.model.FilmProductionDetails>
			getFilmProductionDetailses(int start, int end) {

		return _filmProductionDetailsLocalService.getFilmProductionDetailses(
			start, end);
	}

	/**
	 * Returns the number of film production detailses.
	 *
	 * @return the number of film production detailses
	 */
	@Override
	public int getFilmProductionDetailsesCount() {
		return _filmProductionDetailsLocalService.
			getFilmProductionDetailsesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _filmProductionDetailsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmProductionDetailsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmProductionDetailsLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the film production details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmProductionDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmProductionDetails the film production details
	 * @return the film production details that was updated
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmProductionDetails
		updateFilmProductionDetails(
			com.nbp.film.application.form.service.model.FilmProductionDetails
				filmProductionDetails) {

		return _filmProductionDetailsLocalService.updateFilmProductionDetails(
			filmProductionDetails);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _filmProductionDetailsLocalService.getBasePersistence();
	}

	@Override
	public FilmProductionDetailsLocalService getWrappedService() {
		return _filmProductionDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		FilmProductionDetailsLocalService filmProductionDetailsLocalService) {

		_filmProductionDetailsLocalService = filmProductionDetailsLocalService;
	}

	private FilmProductionDetailsLocalService
		_filmProductionDetailsLocalService;

}