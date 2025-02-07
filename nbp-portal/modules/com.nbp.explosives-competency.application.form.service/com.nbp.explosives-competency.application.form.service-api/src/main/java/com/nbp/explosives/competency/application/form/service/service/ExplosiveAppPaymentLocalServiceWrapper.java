/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ExplosiveAppPaymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveAppPaymentLocalService
 * @generated
 */
public class ExplosiveAppPaymentLocalServiceWrapper
	implements ExplosiveAppPaymentLocalService,
			   ServiceWrapper<ExplosiveAppPaymentLocalService> {

	public ExplosiveAppPaymentLocalServiceWrapper() {
		this(null);
	}

	public ExplosiveAppPaymentLocalServiceWrapper(
		ExplosiveAppPaymentLocalService explosiveAppPaymentLocalService) {

		_explosiveAppPaymentLocalService = explosiveAppPaymentLocalService;
	}

	/**
	 * Adds the explosive app payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveAppPayment the explosive app payment
	 * @return the explosive app payment that was added
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosiveAppPayment addExplosiveAppPayment(
			com.nbp.explosives.competency.application.form.service.model.
				ExplosiveAppPayment explosiveAppPayment) {

		return _explosiveAppPaymentLocalService.addExplosiveAppPayment(
			explosiveAppPayment);
	}

	/**
	 * Creates a new explosive app payment with the primary key. Does not add the explosive app payment to the database.
	 *
	 * @param explosiveAppPaymentId the primary key for the new explosive app payment
	 * @return the new explosive app payment
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosiveAppPayment createExplosiveAppPayment(
			long explosiveAppPaymentId) {

		return _explosiveAppPaymentLocalService.createExplosiveAppPayment(
			explosiveAppPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveAppPaymentLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the explosive app payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveAppPayment the explosive app payment
	 * @return the explosive app payment that was removed
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosiveAppPayment deleteExplosiveAppPayment(
			com.nbp.explosives.competency.application.form.service.model.
				ExplosiveAppPayment explosiveAppPayment) {

		return _explosiveAppPaymentLocalService.deleteExplosiveAppPayment(
			explosiveAppPayment);
	}

	/**
	 * Deletes the explosive app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveAppPaymentId the primary key of the explosive app payment
	 * @return the explosive app payment that was removed
	 * @throws PortalException if a explosive app payment with the primary key could not be found
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosiveAppPayment deleteExplosiveAppPayment(
				long explosiveAppPaymentId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveAppPaymentLocalService.deleteExplosiveAppPayment(
			explosiveAppPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveAppPaymentLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _explosiveAppPaymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _explosiveAppPaymentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _explosiveAppPaymentLocalService.dynamicQuery();
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

		return _explosiveAppPaymentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosiveAppPaymentModelImpl</code>.
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

		return _explosiveAppPaymentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosiveAppPaymentModelImpl</code>.
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

		return _explosiveAppPaymentLocalService.dynamicQuery(
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

		return _explosiveAppPaymentLocalService.dynamicQueryCount(dynamicQuery);
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

		return _explosiveAppPaymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosiveAppPayment fetchExplosiveAppPayment(
			long explosiveAppPaymentId) {

		return _explosiveAppPaymentLocalService.fetchExplosiveAppPayment(
			explosiveAppPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _explosiveAppPaymentLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the explosive app payment with the primary key.
	 *
	 * @param explosiveAppPaymentId the primary key of the explosive app payment
	 * @return the explosive app payment
	 * @throws PortalException if a explosive app payment with the primary key could not be found
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosiveAppPayment getExplosiveAppPayment(long explosiveAppPaymentId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveAppPaymentLocalService.getExplosiveAppPayment(
			explosiveAppPaymentId);
	}

	/**
	 * Returns a range of all the explosive app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosiveAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive app payments
	 * @param end the upper bound of the range of explosive app payments (not inclusive)
	 * @return the range of explosive app payments
	 */
	@Override
	public java.util.List
		<com.nbp.explosives.competency.application.form.service.model.
			ExplosiveAppPayment> getExplosiveAppPayments(int start, int end) {

		return _explosiveAppPaymentLocalService.getExplosiveAppPayments(
			start, end);
	}

	/**
	 * Returns the number of explosive app payments.
	 *
	 * @return the number of explosive app payments
	 */
	@Override
	public int getExplosiveAppPaymentsCount() {
		return _explosiveAppPaymentLocalService.getExplosiveAppPaymentsCount();
	}

	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosiveAppPayment getExplosiveById(long explosivesApplicationId)
			throws com.nbp.explosives.competency.application.form.service.
				exception.NoSuchExplosiveAppPaymentException {

		return _explosiveAppPaymentLocalService.getExplosiveById(
			explosivesApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _explosiveAppPaymentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _explosiveAppPaymentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveAppPaymentLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the explosive app payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveAppPayment the explosive app payment
	 * @return the explosive app payment that was updated
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosiveAppPayment updateExplosiveAppPayment(
			com.nbp.explosives.competency.application.form.service.model.
				ExplosiveAppPayment explosiveAppPayment) {

		return _explosiveAppPaymentLocalService.updateExplosiveAppPayment(
			explosiveAppPayment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _explosiveAppPaymentLocalService.getBasePersistence();
	}

	@Override
	public ExplosiveAppPaymentLocalService getWrappedService() {
		return _explosiveAppPaymentLocalService;
	}

	@Override
	public void setWrappedService(
		ExplosiveAppPaymentLocalService explosiveAppPaymentLocalService) {

		_explosiveAppPaymentLocalService = explosiveAppPaymentLocalService;
	}

	private ExplosiveAppPaymentLocalService _explosiveAppPaymentLocalService;

}