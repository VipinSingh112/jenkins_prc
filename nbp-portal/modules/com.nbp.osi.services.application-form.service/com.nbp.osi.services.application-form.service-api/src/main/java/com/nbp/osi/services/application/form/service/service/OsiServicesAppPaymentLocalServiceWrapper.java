/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiServicesAppPaymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesAppPaymentLocalService
 * @generated
 */
public class OsiServicesAppPaymentLocalServiceWrapper
	implements OsiServicesAppPaymentLocalService,
			   ServiceWrapper<OsiServicesAppPaymentLocalService> {

	public OsiServicesAppPaymentLocalServiceWrapper() {
		this(null);
	}

	public OsiServicesAppPaymentLocalServiceWrapper(
		OsiServicesAppPaymentLocalService osiServicesAppPaymentLocalService) {

		_osiServicesAppPaymentLocalService = osiServicesAppPaymentLocalService;
	}

	/**
	 * Adds the osi services app payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesAppPayment the osi services app payment
	 * @return the osi services app payment that was added
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesAppPayment addOsiServicesAppPayment(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesAppPayment osiServicesAppPayment) {

		return _osiServicesAppPaymentLocalService.addOsiServicesAppPayment(
			osiServicesAppPayment);
	}

	/**
	 * Creates a new osi services app payment with the primary key. Does not add the osi services app payment to the database.
	 *
	 * @param osiServicesAppPaymentId the primary key for the new osi services app payment
	 * @return the new osi services app payment
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesAppPayment createOsiServicesAppPayment(
				long osiServicesAppPaymentId) {

		return _osiServicesAppPaymentLocalService.createOsiServicesAppPayment(
			osiServicesAppPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesAppPaymentLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi services app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesAppPaymentId the primary key of the osi services app payment
	 * @return the osi services app payment that was removed
	 * @throws PortalException if a osi services app payment with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesAppPayment deleteOsiServicesAppPayment(
					long osiServicesAppPaymentId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesAppPaymentLocalService.deleteOsiServicesAppPayment(
			osiServicesAppPaymentId);
	}

	/**
	 * Deletes the osi services app payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesAppPayment the osi services app payment
	 * @return the osi services app payment that was removed
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesAppPayment deleteOsiServicesAppPayment(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesAppPayment osiServicesAppPayment) {

		return _osiServicesAppPaymentLocalService.deleteOsiServicesAppPayment(
			osiServicesAppPayment);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesAppPaymentLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiServicesAppPaymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiServicesAppPaymentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiServicesAppPaymentLocalService.dynamicQuery();
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

		return _osiServicesAppPaymentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesAppPaymentModelImpl</code>.
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

		return _osiServicesAppPaymentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesAppPaymentModelImpl</code>.
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

		return _osiServicesAppPaymentLocalService.dynamicQuery(
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

		return _osiServicesAppPaymentLocalService.dynamicQueryCount(
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

		return _osiServicesAppPaymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesAppPayment fetchOsiServicesAppPayment(
				long osiServicesAppPaymentId) {

		return _osiServicesAppPaymentLocalService.fetchOsiServicesAppPayment(
			osiServicesAppPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiServicesAppPaymentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiServicesAppPaymentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesAppPaymentLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesAppPayment getOsiServiceAppPaymentById(
					long applicationId)
				throws com.nbp.osi.services.application.form.service.exception.
					NoSuchOsiServicesAppPaymentException {

		return _osiServicesAppPaymentLocalService.getOsiServiceAppPaymentById(
			applicationId);
	}

	/**
	 * Returns the osi services app payment with the primary key.
	 *
	 * @param osiServicesAppPaymentId the primary key of the osi services app payment
	 * @return the osi services app payment
	 * @throws PortalException if a osi services app payment with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesAppPayment getOsiServicesAppPayment(
					long osiServicesAppPaymentId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesAppPaymentLocalService.getOsiServicesAppPayment(
			osiServicesAppPaymentId);
	}

	/**
	 * Returns a range of all the osi services app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services app payments
	 * @param end the upper bound of the range of osi services app payments (not inclusive)
	 * @return the range of osi services app payments
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesAppPayment> getOsiServicesAppPayments(
				int start, int end) {

		return _osiServicesAppPaymentLocalService.getOsiServicesAppPayments(
			start, end);
	}

	/**
	 * Returns the number of osi services app payments.
	 *
	 * @return the number of osi services app payments
	 */
	@Override
	public int getOsiServicesAppPaymentsCount() {
		return _osiServicesAppPaymentLocalService.
			getOsiServicesAppPaymentsCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesAppPaymentLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi services app payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesAppPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesAppPayment the osi services app payment
	 * @return the osi services app payment that was updated
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesAppPayment updateOsiServicesAppPayment(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesAppPayment osiServicesAppPayment) {

		return _osiServicesAppPaymentLocalService.updateOsiServicesAppPayment(
			osiServicesAppPayment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiServicesAppPaymentLocalService.getBasePersistence();
	}

	@Override
	public OsiServicesAppPaymentLocalService getWrappedService() {
		return _osiServicesAppPaymentLocalService;
	}

	@Override
	public void setWrappedService(
		OsiServicesAppPaymentLocalService osiServicesAppPaymentLocalService) {

		_osiServicesAppPaymentLocalService = osiServicesAppPaymentLocalService;
	}

	private OsiServicesAppPaymentLocalService
		_osiServicesAppPaymentLocalService;

}