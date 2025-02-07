/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HsraApplicationPaymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationPaymentLocalService
 * @generated
 */
public class HsraApplicationPaymentLocalServiceWrapper
	implements HsraApplicationPaymentLocalService,
			   ServiceWrapper<HsraApplicationPaymentLocalService> {

	public HsraApplicationPaymentLocalServiceWrapper() {
		this(null);
	}

	public HsraApplicationPaymentLocalServiceWrapper(
		HsraApplicationPaymentLocalService hsraApplicationPaymentLocalService) {

		_hsraApplicationPaymentLocalService =
			hsraApplicationPaymentLocalService;
	}

	/**
	 * Adds the hsra application payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationPayment the hsra application payment
	 * @return the hsra application payment that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.HsraApplicationPayment
		addHsraApplicationPayment(
			com.nbp.hsra.application.service.model.HsraApplicationPayment
				hsraApplicationPayment) {

		return _hsraApplicationPaymentLocalService.addHsraApplicationPayment(
			hsraApplicationPayment);
	}

	/**
	 * Creates a new hsra application payment with the primary key. Does not add the hsra application payment to the database.
	 *
	 * @param hsraApplicationPaymentId the primary key for the new hsra application payment
	 * @return the new hsra application payment
	 */
	@Override
	public com.nbp.hsra.application.service.model.HsraApplicationPayment
		createHsraApplicationPayment(long hsraApplicationPaymentId) {

		return _hsraApplicationPaymentLocalService.createHsraApplicationPayment(
			hsraApplicationPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationPaymentLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the hsra application payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationPayment the hsra application payment
	 * @return the hsra application payment that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.HsraApplicationPayment
		deleteHsraApplicationPayment(
			com.nbp.hsra.application.service.model.HsraApplicationPayment
				hsraApplicationPayment) {

		return _hsraApplicationPaymentLocalService.deleteHsraApplicationPayment(
			hsraApplicationPayment);
	}

	/**
	 * Deletes the hsra application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationPaymentId the primary key of the hsra application payment
	 * @return the hsra application payment that was removed
	 * @throws PortalException if a hsra application payment with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.HsraApplicationPayment
			deleteHsraApplicationPayment(long hsraApplicationPaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationPaymentLocalService.deleteHsraApplicationPayment(
			hsraApplicationPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationPaymentLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _hsraApplicationPaymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _hsraApplicationPaymentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _hsraApplicationPaymentLocalService.dynamicQuery();
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

		return _hsraApplicationPaymentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.HsraApplicationPaymentModelImpl</code>.
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

		return _hsraApplicationPaymentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.HsraApplicationPaymentModelImpl</code>.
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

		return _hsraApplicationPaymentLocalService.dynamicQuery(
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

		return _hsraApplicationPaymentLocalService.dynamicQueryCount(
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

		return _hsraApplicationPaymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.HsraApplicationPayment
		fetchHsraApplicationPayment(long hsraApplicationPaymentId) {

		return _hsraApplicationPaymentLocalService.fetchHsraApplicationPayment(
			hsraApplicationPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _hsraApplicationPaymentLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the hsra application payment with the primary key.
	 *
	 * @param hsraApplicationPaymentId the primary key of the hsra application payment
	 * @return the hsra application payment
	 * @throws PortalException if a hsra application payment with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.HsraApplicationPayment
			getHsraApplicationPayment(long hsraApplicationPaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationPaymentLocalService.getHsraApplicationPayment(
			hsraApplicationPaymentId);
	}

	/**
	 * Returns a range of all the hsra application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.HsraApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application payments
	 * @param end the upper bound of the range of hsra application payments (not inclusive)
	 * @return the range of hsra application payments
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.HsraApplicationPayment>
			getHsraApplicationPayments(int start, int end) {

		return _hsraApplicationPaymentLocalService.getHsraApplicationPayments(
			start, end);
	}

	/**
	 * Returns the number of hsra application payments.
	 *
	 * @return the number of hsra application payments
	 */
	@Override
	public int getHsraApplicationPaymentsCount() {
		return _hsraApplicationPaymentLocalService.
			getHsraApplicationPaymentsCount();
	}

	@Override
	public com.nbp.hsra.application.service.model.HsraApplicationPayment
			getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationPaymentException {

		return _hsraApplicationPaymentLocalService.getHsraById(
			hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _hsraApplicationPaymentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _hsraApplicationPaymentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationPaymentLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the hsra application payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationPayment the hsra application payment
	 * @return the hsra application payment that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.HsraApplicationPayment
		updateHsraApplicationPayment(
			com.nbp.hsra.application.service.model.HsraApplicationPayment
				hsraApplicationPayment) {

		return _hsraApplicationPaymentLocalService.updateHsraApplicationPayment(
			hsraApplicationPayment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _hsraApplicationPaymentLocalService.getBasePersistence();
	}

	@Override
	public HsraApplicationPaymentLocalService getWrappedService() {
		return _hsraApplicationPaymentLocalService;
	}

	@Override
	public void setWrappedService(
		HsraApplicationPaymentLocalService hsraApplicationPaymentLocalService) {

		_hsraApplicationPaymentLocalService =
			hsraApplicationPaymentLocalService;
	}

	private HsraApplicationPaymentLocalService
		_hsraApplicationPaymentLocalService;

}