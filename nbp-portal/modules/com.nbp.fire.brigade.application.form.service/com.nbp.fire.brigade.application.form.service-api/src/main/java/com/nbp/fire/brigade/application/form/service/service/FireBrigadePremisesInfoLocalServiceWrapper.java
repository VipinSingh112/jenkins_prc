/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FireBrigadePremisesInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadePremisesInfoLocalService
 * @generated
 */
public class FireBrigadePremisesInfoLocalServiceWrapper
	implements FireBrigadePremisesInfoLocalService,
			   ServiceWrapper<FireBrigadePremisesInfoLocalService> {

	public FireBrigadePremisesInfoLocalServiceWrapper() {
		this(null);
	}

	public FireBrigadePremisesInfoLocalServiceWrapper(
		FireBrigadePremisesInfoLocalService
			fireBrigadePremisesInfoLocalService) {

		_fireBrigadePremisesInfoLocalService =
			fireBrigadePremisesInfoLocalService;
	}

	/**
	 * Adds the fire brigade premises info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadePremisesInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadePremisesInfo the fire brigade premises info
	 * @return the fire brigade premises info that was added
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadePremisesInfo addFireBrigadePremisesInfo(
				com.nbp.fire.brigade.application.form.service.model.
					FireBrigadePremisesInfo fireBrigadePremisesInfo) {

		return _fireBrigadePremisesInfoLocalService.addFireBrigadePremisesInfo(
			fireBrigadePremisesInfo);
	}

	/**
	 * Creates a new fire brigade premises info with the primary key. Does not add the fire brigade premises info to the database.
	 *
	 * @param fireBrigadePremisesInfoId the primary key for the new fire brigade premises info
	 * @return the new fire brigade premises info
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadePremisesInfo createFireBrigadePremisesInfo(
				long fireBrigadePremisesInfoId) {

		return _fireBrigadePremisesInfoLocalService.
			createFireBrigadePremisesInfo(fireBrigadePremisesInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadePremisesInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the fire brigade premises info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadePremisesInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadePremisesInfo the fire brigade premises info
	 * @return the fire brigade premises info that was removed
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadePremisesInfo deleteFireBrigadePremisesInfo(
				com.nbp.fire.brigade.application.form.service.model.
					FireBrigadePremisesInfo fireBrigadePremisesInfo) {

		return _fireBrigadePremisesInfoLocalService.
			deleteFireBrigadePremisesInfo(fireBrigadePremisesInfo);
	}

	/**
	 * Deletes the fire brigade premises info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadePremisesInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadePremisesInfoId the primary key of the fire brigade premises info
	 * @return the fire brigade premises info that was removed
	 * @throws PortalException if a fire brigade premises info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadePremisesInfo deleteFireBrigadePremisesInfo(
					long fireBrigadePremisesInfoId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadePremisesInfoLocalService.
			deleteFireBrigadePremisesInfo(fireBrigadePremisesInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadePremisesInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fireBrigadePremisesInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fireBrigadePremisesInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fireBrigadePremisesInfoLocalService.dynamicQuery();
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

		return _fireBrigadePremisesInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadePremisesInfoModelImpl</code>.
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

		return _fireBrigadePremisesInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadePremisesInfoModelImpl</code>.
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

		return _fireBrigadePremisesInfoLocalService.dynamicQuery(
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

		return _fireBrigadePremisesInfoLocalService.dynamicQueryCount(
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

		return _fireBrigadePremisesInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadePremisesInfo fetchFireBrigadePremisesInfo(
				long fireBrigadePremisesInfoId) {

		return _fireBrigadePremisesInfoLocalService.
			fetchFireBrigadePremisesInfo(fireBrigadePremisesInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fireBrigadePremisesInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadePremisesInfo getFireBrigadeByAppId(
					long fireBrigadeApplicationId)
				throws com.nbp.fire.brigade.application.form.service.exception.
					NoSuchFireBrigadePremisesInfoException {

		return _fireBrigadePremisesInfoLocalService.getFireBrigadeByAppId(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade premises info with the primary key.
	 *
	 * @param fireBrigadePremisesInfoId the primary key of the fire brigade premises info
	 * @return the fire brigade premises info
	 * @throws PortalException if a fire brigade premises info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadePremisesInfo getFireBrigadePremisesInfo(
					long fireBrigadePremisesInfoId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadePremisesInfoLocalService.getFireBrigadePremisesInfo(
			fireBrigadePremisesInfoId);
	}

	/**
	 * Returns a range of all the fire brigade premises infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadePremisesInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade premises infos
	 * @param end the upper bound of the range of fire brigade premises infos (not inclusive)
	 * @return the range of fire brigade premises infos
	 */
	@Override
	public java.util.List
		<com.nbp.fire.brigade.application.form.service.model.
			FireBrigadePremisesInfo> getFireBrigadePremisesInfos(
				int start, int end) {

		return _fireBrigadePremisesInfoLocalService.getFireBrigadePremisesInfos(
			start, end);
	}

	/**
	 * Returns the number of fire brigade premises infos.
	 *
	 * @return the number of fire brigade premises infos
	 */
	@Override
	public int getFireBrigadePremisesInfosCount() {
		return _fireBrigadePremisesInfoLocalService.
			getFireBrigadePremisesInfosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fireBrigadePremisesInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadePremisesInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadePremisesInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the fire brigade premises info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadePremisesInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadePremisesInfo the fire brigade premises info
	 * @return the fire brigade premises info that was updated
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadePremisesInfo updateFireBrigadePremisesInfo(
				com.nbp.fire.brigade.application.form.service.model.
					FireBrigadePremisesInfo fireBrigadePremisesInfo) {

		return _fireBrigadePremisesInfoLocalService.
			updateFireBrigadePremisesInfo(fireBrigadePremisesInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _fireBrigadePremisesInfoLocalService.getBasePersistence();
	}

	@Override
	public FireBrigadePremisesInfoLocalService getWrappedService() {
		return _fireBrigadePremisesInfoLocalService;
	}

	@Override
	public void setWrappedService(
		FireBrigadePremisesInfoLocalService
			fireBrigadePremisesInfoLocalService) {

		_fireBrigadePremisesInfoLocalService =
			fireBrigadePremisesInfoLocalService;
	}

	private FireBrigadePremisesInfoLocalService
		_fireBrigadePremisesInfoLocalService;

}