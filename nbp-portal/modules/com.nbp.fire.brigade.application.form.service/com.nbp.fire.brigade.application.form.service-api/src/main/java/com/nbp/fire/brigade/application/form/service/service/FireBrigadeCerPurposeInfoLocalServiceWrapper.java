/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FireBrigadeCerPurposeInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeCerPurposeInfoLocalService
 * @generated
 */
public class FireBrigadeCerPurposeInfoLocalServiceWrapper
	implements FireBrigadeCerPurposeInfoLocalService,
			   ServiceWrapper<FireBrigadeCerPurposeInfoLocalService> {

	public FireBrigadeCerPurposeInfoLocalServiceWrapper() {
		this(null);
	}

	public FireBrigadeCerPurposeInfoLocalServiceWrapper(
		FireBrigadeCerPurposeInfoLocalService
			fireBrigadeCerPurposeInfoLocalService) {

		_fireBrigadeCerPurposeInfoLocalService =
			fireBrigadeCerPurposeInfoLocalService;
	}

	/**
	 * Adds the fire brigade cer purpose info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeCerPurposeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeCerPurposeInfo the fire brigade cer purpose info
	 * @return the fire brigade cer purpose info that was added
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeCerPurposeInfo addFireBrigadeCerPurposeInfo(
			com.nbp.fire.brigade.application.form.service.model.
				FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo) {

		return _fireBrigadeCerPurposeInfoLocalService.
			addFireBrigadeCerPurposeInfo(fireBrigadeCerPurposeInfo);
	}

	/**
	 * Creates a new fire brigade cer purpose info with the primary key. Does not add the fire brigade cer purpose info to the database.
	 *
	 * @param fireBrigadeCerPurposeInfoId the primary key for the new fire brigade cer purpose info
	 * @return the new fire brigade cer purpose info
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeCerPurposeInfo createFireBrigadeCerPurposeInfo(
			long fireBrigadeCerPurposeInfoId) {

		return _fireBrigadeCerPurposeInfoLocalService.
			createFireBrigadeCerPurposeInfo(fireBrigadeCerPurposeInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeCerPurposeInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the fire brigade cer purpose info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeCerPurposeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeCerPurposeInfo the fire brigade cer purpose info
	 * @return the fire brigade cer purpose info that was removed
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeCerPurposeInfo deleteFireBrigadeCerPurposeInfo(
			com.nbp.fire.brigade.application.form.service.model.
				FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo) {

		return _fireBrigadeCerPurposeInfoLocalService.
			deleteFireBrigadeCerPurposeInfo(fireBrigadeCerPurposeInfo);
	}

	/**
	 * Deletes the fire brigade cer purpose info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeCerPurposeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeCerPurposeInfoId the primary key of the fire brigade cer purpose info
	 * @return the fire brigade cer purpose info that was removed
	 * @throws PortalException if a fire brigade cer purpose info with the primary key could not be found
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeCerPurposeInfo deleteFireBrigadeCerPurposeInfo(
				long fireBrigadeCerPurposeInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeCerPurposeInfoLocalService.
			deleteFireBrigadeCerPurposeInfo(fireBrigadeCerPurposeInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeCerPurposeInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fireBrigadeCerPurposeInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fireBrigadeCerPurposeInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fireBrigadeCerPurposeInfoLocalService.dynamicQuery();
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

		return _fireBrigadeCerPurposeInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeCerPurposeInfoModelImpl</code>.
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

		return _fireBrigadeCerPurposeInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeCerPurposeInfoModelImpl</code>.
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

		return _fireBrigadeCerPurposeInfoLocalService.dynamicQuery(
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

		return _fireBrigadeCerPurposeInfoLocalService.dynamicQueryCount(
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

		return _fireBrigadeCerPurposeInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeCerPurposeInfo fetchFireBrigadeCerPurposeInfo(
			long fireBrigadeCerPurposeInfoId) {

		return _fireBrigadeCerPurposeInfoLocalService.
			fetchFireBrigadeCerPurposeInfo(fireBrigadeCerPurposeInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fireBrigadeCerPurposeInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeCerPurposeInfo getFireBrigadeByAppId(
				long fireBrigadeApplicationId)
			throws com.nbp.fire.brigade.application.form.service.exception.
				NoSuchFireBrigadeCerPurposeInfoException {

		return _fireBrigadeCerPurposeInfoLocalService.getFireBrigadeByAppId(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade cer purpose info with the primary key.
	 *
	 * @param fireBrigadeCerPurposeInfoId the primary key of the fire brigade cer purpose info
	 * @return the fire brigade cer purpose info
	 * @throws PortalException if a fire brigade cer purpose info with the primary key could not be found
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeCerPurposeInfo getFireBrigadeCerPurposeInfo(
				long fireBrigadeCerPurposeInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeCerPurposeInfoLocalService.
			getFireBrigadeCerPurposeInfo(fireBrigadeCerPurposeInfoId);
	}

	/**
	 * Returns a range of all the fire brigade cer purpose infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeCerPurposeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade cer purpose infos
	 * @param end the upper bound of the range of fire brigade cer purpose infos (not inclusive)
	 * @return the range of fire brigade cer purpose infos
	 */
	@Override
	public java.util.List
		<com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeCerPurposeInfo> getFireBrigadeCerPurposeInfos(
				int start, int end) {

		return _fireBrigadeCerPurposeInfoLocalService.
			getFireBrigadeCerPurposeInfos(start, end);
	}

	/**
	 * Returns the number of fire brigade cer purpose infos.
	 *
	 * @return the number of fire brigade cer purpose infos
	 */
	@Override
	public int getFireBrigadeCerPurposeInfosCount() {
		return _fireBrigadeCerPurposeInfoLocalService.
			getFireBrigadeCerPurposeInfosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fireBrigadeCerPurposeInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeCerPurposeInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeCerPurposeInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the fire brigade cer purpose info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeCerPurposeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeCerPurposeInfo the fire brigade cer purpose info
	 * @return the fire brigade cer purpose info that was updated
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeCerPurposeInfo updateFireBrigadeCerPurposeInfo(
			com.nbp.fire.brigade.application.form.service.model.
				FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo) {

		return _fireBrigadeCerPurposeInfoLocalService.
			updateFireBrigadeCerPurposeInfo(fireBrigadeCerPurposeInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _fireBrigadeCerPurposeInfoLocalService.getBasePersistence();
	}

	@Override
	public FireBrigadeCerPurposeInfoLocalService getWrappedService() {
		return _fireBrigadeCerPurposeInfoLocalService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeCerPurposeInfoLocalService
			fireBrigadeCerPurposeInfoLocalService) {

		_fireBrigadeCerPurposeInfoLocalService =
			fireBrigadeCerPurposeInfoLocalService;
	}

	private FireBrigadeCerPurposeInfoLocalService
		_fireBrigadeCerPurposeInfoLocalService;

}