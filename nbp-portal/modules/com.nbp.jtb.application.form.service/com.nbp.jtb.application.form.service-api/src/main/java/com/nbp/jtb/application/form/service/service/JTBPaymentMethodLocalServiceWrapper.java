/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JTBPaymentMethodLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JTBPaymentMethodLocalService
 * @generated
 */
public class JTBPaymentMethodLocalServiceWrapper
	implements JTBPaymentMethodLocalService,
			   ServiceWrapper<JTBPaymentMethodLocalService> {

	public JTBPaymentMethodLocalServiceWrapper() {
		this(null);
	}

	public JTBPaymentMethodLocalServiceWrapper(
		JTBPaymentMethodLocalService jtbPaymentMethodLocalService) {

		_jtbPaymentMethodLocalService = jtbPaymentMethodLocalService;
	}

	/**
	 * Adds the jtb payment method to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBPaymentMethodLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbPaymentMethod the jtb payment method
	 * @return the jtb payment method that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JTBPaymentMethod
		addJTBPaymentMethod(
			com.nbp.jtb.application.form.service.model.JTBPaymentMethod
				jtbPaymentMethod) {

		return _jtbPaymentMethodLocalService.addJTBPaymentMethod(
			jtbPaymentMethod);
	}

	/**
	 * Creates a new jtb payment method with the primary key. Does not add the jtb payment method to the database.
	 *
	 * @param jTBPaymentMethodId the primary key for the new jtb payment method
	 * @return the new jtb payment method
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JTBPaymentMethod
		createJTBPaymentMethod(long jTBPaymentMethodId) {

		return _jtbPaymentMethodLocalService.createJTBPaymentMethod(
			jTBPaymentMethodId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbPaymentMethodLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jtb payment method from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBPaymentMethodLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbPaymentMethod the jtb payment method
	 * @return the jtb payment method that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JTBPaymentMethod
		deleteJTBPaymentMethod(
			com.nbp.jtb.application.form.service.model.JTBPaymentMethod
				jtbPaymentMethod) {

		return _jtbPaymentMethodLocalService.deleteJTBPaymentMethod(
			jtbPaymentMethod);
	}

	/**
	 * Deletes the jtb payment method with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBPaymentMethodLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jTBPaymentMethodId the primary key of the jtb payment method
	 * @return the jtb payment method that was removed
	 * @throws PortalException if a jtb payment method with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JTBPaymentMethod
			deleteJTBPaymentMethod(long jTBPaymentMethodId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbPaymentMethodLocalService.deleteJTBPaymentMethod(
			jTBPaymentMethodId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbPaymentMethodLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jtbPaymentMethodLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jtbPaymentMethodLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jtbPaymentMethodLocalService.dynamicQuery();
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

		return _jtbPaymentMethodLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBPaymentMethodModelImpl</code>.
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

		return _jtbPaymentMethodLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBPaymentMethodModelImpl</code>.
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

		return _jtbPaymentMethodLocalService.dynamicQuery(
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

		return _jtbPaymentMethodLocalService.dynamicQueryCount(dynamicQuery);
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

		return _jtbPaymentMethodLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.JTBPaymentMethod
		fetchJTBPaymentMethod(long jTBPaymentMethodId) {

		return _jtbPaymentMethodLocalService.fetchJTBPaymentMethod(
			jTBPaymentMethodId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jtbPaymentMethodLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jtbPaymentMethodLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.JTBPaymentMethod
			getJTBById(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBPaymentMethodException {

		return _jtbPaymentMethodLocalService.getJTBById(jtbApplicationId);
	}

	/**
	 * Returns the jtb payment method with the primary key.
	 *
	 * @param jTBPaymentMethodId the primary key of the jtb payment method
	 * @return the jtb payment method
	 * @throws PortalException if a jtb payment method with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JTBPaymentMethod
			getJTBPaymentMethod(long jTBPaymentMethodId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbPaymentMethodLocalService.getJTBPaymentMethod(
			jTBPaymentMethodId);
	}

	/**
	 * Returns a range of all the jtb payment methods.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBPaymentMethodModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb payment methods
	 * @param end the upper bound of the range of jtb payment methods (not inclusive)
	 * @return the range of jtb payment methods
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.JTBPaymentMethod>
			getJTBPaymentMethods(int start, int end) {

		return _jtbPaymentMethodLocalService.getJTBPaymentMethods(start, end);
	}

	/**
	 * Returns the number of jtb payment methods.
	 *
	 * @return the number of jtb payment methods
	 */
	@Override
	public int getJTBPaymentMethodsCount() {
		return _jtbPaymentMethodLocalService.getJTBPaymentMethodsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbPaymentMethodLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbPaymentMethodLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the jtb payment method in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBPaymentMethodLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbPaymentMethod the jtb payment method
	 * @return the jtb payment method that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JTBPaymentMethod
		updateJTBPaymentMethod(
			com.nbp.jtb.application.form.service.model.JTBPaymentMethod
				jtbPaymentMethod) {

		return _jtbPaymentMethodLocalService.updateJTBPaymentMethod(
			jtbPaymentMethod);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jtbPaymentMethodLocalService.getBasePersistence();
	}

	@Override
	public JTBPaymentMethodLocalService getWrappedService() {
		return _jtbPaymentMethodLocalService;
	}

	@Override
	public void setWrappedService(
		JTBPaymentMethodLocalService jtbPaymentMethodLocalService) {

		_jtbPaymentMethodLocalService = jtbPaymentMethodLocalService;
	}

	private JTBPaymentMethodLocalService _jtbPaymentMethodLocalService;

}