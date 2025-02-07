/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezDevPropDevelopmentPlanLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevPropDevelopmentPlanLocalService
 * @generated
 */
public class SezDevPropDevelopmentPlanLocalServiceWrapper
	implements ServiceWrapper<SezDevPropDevelopmentPlanLocalService>,
			   SezDevPropDevelopmentPlanLocalService {

	public SezDevPropDevelopmentPlanLocalServiceWrapper() {
		this(null);
	}

	public SezDevPropDevelopmentPlanLocalServiceWrapper(
		SezDevPropDevelopmentPlanLocalService
			sezDevPropDevelopmentPlanLocalService) {

		_sezDevPropDevelopmentPlanLocalService =
			sezDevPropDevelopmentPlanLocalService;
	}

	/**
	 * Adds the sez dev prop development plan to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevPropDevelopmentPlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevPropDevelopmentPlan the sez dev prop development plan
	 * @return the sez dev prop development plan that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevPropDevelopmentPlan addSezDevPropDevelopmentPlan(
				com.nbp.sez.status.application.form.service.model.
					SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan) {

		return _sezDevPropDevelopmentPlanLocalService.
			addSezDevPropDevelopmentPlan(sezDevPropDevelopmentPlan);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevPropDevelopmentPlanLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez dev prop development plan with the primary key. Does not add the sez dev prop development plan to the database.
	 *
	 * @param sezDevPropDevelopmentPlanId the primary key for the new sez dev prop development plan
	 * @return the new sez dev prop development plan
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevPropDevelopmentPlan createSezDevPropDevelopmentPlan(
				long sezDevPropDevelopmentPlanId) {

		return _sezDevPropDevelopmentPlanLocalService.
			createSezDevPropDevelopmentPlan(sezDevPropDevelopmentPlanId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevPropDevelopmentPlanLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez dev prop development plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevPropDevelopmentPlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevPropDevelopmentPlanId the primary key of the sez dev prop development plan
	 * @return the sez dev prop development plan that was removed
	 * @throws PortalException if a sez dev prop development plan with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevPropDevelopmentPlan deleteSezDevPropDevelopmentPlan(
					long sezDevPropDevelopmentPlanId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevPropDevelopmentPlanLocalService.
			deleteSezDevPropDevelopmentPlan(sezDevPropDevelopmentPlanId);
	}

	/**
	 * Deletes the sez dev prop development plan from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevPropDevelopmentPlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevPropDevelopmentPlan the sez dev prop development plan
	 * @return the sez dev prop development plan that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevPropDevelopmentPlan deleteSezDevPropDevelopmentPlan(
				com.nbp.sez.status.application.form.service.model.
					SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan) {

		return _sezDevPropDevelopmentPlanLocalService.
			deleteSezDevPropDevelopmentPlan(sezDevPropDevelopmentPlan);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezDevPropDevelopmentPlanLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezDevPropDevelopmentPlanLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezDevPropDevelopmentPlanLocalService.dynamicQuery();
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

		return _sezDevPropDevelopmentPlanLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevPropDevelopmentPlanModelImpl</code>.
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

		return _sezDevPropDevelopmentPlanLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevPropDevelopmentPlanModelImpl</code>.
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

		return _sezDevPropDevelopmentPlanLocalService.dynamicQuery(
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

		return _sezDevPropDevelopmentPlanLocalService.dynamicQueryCount(
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

		return _sezDevPropDevelopmentPlanLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevPropDevelopmentPlan fetchSezDevPropDevelopmentPlan(
				long sezDevPropDevelopmentPlanId) {

		return _sezDevPropDevelopmentPlanLocalService.
			fetchSezDevPropDevelopmentPlan(sezDevPropDevelopmentPlanId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezDevPropDevelopmentPlanLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezDevPropDevelopmentPlanLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevPropDevelopmentPlanLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevPropDevelopmentPlanLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevPropDevelopmentPlan getSezById(long sezStatusApplicationId)
				throws com.nbp.sez.status.application.form.service.exception.
					NoSuchSezDevPropDevelopmentPlanException {

		return _sezDevPropDevelopmentPlanLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev prop development plan with the primary key.
	 *
	 * @param sezDevPropDevelopmentPlanId the primary key of the sez dev prop development plan
	 * @return the sez dev prop development plan
	 * @throws PortalException if a sez dev prop development plan with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevPropDevelopmentPlan getSezDevPropDevelopmentPlan(
					long sezDevPropDevelopmentPlanId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevPropDevelopmentPlanLocalService.
			getSezDevPropDevelopmentPlan(sezDevPropDevelopmentPlanId);
	}

	/**
	 * Returns a range of all the sez dev prop development plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevPropDevelopmentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev prop development plans
	 * @param end the upper bound of the range of sez dev prop development plans (not inclusive)
	 * @return the range of sez dev prop development plans
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevPropDevelopmentPlan> getSezDevPropDevelopmentPlans(
				int start, int end) {

		return _sezDevPropDevelopmentPlanLocalService.
			getSezDevPropDevelopmentPlans(start, end);
	}

	/**
	 * Returns the number of sez dev prop development plans.
	 *
	 * @return the number of sez dev prop development plans
	 */
	@Override
	public int getSezDevPropDevelopmentPlansCount() {
		return _sezDevPropDevelopmentPlanLocalService.
			getSezDevPropDevelopmentPlansCount();
	}

	/**
	 * Updates the sez dev prop development plan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevPropDevelopmentPlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevPropDevelopmentPlan the sez dev prop development plan
	 * @return the sez dev prop development plan that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevPropDevelopmentPlan updateSezDevPropDevelopmentPlan(
				com.nbp.sez.status.application.form.service.model.
					SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan) {

		return _sezDevPropDevelopmentPlanLocalService.
			updateSezDevPropDevelopmentPlan(sezDevPropDevelopmentPlan);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezDevPropDevelopmentPlanLocalService.getBasePersistence();
	}

	@Override
	public SezDevPropDevelopmentPlanLocalService getWrappedService() {
		return _sezDevPropDevelopmentPlanLocalService;
	}

	@Override
	public void setWrappedService(
		SezDevPropDevelopmentPlanLocalService
			sezDevPropDevelopmentPlanLocalService) {

		_sezDevPropDevelopmentPlanLocalService =
			sezDevPropDevelopmentPlanLocalService;
	}

	private SezDevPropDevelopmentPlanLocalService
		_sezDevPropDevelopmentPlanLocalService;

}