/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisApplicationCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCurrentStageLocalService
 * @generated
 */
public class CannabisApplicationCurrentStageLocalServiceWrapper
	implements CannabisApplicationCurrentStageLocalService,
			   ServiceWrapper<CannabisApplicationCurrentStageLocalService> {

	public CannabisApplicationCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public CannabisApplicationCurrentStageLocalServiceWrapper(
		CannabisApplicationCurrentStageLocalService
			cannabisApplicationCurrentStageLocalService) {

		_cannabisApplicationCurrentStageLocalService =
			cannabisApplicationCurrentStageLocalService;
	}

	/**
	 * Adds the cannabis application current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationCurrentStage the cannabis application current stage
	 * @return the cannabis application current stage that was added
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCurrentStage addCannabisApplicationCurrentStage(
			com.nbp.cannabis.application.form.services.model.
				CannabisApplicationCurrentStage
					cannabisApplicationCurrentStage) {

		return _cannabisApplicationCurrentStageLocalService.
			addCannabisApplicationCurrentStage(cannabisApplicationCurrentStage);
	}

	/**
	 * Creates a new cannabis application current stage with the primary key. Does not add the cannabis application current stage to the database.
	 *
	 * @param cannabisStageId the primary key for the new cannabis application current stage
	 * @return the new cannabis application current stage
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCurrentStage createCannabisApplicationCurrentStage(
			long cannabisStageId) {

		return _cannabisApplicationCurrentStageLocalService.
			createCannabisApplicationCurrentStage(cannabisStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCurrentStageLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the cannabis application current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationCurrentStage the cannabis application current stage
	 * @return the cannabis application current stage that was removed
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCurrentStage deleteCannabisApplicationCurrentStage(
			com.nbp.cannabis.application.form.services.model.
				CannabisApplicationCurrentStage
					cannabisApplicationCurrentStage) {

		return _cannabisApplicationCurrentStageLocalService.
			deleteCannabisApplicationCurrentStage(
				cannabisApplicationCurrentStage);
	}

	/**
	 * Deletes the cannabis application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisStageId the primary key of the cannabis application current stage
	 * @return the cannabis application current stage that was removed
	 * @throws PortalException if a cannabis application current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCurrentStage deleteCannabisApplicationCurrentStage(
				long cannabisStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCurrentStageLocalService.
			deleteCannabisApplicationCurrentStage(cannabisStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCurrentStageLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisApplicationCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisApplicationCurrentStageLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisApplicationCurrentStageLocalService.dynamicQuery();
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

		return _cannabisApplicationCurrentStageLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCurrentStageModelImpl</code>.
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

		return _cannabisApplicationCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCurrentStageModelImpl</code>.
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

		return _cannabisApplicationCurrentStageLocalService.dynamicQuery(
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

		return _cannabisApplicationCurrentStageLocalService.dynamicQueryCount(
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

		return _cannabisApplicationCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCurrentStage fetchCannabisApplicationCurrentStage(
			long cannabisStageId) {

		return _cannabisApplicationCurrentStageLocalService.
			fetchCannabisApplicationCurrentStage(cannabisStageId);
	}

	/**
	 * Returns the cannabis application current stage matching the UUID and group.
	 *
	 * @param uuid the cannabis application current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCurrentStage
			fetchCannabisApplicationCurrentStageByUuidAndGroupId(
				String uuid, long groupId) {

		return _cannabisApplicationCurrentStageLocalService.
			fetchCannabisApplicationCurrentStageByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisApplicationCurrentStageLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCurrentStage getCA_Stage_CAI(
				long cannabisApplicationId)
			throws com.nbp.cannabis.application.form.services.exception.
				NoSuchCannabisApplicationCurrentStageException {

		return _cannabisApplicationCurrentStageLocalService.getCA_Stage_CAI(
			cannabisApplicationId);
	}

	/**
	 * Returns the cannabis application current stage with the primary key.
	 *
	 * @param cannabisStageId the primary key of the cannabis application current stage
	 * @return the cannabis application current stage
	 * @throws PortalException if a cannabis application current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCurrentStage getCannabisApplicationCurrentStage(
				long cannabisStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCurrentStageLocalService.
			getCannabisApplicationCurrentStage(cannabisStageId);
	}

	/**
	 * Returns the cannabis application current stage matching the UUID and group.
	 *
	 * @param uuid the cannabis application current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application current stage
	 * @throws PortalException if a matching cannabis application current stage could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCurrentStage
				getCannabisApplicationCurrentStageByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCurrentStageLocalService.
			getCannabisApplicationCurrentStageByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the cannabis application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @return the range of cannabis application current stages
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisApplicationCurrentStage>
				getCannabisApplicationCurrentStages(int start, int end) {

		return _cannabisApplicationCurrentStageLocalService.
			getCannabisApplicationCurrentStages(start, end);
	}

	/**
	 * Returns all the cannabis application current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application current stages
	 * @param companyId the primary key of the company
	 * @return the matching cannabis application current stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisApplicationCurrentStage>
				getCannabisApplicationCurrentStagesByUuidAndCompanyId(
					String uuid, long companyId) {

		return _cannabisApplicationCurrentStageLocalService.
			getCannabisApplicationCurrentStagesByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of cannabis application current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application current stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis application current stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisApplicationCurrentStage>
				getCannabisApplicationCurrentStagesByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.cannabis.application.form.services.model.
							CannabisApplicationCurrentStage>
								orderByComparator) {

		return _cannabisApplicationCurrentStageLocalService.
			getCannabisApplicationCurrentStagesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of cannabis application current stages.
	 *
	 * @return the number of cannabis application current stages
	 */
	@Override
	public int getCannabisApplicationCurrentStagesCount() {
		return _cannabisApplicationCurrentStageLocalService.
			getCannabisApplicationCurrentStagesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _cannabisApplicationCurrentStageLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisApplicationCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationCurrentStageLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCurrentStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the cannabis application current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationCurrentStage the cannabis application current stage
	 * @return the cannabis application current stage that was updated
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCurrentStage updateCannabisApplicationCurrentStage(
			com.nbp.cannabis.application.form.services.model.
				CannabisApplicationCurrentStage
					cannabisApplicationCurrentStage) {

		return _cannabisApplicationCurrentStageLocalService.
			updateCannabisApplicationCurrentStage(
				cannabisApplicationCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisApplicationCurrentStageLocalService.
			getBasePersistence();
	}

	@Override
	public CannabisApplicationCurrentStageLocalService getWrappedService() {
		return _cannabisApplicationCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationCurrentStageLocalService
			cannabisApplicationCurrentStageLocalService) {

		_cannabisApplicationCurrentStageLocalService =
			cannabisApplicationCurrentStageLocalService;
	}

	private CannabisApplicationCurrentStageLocalService
		_cannabisApplicationCurrentStageLocalService;

}