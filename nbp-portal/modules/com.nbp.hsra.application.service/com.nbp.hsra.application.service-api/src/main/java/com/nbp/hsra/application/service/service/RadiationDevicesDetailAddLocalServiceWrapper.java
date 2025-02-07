/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link RadiationDevicesDetailAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RadiationDevicesDetailAddLocalService
 * @generated
 */
public class RadiationDevicesDetailAddLocalServiceWrapper
	implements RadiationDevicesDetailAddLocalService,
			   ServiceWrapper<RadiationDevicesDetailAddLocalService> {

	public RadiationDevicesDetailAddLocalServiceWrapper() {
		this(null);
	}

	public RadiationDevicesDetailAddLocalServiceWrapper(
		RadiationDevicesDetailAddLocalService
			radiationDevicesDetailAddLocalService) {

		_radiationDevicesDetailAddLocalService =
			radiationDevicesDetailAddLocalService;
	}

	/**
	 * Adds the radiation devices detail add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationDevicesDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationDevicesDetailAdd the radiation devices detail add
	 * @return the radiation devices detail add that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationDevicesDetailAdd
		addRadiationDevicesDetailAdd(
			com.nbp.hsra.application.service.model.RadiationDevicesDetailAdd
				radiationDevicesDetailAdd) {

		return _radiationDevicesDetailAddLocalService.
			addRadiationDevicesDetailAdd(radiationDevicesDetailAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationDevicesDetailAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new radiation devices detail add with the primary key. Does not add the radiation devices detail add to the database.
	 *
	 * @param radiationDevicesDetailAddId the primary key for the new radiation devices detail add
	 * @return the new radiation devices detail add
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationDevicesDetailAdd
		createRadiationDevicesDetailAdd(long radiationDevicesDetailAddId) {

		return _radiationDevicesDetailAddLocalService.
			createRadiationDevicesDetailAdd(radiationDevicesDetailAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationDevicesDetailAddLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the radiation devices detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationDevicesDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationDevicesDetailAddId the primary key of the radiation devices detail add
	 * @return the radiation devices detail add that was removed
	 * @throws PortalException if a radiation devices detail add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationDevicesDetailAdd
			deleteRadiationDevicesDetailAdd(long radiationDevicesDetailAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationDevicesDetailAddLocalService.
			deleteRadiationDevicesDetailAdd(radiationDevicesDetailAddId);
	}

	/**
	 * Deletes the radiation devices detail add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationDevicesDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationDevicesDetailAdd the radiation devices detail add
	 * @return the radiation devices detail add that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationDevicesDetailAdd
		deleteRadiationDevicesDetailAdd(
			com.nbp.hsra.application.service.model.RadiationDevicesDetailAdd
				radiationDevicesDetailAdd) {

		return _radiationDevicesDetailAddLocalService.
			deleteRadiationDevicesDetailAdd(radiationDevicesDetailAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _radiationDevicesDetailAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _radiationDevicesDetailAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _radiationDevicesDetailAddLocalService.dynamicQuery();
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

		return _radiationDevicesDetailAddLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationDevicesDetailAddModelImpl</code>.
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

		return _radiationDevicesDetailAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationDevicesDetailAddModelImpl</code>.
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

		return _radiationDevicesDetailAddLocalService.dynamicQuery(
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

		return _radiationDevicesDetailAddLocalService.dynamicQueryCount(
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

		return _radiationDevicesDetailAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.RadiationDevicesDetailAdd
		fetchRadiationDevicesDetailAdd(long radiationDevicesDetailAddId) {

		return _radiationDevicesDetailAddLocalService.
			fetchRadiationDevicesDetailAdd(radiationDevicesDetailAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _radiationDevicesDetailAddLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _radiationDevicesDetailAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _radiationDevicesDetailAddLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationDevicesDetailAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the radiation devices detail add with the primary key.
	 *
	 * @param radiationDevicesDetailAddId the primary key of the radiation devices detail add
	 * @return the radiation devices detail add
	 * @throws PortalException if a radiation devices detail add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationDevicesDetailAdd
			getRadiationDevicesDetailAdd(long radiationDevicesDetailAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationDevicesDetailAddLocalService.
			getRadiationDevicesDetailAdd(radiationDevicesDetailAddId);
	}

	/**
	 * Returns a range of all the radiation devices detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationDevicesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation devices detail adds
	 * @param end the upper bound of the range of radiation devices detail adds (not inclusive)
	 * @return the range of radiation devices detail adds
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.RadiationDevicesDetailAdd>
			getRadiationDevicesDetailAdds(int start, int end) {

		return _radiationDevicesDetailAddLocalService.
			getRadiationDevicesDetailAdds(start, end);
	}

	/**
	 * Returns the number of radiation devices detail adds.
	 *
	 * @return the number of radiation devices detail adds
	 */
	@Override
	public int getRadiationDevicesDetailAddsCount() {
		return _radiationDevicesDetailAddLocalService.
			getRadiationDevicesDetailAddsCount();
	}

	/**
	 * Updates the radiation devices detail add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationDevicesDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationDevicesDetailAdd the radiation devices detail add
	 * @return the radiation devices detail add that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationDevicesDetailAdd
		updateRadiationDevicesDetailAdd(
			com.nbp.hsra.application.service.model.RadiationDevicesDetailAdd
				radiationDevicesDetailAdd) {

		return _radiationDevicesDetailAddLocalService.
			updateRadiationDevicesDetailAdd(radiationDevicesDetailAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _radiationDevicesDetailAddLocalService.getBasePersistence();
	}

	@Override
	public RadiationDevicesDetailAddLocalService getWrappedService() {
		return _radiationDevicesDetailAddLocalService;
	}

	@Override
	public void setWrappedService(
		RadiationDevicesDetailAddLocalService
			radiationDevicesDetailAddLocalService) {

		_radiationDevicesDetailAddLocalService =
			radiationDevicesDetailAddLocalService;
	}

	private RadiationDevicesDetailAddLocalService
		_radiationDevicesDetailAddLocalService;

}