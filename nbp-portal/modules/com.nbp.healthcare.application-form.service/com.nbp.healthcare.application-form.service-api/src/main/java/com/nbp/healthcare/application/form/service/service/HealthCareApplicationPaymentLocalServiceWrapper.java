/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HealthCareApplicationPaymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicationPaymentLocalService
 * @generated
 */
public class HealthCareApplicationPaymentLocalServiceWrapper
	implements HealthCareApplicationPaymentLocalService,
			   ServiceWrapper<HealthCareApplicationPaymentLocalService> {

	public HealthCareApplicationPaymentLocalServiceWrapper() {
		this(null);
	}

	public HealthCareApplicationPaymentLocalServiceWrapper(
		HealthCareApplicationPaymentLocalService
			healthCareApplicationPaymentLocalService) {

		_healthCareApplicationPaymentLocalService =
			healthCareApplicationPaymentLocalService;
	}

	/**
	 * Adds the health care application payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareApplicationPayment the health care application payment
	 * @return the health care application payment that was added
	 */
	@Override
	public com.nbp.healthcare.application.form.service.model.
		HealthCareApplicationPayment addHealthCareApplicationPayment(
			com.nbp.healthcare.application.form.service.model.
				HealthCareApplicationPayment healthCareApplicationPayment) {

		return _healthCareApplicationPaymentLocalService.
			addHealthCareApplicationPayment(healthCareApplicationPayment);
	}

	/**
	 * Creates a new health care application payment with the primary key. Does not add the health care application payment to the database.
	 *
	 * @param healthCareApplicationPaymentId the primary key for the new health care application payment
	 * @return the new health care application payment
	 */
	@Override
	public com.nbp.healthcare.application.form.service.model.
		HealthCareApplicationPayment createHealthCareApplicationPayment(
			long healthCareApplicationPaymentId) {

		return _healthCareApplicationPaymentLocalService.
			createHealthCareApplicationPayment(healthCareApplicationPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareApplicationPaymentLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the health care application payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareApplicationPayment the health care application payment
	 * @return the health care application payment that was removed
	 */
	@Override
	public com.nbp.healthcare.application.form.service.model.
		HealthCareApplicationPayment deleteHealthCareApplicationPayment(
			com.nbp.healthcare.application.form.service.model.
				HealthCareApplicationPayment healthCareApplicationPayment) {

		return _healthCareApplicationPaymentLocalService.
			deleteHealthCareApplicationPayment(healthCareApplicationPayment);
	}

	/**
	 * Deletes the health care application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareApplicationPaymentId the primary key of the health care application payment
	 * @return the health care application payment that was removed
	 * @throws PortalException if a health care application payment with the primary key could not be found
	 */
	@Override
	public com.nbp.healthcare.application.form.service.model.
		HealthCareApplicationPayment deleteHealthCareApplicationPayment(
				long healthCareApplicationPaymentId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareApplicationPaymentLocalService.
			deleteHealthCareApplicationPayment(healthCareApplicationPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareApplicationPaymentLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _healthCareApplicationPaymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _healthCareApplicationPaymentLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _healthCareApplicationPaymentLocalService.dynamicQuery();
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

		return _healthCareApplicationPaymentLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicationPaymentModelImpl</code>.
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

		return _healthCareApplicationPaymentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicationPaymentModelImpl</code>.
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

		return _healthCareApplicationPaymentLocalService.dynamicQuery(
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

		return _healthCareApplicationPaymentLocalService.dynamicQueryCount(
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

		return _healthCareApplicationPaymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.healthcare.application.form.service.model.
		HealthCareApplicationPayment fetchHealthCareApplicationPayment(
			long healthCareApplicationPaymentId) {

		return _healthCareApplicationPaymentLocalService.
			fetchHealthCareApplicationPayment(healthCareApplicationPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _healthCareApplicationPaymentLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.healthcare.application.form.service.model.
		HealthCareApplicationPayment
				getHealtCareApplicationPaymentbyHealthCareApplicationId(
					long healthCareApplicationId)
			throws com.nbp.healthcare.application.form.service.exception.
				NoSuchHealthCareApplicationPaymentException {

		return _healthCareApplicationPaymentLocalService.
			getHealtCareApplicationPaymentbyHealthCareApplicationId(
				healthCareApplicationId);
	}

	/**
	 * Returns the health care application payment with the primary key.
	 *
	 * @param healthCareApplicationPaymentId the primary key of the health care application payment
	 * @return the health care application payment
	 * @throws PortalException if a health care application payment with the primary key could not be found
	 */
	@Override
	public com.nbp.healthcare.application.form.service.model.
		HealthCareApplicationPayment getHealthCareApplicationPayment(
				long healthCareApplicationPaymentId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareApplicationPaymentLocalService.
			getHealthCareApplicationPayment(healthCareApplicationPaymentId);
	}

	/**
	 * Returns a range of all the health care application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care application payments
	 * @param end the upper bound of the range of health care application payments (not inclusive)
	 * @return the range of health care application payments
	 */
	@Override
	public java.util.List
		<com.nbp.healthcare.application.form.service.model.
			HealthCareApplicationPayment> getHealthCareApplicationPayments(
				int start, int end) {

		return _healthCareApplicationPaymentLocalService.
			getHealthCareApplicationPayments(start, end);
	}

	/**
	 * Returns the number of health care application payments.
	 *
	 * @return the number of health care application payments
	 */
	@Override
	public int getHealthCareApplicationPaymentsCount() {
		return _healthCareApplicationPaymentLocalService.
			getHealthCareApplicationPaymentsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _healthCareApplicationPaymentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthCareApplicationPaymentLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareApplicationPaymentLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the health care application payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareApplicationPayment the health care application payment
	 * @return the health care application payment that was updated
	 */
	@Override
	public com.nbp.healthcare.application.form.service.model.
		HealthCareApplicationPayment updateHealthCareApplicationPayment(
			com.nbp.healthcare.application.form.service.model.
				HealthCareApplicationPayment healthCareApplicationPayment) {

		return _healthCareApplicationPaymentLocalService.
			updateHealthCareApplicationPayment(healthCareApplicationPayment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _healthCareApplicationPaymentLocalService.getBasePersistence();
	}

	@Override
	public HealthCareApplicationPaymentLocalService getWrappedService() {
		return _healthCareApplicationPaymentLocalService;
	}

	@Override
	public void setWrappedService(
		HealthCareApplicationPaymentLocalService
			healthCareApplicationPaymentLocalService) {

		_healthCareApplicationPaymentLocalService =
			healthCareApplicationPaymentLocalService;
	}

	private HealthCareApplicationPaymentLocalService
		_healthCareApplicationPaymentLocalService;

}