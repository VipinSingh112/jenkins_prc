/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AgricultureBuildingLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureBuildingLocalService
 * @generated
 */
public class AgricultureBuildingLocalServiceWrapper
	implements AgricultureBuildingLocalService,
			   ServiceWrapper<AgricultureBuildingLocalService> {

	public AgricultureBuildingLocalServiceWrapper() {
		this(null);
	}

	public AgricultureBuildingLocalServiceWrapper(
		AgricultureBuildingLocalService agricultureBuildingLocalService) {

		_agricultureBuildingLocalService = agricultureBuildingLocalService;
	}

	/**
	 * Adds the agriculture building to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureBuildingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureBuilding the agriculture building
	 * @return the agriculture building that was added
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureBuilding
		addAgricultureBuilding(
			com.agriculture.application.form.service.model.AgricultureBuilding
				agricultureBuilding) {

		return _agricultureBuildingLocalService.addAgricultureBuilding(
			agricultureBuilding);
	}

	/**
	 * Creates a new agriculture building with the primary key. Does not add the agriculture building to the database.
	 *
	 * @param agricultureBuildingId the primary key for the new agriculture building
	 * @return the new agriculture building
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureBuilding
		createAgricultureBuilding(long agricultureBuildingId) {

		return _agricultureBuildingLocalService.createAgricultureBuilding(
			agricultureBuildingId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureBuildingLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void deleteAgriBuildingById(long applicationId) {
		_agricultureBuildingLocalService.deleteAgriBuildingById(applicationId);
	}

	/**
	 * Deletes the agriculture building from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureBuildingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureBuilding the agriculture building
	 * @return the agriculture building that was removed
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureBuilding
		deleteAgricultureBuilding(
			com.agriculture.application.form.service.model.AgricultureBuilding
				agricultureBuilding) {

		return _agricultureBuildingLocalService.deleteAgricultureBuilding(
			agricultureBuilding);
	}

	/**
	 * Deletes the agriculture building with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureBuildingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureBuildingId the primary key of the agriculture building
	 * @return the agriculture building that was removed
	 * @throws PortalException if a agriculture building with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureBuilding
			deleteAgricultureBuilding(long agricultureBuildingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureBuildingLocalService.deleteAgricultureBuilding(
			agricultureBuildingId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureBuildingLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _agricultureBuildingLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _agricultureBuildingLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _agricultureBuildingLocalService.dynamicQuery();
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

		return _agricultureBuildingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureBuildingModelImpl</code>.
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

		return _agricultureBuildingLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureBuildingModelImpl</code>.
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

		return _agricultureBuildingLocalService.dynamicQuery(
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

		return _agricultureBuildingLocalService.dynamicQueryCount(dynamicQuery);
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

		return _agricultureBuildingLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.agriculture.application.form.service.model.AgricultureBuilding
		fetchAgricultureBuilding(long agricultureBuildingId) {

		return _agricultureBuildingLocalService.fetchAgricultureBuilding(
			agricultureBuildingId);
	}

	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgricultureBuilding>
			getAB_by_AAI(long agricultureApplicationId) {

		return _agricultureBuildingLocalService.getAB_by_AAI(
			agricultureApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _agricultureBuildingLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the agriculture building with the primary key.
	 *
	 * @param agricultureBuildingId the primary key of the agriculture building
	 * @return the agriculture building
	 * @throws PortalException if a agriculture building with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureBuilding
			getAgricultureBuilding(long agricultureBuildingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureBuildingLocalService.getAgricultureBuilding(
			agricultureBuildingId);
	}

	/**
	 * Returns a range of all the agriculture buildings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureBuildingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture buildings
	 * @param end the upper bound of the range of agriculture buildings (not inclusive)
	 * @return the range of agriculture buildings
	 */
	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgricultureBuilding>
			getAgricultureBuildings(int start, int end) {

		return _agricultureBuildingLocalService.getAgricultureBuildings(
			start, end);
	}

	/**
	 * Returns the number of agriculture buildings.
	 *
	 * @return the number of agriculture buildings
	 */
	@Override
	public int getAgricultureBuildingsCount() {
		return _agricultureBuildingLocalService.getAgricultureBuildingsCount();
	}

	@Override
	public com.agriculture.application.form.service.model.AgricultureBuilding
			getAgricultureById(long ApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureBuildingException {

		return _agricultureBuildingLocalService.getAgricultureById(
			ApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _agricultureBuildingLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultureBuildingLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureBuildingLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the agriculture building in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureBuildingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureBuilding the agriculture building
	 * @return the agriculture building that was updated
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureBuilding
		updateAgricultureBuilding(
			com.agriculture.application.form.service.model.AgricultureBuilding
				agricultureBuilding) {

		return _agricultureBuildingLocalService.updateAgricultureBuilding(
			agricultureBuilding);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _agricultureBuildingLocalService.getBasePersistence();
	}

	@Override
	public AgricultureBuildingLocalService getWrappedService() {
		return _agricultureBuildingLocalService;
	}

	@Override
	public void setWrappedService(
		AgricultureBuildingLocalService agricultureBuildingLocalService) {

		_agricultureBuildingLocalService = agricultureBuildingLocalService;
	}

	private AgricultureBuildingLocalService _agricultureBuildingLocalService;

}