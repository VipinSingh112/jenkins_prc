/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FireBrigadeAppliCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeAppliCurrentStageLocalService
 * @generated
 */
public class FireBrigadeAppliCurrentStageLocalServiceWrapper
	implements FireBrigadeAppliCurrentStageLocalService,
			   ServiceWrapper<FireBrigadeAppliCurrentStageLocalService> {

	public FireBrigadeAppliCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public FireBrigadeAppliCurrentStageLocalServiceWrapper(
		FireBrigadeAppliCurrentStageLocalService
			fireBrigadeAppliCurrentStageLocalService) {

		_fireBrigadeAppliCurrentStageLocalService =
			fireBrigadeAppliCurrentStageLocalService;
	}

	/**
	 * Adds the fire brigade appli current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeAppliCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeAppliCurrentStage the fire brigade appli current stage
	 * @return the fire brigade appli current stage that was added
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeAppliCurrentStage addFireBrigadeAppliCurrentStage(
			com.nbp.fire.brigade.application.form.service.model.
				FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage) {

		return _fireBrigadeAppliCurrentStageLocalService.
			addFireBrigadeAppliCurrentStage(fireBrigadeAppliCurrentStage);
	}

	/**
	 * Creates a new fire brigade appli current stage with the primary key. Does not add the fire brigade appli current stage to the database.
	 *
	 * @param fireBrigadeAppliCurrentStageId the primary key for the new fire brigade appli current stage
	 * @return the new fire brigade appli current stage
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeAppliCurrentStage createFireBrigadeAppliCurrentStage(
			long fireBrigadeAppliCurrentStageId) {

		return _fireBrigadeAppliCurrentStageLocalService.
			createFireBrigadeAppliCurrentStage(fireBrigadeAppliCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeAppliCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the fire brigade appli current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeAppliCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeAppliCurrentStage the fire brigade appli current stage
	 * @return the fire brigade appli current stage that was removed
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeAppliCurrentStage deleteFireBrigadeAppliCurrentStage(
			com.nbp.fire.brigade.application.form.service.model.
				FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage) {

		return _fireBrigadeAppliCurrentStageLocalService.
			deleteFireBrigadeAppliCurrentStage(fireBrigadeAppliCurrentStage);
	}

	/**
	 * Deletes the fire brigade appli current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeAppliCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeAppliCurrentStageId the primary key of the fire brigade appli current stage
	 * @return the fire brigade appli current stage that was removed
	 * @throws PortalException if a fire brigade appli current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeAppliCurrentStage deleteFireBrigadeAppliCurrentStage(
				long fireBrigadeAppliCurrentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeAppliCurrentStageLocalService.
			deleteFireBrigadeAppliCurrentStage(fireBrigadeAppliCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeAppliCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fireBrigadeAppliCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fireBrigadeAppliCurrentStageLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fireBrigadeAppliCurrentStageLocalService.dynamicQuery();
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

		return _fireBrigadeAppliCurrentStageLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeAppliCurrentStageModelImpl</code>.
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

		return _fireBrigadeAppliCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeAppliCurrentStageModelImpl</code>.
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

		return _fireBrigadeAppliCurrentStageLocalService.dynamicQuery(
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

		return _fireBrigadeAppliCurrentStageLocalService.dynamicQueryCount(
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

		return _fireBrigadeAppliCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeAppliCurrentStage fetchFireBrigadeAppliCurrentStage(
			long fireBrigadeAppliCurrentStageId) {

		return _fireBrigadeAppliCurrentStageLocalService.
			fetchFireBrigadeAppliCurrentStage(fireBrigadeAppliCurrentStageId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fireBrigadeAppliCurrentStageLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeAppliCurrentStage getFireBrigade_Stage_FBAI(
				long fireBrigadeApplicationId)
			throws com.nbp.fire.brigade.application.form.service.exception.
				NoSuchFireBrigadeAppliCurrentStageException {

		return _fireBrigadeAppliCurrentStageLocalService.
			getFireBrigade_Stage_FBAI(fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade appli current stage with the primary key.
	 *
	 * @param fireBrigadeAppliCurrentStageId the primary key of the fire brigade appli current stage
	 * @return the fire brigade appli current stage
	 * @throws PortalException if a fire brigade appli current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeAppliCurrentStage getFireBrigadeAppliCurrentStage(
				long fireBrigadeAppliCurrentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeAppliCurrentStageLocalService.
			getFireBrigadeAppliCurrentStage(fireBrigadeAppliCurrentStageId);
	}

	/**
	 * Returns a range of all the fire brigade appli current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade appli current stages
	 * @param end the upper bound of the range of fire brigade appli current stages (not inclusive)
	 * @return the range of fire brigade appli current stages
	 */
	@Override
	public java.util.List
		<com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeAppliCurrentStage> getFireBrigadeAppliCurrentStages(
				int start, int end) {

		return _fireBrigadeAppliCurrentStageLocalService.
			getFireBrigadeAppliCurrentStages(start, end);
	}

	/**
	 * Returns the number of fire brigade appli current stages.
	 *
	 * @return the number of fire brigade appli current stages
	 */
	@Override
	public int getFireBrigadeAppliCurrentStagesCount() {
		return _fireBrigadeAppliCurrentStageLocalService.
			getFireBrigadeAppliCurrentStagesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fireBrigadeAppliCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeAppliCurrentStageLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeAppliCurrentStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the fire brigade appli current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeAppliCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeAppliCurrentStage the fire brigade appli current stage
	 * @return the fire brigade appli current stage that was updated
	 */
	@Override
	public com.nbp.fire.brigade.application.form.service.model.
		FireBrigadeAppliCurrentStage updateFireBrigadeAppliCurrentStage(
			com.nbp.fire.brigade.application.form.service.model.
				FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage) {

		return _fireBrigadeAppliCurrentStageLocalService.
			updateFireBrigadeAppliCurrentStage(fireBrigadeAppliCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _fireBrigadeAppliCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public FireBrigadeAppliCurrentStageLocalService getWrappedService() {
		return _fireBrigadeAppliCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeAppliCurrentStageLocalService
			fireBrigadeAppliCurrentStageLocalService) {

		_fireBrigadeAppliCurrentStageLocalService =
			fireBrigadeAppliCurrentStageLocalService;
	}

	private FireBrigadeAppliCurrentStageLocalService
		_fireBrigadeAppliCurrentStageLocalService;

}