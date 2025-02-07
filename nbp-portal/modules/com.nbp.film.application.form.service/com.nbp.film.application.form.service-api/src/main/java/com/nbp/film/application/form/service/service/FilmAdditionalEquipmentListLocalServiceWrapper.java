/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FilmAdditionalEquipmentListLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmAdditionalEquipmentListLocalService
 * @generated
 */
public class FilmAdditionalEquipmentListLocalServiceWrapper
	implements FilmAdditionalEquipmentListLocalService,
			   ServiceWrapper<FilmAdditionalEquipmentListLocalService> {

	public FilmAdditionalEquipmentListLocalServiceWrapper() {
		this(null);
	}

	public FilmAdditionalEquipmentListLocalServiceWrapper(
		FilmAdditionalEquipmentListLocalService
			filmAdditionalEquipmentListLocalService) {

		_filmAdditionalEquipmentListLocalService =
			filmAdditionalEquipmentListLocalService;
	}

	/**
	 * Adds the film additional equipment list to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmAdditionalEquipmentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmAdditionalEquipmentList the film additional equipment list
	 * @return the film additional equipment list that was added
	 */
	@Override
	public
		com.nbp.film.application.form.service.model.FilmAdditionalEquipmentList
			addFilmAdditionalEquipmentList(
				com.nbp.film.application.form.service.model.
					FilmAdditionalEquipmentList filmAdditionalEquipmentList) {

		return _filmAdditionalEquipmentListLocalService.
			addFilmAdditionalEquipmentList(filmAdditionalEquipmentList);
	}

	/**
	 * Creates a new film additional equipment list with the primary key. Does not add the film additional equipment list to the database.
	 *
	 * @param FilmAdditionalEquipmentListId the primary key for the new film additional equipment list
	 * @return the new film additional equipment list
	 */
	@Override
	public
		com.nbp.film.application.form.service.model.FilmAdditionalEquipmentList
			createFilmAdditionalEquipmentList(
				long FilmAdditionalEquipmentListId) {

		return _filmAdditionalEquipmentListLocalService.
			createFilmAdditionalEquipmentList(FilmAdditionalEquipmentListId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmAdditionalEquipmentListLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the film additional equipment list from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmAdditionalEquipmentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmAdditionalEquipmentList the film additional equipment list
	 * @return the film additional equipment list that was removed
	 */
	@Override
	public
		com.nbp.film.application.form.service.model.FilmAdditionalEquipmentList
			deleteFilmAdditionalEquipmentList(
				com.nbp.film.application.form.service.model.
					FilmAdditionalEquipmentList filmAdditionalEquipmentList) {

		return _filmAdditionalEquipmentListLocalService.
			deleteFilmAdditionalEquipmentList(filmAdditionalEquipmentList);
	}

	/**
	 * Deletes the film additional equipment list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmAdditionalEquipmentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param FilmAdditionalEquipmentListId the primary key of the film additional equipment list
	 * @return the film additional equipment list that was removed
	 * @throws PortalException if a film additional equipment list with the primary key could not be found
	 */
	@Override
	public
		com.nbp.film.application.form.service.model.FilmAdditionalEquipmentList
				deleteFilmAdditionalEquipmentList(
					long FilmAdditionalEquipmentListId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _filmAdditionalEquipmentListLocalService.
			deleteFilmAdditionalEquipmentList(FilmAdditionalEquipmentListId);
	}

	@Override
	public void deleteMultipleFormData_BY_AppId(long filmApplicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmAdditionalEquipmentListException {

		_filmAdditionalEquipmentListLocalService.
			deleteMultipleFormData_BY_AppId(filmApplicationId);
	}

	@Override
	public void deleteMultipleFormData_BY_Id(long applicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmAdditionalEquipmentListException {

		_filmAdditionalEquipmentListLocalService.deleteMultipleFormData_BY_Id(
			applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmAdditionalEquipmentListLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _filmAdditionalEquipmentListLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _filmAdditionalEquipmentListLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _filmAdditionalEquipmentListLocalService.dynamicQuery();
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

		return _filmAdditionalEquipmentListLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmAdditionalEquipmentListModelImpl</code>.
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

		return _filmAdditionalEquipmentListLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmAdditionalEquipmentListModelImpl</code>.
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

		return _filmAdditionalEquipmentListLocalService.dynamicQuery(
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

		return _filmAdditionalEquipmentListLocalService.dynamicQueryCount(
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

		return _filmAdditionalEquipmentListLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.film.application.form.service.model.FilmAdditionalEquipmentList
			fetchFilmAdditionalEquipmentList(
				long FilmAdditionalEquipmentListId) {

		return _filmAdditionalEquipmentListLocalService.
			fetchFilmAdditionalEquipmentList(FilmAdditionalEquipmentListId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _filmAdditionalEquipmentListLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.film.application.form.service.model.
			FilmAdditionalEquipmentList> getFilmAddEquipByAppId(
				long applicationId) {

		return _filmAdditionalEquipmentListLocalService.getFilmAddEquipByAppId(
			applicationId);
	}

	/**
	 * Returns the film additional equipment list with the primary key.
	 *
	 * @param FilmAdditionalEquipmentListId the primary key of the film additional equipment list
	 * @return the film additional equipment list
	 * @throws PortalException if a film additional equipment list with the primary key could not be found
	 */
	@Override
	public
		com.nbp.film.application.form.service.model.FilmAdditionalEquipmentList
				getFilmAdditionalEquipmentList(
					long FilmAdditionalEquipmentListId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _filmAdditionalEquipmentListLocalService.
			getFilmAdditionalEquipmentList(FilmAdditionalEquipmentListId);
	}

	/**
	 * Returns a range of all the film additional equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmAdditionalEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film additional equipment lists
	 * @param end the upper bound of the range of film additional equipment lists (not inclusive)
	 * @return the range of film additional equipment lists
	 */
	@Override
	public java.util.List
		<com.nbp.film.application.form.service.model.
			FilmAdditionalEquipmentList> getFilmAdditionalEquipmentLists(
				int start, int end) {

		return _filmAdditionalEquipmentListLocalService.
			getFilmAdditionalEquipmentLists(start, end);
	}

	/**
	 * Returns the number of film additional equipment lists.
	 *
	 * @return the number of film additional equipment lists
	 */
	@Override
	public int getFilmAdditionalEquipmentListsCount() {
		return _filmAdditionalEquipmentListLocalService.
			getFilmAdditionalEquipmentListsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _filmAdditionalEquipmentListLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmAdditionalEquipmentListLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmAdditionalEquipmentListLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the film additional equipment list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmAdditionalEquipmentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmAdditionalEquipmentList the film additional equipment list
	 * @return the film additional equipment list that was updated
	 */
	@Override
	public
		com.nbp.film.application.form.service.model.FilmAdditionalEquipmentList
			updateFilmAdditionalEquipmentList(
				com.nbp.film.application.form.service.model.
					FilmAdditionalEquipmentList filmAdditionalEquipmentList) {

		return _filmAdditionalEquipmentListLocalService.
			updateFilmAdditionalEquipmentList(filmAdditionalEquipmentList);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _filmAdditionalEquipmentListLocalService.getBasePersistence();
	}

	@Override
	public FilmAdditionalEquipmentListLocalService getWrappedService() {
		return _filmAdditionalEquipmentListLocalService;
	}

	@Override
	public void setWrappedService(
		FilmAdditionalEquipmentListLocalService
			filmAdditionalEquipmentListLocalService) {

		_filmAdditionalEquipmentListLocalService =
			filmAdditionalEquipmentListLocalService;
	}

	private FilmAdditionalEquipmentListLocalService
		_filmAdditionalEquipmentListLocalService;

}