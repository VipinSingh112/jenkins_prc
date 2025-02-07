/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FireBrigadeOperatorDetailLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeOperatorDetailLocalService
 * @generated
 */
public class FireBrigadeOperatorDetailLocalServiceWrapper
	implements FireBrigadeOperatorDetailLocalService,
			   ServiceWrapper<FireBrigadeOperatorDetailLocalService> {

	public FireBrigadeOperatorDetailLocalServiceWrapper() {
		this(null);
	}

	public FireBrigadeOperatorDetailLocalServiceWrapper(
		FireBrigadeOperatorDetailLocalService
			fireBrigadeOperatorDetailLocalService) {

		_fireBrigadeOperatorDetailLocalService =
			fireBrigadeOperatorDetailLocalService;
	}

	/**
	 * Adds the fire brigade operator detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeOperatorDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeOperatorDetail the fire brigade operator detail
	 * @return the fire brigade operator detail that was added
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeOperatorDetail addFireBrigadeOperatorDetail(
			com.nbp.fire.brigade.application.form.service.model.
				FireBrigadeOperatorDetail fireBrigadeOperatorDetail) {

		return _fireBrigadeOperatorDetailLocalService.
			addFireBrigadeOperatorDetail(fireBrigadeOperatorDetail);
	}

	/**
	 * Creates a new fire brigade operator detail with the primary key. Does not add the fire brigade operator detail to the database.
	 *
	 * @param fireBrigadeOperatorDetailId the primary key for the new fire brigade operator detail
	 * @return the new fire brigade operator detail
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeOperatorDetail createFireBrigadeOperatorDetail(
			long fireBrigadeOperatorDetailId) {

		return _fireBrigadeOperatorDetailLocalService.
			createFireBrigadeOperatorDetail(fireBrigadeOperatorDetailId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeOperatorDetailLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the fire brigade operator detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeOperatorDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeOperatorDetail the fire brigade operator detail
	 * @return the fire brigade operator detail that was removed
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeOperatorDetail deleteFireBrigadeOperatorDetail(
			com.nbp.fire.brigade.application.form.service.model.
				FireBrigadeOperatorDetail fireBrigadeOperatorDetail) {

		return _fireBrigadeOperatorDetailLocalService.
			deleteFireBrigadeOperatorDetail(fireBrigadeOperatorDetail);
	}

	/**
	 * Deletes the fire brigade operator detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeOperatorDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeOperatorDetailId the primary key of the fire brigade operator detail
	 * @return the fire brigade operator detail that was removed
	 * @throws PortalException if a fire brigade operator detail with the primary key could not be found
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeOperatorDetail deleteFireBrigadeOperatorDetail(
				long fireBrigadeOperatorDetailId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeOperatorDetailLocalService.
			deleteFireBrigadeOperatorDetail(fireBrigadeOperatorDetailId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeOperatorDetailLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fireBrigadeOperatorDetailLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fireBrigadeOperatorDetailLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fireBrigadeOperatorDetailLocalService.dynamicQuery();
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

		return _fireBrigadeOperatorDetailLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeOperatorDetailModelImpl</code>.
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

		return _fireBrigadeOperatorDetailLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeOperatorDetailModelImpl</code>.
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

		return _fireBrigadeOperatorDetailLocalService.dynamicQuery(
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

		return _fireBrigadeOperatorDetailLocalService.dynamicQueryCount(
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

		return _fireBrigadeOperatorDetailLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeOperatorDetail fetchFireBrigadeOperatorDetail(
			long fireBrigadeOperatorDetailId) {

		return _fireBrigadeOperatorDetailLocalService.
			fetchFireBrigadeOperatorDetail(fireBrigadeOperatorDetailId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fireBrigadeOperatorDetailLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeOperatorDetail getFireBrigadeByAppId(
				long fireBrigadeApplicationId)
			throws com.nbp.fire.brigade.application.form.service.exception.
				NoSuchFireBrigadeOperatorDetailException {

		return _fireBrigadeOperatorDetailLocalService.getFireBrigadeByAppId(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade operator detail with the primary key.
	 *
	 * @param fireBrigadeOperatorDetailId the primary key of the fire brigade operator detail
	 * @return the fire brigade operator detail
	 * @throws PortalException if a fire brigade operator detail with the primary key could not be found
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeOperatorDetail getFireBrigadeOperatorDetail(
				long fireBrigadeOperatorDetailId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeOperatorDetailLocalService.
			getFireBrigadeOperatorDetail(fireBrigadeOperatorDetailId);
	}

	/**
	 * Returns a range of all the fire brigade operator details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeOperatorDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade operator details
	 * @param end the upper bound of the range of fire brigade operator details (not inclusive)
	 * @return the range of fire brigade operator details
	 */
	@Override
	public java.util.List
		<com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeOperatorDetail> getFireBrigadeOperatorDetails(
				int start, int end) {

		return _fireBrigadeOperatorDetailLocalService.
			getFireBrigadeOperatorDetails(start, end);
	}

	/**
	 * Returns the number of fire brigade operator details.
	 *
	 * @return the number of fire brigade operator details
	 */
	@Override
	public int getFireBrigadeOperatorDetailsCount() {
		return _fireBrigadeOperatorDetailLocalService.
			getFireBrigadeOperatorDetailsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fireBrigadeOperatorDetailLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeOperatorDetailLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeOperatorDetailLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the fire brigade operator detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeOperatorDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeOperatorDetail the fire brigade operator detail
	 * @return the fire brigade operator detail that was updated
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeOperatorDetail updateFireBrigadeOperatorDetail(
			com.nbp.fire.brigade.application.form.service.model.
				FireBrigadeOperatorDetail fireBrigadeOperatorDetail) {

		return _fireBrigadeOperatorDetailLocalService.
			updateFireBrigadeOperatorDetail(fireBrigadeOperatorDetail);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _fireBrigadeOperatorDetailLocalService.getBasePersistence();
	}

	@Override
	public FireBrigadeOperatorDetailLocalService getWrappedService() {
		return _fireBrigadeOperatorDetailLocalService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeOperatorDetailLocalService
			fireBrigadeOperatorDetailLocalService) {

		_fireBrigadeOperatorDetailLocalService =
			fireBrigadeOperatorDetailLocalService;
	}

	private FireBrigadeOperatorDetailLocalService
		_fireBrigadeOperatorDetailLocalService;

}