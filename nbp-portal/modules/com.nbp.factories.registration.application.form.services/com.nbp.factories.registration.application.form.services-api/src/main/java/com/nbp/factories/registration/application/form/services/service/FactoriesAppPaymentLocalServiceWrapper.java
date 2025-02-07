/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FactoriesAppPaymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesAppPaymentLocalService
 * @generated
 */
public class FactoriesAppPaymentLocalServiceWrapper
	implements FactoriesAppPaymentLocalService,
			   ServiceWrapper<FactoriesAppPaymentLocalService> {

	public FactoriesAppPaymentLocalServiceWrapper() {
		this(null);
	}

	public FactoriesAppPaymentLocalServiceWrapper(
		FactoriesAppPaymentLocalService factoriesAppPaymentLocalService) {

		_factoriesAppPaymentLocalService = factoriesAppPaymentLocalService;
	}

	/**
	 * Adds the factories app payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesAppPayment the factories app payment
	 * @return the factories app payment that was added
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesAppPayment addFactoriesAppPayment(
			com.nbp.factories.registration.application.form.services.model.
				FactoriesAppPayment factoriesAppPayment) {

		return _factoriesAppPaymentLocalService.addFactoriesAppPayment(
			factoriesAppPayment);
	}

	/**
	 * Creates a new factories app payment with the primary key. Does not add the factories app payment to the database.
	 *
	 * @param factoriesAppPaymentId the primary key for the new factories app payment
	 * @return the new factories app payment
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesAppPayment createFactoriesAppPayment(
			long factoriesAppPaymentId) {

		return _factoriesAppPaymentLocalService.createFactoriesAppPayment(
			factoriesAppPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesAppPaymentLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the factories app payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesAppPayment the factories app payment
	 * @return the factories app payment that was removed
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesAppPayment deleteFactoriesAppPayment(
			com.nbp.factories.registration.application.form.services.model.
				FactoriesAppPayment factoriesAppPayment) {

		return _factoriesAppPaymentLocalService.deleteFactoriesAppPayment(
			factoriesAppPayment);
	}

	/**
	 * Deletes the factories app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesAppPaymentId the primary key of the factories app payment
	 * @return the factories app payment that was removed
	 * @throws PortalException if a factories app payment with the primary key could not be found
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesAppPayment deleteFactoriesAppPayment(
				long factoriesAppPaymentId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesAppPaymentLocalService.deleteFactoriesAppPayment(
			factoriesAppPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesAppPaymentLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _factoriesAppPaymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _factoriesAppPaymentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _factoriesAppPaymentLocalService.dynamicQuery();
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

		return _factoriesAppPaymentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesAppPaymentModelImpl</code>.
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

		return _factoriesAppPaymentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesAppPaymentModelImpl</code>.
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

		return _factoriesAppPaymentLocalService.dynamicQuery(
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

		return _factoriesAppPaymentLocalService.dynamicQueryCount(dynamicQuery);
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

		return _factoriesAppPaymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesAppPayment fetchFactoriesAppPayment(
			long factoriesAppPaymentId) {

		return _factoriesAppPaymentLocalService.fetchFactoriesAppPayment(
			factoriesAppPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _factoriesAppPaymentLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the factories app payment with the primary key.
	 *
	 * @param factoriesAppPaymentId the primary key of the factories app payment
	 * @return the factories app payment
	 * @throws PortalException if a factories app payment with the primary key could not be found
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesAppPayment getFactoriesAppPayment(long factoriesAppPaymentId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesAppPaymentLocalService.getFactoriesAppPayment(
			factoriesAppPaymentId);
	}

	/**
	 * Returns a range of all the factories app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories app payments
	 * @param end the upper bound of the range of factories app payments (not inclusive)
	 * @return the range of factories app payments
	 */
	@Override
	public java.util.List
		<com.nbp.factories.registration.application.form.services.model.
			FactoriesAppPayment> getFactoriesAppPayments(int start, int end) {

		return _factoriesAppPaymentLocalService.getFactoriesAppPayments(
			start, end);
	}

	/**
	 * Returns the number of factories app payments.
	 *
	 * @return the number of factories app payments
	 */
	@Override
	public int getFactoriesAppPaymentsCount() {
		return _factoriesAppPaymentLocalService.getFactoriesAppPaymentsCount();
	}

	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesAppPayment getFactoriesRegistrationById(
				long factoriesApplicationId)
			throws com.nbp.factories.registration.application.form.services.
				exception.NoSuchFactoriesAppPaymentException {

		return _factoriesAppPaymentLocalService.getFactoriesRegistrationById(
			factoriesApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _factoriesAppPaymentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _factoriesAppPaymentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesAppPaymentLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the factories app payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesAppPayment the factories app payment
	 * @return the factories app payment that was updated
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesAppPayment updateFactoriesAppPayment(
			com.nbp.factories.registration.application.form.services.model.
				FactoriesAppPayment factoriesAppPayment) {

		return _factoriesAppPaymentLocalService.updateFactoriesAppPayment(
			factoriesAppPayment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _factoriesAppPaymentLocalService.getBasePersistence();
	}

	@Override
	public FactoriesAppPaymentLocalService getWrappedService() {
		return _factoriesAppPaymentLocalService;
	}

	@Override
	public void setWrappedService(
		FactoriesAppPaymentLocalService factoriesAppPaymentLocalService) {

		_factoriesAppPaymentLocalService = factoriesAppPaymentLocalService;
	}

	private FactoriesAppPaymentLocalService _factoriesAppPaymentLocalService;

}