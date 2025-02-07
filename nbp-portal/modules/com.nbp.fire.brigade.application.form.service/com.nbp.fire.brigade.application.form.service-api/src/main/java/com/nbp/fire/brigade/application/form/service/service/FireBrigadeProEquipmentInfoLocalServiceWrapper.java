/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FireBrigadeProEquipmentInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeProEquipmentInfoLocalService
 * @generated
 */
public class FireBrigadeProEquipmentInfoLocalServiceWrapper
	implements FireBrigadeProEquipmentInfoLocalService,
			   ServiceWrapper<FireBrigadeProEquipmentInfoLocalService> {

	public FireBrigadeProEquipmentInfoLocalServiceWrapper() {
		this(null);
	}

	public FireBrigadeProEquipmentInfoLocalServiceWrapper(
		FireBrigadeProEquipmentInfoLocalService
			fireBrigadeProEquipmentInfoLocalService) {

		_fireBrigadeProEquipmentInfoLocalService =
			fireBrigadeProEquipmentInfoLocalService;
	}

	/**
	 * Adds the fire brigade pro equipment info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeProEquipmentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeProEquipmentInfo the fire brigade pro equipment info
	 * @return the fire brigade pro equipment info that was added
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeProEquipmentInfo addFireBrigadeProEquipmentInfo(
			com.nbp.fire.brigade.application.form.service.model.
				FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo) {

		return _fireBrigadeProEquipmentInfoLocalService.
			addFireBrigadeProEquipmentInfo(fireBrigadeProEquipmentInfo);
	}

	/**
	 * Creates a new fire brigade pro equipment info with the primary key. Does not add the fire brigade pro equipment info to the database.
	 *
	 * @param fireBrigadeProEquipmentInfoId the primary key for the new fire brigade pro equipment info
	 * @return the new fire brigade pro equipment info
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeProEquipmentInfo createFireBrigadeProEquipmentInfo(
			long fireBrigadeProEquipmentInfoId) {

		return _fireBrigadeProEquipmentInfoLocalService.
			createFireBrigadeProEquipmentInfo(fireBrigadeProEquipmentInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeProEquipmentInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the fire brigade pro equipment info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeProEquipmentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeProEquipmentInfo the fire brigade pro equipment info
	 * @return the fire brigade pro equipment info that was removed
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeProEquipmentInfo deleteFireBrigadeProEquipmentInfo(
			com.nbp.fire.brigade.application.form.service.model.
				FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo) {

		return _fireBrigadeProEquipmentInfoLocalService.
			deleteFireBrigadeProEquipmentInfo(fireBrigadeProEquipmentInfo);
	}

	/**
	 * Deletes the fire brigade pro equipment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeProEquipmentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeProEquipmentInfoId the primary key of the fire brigade pro equipment info
	 * @return the fire brigade pro equipment info that was removed
	 * @throws PortalException if a fire brigade pro equipment info with the primary key could not be found
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeProEquipmentInfo deleteFireBrigadeProEquipmentInfo(
				long fireBrigadeProEquipmentInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeProEquipmentInfoLocalService.
			deleteFireBrigadeProEquipmentInfo(fireBrigadeProEquipmentInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeProEquipmentInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fireBrigadeProEquipmentInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fireBrigadeProEquipmentInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fireBrigadeProEquipmentInfoLocalService.dynamicQuery();
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

		return _fireBrigadeProEquipmentInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeProEquipmentInfoModelImpl</code>.
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

		return _fireBrigadeProEquipmentInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeProEquipmentInfoModelImpl</code>.
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

		return _fireBrigadeProEquipmentInfoLocalService.dynamicQuery(
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

		return _fireBrigadeProEquipmentInfoLocalService.dynamicQueryCount(
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

		return _fireBrigadeProEquipmentInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeProEquipmentInfo fetchFireBrigadeProEquipmentInfo(
			long fireBrigadeProEquipmentInfoId) {

		return _fireBrigadeProEquipmentInfoLocalService.
			fetchFireBrigadeProEquipmentInfo(fireBrigadeProEquipmentInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fireBrigadeProEquipmentInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeProEquipmentInfo getFireBrigadeByAppId(
				long fireBrigadeApplicationId)
			throws com.nbp.fire.brigade.application.form.service.exception.
				NoSuchFireBrigadeProEquipmentInfoException {

		return _fireBrigadeProEquipmentInfoLocalService.getFireBrigadeByAppId(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade pro equipment info with the primary key.
	 *
	 * @param fireBrigadeProEquipmentInfoId the primary key of the fire brigade pro equipment info
	 * @return the fire brigade pro equipment info
	 * @throws PortalException if a fire brigade pro equipment info with the primary key could not be found
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeProEquipmentInfo getFireBrigadeProEquipmentInfo(
				long fireBrigadeProEquipmentInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeProEquipmentInfoLocalService.
			getFireBrigadeProEquipmentInfo(fireBrigadeProEquipmentInfoId);
	}

	/**
	 * Returns a range of all the fire brigade pro equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeProEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade pro equipment infos
	 * @param end the upper bound of the range of fire brigade pro equipment infos (not inclusive)
	 * @return the range of fire brigade pro equipment infos
	 */
	@Override
	public java.util.List
		<com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeProEquipmentInfo> getFireBrigadeProEquipmentInfos(
				int start, int end) {

		return _fireBrigadeProEquipmentInfoLocalService.
			getFireBrigadeProEquipmentInfos(start, end);
	}

	/**
	 * Returns the number of fire brigade pro equipment infos.
	 *
	 * @return the number of fire brigade pro equipment infos
	 */
	@Override
	public int getFireBrigadeProEquipmentInfosCount() {
		return _fireBrigadeProEquipmentInfoLocalService.
			getFireBrigadeProEquipmentInfosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fireBrigadeProEquipmentInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeProEquipmentInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeProEquipmentInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the fire brigade pro equipment info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeProEquipmentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeProEquipmentInfo the fire brigade pro equipment info
	 * @return the fire brigade pro equipment info that was updated
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeProEquipmentInfo updateFireBrigadeProEquipmentInfo(
			com.nbp.fire.brigade.application.form.service.model.
				FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo) {

		return _fireBrigadeProEquipmentInfoLocalService.
			updateFireBrigadeProEquipmentInfo(fireBrigadeProEquipmentInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _fireBrigadeProEquipmentInfoLocalService.getBasePersistence();
	}

	@Override
	public FireBrigadeProEquipmentInfoLocalService getWrappedService() {
		return _fireBrigadeProEquipmentInfoLocalService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeProEquipmentInfoLocalService
			fireBrigadeProEquipmentInfoLocalService) {

		_fireBrigadeProEquipmentInfoLocalService =
			fireBrigadeProEquipmentInfoLocalService;
	}

	private FireBrigadeProEquipmentInfoLocalService
		_fireBrigadeProEquipmentInfoLocalService;

}