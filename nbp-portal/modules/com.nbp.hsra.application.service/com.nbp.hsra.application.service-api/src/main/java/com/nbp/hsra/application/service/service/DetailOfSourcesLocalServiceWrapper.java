/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link DetailOfSourcesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfSourcesLocalService
 * @generated
 */
public class DetailOfSourcesLocalServiceWrapper
	implements DetailOfSourcesLocalService,
			   ServiceWrapper<DetailOfSourcesLocalService> {

	public DetailOfSourcesLocalServiceWrapper() {
		this(null);
	}

	public DetailOfSourcesLocalServiceWrapper(
		DetailOfSourcesLocalService detailOfSourcesLocalService) {

		_detailOfSourcesLocalService = detailOfSourcesLocalService;
	}

	/**
	 * Adds the detail of sources to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfSourcesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfSources the detail of sources
	 * @return the detail of sources that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.DetailOfSources
		addDetailOfSources(
			com.nbp.hsra.application.service.model.DetailOfSources
				detailOfSources) {

		return _detailOfSourcesLocalService.addDetailOfSources(detailOfSources);
	}

	/**
	 * Creates a new detail of sources with the primary key. Does not add the detail of sources to the database.
	 *
	 * @param detailOfSourcesId the primary key for the new detail of sources
	 * @return the new detail of sources
	 */
	@Override
	public com.nbp.hsra.application.service.model.DetailOfSources
		createDetailOfSources(long detailOfSourcesId) {

		return _detailOfSourcesLocalService.createDetailOfSources(
			detailOfSourcesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailOfSourcesLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the detail of sources from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfSourcesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfSources the detail of sources
	 * @return the detail of sources that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.DetailOfSources
		deleteDetailOfSources(
			com.nbp.hsra.application.service.model.DetailOfSources
				detailOfSources) {

		return _detailOfSourcesLocalService.deleteDetailOfSources(
			detailOfSources);
	}

	/**
	 * Deletes the detail of sources with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfSourcesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfSourcesId the primary key of the detail of sources
	 * @return the detail of sources that was removed
	 * @throws PortalException if a detail of sources with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.DetailOfSources
			deleteDetailOfSources(long detailOfSourcesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailOfSourcesLocalService.deleteDetailOfSources(
			detailOfSourcesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailOfSourcesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _detailOfSourcesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _detailOfSourcesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _detailOfSourcesLocalService.dynamicQuery();
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

		return _detailOfSourcesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.DetailOfSourcesModelImpl</code>.
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

		return _detailOfSourcesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.DetailOfSourcesModelImpl</code>.
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

		return _detailOfSourcesLocalService.dynamicQuery(
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

		return _detailOfSourcesLocalService.dynamicQueryCount(dynamicQuery);
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

		return _detailOfSourcesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.DetailOfSources
		fetchDetailOfSources(long detailOfSourcesId) {

		return _detailOfSourcesLocalService.fetchDetailOfSources(
			detailOfSourcesId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _detailOfSourcesLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the detail of sources with the primary key.
	 *
	 * @param detailOfSourcesId the primary key of the detail of sources
	 * @return the detail of sources
	 * @throws PortalException if a detail of sources with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.DetailOfSources
			getDetailOfSources(long detailOfSourcesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailOfSourcesLocalService.getDetailOfSources(
			detailOfSourcesId);
	}

	/**
	 * Returns a range of all the detail of sourceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.DetailOfSourcesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of sourceses
	 * @param end the upper bound of the range of detail of sourceses (not inclusive)
	 * @return the range of detail of sourceses
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.DetailOfSources>
			getDetailOfSourceses(int start, int end) {

		return _detailOfSourcesLocalService.getDetailOfSourceses(start, end);
	}

	/**
	 * Returns the number of detail of sourceses.
	 *
	 * @return the number of detail of sourceses
	 */
	@Override
	public int getDetailOfSourcesesCount() {
		return _detailOfSourcesLocalService.getDetailOfSourcesesCount();
	}

	@Override
	public com.nbp.hsra.application.service.model.DetailOfSources getHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchDetailOfSourcesException {

		return _detailOfSourcesLocalService.getHsraById(hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _detailOfSourcesLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _detailOfSourcesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailOfSourcesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the detail of sources in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfSourcesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfSources the detail of sources
	 * @return the detail of sources that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.DetailOfSources
		updateDetailOfSources(
			com.nbp.hsra.application.service.model.DetailOfSources
				detailOfSources) {

		return _detailOfSourcesLocalService.updateDetailOfSources(
			detailOfSources);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _detailOfSourcesLocalService.getBasePersistence();
	}

	@Override
	public DetailOfSourcesLocalService getWrappedService() {
		return _detailOfSourcesLocalService;
	}

	@Override
	public void setWrappedService(
		DetailOfSourcesLocalService detailOfSourcesLocalService) {

		_detailOfSourcesLocalService = detailOfSourcesLocalService;
	}

	private DetailOfSourcesLocalService _detailOfSourcesLocalService;

}