/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FilmCompanyDetailsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmCompanyDetailsLocalService
 * @generated
 */
public class FilmCompanyDetailsLocalServiceWrapper
	implements FilmCompanyDetailsLocalService,
			   ServiceWrapper<FilmCompanyDetailsLocalService> {

	public FilmCompanyDetailsLocalServiceWrapper() {
		this(null);
	}

	public FilmCompanyDetailsLocalServiceWrapper(
		FilmCompanyDetailsLocalService filmCompanyDetailsLocalService) {

		_filmCompanyDetailsLocalService = filmCompanyDetailsLocalService;
	}

	/**
	 * Adds the film company details to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmCompanyDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmCompanyDetails the film company details
	 * @return the film company details that was added
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmCompanyDetails
		addFilmCompanyDetails(
			com.nbp.film.application.form.service.model.FilmCompanyDetails
				filmCompanyDetails) {

		return _filmCompanyDetailsLocalService.addFilmCompanyDetails(
			filmCompanyDetails);
	}

	/**
	 * Creates a new film company details with the primary key. Does not add the film company details to the database.
	 *
	 * @param filmCompanyDetailsId the primary key for the new film company details
	 * @return the new film company details
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmCompanyDetails
		createFilmCompanyDetails(long filmCompanyDetailsId) {

		return _filmCompanyDetailsLocalService.createFilmCompanyDetails(
			filmCompanyDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmCompanyDetailsLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the film company details from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmCompanyDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmCompanyDetails the film company details
	 * @return the film company details that was removed
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmCompanyDetails
		deleteFilmCompanyDetails(
			com.nbp.film.application.form.service.model.FilmCompanyDetails
				filmCompanyDetails) {

		return _filmCompanyDetailsLocalService.deleteFilmCompanyDetails(
			filmCompanyDetails);
	}

	/**
	 * Deletes the film company details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmCompanyDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmCompanyDetailsId the primary key of the film company details
	 * @return the film company details that was removed
	 * @throws PortalException if a film company details with the primary key could not be found
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmCompanyDetails
			deleteFilmCompanyDetails(long filmCompanyDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmCompanyDetailsLocalService.deleteFilmCompanyDetails(
			filmCompanyDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmCompanyDetailsLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _filmCompanyDetailsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _filmCompanyDetailsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _filmCompanyDetailsLocalService.dynamicQuery();
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

		return _filmCompanyDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmCompanyDetailsModelImpl</code>.
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

		return _filmCompanyDetailsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmCompanyDetailsModelImpl</code>.
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

		return _filmCompanyDetailsLocalService.dynamicQuery(
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

		return _filmCompanyDetailsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _filmCompanyDetailsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.film.application.form.service.model.FilmCompanyDetails
		fetchFilmCompanyDetails(long filmCompanyDetailsId) {

		return _filmCompanyDetailsLocalService.fetchFilmCompanyDetails(
			filmCompanyDetailsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _filmCompanyDetailsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.film.application.form.service.model.FilmCompanyDetails
		getFilmById(long filmById) {

		return _filmCompanyDetailsLocalService.getFilmById(filmById);
	}

	/**
	 * Returns the film company details with the primary key.
	 *
	 * @param filmCompanyDetailsId the primary key of the film company details
	 * @return the film company details
	 * @throws PortalException if a film company details with the primary key could not be found
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmCompanyDetails
			getFilmCompanyDetails(long filmCompanyDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmCompanyDetailsLocalService.getFilmCompanyDetails(
			filmCompanyDetailsId);
	}

	/**
	 * Returns a range of all the film company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmCompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film company detailses
	 * @param end the upper bound of the range of film company detailses (not inclusive)
	 * @return the range of film company detailses
	 */
	@Override
	public java.util.List
		<com.nbp.film.application.form.service.model.FilmCompanyDetails>
			getFilmCompanyDetailses(int start, int end) {

		return _filmCompanyDetailsLocalService.getFilmCompanyDetailses(
			start, end);
	}

	/**
	 * Returns the number of film company detailses.
	 *
	 * @return the number of film company detailses
	 */
	@Override
	public int getFilmCompanyDetailsesCount() {
		return _filmCompanyDetailsLocalService.getFilmCompanyDetailsesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _filmCompanyDetailsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmCompanyDetailsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmCompanyDetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the film company details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmCompanyDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmCompanyDetails the film company details
	 * @return the film company details that was updated
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmCompanyDetails
		updateFilmCompanyDetails(
			com.nbp.film.application.form.service.model.FilmCompanyDetails
				filmCompanyDetails) {

		return _filmCompanyDetailsLocalService.updateFilmCompanyDetails(
			filmCompanyDetails);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _filmCompanyDetailsLocalService.getBasePersistence();
	}

	@Override
	public FilmCompanyDetailsLocalService getWrappedService() {
		return _filmCompanyDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		FilmCompanyDetailsLocalService filmCompanyDetailsLocalService) {

		_filmCompanyDetailsLocalService = filmCompanyDetailsLocalService;
	}

	private FilmCompanyDetailsLocalService _filmCompanyDetailsLocalService;

}