/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FireBrigadeSignatureInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeSignatureInfoLocalService
 * @generated
 */
public class FireBrigadeSignatureInfoLocalServiceWrapper
	implements FireBrigadeSignatureInfoLocalService,
			   ServiceWrapper<FireBrigadeSignatureInfoLocalService> {

	public FireBrigadeSignatureInfoLocalServiceWrapper() {
		this(null);
	}

	public FireBrigadeSignatureInfoLocalServiceWrapper(
		FireBrigadeSignatureInfoLocalService
			fireBrigadeSignatureInfoLocalService) {

		_fireBrigadeSignatureInfoLocalService =
			fireBrigadeSignatureInfoLocalService;
	}

	/**
	 * Adds the fire brigade signature info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeSignatureInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeSignatureInfo the fire brigade signature info
	 * @return the fire brigade signature info that was added
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeSignatureInfo addFireBrigadeSignatureInfo(
				com.nbp.fire.brigade.application.form.service.model.
					FireBrigadeSignatureInfo fireBrigadeSignatureInfo) {

		return _fireBrigadeSignatureInfoLocalService.
			addFireBrigadeSignatureInfo(fireBrigadeSignatureInfo);
	}

	/**
	 * Creates a new fire brigade signature info with the primary key. Does not add the fire brigade signature info to the database.
	 *
	 * @param fireBrigadeSignatureInfoId the primary key for the new fire brigade signature info
	 * @return the new fire brigade signature info
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeSignatureInfo createFireBrigadeSignatureInfo(
				long fireBrigadeSignatureInfoId) {

		return _fireBrigadeSignatureInfoLocalService.
			createFireBrigadeSignatureInfo(fireBrigadeSignatureInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeSignatureInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the fire brigade signature info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeSignatureInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeSignatureInfo the fire brigade signature info
	 * @return the fire brigade signature info that was removed
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeSignatureInfo deleteFireBrigadeSignatureInfo(
				com.nbp.fire.brigade.application.form.service.model.
					FireBrigadeSignatureInfo fireBrigadeSignatureInfo) {

		return _fireBrigadeSignatureInfoLocalService.
			deleteFireBrigadeSignatureInfo(fireBrigadeSignatureInfo);
	}

	/**
	 * Deletes the fire brigade signature info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeSignatureInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeSignatureInfoId the primary key of the fire brigade signature info
	 * @return the fire brigade signature info that was removed
	 * @throws PortalException if a fire brigade signature info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeSignatureInfo deleteFireBrigadeSignatureInfo(
					long fireBrigadeSignatureInfoId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeSignatureInfoLocalService.
			deleteFireBrigadeSignatureInfo(fireBrigadeSignatureInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeSignatureInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fireBrigadeSignatureInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fireBrigadeSignatureInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fireBrigadeSignatureInfoLocalService.dynamicQuery();
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

		return _fireBrigadeSignatureInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeSignatureInfoModelImpl</code>.
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

		return _fireBrigadeSignatureInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeSignatureInfoModelImpl</code>.
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

		return _fireBrigadeSignatureInfoLocalService.dynamicQuery(
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

		return _fireBrigadeSignatureInfoLocalService.dynamicQueryCount(
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

		return _fireBrigadeSignatureInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeSignatureInfo fetchFireBrigadeSignatureInfo(
				long fireBrigadeSignatureInfoId) {

		return _fireBrigadeSignatureInfoLocalService.
			fetchFireBrigadeSignatureInfo(fireBrigadeSignatureInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fireBrigadeSignatureInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeSignatureInfo getFireBrigadeByAppId(
					long fireBrigadeApplicationId)
				throws com.nbp.fire.brigade.application.form.service.exception.
					NoSuchFireBrigadeSignatureInfoException {

		return _fireBrigadeSignatureInfoLocalService.getFireBrigadeByAppId(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade signature info with the primary key.
	 *
	 * @param fireBrigadeSignatureInfoId the primary key of the fire brigade signature info
	 * @return the fire brigade signature info
	 * @throws PortalException if a fire brigade signature info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeSignatureInfo getFireBrigadeSignatureInfo(
					long fireBrigadeSignatureInfoId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeSignatureInfoLocalService.
			getFireBrigadeSignatureInfo(fireBrigadeSignatureInfoId);
	}

	/**
	 * Returns a range of all the fire brigade signature infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeSignatureInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade signature infos
	 * @param end the upper bound of the range of fire brigade signature infos (not inclusive)
	 * @return the range of fire brigade signature infos
	 */
	@Override
	public java.util.List
		<com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeSignatureInfo> getFireBrigadeSignatureInfos(
				int start, int end) {

		return _fireBrigadeSignatureInfoLocalService.
			getFireBrigadeSignatureInfos(start, end);
	}

	/**
	 * Returns the number of fire brigade signature infos.
	 *
	 * @return the number of fire brigade signature infos
	 */
	@Override
	public int getFireBrigadeSignatureInfosCount() {
		return _fireBrigadeSignatureInfoLocalService.
			getFireBrigadeSignatureInfosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fireBrigadeSignatureInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeSignatureInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeSignatureInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the fire brigade signature info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeSignatureInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeSignatureInfo the fire brigade signature info
	 * @return the fire brigade signature info that was updated
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeSignatureInfo updateFireBrigadeSignatureInfo(
				com.nbp.fire.brigade.application.form.service.model.
					FireBrigadeSignatureInfo fireBrigadeSignatureInfo) {

		return _fireBrigadeSignatureInfoLocalService.
			updateFireBrigadeSignatureInfo(fireBrigadeSignatureInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _fireBrigadeSignatureInfoLocalService.getBasePersistence();
	}

	@Override
	public FireBrigadeSignatureInfoLocalService getWrappedService() {
		return _fireBrigadeSignatureInfoLocalService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeSignatureInfoLocalService
			fireBrigadeSignatureInfoLocalService) {

		_fireBrigadeSignatureInfoLocalService =
			fireBrigadeSignatureInfoLocalService;
	}

	private FireBrigadeSignatureInfoLocalService
		_fireBrigadeSignatureInfoLocalService;

}