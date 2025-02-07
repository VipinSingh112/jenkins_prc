/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AgricultureFarmLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureFarmLocalService
 * @generated
 */
public class AgricultureFarmLocalServiceWrapper
	implements AgricultureFarmLocalService,
			   ServiceWrapper<AgricultureFarmLocalService> {

	public AgricultureFarmLocalServiceWrapper() {
		this(null);
	}

	public AgricultureFarmLocalServiceWrapper(
		AgricultureFarmLocalService agricultureFarmLocalService) {

		_agricultureFarmLocalService = agricultureFarmLocalService;
	}

	/**
	 * Adds the agriculture farm to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureFarmLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureFarm the agriculture farm
	 * @return the agriculture farm that was added
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureFarm
		addAgricultureFarm(
			com.agriculture.application.form.service.model.AgricultureFarm
				agricultureFarm) {

		return _agricultureFarmLocalService.addAgricultureFarm(agricultureFarm);
	}

	/**
	 * Creates a new agriculture farm with the primary key. Does not add the agriculture farm to the database.
	 *
	 * @param agricultureFarmId the primary key for the new agriculture farm
	 * @return the new agriculture farm
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureFarm
		createAgricultureFarm(long agricultureFarmId) {

		return _agricultureFarmLocalService.createAgricultureFarm(
			agricultureFarmId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureFarmLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the agriculture farm from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureFarmLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureFarm the agriculture farm
	 * @return the agriculture farm that was removed
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureFarm
		deleteAgricultureFarm(
			com.agriculture.application.form.service.model.AgricultureFarm
				agricultureFarm) {

		return _agricultureFarmLocalService.deleteAgricultureFarm(
			agricultureFarm);
	}

	/**
	 * Deletes the agriculture farm with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureFarmLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureFarmId the primary key of the agriculture farm
	 * @return the agriculture farm that was removed
	 * @throws PortalException if a agriculture farm with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureFarm
			deleteAgricultureFarm(long agricultureFarmId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureFarmLocalService.deleteAgricultureFarm(
			agricultureFarmId);
	}

	@Override
	public void deleteAgriFarmerById(long applicationId) {
		_agricultureFarmLocalService.deleteAgriFarmerById(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureFarmLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _agricultureFarmLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _agricultureFarmLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _agricultureFarmLocalService.dynamicQuery();
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

		return _agricultureFarmLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureFarmModelImpl</code>.
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

		return _agricultureFarmLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureFarmModelImpl</code>.
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

		return _agricultureFarmLocalService.dynamicQuery(
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

		return _agricultureFarmLocalService.dynamicQueryCount(dynamicQuery);
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

		return _agricultureFarmLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.agriculture.application.form.service.model.AgricultureFarm
		fetchAgricultureFarm(long agricultureFarmId) {

		return _agricultureFarmLocalService.fetchAgricultureFarm(
			agricultureFarmId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _agricultureFarmLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgricultureFarm>
			getAFa_by_AAI(long agricultureApplicationId) {

		return _agricultureFarmLocalService.getAFa_by_AAI(
			agricultureApplicationId);
	}

	@Override
	public com.agriculture.application.form.service.model.AgricultureFarm
			getAgricultureById(long ApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureFarmException {

		return _agricultureFarmLocalService.getAgricultureById(ApplicationId);
	}

	/**
	 * Returns the agriculture farm with the primary key.
	 *
	 * @param agricultureFarmId the primary key of the agriculture farm
	 * @return the agriculture farm
	 * @throws PortalException if a agriculture farm with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureFarm
			getAgricultureFarm(long agricultureFarmId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureFarmLocalService.getAgricultureFarm(
			agricultureFarmId);
	}

	/**
	 * Returns a range of all the agriculture farms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureFarmModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture farms
	 * @param end the upper bound of the range of agriculture farms (not inclusive)
	 * @return the range of agriculture farms
	 */
	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgricultureFarm>
			getAgricultureFarms(int start, int end) {

		return _agricultureFarmLocalService.getAgricultureFarms(start, end);
	}

	/**
	 * Returns the number of agriculture farms.
	 *
	 * @return the number of agriculture farms
	 */
	@Override
	public int getAgricultureFarmsCount() {
		return _agricultureFarmLocalService.getAgricultureFarmsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _agricultureFarmLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultureFarmLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureFarmLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the agriculture farm in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureFarmLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureFarm the agriculture farm
	 * @return the agriculture farm that was updated
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureFarm
		updateAgricultureFarm(
			com.agriculture.application.form.service.model.AgricultureFarm
				agricultureFarm) {

		return _agricultureFarmLocalService.updateAgricultureFarm(
			agricultureFarm);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _agricultureFarmLocalService.getBasePersistence();
	}

	@Override
	public AgricultureFarmLocalService getWrappedService() {
		return _agricultureFarmLocalService;
	}

	@Override
	public void setWrappedService(
		AgricultureFarmLocalService agricultureFarmLocalService) {

		_agricultureFarmLocalService = agricultureFarmLocalService;
	}

	private AgricultureFarmLocalService _agricultureFarmLocalService;

}