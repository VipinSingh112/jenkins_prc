/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HealthCareEquipmentInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareEquipmentInfoLocalService
 * @generated
 */
public class HealthCareEquipmentInfoLocalServiceWrapper
	implements HealthCareEquipmentInfoLocalService,
			   ServiceWrapper<HealthCareEquipmentInfoLocalService> {

	public HealthCareEquipmentInfoLocalServiceWrapper() {
		this(null);
	}

	public HealthCareEquipmentInfoLocalServiceWrapper(
		HealthCareEquipmentInfoLocalService
			healthCareEquipmentInfoLocalService) {

		_healthCareEquipmentInfoLocalService =
			healthCareEquipmentInfoLocalService;
	}

	/**
	 * Adds the health care equipment info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareEquipmentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareEquipmentInfo the health care equipment info
	 * @return the health care equipment info that was added
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareEquipmentInfo addHealthCareEquipmentInfo(
				com.nbp.healthcare.application.form.service.model.
					HealthCareEquipmentInfo healthCareEquipmentInfo) {

		return _healthCareEquipmentInfoLocalService.addHealthCareEquipmentInfo(
			healthCareEquipmentInfo);
	}

	/**
	 * Creates a new health care equipment info with the primary key. Does not add the health care equipment info to the database.
	 *
	 * @param healthCareEquipmentInfoId the primary key for the new health care equipment info
	 * @return the new health care equipment info
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareEquipmentInfo createHealthCareEquipmentInfo(
				long healthCareEquipmentInfoId) {

		return _healthCareEquipmentInfoLocalService.
			createHealthCareEquipmentInfo(healthCareEquipmentInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareEquipmentInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void deleteHC_EB_HAI(long healthCareApplicationId) {
		_healthCareEquipmentInfoLocalService.deleteHC_EB_HAI(
			healthCareApplicationId);
	}

	/**
	 * Deletes the health care equipment info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareEquipmentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareEquipmentInfo the health care equipment info
	 * @return the health care equipment info that was removed
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareEquipmentInfo deleteHealthCareEquipmentInfo(
				com.nbp.healthcare.application.form.service.model.
					HealthCareEquipmentInfo healthCareEquipmentInfo) {

		return _healthCareEquipmentInfoLocalService.
			deleteHealthCareEquipmentInfo(healthCareEquipmentInfo);
	}

	/**
	 * Deletes the health care equipment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareEquipmentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareEquipmentInfoId the primary key of the health care equipment info
	 * @return the health care equipment info that was removed
	 * @throws PortalException if a health care equipment info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareEquipmentInfo deleteHealthCareEquipmentInfo(
					long healthCareEquipmentInfoId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareEquipmentInfoLocalService.
			deleteHealthCareEquipmentInfo(healthCareEquipmentInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareEquipmentInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _healthCareEquipmentInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _healthCareEquipmentInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _healthCareEquipmentInfoLocalService.dynamicQuery();
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

		return _healthCareEquipmentInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareEquipmentInfoModelImpl</code>.
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

		return _healthCareEquipmentInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareEquipmentInfoModelImpl</code>.
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

		return _healthCareEquipmentInfoLocalService.dynamicQuery(
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

		return _healthCareEquipmentInfoLocalService.dynamicQueryCount(
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

		return _healthCareEquipmentInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareEquipmentInfo fetchHealthCareEquipmentInfo(
				long healthCareEquipmentInfoId) {

		return _healthCareEquipmentInfoLocalService.
			fetchHealthCareEquipmentInfo(healthCareEquipmentInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _healthCareEquipmentInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.healthcare.application.form.service.model.
			HealthCareEquipmentInfo> getHC_EB_HAI(
				long healthCareApplicationId) {

		return _healthCareEquipmentInfoLocalService.getHC_EB_HAI(
			healthCareApplicationId);
	}

	/**
	 * Returns the health care equipment info with the primary key.
	 *
	 * @param healthCareEquipmentInfoId the primary key of the health care equipment info
	 * @return the health care equipment info
	 * @throws PortalException if a health care equipment info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareEquipmentInfo getHealthCareEquipmentInfo(
					long healthCareEquipmentInfoId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareEquipmentInfoLocalService.getHealthCareEquipmentInfo(
			healthCareEquipmentInfoId);
	}

	/**
	 * Returns a range of all the health care equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care equipment infos
	 * @param end the upper bound of the range of health care equipment infos (not inclusive)
	 * @return the range of health care equipment infos
	 */
	@Override
	public java.util.List
		<com.nbp.healthcare.application.form.service.model.
			HealthCareEquipmentInfo> getHealthCareEquipmentInfos(
				int start, int end) {

		return _healthCareEquipmentInfoLocalService.getHealthCareEquipmentInfos(
			start, end);
	}

	/**
	 * Returns the number of health care equipment infos.
	 *
	 * @return the number of health care equipment infos
	 */
	@Override
	public int getHealthCareEquipmentInfosCount() {
		return _healthCareEquipmentInfoLocalService.
			getHealthCareEquipmentInfosCount();
	}

	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareEquipmentInfo getHelathCareById(
				long healthCareApplicationId) {

		return _healthCareEquipmentInfoLocalService.getHelathCareById(
			healthCareApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _healthCareEquipmentInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthCareEquipmentInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareEquipmentInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the health care equipment info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareEquipmentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareEquipmentInfo the health care equipment info
	 * @return the health care equipment info that was updated
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareEquipmentInfo updateHealthCareEquipmentInfo(
				com.nbp.healthcare.application.form.service.model.
					HealthCareEquipmentInfo healthCareEquipmentInfo) {

		return _healthCareEquipmentInfoLocalService.
			updateHealthCareEquipmentInfo(healthCareEquipmentInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _healthCareEquipmentInfoLocalService.getBasePersistence();
	}

	@Override
	public HealthCareEquipmentInfoLocalService getWrappedService() {
		return _healthCareEquipmentInfoLocalService;
	}

	@Override
	public void setWrappedService(
		HealthCareEquipmentInfoLocalService
			healthCareEquipmentInfoLocalService) {

		_healthCareEquipmentInfoLocalService =
			healthCareEquipmentInfoLocalService;
	}

	private HealthCareEquipmentInfoLocalService
		_healthCareEquipmentInfoLocalService;

}