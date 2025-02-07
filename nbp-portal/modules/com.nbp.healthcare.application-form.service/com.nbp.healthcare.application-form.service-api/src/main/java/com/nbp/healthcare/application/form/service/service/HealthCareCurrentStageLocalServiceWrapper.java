/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HealthCareCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareCurrentStageLocalService
 * @generated
 */
public class HealthCareCurrentStageLocalServiceWrapper
	implements HealthCareCurrentStageLocalService,
			   ServiceWrapper<HealthCareCurrentStageLocalService> {

	public HealthCareCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public HealthCareCurrentStageLocalServiceWrapper(
		HealthCareCurrentStageLocalService healthCareCurrentStageLocalService) {

		_healthCareCurrentStageLocalService =
			healthCareCurrentStageLocalService;
	}

	/**
	 * Adds the health care current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareCurrentStage the health care current stage
	 * @return the health care current stage that was added
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.HealthCareCurrentStage
			addHealthCareCurrentStage(
				com.nbp.healthcare.application.form.service.model.
					HealthCareCurrentStage healthCareCurrentStage) {

		return _healthCareCurrentStageLocalService.addHealthCareCurrentStage(
			healthCareCurrentStage);
	}

	/**
	 * Creates a new health care current stage with the primary key. Does not add the health care current stage to the database.
	 *
	 * @param HealthCareCurrentStageId the primary key for the new health care current stage
	 * @return the new health care current stage
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.HealthCareCurrentStage
			createHealthCareCurrentStage(long HealthCareCurrentStageId) {

		return _healthCareCurrentStageLocalService.createHealthCareCurrentStage(
			HealthCareCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the health care current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareCurrentStage the health care current stage
	 * @return the health care current stage that was removed
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.HealthCareCurrentStage
			deleteHealthCareCurrentStage(
				com.nbp.healthcare.application.form.service.model.
					HealthCareCurrentStage healthCareCurrentStage) {

		return _healthCareCurrentStageLocalService.deleteHealthCareCurrentStage(
			healthCareCurrentStage);
	}

	/**
	 * Deletes the health care current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param HealthCareCurrentStageId the primary key of the health care current stage
	 * @return the health care current stage that was removed
	 * @throws PortalException if a health care current stage with the primary key could not be found
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.HealthCareCurrentStage
				deleteHealthCareCurrentStage(long HealthCareCurrentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareCurrentStageLocalService.deleteHealthCareCurrentStage(
			HealthCareCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _healthCareCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _healthCareCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _healthCareCurrentStageLocalService.dynamicQuery();
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

		return _healthCareCurrentStageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareCurrentStageModelImpl</code>.
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

		return _healthCareCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareCurrentStageModelImpl</code>.
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

		return _healthCareCurrentStageLocalService.dynamicQuery(
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

		return _healthCareCurrentStageLocalService.dynamicQueryCount(
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

		return _healthCareCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.healthcare.application.form.service.model.HealthCareCurrentStage
			fetchHealthCareCurrentStage(long HealthCareCurrentStageId) {

		return _healthCareCurrentStageLocalService.fetchHealthCareCurrentStage(
			HealthCareCurrentStageId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _healthCareCurrentStageLocalService.getActionableDynamicQuery();
	}

	@Override
	public
		com.nbp.healthcare.application.form.service.model.HealthCareCurrentStage
				getC_SById(long healthCareId)
			throws com.nbp.healthcare.application.form.service.exception.
				NoSuchHealthCareCurrentStageException {

		return _healthCareCurrentStageLocalService.getC_SById(healthCareId);
	}

	/**
	 * Returns the health care current stage with the primary key.
	 *
	 * @param HealthCareCurrentStageId the primary key of the health care current stage
	 * @return the health care current stage
	 * @throws PortalException if a health care current stage with the primary key could not be found
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.HealthCareCurrentStage
				getHealthCareCurrentStage(long HealthCareCurrentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareCurrentStageLocalService.getHealthCareCurrentStage(
			HealthCareCurrentStageId);
	}

	/**
	 * Returns a range of all the health care current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care current stages
	 * @param end the upper bound of the range of health care current stages (not inclusive)
	 * @return the range of health care current stages
	 */
	@Override
	public java.util.List
		<com.nbp.healthcare.application.form.service.model.
			HealthCareCurrentStage> getHealthCareCurrentStages(
				int start, int end) {

		return _healthCareCurrentStageLocalService.getHealthCareCurrentStages(
			start, end);
	}

	/**
	 * Returns the number of health care current stages.
	 *
	 * @return the number of health care current stages
	 */
	@Override
	public int getHealthCareCurrentStagesCount() {
		return _healthCareCurrentStageLocalService.
			getHealthCareCurrentStagesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _healthCareCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthCareCurrentStageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareCurrentStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the health care current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareCurrentStage the health care current stage
	 * @return the health care current stage that was updated
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.HealthCareCurrentStage
			updateHealthCareCurrentStage(
				com.nbp.healthcare.application.form.service.model.
					HealthCareCurrentStage healthCareCurrentStage) {

		return _healthCareCurrentStageLocalService.updateHealthCareCurrentStage(
			healthCareCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _healthCareCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public HealthCareCurrentStageLocalService getWrappedService() {
		return _healthCareCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		HealthCareCurrentStageLocalService healthCareCurrentStageLocalService) {

		_healthCareCurrentStageLocalService =
			healthCareCurrentStageLocalService;
	}

	private HealthCareCurrentStageLocalService
		_healthCareCurrentStageLocalService;

}