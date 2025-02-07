/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JadscApplicationStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JadscApplicationStageLocalService
 * @generated
 */
public class JadscApplicationStageLocalServiceWrapper
	implements JadscApplicationStageLocalService,
			   ServiceWrapper<JadscApplicationStageLocalService> {

	public JadscApplicationStageLocalServiceWrapper() {
		this(null);
	}

	public JadscApplicationStageLocalServiceWrapper(
		JadscApplicationStageLocalService jadscApplicationStageLocalService) {

		_jadscApplicationStageLocalService = jadscApplicationStageLocalService;
	}

	/**
	 * Adds the jadsc application stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationStage the jadsc application stage
	 * @return the jadsc application stage that was added
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationStage
		addJadscApplicationStage(
			com.nbp.jadsc.stage.services.model.JadscApplicationStage
				jadscApplicationStage) {

		return _jadscApplicationStageLocalService.addJadscApplicationStage(
			jadscApplicationStage);
	}

	/**
	 * Creates a new jadsc application stage with the primary key. Does not add the jadsc application stage to the database.
	 *
	 * @param jadscAppStageId the primary key for the new jadsc application stage
	 * @return the new jadsc application stage
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationStage
		createJadscApplicationStage(long jadscAppStageId) {

		return _jadscApplicationStageLocalService.createJadscApplicationStage(
			jadscAppStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jadsc application stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationStage the jadsc application stage
	 * @return the jadsc application stage that was removed
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationStage
		deleteJadscApplicationStage(
			com.nbp.jadsc.stage.services.model.JadscApplicationStage
				jadscApplicationStage) {

		return _jadscApplicationStageLocalService.deleteJadscApplicationStage(
			jadscApplicationStage);
	}

	/**
	 * Deletes the jadsc application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppStageId the primary key of the jadsc application stage
	 * @return the jadsc application stage that was removed
	 * @throws PortalException if a jadsc application stage with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationStage
			deleteJadscApplicationStage(long jadscAppStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationStageLocalService.deleteJadscApplicationStage(
			jadscAppStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jadscApplicationStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jadscApplicationStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jadscApplicationStageLocalService.dynamicQuery();
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

		return _jadscApplicationStageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationStageModelImpl</code>.
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

		return _jadscApplicationStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationStageModelImpl</code>.
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

		return _jadscApplicationStageLocalService.dynamicQuery(
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

		return _jadscApplicationStageLocalService.dynamicQueryCount(
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

		return _jadscApplicationStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationStage
		fetchJadscApplicationStage(long jadscAppStageId) {

		return _jadscApplicationStageLocalService.fetchJadscApplicationStage(
			jadscAppStageId);
	}

	/**
	 * Returns the jadsc application stage matching the UUID and group.
	 *
	 * @param uuid the jadsc application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationStage
		fetchJadscApplicationStageByUuidAndGroupId(String uuid, long groupId) {

		return _jadscApplicationStageLocalService.
			fetchJadscApplicationStageByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jadscApplicationStageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _jadscApplicationStageLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jadscApplicationStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public String getJadscApplicationCurrentStages(String caseId) {
		return _jadscApplicationStageLocalService.
			getJadscApplicationCurrentStages(caseId);
	}

	/**
	 * Returns the jadsc application stage with the primary key.
	 *
	 * @param jadscAppStageId the primary key of the jadsc application stage
	 * @return the jadsc application stage
	 * @throws PortalException if a jadsc application stage with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationStage
			getJadscApplicationStage(long jadscAppStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationStageLocalService.getJadscApplicationStage(
			jadscAppStageId);
	}

	/**
	 * Returns the jadsc application stage matching the UUID and group.
	 *
	 * @param uuid the jadsc application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc application stage
	 * @throws PortalException if a matching jadsc application stage could not be found
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationStage
			getJadscApplicationStageByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationStageLocalService.
			getJadscApplicationStageByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the jadsc application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @return the range of jadsc application stages
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.stage.services.model.JadscApplicationStage>
			getJadscApplicationStages(int start, int end) {

		return _jadscApplicationStageLocalService.getJadscApplicationStages(
			start, end);
	}

	/**
	 * Returns all the jadsc application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc application stages
	 * @param companyId the primary key of the company
	 * @return the matching jadsc application stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.stage.services.model.JadscApplicationStage>
			getJadscApplicationStagesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _jadscApplicationStageLocalService.
			getJadscApplicationStagesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of jadsc application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc application stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc application stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.stage.services.model.JadscApplicationStage>
			getJadscApplicationStagesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.jadsc.stage.services.model.JadscApplicationStage>
						orderByComparator) {

		return _jadscApplicationStageLocalService.
			getJadscApplicationStagesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jadsc application stages.
	 *
	 * @return the number of jadsc application stages
	 */
	@Override
	public int getJadscApplicationStagesCount() {
		return _jadscApplicationStageLocalService.
			getJadscApplicationStagesCount();
	}

	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationStage
			getJadscBy_CI(String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return _jadscApplicationStageLocalService.getJadscBy_CI(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.jadsc.stage.services.model.JadscApplicationStage> getJadscByCI(
				String caseId)
			throws com.nbp.jadsc.stage.services.exception.
				NoSuchJadscApplicationStageException {

		return _jadscApplicationStageLocalService.getJadscByCI(caseId);
	}

	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationStage
			getJadscByCI_SN(String caseId, String stageName)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return _jadscApplicationStageLocalService.getJadscByCI_SN(
			caseId, stageName);
	}

	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationStage
			getJadscByCI_ST(String caseId, String stageStatus)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return _jadscApplicationStageLocalService.getJadscByCI_ST(
			caseId, stageStatus);
	}

	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationStage
			getJadscByCI_ST_SN(
				String caseId, String stageStatus, String stageName)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return _jadscApplicationStageLocalService.getJadscByCI_ST_SN(
			caseId, stageStatus, stageName);
	}

	@Override
	public java.util.List<String> getJadscDistinctStages() {
		return _jadscApplicationStageLocalService.getJadscDistinctStages();
	}

	@Override
	public Long getJadscSeenCases() {
		return _jadscApplicationStageLocalService.getJadscSeenCases();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscApplicationStageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.jadsc.stage.services.model.JadscApplicationStage>
			gtJadscApplicationStage_By_SN(String stageName) {

		return _jadscApplicationStageLocalService.gtJadscApplicationStage_By_SN(
			stageName);
	}

	/**
	 * Updates the jadsc application stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationStage the jadsc application stage
	 * @return the jadsc application stage that was updated
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationStage
		updateJadscApplicationStage(
			com.nbp.jadsc.stage.services.model.JadscApplicationStage
				jadscApplicationStage) {

		return _jadscApplicationStageLocalService.updateJadscApplicationStage(
			jadscApplicationStage);
	}

	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationStage
		updateJadscApplicationStage(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _jadscApplicationStageLocalService.updateJadscApplicationStage(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jadscApplicationStageLocalService.getBasePersistence();
	}

	@Override
	public JadscApplicationStageLocalService getWrappedService() {
		return _jadscApplicationStageLocalService;
	}

	@Override
	public void setWrappedService(
		JadscApplicationStageLocalService jadscApplicationStageLocalService) {

		_jadscApplicationStageLocalService = jadscApplicationStageLocalService;
	}

	private JadscApplicationStageLocalService
		_jadscApplicationStageLocalService;

}