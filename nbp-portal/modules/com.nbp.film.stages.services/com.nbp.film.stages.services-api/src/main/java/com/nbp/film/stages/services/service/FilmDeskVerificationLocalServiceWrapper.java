/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FilmDeskVerificationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmDeskVerificationLocalService
 * @generated
 */
public class FilmDeskVerificationLocalServiceWrapper
	implements FilmDeskVerificationLocalService,
			   ServiceWrapper<FilmDeskVerificationLocalService> {

	public FilmDeskVerificationLocalServiceWrapper() {
		this(null);
	}

	public FilmDeskVerificationLocalServiceWrapper(
		FilmDeskVerificationLocalService filmDeskVerificationLocalService) {

		_filmDeskVerificationLocalService = filmDeskVerificationLocalService;
	}

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
	@Override
	public com.nbp.film.stages.services.model.FilmDeskVerification
		addFilmDeskVerification(
			com.nbp.film.stages.services.model.FilmDeskVerification
				filmDeskVerification) {

		return _filmDeskVerificationLocalService.addFilmDeskVerification(
			filmDeskVerification);
	}

	/**
	 * Creates a new film desk verification with the primary key. Does not add the film desk verification to the database.
	 *
	 * @param filmDeskVerificaId the primary key for the new film desk verification
	 * @return the new film desk verification
	 */
	@Override
	public com.nbp.film.stages.services.model.FilmDeskVerification
		createFilmDeskVerification(long filmDeskVerificaId) {

		return _filmDeskVerificationLocalService.createFilmDeskVerification(
			filmDeskVerificaId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmDeskVerificationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void deleteFilmByDeskVerificationId(long filmApplicationId) {
		_filmDeskVerificationLocalService.deleteFilmByDeskVerificationId(
			filmApplicationId);
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
	@Override
	public com.nbp.film.stages.services.model.FilmDeskVerification
		deleteFilmDeskVerification(
			com.nbp.film.stages.services.model.FilmDeskVerification
				filmDeskVerification) {

		return _filmDeskVerificationLocalService.deleteFilmDeskVerification(
			filmDeskVerification);
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
	@Override
	public com.nbp.film.stages.services.model.FilmDeskVerification
			deleteFilmDeskVerification(long filmDeskVerificaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmDeskVerificationLocalService.deleteFilmDeskVerification(
			filmDeskVerificaId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmDeskVerificationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _filmDeskVerificationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _filmDeskVerificationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _filmDeskVerificationLocalService.dynamicQuery();
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

		return _filmDeskVerificationLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _filmDeskVerificationLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _filmDeskVerificationLocalService.dynamicQuery(
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

		return _filmDeskVerificationLocalService.dynamicQueryCount(
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

		return _filmDeskVerificationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.film.stages.services.model.FilmDeskVerification
		fetchFilmDeskVerification(long filmDeskVerificaId) {

		return _filmDeskVerificationLocalService.fetchFilmDeskVerification(
			filmDeskVerificaId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _filmDeskVerificationLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.film.stages.services.model.FilmDeskVerification>
			getDeskVerificationFilmById(long filmApplicationId) {

		return _filmDeskVerificationLocalService.getDeskVerificationFilmById(
			filmApplicationId);
	}

	/**
	 * Returns the film desk verification with the primary key.
	 *
	 * @param filmDeskVerificaId the primary key of the film desk verification
	 * @return the film desk verification
	 * @throws PortalException if a film desk verification with the primary key could not be found
	 */
	@Override
	public com.nbp.film.stages.services.model.FilmDeskVerification
			getFilmDeskVerification(long filmDeskVerificaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmDeskVerificationLocalService.getFilmDeskVerification(
			filmDeskVerificaId);
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
	@Override
	public java.util.List
		<com.nbp.film.stages.services.model.FilmDeskVerification>
			getFilmDeskVerifications(int start, int end) {

		return _filmDeskVerificationLocalService.getFilmDeskVerifications(
			start, end);
	}

	/**
	 * Returns the number of film desk verifications.
	 *
	 * @return the number of film desk verifications
	 */
	@Override
	public int getFilmDeskVerificationsCount() {
		return _filmDeskVerificationLocalService.
			getFilmDeskVerificationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _filmDeskVerificationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmDeskVerificationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmDeskVerificationLocalService.getPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.film.stages.services.model.FilmDeskVerification
		updateFilmDeskVerification(
			com.nbp.film.stages.services.model.FilmDeskVerification
				filmDeskVerification) {

		return _filmDeskVerificationLocalService.updateFilmDeskVerification(
			filmDeskVerification);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _filmDeskVerificationLocalService.getBasePersistence();
	}

	@Override
	public FilmDeskVerificationLocalService getWrappedService() {
		return _filmDeskVerificationLocalService;
	}

	@Override
	public void setWrappedService(
		FilmDeskVerificationLocalService filmDeskVerificationLocalService) {

		_filmDeskVerificationLocalService = filmDeskVerificationLocalService;
	}

	private FilmDeskVerificationLocalService _filmDeskVerificationLocalService;

}