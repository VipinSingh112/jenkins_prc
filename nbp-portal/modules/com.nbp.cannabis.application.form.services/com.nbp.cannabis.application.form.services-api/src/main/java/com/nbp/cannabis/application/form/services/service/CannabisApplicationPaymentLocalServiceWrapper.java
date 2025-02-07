/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisApplicationPaymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationPaymentLocalService
 * @generated
 */
public class CannabisApplicationPaymentLocalServiceWrapper
	implements CannabisApplicationPaymentLocalService,
			   ServiceWrapper<CannabisApplicationPaymentLocalService> {

	public CannabisApplicationPaymentLocalServiceWrapper() {
		this(null);
	}

	public CannabisApplicationPaymentLocalServiceWrapper(
		CannabisApplicationPaymentLocalService
			cannabisApplicationPaymentLocalService) {

		_cannabisApplicationPaymentLocalService =
			cannabisApplicationPaymentLocalService;
	}

	/**
	 * Adds the cannabis application payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationPayment the cannabis application payment
	 * @return the cannabis application payment that was added
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisApplicationPayment addCannabisApplicationPayment(
				com.nbp.cannabis.application.form.services.model.
					CannabisApplicationPayment cannabisApplicationPayment) {

		return _cannabisApplicationPaymentLocalService.
			addCannabisApplicationPayment(cannabisApplicationPayment);
	}

	/**
	 * Creates a new cannabis application payment with the primary key. Does not add the cannabis application payment to the database.
	 *
	 * @param cannabisApplicationPaymentId the primary key for the new cannabis application payment
	 * @return the new cannabis application payment
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisApplicationPayment createCannabisApplicationPayment(
				long cannabisApplicationPaymentId) {

		return _cannabisApplicationPaymentLocalService.
			createCannabisApplicationPayment(cannabisApplicationPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationPaymentLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the cannabis application payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationPayment the cannabis application payment
	 * @return the cannabis application payment that was removed
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisApplicationPayment deleteCannabisApplicationPayment(
				com.nbp.cannabis.application.form.services.model.
					CannabisApplicationPayment cannabisApplicationPayment) {

		return _cannabisApplicationPaymentLocalService.
			deleteCannabisApplicationPayment(cannabisApplicationPayment);
	}

	/**
	 * Deletes the cannabis application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationPaymentId the primary key of the cannabis application payment
	 * @return the cannabis application payment that was removed
	 * @throws PortalException if a cannabis application payment with the primary key could not be found
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisApplicationPayment deleteCannabisApplicationPayment(
					long cannabisApplicationPaymentId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationPaymentLocalService.
			deleteCannabisApplicationPayment(cannabisApplicationPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationPaymentLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisApplicationPaymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisApplicationPaymentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisApplicationPaymentLocalService.dynamicQuery();
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

		return _cannabisApplicationPaymentLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationPaymentModelImpl</code>.
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

		return _cannabisApplicationPaymentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationPaymentModelImpl</code>.
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

		return _cannabisApplicationPaymentLocalService.dynamicQuery(
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

		return _cannabisApplicationPaymentLocalService.dynamicQueryCount(
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

		return _cannabisApplicationPaymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisApplicationPayment fetchCannabisApplicationPayment(
				long cannabisApplicationPaymentId) {

		return _cannabisApplicationPaymentLocalService.
			fetchCannabisApplicationPayment(cannabisApplicationPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisApplicationPaymentLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the cannabis application payment with the primary key.
	 *
	 * @param cannabisApplicationPaymentId the primary key of the cannabis application payment
	 * @return the cannabis application payment
	 * @throws PortalException if a cannabis application payment with the primary key could not be found
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisApplicationPayment getCannabisApplicationPayment(
					long cannabisApplicationPaymentId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationPaymentLocalService.
			getCannabisApplicationPayment(cannabisApplicationPaymentId);
	}

	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisApplicationPayment
					getCannabisApplicationPaymentByCannabisAppId(
						long cannabisApplicationId)
				throws com.nbp.cannabis.application.form.services.exception.
					NoSuchCannabisApplicationPaymentException {

		return _cannabisApplicationPaymentLocalService.
			getCannabisApplicationPaymentByCannabisAppId(cannabisApplicationId);
	}

	/**
	 * Returns a range of all the cannabis application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application payments
	 * @param end the upper bound of the range of cannabis application payments (not inclusive)
	 * @return the range of cannabis application payments
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisApplicationPayment> getCannabisApplicationPayments(
				int start, int end) {

		return _cannabisApplicationPaymentLocalService.
			getCannabisApplicationPayments(start, end);
	}

	/**
	 * Returns the number of cannabis application payments.
	 *
	 * @return the number of cannabis application payments
	 */
	@Override
	public int getCannabisApplicationPaymentsCount() {
		return _cannabisApplicationPaymentLocalService.
			getCannabisApplicationPaymentsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisApplicationPaymentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationPaymentLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationPaymentLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the cannabis application payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationPayment the cannabis application payment
	 * @return the cannabis application payment that was updated
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisApplicationPayment updateCannabisApplicationPayment(
				com.nbp.cannabis.application.form.services.model.
					CannabisApplicationPayment cannabisApplicationPayment) {

		return _cannabisApplicationPaymentLocalService.
			updateCannabisApplicationPayment(cannabisApplicationPayment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisApplicationPaymentLocalService.getBasePersistence();
	}

	@Override
	public CannabisApplicationPaymentLocalService getWrappedService() {
		return _cannabisApplicationPaymentLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationPaymentLocalService
			cannabisApplicationPaymentLocalService) {

		_cannabisApplicationPaymentLocalService =
			cannabisApplicationPaymentLocalService;
	}

	private CannabisApplicationPaymentLocalService
		_cannabisApplicationPaymentLocalService;

}