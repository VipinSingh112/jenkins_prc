/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiicPaymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicPaymentLocalService
 * @generated
 */
public class MiicPaymentLocalServiceWrapper
	implements MiicPaymentLocalService,
			   ServiceWrapper<MiicPaymentLocalService> {

	public MiicPaymentLocalServiceWrapper() {
		this(null);
	}

	public MiicPaymentLocalServiceWrapper(
		MiicPaymentLocalService miicPaymentLocalService) {

		_miicPaymentLocalService = miicPaymentLocalService;
	}

	/**
	 * Adds the miic payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicPayment the miic payment
	 * @return the miic payment that was added
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicPayment
		addMiicPayment(
			com.nbp.miic.application.form.services.model.MiicPayment
				miicPayment) {

		return _miicPaymentLocalService.addMiicPayment(miicPayment);
	}

	/**
	 * Creates a new miic payment with the primary key. Does not add the miic payment to the database.
	 *
	 * @param miicPaymentId the primary key for the new miic payment
	 * @return the new miic payment
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicPayment
		createMiicPayment(long miicPaymentId) {

		return _miicPaymentLocalService.createMiicPayment(miicPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicPaymentLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the miic payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicPaymentId the primary key of the miic payment
	 * @return the miic payment that was removed
	 * @throws PortalException if a miic payment with the primary key could not be found
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicPayment
			deleteMiicPayment(long miicPaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicPaymentLocalService.deleteMiicPayment(miicPaymentId);
	}

	/**
	 * Deletes the miic payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicPayment the miic payment
	 * @return the miic payment that was removed
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicPayment
		deleteMiicPayment(
			com.nbp.miic.application.form.services.model.MiicPayment
				miicPayment) {

		return _miicPaymentLocalService.deleteMiicPayment(miicPayment);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicPaymentLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miicPaymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miicPaymentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miicPaymentLocalService.dynamicQuery();
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

		return _miicPaymentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicPaymentModelImpl</code>.
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

		return _miicPaymentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicPaymentModelImpl</code>.
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

		return _miicPaymentLocalService.dynamicQuery(
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

		return _miicPaymentLocalService.dynamicQueryCount(dynamicQuery);
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

		return _miicPaymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.miic.application.form.services.model.MiicPayment
		fetchMiicPayment(long miicPaymentId) {

		return _miicPaymentLocalService.fetchMiicPayment(miicPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miicPaymentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miicPaymentLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the miic payment with the primary key.
	 *
	 * @param miicPaymentId the primary key of the miic payment
	 * @return the miic payment
	 * @throws PortalException if a miic payment with the primary key could not be found
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicPayment
			getMiicPayment(long miicPaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicPaymentLocalService.getMiicPayment(miicPaymentId);
	}

	/**
	 * Returns a range of all the miic payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic payments
	 * @param end the upper bound of the range of miic payments (not inclusive)
	 * @return the range of miic payments
	 */
	@Override
	public java.util.List
		<com.nbp.miic.application.form.services.model.MiicPayment>
			getMiicPayments(int start, int end) {

		return _miicPaymentLocalService.getMiicPayments(start, end);
	}

	/**
	 * Returns the number of miic payments.
	 *
	 * @return the number of miic payments
	 */
	@Override
	public int getMiicPaymentsCount() {
		return _miicPaymentLocalService.getMiicPaymentsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicPaymentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicPaymentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the miic payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicPayment the miic payment
	 * @return the miic payment that was updated
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicPayment
		updateMiicPayment(
			com.nbp.miic.application.form.services.model.MiicPayment
				miicPayment) {

		return _miicPaymentLocalService.updateMiicPayment(miicPayment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miicPaymentLocalService.getBasePersistence();
	}

	@Override
	public MiicPaymentLocalService getWrappedService() {
		return _miicPaymentLocalService;
	}

	@Override
	public void setWrappedService(
		MiicPaymentLocalService miicPaymentLocalService) {

		_miicPaymentLocalService = miicPaymentLocalService;
	}

	private MiicPaymentLocalService _miicPaymentLocalService;

}