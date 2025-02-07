/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ExplosivesCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosivesCurrentStageLocalService
 * @generated
 */
public class ExplosivesCurrentStageLocalServiceWrapper
	implements ExplosivesCurrentStageLocalService,
			   ServiceWrapper<ExplosivesCurrentStageLocalService> {

	public ExplosivesCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public ExplosivesCurrentStageLocalServiceWrapper(
		ExplosivesCurrentStageLocalService explosivesCurrentStageLocalService) {

		_explosivesCurrentStageLocalService =
			explosivesCurrentStageLocalService;
	}

	/**
	 * Adds the explosives current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosivesCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosivesCurrentStage the explosives current stage
	 * @return the explosives current stage that was added
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosivesCurrentStage addExplosivesCurrentStage(
			com.nbp.explosives.competency.application.form.service.model.
				ExplosivesCurrentStage explosivesCurrentStage) {

		return _explosivesCurrentStageLocalService.addExplosivesCurrentStage(
			explosivesCurrentStage);
	}

	/**
	 * Creates a new explosives current stage with the primary key. Does not add the explosives current stage to the database.
	 *
	 * @param explosiveStageId the primary key for the new explosives current stage
	 * @return the new explosives current stage
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosivesCurrentStage createExplosivesCurrentStage(
			long explosiveStageId) {

		return _explosivesCurrentStageLocalService.createExplosivesCurrentStage(
			explosiveStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _explosivesCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the explosives current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosivesCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosivesCurrentStage the explosives current stage
	 * @return the explosives current stage that was removed
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosivesCurrentStage deleteExplosivesCurrentStage(
			com.nbp.explosives.competency.application.form.service.model.
				ExplosivesCurrentStage explosivesCurrentStage) {

		return _explosivesCurrentStageLocalService.deleteExplosivesCurrentStage(
			explosivesCurrentStage);
	}

	/**
	 * Deletes the explosives current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosivesCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveStageId the primary key of the explosives current stage
	 * @return the explosives current stage that was removed
	 * @throws PortalException if a explosives current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosivesCurrentStage deleteExplosivesCurrentStage(
				long explosiveStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _explosivesCurrentStageLocalService.deleteExplosivesCurrentStage(
			explosiveStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _explosivesCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _explosivesCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _explosivesCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _explosivesCurrentStageLocalService.dynamicQuery();
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

		return _explosivesCurrentStageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosivesCurrentStageModelImpl</code>.
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

		return _explosivesCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosivesCurrentStageModelImpl</code>.
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

		return _explosivesCurrentStageLocalService.dynamicQuery(
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

		return _explosivesCurrentStageLocalService.dynamicQueryCount(
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

		return _explosivesCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosivesCurrentStage fetchExplosivesCurrentStage(
			long explosiveStageId) {

		return _explosivesCurrentStageLocalService.fetchExplosivesCurrentStage(
			explosiveStageId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _explosivesCurrentStageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosivesCurrentStage getByExplosive_Stage(
				long explosivesApplicationId)
			throws com.nbp.explosives.competency.application.form.service.
				exception.NoSuchExplosivesCurrentStageException {

		return _explosivesCurrentStageLocalService.getByExplosive_Stage(
			explosivesApplicationId);
	}

	/**
	 * Returns the explosives current stage with the primary key.
	 *
	 * @param explosiveStageId the primary key of the explosives current stage
	 * @return the explosives current stage
	 * @throws PortalException if a explosives current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosivesCurrentStage getExplosivesCurrentStage(long explosiveStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _explosivesCurrentStageLocalService.getExplosivesCurrentStage(
			explosiveStageId);
	}

	/**
	 * Returns a range of all the explosives current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosivesCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives current stages
	 * @param end the upper bound of the range of explosives current stages (not inclusive)
	 * @return the range of explosives current stages
	 */
	@Override
	public java.util.List
		<com.nbp.explosives.competency.application.form.service.model.
			ExplosivesCurrentStage> getExplosivesCurrentStages(
				int start, int end) {

		return _explosivesCurrentStageLocalService.getExplosivesCurrentStages(
			start, end);
	}

	/**
	 * Returns the number of explosives current stages.
	 *
	 * @return the number of explosives current stages
	 */
	@Override
	public int getExplosivesCurrentStagesCount() {
		return _explosivesCurrentStageLocalService.
			getExplosivesCurrentStagesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _explosivesCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _explosivesCurrentStageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _explosivesCurrentStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the explosives current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosivesCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosivesCurrentStage the explosives current stage
	 * @return the explosives current stage that was updated
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosivesCurrentStage updateExplosivesCurrentStage(
			com.nbp.explosives.competency.application.form.service.model.
				ExplosivesCurrentStage explosivesCurrentStage) {

		return _explosivesCurrentStageLocalService.updateExplosivesCurrentStage(
			explosivesCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _explosivesCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public ExplosivesCurrentStageLocalService getWrappedService() {
		return _explosivesCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		ExplosivesCurrentStageLocalService explosivesCurrentStageLocalService) {

		_explosivesCurrentStageLocalService =
			explosivesCurrentStageLocalService;
	}

	private ExplosivesCurrentStageLocalService
		_explosivesCurrentStageLocalService;

}