/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezStatusAppPaymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusAppPaymentLocalService
 * @generated
 */
public class SezStatusAppPaymentLocalServiceWrapper
	implements ServiceWrapper<SezStatusAppPaymentLocalService>,
			   SezStatusAppPaymentLocalService {

	public SezStatusAppPaymentLocalServiceWrapper() {
		this(null);
	}

	public SezStatusAppPaymentLocalServiceWrapper(
		SezStatusAppPaymentLocalService sezStatusAppPaymentLocalService) {

		_sezStatusAppPaymentLocalService = sezStatusAppPaymentLocalService;
	}

	/**
	 * Adds the sez status app payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusAppPayment the sez status app payment
	 * @return the sez status app payment that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezStatusAppPayment
		addSezStatusAppPayment(
			com.nbp.sez.status.application.form.service.model.
				SezStatusAppPayment sezStatusAppPayment) {

		return _sezStatusAppPaymentLocalService.addSezStatusAppPayment(
			sezStatusAppPayment);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusAppPaymentLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez status app payment with the primary key. Does not add the sez status app payment to the database.
	 *
	 * @param sezStatusAppPaymentId the primary key for the new sez status app payment
	 * @return the new sez status app payment
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezStatusAppPayment
		createSezStatusAppPayment(long sezStatusAppPaymentId) {

		return _sezStatusAppPaymentLocalService.createSezStatusAppPayment(
			sezStatusAppPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusAppPaymentLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez status app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusAppPaymentId the primary key of the sez status app payment
	 * @return the sez status app payment that was removed
	 * @throws PortalException if a sez status app payment with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezStatusAppPayment
			deleteSezStatusAppPayment(long sezStatusAppPaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusAppPaymentLocalService.deleteSezStatusAppPayment(
			sezStatusAppPaymentId);
	}

	/**
	 * Deletes the sez status app payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusAppPayment the sez status app payment
	 * @return the sez status app payment that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezStatusAppPayment
		deleteSezStatusAppPayment(
			com.nbp.sez.status.application.form.service.model.
				SezStatusAppPayment sezStatusAppPayment) {

		return _sezStatusAppPaymentLocalService.deleteSezStatusAppPayment(
			sezStatusAppPayment);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezStatusAppPaymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezStatusAppPaymentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezStatusAppPaymentLocalService.dynamicQuery();
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

		return _sezStatusAppPaymentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusAppPaymentModelImpl</code>.
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

		return _sezStatusAppPaymentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusAppPaymentModelImpl</code>.
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

		return _sezStatusAppPaymentLocalService.dynamicQuery(
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

		return _sezStatusAppPaymentLocalService.dynamicQueryCount(dynamicQuery);
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

		return _sezStatusAppPaymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.SezStatusAppPayment
		fetchSezStatusAppPayment(long sezStatusAppPaymentId) {

		return _sezStatusAppPaymentLocalService.fetchSezStatusAppPayment(
			sezStatusAppPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezStatusAppPaymentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezStatusAppPaymentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusAppPaymentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusAppPaymentLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the sez status app payment with the primary key.
	 *
	 * @param sezStatusAppPaymentId the primary key of the sez status app payment
	 * @return the sez status app payment
	 * @throws PortalException if a sez status app payment with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezStatusAppPayment
			getSezStatusAppPayment(long sezStatusAppPaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusAppPaymentLocalService.getSezStatusAppPayment(
			sezStatusAppPaymentId);
	}

	/**
	 * Returns a range of all the sez status app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status app payments
	 * @param end the upper bound of the range of sez status app payments (not inclusive)
	 * @return the range of sez status app payments
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.SezStatusAppPayment>
			getSezStatusAppPayments(int start, int end) {

		return _sezStatusAppPaymentLocalService.getSezStatusAppPayments(
			start, end);
	}

	/**
	 * Returns the number of sez status app payments.
	 *
	 * @return the number of sez status app payments
	 */
	@Override
	public int getSezStatusAppPaymentsCount() {
		return _sezStatusAppPaymentLocalService.getSezStatusAppPaymentsCount();
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.SezStatusAppPayment
			getSezStatusBy_Id(long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusAppPaymentException {

		return _sezStatusAppPaymentLocalService.getSezStatusBy_Id(
			sezStatusApplicationId);
	}

	/**
	 * Updates the sez status app payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusAppPayment the sez status app payment
	 * @return the sez status app payment that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezStatusAppPayment
		updateSezStatusAppPayment(
			com.nbp.sez.status.application.form.service.model.
				SezStatusAppPayment sezStatusAppPayment) {

		return _sezStatusAppPaymentLocalService.updateSezStatusAppPayment(
			sezStatusAppPayment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezStatusAppPaymentLocalService.getBasePersistence();
	}

	@Override
	public SezStatusAppPaymentLocalService getWrappedService() {
		return _sezStatusAppPaymentLocalService;
	}

	@Override
	public void setWrappedService(
		SezStatusAppPaymentLocalService sezStatusAppPaymentLocalService) {

		_sezStatusAppPaymentLocalService = sezStatusAppPaymentLocalService;
	}

	private SezStatusAppPaymentLocalService _sezStatusAppPaymentLocalService;

}