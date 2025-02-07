/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link PharmaApplicationPaymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationPaymentLocalService
 * @generated
 */
public class PharmaApplicationPaymentLocalServiceWrapper
	implements PharmaApplicationPaymentLocalService,
			   ServiceWrapper<PharmaApplicationPaymentLocalService> {

	public PharmaApplicationPaymentLocalServiceWrapper() {
		this(null);
	}

	public PharmaApplicationPaymentLocalServiceWrapper(
		PharmaApplicationPaymentLocalService
			pharmaApplicationPaymentLocalService) {

		_pharmaApplicationPaymentLocalService =
			pharmaApplicationPaymentLocalService;
	}

	/**
	 * Adds the pharma application payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationPayment the pharma application payment
	 * @return the pharma application payment that was added
	 */
	@Override
	public com.nbp.pharmaceutical.application.form.service.model.
		PharmaApplicationPayment addPharmaApplicationPayment(
			com.nbp.pharmaceutical.application.form.service.model.
				PharmaApplicationPayment pharmaApplicationPayment) {

		return _pharmaApplicationPaymentLocalService.
			addPharmaApplicationPayment(pharmaApplicationPayment);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationPaymentLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new pharma application payment with the primary key. Does not add the pharma application payment to the database.
	 *
	 * @param pharmaApplicationPaymentId the primary key for the new pharma application payment
	 * @return the new pharma application payment
	 */
	@Override
	public com.nbp.pharmaceutical.application.form.service.model.
		PharmaApplicationPayment createPharmaApplicationPayment(
			long pharmaApplicationPaymentId) {

		return _pharmaApplicationPaymentLocalService.
			createPharmaApplicationPayment(pharmaApplicationPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationPaymentLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the pharma application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationPaymentId the primary key of the pharma application payment
	 * @return the pharma application payment that was removed
	 * @throws PortalException if a pharma application payment with the primary key could not be found
	 */
	@Override
	public com.nbp.pharmaceutical.application.form.service.model.
		PharmaApplicationPayment deletePharmaApplicationPayment(
				long pharmaApplicationPaymentId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationPaymentLocalService.
			deletePharmaApplicationPayment(pharmaApplicationPaymentId);
	}

	/**
	 * Deletes the pharma application payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationPayment the pharma application payment
	 * @return the pharma application payment that was removed
	 */
	@Override
	public com.nbp.pharmaceutical.application.form.service.model.
		PharmaApplicationPayment deletePharmaApplicationPayment(
			com.nbp.pharmaceutical.application.form.service.model.
				PharmaApplicationPayment pharmaApplicationPayment) {

		return _pharmaApplicationPaymentLocalService.
			deletePharmaApplicationPayment(pharmaApplicationPayment);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pharmaApplicationPaymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pharmaApplicationPaymentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pharmaApplicationPaymentLocalService.dynamicQuery();
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

		return _pharmaApplicationPaymentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaApplicationPaymentModelImpl</code>.
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

		return _pharmaApplicationPaymentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaApplicationPaymentModelImpl</code>.
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

		return _pharmaApplicationPaymentLocalService.dynamicQuery(
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

		return _pharmaApplicationPaymentLocalService.dynamicQueryCount(
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

		return _pharmaApplicationPaymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.pharmaceutical.application.form.service.model.
		PharmaApplicationPayment fetchPharmaApplicationPayment(
			long pharmaApplicationPaymentId) {

		return _pharmaApplicationPaymentLocalService.
			fetchPharmaApplicationPayment(pharmaApplicationPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pharmaApplicationPaymentLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pharmaApplicationPaymentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaApplicationPaymentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationPaymentLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the pharma application payment with the primary key.
	 *
	 * @param pharmaApplicationPaymentId the primary key of the pharma application payment
	 * @return the pharma application payment
	 * @throws PortalException if a pharma application payment with the primary key could not be found
	 */
	@Override
	public com.nbp.pharmaceutical.application.form.service.model.
		PharmaApplicationPayment getPharmaApplicationPayment(
				long pharmaApplicationPaymentId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationPaymentLocalService.
			getPharmaApplicationPayment(pharmaApplicationPaymentId);
	}

	@Override
	public com.nbp.pharmaceutical.application.form.service.model.
		PharmaApplicationPayment
				getPharmaApplicationPaymentbyPharmaApplicationId(
					long pharmaApplicationId)
			throws com.nbp.pharmaceutical.application.form.service.exception.
				NoSuchPharmaApplicationPaymentException {

		return _pharmaApplicationPaymentLocalService.
			getPharmaApplicationPaymentbyPharmaApplicationId(
				pharmaApplicationId);
	}

	/**
	 * Returns a range of all the pharma application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application payments
	 * @param end the upper bound of the range of pharma application payments (not inclusive)
	 * @return the range of pharma application payments
	 */
	@Override
	public java.util.List
		<com.nbp.pharmaceutical.application.form.service.model.
			PharmaApplicationPayment> getPharmaApplicationPayments(
				int start, int end) {

		return _pharmaApplicationPaymentLocalService.
			getPharmaApplicationPayments(start, end);
	}

	/**
	 * Returns the number of pharma application payments.
	 *
	 * @return the number of pharma application payments
	 */
	@Override
	public int getPharmaApplicationPaymentsCount() {
		return _pharmaApplicationPaymentLocalService.
			getPharmaApplicationPaymentsCount();
	}

	/**
	 * Updates the pharma application payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationPayment the pharma application payment
	 * @return the pharma application payment that was updated
	 */
	@Override
	public com.nbp.pharmaceutical.application.form.service.model.
		PharmaApplicationPayment updatePharmaApplicationPayment(
			com.nbp.pharmaceutical.application.form.service.model.
				PharmaApplicationPayment pharmaApplicationPayment) {

		return _pharmaApplicationPaymentLocalService.
			updatePharmaApplicationPayment(pharmaApplicationPayment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _pharmaApplicationPaymentLocalService.getBasePersistence();
	}

	@Override
	public PharmaApplicationPaymentLocalService getWrappedService() {
		return _pharmaApplicationPaymentLocalService;
	}

	@Override
	public void setWrappedService(
		PharmaApplicationPaymentLocalService
			pharmaApplicationPaymentLocalService) {

		_pharmaApplicationPaymentLocalService =
			pharmaApplicationPaymentLocalService;
	}

	private PharmaApplicationPaymentLocalService
		_pharmaApplicationPaymentLocalService;

}