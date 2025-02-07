/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FilmApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationLocalService
 * @generated
 */
public class FilmApplicationLocalServiceWrapper
	implements FilmApplicationLocalService,
			   ServiceWrapper<FilmApplicationLocalService> {

	public FilmApplicationLocalServiceWrapper() {
		this(null);
	}

	public FilmApplicationLocalServiceWrapper(
		FilmApplicationLocalService filmApplicationLocalService) {

		_filmApplicationLocalService = filmApplicationLocalService;
	}

	/**
	 * Adds the film application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplication the film application
	 * @return the film application that was added
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmApplication
		addFilmApplication(
			com.nbp.film.application.form.service.model.FilmApplication
				filmApplication) {

		return _filmApplicationLocalService.addFilmApplication(filmApplication);
	}

	/**
	 * Creates a new film application with the primary key. Does not add the film application to the database.
	 *
	 * @param filmApplicationId the primary key for the new film application
	 * @return the new film application
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmApplication
		createFilmApplication(long filmApplicationId) {

		return _filmApplicationLocalService.createFilmApplication(
			filmApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the film application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplication the film application
	 * @return the film application that was removed
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmApplication
		deleteFilmApplication(
			com.nbp.film.application.form.service.model.FilmApplication
				filmApplication) {

		return _filmApplicationLocalService.deleteFilmApplication(
			filmApplication);
	}

	/**
	 * Deletes the film application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationId the primary key of the film application
	 * @return the film application that was removed
	 * @throws PortalException if a film application with the primary key could not be found
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmApplication
			deleteFilmApplication(long filmApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationLocalService.deleteFilmApplication(
			filmApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _filmApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _filmApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _filmApplicationLocalService.dynamicQuery();
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

		return _filmApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmApplicationModelImpl</code>.
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

		return _filmApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmApplicationModelImpl</code>.
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

		return _filmApplicationLocalService.dynamicQuery(
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

		return _filmApplicationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _filmApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.film.application.form.service.model.FilmApplication
		fetchFilmApplication(long filmApplicationId) {

		return _filmApplicationLocalService.fetchFilmApplication(
			filmApplicationId);
	}

	/**
	 * Returns the film application matching the UUID and group.
	 *
	 * @param uuid the film application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmApplication
		fetchFilmApplicationByUuidAndGroupId(String uuid, long groupId) {

		return _filmApplicationLocalService.
			fetchFilmApplicationByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _filmApplicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _filmApplicationLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	/**
	 * Returns the film application with the primary key.
	 *
	 * @param filmApplicationId the primary key of the film application
	 * @return the film application
	 * @throws PortalException if a film application with the primary key could not be found
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmApplication
			getFilmApplication(long filmApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationLocalService.getFilmApplication(
			filmApplicationId);
	}

	/**
	 * Returns the film application matching the UUID and group.
	 *
	 * @param uuid the film application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching film application
	 * @throws PortalException if a matching film application could not be found
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmApplication
			getFilmApplicationByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationLocalService.getFilmApplicationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the film applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @return the range of film applications
	 */
	@Override
	public java.util.List
		<com.nbp.film.application.form.service.model.FilmApplication>
			getFilmApplications(int start, int end) {

		return _filmApplicationLocalService.getFilmApplications(start, end);
	}

	/**
	 * Returns all the film applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the film applications
	 * @param companyId the primary key of the company
	 * @return the matching film applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.film.application.form.service.model.FilmApplication>
			getFilmApplicationsByUuidAndCompanyId(String uuid, long companyId) {

		return _filmApplicationLocalService.
			getFilmApplicationsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of film applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the film applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching film applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.film.application.form.service.model.FilmApplication>
			getFilmApplicationsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.film.application.form.service.model.
						FilmApplication> orderByComparator) {

		return _filmApplicationLocalService.
			getFilmApplicationsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of film applications.
	 *
	 * @return the number of film applications
	 */
	@Override
	public int getFilmApplicationsCount() {
		return _filmApplicationLocalService.getFilmApplicationsCount();
	}

	@Override
	public com.nbp.film.application.form.service.model.FilmApplication
			getFilmByAppNo(String filmApplicationNumber)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return _filmApplicationLocalService.getFilmByAppNo(
			filmApplicationNumber);
	}

	@Override
	public com.nbp.film.application.form.service.model.FilmApplication
			getFilmByCaseId(String caseId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return _filmApplicationLocalService.getFilmByCaseId(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.film.application.form.service.model.FilmApplication>
			getFilmByS_U(int status, long userId) {

		return _filmApplicationLocalService.getFilmByS_U(status, userId);
	}

	@Override
	public java.util.List
		<com.nbp.film.application.form.service.model.FilmApplication>
			getFilmByStatus(int status) {

		return _filmApplicationLocalService.getFilmByStatus(status);
	}

	@Override
	public java.util.List<String> getFilmDistinctCategory() {
		return _filmApplicationLocalService.getFilmDistinctCategory();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _filmApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the film application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplication the film application
	 * @return the film application that was updated
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmApplication
		updateFilmApplication(
			com.nbp.film.application.form.service.model.FilmApplication
				filmApplication) {

		return _filmApplicationLocalService.updateFilmApplication(
			filmApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _filmApplicationLocalService.getBasePersistence();
	}

	@Override
	public FilmApplicationLocalService getWrappedService() {
		return _filmApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		FilmApplicationLocalService filmApplicationLocalService) {

		_filmApplicationLocalService = filmApplicationLocalService;
	}

	private FilmApplicationLocalService _filmApplicationLocalService;

}