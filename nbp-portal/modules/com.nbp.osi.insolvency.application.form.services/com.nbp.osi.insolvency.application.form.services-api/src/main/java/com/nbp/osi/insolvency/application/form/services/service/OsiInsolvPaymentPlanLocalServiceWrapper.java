/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiInsolvPaymentPlanLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvPaymentPlanLocalService
 * @generated
 */
public class OsiInsolvPaymentPlanLocalServiceWrapper
	implements OsiInsolvPaymentPlanLocalService,
			   ServiceWrapper<OsiInsolvPaymentPlanLocalService> {

	public OsiInsolvPaymentPlanLocalServiceWrapper() {
		this(null);
	}

	public OsiInsolvPaymentPlanLocalServiceWrapper(
		OsiInsolvPaymentPlanLocalService osiInsolvPaymentPlanLocalService) {

		_osiInsolvPaymentPlanLocalService = osiInsolvPaymentPlanLocalService;
	}

	/**
	 * Adds the osi insolv payment plan to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvPaymentPlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvPaymentPlan the osi insolv payment plan
	 * @return the osi insolv payment plan that was added
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiInsolvPaymentPlan addOsiInsolvPaymentPlan(
				com.nbp.osi.insolvency.application.form.services.model.
					OsiInsolvPaymentPlan osiInsolvPaymentPlan) {

		return _osiInsolvPaymentPlanLocalService.addOsiInsolvPaymentPlan(
			osiInsolvPaymentPlan);
	}

	/**
	 * Creates a new osi insolv payment plan with the primary key. Does not add the osi insolv payment plan to the database.
	 *
	 * @param osiInsolvPaymentPlanId the primary key for the new osi insolv payment plan
	 * @return the new osi insolv payment plan
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiInsolvPaymentPlan createOsiInsolvPaymentPlan(
				long osiInsolvPaymentPlanId) {

		return _osiInsolvPaymentPlanLocalService.createOsiInsolvPaymentPlan(
			osiInsolvPaymentPlanId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvPaymentPlanLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi insolv payment plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvPaymentPlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvPaymentPlanId the primary key of the osi insolv payment plan
	 * @return the osi insolv payment plan that was removed
	 * @throws PortalException if a osi insolv payment plan with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiInsolvPaymentPlan deleteOsiInsolvPaymentPlan(
					long osiInsolvPaymentPlanId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvPaymentPlanLocalService.deleteOsiInsolvPaymentPlan(
			osiInsolvPaymentPlanId);
	}

	/**
	 * Deletes the osi insolv payment plan from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvPaymentPlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvPaymentPlan the osi insolv payment plan
	 * @return the osi insolv payment plan that was removed
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiInsolvPaymentPlan deleteOsiInsolvPaymentPlan(
				com.nbp.osi.insolvency.application.form.services.model.
					OsiInsolvPaymentPlan osiInsolvPaymentPlan) {

		return _osiInsolvPaymentPlanLocalService.deleteOsiInsolvPaymentPlan(
			osiInsolvPaymentPlan);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvPaymentPlanLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiInsolvPaymentPlanLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiInsolvPaymentPlanLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiInsolvPaymentPlanLocalService.dynamicQuery();
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

		return _osiInsolvPaymentPlanLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvPaymentPlanModelImpl</code>.
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

		return _osiInsolvPaymentPlanLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvPaymentPlanModelImpl</code>.
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

		return _osiInsolvPaymentPlanLocalService.dynamicQuery(
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

		return _osiInsolvPaymentPlanLocalService.dynamicQueryCount(
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

		return _osiInsolvPaymentPlanLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiInsolvPaymentPlan fetchOsiInsolvPaymentPlan(
				long osiInsolvPaymentPlanId) {

		return _osiInsolvPaymentPlanLocalService.fetchOsiInsolvPaymentPlan(
			osiInsolvPaymentPlanId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiInsolvPaymentPlanLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiInsolvPaymentPlanLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiInsolvPaymentPlanLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi insolv payment plan with the primary key.
	 *
	 * @param osiInsolvPaymentPlanId the primary key of the osi insolv payment plan
	 * @return the osi insolv payment plan
	 * @throws PortalException if a osi insolv payment plan with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiInsolvPaymentPlan getOsiInsolvPaymentPlan(
					long osiInsolvPaymentPlanId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvPaymentPlanLocalService.getOsiInsolvPaymentPlan(
			osiInsolvPaymentPlanId);
	}

	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiInsolvPaymentPlan getOsiInsolvPaymentPlanById(
					long osiInsolvencyId)
				throws com.nbp.osi.insolvency.application.form.services.
					exception.NoSuchOsiInsolvencyApplicationPaymentException {

		return _osiInsolvPaymentPlanLocalService.getOsiInsolvPaymentPlanById(
			osiInsolvencyId);
	}

	/**
	 * Returns a range of all the osi insolv payment plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvPaymentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolv payment plans
	 * @param end the upper bound of the range of osi insolv payment plans (not inclusive)
	 * @return the range of osi insolv payment plans
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			OsiInsolvPaymentPlan> getOsiInsolvPaymentPlans(int start, int end) {

		return _osiInsolvPaymentPlanLocalService.getOsiInsolvPaymentPlans(
			start, end);
	}

	/**
	 * Returns the number of osi insolv payment plans.
	 *
	 * @return the number of osi insolv payment plans
	 */
	@Override
	public int getOsiInsolvPaymentPlansCount() {
		return _osiInsolvPaymentPlanLocalService.
			getOsiInsolvPaymentPlansCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvPaymentPlanLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi insolv payment plan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvPaymentPlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvPaymentPlan the osi insolv payment plan
	 * @return the osi insolv payment plan that was updated
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiInsolvPaymentPlan updateOsiInsolvPaymentPlan(
				com.nbp.osi.insolvency.application.form.services.model.
					OsiInsolvPaymentPlan osiInsolvPaymentPlan) {

		return _osiInsolvPaymentPlanLocalService.updateOsiInsolvPaymentPlan(
			osiInsolvPaymentPlan);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiInsolvPaymentPlanLocalService.getBasePersistence();
	}

	@Override
	public OsiInsolvPaymentPlanLocalService getWrappedService() {
		return _osiInsolvPaymentPlanLocalService;
	}

	@Override
	public void setWrappedService(
		OsiInsolvPaymentPlanLocalService osiInsolvPaymentPlanLocalService) {

		_osiInsolvPaymentPlanLocalService = osiInsolvPaymentPlanLocalService;
	}

	private OsiInsolvPaymentPlanLocalService _osiInsolvPaymentPlanLocalService;

}