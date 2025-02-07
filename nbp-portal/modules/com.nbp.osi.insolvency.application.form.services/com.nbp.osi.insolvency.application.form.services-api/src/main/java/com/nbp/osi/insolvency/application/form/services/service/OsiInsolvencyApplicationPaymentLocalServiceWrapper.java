/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiInsolvencyApplicationPaymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyApplicationPaymentLocalService
 * @generated
 */
public class OsiInsolvencyApplicationPaymentLocalServiceWrapper
	implements OsiInsolvencyApplicationPaymentLocalService,
			   ServiceWrapper<OsiInsolvencyApplicationPaymentLocalService> {

	public OsiInsolvencyApplicationPaymentLocalServiceWrapper() {
		this(null);
	}

	public OsiInsolvencyApplicationPaymentLocalServiceWrapper(
		OsiInsolvencyApplicationPaymentLocalService
			osiInsolvencyApplicationPaymentLocalService) {

		_osiInsolvencyApplicationPaymentLocalService =
			osiInsolvencyApplicationPaymentLocalService;
	}

	/**
	 * Adds the osi insolvency application payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyApplicationPayment the osi insolvency application payment
	 * @return the osi insolvency application payment that was added
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyApplicationPayment addOsiInsolvencyApplicationPayment(
			com.nbp.osi.insolvency.application.form.services.model.
				OsiInsolvencyApplicationPayment
					osiInsolvencyApplicationPayment) {

		return _osiInsolvencyApplicationPaymentLocalService.
			addOsiInsolvencyApplicationPayment(osiInsolvencyApplicationPayment);
	}

	/**
	 * Creates a new osi insolvency application payment with the primary key. Does not add the osi insolvency application payment to the database.
	 *
	 * @param osiInsolveApplicationPaymentId the primary key for the new osi insolvency application payment
	 * @return the new osi insolvency application payment
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyApplicationPayment createOsiInsolvencyApplicationPayment(
			long osiInsolveApplicationPaymentId) {

		return _osiInsolvencyApplicationPaymentLocalService.
			createOsiInsolvencyApplicationPayment(
				osiInsolveApplicationPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyApplicationPaymentLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the osi insolvency application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolveApplicationPaymentId the primary key of the osi insolvency application payment
	 * @return the osi insolvency application payment that was removed
	 * @throws PortalException if a osi insolvency application payment with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyApplicationPayment deleteOsiInsolvencyApplicationPayment(
				long osiInsolveApplicationPaymentId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyApplicationPaymentLocalService.
			deleteOsiInsolvencyApplicationPayment(
				osiInsolveApplicationPaymentId);
	}

	/**
	 * Deletes the osi insolvency application payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyApplicationPayment the osi insolvency application payment
	 * @return the osi insolvency application payment that was removed
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyApplicationPayment deleteOsiInsolvencyApplicationPayment(
			com.nbp.osi.insolvency.application.form.services.model.
				OsiInsolvencyApplicationPayment
					osiInsolvencyApplicationPayment) {

		return _osiInsolvencyApplicationPaymentLocalService.
			deleteOsiInsolvencyApplicationPayment(
				osiInsolvencyApplicationPayment);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyApplicationPaymentLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiInsolvencyApplicationPaymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiInsolvencyApplicationPaymentLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiInsolvencyApplicationPaymentLocalService.dynamicQuery();
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

		return _osiInsolvencyApplicationPaymentLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvencyApplicationPaymentModelImpl</code>.
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

		return _osiInsolvencyApplicationPaymentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvencyApplicationPaymentModelImpl</code>.
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

		return _osiInsolvencyApplicationPaymentLocalService.dynamicQuery(
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

		return _osiInsolvencyApplicationPaymentLocalService.dynamicQueryCount(
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

		return _osiInsolvencyApplicationPaymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyApplicationPayment fetchOsiInsolvencyApplicationPayment(
			long osiInsolveApplicationPaymentId) {

		return _osiInsolvencyApplicationPaymentLocalService.
			fetchOsiInsolvencyApplicationPayment(
				osiInsolveApplicationPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiInsolvencyApplicationPaymentLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiInsolvencyApplicationPaymentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiInsolvencyApplicationPaymentLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi insolvency application payment with the primary key.
	 *
	 * @param osiInsolveApplicationPaymentId the primary key of the osi insolvency application payment
	 * @return the osi insolvency application payment
	 * @throws NoSuchOsiInsolvencyApplicationPaymentException
	 * @throws PortalException if a osi insolvency application payment with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyApplicationPayment getOsiInsolvencyApplicationPayment(
				long osiInsolveApplicationPaymentId)
			throws com.liferay.portal.kernel.exception.PortalException,
				   com.nbp.osi.insolvency.application.form.services.exception.
					   NoSuchOsiInsolvencyApplicationPaymentException {

		return _osiInsolvencyApplicationPaymentLocalService.
			getOsiInsolvencyApplicationPayment(osiInsolveApplicationPaymentId);
	}

	/**
	 * Returns a range of all the osi insolvency application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvencyApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency application payments
	 * @param end the upper bound of the range of osi insolvency application payments (not inclusive)
	 * @return the range of osi insolvency application payments
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			OsiInsolvencyApplicationPayment>
				getOsiInsolvencyApplicationPayments(int start, int end) {

		return _osiInsolvencyApplicationPaymentLocalService.
			getOsiInsolvencyApplicationPayments(start, end);
	}

	/**
	 * Returns the number of osi insolvency application payments.
	 *
	 * @return the number of osi insolvency application payments
	 */
	@Override
	public int getOsiInsolvencyApplicationPaymentsCount() {
		return _osiInsolvencyApplicationPaymentLocalService.
			getOsiInsolvencyApplicationPaymentsCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyApplicationPaymentLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi insolvency application payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyApplicationPayment the osi insolvency application payment
	 * @return the osi insolvency application payment that was updated
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyApplicationPayment updateOsiInsolvencyApplicationPayment(
			com.nbp.osi.insolvency.application.form.services.model.
				OsiInsolvencyApplicationPayment
					osiInsolvencyApplicationPayment) {

		return _osiInsolvencyApplicationPaymentLocalService.
			updateOsiInsolvencyApplicationPayment(
				osiInsolvencyApplicationPayment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiInsolvencyApplicationPaymentLocalService.
			getBasePersistence();
	}

	@Override
	public OsiInsolvencyApplicationPaymentLocalService getWrappedService() {
		return _osiInsolvencyApplicationPaymentLocalService;
	}

	@Override
	public void setWrappedService(
		OsiInsolvencyApplicationPaymentLocalService
			osiInsolvencyApplicationPaymentLocalService) {

		_osiInsolvencyApplicationPaymentLocalService =
			osiInsolvencyApplicationPaymentLocalService;
	}

	private OsiInsolvencyApplicationPaymentLocalService
		_osiInsolvencyApplicationPaymentLocalService;

}