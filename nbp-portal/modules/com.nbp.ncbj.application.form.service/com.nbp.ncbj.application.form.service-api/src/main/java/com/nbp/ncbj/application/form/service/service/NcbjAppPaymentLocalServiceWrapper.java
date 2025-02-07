/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjAppPaymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjAppPaymentLocalService
 * @generated
 */
public class NcbjAppPaymentLocalServiceWrapper
	implements NcbjAppPaymentLocalService,
			   ServiceWrapper<NcbjAppPaymentLocalService> {

	public NcbjAppPaymentLocalServiceWrapper() {
		this(null);
	}

	public NcbjAppPaymentLocalServiceWrapper(
		NcbjAppPaymentLocalService ncbjAppPaymentLocalService) {

		_ncbjAppPaymentLocalService = ncbjAppPaymentLocalService;
	}

	/**
	 * Adds the ncbj app payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjAppPayment the ncbj app payment
	 * @return the ncbj app payment that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjAppPayment
		addNcbjAppPayment(
			com.nbp.ncbj.application.form.service.model.NcbjAppPayment
				ncbjAppPayment) {

		return _ncbjAppPaymentLocalService.addNcbjAppPayment(ncbjAppPayment);
	}

	/**
	 * Creates a new ncbj app payment with the primary key. Does not add the ncbj app payment to the database.
	 *
	 * @param ncbjAppPaymentId the primary key for the new ncbj app payment
	 * @return the new ncbj app payment
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjAppPayment
		createNcbjAppPayment(long ncbjAppPaymentId) {

		return _ncbjAppPaymentLocalService.createNcbjAppPayment(
			ncbjAppPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjAppPaymentLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the ncbj app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjAppPaymentId the primary key of the ncbj app payment
	 * @return the ncbj app payment that was removed
	 * @throws PortalException if a ncbj app payment with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjAppPayment
			deleteNcbjAppPayment(long ncbjAppPaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjAppPaymentLocalService.deleteNcbjAppPayment(
			ncbjAppPaymentId);
	}

	/**
	 * Deletes the ncbj app payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjAppPayment the ncbj app payment
	 * @return the ncbj app payment that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjAppPayment
		deleteNcbjAppPayment(
			com.nbp.ncbj.application.form.service.model.NcbjAppPayment
				ncbjAppPayment) {

		return _ncbjAppPaymentLocalService.deleteNcbjAppPayment(ncbjAppPayment);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjAppPaymentLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjAppPaymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjAppPaymentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjAppPaymentLocalService.dynamicQuery();
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

		return _ncbjAppPaymentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjAppPaymentModelImpl</code>.
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

		return _ncbjAppPaymentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjAppPaymentModelImpl</code>.
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

		return _ncbjAppPaymentLocalService.dynamicQuery(
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

		return _ncbjAppPaymentLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ncbjAppPaymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjAppPayment
		fetchNcbjAppPayment(long ncbjAppPaymentId) {

		return _ncbjAppPaymentLocalService.fetchNcbjAppPayment(
			ncbjAppPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjAppPaymentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjAppPaymentLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjAppPayment
			getNcbjAppById(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjAppPaymentException {

		return _ncbjAppPaymentLocalService.getNcbjAppById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj app payment with the primary key.
	 *
	 * @param ncbjAppPaymentId the primary key of the ncbj app payment
	 * @return the ncbj app payment
	 * @throws PortalException if a ncbj app payment with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjAppPayment
			getNcbjAppPayment(long ncbjAppPaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjAppPaymentLocalService.getNcbjAppPayment(ncbjAppPaymentId);
	}

	/**
	 * Returns a range of all the ncbj app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj app payments
	 * @param end the upper bound of the range of ncbj app payments (not inclusive)
	 * @return the range of ncbj app payments
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjAppPayment>
			getNcbjAppPayments(int start, int end) {

		return _ncbjAppPaymentLocalService.getNcbjAppPayments(start, end);
	}

	/**
	 * Returns the number of ncbj app payments.
	 *
	 * @return the number of ncbj app payments
	 */
	@Override
	public int getNcbjAppPaymentsCount() {
		return _ncbjAppPaymentLocalService.getNcbjAppPaymentsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjAppPaymentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjAppPaymentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ncbj app payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjAppPayment the ncbj app payment
	 * @return the ncbj app payment that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjAppPayment
		updateNcbjAppPayment(
			com.nbp.ncbj.application.form.service.model.NcbjAppPayment
				ncbjAppPayment) {

		return _ncbjAppPaymentLocalService.updateNcbjAppPayment(ncbjAppPayment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjAppPaymentLocalService.getBasePersistence();
	}

	@Override
	public NcbjAppPaymentLocalService getWrappedService() {
		return _ncbjAppPaymentLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjAppPaymentLocalService ncbjAppPaymentLocalService) {

		_ncbjAppPaymentLocalService = ncbjAppPaymentLocalService;
	}

	private NcbjAppPaymentLocalService _ncbjAppPaymentLocalService;

}