/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FireBrigadeHazardousSubInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeHazardousSubInfoLocalService
 * @generated
 */
public class FireBrigadeHazardousSubInfoLocalServiceWrapper
	implements FireBrigadeHazardousSubInfoLocalService,
			   ServiceWrapper<FireBrigadeHazardousSubInfoLocalService> {

	public FireBrigadeHazardousSubInfoLocalServiceWrapper() {
		this(null);
	}

	public FireBrigadeHazardousSubInfoLocalServiceWrapper(
		FireBrigadeHazardousSubInfoLocalService
			fireBrigadeHazardousSubInfoLocalService) {

		_fireBrigadeHazardousSubInfoLocalService =
			fireBrigadeHazardousSubInfoLocalService;
	}

	/**
	 * Adds the fire brigade hazardous sub info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeHazardousSubInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeHazardousSubInfo the fire brigade hazardous sub info
	 * @return the fire brigade hazardous sub info that was added
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeHazardousSubInfo addFireBrigadeHazardousSubInfo(
			com.nbp.fire.brigade.application.form.service.model.
				FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo) {

		return _fireBrigadeHazardousSubInfoLocalService.
			addFireBrigadeHazardousSubInfo(fireBrigadeHazardousSubInfo);
	}

	/**
	 * Creates a new fire brigade hazardous sub info with the primary key. Does not add the fire brigade hazardous sub info to the database.
	 *
	 * @param fireBrigadeHazardousSubInfoId the primary key for the new fire brigade hazardous sub info
	 * @return the new fire brigade hazardous sub info
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeHazardousSubInfo createFireBrigadeHazardousSubInfo(
			long fireBrigadeHazardousSubInfoId) {

		return _fireBrigadeHazardousSubInfoLocalService.
			createFireBrigadeHazardousSubInfo(fireBrigadeHazardousSubInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeHazardousSubInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the fire brigade hazardous sub info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeHazardousSubInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeHazardousSubInfo the fire brigade hazardous sub info
	 * @return the fire brigade hazardous sub info that was removed
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeHazardousSubInfo deleteFireBrigadeHazardousSubInfo(
			com.nbp.fire.brigade.application.form.service.model.
				FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo) {

		return _fireBrigadeHazardousSubInfoLocalService.
			deleteFireBrigadeHazardousSubInfo(fireBrigadeHazardousSubInfo);
	}

	/**
	 * Deletes the fire brigade hazardous sub info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeHazardousSubInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeHazardousSubInfoId the primary key of the fire brigade hazardous sub info
	 * @return the fire brigade hazardous sub info that was removed
	 * @throws PortalException if a fire brigade hazardous sub info with the primary key could not be found
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeHazardousSubInfo deleteFireBrigadeHazardousSubInfo(
				long fireBrigadeHazardousSubInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeHazardousSubInfoLocalService.
			deleteFireBrigadeHazardousSubInfo(fireBrigadeHazardousSubInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeHazardousSubInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fireBrigadeHazardousSubInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fireBrigadeHazardousSubInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fireBrigadeHazardousSubInfoLocalService.dynamicQuery();
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

		return _fireBrigadeHazardousSubInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeHazardousSubInfoModelImpl</code>.
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

		return _fireBrigadeHazardousSubInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeHazardousSubInfoModelImpl</code>.
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

		return _fireBrigadeHazardousSubInfoLocalService.dynamicQuery(
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

		return _fireBrigadeHazardousSubInfoLocalService.dynamicQueryCount(
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

		return _fireBrigadeHazardousSubInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeHazardousSubInfo fetchFireBrigadeHazardousSubInfo(
			long fireBrigadeHazardousSubInfoId) {

		return _fireBrigadeHazardousSubInfoLocalService.
			fetchFireBrigadeHazardousSubInfo(fireBrigadeHazardousSubInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fireBrigadeHazardousSubInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeHazardousSubInfo getFireBrigadeByAppId(
				long fireBrigadeApplicationId)
			throws com.nbp.fire.brigade.application.form.service.exception.
				NoSuchFireBrigadeHazardousSubInfoException {

		return _fireBrigadeHazardousSubInfoLocalService.getFireBrigadeByAppId(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade hazardous sub info with the primary key.
	 *
	 * @param fireBrigadeHazardousSubInfoId the primary key of the fire brigade hazardous sub info
	 * @return the fire brigade hazardous sub info
	 * @throws PortalException if a fire brigade hazardous sub info with the primary key could not be found
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeHazardousSubInfo getFireBrigadeHazardousSubInfo(
				long fireBrigadeHazardousSubInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeHazardousSubInfoLocalService.
			getFireBrigadeHazardousSubInfo(fireBrigadeHazardousSubInfoId);
	}

	/**
	 * Returns a range of all the fire brigade hazardous sub infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeHazardousSubInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade hazardous sub infos
	 * @param end the upper bound of the range of fire brigade hazardous sub infos (not inclusive)
	 * @return the range of fire brigade hazardous sub infos
	 */
	@Override
	public java.util.List
		<com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeHazardousSubInfo> getFireBrigadeHazardousSubInfos(
				int start, int end) {

		return _fireBrigadeHazardousSubInfoLocalService.
			getFireBrigadeHazardousSubInfos(start, end);
	}

	/**
	 * Returns the number of fire brigade hazardous sub infos.
	 *
	 * @return the number of fire brigade hazardous sub infos
	 */
	@Override
	public int getFireBrigadeHazardousSubInfosCount() {
		return _fireBrigadeHazardousSubInfoLocalService.
			getFireBrigadeHazardousSubInfosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fireBrigadeHazardousSubInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeHazardousSubInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeHazardousSubInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the fire brigade hazardous sub info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeHazardousSubInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeHazardousSubInfo the fire brigade hazardous sub info
	 * @return the fire brigade hazardous sub info that was updated
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeHazardousSubInfo updateFireBrigadeHazardousSubInfo(
			com.nbp.fire.brigade.application.form.service.model.
				FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo) {

		return _fireBrigadeHazardousSubInfoLocalService.
			updateFireBrigadeHazardousSubInfo(fireBrigadeHazardousSubInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _fireBrigadeHazardousSubInfoLocalService.getBasePersistence();
	}

	@Override
	public FireBrigadeHazardousSubInfoLocalService getWrappedService() {
		return _fireBrigadeHazardousSubInfoLocalService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeHazardousSubInfoLocalService
			fireBrigadeHazardousSubInfoLocalService) {

		_fireBrigadeHazardousSubInfoLocalService =
			fireBrigadeHazardousSubInfoLocalService;
	}

	private FireBrigadeHazardousSubInfoLocalService
		_fireBrigadeHazardousSubInfoLocalService;

}