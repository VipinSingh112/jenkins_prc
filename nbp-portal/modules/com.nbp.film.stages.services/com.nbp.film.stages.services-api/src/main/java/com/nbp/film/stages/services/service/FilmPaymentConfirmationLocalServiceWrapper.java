/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FilmPaymentConfirmationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmPaymentConfirmationLocalService
 * @generated
 */
public class FilmPaymentConfirmationLocalServiceWrapper
	implements FilmPaymentConfirmationLocalService,
			   ServiceWrapper<FilmPaymentConfirmationLocalService> {

	public FilmPaymentConfirmationLocalServiceWrapper() {
		this(null);
	}

	public FilmPaymentConfirmationLocalServiceWrapper(
		FilmPaymentConfirmationLocalService
			filmPaymentConfirmationLocalService) {

		_filmPaymentConfirmationLocalService =
			filmPaymentConfirmationLocalService;
	}

	/**
	 * Adds the film payment confirmation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmPaymentConfirmation the film payment confirmation
	 * @return the film payment confirmation that was added
	 */
	@Override
	public com.nbp.film.stages.services.model.FilmPaymentConfirmation
		addFilmPaymentConfirmation(
			com.nbp.film.stages.services.model.FilmPaymentConfirmation
				filmPaymentConfirmation) {

		return _filmPaymentConfirmationLocalService.addFilmPaymentConfirmation(
			filmPaymentConfirmation);
	}

	/**
	 * Creates a new film payment confirmation with the primary key. Does not add the film payment confirmation to the database.
	 *
	 * @param filmPaymentId the primary key for the new film payment confirmation
	 * @return the new film payment confirmation
	 */
	@Override
	public com.nbp.film.stages.services.model.FilmPaymentConfirmation
		createFilmPaymentConfirmation(long filmPaymentId) {

		return _filmPaymentConfirmationLocalService.
			createFilmPaymentConfirmation(filmPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmPaymentConfirmationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the film payment confirmation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmPaymentConfirmation the film payment confirmation
	 * @return the film payment confirmation that was removed
	 */
	@Override
	public com.nbp.film.stages.services.model.FilmPaymentConfirmation
		deleteFilmPaymentConfirmation(
			com.nbp.film.stages.services.model.FilmPaymentConfirmation
				filmPaymentConfirmation) {

		return _filmPaymentConfirmationLocalService.
			deleteFilmPaymentConfirmation(filmPaymentConfirmation);
	}

	/**
	 * Deletes the film payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmPaymentId the primary key of the film payment confirmation
	 * @return the film payment confirmation that was removed
	 * @throws PortalException if a film payment confirmation with the primary key could not be found
	 */
	@Override
	public com.nbp.film.stages.services.model.FilmPaymentConfirmation
			deleteFilmPaymentConfirmation(long filmPaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmPaymentConfirmationLocalService.
			deleteFilmPaymentConfirmation(filmPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmPaymentConfirmationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _filmPaymentConfirmationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _filmPaymentConfirmationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _filmPaymentConfirmationLocalService.dynamicQuery();
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

		return _filmPaymentConfirmationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.stages.services.model.impl.FilmPaymentConfirmationModelImpl</code>.
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

		return _filmPaymentConfirmationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.stages.services.model.impl.FilmPaymentConfirmationModelImpl</code>.
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

		return _filmPaymentConfirmationLocalService.dynamicQuery(
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

		return _filmPaymentConfirmationLocalService.dynamicQueryCount(
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

		return _filmPaymentConfirmationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.film.stages.services.model.FilmPaymentConfirmation
		fetchFilmPaymentConfirmation(long filmPaymentId) {

		return _filmPaymentConfirmationLocalService.
			fetchFilmPaymentConfirmation(filmPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _filmPaymentConfirmationLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the film payment confirmation with the primary key.
	 *
	 * @param filmPaymentId the primary key of the film payment confirmation
	 * @return the film payment confirmation
	 * @throws PortalException if a film payment confirmation with the primary key could not be found
	 */
	@Override
	public com.nbp.film.stages.services.model.FilmPaymentConfirmation
			getFilmPaymentConfirmation(long filmPaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmPaymentConfirmationLocalService.getFilmPaymentConfirmation(
			filmPaymentId);
	}

	@Override
	public com.nbp.film.stages.services.model.FilmPaymentConfirmation
			getFilmPaymentConfirmationBy_CI(String caseId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmPaymentConfirmationException {

		return _filmPaymentConfirmationLocalService.
			getFilmPaymentConfirmationBy_CI(caseId);
	}

	/**
	 * Returns a range of all the film payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.stages.services.model.impl.FilmPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film payment confirmations
	 * @param end the upper bound of the range of film payment confirmations (not inclusive)
	 * @return the range of film payment confirmations
	 */
	@Override
	public java.util.List
		<com.nbp.film.stages.services.model.FilmPaymentConfirmation>
			getFilmPaymentConfirmations(int start, int end) {

		return _filmPaymentConfirmationLocalService.getFilmPaymentConfirmations(
			start, end);
	}

	@Override
	public java.util.List
		<com.nbp.film.stages.services.model.FilmPaymentConfirmation>
			getFilmPaymentConfirmations_By_CI(String caseId) {

		return _filmPaymentConfirmationLocalService.
			getFilmPaymentConfirmations_By_CI(caseId);
	}

	/**
	 * Returns the number of film payment confirmations.
	 *
	 * @return the number of film payment confirmations
	 */
	@Override
	public int getFilmPaymentConfirmationsCount() {
		return _filmPaymentConfirmationLocalService.
			getFilmPaymentConfirmationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _filmPaymentConfirmationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmPaymentConfirmationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmPaymentConfirmationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the film payment confirmation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmPaymentConfirmation the film payment confirmation
	 * @return the film payment confirmation that was updated
	 */
	@Override
	public com.nbp.film.stages.services.model.FilmPaymentConfirmation
		updateFilmPaymentConfirmation(
			com.nbp.film.stages.services.model.FilmPaymentConfirmation
				filmPaymentConfirmation) {

		return _filmPaymentConfirmationLocalService.
			updateFilmPaymentConfirmation(filmPaymentConfirmation);
	}

	@Override
	public com.nbp.film.stages.services.model.FilmPaymentConfirmation
		updateFilmPaymentConfirmation(
			String caseId, java.util.Date dateReceived, String amountDue,
			String amountReceived, String receiptNumber, String comment,
			String amountOutstanding, java.util.Date dueDate, String status) {

		return _filmPaymentConfirmationLocalService.
			updateFilmPaymentConfirmation(
				caseId, dateReceived, amountDue, amountReceived, receiptNumber,
				comment, amountOutstanding, dueDate, status);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _filmPaymentConfirmationLocalService.getBasePersistence();
	}

	@Override
	public FilmPaymentConfirmationLocalService getWrappedService() {
		return _filmPaymentConfirmationLocalService;
	}

	@Override
	public void setWrappedService(
		FilmPaymentConfirmationLocalService
			filmPaymentConfirmationLocalService) {

		_filmPaymentConfirmationLocalService =
			filmPaymentConfirmationLocalService;
	}

	private FilmPaymentConfirmationLocalService
		_filmPaymentConfirmationLocalService;

}