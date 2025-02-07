/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisFeeMasterLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisFeeMasterLocalService
 * @generated
 */
public class CannabisFeeMasterLocalServiceWrapper
	implements CannabisFeeMasterLocalService,
			   ServiceWrapper<CannabisFeeMasterLocalService> {

	public CannabisFeeMasterLocalServiceWrapper() {
		this(null);
	}

	public CannabisFeeMasterLocalServiceWrapper(
		CannabisFeeMasterLocalService cannabisFeeMasterLocalService) {

		_cannabisFeeMasterLocalService = cannabisFeeMasterLocalService;
	}

	/**
	 * Adds the cannabis fee master to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisFeeMasterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisFeeMaster the cannabis fee master
	 * @return the cannabis fee master that was added
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.CannabisFeeMaster
		addCannabisFeeMaster(
			com.nbp.cannabis.application.form.services.model.CannabisFeeMaster
				cannabisFeeMaster) {

		return _cannabisFeeMasterLocalService.addCannabisFeeMaster(
			cannabisFeeMaster);
	}

	/**
	 * Creates a new cannabis fee master with the primary key. Does not add the cannabis fee master to the database.
	 *
	 * @param cannabisFeeMasterId the primary key for the new cannabis fee master
	 * @return the new cannabis fee master
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.CannabisFeeMaster
		createCannabisFeeMaster(long cannabisFeeMasterId) {

		return _cannabisFeeMasterLocalService.createCannabisFeeMaster(
			cannabisFeeMasterId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisFeeMasterLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the cannabis fee master from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisFeeMasterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisFeeMaster the cannabis fee master
	 * @return the cannabis fee master that was removed
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.CannabisFeeMaster
		deleteCannabisFeeMaster(
			com.nbp.cannabis.application.form.services.model.CannabisFeeMaster
				cannabisFeeMaster) {

		return _cannabisFeeMasterLocalService.deleteCannabisFeeMaster(
			cannabisFeeMaster);
	}

	/**
	 * Deletes the cannabis fee master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisFeeMasterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisFeeMasterId the primary key of the cannabis fee master
	 * @return the cannabis fee master that was removed
	 * @throws PortalException if a cannabis fee master with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.CannabisFeeMaster
			deleteCannabisFeeMaster(long cannabisFeeMasterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisFeeMasterLocalService.deleteCannabisFeeMaster(
			cannabisFeeMasterId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisFeeMasterLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisFeeMasterLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisFeeMasterLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisFeeMasterLocalService.dynamicQuery();
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

		return _cannabisFeeMasterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisFeeMasterModelImpl</code>.
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

		return _cannabisFeeMasterLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisFeeMasterModelImpl</code>.
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

		return _cannabisFeeMasterLocalService.dynamicQuery(
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

		return _cannabisFeeMasterLocalService.dynamicQueryCount(dynamicQuery);
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

		return _cannabisFeeMasterLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.CannabisFeeMaster
		fetchCannabisFeeMaster(long cannabisFeeMasterId) {

		return _cannabisFeeMasterLocalService.fetchCannabisFeeMaster(
			cannabisFeeMasterId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisFeeMasterLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the cannabis fee master with the primary key.
	 *
	 * @param cannabisFeeMasterId the primary key of the cannabis fee master
	 * @return the cannabis fee master
	 * @throws PortalException if a cannabis fee master with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.CannabisFeeMaster
			getCannabisFeeMaster(long cannabisFeeMasterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisFeeMasterLocalService.getCannabisFeeMaster(
			cannabisFeeMasterId);
	}

	/**
	 * Returns a range of all the cannabis fee masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisFeeMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis fee masters
	 * @param end the upper bound of the range of cannabis fee masters (not inclusive)
	 * @return the range of cannabis fee masters
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.CannabisFeeMaster>
			getCannabisFeeMasters(int start, int end) {

		return _cannabisFeeMasterLocalService.getCannabisFeeMasters(start, end);
	}

	/**
	 * Returns the number of cannabis fee masters.
	 *
	 * @return the number of cannabis fee masters
	 */
	@Override
	public int getCannabisFeeMastersCount() {
		return _cannabisFeeMasterLocalService.getCannabisFeeMastersCount();
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.CannabisFeeMaster
			getFeeByCategoryAndSubCategory(String category, String subCategory)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisFeeMasterException {

		return _cannabisFeeMasterLocalService.getFeeByCategoryAndSubCategory(
			category, subCategory);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisFeeMasterLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisFeeMasterLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisFeeMasterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the cannabis fee master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisFeeMasterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisFeeMaster the cannabis fee master
	 * @return the cannabis fee master that was updated
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.CannabisFeeMaster
		updateCannabisFeeMaster(
			com.nbp.cannabis.application.form.services.model.CannabisFeeMaster
				cannabisFeeMaster) {

		return _cannabisFeeMasterLocalService.updateCannabisFeeMaster(
			cannabisFeeMaster);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisFeeMasterLocalService.getBasePersistence();
	}

	@Override
	public CannabisFeeMasterLocalService getWrappedService() {
		return _cannabisFeeMasterLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisFeeMasterLocalService cannabisFeeMasterLocalService) {

		_cannabisFeeMasterLocalService = cannabisFeeMasterLocalService;
	}

	private CannabisFeeMasterLocalService _cannabisFeeMasterLocalService;

}