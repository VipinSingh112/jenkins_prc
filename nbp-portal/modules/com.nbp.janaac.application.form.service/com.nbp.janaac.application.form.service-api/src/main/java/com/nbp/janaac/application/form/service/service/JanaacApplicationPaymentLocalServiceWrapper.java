/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JanaacApplicationPaymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacApplicationPaymentLocalService
 * @generated
 */
public class JanaacApplicationPaymentLocalServiceWrapper
	implements JanaacApplicationPaymentLocalService,
			   ServiceWrapper<JanaacApplicationPaymentLocalService> {

	public JanaacApplicationPaymentLocalServiceWrapper() {
		this(null);
	}

	public JanaacApplicationPaymentLocalServiceWrapper(
		JanaacApplicationPaymentLocalService
			janaacApplicationPaymentLocalService) {

		_janaacApplicationPaymentLocalService =
			janaacApplicationPaymentLocalService;
	}

	/**
	 * Adds the janaac application payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacApplicationPayment the janaac application payment
	 * @return the janaac application payment that was added
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.JanaacApplicationPayment
			addJanaacApplicationPayment(
				com.nbp.janaac.application.form.service.model.
					JanaacApplicationPayment janaacApplicationPayment) {

		return _janaacApplicationPaymentLocalService.
			addJanaacApplicationPayment(janaacApplicationPayment);
	}

	/**
	 * Creates a new janaac application payment with the primary key. Does not add the janaac application payment to the database.
	 *
	 * @param janaacApplicationPaymentId the primary key for the new janaac application payment
	 * @return the new janaac application payment
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.JanaacApplicationPayment
			createJanaacApplicationPayment(long janaacApplicationPaymentId) {

		return _janaacApplicationPaymentLocalService.
			createJanaacApplicationPayment(janaacApplicationPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacApplicationPaymentLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the janaac application payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacApplicationPayment the janaac application payment
	 * @return the janaac application payment that was removed
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.JanaacApplicationPayment
			deleteJanaacApplicationPayment(
				com.nbp.janaac.application.form.service.model.
					JanaacApplicationPayment janaacApplicationPayment) {

		return _janaacApplicationPaymentLocalService.
			deleteJanaacApplicationPayment(janaacApplicationPayment);
	}

	/**
	 * Deletes the janaac application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacApplicationPaymentId the primary key of the janaac application payment
	 * @return the janaac application payment that was removed
	 * @throws PortalException if a janaac application payment with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.JanaacApplicationPayment
				deleteJanaacApplicationPayment(long janaacApplicationPaymentId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacApplicationPaymentLocalService.
			deleteJanaacApplicationPayment(janaacApplicationPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacApplicationPaymentLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _janaacApplicationPaymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _janaacApplicationPaymentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _janaacApplicationPaymentLocalService.dynamicQuery();
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

		return _janaacApplicationPaymentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.JanaacApplicationPaymentModelImpl</code>.
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

		return _janaacApplicationPaymentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.JanaacApplicationPaymentModelImpl</code>.
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

		return _janaacApplicationPaymentLocalService.dynamicQuery(
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

		return _janaacApplicationPaymentLocalService.dynamicQueryCount(
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

		return _janaacApplicationPaymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.janaac.application.form.service.model.JanaacApplicationPayment
			fetchJanaacApplicationPayment(long janaacApplicationPaymentId) {

		return _janaacApplicationPaymentLocalService.
			fetchJanaacApplicationPayment(janaacApplicationPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _janaacApplicationPaymentLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _janaacApplicationPaymentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the janaac application payment with the primary key.
	 *
	 * @param janaacApplicationPaymentId the primary key of the janaac application payment
	 * @return the janaac application payment
	 * @throws PortalException if a janaac application payment with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.JanaacApplicationPayment
				getJanaacApplicationPayment(long janaacApplicationPaymentId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacApplicationPaymentLocalService.
			getJanaacApplicationPayment(janaacApplicationPaymentId);
	}

	/**
	 * Returns a range of all the janaac application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.JanaacApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac application payments
	 * @param end the upper bound of the range of janaac application payments (not inclusive)
	 * @return the range of janaac application payments
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.JanaacApplicationPayment>
			getJanaacApplicationPayments(int start, int end) {

		return _janaacApplicationPaymentLocalService.
			getJanaacApplicationPayments(start, end);
	}

	/**
	 * Returns the number of janaac application payments.
	 *
	 * @return the number of janaac application payments
	 */
	@Override
	public int getJanaacApplicationPaymentsCount() {
		return _janaacApplicationPaymentLocalService.
			getJanaacApplicationPaymentsCount();
	}

	@Override
	public
		com.nbp.janaac.application.form.service.model.JanaacApplicationPayment
				getJanaacById(long janaacApplicationId)
			throws com.nbp.janaac.application.form.service.exception.
				NoSuchJanaacApplicationPaymentException {

		return _janaacApplicationPaymentLocalService.getJanaacById(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _janaacApplicationPaymentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacApplicationPaymentLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the janaac application payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacApplicationPayment the janaac application payment
	 * @return the janaac application payment that was updated
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.JanaacApplicationPayment
			updateJanaacApplicationPayment(
				com.nbp.janaac.application.form.service.model.
					JanaacApplicationPayment janaacApplicationPayment) {

		return _janaacApplicationPaymentLocalService.
			updateJanaacApplicationPayment(janaacApplicationPayment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _janaacApplicationPaymentLocalService.getBasePersistence();
	}

	@Override
	public JanaacApplicationPaymentLocalService getWrappedService() {
		return _janaacApplicationPaymentLocalService;
	}

	@Override
	public void setWrappedService(
		JanaacApplicationPaymentLocalService
			janaacApplicationPaymentLocalService) {

		_janaacApplicationPaymentLocalService =
			janaacApplicationPaymentLocalService;
	}

	private JanaacApplicationPaymentLocalService
		_janaacApplicationPaymentLocalService;

}