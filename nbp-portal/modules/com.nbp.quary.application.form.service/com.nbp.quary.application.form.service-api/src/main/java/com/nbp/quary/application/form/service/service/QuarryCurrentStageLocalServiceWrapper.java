/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QuarryCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryCurrentStageLocalService
 * @generated
 */
public class QuarryCurrentStageLocalServiceWrapper
	implements QuarryCurrentStageLocalService,
			   ServiceWrapper<QuarryCurrentStageLocalService> {

	public QuarryCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public QuarryCurrentStageLocalServiceWrapper(
		QuarryCurrentStageLocalService quarryCurrentStageLocalService) {

		_quarryCurrentStageLocalService = quarryCurrentStageLocalService;
	}

	/**
	 * Adds the quarry current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryCurrentStage the quarry current stage
	 * @return the quarry current stage that was added
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryCurrentStage
		addQuarryCurrentStage(
			com.nbp.quary.application.form.service.model.QuarryCurrentStage
				quarryCurrentStage) {

		return _quarryCurrentStageLocalService.addQuarryCurrentStage(
			quarryCurrentStage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new quarry current stage with the primary key. Does not add the quarry current stage to the database.
	 *
	 * @param auarryStageId the primary key for the new quarry current stage
	 * @return the new quarry current stage
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryCurrentStage
		createQuarryCurrentStage(long auarryStageId) {

		return _quarryCurrentStageLocalService.createQuarryCurrentStage(
			auarryStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the quarry current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param auarryStageId the primary key of the quarry current stage
	 * @return the quarry current stage that was removed
	 * @throws PortalException if a quarry current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryCurrentStage
			deleteQuarryCurrentStage(long auarryStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryCurrentStageLocalService.deleteQuarryCurrentStage(
			auarryStageId);
	}

	/**
	 * Deletes the quarry current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryCurrentStage the quarry current stage
	 * @return the quarry current stage that was removed
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryCurrentStage
		deleteQuarryCurrentStage(
			com.nbp.quary.application.form.service.model.QuarryCurrentStage
				quarryCurrentStage) {

		return _quarryCurrentStageLocalService.deleteQuarryCurrentStage(
			quarryCurrentStage);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _quarryCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _quarryCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _quarryCurrentStageLocalService.dynamicQuery();
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

		return _quarryCurrentStageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryCurrentStageModelImpl</code>.
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

		return _quarryCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryCurrentStageModelImpl</code>.
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

		return _quarryCurrentStageLocalService.dynamicQuery(
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

		return _quarryCurrentStageLocalService.dynamicQueryCount(dynamicQuery);
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

		return _quarryCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.quary.application.form.service.model.QuarryCurrentStage
		fetchQuarryCurrentStage(long auarryStageId) {

		return _quarryCurrentStageLocalService.fetchQuarryCurrentStage(
			auarryStageId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _quarryCurrentStageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _quarryCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryCurrentStageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryCurrentStageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the quarry current stage with the primary key.
	 *
	 * @param auarryStageId the primary key of the quarry current stage
	 * @return the quarry current stage
	 * @throws PortalException if a quarry current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryCurrentStage
			getQuarryCurrentStage(long auarryStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryCurrentStageLocalService.getQuarryCurrentStage(
			auarryStageId);
	}

	@Override
	public com.nbp.quary.application.form.service.model.QuarryCurrentStage
			getQuarryCurrentStageBy_Id(long quarryApplicationId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryCurrentStageException {

		return _quarryCurrentStageLocalService.getQuarryCurrentStageBy_Id(
			quarryApplicationId);
	}

	/**
	 * Returns a range of all the quarry current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry current stages
	 * @param end the upper bound of the range of quarry current stages (not inclusive)
	 * @return the range of quarry current stages
	 */
	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.QuarryCurrentStage>
			getQuarryCurrentStages(int start, int end) {

		return _quarryCurrentStageLocalService.getQuarryCurrentStages(
			start, end);
	}

	/**
	 * Returns the number of quarry current stages.
	 *
	 * @return the number of quarry current stages
	 */
	@Override
	public int getQuarryCurrentStagesCount() {
		return _quarryCurrentStageLocalService.getQuarryCurrentStagesCount();
	}

	/**
	 * Updates the quarry current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryCurrentStage the quarry current stage
	 * @return the quarry current stage that was updated
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryCurrentStage
		updateQuarryCurrentStage(
			com.nbp.quary.application.form.service.model.QuarryCurrentStage
				quarryCurrentStage) {

		return _quarryCurrentStageLocalService.updateQuarryCurrentStage(
			quarryCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _quarryCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public QuarryCurrentStageLocalService getWrappedService() {
		return _quarryCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		QuarryCurrentStageLocalService quarryCurrentStageLocalService) {

		_quarryCurrentStageLocalService = quarryCurrentStageLocalService;
	}

	private QuarryCurrentStageLocalService _quarryCurrentStageLocalService;

}