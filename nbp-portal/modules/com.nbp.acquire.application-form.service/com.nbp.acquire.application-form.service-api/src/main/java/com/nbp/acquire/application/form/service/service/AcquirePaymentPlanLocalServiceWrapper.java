/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcquirePaymentPlanLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePaymentPlanLocalService
 * @generated
 */
public class AcquirePaymentPlanLocalServiceWrapper
	implements AcquirePaymentPlanLocalService,
			   ServiceWrapper<AcquirePaymentPlanLocalService> {

	public AcquirePaymentPlanLocalServiceWrapper() {
		this(null);
	}

	public AcquirePaymentPlanLocalServiceWrapper(
		AcquirePaymentPlanLocalService acquirePaymentPlanLocalService) {

		_acquirePaymentPlanLocalService = acquirePaymentPlanLocalService;
	}

	/**
	 * Adds the acquire payment plan to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquirePaymentPlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquirePaymentPlan the acquire payment plan
	 * @return the acquire payment plan that was added
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquirePaymentPlan
		addAcquirePaymentPlan(
			com.nbp.acquire.application.form.service.model.AcquirePaymentPlan
				acquirePaymentPlan) {

		return _acquirePaymentPlanLocalService.addAcquirePaymentPlan(
			acquirePaymentPlan);
	}

	/**
	 * Creates a new acquire payment plan with the primary key. Does not add the acquire payment plan to the database.
	 *
	 * @param acquirePaymentPlanId the primary key for the new acquire payment plan
	 * @return the new acquire payment plan
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquirePaymentPlan
		createAcquirePaymentPlan(long acquirePaymentPlanId) {

		return _acquirePaymentPlanLocalService.createAcquirePaymentPlan(
			acquirePaymentPlanId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquirePaymentPlanLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acquire payment plan from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquirePaymentPlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquirePaymentPlan the acquire payment plan
	 * @return the acquire payment plan that was removed
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquirePaymentPlan
		deleteAcquirePaymentPlan(
			com.nbp.acquire.application.form.service.model.AcquirePaymentPlan
				acquirePaymentPlan) {

		return _acquirePaymentPlanLocalService.deleteAcquirePaymentPlan(
			acquirePaymentPlan);
	}

	/**
	 * Deletes the acquire payment plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquirePaymentPlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquirePaymentPlanId the primary key of the acquire payment plan
	 * @return the acquire payment plan that was removed
	 * @throws PortalException if a acquire payment plan with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquirePaymentPlan
			deleteAcquirePaymentPlan(long acquirePaymentPlanId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquirePaymentPlanLocalService.deleteAcquirePaymentPlan(
			acquirePaymentPlanId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquirePaymentPlanLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acquirePaymentPlanLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acquirePaymentPlanLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acquirePaymentPlanLocalService.dynamicQuery();
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

		return _acquirePaymentPlanLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquirePaymentPlanModelImpl</code>.
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

		return _acquirePaymentPlanLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquirePaymentPlanModelImpl</code>.
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

		return _acquirePaymentPlanLocalService.dynamicQuery(
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

		return _acquirePaymentPlanLocalService.dynamicQueryCount(dynamicQuery);
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

		return _acquirePaymentPlanLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.acquire.application.form.service.model.AcquirePaymentPlan
		fetchAcquirePaymentPlan(long acquirePaymentPlanId) {

		return _acquirePaymentPlanLocalService.fetchAcquirePaymentPlan(
			acquirePaymentPlanId);
	}

	/**
	 * Returns the acquire payment plan with the primary key.
	 *
	 * @param acquirePaymentPlanId the primary key of the acquire payment plan
	 * @return the acquire payment plan
	 * @throws PortalException if a acquire payment plan with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquirePaymentPlan
			getAcquirePaymentPlan(long acquirePaymentPlanId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquirePaymentPlanLocalService.getAcquirePaymentPlan(
			acquirePaymentPlanId);
	}

	@Override
	public com.nbp.acquire.application.form.service.model.AcquirePaymentPlan
			getAcquirePaymentPlanById(long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquirePropertyDetailsException {

		return _acquirePaymentPlanLocalService.getAcquirePaymentPlanById(
			acquireApplicationId);
	}

	/**
	 * Returns a range of all the acquire payment plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquirePaymentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire payment plans
	 * @param end the upper bound of the range of acquire payment plans (not inclusive)
	 * @return the range of acquire payment plans
	 */
	@Override
	public java.util.List
		<com.nbp.acquire.application.form.service.model.AcquirePaymentPlan>
			getAcquirePaymentPlans(int start, int end) {

		return _acquirePaymentPlanLocalService.getAcquirePaymentPlans(
			start, end);
	}

	/**
	 * Returns the number of acquire payment plans.
	 *
	 * @return the number of acquire payment plans
	 */
	@Override
	public int getAcquirePaymentPlansCount() {
		return _acquirePaymentPlanLocalService.getAcquirePaymentPlansCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acquirePaymentPlanLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acquirePaymentPlanLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquirePaymentPlanLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquirePaymentPlanLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the acquire payment plan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquirePaymentPlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquirePaymentPlan the acquire payment plan
	 * @return the acquire payment plan that was updated
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquirePaymentPlan
		updateAcquirePaymentPlan(
			com.nbp.acquire.application.form.service.model.AcquirePaymentPlan
				acquirePaymentPlan) {

		return _acquirePaymentPlanLocalService.updateAcquirePaymentPlan(
			acquirePaymentPlan);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acquirePaymentPlanLocalService.getBasePersistence();
	}

	@Override
	public AcquirePaymentPlanLocalService getWrappedService() {
		return _acquirePaymentPlanLocalService;
	}

	@Override
	public void setWrappedService(
		AcquirePaymentPlanLocalService acquirePaymentPlanLocalService) {

		_acquirePaymentPlanLocalService = acquirePaymentPlanLocalService;
	}

	private AcquirePaymentPlanLocalService _acquirePaymentPlanLocalService;

}