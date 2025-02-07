/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCurrentStageLocalService
 * @generated
 */
public class NcbjCurrentStageLocalServiceWrapper
	implements NcbjCurrentStageLocalService,
			   ServiceWrapper<NcbjCurrentStageLocalService> {

	public NcbjCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public NcbjCurrentStageLocalServiceWrapper(
		NcbjCurrentStageLocalService ncbjCurrentStageLocalService) {

		_ncbjCurrentStageLocalService = ncbjCurrentStageLocalService;
	}

	/**
	 * Adds the ncbj current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCurrentStage the ncbj current stage
	 * @return the ncbj current stage that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCurrentStage
		addNcbjCurrentStage(
			com.nbp.ncbj.application.form.service.model.NcbjCurrentStage
				ncbjCurrentStage) {

		return _ncbjCurrentStageLocalService.addNcbjCurrentStage(
			ncbjCurrentStage);
	}

	/**
	 * Creates a new ncbj current stage with the primary key. Does not add the ncbj current stage to the database.
	 *
	 * @param ncbjCurrentStageId the primary key for the new ncbj current stage
	 * @return the new ncbj current stage
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCurrentStage
		createNcbjCurrentStage(long ncbjCurrentStageId) {

		return _ncbjCurrentStageLocalService.createNcbjCurrentStage(
			ncbjCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncbj current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCurrentStageId the primary key of the ncbj current stage
	 * @return the ncbj current stage that was removed
	 * @throws PortalException if a ncbj current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCurrentStage
			deleteNcbjCurrentStage(long ncbjCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCurrentStageLocalService.deleteNcbjCurrentStage(
			ncbjCurrentStageId);
	}

	/**
	 * Deletes the ncbj current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCurrentStage the ncbj current stage
	 * @return the ncbj current stage that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCurrentStage
		deleteNcbjCurrentStage(
			com.nbp.ncbj.application.form.service.model.NcbjCurrentStage
				ncbjCurrentStage) {

		return _ncbjCurrentStageLocalService.deleteNcbjCurrentStage(
			ncbjCurrentStage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjCurrentStageLocalService.dynamicQuery();
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

		return _ncbjCurrentStageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCurrentStageModelImpl</code>.
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

		return _ncbjCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCurrentStageModelImpl</code>.
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

		return _ncbjCurrentStageLocalService.dynamicQuery(
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

		return _ncbjCurrentStageLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ncbjCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCurrentStage
		fetchNcbjCurrentStage(long ncbjCurrentStageId) {

		return _ncbjCurrentStageLocalService.fetchNcbjCurrentStage(
			ncbjCurrentStageId);
	}

	/**
	 * Returns the ncbj current stage matching the UUID and group.
	 *
	 * @param uuid the ncbj current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCurrentStage
		fetchNcbjCurrentStageByUuidAndGroupId(String uuid, long groupId) {

		return _ncbjCurrentStageLocalService.
			fetchNcbjCurrentStageByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjCurrentStageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCurrentStage
			getByNcbj_Stage(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCurrentStageException {

		return _ncbjCurrentStageLocalService.getByNcbj_Stage(ncbjApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _ncbjCurrentStageLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the ncbj current stage with the primary key.
	 *
	 * @param ncbjCurrentStageId the primary key of the ncbj current stage
	 * @return the ncbj current stage
	 * @throws PortalException if a ncbj current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCurrentStage
			getNcbjCurrentStage(long ncbjCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCurrentStageLocalService.getNcbjCurrentStage(
			ncbjCurrentStageId);
	}

	/**
	 * Returns the ncbj current stage matching the UUID and group.
	 *
	 * @param uuid the ncbj current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncbj current stage
	 * @throws PortalException if a matching ncbj current stage could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCurrentStage
			getNcbjCurrentStageByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCurrentStageLocalService.
			getNcbjCurrentStageByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the ncbj current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @return the range of ncbj current stages
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjCurrentStage>
			getNcbjCurrentStages(int start, int end) {

		return _ncbjCurrentStageLocalService.getNcbjCurrentStages(start, end);
	}

	/**
	 * Returns all the ncbj current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the ncbj current stages
	 * @param companyId the primary key of the company
	 * @return the matching ncbj current stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjCurrentStage>
			getNcbjCurrentStagesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _ncbjCurrentStageLocalService.
			getNcbjCurrentStagesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of ncbj current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the ncbj current stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching ncbj current stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjCurrentStage>
			getNcbjCurrentStagesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.ncbj.application.form.service.model.
						NcbjCurrentStage> orderByComparator) {

		return _ncbjCurrentStageLocalService.
			getNcbjCurrentStagesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of ncbj current stages.
	 *
	 * @return the number of ncbj current stages
	 */
	@Override
	public int getNcbjCurrentStagesCount() {
		return _ncbjCurrentStageLocalService.getNcbjCurrentStagesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjCurrentStageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCurrentStageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ncbj current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCurrentStage the ncbj current stage
	 * @return the ncbj current stage that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCurrentStage
		updateNcbjCurrentStage(
			com.nbp.ncbj.application.form.service.model.NcbjCurrentStage
				ncbjCurrentStage) {

		return _ncbjCurrentStageLocalService.updateNcbjCurrentStage(
			ncbjCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public NcbjCurrentStageLocalService getWrappedService() {
		return _ncbjCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjCurrentStageLocalService ncbjCurrentStageLocalService) {

		_ncbjCurrentStageLocalService = ncbjCurrentStageLocalService;
	}

	private NcbjCurrentStageLocalService _ncbjCurrentStageLocalService;

}