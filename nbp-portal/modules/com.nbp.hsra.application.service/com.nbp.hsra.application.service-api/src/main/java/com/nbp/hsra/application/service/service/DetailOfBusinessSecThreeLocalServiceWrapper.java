/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link DetailOfBusinessSecThreeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfBusinessSecThreeLocalService
 * @generated
 */
public class DetailOfBusinessSecThreeLocalServiceWrapper
	implements DetailOfBusinessSecThreeLocalService,
			   ServiceWrapper<DetailOfBusinessSecThreeLocalService> {

	public DetailOfBusinessSecThreeLocalServiceWrapper() {
		this(null);
	}

	public DetailOfBusinessSecThreeLocalServiceWrapper(
		DetailOfBusinessSecThreeLocalService
			detailOfBusinessSecThreeLocalService) {

		_detailOfBusinessSecThreeLocalService =
			detailOfBusinessSecThreeLocalService;
	}

	/**
	 * Adds the detail of business sec three to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfBusinessSecThreeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfBusinessSecThree the detail of business sec three
	 * @return the detail of business sec three that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.DetailOfBusinessSecThree
		addDetailOfBusinessSecThree(
			com.nbp.hsra.application.service.model.DetailOfBusinessSecThree
				detailOfBusinessSecThree) {

		return _detailOfBusinessSecThreeLocalService.
			addDetailOfBusinessSecThree(detailOfBusinessSecThree);
	}

	/**
	 * Creates a new detail of business sec three with the primary key. Does not add the detail of business sec three to the database.
	 *
	 * @param detailOfBusinessSecThreeId the primary key for the new detail of business sec three
	 * @return the new detail of business sec three
	 */
	@Override
	public com.nbp.hsra.application.service.model.DetailOfBusinessSecThree
		createDetailOfBusinessSecThree(long detailOfBusinessSecThreeId) {

		return _detailOfBusinessSecThreeLocalService.
			createDetailOfBusinessSecThree(detailOfBusinessSecThreeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailOfBusinessSecThreeLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the detail of business sec three from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfBusinessSecThreeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfBusinessSecThree the detail of business sec three
	 * @return the detail of business sec three that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.DetailOfBusinessSecThree
		deleteDetailOfBusinessSecThree(
			com.nbp.hsra.application.service.model.DetailOfBusinessSecThree
				detailOfBusinessSecThree) {

		return _detailOfBusinessSecThreeLocalService.
			deleteDetailOfBusinessSecThree(detailOfBusinessSecThree);
	}

	/**
	 * Deletes the detail of business sec three with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfBusinessSecThreeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfBusinessSecThreeId the primary key of the detail of business sec three
	 * @return the detail of business sec three that was removed
	 * @throws PortalException if a detail of business sec three with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.DetailOfBusinessSecThree
			deleteDetailOfBusinessSecThree(long detailOfBusinessSecThreeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailOfBusinessSecThreeLocalService.
			deleteDetailOfBusinessSecThree(detailOfBusinessSecThreeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailOfBusinessSecThreeLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _detailOfBusinessSecThreeLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _detailOfBusinessSecThreeLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _detailOfBusinessSecThreeLocalService.dynamicQuery();
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

		return _detailOfBusinessSecThreeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.DetailOfBusinessSecThreeModelImpl</code>.
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

		return _detailOfBusinessSecThreeLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.DetailOfBusinessSecThreeModelImpl</code>.
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

		return _detailOfBusinessSecThreeLocalService.dynamicQuery(
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

		return _detailOfBusinessSecThreeLocalService.dynamicQueryCount(
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

		return _detailOfBusinessSecThreeLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.DetailOfBusinessSecThree
		fetchDetailOfBusinessSecThree(long detailOfBusinessSecThreeId) {

		return _detailOfBusinessSecThreeLocalService.
			fetchDetailOfBusinessSecThree(detailOfBusinessSecThreeId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _detailOfBusinessSecThreeLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the detail of business sec three with the primary key.
	 *
	 * @param detailOfBusinessSecThreeId the primary key of the detail of business sec three
	 * @return the detail of business sec three
	 * @throws PortalException if a detail of business sec three with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.DetailOfBusinessSecThree
			getDetailOfBusinessSecThree(long detailOfBusinessSecThreeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailOfBusinessSecThreeLocalService.
			getDetailOfBusinessSecThree(detailOfBusinessSecThreeId);
	}

	/**
	 * Returns a range of all the detail of business sec threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.DetailOfBusinessSecThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of business sec threes
	 * @param end the upper bound of the range of detail of business sec threes (not inclusive)
	 * @return the range of detail of business sec threes
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.DetailOfBusinessSecThree>
			getDetailOfBusinessSecThrees(int start, int end) {

		return _detailOfBusinessSecThreeLocalService.
			getDetailOfBusinessSecThrees(start, end);
	}

	/**
	 * Returns the number of detail of business sec threes.
	 *
	 * @return the number of detail of business sec threes
	 */
	@Override
	public int getDetailOfBusinessSecThreesCount() {
		return _detailOfBusinessSecThreeLocalService.
			getDetailOfBusinessSecThreesCount();
	}

	@Override
	public com.nbp.hsra.application.service.model.DetailOfBusinessSecThree
			getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchDetailOfBusinessSecThreeException {

		return _detailOfBusinessSecThreeLocalService.getHsraById(
			hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _detailOfBusinessSecThreeLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _detailOfBusinessSecThreeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailOfBusinessSecThreeLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the detail of business sec three in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfBusinessSecThreeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfBusinessSecThree the detail of business sec three
	 * @return the detail of business sec three that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.DetailOfBusinessSecThree
		updateDetailOfBusinessSecThree(
			com.nbp.hsra.application.service.model.DetailOfBusinessSecThree
				detailOfBusinessSecThree) {

		return _detailOfBusinessSecThreeLocalService.
			updateDetailOfBusinessSecThree(detailOfBusinessSecThree);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _detailOfBusinessSecThreeLocalService.getBasePersistence();
	}

	@Override
	public DetailOfBusinessSecThreeLocalService getWrappedService() {
		return _detailOfBusinessSecThreeLocalService;
	}

	@Override
	public void setWrappedService(
		DetailOfBusinessSecThreeLocalService
			detailOfBusinessSecThreeLocalService) {

		_detailOfBusinessSecThreeLocalService =
			detailOfBusinessSecThreeLocalService;
	}

	private DetailOfBusinessSecThreeLocalService
		_detailOfBusinessSecThreeLocalService;

}