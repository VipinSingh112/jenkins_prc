/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link WRAAppPaymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see WRAAppPaymentLocalService
 * @generated
 */
public class WRAAppPaymentLocalServiceWrapper
	implements ServiceWrapper<WRAAppPaymentLocalService>,
			   WRAAppPaymentLocalService {

	public WRAAppPaymentLocalServiceWrapper() {
		this(null);
	}

	public WRAAppPaymentLocalServiceWrapper(
		WRAAppPaymentLocalService wraAppPaymentLocalService) {

		_wraAppPaymentLocalService = wraAppPaymentLocalService;
	}

	/**
	 * Adds the wra app payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraAppPayment the wra app payment
	 * @return the wra app payment that was added
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAAppPayment
		addWRAAppPayment(
			com.nbp.wra.application.form.service.model.WRAAppPayment
				wraAppPayment) {

		return _wraAppPaymentLocalService.addWRAAppPayment(wraAppPayment);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraAppPaymentLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new wra app payment with the primary key. Does not add the wra app payment to the database.
	 *
	 * @param wraAppPaymentId the primary key for the new wra app payment
	 * @return the new wra app payment
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAAppPayment
		createWRAAppPayment(long wraAppPaymentId) {

		return _wraAppPaymentLocalService.createWRAAppPayment(wraAppPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraAppPaymentLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the wra app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraAppPaymentId the primary key of the wra app payment
	 * @return the wra app payment that was removed
	 * @throws PortalException if a wra app payment with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAAppPayment
			deleteWRAAppPayment(long wraAppPaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraAppPaymentLocalService.deleteWRAAppPayment(wraAppPaymentId);
	}

	/**
	 * Deletes the wra app payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraAppPayment the wra app payment
	 * @return the wra app payment that was removed
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAAppPayment
		deleteWRAAppPayment(
			com.nbp.wra.application.form.service.model.WRAAppPayment
				wraAppPayment) {

		return _wraAppPaymentLocalService.deleteWRAAppPayment(wraAppPayment);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _wraAppPaymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _wraAppPaymentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _wraAppPaymentLocalService.dynamicQuery();
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

		return _wraAppPaymentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.WRAAppPaymentModelImpl</code>.
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

		return _wraAppPaymentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.WRAAppPaymentModelImpl</code>.
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

		return _wraAppPaymentLocalService.dynamicQuery(
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

		return _wraAppPaymentLocalService.dynamicQueryCount(dynamicQuery);
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

		return _wraAppPaymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.wra.application.form.service.model.WRAAppPayment
		fetchWRAAppPayment(long wraAppPaymentId) {

		return _wraAppPaymentLocalService.fetchWRAAppPayment(wraAppPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _wraAppPaymentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.wra.application.form.service.model.WRAAppPayment
			getgetWRA_By_Id(long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAAppPaymentException {

		return _wraAppPaymentLocalService.getgetWRA_By_Id(wraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _wraAppPaymentLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _wraAppPaymentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraAppPaymentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the wra app payment with the primary key.
	 *
	 * @param wraAppPaymentId the primary key of the wra app payment
	 * @return the wra app payment
	 * @throws PortalException if a wra app payment with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAAppPayment
			getWRAAppPayment(long wraAppPaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraAppPaymentLocalService.getWRAAppPayment(wraAppPaymentId);
	}

	/**
	 * Returns a range of all the wra app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.WRAAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app payments
	 * @param end the upper bound of the range of wra app payments (not inclusive)
	 * @return the range of wra app payments
	 */
	@Override
	public java.util.List
		<com.nbp.wra.application.form.service.model.WRAAppPayment>
			getWRAAppPayments(int start, int end) {

		return _wraAppPaymentLocalService.getWRAAppPayments(start, end);
	}

	/**
	 * Returns the number of wra app payments.
	 *
	 * @return the number of wra app payments
	 */
	@Override
	public int getWRAAppPaymentsCount() {
		return _wraAppPaymentLocalService.getWRAAppPaymentsCount();
	}

	/**
	 * Updates the wra app payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraAppPayment the wra app payment
	 * @return the wra app payment that was updated
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAAppPayment
		updateWRAAppPayment(
			com.nbp.wra.application.form.service.model.WRAAppPayment
				wraAppPayment) {

		return _wraAppPaymentLocalService.updateWRAAppPayment(wraAppPayment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _wraAppPaymentLocalService.getBasePersistence();
	}

	@Override
	public WRAAppPaymentLocalService getWrappedService() {
		return _wraAppPaymentLocalService;
	}

	@Override
	public void setWrappedService(
		WRAAppPaymentLocalService wraAppPaymentLocalService) {

		_wraAppPaymentLocalService = wraAppPaymentLocalService;
	}

	private WRAAppPaymentLocalService _wraAppPaymentLocalService;

}