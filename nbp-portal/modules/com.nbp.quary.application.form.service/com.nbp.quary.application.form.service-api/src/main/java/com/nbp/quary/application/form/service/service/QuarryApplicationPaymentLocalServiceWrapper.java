/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QuarryApplicationPaymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationPaymentLocalService
 * @generated
 */
public class QuarryApplicationPaymentLocalServiceWrapper
	implements QuarryApplicationPaymentLocalService,
			   ServiceWrapper<QuarryApplicationPaymentLocalService> {

	public QuarryApplicationPaymentLocalServiceWrapper() {
		this(null);
	}

	public QuarryApplicationPaymentLocalServiceWrapper(
		QuarryApplicationPaymentLocalService
			quarryApplicationPaymentLocalService) {

		_quarryApplicationPaymentLocalService =
			quarryApplicationPaymentLocalService;
	}

	/**
	 * Adds the quarry application payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationPayment the quarry application payment
	 * @return the quarry application payment that was added
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryApplicationPayment
		addQuarryApplicationPayment(
			com.nbp.quary.application.form.service.model.
				QuarryApplicationPayment quarryApplicationPayment) {

		return _quarryApplicationPaymentLocalService.
			addQuarryApplicationPayment(quarryApplicationPayment);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationPaymentLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new quarry application payment with the primary key. Does not add the quarry application payment to the database.
	 *
	 * @param quarryApplicationPaymentId the primary key for the new quarry application payment
	 * @return the new quarry application payment
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryApplicationPayment
		createQuarryApplicationPayment(long quarryApplicationPaymentId) {

		return _quarryApplicationPaymentLocalService.
			createQuarryApplicationPayment(quarryApplicationPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationPaymentLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the quarry application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationPaymentId the primary key of the quarry application payment
	 * @return the quarry application payment that was removed
	 * @throws PortalException if a quarry application payment with the primary key could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryApplicationPayment
			deleteQuarryApplicationPayment(long quarryApplicationPaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationPaymentLocalService.
			deleteQuarryApplicationPayment(quarryApplicationPaymentId);
	}

	/**
	 * Deletes the quarry application payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationPayment the quarry application payment
	 * @return the quarry application payment that was removed
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryApplicationPayment
		deleteQuarryApplicationPayment(
			com.nbp.quary.application.form.service.model.
				QuarryApplicationPayment quarryApplicationPayment) {

		return _quarryApplicationPaymentLocalService.
			deleteQuarryApplicationPayment(quarryApplicationPayment);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _quarryApplicationPaymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _quarryApplicationPaymentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _quarryApplicationPaymentLocalService.dynamicQuery();
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

		return _quarryApplicationPaymentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicationPaymentModelImpl</code>.
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

		return _quarryApplicationPaymentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicationPaymentModelImpl</code>.
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

		return _quarryApplicationPaymentLocalService.dynamicQuery(
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

		return _quarryApplicationPaymentLocalService.dynamicQueryCount(
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

		return _quarryApplicationPaymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.quary.application.form.service.model.QuarryApplicationPayment
		fetchQuarryApplicationPayment(long quarryApplicationPaymentId) {

		return _quarryApplicationPaymentLocalService.
			fetchQuarryApplicationPayment(quarryApplicationPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _quarryApplicationPaymentLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _quarryApplicationPaymentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryApplicationPaymentLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.nbp.quary.application.form.service.model.QuarryApplicationPayment
			getPaymentBy_Id(long quarryAppId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationPaymentException {

		return _quarryApplicationPaymentLocalService.getPaymentBy_Id(
			quarryAppId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationPaymentLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the quarry application payment with the primary key.
	 *
	 * @param quarryApplicationPaymentId the primary key of the quarry application payment
	 * @return the quarry application payment
	 * @throws PortalException if a quarry application payment with the primary key could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryApplicationPayment
			getQuarryApplicationPayment(long quarryApplicationPaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationPaymentLocalService.
			getQuarryApplicationPayment(quarryApplicationPaymentId);
	}

	/**
	 * Returns a range of all the quarry application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application payments
	 * @param end the upper bound of the range of quarry application payments (not inclusive)
	 * @return the range of quarry application payments
	 */
	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.QuarryApplicationPayment>
			getQuarryApplicationPayments(int start, int end) {

		return _quarryApplicationPaymentLocalService.
			getQuarryApplicationPayments(start, end);
	}

	/**
	 * Returns the number of quarry application payments.
	 *
	 * @return the number of quarry application payments
	 */
	@Override
	public int getQuarryApplicationPaymentsCount() {
		return _quarryApplicationPaymentLocalService.
			getQuarryApplicationPaymentsCount();
	}

	/**
	 * Updates the quarry application payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationPayment the quarry application payment
	 * @return the quarry application payment that was updated
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryApplicationPayment
		updateQuarryApplicationPayment(
			com.nbp.quary.application.form.service.model.
				QuarryApplicationPayment quarryApplicationPayment) {

		return _quarryApplicationPaymentLocalService.
			updateQuarryApplicationPayment(quarryApplicationPayment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _quarryApplicationPaymentLocalService.getBasePersistence();
	}

	@Override
	public QuarryApplicationPaymentLocalService getWrappedService() {
		return _quarryApplicationPaymentLocalService;
	}

	@Override
	public void setWrappedService(
		QuarryApplicationPaymentLocalService
			quarryApplicationPaymentLocalService) {

		_quarryApplicationPaymentLocalService =
			quarryApplicationPaymentLocalService;
	}

	private QuarryApplicationPaymentLocalService
		_quarryApplicationPaymentLocalService;

}