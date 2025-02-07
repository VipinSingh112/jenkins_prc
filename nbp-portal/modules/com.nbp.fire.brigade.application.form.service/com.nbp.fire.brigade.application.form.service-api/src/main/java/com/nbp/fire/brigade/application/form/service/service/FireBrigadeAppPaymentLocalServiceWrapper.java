/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FireBrigadeAppPaymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeAppPaymentLocalService
 * @generated
 */
public class FireBrigadeAppPaymentLocalServiceWrapper
	implements FireBrigadeAppPaymentLocalService,
			   ServiceWrapper<FireBrigadeAppPaymentLocalService> {

	public FireBrigadeAppPaymentLocalServiceWrapper() {
		this(null);
	}

	public FireBrigadeAppPaymentLocalServiceWrapper(
		FireBrigadeAppPaymentLocalService fireBrigadeAppPaymentLocalService) {

		_fireBrigadeAppPaymentLocalService = fireBrigadeAppPaymentLocalService;
	}

	/**
	 * Adds the fire brigade app payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeAppPayment the fire brigade app payment
	 * @return the fire brigade app payment that was added
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeAppPayment addFireBrigadeAppPayment(
				com.nbp.fire.brigade.application.form.service.model.
					FireBrigadeAppPayment fireBrigadeAppPayment) {

		return _fireBrigadeAppPaymentLocalService.addFireBrigadeAppPayment(
			fireBrigadeAppPayment);
	}

	/**
	 * Creates a new fire brigade app payment with the primary key. Does not add the fire brigade app payment to the database.
	 *
	 * @param fireBrigadeAppPaymentId the primary key for the new fire brigade app payment
	 * @return the new fire brigade app payment
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeAppPayment createFireBrigadeAppPayment(
				long fireBrigadeAppPaymentId) {

		return _fireBrigadeAppPaymentLocalService.createFireBrigadeAppPayment(
			fireBrigadeAppPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeAppPaymentLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the fire brigade app payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeAppPayment the fire brigade app payment
	 * @return the fire brigade app payment that was removed
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeAppPayment deleteFireBrigadeAppPayment(
				com.nbp.fire.brigade.application.form.service.model.
					FireBrigadeAppPayment fireBrigadeAppPayment) {

		return _fireBrigadeAppPaymentLocalService.deleteFireBrigadeAppPayment(
			fireBrigadeAppPayment);
	}

	/**
	 * Deletes the fire brigade app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeAppPaymentId the primary key of the fire brigade app payment
	 * @return the fire brigade app payment that was removed
	 * @throws PortalException if a fire brigade app payment with the primary key could not be found
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeAppPayment deleteFireBrigadeAppPayment(
					long fireBrigadeAppPaymentId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeAppPaymentLocalService.deleteFireBrigadeAppPayment(
			fireBrigadeAppPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeAppPaymentLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fireBrigadeAppPaymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fireBrigadeAppPaymentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fireBrigadeAppPaymentLocalService.dynamicQuery();
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

		return _fireBrigadeAppPaymentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeAppPaymentModelImpl</code>.
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

		return _fireBrigadeAppPaymentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeAppPaymentModelImpl</code>.
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

		return _fireBrigadeAppPaymentLocalService.dynamicQuery(
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

		return _fireBrigadeAppPaymentLocalService.dynamicQueryCount(
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

		return _fireBrigadeAppPaymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeAppPayment fetchFireBrigadeAppPayment(
				long fireBrigadeAppPaymentId) {

		return _fireBrigadeAppPaymentLocalService.fetchFireBrigadeAppPayment(
			fireBrigadeAppPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fireBrigadeAppPaymentLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the fire brigade app payment with the primary key.
	 *
	 * @param fireBrigadeAppPaymentId the primary key of the fire brigade app payment
	 * @return the fire brigade app payment
	 * @throws PortalException if a fire brigade app payment with the primary key could not be found
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeAppPayment getFireBrigadeAppPayment(
					long fireBrigadeAppPaymentId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeAppPaymentLocalService.getFireBrigadeAppPayment(
			fireBrigadeAppPaymentId);
	}

	/**
	 * Returns a range of all the fire brigade app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade app payments
	 * @param end the upper bound of the range of fire brigade app payments (not inclusive)
	 * @return the range of fire brigade app payments
	 */
	@Override
	public java.util.List
		<com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeAppPayment> getFireBrigadeAppPayments(
				int start, int end) {

		return _fireBrigadeAppPaymentLocalService.getFireBrigadeAppPayments(
			start, end);
	}

	/**
	 * Returns the number of fire brigade app payments.
	 *
	 * @return the number of fire brigade app payments
	 */
	@Override
	public int getFireBrigadeAppPaymentsCount() {
		return _fireBrigadeAppPaymentLocalService.
			getFireBrigadeAppPaymentsCount();
	}

	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeAppPayment getFireBrigadeByAppId(
					long fireBrigadeApplicationId)
				throws com.nbp.fire.brigade.application.form.service.exception.
					NoSuchFireBrigadeAppPaymentException {

		return _fireBrigadeAppPaymentLocalService.getFireBrigadeByAppId(
			fireBrigadeApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fireBrigadeAppPaymentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeAppPaymentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeAppPaymentLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the fire brigade app payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeAppPayment the fire brigade app payment
	 * @return the fire brigade app payment that was updated
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeAppPayment updateFireBrigadeAppPayment(
				com.nbp.fire.brigade.application.form.service.model.
					FireBrigadeAppPayment fireBrigadeAppPayment) {

		return _fireBrigadeAppPaymentLocalService.updateFireBrigadeAppPayment(
			fireBrigadeAppPayment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _fireBrigadeAppPaymentLocalService.getBasePersistence();
	}

	@Override
	public FireBrigadeAppPaymentLocalService getWrappedService() {
		return _fireBrigadeAppPaymentLocalService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeAppPaymentLocalService fireBrigadeAppPaymentLocalService) {

		_fireBrigadeAppPaymentLocalService = fireBrigadeAppPaymentLocalService;
	}

	private FireBrigadeAppPaymentLocalService
		_fireBrigadeAppPaymentLocalService;

}