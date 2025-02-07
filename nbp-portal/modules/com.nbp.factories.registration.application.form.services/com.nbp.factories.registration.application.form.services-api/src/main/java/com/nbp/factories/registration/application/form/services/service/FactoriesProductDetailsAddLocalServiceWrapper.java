/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FactoriesProductDetailsAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesProductDetailsAddLocalService
 * @generated
 */
public class FactoriesProductDetailsAddLocalServiceWrapper
	implements FactoriesProductDetailsAddLocalService,
			   ServiceWrapper<FactoriesProductDetailsAddLocalService> {

	public FactoriesProductDetailsAddLocalServiceWrapper() {
		this(null);
	}

	public FactoriesProductDetailsAddLocalServiceWrapper(
		FactoriesProductDetailsAddLocalService
			factoriesProductDetailsAddLocalService) {

		_factoriesProductDetailsAddLocalService =
			factoriesProductDetailsAddLocalService;
	}

	/**
	 * Adds the factories product details add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesProductDetailsAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesProductDetailsAdd the factories product details add
	 * @return the factories product details add that was added
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesProductDetailsAdd addFactoriesProductDetailsAdd(
			com.nbp.factories.registration.application.form.services.model.
				FactoriesProductDetailsAdd factoriesProductDetailsAdd) {

		return _factoriesProductDetailsAddLocalService.
			addFactoriesProductDetailsAdd(factoriesProductDetailsAdd);
	}

	/**
	 * Creates a new factories product details add with the primary key. Does not add the factories product details add to the database.
	 *
	 * @param factoriesProductDetailsAddId the primary key for the new factories product details add
	 * @return the new factories product details add
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesProductDetailsAdd createFactoriesProductDetailsAdd(
			long factoriesProductDetailsAddId) {

		return _factoriesProductDetailsAddLocalService.
			createFactoriesProductDetailsAdd(factoriesProductDetailsAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesProductDetailsAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the factories product details add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesProductDetailsAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesProductDetailsAdd the factories product details add
	 * @return the factories product details add that was removed
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesProductDetailsAdd deleteFactoriesProductDetailsAdd(
			com.nbp.factories.registration.application.form.services.model.
				FactoriesProductDetailsAdd factoriesProductDetailsAdd) {

		return _factoriesProductDetailsAddLocalService.
			deleteFactoriesProductDetailsAdd(factoriesProductDetailsAdd);
	}

	/**
	 * Deletes the factories product details add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesProductDetailsAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesProductDetailsAddId the primary key of the factories product details add
	 * @return the factories product details add that was removed
	 * @throws PortalException if a factories product details add with the primary key could not be found
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesProductDetailsAdd deleteFactoriesProductDetailsAdd(
				long factoriesProductDetailsAddId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesProductDetailsAddLocalService.
			deleteFactoriesProductDetailsAdd(factoriesProductDetailsAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesProductDetailsAddLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _factoriesProductDetailsAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _factoriesProductDetailsAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _factoriesProductDetailsAddLocalService.dynamicQuery();
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

		return _factoriesProductDetailsAddLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesProductDetailsAddModelImpl</code>.
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

		return _factoriesProductDetailsAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesProductDetailsAddModelImpl</code>.
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

		return _factoriesProductDetailsAddLocalService.dynamicQuery(
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

		return _factoriesProductDetailsAddLocalService.dynamicQueryCount(
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

		return _factoriesProductDetailsAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesProductDetailsAdd fetchFactoriesProductDetailsAdd(
			long factoriesProductDetailsAddId) {

		return _factoriesProductDetailsAddLocalService.
			fetchFactoriesProductDetailsAdd(factoriesProductDetailsAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _factoriesProductDetailsAddLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.factories.registration.application.form.services.model.
			FactoriesProductDetailsAdd> getFactoriesById(
				long factoriesApplicationId) {

		return _factoriesProductDetailsAddLocalService.getFactoriesById(
			factoriesApplicationId);
	}

	/**
	 * Returns the factories product details add with the primary key.
	 *
	 * @param factoriesProductDetailsAddId the primary key of the factories product details add
	 * @return the factories product details add
	 * @throws PortalException if a factories product details add with the primary key could not be found
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesProductDetailsAdd getFactoriesProductDetailsAdd(
				long factoriesProductDetailsAddId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesProductDetailsAddLocalService.
			getFactoriesProductDetailsAdd(factoriesProductDetailsAddId);
	}

	/**
	 * Returns a range of all the factories product details adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesProductDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories product details adds
	 * @param end the upper bound of the range of factories product details adds (not inclusive)
	 * @return the range of factories product details adds
	 */
	@Override
	public java.util.List
		<com.nbp.factories.registration.application.form.services.model.
			FactoriesProductDetailsAdd> getFactoriesProductDetailsAdds(
				int start, int end) {

		return _factoriesProductDetailsAddLocalService.
			getFactoriesProductDetailsAdds(start, end);
	}

	/**
	 * Returns the number of factories product details adds.
	 *
	 * @return the number of factories product details adds
	 */
	@Override
	public int getFactoriesProductDetailsAddsCount() {
		return _factoriesProductDetailsAddLocalService.
			getFactoriesProductDetailsAddsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _factoriesProductDetailsAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _factoriesProductDetailsAddLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesProductDetailsAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the factories product details add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesProductDetailsAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesProductDetailsAdd the factories product details add
	 * @return the factories product details add that was updated
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesProductDetailsAdd updateFactoriesProductDetailsAdd(
			com.nbp.factories.registration.application.form.services.model.
				FactoriesProductDetailsAdd factoriesProductDetailsAdd) {

		return _factoriesProductDetailsAddLocalService.
			updateFactoriesProductDetailsAdd(factoriesProductDetailsAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _factoriesProductDetailsAddLocalService.getBasePersistence();
	}

	@Override
	public FactoriesProductDetailsAddLocalService getWrappedService() {
		return _factoriesProductDetailsAddLocalService;
	}

	@Override
	public void setWrappedService(
		FactoriesProductDetailsAddLocalService
			factoriesProductDetailsAddLocalService) {

		_factoriesProductDetailsAddLocalService =
			factoriesProductDetailsAddLocalService;
	}

	private FactoriesProductDetailsAddLocalService
		_factoriesProductDetailsAddLocalService;

}