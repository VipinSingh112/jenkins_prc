/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiningAppPaymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningAppPaymentLocalService
 * @generated
 */
public class MiningAppPaymentLocalServiceWrapper
	implements MiningAppPaymentLocalService,
			   ServiceWrapper<MiningAppPaymentLocalService> {

	public MiningAppPaymentLocalServiceWrapper() {
		this(null);
	}

	public MiningAppPaymentLocalServiceWrapper(
		MiningAppPaymentLocalService miningAppPaymentLocalService) {

		_miningAppPaymentLocalService = miningAppPaymentLocalService;
	}

	/**
	 * Adds the mining app payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningAppPayment the mining app payment
	 * @return the mining app payment that was added
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningAppPayment
		addMiningAppPayment(
			com.nbp.mining.lease.application.service.model.MiningAppPayment
				miningAppPayment) {

		return _miningAppPaymentLocalService.addMiningAppPayment(
			miningAppPayment);
	}

	/**
	 * Creates a new mining app payment with the primary key. Does not add the mining app payment to the database.
	 *
	 * @param miningAppPaymentId the primary key for the new mining app payment
	 * @return the new mining app payment
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningAppPayment
		createMiningAppPayment(long miningAppPaymentId) {

		return _miningAppPaymentLocalService.createMiningAppPayment(
			miningAppPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningAppPaymentLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the mining app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningAppPaymentId the primary key of the mining app payment
	 * @return the mining app payment that was removed
	 * @throws PortalException if a mining app payment with the primary key could not be found
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningAppPayment
			deleteMiningAppPayment(long miningAppPaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningAppPaymentLocalService.deleteMiningAppPayment(
			miningAppPaymentId);
	}

	/**
	 * Deletes the mining app payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningAppPayment the mining app payment
	 * @return the mining app payment that was removed
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningAppPayment
		deleteMiningAppPayment(
			com.nbp.mining.lease.application.service.model.MiningAppPayment
				miningAppPayment) {

		return _miningAppPaymentLocalService.deleteMiningAppPayment(
			miningAppPayment);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningAppPaymentLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miningAppPaymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miningAppPaymentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miningAppPaymentLocalService.dynamicQuery();
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

		return _miningAppPaymentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningAppPaymentModelImpl</code>.
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

		return _miningAppPaymentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningAppPaymentModelImpl</code>.
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

		return _miningAppPaymentLocalService.dynamicQuery(
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

		return _miningAppPaymentLocalService.dynamicQueryCount(dynamicQuery);
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

		return _miningAppPaymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.mining.lease.application.service.model.MiningAppPayment
		fetchMiningAppPayment(long miningAppPaymentId) {

		return _miningAppPaymentLocalService.fetchMiningAppPayment(
			miningAppPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miningAppPaymentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miningAppPaymentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the mining app payment with the primary key.
	 *
	 * @param miningAppPaymentId the primary key of the mining app payment
	 * @return the mining app payment
	 * @throws PortalException if a mining app payment with the primary key could not be found
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningAppPayment
			getMiningAppPayment(long miningAppPaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningAppPaymentLocalService.getMiningAppPayment(
			miningAppPaymentId);
	}

	/**
	 * Returns a range of all the mining app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining app payments
	 * @param end the upper bound of the range of mining app payments (not inclusive)
	 * @return the range of mining app payments
	 */
	@Override
	public java.util.List
		<com.nbp.mining.lease.application.service.model.MiningAppPayment>
			getMiningAppPayments(int start, int end) {

		return _miningAppPaymentLocalService.getMiningAppPayments(start, end);
	}

	/**
	 * Returns the number of mining app payments.
	 *
	 * @return the number of mining app payments
	 */
	@Override
	public int getMiningAppPaymentsCount() {
		return _miningAppPaymentLocalService.getMiningAppPaymentsCount();
	}

	@Override
	public com.nbp.mining.lease.application.service.model.MiningAppPayment
			getMiningById(long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningAppPaymentException {

		return _miningAppPaymentLocalService.getMiningById(
			miningLeaseApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningAppPaymentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningAppPaymentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the mining app payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningAppPayment the mining app payment
	 * @return the mining app payment that was updated
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningAppPayment
		updateMiningAppPayment(
			com.nbp.mining.lease.application.service.model.MiningAppPayment
				miningAppPayment) {

		return _miningAppPaymentLocalService.updateMiningAppPayment(
			miningAppPayment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miningAppPaymentLocalService.getBasePersistence();
	}

	@Override
	public MiningAppPaymentLocalService getWrappedService() {
		return _miningAppPaymentLocalService;
	}

	@Override
	public void setWrappedService(
		MiningAppPaymentLocalService miningAppPaymentLocalService) {

		_miningAppPaymentLocalService = miningAppPaymentLocalService;
	}

	private MiningAppPaymentLocalService _miningAppPaymentLocalService;

}