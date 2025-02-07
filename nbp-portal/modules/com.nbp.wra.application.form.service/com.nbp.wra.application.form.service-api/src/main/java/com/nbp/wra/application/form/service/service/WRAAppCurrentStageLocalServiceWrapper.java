/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link WRAAppCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see WRAAppCurrentStageLocalService
 * @generated
 */
public class WRAAppCurrentStageLocalServiceWrapper
	implements ServiceWrapper<WRAAppCurrentStageLocalService>,
			   WRAAppCurrentStageLocalService {

	public WRAAppCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public WRAAppCurrentStageLocalServiceWrapper(
		WRAAppCurrentStageLocalService wraAppCurrentStageLocalService) {

		_wraAppCurrentStageLocalService = wraAppCurrentStageLocalService;
	}

	/**
	 * Adds the wra app current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAAppCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraAppCurrentStage the wra app current stage
	 * @return the wra app current stage that was added
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAAppCurrentStage
		addWRAAppCurrentStage(
			com.nbp.wra.application.form.service.model.WRAAppCurrentStage
				wraAppCurrentStage) {

		return _wraAppCurrentStageLocalService.addWRAAppCurrentStage(
			wraAppCurrentStage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraAppCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new wra app current stage with the primary key. Does not add the wra app current stage to the database.
	 *
	 * @param wraAppCurrentStageId the primary key for the new wra app current stage
	 * @return the new wra app current stage
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAAppCurrentStage
		createWRAAppCurrentStage(long wraAppCurrentStageId) {

		return _wraAppCurrentStageLocalService.createWRAAppCurrentStage(
			wraAppCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraAppCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the wra app current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAAppCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraAppCurrentStageId the primary key of the wra app current stage
	 * @return the wra app current stage that was removed
	 * @throws PortalException if a wra app current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAAppCurrentStage
			deleteWRAAppCurrentStage(long wraAppCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraAppCurrentStageLocalService.deleteWRAAppCurrentStage(
			wraAppCurrentStageId);
	}

	/**
	 * Deletes the wra app current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAAppCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraAppCurrentStage the wra app current stage
	 * @return the wra app current stage that was removed
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAAppCurrentStage
		deleteWRAAppCurrentStage(
			com.nbp.wra.application.form.service.model.WRAAppCurrentStage
				wraAppCurrentStage) {

		return _wraAppCurrentStageLocalService.deleteWRAAppCurrentStage(
			wraAppCurrentStage);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _wraAppCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _wraAppCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _wraAppCurrentStageLocalService.dynamicQuery();
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

		return _wraAppCurrentStageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.WRAAppCurrentStageModelImpl</code>.
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

		return _wraAppCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.WRAAppCurrentStageModelImpl</code>.
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

		return _wraAppCurrentStageLocalService.dynamicQuery(
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

		return _wraAppCurrentStageLocalService.dynamicQueryCount(dynamicQuery);
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

		return _wraAppCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.wra.application.form.service.model.WRAAppCurrentStage
		fetchWRAAppCurrentStage(long wraAppCurrentStageId) {

		return _wraAppCurrentStageLocalService.fetchWRAAppCurrentStage(
			wraAppCurrentStageId);
	}

	/**
	 * Returns the wra app current stage matching the UUID and group.
	 *
	 * @param uuid the wra app current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAAppCurrentStage
		fetchWRAAppCurrentStageByUuidAndGroupId(String uuid, long groupId) {

		return _wraAppCurrentStageLocalService.
			fetchWRAAppCurrentStageByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _wraAppCurrentStageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.wra.application.form.service.model.WRAAppCurrentStage
			getByWRA_Stage(long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAAppCurrentStageException {

		return _wraAppCurrentStageLocalService.getByWRA_Stage(wraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _wraAppCurrentStageLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _wraAppCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _wraAppCurrentStageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraAppCurrentStageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the wra app current stage with the primary key.
	 *
	 * @param wraAppCurrentStageId the primary key of the wra app current stage
	 * @return the wra app current stage
	 * @throws PortalException if a wra app current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAAppCurrentStage
			getWRAAppCurrentStage(long wraAppCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraAppCurrentStageLocalService.getWRAAppCurrentStage(
			wraAppCurrentStageId);
	}

	/**
	 * Returns the wra app current stage matching the UUID and group.
	 *
	 * @param uuid the wra app current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching wra app current stage
	 * @throws PortalException if a matching wra app current stage could not be found
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAAppCurrentStage
			getWRAAppCurrentStageByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraAppCurrentStageLocalService.
			getWRAAppCurrentStageByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the wra app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @return the range of wra app current stages
	 */
	@Override
	public java.util.List
		<com.nbp.wra.application.form.service.model.WRAAppCurrentStage>
			getWRAAppCurrentStages(int start, int end) {

		return _wraAppCurrentStageLocalService.getWRAAppCurrentStages(
			start, end);
	}

	/**
	 * Returns all the wra app current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the wra app current stages
	 * @param companyId the primary key of the company
	 * @return the matching wra app current stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.wra.application.form.service.model.WRAAppCurrentStage>
			getWRAAppCurrentStagesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _wraAppCurrentStageLocalService.
			getWRAAppCurrentStagesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of wra app current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the wra app current stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching wra app current stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.wra.application.form.service.model.WRAAppCurrentStage>
			getWRAAppCurrentStagesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.wra.application.form.service.model.
						WRAAppCurrentStage> orderByComparator) {

		return _wraAppCurrentStageLocalService.
			getWRAAppCurrentStagesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of wra app current stages.
	 *
	 * @return the number of wra app current stages
	 */
	@Override
	public int getWRAAppCurrentStagesCount() {
		return _wraAppCurrentStageLocalService.getWRAAppCurrentStagesCount();
	}

	/**
	 * Updates the wra app current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAAppCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraAppCurrentStage the wra app current stage
	 * @return the wra app current stage that was updated
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAAppCurrentStage
		updateWRAAppCurrentStage(
			com.nbp.wra.application.form.service.model.WRAAppCurrentStage
				wraAppCurrentStage) {

		return _wraAppCurrentStageLocalService.updateWRAAppCurrentStage(
			wraAppCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _wraAppCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public WRAAppCurrentStageLocalService getWrappedService() {
		return _wraAppCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		WRAAppCurrentStageLocalService wraAppCurrentStageLocalService) {

		_wraAppCurrentStageLocalService = wraAppCurrentStageLocalService;
	}

	private WRAAppCurrentStageLocalService _wraAppCurrentStageLocalService;

}