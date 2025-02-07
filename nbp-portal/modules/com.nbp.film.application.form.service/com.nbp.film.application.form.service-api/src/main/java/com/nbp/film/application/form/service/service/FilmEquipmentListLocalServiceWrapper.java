/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FilmEquipmentListLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmEquipmentListLocalService
 * @generated
 */
public class FilmEquipmentListLocalServiceWrapper
	implements FilmEquipmentListLocalService,
			   ServiceWrapper<FilmEquipmentListLocalService> {

	public FilmEquipmentListLocalServiceWrapper() {
		this(null);
	}

	public FilmEquipmentListLocalServiceWrapper(
		FilmEquipmentListLocalService filmEquipmentListLocalService) {

		_filmEquipmentListLocalService = filmEquipmentListLocalService;
	}

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
	@Override
	public com.nbp.film.application.form.service.model.FilmEquipmentList
		addFilmEquipmentList(
			com.nbp.film.application.form.service.model.FilmEquipmentList
				filmEquipmentList) {

		return _filmEquipmentListLocalService.addFilmEquipmentList(
			filmEquipmentList);
	}

	/**
	 * Creates a new film equipment list with the primary key. Does not add the film equipment list to the database.
	 *
	 * @param filmEquipmentListId the primary key for the new film equipment list
	 * @return the new film equipment list
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmEquipmentList
		createFilmEquipmentList(long filmEquipmentListId) {

		return _filmEquipmentListLocalService.createFilmEquipmentList(
			filmEquipmentListId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmEquipmentListLocalService.createPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.film.application.form.service.model.FilmEquipmentList
		deleteFilmEquipmentList(
			com.nbp.film.application.form.service.model.FilmEquipmentList
				filmEquipmentList) {

		return _filmEquipmentListLocalService.deleteFilmEquipmentList(
			filmEquipmentList);
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
	@Override
	public com.nbp.film.application.form.service.model.FilmEquipmentList
			deleteFilmEquipmentList(long filmEquipmentListId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmEquipmentListLocalService.deleteFilmEquipmentList(
			filmEquipmentListId);
	}

	@Override
	public void deleteMultipleFormData_BY_AppId(long applicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmEquipmentListException {

		_filmEquipmentListLocalService.deleteMultipleFormData_BY_AppId(
			applicationId);
	}

	@Override
	public void deleteMultipleFormData_BY_Id(long applicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmEquipmentListException {

		_filmEquipmentListLocalService.deleteMultipleFormData_BY_Id(
			applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmEquipmentListLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _filmEquipmentListLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _filmEquipmentListLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _filmEquipmentListLocalService.dynamicQuery();
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

		return _filmEquipmentListLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _filmEquipmentListLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _filmEquipmentListLocalService.dynamicQuery(
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

		return _filmEquipmentListLocalService.dynamicQueryCount(dynamicQuery);
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

		return _filmEquipmentListLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.film.application.form.service.model.FilmEquipmentList
		fetchFilmEquipmentList(long filmEquipmentListId) {

		return _filmEquipmentListLocalService.fetchFilmEquipmentList(
			filmEquipmentListId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _filmEquipmentListLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.film.application.form.service.model.FilmEquipmentList>
			getFilmByAppId(long applicationId) {

		return _filmEquipmentListLocalService.getFilmByAppId(applicationId);
	}

	@Override
	public com.nbp.film.application.form.service.model.FilmEquipmentList
		getFilmById(long filmById) {

		return _filmEquipmentListLocalService.getFilmById(filmById);
	}

	/**
	 * Returns the film equipment list with the primary key.
	 *
	 * @param filmEquipmentListId the primary key of the film equipment list
	 * @return the film equipment list
	 * @throws PortalException if a film equipment list with the primary key could not be found
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmEquipmentList
			getFilmEquipmentList(long filmEquipmentListId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmEquipmentListLocalService.getFilmEquipmentList(
			filmEquipmentListId);
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
	@Override
	public java.util.List
		<com.nbp.film.application.form.service.model.FilmEquipmentList>
			getFilmEquipmentLists(int start, int end) {

		return _filmEquipmentListLocalService.getFilmEquipmentLists(start, end);
	}

	/**
	 * Returns the number of film equipment lists.
	 *
	 * @return the number of film equipment lists
	 */
	@Override
	public int getFilmEquipmentListsCount() {
		return _filmEquipmentListLocalService.getFilmEquipmentListsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _filmEquipmentListLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmEquipmentListLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmEquipmentListLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public com.nbp.film.application.form.service.model.FilmEquipmentList
		updateFilmEquipmentList(
			com.nbp.film.application.form.service.model.FilmEquipmentList
				filmEquipmentList) {

		return _filmEquipmentListLocalService.updateFilmEquipmentList(
			filmEquipmentList);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _filmEquipmentListLocalService.getBasePersistence();
	}

	@Override
	public FilmEquipmentListLocalService getWrappedService() {
		return _filmEquipmentListLocalService;
	}

	@Override
	public void setWrappedService(
		FilmEquipmentListLocalService filmEquipmentListLocalService) {

		_filmEquipmentListLocalService = filmEquipmentListLocalService;
	}

	private FilmEquipmentListLocalService _filmEquipmentListLocalService;

}