/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisLicensePaymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicensePaymentLocalService
 * @generated
 */
public class CannabisLicensePaymentLocalServiceWrapper
	implements CannabisLicensePaymentLocalService,
			   ServiceWrapper<CannabisLicensePaymentLocalService> {

	public CannabisLicensePaymentLocalServiceWrapper() {
		this(null);
	}

	public CannabisLicensePaymentLocalServiceWrapper(
		CannabisLicensePaymentLocalService cannabisLicensePaymentLocalService) {

		_cannabisLicensePaymentLocalService =
			cannabisLicensePaymentLocalService;
	}

	/**
	 * Adds the cannabis license payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicensePaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicensePayment the cannabis license payment
	 * @return the cannabis license payment that was added
	 */
	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisLicensePayment addCannabisLicensePayment(
				com.npm.cannabis.application.stages.services.model.
					CannabisLicensePayment cannabisLicensePayment) {

		return _cannabisLicensePaymentLocalService.addCannabisLicensePayment(
			cannabisLicensePayment);
	}

	/**
	 * Creates a new cannabis license payment with the primary key. Does not add the cannabis license payment to the database.
	 *
	 * @param cannabisLicensePaymentId the primary key for the new cannabis license payment
	 * @return the new cannabis license payment
	 */
	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisLicensePayment createCannabisLicensePayment(
				long cannabisLicensePaymentId) {

		return _cannabisLicensePaymentLocalService.createCannabisLicensePayment(
			cannabisLicensePaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisLicensePaymentLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the cannabis license payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicensePaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicensePayment the cannabis license payment
	 * @return the cannabis license payment that was removed
	 */
	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisLicensePayment deleteCannabisLicensePayment(
				com.npm.cannabis.application.stages.services.model.
					CannabisLicensePayment cannabisLicensePayment) {

		return _cannabisLicensePaymentLocalService.deleteCannabisLicensePayment(
			cannabisLicensePayment);
	}

	/**
	 * Deletes the cannabis license payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicensePaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicensePaymentId the primary key of the cannabis license payment
	 * @return the cannabis license payment that was removed
	 * @throws PortalException if a cannabis license payment with the primary key could not be found
	 */
	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisLicensePayment deleteCannabisLicensePayment(
					long cannabisLicensePaymentId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisLicensePaymentLocalService.deleteCannabisLicensePayment(
			cannabisLicensePaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisLicensePaymentLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisLicensePaymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisLicensePaymentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisLicensePaymentLocalService.dynamicQuery();
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

		return _cannabisLicensePaymentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisLicensePaymentModelImpl</code>.
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

		return _cannabisLicensePaymentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisLicensePaymentModelImpl</code>.
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

		return _cannabisLicensePaymentLocalService.dynamicQuery(
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

		return _cannabisLicensePaymentLocalService.dynamicQueryCount(
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

		return _cannabisLicensePaymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisLicensePayment fetchCannabisLicensePayment(
				long cannabisLicensePaymentId) {

		return _cannabisLicensePaymentLocalService.fetchCannabisLicensePayment(
			cannabisLicensePaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisLicensePaymentLocalService.getActionableDynamicQuery();
	}

	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisLicensePayment getCannabisLicenceByPayment(
					long cannabisApplicationId)
				throws com.npm.cannabis.application.stages.services.exception.
					NoSuchCannabisLicensePaymentException {

		return _cannabisLicensePaymentLocalService.getCannabisLicenceByPayment(
			cannabisApplicationId);
	}

	/**
	 * Returns the cannabis license payment with the primary key.
	 *
	 * @param cannabisLicensePaymentId the primary key of the cannabis license payment
	 * @return the cannabis license payment
	 * @throws PortalException if a cannabis license payment with the primary key could not be found
	 */
	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisLicensePayment getCannabisLicensePayment(
					long cannabisLicensePaymentId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisLicensePaymentLocalService.getCannabisLicensePayment(
			cannabisLicensePaymentId);
	}

	/**
	 * Returns a range of all the cannabis license payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisLicensePaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis license payments
	 * @param end the upper bound of the range of cannabis license payments (not inclusive)
	 * @return the range of cannabis license payments
	 */
	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisLicensePayment> getCannabisLicensePayments(
				int start, int end) {

		return _cannabisLicensePaymentLocalService.getCannabisLicensePayments(
			start, end);
	}

	/**
	 * Returns the number of cannabis license payments.
	 *
	 * @return the number of cannabis license payments
	 */
	@Override
	public int getCannabisLicensePaymentsCount() {
		return _cannabisLicensePaymentLocalService.
			getCannabisLicensePaymentsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisLicensePaymentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisLicensePaymentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisLicensePaymentLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the cannabis license payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicensePaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicensePayment the cannabis license payment
	 * @return the cannabis license payment that was updated
	 */
	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisLicensePayment updateCannabisLicensePayment(
				com.npm.cannabis.application.stages.services.model.
					CannabisLicensePayment cannabisLicensePayment) {

		return _cannabisLicensePaymentLocalService.updateCannabisLicensePayment(
			cannabisLicensePayment);
	}

	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisLicensePayment updateCannabisLicensePayment(
				String caseId, String bondFeeReceived,
				String licenseFeeReceived, String paymentOption,
				String paymentStatus) {

		return _cannabisLicensePaymentLocalService.updateCannabisLicensePayment(
			caseId, bondFeeReceived, licenseFeeReceived, paymentOption,
			paymentStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisLicensePaymentLocalService.getBasePersistence();
	}

	@Override
	public CannabisLicensePaymentLocalService getWrappedService() {
		return _cannabisLicensePaymentLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisLicensePaymentLocalService cannabisLicensePaymentLocalService) {

		_cannabisLicensePaymentLocalService =
			cannabisLicensePaymentLocalService;
	}

	private CannabisLicensePaymentLocalService
		_cannabisLicensePaymentLocalService;

}