/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FactoriesProcessedFoodActLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesProcessedFoodActLocalService
 * @generated
 */
public class FactoriesProcessedFoodActLocalServiceWrapper
	implements FactoriesProcessedFoodActLocalService,
			   ServiceWrapper<FactoriesProcessedFoodActLocalService> {

	public FactoriesProcessedFoodActLocalServiceWrapper() {
		this(null);
	}

	public FactoriesProcessedFoodActLocalServiceWrapper(
		FactoriesProcessedFoodActLocalService
			factoriesProcessedFoodActLocalService) {

		_factoriesProcessedFoodActLocalService =
			factoriesProcessedFoodActLocalService;
	}

	/**
	 * Adds the factories processed food act to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesProcessedFoodActLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesProcessedFoodAct the factories processed food act
	 * @return the factories processed food act that was added
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesProcessedFoodAct addFactoriesProcessedFoodAct(
			com.nbp.factories.registration.application.form.services.model.
				FactoriesProcessedFoodAct factoriesProcessedFoodAct) {

		return _factoriesProcessedFoodActLocalService.
			addFactoriesProcessedFoodAct(factoriesProcessedFoodAct);
	}

	/**
	 * Creates a new factories processed food act with the primary key. Does not add the factories processed food act to the database.
	 *
	 * @param factoriesProcessedFoodActId the primary key for the new factories processed food act
	 * @return the new factories processed food act
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesProcessedFoodAct createFactoriesProcessedFoodAct(
			long factoriesProcessedFoodActId) {

		return _factoriesProcessedFoodActLocalService.
			createFactoriesProcessedFoodAct(factoriesProcessedFoodActId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesProcessedFoodActLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the factories processed food act from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesProcessedFoodActLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesProcessedFoodAct the factories processed food act
	 * @return the factories processed food act that was removed
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesProcessedFoodAct deleteFactoriesProcessedFoodAct(
			com.nbp.factories.registration.application.form.services.model.
				FactoriesProcessedFoodAct factoriesProcessedFoodAct) {

		return _factoriesProcessedFoodActLocalService.
			deleteFactoriesProcessedFoodAct(factoriesProcessedFoodAct);
	}

	/**
	 * Deletes the factories processed food act with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesProcessedFoodActLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesProcessedFoodActId the primary key of the factories processed food act
	 * @return the factories processed food act that was removed
	 * @throws PortalException if a factories processed food act with the primary key could not be found
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesProcessedFoodAct deleteFactoriesProcessedFoodAct(
				long factoriesProcessedFoodActId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesProcessedFoodActLocalService.
			deleteFactoriesProcessedFoodAct(factoriesProcessedFoodActId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesProcessedFoodActLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _factoriesProcessedFoodActLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _factoriesProcessedFoodActLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _factoriesProcessedFoodActLocalService.dynamicQuery();
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

		return _factoriesProcessedFoodActLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesProcessedFoodActModelImpl</code>.
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

		return _factoriesProcessedFoodActLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesProcessedFoodActModelImpl</code>.
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

		return _factoriesProcessedFoodActLocalService.dynamicQuery(
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

		return _factoriesProcessedFoodActLocalService.dynamicQueryCount(
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

		return _factoriesProcessedFoodActLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesProcessedFoodAct fetchFactoriesProcessedFoodAct(
			long factoriesProcessedFoodActId) {

		return _factoriesProcessedFoodActLocalService.
			fetchFactoriesProcessedFoodAct(factoriesProcessedFoodActId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _factoriesProcessedFoodActLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesProcessedFoodAct getFactoriesById(long applicationId)
			throws com.nbp.factories.registration.application.form.services.
				exception.NoSuchFactoriesProcessedFoodActException {

		return _factoriesProcessedFoodActLocalService.getFactoriesById(
			applicationId);
	}

	/**
	 * Returns the factories processed food act with the primary key.
	 *
	 * @param factoriesProcessedFoodActId the primary key of the factories processed food act
	 * @return the factories processed food act
	 * @throws PortalException if a factories processed food act with the primary key could not be found
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesProcessedFoodAct getFactoriesProcessedFoodAct(
				long factoriesProcessedFoodActId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesProcessedFoodActLocalService.
			getFactoriesProcessedFoodAct(factoriesProcessedFoodActId);
	}

	/**
	 * Returns a range of all the factories processed food acts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesProcessedFoodActModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories processed food acts
	 * @param end the upper bound of the range of factories processed food acts (not inclusive)
	 * @return the range of factories processed food acts
	 */
	@Override
	public java.util.List
		<com.nbp.factories.registration.application.form.services.model.
			FactoriesProcessedFoodAct> getFactoriesProcessedFoodActs(
				int start, int end) {

		return _factoriesProcessedFoodActLocalService.
			getFactoriesProcessedFoodActs(start, end);
	}

	/**
	 * Returns the number of factories processed food acts.
	 *
	 * @return the number of factories processed food acts
	 */
	@Override
	public int getFactoriesProcessedFoodActsCount() {
		return _factoriesProcessedFoodActLocalService.
			getFactoriesProcessedFoodActsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _factoriesProcessedFoodActLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _factoriesProcessedFoodActLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesProcessedFoodActLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the factories processed food act in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesProcessedFoodActLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesProcessedFoodAct the factories processed food act
	 * @return the factories processed food act that was updated
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesProcessedFoodAct updateFactoriesProcessedFoodAct(
			com.nbp.factories.registration.application.form.services.model.
				FactoriesProcessedFoodAct factoriesProcessedFoodAct) {

		return _factoriesProcessedFoodActLocalService.
			updateFactoriesProcessedFoodAct(factoriesProcessedFoodAct);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _factoriesProcessedFoodActLocalService.getBasePersistence();
	}

	@Override
	public FactoriesProcessedFoodActLocalService getWrappedService() {
		return _factoriesProcessedFoodActLocalService;
	}

	@Override
	public void setWrappedService(
		FactoriesProcessedFoodActLocalService
			factoriesProcessedFoodActLocalService) {

		_factoriesProcessedFoodActLocalService =
			factoriesProcessedFoodActLocalService;
	}

	private FactoriesProcessedFoodActLocalService
		_factoriesProcessedFoodActLocalService;

}