/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezStatusApplicationCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusApplicationCurrentStageLocalService
 * @generated
 */
public class SezStatusApplicationCurrentStageLocalServiceWrapper
	implements ServiceWrapper<SezStatusApplicationCurrentStageLocalService>,
			   SezStatusApplicationCurrentStageLocalService {

	public SezStatusApplicationCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public SezStatusApplicationCurrentStageLocalServiceWrapper(
		SezStatusApplicationCurrentStageLocalService
			sezStatusApplicationCurrentStageLocalService) {

		_sezStatusApplicationCurrentStageLocalService =
			sezStatusApplicationCurrentStageLocalService;
	}

	/**
	 * Adds the sez status application current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusApplicationCurrentStage the sez status application current stage
	 * @return the sez status application current stage that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezStatusApplicationCurrentStage addSezStatusApplicationCurrentStage(
			com.nbp.sez.status.application.form.service.model.
				SezStatusApplicationCurrentStage
					sezStatusApplicationCurrentStage) {

		return _sezStatusApplicationCurrentStageLocalService.
			addSezStatusApplicationCurrentStage(
				sezStatusApplicationCurrentStage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusApplicationCurrentStageLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new sez status application current stage with the primary key. Does not add the sez status application current stage to the database.
	 *
	 * @param sezStageId the primary key for the new sez status application current stage
	 * @return the new sez status application current stage
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezStatusApplicationCurrentStage createSezStatusApplicationCurrentStage(
			long sezStageId) {

		return _sezStatusApplicationCurrentStageLocalService.
			createSezStatusApplicationCurrentStage(sezStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusApplicationCurrentStageLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the sez status application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStageId the primary key of the sez status application current stage
	 * @return the sez status application current stage that was removed
	 * @throws PortalException if a sez status application current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezStatusApplicationCurrentStage deleteSezStatusApplicationCurrentStage(
				long sezStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusApplicationCurrentStageLocalService.
			deleteSezStatusApplicationCurrentStage(sezStageId);
	}

	/**
	 * Deletes the sez status application current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusApplicationCurrentStage the sez status application current stage
	 * @return the sez status application current stage that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezStatusApplicationCurrentStage deleteSezStatusApplicationCurrentStage(
			com.nbp.sez.status.application.form.service.model.
				SezStatusApplicationCurrentStage
					sezStatusApplicationCurrentStage) {

		return _sezStatusApplicationCurrentStageLocalService.
			deleteSezStatusApplicationCurrentStage(
				sezStatusApplicationCurrentStage);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezStatusApplicationCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezStatusApplicationCurrentStageLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezStatusApplicationCurrentStageLocalService.dynamicQuery();
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

		return _sezStatusApplicationCurrentStageLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusApplicationCurrentStageModelImpl</code>.
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

		return _sezStatusApplicationCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusApplicationCurrentStageModelImpl</code>.
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

		return _sezStatusApplicationCurrentStageLocalService.dynamicQuery(
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

		return _sezStatusApplicationCurrentStageLocalService.dynamicQueryCount(
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

		return _sezStatusApplicationCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezStatusApplicationCurrentStage fetchSezStatusApplicationCurrentStage(
			long sezStageId) {

		return _sezStatusApplicationCurrentStageLocalService.
			fetchSezStatusApplicationCurrentStage(sezStageId);
	}

	/**
	 * Returns the sez status application current stage matching the UUID and group.
	 *
	 * @param uuid the sez status application current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezStatusApplicationCurrentStage
			fetchSezStatusApplicationCurrentStageByUuidAndGroupId(
				String uuid, long groupId) {

		return _sezStatusApplicationCurrentStageLocalService.
			fetchSezStatusApplicationCurrentStageByUuidAndGroupId(
				uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezStatusApplicationCurrentStageLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _sezStatusApplicationCurrentStageLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezStatusApplicationCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusApplicationCurrentStageLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusApplicationCurrentStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezStatusApplicationCurrentStage getSEZ_Stage_SAI(long sezApplicationId)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezStatusApplicationCurrentStageException {

		return _sezStatusApplicationCurrentStageLocalService.getSEZ_Stage_SAI(
			sezApplicationId);
	}

	/**
	 * Returns the sez status application current stage with the primary key.
	 *
	 * @param sezStageId the primary key of the sez status application current stage
	 * @return the sez status application current stage
	 * @throws PortalException if a sez status application current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezStatusApplicationCurrentStage getSezStatusApplicationCurrentStage(
				long sezStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusApplicationCurrentStageLocalService.
			getSezStatusApplicationCurrentStage(sezStageId);
	}

	/**
	 * Returns the sez status application current stage matching the UUID and group.
	 *
	 * @param uuid the sez status application current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status application current stage
	 * @throws PortalException if a matching sez status application current stage could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezStatusApplicationCurrentStage
				getSezStatusApplicationCurrentStageByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusApplicationCurrentStageLocalService.
			getSezStatusApplicationCurrentStageByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the sez status application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @return the range of sez status application current stages
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezStatusApplicationCurrentStage>
				getSezStatusApplicationCurrentStages(int start, int end) {

		return _sezStatusApplicationCurrentStageLocalService.
			getSezStatusApplicationCurrentStages(start, end);
	}

	/**
	 * Returns all the sez status application current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status application current stages
	 * @param companyId the primary key of the company
	 * @return the matching sez status application current stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezStatusApplicationCurrentStage>
				getSezStatusApplicationCurrentStagesByUuidAndCompanyId(
					String uuid, long companyId) {

		return _sezStatusApplicationCurrentStageLocalService.
			getSezStatusApplicationCurrentStagesByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of sez status application current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status application current stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching sez status application current stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezStatusApplicationCurrentStage>
				getSezStatusApplicationCurrentStagesByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.sez.status.application.form.service.model.
							SezStatusApplicationCurrentStage>
								orderByComparator) {

		return _sezStatusApplicationCurrentStageLocalService.
			getSezStatusApplicationCurrentStagesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of sez status application current stages.
	 *
	 * @return the number of sez status application current stages
	 */
	@Override
	public int getSezStatusApplicationCurrentStagesCount() {
		return _sezStatusApplicationCurrentStageLocalService.
			getSezStatusApplicationCurrentStagesCount();
	}

	/**
	 * Updates the sez status application current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusApplicationCurrentStage the sez status application current stage
	 * @return the sez status application current stage that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezStatusApplicationCurrentStage updateSezStatusApplicationCurrentStage(
			com.nbp.sez.status.application.form.service.model.
				SezStatusApplicationCurrentStage
					sezStatusApplicationCurrentStage) {

		return _sezStatusApplicationCurrentStageLocalService.
			updateSezStatusApplicationCurrentStage(
				sezStatusApplicationCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezStatusApplicationCurrentStageLocalService.
			getBasePersistence();
	}

	@Override
	public SezStatusApplicationCurrentStageLocalService getWrappedService() {
		return _sezStatusApplicationCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		SezStatusApplicationCurrentStageLocalService
			sezStatusApplicationCurrentStageLocalService) {

		_sezStatusApplicationCurrentStageLocalService =
			sezStatusApplicationCurrentStageLocalService;
	}

	private SezStatusApplicationCurrentStageLocalService
		_sezStatusApplicationCurrentStageLocalService;

}