/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FilmOtherDetailsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmOtherDetailsLocalService
 * @generated
 */
public class FilmOtherDetailsLocalServiceWrapper
	implements FilmOtherDetailsLocalService,
			   ServiceWrapper<FilmOtherDetailsLocalService> {

	public FilmOtherDetailsLocalServiceWrapper() {
		this(null);
	}

	public FilmOtherDetailsLocalServiceWrapper(
		FilmOtherDetailsLocalService filmOtherDetailsLocalService) {

		_filmOtherDetailsLocalService = filmOtherDetailsLocalService;
	}

	/**
	 * Adds the film other details to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmOtherDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmOtherDetails the film other details
	 * @return the film other details that was added
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmOtherDetails
		addFilmOtherDetails(
			com.nbp.film.application.form.service.model.FilmOtherDetails
				filmOtherDetails) {

		return _filmOtherDetailsLocalService.addFilmOtherDetails(
			filmOtherDetails);
	}

	/**
	 * Creates a new film other details with the primary key. Does not add the film other details to the database.
	 *
	 * @param filmOtherDetailsId the primary key for the new film other details
	 * @return the new film other details
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmOtherDetails
		createFilmOtherDetails(long filmOtherDetailsId) {

		return _filmOtherDetailsLocalService.createFilmOtherDetails(
			filmOtherDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmOtherDetailsLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the film other details from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmOtherDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmOtherDetails the film other details
	 * @return the film other details that was removed
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmOtherDetails
		deleteFilmOtherDetails(
			com.nbp.film.application.form.service.model.FilmOtherDetails
				filmOtherDetails) {

		return _filmOtherDetailsLocalService.deleteFilmOtherDetails(
			filmOtherDetails);
	}

	/**
	 * Deletes the film other details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmOtherDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmOtherDetailsId the primary key of the film other details
	 * @return the film other details that was removed
	 * @throws PortalException if a film other details with the primary key could not be found
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmOtherDetails
			deleteFilmOtherDetails(long filmOtherDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmOtherDetailsLocalService.deleteFilmOtherDetails(
			filmOtherDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmOtherDetailsLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _filmOtherDetailsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _filmOtherDetailsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _filmOtherDetailsLocalService.dynamicQuery();
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

		return _filmOtherDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmOtherDetailsModelImpl</code>.
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

		return _filmOtherDetailsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmOtherDetailsModelImpl</code>.
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

		return _filmOtherDetailsLocalService.dynamicQuery(
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

		return _filmOtherDetailsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _filmOtherDetailsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.film.application.form.service.model.FilmOtherDetails
		fetchFilmOtherDetails(long filmOtherDetailsId) {

		return _filmOtherDetailsLocalService.fetchFilmOtherDetails(
			filmOtherDetailsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _filmOtherDetailsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.film.application.form.service.model.FilmOtherDetails
		getFilmById(long filmById) {

		return _filmOtherDetailsLocalService.getFilmById(filmById);
	}

	/**
	 * Returns the film other details with the primary key.
	 *
	 * @param filmOtherDetailsId the primary key of the film other details
	 * @return the film other details
	 * @throws PortalException if a film other details with the primary key could not be found
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmOtherDetails
			getFilmOtherDetails(long filmOtherDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmOtherDetailsLocalService.getFilmOtherDetails(
			filmOtherDetailsId);
	}

	/**
	 * Returns a range of all the film other detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmOtherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film other detailses
	 * @param end the upper bound of the range of film other detailses (not inclusive)
	 * @return the range of film other detailses
	 */
	@Override
	public java.util.List
		<com.nbp.film.application.form.service.model.FilmOtherDetails>
			getFilmOtherDetailses(int start, int end) {

		return _filmOtherDetailsLocalService.getFilmOtherDetailses(start, end);
	}

	/**
	 * Returns the number of film other detailses.
	 *
	 * @return the number of film other detailses
	 */
	@Override
	public int getFilmOtherDetailsesCount() {
		return _filmOtherDetailsLocalService.getFilmOtherDetailsesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _filmOtherDetailsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmOtherDetailsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmOtherDetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the film other details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmOtherDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmOtherDetails the film other details
	 * @return the film other details that was updated
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmOtherDetails
		updateFilmOtherDetails(
			com.nbp.film.application.form.service.model.FilmOtherDetails
				filmOtherDetails) {

		return _filmOtherDetailsLocalService.updateFilmOtherDetails(
			filmOtherDetails);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _filmOtherDetailsLocalService.getBasePersistence();
	}

	@Override
	public FilmOtherDetailsLocalService getWrappedService() {
		return _filmOtherDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		FilmOtherDetailsLocalService filmOtherDetailsLocalService) {

		_filmOtherDetailsLocalService = filmOtherDetailsLocalService;
	}

	private FilmOtherDetailsLocalService _filmOtherDetailsLocalService;

}