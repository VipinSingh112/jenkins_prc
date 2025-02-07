/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CreativeApplicationCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeApplicationCurrentStageLocalService
 * @generated
 */
public class CreativeApplicationCurrentStageLocalServiceWrapper
	implements CreativeApplicationCurrentStageLocalService,
			   ServiceWrapper<CreativeApplicationCurrentStageLocalService> {

	public CreativeApplicationCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public CreativeApplicationCurrentStageLocalServiceWrapper(
		CreativeApplicationCurrentStageLocalService
			creativeApplicationCurrentStageLocalService) {

		_creativeApplicationCurrentStageLocalService =
			creativeApplicationCurrentStageLocalService;
	}

	/**
	 * Adds the creative application current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeApplicationCurrentStage the creative application current stage
	 * @return the creative application current stage that was added
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeApplicationCurrentStage addCreativeApplicationCurrentStage(
			com.nbp.creative.application.form.service.model.
				CreativeApplicationCurrentStage
					creativeApplicationCurrentStage) {

		return _creativeApplicationCurrentStageLocalService.
			addCreativeApplicationCurrentStage(creativeApplicationCurrentStage);
	}

	/**
	 * Creates a new creative application current stage with the primary key. Does not add the creative application current stage to the database.
	 *
	 * @param creativeAppliCurrentStageId the primary key for the new creative application current stage
	 * @return the new creative application current stage
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeApplicationCurrentStage createCreativeApplicationCurrentStage(
			long creativeAppliCurrentStageId) {

		return _creativeApplicationCurrentStageLocalService.
			createCreativeApplicationCurrentStage(creativeAppliCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeApplicationCurrentStageLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the creative application current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeApplicationCurrentStage the creative application current stage
	 * @return the creative application current stage that was removed
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeApplicationCurrentStage deleteCreativeApplicationCurrentStage(
			com.nbp.creative.application.form.service.model.
				CreativeApplicationCurrentStage
					creativeApplicationCurrentStage) {

		return _creativeApplicationCurrentStageLocalService.
			deleteCreativeApplicationCurrentStage(
				creativeApplicationCurrentStage);
	}

	/**
	 * Deletes the creative application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeAppliCurrentStageId the primary key of the creative application current stage
	 * @return the creative application current stage that was removed
	 * @throws PortalException if a creative application current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeApplicationCurrentStage deleteCreativeApplicationCurrentStage(
				long creativeAppliCurrentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeApplicationCurrentStageLocalService.
			deleteCreativeApplicationCurrentStage(creativeAppliCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeApplicationCurrentStageLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _creativeApplicationCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _creativeApplicationCurrentStageLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _creativeApplicationCurrentStageLocalService.dynamicQuery();
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

		return _creativeApplicationCurrentStageLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeApplicationCurrentStageModelImpl</code>.
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

		return _creativeApplicationCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeApplicationCurrentStageModelImpl</code>.
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

		return _creativeApplicationCurrentStageLocalService.dynamicQuery(
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

		return _creativeApplicationCurrentStageLocalService.dynamicQueryCount(
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

		return _creativeApplicationCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeApplicationCurrentStage fetchBygetCA_Stage_CAI(
			long crativeApplicationId) {

		return _creativeApplicationCurrentStageLocalService.
			fetchBygetCA_Stage_CAI(crativeApplicationId);
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeApplicationCurrentStage fetchCreativeApplicationCurrentStage(
			long creativeAppliCurrentStageId) {

		return _creativeApplicationCurrentStageLocalService.
			fetchCreativeApplicationCurrentStage(creativeAppliCurrentStageId);
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeApplicationCurrentStage findBygetCreativeById(
			long creativeApplicationId) {

		return _creativeApplicationCurrentStageLocalService.
			findBygetCreativeById(creativeApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _creativeApplicationCurrentStageLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the creative application current stage with the primary key.
	 *
	 * @param creativeAppliCurrentStageId the primary key of the creative application current stage
	 * @return the creative application current stage
	 * @throws PortalException if a creative application current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeApplicationCurrentStage getCreativeApplicationCurrentStage(
				long creativeAppliCurrentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeApplicationCurrentStageLocalService.
			getCreativeApplicationCurrentStage(creativeAppliCurrentStageId);
	}

	/**
	 * Returns a range of all the creative application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application current stages
	 * @param end the upper bound of the range of creative application current stages (not inclusive)
	 * @return the range of creative application current stages
	 */
	@Override
	public java.util.List
		<com.nbp.creative.application.form.service.model.
			CreativeApplicationCurrentStage>
				getCreativeApplicationCurrentStages(int start, int end) {

		return _creativeApplicationCurrentStageLocalService.
			getCreativeApplicationCurrentStages(start, end);
	}

	/**
	 * Returns the number of creative application current stages.
	 *
	 * @return the number of creative application current stages
	 */
	@Override
	public int getCreativeApplicationCurrentStagesCount() {
		return _creativeApplicationCurrentStageLocalService.
			getCreativeApplicationCurrentStagesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _creativeApplicationCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeApplicationCurrentStageLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeApplicationCurrentStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the creative application current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeApplicationCurrentStage the creative application current stage
	 * @return the creative application current stage that was updated
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeApplicationCurrentStage updateCreativeApplicationCurrentStage(
			com.nbp.creative.application.form.service.model.
				CreativeApplicationCurrentStage
					creativeApplicationCurrentStage) {

		return _creativeApplicationCurrentStageLocalService.
			updateCreativeApplicationCurrentStage(
				creativeApplicationCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _creativeApplicationCurrentStageLocalService.
			getBasePersistence();
	}

	@Override
	public CreativeApplicationCurrentStageLocalService getWrappedService() {
		return _creativeApplicationCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		CreativeApplicationCurrentStageLocalService
			creativeApplicationCurrentStageLocalService) {

		_creativeApplicationCurrentStageLocalService =
			creativeApplicationCurrentStageLocalService;
	}

	private CreativeApplicationCurrentStageLocalService
		_creativeApplicationCurrentStageLocalService;

}