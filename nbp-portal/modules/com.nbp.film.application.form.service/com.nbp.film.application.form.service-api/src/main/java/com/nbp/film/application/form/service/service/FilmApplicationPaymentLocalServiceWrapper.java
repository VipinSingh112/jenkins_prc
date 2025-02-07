/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FilmApplicationPaymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationPaymentLocalService
 * @generated
 */
public class FilmApplicationPaymentLocalServiceWrapper
	implements FilmApplicationPaymentLocalService,
			   ServiceWrapper<FilmApplicationPaymentLocalService> {

	public FilmApplicationPaymentLocalServiceWrapper() {
		this(null);
	}

	public FilmApplicationPaymentLocalServiceWrapper(
		FilmApplicationPaymentLocalService filmApplicationPaymentLocalService) {

		_filmApplicationPaymentLocalService =
			filmApplicationPaymentLocalService;
	}

	/**
	 * Adds the film application payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationPayment the film application payment
	 * @return the film application payment that was added
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmApplicationPayment
		addFilmApplicationPayment(
			com.nbp.film.application.form.service.model.FilmApplicationPayment
				filmApplicationPayment) {

		return _filmApplicationPaymentLocalService.addFilmApplicationPayment(
			filmApplicationPayment);
	}

	/**
	 * Creates a new film application payment with the primary key. Does not add the film application payment to the database.
	 *
	 * @param filmApplicationPaymentId the primary key for the new film application payment
	 * @return the new film application payment
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmApplicationPayment
		createFilmApplicationPayment(long filmApplicationPaymentId) {

		return _filmApplicationPaymentLocalService.createFilmApplicationPayment(
			filmApplicationPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationPaymentLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the film application payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationPayment the film application payment
	 * @return the film application payment that was removed
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmApplicationPayment
		deleteFilmApplicationPayment(
			com.nbp.film.application.form.service.model.FilmApplicationPayment
				filmApplicationPayment) {

		return _filmApplicationPaymentLocalService.deleteFilmApplicationPayment(
			filmApplicationPayment);
	}

	/**
	 * Deletes the film application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationPaymentId the primary key of the film application payment
	 * @return the film application payment that was removed
	 * @throws PortalException if a film application payment with the primary key could not be found
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmApplicationPayment
			deleteFilmApplicationPayment(long filmApplicationPaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationPaymentLocalService.deleteFilmApplicationPayment(
			filmApplicationPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationPaymentLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _filmApplicationPaymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _filmApplicationPaymentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _filmApplicationPaymentLocalService.dynamicQuery();
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

		return _filmApplicationPaymentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmApplicationPaymentModelImpl</code>.
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

		return _filmApplicationPaymentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmApplicationPaymentModelImpl</code>.
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

		return _filmApplicationPaymentLocalService.dynamicQuery(
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

		return _filmApplicationPaymentLocalService.dynamicQueryCount(
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

		return _filmApplicationPaymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.film.application.form.service.model.FilmApplicationPayment
		fetchFilmApplicationPayment(long filmApplicationPaymentId) {

		return _filmApplicationPaymentLocalService.fetchFilmApplicationPayment(
			filmApplicationPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _filmApplicationPaymentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.film.application.form.service.model.FilmApplicationPayment
			getFilm_Pay_FAI(long filmApplicaitonId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationPaymentException {

		return _filmApplicationPaymentLocalService.getFilm_Pay_FAI(
			filmApplicaitonId);
	}

	/**
	 * Returns the film application payment with the primary key.
	 *
	 * @param filmApplicationPaymentId the primary key of the film application payment
	 * @return the film application payment
	 * @throws PortalException if a film application payment with the primary key could not be found
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmApplicationPayment
			getFilmApplicationPayment(long filmApplicationPaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationPaymentLocalService.getFilmApplicationPayment(
			filmApplicationPaymentId);
	}

	/**
	 * Returns a range of all the film application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application payments
	 * @param end the upper bound of the range of film application payments (not inclusive)
	 * @return the range of film application payments
	 */
	@Override
	public java.util.List
		<com.nbp.film.application.form.service.model.FilmApplicationPayment>
			getFilmApplicationPayments(int start, int end) {

		return _filmApplicationPaymentLocalService.getFilmApplicationPayments(
			start, end);
	}

	/**
	 * Returns the number of film application payments.
	 *
	 * @return the number of film application payments
	 */
	@Override
	public int getFilmApplicationPaymentsCount() {
		return _filmApplicationPaymentLocalService.
			getFilmApplicationPaymentsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _filmApplicationPaymentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmApplicationPaymentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationPaymentLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the film application payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationPayment the film application payment
	 * @return the film application payment that was updated
	 */
	@Override
	public com.nbp.film.application.form.service.model.FilmApplicationPayment
		updateFilmApplicationPayment(
			com.nbp.film.application.form.service.model.FilmApplicationPayment
				filmApplicationPayment) {

		return _filmApplicationPaymentLocalService.updateFilmApplicationPayment(
			filmApplicationPayment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _filmApplicationPaymentLocalService.getBasePersistence();
	}

	@Override
	public FilmApplicationPaymentLocalService getWrappedService() {
		return _filmApplicationPaymentLocalService;
	}

	@Override
	public void setWrappedService(
		FilmApplicationPaymentLocalService filmApplicationPaymentLocalService) {

		_filmApplicationPaymentLocalService =
			filmApplicationPaymentLocalService;
	}

	private FilmApplicationPaymentLocalService
		_filmApplicationPaymentLocalService;

}