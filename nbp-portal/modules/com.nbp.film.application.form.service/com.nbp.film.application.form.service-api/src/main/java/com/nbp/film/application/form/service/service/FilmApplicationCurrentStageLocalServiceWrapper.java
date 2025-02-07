/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FilmApplicationCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationCurrentStageLocalService
 * @generated
 */
public class FilmApplicationCurrentStageLocalServiceWrapper
	implements FilmApplicationCurrentStageLocalService,
			   ServiceWrapper<FilmApplicationCurrentStageLocalService> {

	public FilmApplicationCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public FilmApplicationCurrentStageLocalServiceWrapper(
		FilmApplicationCurrentStageLocalService
			filmApplicationCurrentStageLocalService) {

		_filmApplicationCurrentStageLocalService =
			filmApplicationCurrentStageLocalService;
	}

	/**
	 * Adds the film application current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationCurrentStage the film application current stage
	 * @return the film application current stage that was added
	 */
	@Override
	public
		com.nbp.film.application.form.service.model.FilmApplicationCurrentStage
			addFilmApplicationCurrentStage(
				com.nbp.film.application.form.service.model.
					FilmApplicationCurrentStage filmApplicationCurrentStage) {

		return _filmApplicationCurrentStageLocalService.
			addFilmApplicationCurrentStage(filmApplicationCurrentStage);
	}

	/**
	 * Creates a new film application current stage with the primary key. Does not add the film application current stage to the database.
	 *
	 * @param filmApplicationCurrentStageId the primary key for the new film application current stage
	 * @return the new film application current stage
	 */
	@Override
	public
		com.nbp.film.application.form.service.model.FilmApplicationCurrentStage
			createFilmApplicationCurrentStage(
				long filmApplicationCurrentStageId) {

		return _filmApplicationCurrentStageLocalService.
			createFilmApplicationCurrentStage(filmApplicationCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the film application current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationCurrentStage the film application current stage
	 * @return the film application current stage that was removed
	 */
	@Override
	public
		com.nbp.film.application.form.service.model.FilmApplicationCurrentStage
			deleteFilmApplicationCurrentStage(
				com.nbp.film.application.form.service.model.
					FilmApplicationCurrentStage filmApplicationCurrentStage) {

		return _filmApplicationCurrentStageLocalService.
			deleteFilmApplicationCurrentStage(filmApplicationCurrentStage);
	}

	/**
	 * Deletes the film application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationCurrentStageId the primary key of the film application current stage
	 * @return the film application current stage that was removed
	 * @throws PortalException if a film application current stage with the primary key could not be found
	 */
	@Override
	public
		com.nbp.film.application.form.service.model.FilmApplicationCurrentStage
				deleteFilmApplicationCurrentStage(
					long filmApplicationCurrentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationCurrentStageLocalService.
			deleteFilmApplicationCurrentStage(filmApplicationCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _filmApplicationCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _filmApplicationCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _filmApplicationCurrentStageLocalService.dynamicQuery();
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

		return _filmApplicationCurrentStageLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmApplicationCurrentStageModelImpl</code>.
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

		return _filmApplicationCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmApplicationCurrentStageModelImpl</code>.
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

		return _filmApplicationCurrentStageLocalService.dynamicQuery(
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

		return _filmApplicationCurrentStageLocalService.dynamicQueryCount(
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

		return _filmApplicationCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.film.application.form.service.model.FilmApplicationCurrentStage
			fetchFilmApplicationCurrentStage(
				long filmApplicationCurrentStageId) {

		return _filmApplicationCurrentStageLocalService.
			fetchFilmApplicationCurrentStage(filmApplicationCurrentStageId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _filmApplicationCurrentStageLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the film application current stage with the primary key.
	 *
	 * @param filmApplicationCurrentStageId the primary key of the film application current stage
	 * @return the film application current stage
	 * @throws PortalException if a film application current stage with the primary key could not be found
	 */
	@Override
	public
		com.nbp.film.application.form.service.model.FilmApplicationCurrentStage
				getFilmApplicationCurrentStage(
					long filmApplicationCurrentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationCurrentStageLocalService.
			getFilmApplicationCurrentStage(filmApplicationCurrentStageId);
	}

	/**
	 * Returns a range of all the film application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application current stages
	 * @param end the upper bound of the range of film application current stages (not inclusive)
	 * @return the range of film application current stages
	 */
	@Override
	public java.util.List
		<com.nbp.film.application.form.service.model.
			FilmApplicationCurrentStage> getFilmApplicationCurrentStages(
				int start, int end) {

		return _filmApplicationCurrentStageLocalService.
			getFilmApplicationCurrentStages(start, end);
	}

	/**
	 * Returns the number of film application current stages.
	 *
	 * @return the number of film application current stages
	 */
	@Override
	public int getFilmApplicationCurrentStagesCount() {
		return _filmApplicationCurrentStageLocalService.
			getFilmApplicationCurrentStagesCount();
	}

	@Override
	public
		com.nbp.film.application.form.service.model.FilmApplicationCurrentStage
				getFilmById(long filmApplicationId)
			throws com.nbp.film.application.form.service.exception.
				NoSuchFilmApplicationCurrentStageException {

		return _filmApplicationCurrentStageLocalService.getFilmById(
			filmApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _filmApplicationCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmApplicationCurrentStageLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationCurrentStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the film application current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationCurrentStage the film application current stage
	 * @return the film application current stage that was updated
	 */
	@Override
	public
		com.nbp.film.application.form.service.model.FilmApplicationCurrentStage
			updateFilmApplicationCurrentStage(
				com.nbp.film.application.form.service.model.
					FilmApplicationCurrentStage filmApplicationCurrentStage) {

		return _filmApplicationCurrentStageLocalService.
			updateFilmApplicationCurrentStage(filmApplicationCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _filmApplicationCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public FilmApplicationCurrentStageLocalService getWrappedService() {
		return _filmApplicationCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		FilmApplicationCurrentStageLocalService
			filmApplicationCurrentStageLocalService) {

		_filmApplicationCurrentStageLocalService =
			filmApplicationCurrentStageLocalService;
	}

	private FilmApplicationCurrentStageLocalService
		_filmApplicationCurrentStageLocalService;

}