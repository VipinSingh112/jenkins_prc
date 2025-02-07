/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link RadiationDevicesAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RadiationDevicesAddLocalService
 * @generated
 */
public class RadiationDevicesAddLocalServiceWrapper
	implements RadiationDevicesAddLocalService,
			   ServiceWrapper<RadiationDevicesAddLocalService> {

	public RadiationDevicesAddLocalServiceWrapper() {
		this(null);
	}

	public RadiationDevicesAddLocalServiceWrapper(
		RadiationDevicesAddLocalService radiationDevicesAddLocalService) {

		_radiationDevicesAddLocalService = radiationDevicesAddLocalService;
	}

	/**
	 * Adds the radiation devices add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationDevicesAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationDevicesAdd the radiation devices add
	 * @return the radiation devices add that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationDevicesAdd
		addRadiationDevicesAdd(
			com.nbp.hsra.application.service.model.RadiationDevicesAdd
				radiationDevicesAdd) {

		return _radiationDevicesAddLocalService.addRadiationDevicesAdd(
			radiationDevicesAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationDevicesAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new radiation devices add with the primary key. Does not add the radiation devices add to the database.
	 *
	 * @param radiationDevicesAddId the primary key for the new radiation devices add
	 * @return the new radiation devices add
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationDevicesAdd
		createRadiationDevicesAdd(long radiationDevicesAddId) {

		return _radiationDevicesAddLocalService.createRadiationDevicesAdd(
			radiationDevicesAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationDevicesAddLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the radiation devices add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationDevicesAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationDevicesAddId the primary key of the radiation devices add
	 * @return the radiation devices add that was removed
	 * @throws PortalException if a radiation devices add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationDevicesAdd
			deleteRadiationDevicesAdd(long radiationDevicesAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationDevicesAddLocalService.deleteRadiationDevicesAdd(
			radiationDevicesAddId);
	}

	/**
	 * Deletes the radiation devices add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationDevicesAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationDevicesAdd the radiation devices add
	 * @return the radiation devices add that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationDevicesAdd
		deleteRadiationDevicesAdd(
			com.nbp.hsra.application.service.model.RadiationDevicesAdd
				radiationDevicesAdd) {

		return _radiationDevicesAddLocalService.deleteRadiationDevicesAdd(
			radiationDevicesAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _radiationDevicesAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _radiationDevicesAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _radiationDevicesAddLocalService.dynamicQuery();
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

		return _radiationDevicesAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationDevicesAddModelImpl</code>.
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

		return _radiationDevicesAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationDevicesAddModelImpl</code>.
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

		return _radiationDevicesAddLocalService.dynamicQuery(
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

		return _radiationDevicesAddLocalService.dynamicQueryCount(dynamicQuery);
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

		return _radiationDevicesAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.RadiationDevicesAdd
		fetchRadiationDevicesAdd(long radiationDevicesAddId) {

		return _radiationDevicesAddLocalService.fetchRadiationDevicesAdd(
			radiationDevicesAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _radiationDevicesAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.RadiationDevicesAdd>
			getHsraById(long hsraApplicationId) {

		return _radiationDevicesAddLocalService.getHsraById(hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _radiationDevicesAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _radiationDevicesAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationDevicesAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the radiation devices add with the primary key.
	 *
	 * @param radiationDevicesAddId the primary key of the radiation devices add
	 * @return the radiation devices add
	 * @throws PortalException if a radiation devices add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationDevicesAdd
			getRadiationDevicesAdd(long radiationDevicesAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationDevicesAddLocalService.getRadiationDevicesAdd(
			radiationDevicesAddId);
	}

	/**
	 * Returns a range of all the radiation devices adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationDevicesAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation devices adds
	 * @param end the upper bound of the range of radiation devices adds (not inclusive)
	 * @return the range of radiation devices adds
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.RadiationDevicesAdd>
			getRadiationDevicesAdds(int start, int end) {

		return _radiationDevicesAddLocalService.getRadiationDevicesAdds(
			start, end);
	}

	/**
	 * Returns the number of radiation devices adds.
	 *
	 * @return the number of radiation devices adds
	 */
	@Override
	public int getRadiationDevicesAddsCount() {
		return _radiationDevicesAddLocalService.getRadiationDevicesAddsCount();
	}

	/**
	 * Updates the radiation devices add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationDevicesAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationDevicesAdd the radiation devices add
	 * @return the radiation devices add that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationDevicesAdd
		updateRadiationDevicesAdd(
			com.nbp.hsra.application.service.model.RadiationDevicesAdd
				radiationDevicesAdd) {

		return _radiationDevicesAddLocalService.updateRadiationDevicesAdd(
			radiationDevicesAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _radiationDevicesAddLocalService.getBasePersistence();
	}

	@Override
	public RadiationDevicesAddLocalService getWrappedService() {
		return _radiationDevicesAddLocalService;
	}

	@Override
	public void setWrappedService(
		RadiationDevicesAddLocalService radiationDevicesAddLocalService) {

		_radiationDevicesAddLocalService = radiationDevicesAddLocalService;
	}

	private RadiationDevicesAddLocalService _radiationDevicesAddLocalService;

}