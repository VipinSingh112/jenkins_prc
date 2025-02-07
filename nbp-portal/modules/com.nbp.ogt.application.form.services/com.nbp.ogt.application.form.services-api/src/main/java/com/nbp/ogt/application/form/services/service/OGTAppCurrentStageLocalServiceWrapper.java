/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OGTAppCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OGTAppCurrentStageLocalService
 * @generated
 */
public class OGTAppCurrentStageLocalServiceWrapper
	implements OGTAppCurrentStageLocalService,
			   ServiceWrapper<OGTAppCurrentStageLocalService> {

	public OGTAppCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public OGTAppCurrentStageLocalServiceWrapper(
		OGTAppCurrentStageLocalService ogtAppCurrentStageLocalService) {

		_ogtAppCurrentStageLocalService = ogtAppCurrentStageLocalService;
	}

	/**
	 * Adds the ogt app current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OGTAppCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtAppCurrentStage the ogt app current stage
	 * @return the ogt app current stage that was added
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OGTAppCurrentStage
		addOGTAppCurrentStage(
			com.nbp.ogt.application.form.services.model.OGTAppCurrentStage
				ogtAppCurrentStage) {

		return _ogtAppCurrentStageLocalService.addOGTAppCurrentStage(
			ogtAppCurrentStage);
	}

	/**
	 * Creates a new ogt app current stage with the primary key. Does not add the ogt app current stage to the database.
	 *
	 * @param ogtAppCurrentStageId the primary key for the new ogt app current stage
	 * @return the new ogt app current stage
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OGTAppCurrentStage
		createOGTAppCurrentStage(long ogtAppCurrentStageId) {

		return _ogtAppCurrentStageLocalService.createOGTAppCurrentStage(
			ogtAppCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtAppCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ogt app current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OGTAppCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtAppCurrentStageId the primary key of the ogt app current stage
	 * @return the ogt app current stage that was removed
	 * @throws PortalException if a ogt app current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OGTAppCurrentStage
			deleteOGTAppCurrentStage(long ogtAppCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtAppCurrentStageLocalService.deleteOGTAppCurrentStage(
			ogtAppCurrentStageId);
	}

	/**
	 * Deletes the ogt app current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OGTAppCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtAppCurrentStage the ogt app current stage
	 * @return the ogt app current stage that was removed
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OGTAppCurrentStage
		deleteOGTAppCurrentStage(
			com.nbp.ogt.application.form.services.model.OGTAppCurrentStage
				ogtAppCurrentStage) {

		return _ogtAppCurrentStageLocalService.deleteOGTAppCurrentStage(
			ogtAppCurrentStage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtAppCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ogtAppCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ogtAppCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ogtAppCurrentStageLocalService.dynamicQuery();
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

		return _ogtAppCurrentStageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OGTAppCurrentStageModelImpl</code>.
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

		return _ogtAppCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OGTAppCurrentStageModelImpl</code>.
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

		return _ogtAppCurrentStageLocalService.dynamicQuery(
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

		return _ogtAppCurrentStageLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ogtAppCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ogt.application.form.services.model.OGTAppCurrentStage
		fetchOGTAppCurrentStage(long ogtAppCurrentStageId) {

		return _ogtAppCurrentStageLocalService.fetchOGTAppCurrentStage(
			ogtAppCurrentStageId);
	}

	/**
	 * Returns the ogt app current stage matching the UUID and group.
	 *
	 * @param uuid the ogt app current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OGTAppCurrentStage
		fetchOGTAppCurrentStageByUuidAndGroupId(String uuid, long groupId) {

		return _ogtAppCurrentStageLocalService.
			fetchOGTAppCurrentStageByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ogtAppCurrentStageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.ogt.application.form.services.model.OGTAppCurrentStage
			getByOGT_Stage(long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOGTAppCurrentStageException {

		return _ogtAppCurrentStageLocalService.getByOGT_Stage(ogtApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _ogtAppCurrentStageLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ogtAppCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the ogt app current stage with the primary key.
	 *
	 * @param ogtAppCurrentStageId the primary key of the ogt app current stage
	 * @return the ogt app current stage
	 * @throws PortalException if a ogt app current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OGTAppCurrentStage
			getOGTAppCurrentStage(long ogtAppCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtAppCurrentStageLocalService.getOGTAppCurrentStage(
			ogtAppCurrentStageId);
	}

	/**
	 * Returns the ogt app current stage matching the UUID and group.
	 *
	 * @param uuid the ogt app current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ogt app current stage
	 * @throws PortalException if a matching ogt app current stage could not be found
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OGTAppCurrentStage
			getOGTAppCurrentStageByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtAppCurrentStageLocalService.
			getOGTAppCurrentStageByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the ogt app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @return the range of ogt app current stages
	 */
	@Override
	public java.util.List
		<com.nbp.ogt.application.form.services.model.OGTAppCurrentStage>
			getOGTAppCurrentStages(int start, int end) {

		return _ogtAppCurrentStageLocalService.getOGTAppCurrentStages(
			start, end);
	}

	/**
	 * Returns all the ogt app current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the ogt app current stages
	 * @param companyId the primary key of the company
	 * @return the matching ogt app current stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.ogt.application.form.services.model.OGTAppCurrentStage>
			getOGTAppCurrentStagesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _ogtAppCurrentStageLocalService.
			getOGTAppCurrentStagesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of ogt app current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the ogt app current stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching ogt app current stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.ogt.application.form.services.model.OGTAppCurrentStage>
			getOGTAppCurrentStagesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.ogt.application.form.services.model.
						OGTAppCurrentStage> orderByComparator) {

		return _ogtAppCurrentStageLocalService.
			getOGTAppCurrentStagesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of ogt app current stages.
	 *
	 * @return the number of ogt app current stages
	 */
	@Override
	public int getOGTAppCurrentStagesCount() {
		return _ogtAppCurrentStageLocalService.getOGTAppCurrentStagesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ogtAppCurrentStageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtAppCurrentStageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ogt app current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OGTAppCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtAppCurrentStage the ogt app current stage
	 * @return the ogt app current stage that was updated
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OGTAppCurrentStage
		updateOGTAppCurrentStage(
			com.nbp.ogt.application.form.services.model.OGTAppCurrentStage
				ogtAppCurrentStage) {

		return _ogtAppCurrentStageLocalService.updateOGTAppCurrentStage(
			ogtAppCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ogtAppCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public OGTAppCurrentStageLocalService getWrappedService() {
		return _ogtAppCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		OGTAppCurrentStageLocalService ogtAppCurrentStageLocalService) {

		_ogtAppCurrentStageLocalService = ogtAppCurrentStageLocalService;
	}

	private OGTAppCurrentStageLocalService _ogtAppCurrentStageLocalService;

}