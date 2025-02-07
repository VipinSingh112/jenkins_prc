/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AgriApplicationCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgriApplicationCurrentStageLocalService
 * @generated
 */
public class AgriApplicationCurrentStageLocalServiceWrapper
	implements AgriApplicationCurrentStageLocalService,
			   ServiceWrapper<AgriApplicationCurrentStageLocalService> {

	public AgriApplicationCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public AgriApplicationCurrentStageLocalServiceWrapper(
		AgriApplicationCurrentStageLocalService
			agriApplicationCurrentStageLocalService) {

		_agriApplicationCurrentStageLocalService =
			agriApplicationCurrentStageLocalService;
	}

	/**
	 * Adds the agri application current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriApplicationCurrentStage the agri application current stage
	 * @return the agri application current stage that was added
	 */
	@Override
	public
		com.agriculture.application.form.service.model.
			AgriApplicationCurrentStage addAgriApplicationCurrentStage(
				com.agriculture.application.form.service.model.
					AgriApplicationCurrentStage agriApplicationCurrentStage) {

		return _agriApplicationCurrentStageLocalService.
			addAgriApplicationCurrentStage(agriApplicationCurrentStage);
	}

	/**
	 * Creates a new agri application current stage with the primary key. Does not add the agri application current stage to the database.
	 *
	 * @param agriApplicationCurrentStageId the primary key for the new agri application current stage
	 * @return the new agri application current stage
	 */
	@Override
	public
		com.agriculture.application.form.service.model.
			AgriApplicationCurrentStage createAgriApplicationCurrentStage(
				long agriApplicationCurrentStageId) {

		return _agriApplicationCurrentStageLocalService.
			createAgriApplicationCurrentStage(agriApplicationCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriApplicationCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the agri application current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriApplicationCurrentStage the agri application current stage
	 * @return the agri application current stage that was removed
	 */
	@Override
	public
		com.agriculture.application.form.service.model.
			AgriApplicationCurrentStage deleteAgriApplicationCurrentStage(
				com.agriculture.application.form.service.model.
					AgriApplicationCurrentStage agriApplicationCurrentStage) {

		return _agriApplicationCurrentStageLocalService.
			deleteAgriApplicationCurrentStage(agriApplicationCurrentStage);
	}

	/**
	 * Deletes the agri application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriApplicationCurrentStageId the primary key of the agri application current stage
	 * @return the agri application current stage that was removed
	 * @throws PortalException if a agri application current stage with the primary key could not be found
	 */
	@Override
	public
		com.agriculture.application.form.service.model.
			AgriApplicationCurrentStage deleteAgriApplicationCurrentStage(
					long agriApplicationCurrentStageId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _agriApplicationCurrentStageLocalService.
			deleteAgriApplicationCurrentStage(agriApplicationCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriApplicationCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _agriApplicationCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _agriApplicationCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _agriApplicationCurrentStageLocalService.dynamicQuery();
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

		return _agriApplicationCurrentStageLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgriApplicationCurrentStageModelImpl</code>.
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

		return _agriApplicationCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgriApplicationCurrentStageModelImpl</code>.
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

		return _agriApplicationCurrentStageLocalService.dynamicQuery(
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

		return _agriApplicationCurrentStageLocalService.dynamicQueryCount(
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

		return _agriApplicationCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.agriculture.application.form.service.model.
			AgriApplicationCurrentStage fetchAgriApplicationCurrentStage(
				long agriApplicationCurrentStageId) {

		return _agriApplicationCurrentStageLocalService.
			fetchAgriApplicationCurrentStage(agriApplicationCurrentStageId);
	}

	@Override
	public
		com.agriculture.application.form.service.model.
			AgriApplicationCurrentStage getAA_Stage_AAI(
					long agricultureApplicationId)
				throws com.agriculture.application.form.service.exception.
					NoSuchAgriApplicationCurrentStageException {

		return _agriApplicationCurrentStageLocalService.getAA_Stage_AAI(
			agricultureApplicationId);
	}

	@Override
	public
		com.agriculture.application.form.service.model.
			AgriApplicationCurrentStage getAA_stage_AAI(
					long agricultureApplicationId)
				throws com.agriculture.application.form.service.exception.
					NoSuchAgriApplicationCurrentStageException {

		return _agriApplicationCurrentStageLocalService.getAA_stage_AAI(
			agricultureApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _agriApplicationCurrentStageLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the agri application current stage with the primary key.
	 *
	 * @param agriApplicationCurrentStageId the primary key of the agri application current stage
	 * @return the agri application current stage
	 * @throws PortalException if a agri application current stage with the primary key could not be found
	 */
	@Override
	public
		com.agriculture.application.form.service.model.
			AgriApplicationCurrentStage getAgriApplicationCurrentStage(
					long agriApplicationCurrentStageId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _agriApplicationCurrentStageLocalService.
			getAgriApplicationCurrentStage(agriApplicationCurrentStageId);
	}

	/**
	 * Returns a range of all the agri application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgriApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agri application current stages
	 * @param end the upper bound of the range of agri application current stages (not inclusive)
	 * @return the range of agri application current stages
	 */
	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.
			AgriApplicationCurrentStage> getAgriApplicationCurrentStages(
				int start, int end) {

		return _agriApplicationCurrentStageLocalService.
			getAgriApplicationCurrentStages(start, end);
	}

	/**
	 * Returns the number of agri application current stages.
	 *
	 * @return the number of agri application current stages
	 */
	@Override
	public int getAgriApplicationCurrentStagesCount() {
		return _agriApplicationCurrentStageLocalService.
			getAgriApplicationCurrentStagesCount();
	}

	@Override
	public
		com.agriculture.application.form.service.model.
			AgriApplicationCurrentStage getAgricultureById(
					long agricultureApplicationId)
				throws com.agriculture.application.form.service.exception.
					NoSuchAgriApplicationCurrentStageException {

		return _agriApplicationCurrentStageLocalService.getAgricultureById(
			agricultureApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _agriApplicationCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agriApplicationCurrentStageLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriApplicationCurrentStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the agri application current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriApplicationCurrentStage the agri application current stage
	 * @return the agri application current stage that was updated
	 */
	@Override
	public
		com.agriculture.application.form.service.model.
			AgriApplicationCurrentStage updateAgriApplicationCurrentStage(
				com.agriculture.application.form.service.model.
					AgriApplicationCurrentStage agriApplicationCurrentStage) {

		return _agriApplicationCurrentStageLocalService.
			updateAgriApplicationCurrentStage(agriApplicationCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _agriApplicationCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public AgriApplicationCurrentStageLocalService getWrappedService() {
		return _agriApplicationCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		AgriApplicationCurrentStageLocalService
			agriApplicationCurrentStageLocalService) {

		_agriApplicationCurrentStageLocalService =
			agriApplicationCurrentStageLocalService;
	}

	private AgriApplicationCurrentStageLocalService
		_agriApplicationCurrentStageLocalService;

}