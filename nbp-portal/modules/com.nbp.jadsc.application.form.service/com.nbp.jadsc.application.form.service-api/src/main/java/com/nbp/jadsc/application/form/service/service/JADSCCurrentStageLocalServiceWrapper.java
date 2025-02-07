/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JADSCCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCurrentStageLocalService
 * @generated
 */
public class JADSCCurrentStageLocalServiceWrapper
	implements JADSCCurrentStageLocalService,
			   ServiceWrapper<JADSCCurrentStageLocalService> {

	public JADSCCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public JADSCCurrentStageLocalServiceWrapper(
		JADSCCurrentStageLocalService jadscCurrentStageLocalService) {

		_jadscCurrentStageLocalService = jadscCurrentStageLocalService;
	}

	/**
	 * Adds the jadsc current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCurrentStage the jadsc current stage
	 * @return the jadsc current stage that was added
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCCurrentStage
		addJADSCCurrentStage(
			com.nbp.jadsc.application.form.service.model.JADSCCurrentStage
				jadscCurrentStage) {

		return _jadscCurrentStageLocalService.addJADSCCurrentStage(
			jadscCurrentStage);
	}

	/**
	 * Creates a new jadsc current stage with the primary key. Does not add the jadsc current stage to the database.
	 *
	 * @param jadscCurrentStageId the primary key for the new jadsc current stage
	 * @return the new jadsc current stage
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCCurrentStage
		createJADSCCurrentStage(long jadscCurrentStageId) {

		return _jadscCurrentStageLocalService.createJADSCCurrentStage(
			jadscCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jadsc current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCurrentStage the jadsc current stage
	 * @return the jadsc current stage that was removed
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCCurrentStage
		deleteJADSCCurrentStage(
			com.nbp.jadsc.application.form.service.model.JADSCCurrentStage
				jadscCurrentStage) {

		return _jadscCurrentStageLocalService.deleteJADSCCurrentStage(
			jadscCurrentStage);
	}

	/**
	 * Deletes the jadsc current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCurrentStageId the primary key of the jadsc current stage
	 * @return the jadsc current stage that was removed
	 * @throws PortalException if a jadsc current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCCurrentStage
			deleteJADSCCurrentStage(long jadscCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCurrentStageLocalService.deleteJADSCCurrentStage(
			jadscCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jadscCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jadscCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jadscCurrentStageLocalService.dynamicQuery();
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

		return _jadscCurrentStageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCurrentStageModelImpl</code>.
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

		return _jadscCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCurrentStageModelImpl</code>.
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

		return _jadscCurrentStageLocalService.dynamicQuery(
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

		return _jadscCurrentStageLocalService.dynamicQueryCount(dynamicQuery);
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

		return _jadscCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCCurrentStage
		fetchJADSCCurrentStage(long jadscCurrentStageId) {

		return _jadscCurrentStageLocalService.fetchJADSCCurrentStage(
			jadscCurrentStageId);
	}

	/**
	 * Returns the jadsc current stage matching the UUID and group.
	 *
	 * @param uuid the jadsc current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCCurrentStage
		fetchJADSCCurrentStageByUuidAndGroupId(String uuid, long groupId) {

		return _jadscCurrentStageLocalService.
			fetchJADSCCurrentStageByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jadscCurrentStageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCCurrentStage
			getByJadsc_Stage(long applicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCurrentStageException {

		return _jadscCurrentStageLocalService.getByJadsc_Stage(applicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _jadscCurrentStageLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jadscCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the jadsc current stage with the primary key.
	 *
	 * @param jadscCurrentStageId the primary key of the jadsc current stage
	 * @return the jadsc current stage
	 * @throws PortalException if a jadsc current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCCurrentStage
			getJADSCCurrentStage(long jadscCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCurrentStageLocalService.getJADSCCurrentStage(
			jadscCurrentStageId);
	}

	/**
	 * Returns the jadsc current stage matching the UUID and group.
	 *
	 * @param uuid the jadsc current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc current stage
	 * @throws PortalException if a matching jadsc current stage could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCCurrentStage
			getJADSCCurrentStageByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCurrentStageLocalService.
			getJADSCCurrentStageByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the jadsc current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @return the range of jadsc current stages
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCCurrentStage>
			getJADSCCurrentStages(int start, int end) {

		return _jadscCurrentStageLocalService.getJADSCCurrentStages(start, end);
	}

	/**
	 * Returns all the jadsc current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc current stages
	 * @param companyId the primary key of the company
	 * @return the matching jadsc current stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCCurrentStage>
			getJADSCCurrentStagesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _jadscCurrentStageLocalService.
			getJADSCCurrentStagesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of jadsc current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc current stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc current stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCCurrentStage>
			getJADSCCurrentStagesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.jadsc.application.form.service.model.
						JADSCCurrentStage> orderByComparator) {

		return _jadscCurrentStageLocalService.
			getJADSCCurrentStagesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jadsc current stages.
	 *
	 * @return the number of jadsc current stages
	 */
	@Override
	public int getJADSCCurrentStagesCount() {
		return _jadscCurrentStageLocalService.getJADSCCurrentStagesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscCurrentStageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCurrentStageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the jadsc current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCurrentStage the jadsc current stage
	 * @return the jadsc current stage that was updated
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCCurrentStage
		updateJADSCCurrentStage(
			com.nbp.jadsc.application.form.service.model.JADSCCurrentStage
				jadscCurrentStage) {

		return _jadscCurrentStageLocalService.updateJADSCCurrentStage(
			jadscCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jadscCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public JADSCCurrentStageLocalService getWrappedService() {
		return _jadscCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		JADSCCurrentStageLocalService jadscCurrentStageLocalService) {

		_jadscCurrentStageLocalService = jadscCurrentStageLocalService;
	}

	private JADSCCurrentStageLocalService _jadscCurrentStageLocalService;

}