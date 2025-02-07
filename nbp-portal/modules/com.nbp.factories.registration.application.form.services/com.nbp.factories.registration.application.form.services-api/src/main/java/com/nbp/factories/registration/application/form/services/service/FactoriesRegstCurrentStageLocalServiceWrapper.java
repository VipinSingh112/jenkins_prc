/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FactoriesRegstCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesRegstCurrentStageLocalService
 * @generated
 */
public class FactoriesRegstCurrentStageLocalServiceWrapper
	implements FactoriesRegstCurrentStageLocalService,
			   ServiceWrapper<FactoriesRegstCurrentStageLocalService> {

	public FactoriesRegstCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public FactoriesRegstCurrentStageLocalServiceWrapper(
		FactoriesRegstCurrentStageLocalService
			factoriesRegstCurrentStageLocalService) {

		_factoriesRegstCurrentStageLocalService =
			factoriesRegstCurrentStageLocalService;
	}

	/**
	 * Adds the factories regst current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesRegstCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesRegstCurrentStage the factories regst current stage
	 * @return the factories regst current stage that was added
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesRegstCurrentStage addFactoriesRegstCurrentStage(
			com.nbp.factories.registration.application.form.services.model.
				FactoriesRegstCurrentStage factoriesRegstCurrentStage) {

		return _factoriesRegstCurrentStageLocalService.
			addFactoriesRegstCurrentStage(factoriesRegstCurrentStage);
	}

	/**
	 * Creates a new factories regst current stage with the primary key. Does not add the factories regst current stage to the database.
	 *
	 * @param factoriesCurrentStageId the primary key for the new factories regst current stage
	 * @return the new factories regst current stage
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesRegstCurrentStage createFactoriesRegstCurrentStage(
			long factoriesCurrentStageId) {

		return _factoriesRegstCurrentStageLocalService.
			createFactoriesRegstCurrentStage(factoriesCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesRegstCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the factories regst current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesRegstCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesRegstCurrentStage the factories regst current stage
	 * @return the factories regst current stage that was removed
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesRegstCurrentStage deleteFactoriesRegstCurrentStage(
			com.nbp.factories.registration.application.form.services.model.
				FactoriesRegstCurrentStage factoriesRegstCurrentStage) {

		return _factoriesRegstCurrentStageLocalService.
			deleteFactoriesRegstCurrentStage(factoriesRegstCurrentStage);
	}

	/**
	 * Deletes the factories regst current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesRegstCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesCurrentStageId the primary key of the factories regst current stage
	 * @return the factories regst current stage that was removed
	 * @throws PortalException if a factories regst current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesRegstCurrentStage deleteFactoriesRegstCurrentStage(
				long factoriesCurrentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesRegstCurrentStageLocalService.
			deleteFactoriesRegstCurrentStage(factoriesCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesRegstCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _factoriesRegstCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _factoriesRegstCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _factoriesRegstCurrentStageLocalService.dynamicQuery();
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

		return _factoriesRegstCurrentStageLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesRegstCurrentStageModelImpl</code>.
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

		return _factoriesRegstCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesRegstCurrentStageModelImpl</code>.
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

		return _factoriesRegstCurrentStageLocalService.dynamicQuery(
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

		return _factoriesRegstCurrentStageLocalService.dynamicQueryCount(
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

		return _factoriesRegstCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesRegstCurrentStage fetchFactoriesRegstCurrentStage(
			long factoriesCurrentStageId) {

		return _factoriesRegstCurrentStageLocalService.
			fetchFactoriesRegstCurrentStage(factoriesCurrentStageId);
	}

	/**
	 * Returns the factories regst current stage matching the UUID and group.
	 *
	 * @param uuid the factories regst current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesRegstCurrentStage
			fetchFactoriesRegstCurrentStageByUuidAndGroupId(
				String uuid, long groupId) {

		return _factoriesRegstCurrentStageLocalService.
			fetchFactoriesRegstCurrentStageByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _factoriesRegstCurrentStageLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesRegstCurrentStage getByFactories_Stage(
				long factoriesApplicationId)
			throws com.nbp.factories.registration.application.form.services.
				exception.NoSuchFactoriesRegstCurrentStageException {

		return _factoriesRegstCurrentStageLocalService.getByFactories_Stage(
			factoriesApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _factoriesRegstCurrentStageLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	/**
	 * Returns the factories regst current stage with the primary key.
	 *
	 * @param factoriesCurrentStageId the primary key of the factories regst current stage
	 * @return the factories regst current stage
	 * @throws PortalException if a factories regst current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesRegstCurrentStage getFactoriesRegstCurrentStage(
				long factoriesCurrentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesRegstCurrentStageLocalService.
			getFactoriesRegstCurrentStage(factoriesCurrentStageId);
	}

	/**
	 * Returns the factories regst current stage matching the UUID and group.
	 *
	 * @param uuid the factories regst current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching factories regst current stage
	 * @throws PortalException if a matching factories regst current stage could not be found
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesRegstCurrentStage
				getFactoriesRegstCurrentStageByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesRegstCurrentStageLocalService.
			getFactoriesRegstCurrentStageByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the factories regst current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @return the range of factories regst current stages
	 */
	@Override
	public java.util.List
		<com.nbp.factories.registration.application.form.services.model.
			FactoriesRegstCurrentStage> getFactoriesRegstCurrentStages(
				int start, int end) {

		return _factoriesRegstCurrentStageLocalService.
			getFactoriesRegstCurrentStages(start, end);
	}

	/**
	 * Returns all the factories regst current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the factories regst current stages
	 * @param companyId the primary key of the company
	 * @return the matching factories regst current stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.factories.registration.application.form.services.model.
			FactoriesRegstCurrentStage>
				getFactoriesRegstCurrentStagesByUuidAndCompanyId(
					String uuid, long companyId) {

		return _factoriesRegstCurrentStageLocalService.
			getFactoriesRegstCurrentStagesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of factories regst current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the factories regst current stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching factories regst current stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.factories.registration.application.form.services.model.
			FactoriesRegstCurrentStage>
				getFactoriesRegstCurrentStagesByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.factories.registration.application.form.
							services.model.FactoriesRegstCurrentStage>
								orderByComparator) {

		return _factoriesRegstCurrentStageLocalService.
			getFactoriesRegstCurrentStagesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of factories regst current stages.
	 *
	 * @return the number of factories regst current stages
	 */
	@Override
	public int getFactoriesRegstCurrentStagesCount() {
		return _factoriesRegstCurrentStageLocalService.
			getFactoriesRegstCurrentStagesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _factoriesRegstCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _factoriesRegstCurrentStageLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesRegstCurrentStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the factories regst current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesRegstCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesRegstCurrentStage the factories regst current stage
	 * @return the factories regst current stage that was updated
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesRegstCurrentStage updateFactoriesRegstCurrentStage(
			com.nbp.factories.registration.application.form.services.model.
				FactoriesRegstCurrentStage factoriesRegstCurrentStage) {

		return _factoriesRegstCurrentStageLocalService.
			updateFactoriesRegstCurrentStage(factoriesRegstCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _factoriesRegstCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public FactoriesRegstCurrentStageLocalService getWrappedService() {
		return _factoriesRegstCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		FactoriesRegstCurrentStageLocalService
			factoriesRegstCurrentStageLocalService) {

		_factoriesRegstCurrentStageLocalService =
			factoriesRegstCurrentStageLocalService;
	}

	private FactoriesRegstCurrentStageLocalService
		_factoriesRegstCurrentStageLocalService;

}