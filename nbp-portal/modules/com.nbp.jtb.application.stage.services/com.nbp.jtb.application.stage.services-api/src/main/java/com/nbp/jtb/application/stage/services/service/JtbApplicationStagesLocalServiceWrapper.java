/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JtbApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JtbApplicationStagesLocalService
 * @generated
 */
public class JtbApplicationStagesLocalServiceWrapper
	implements JtbApplicationStagesLocalService,
			   ServiceWrapper<JtbApplicationStagesLocalService> {

	public JtbApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public JtbApplicationStagesLocalServiceWrapper(
		JtbApplicationStagesLocalService jtbApplicationStagesLocalService) {

		_jtbApplicationStagesLocalService = jtbApplicationStagesLocalService;
	}

	/**
	 * Adds the jtb application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplicationStages the jtb application stages
	 * @return the jtb application stages that was added
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JtbApplicationStages
		addJtbApplicationStages(
			com.nbp.jtb.application.stage.services.model.JtbApplicationStages
				jtbApplicationStages) {

		return _jtbApplicationStagesLocalService.addJtbApplicationStages(
			jtbApplicationStages);
	}

	/**
	 * Creates a new jtb application stages with the primary key. Does not add the jtb application stages to the database.
	 *
	 * @param jtbApplicationStagesId the primary key for the new jtb application stages
	 * @return the new jtb application stages
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JtbApplicationStages
		createJtbApplicationStages(long jtbApplicationStagesId) {

		return _jtbApplicationStagesLocalService.createJtbApplicationStages(
			jtbApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jtb application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplicationStages the jtb application stages
	 * @return the jtb application stages that was removed
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JtbApplicationStages
		deleteJtbApplicationStages(
			com.nbp.jtb.application.stage.services.model.JtbApplicationStages
				jtbApplicationStages) {

		return _jtbApplicationStagesLocalService.deleteJtbApplicationStages(
			jtbApplicationStages);
	}

	/**
	 * Deletes the jtb application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplicationStagesId the primary key of the jtb application stages
	 * @return the jtb application stages that was removed
	 * @throws PortalException if a jtb application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JtbApplicationStages
			deleteJtbApplicationStages(long jtbApplicationStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbApplicationStagesLocalService.deleteJtbApplicationStages(
			jtbApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jtbApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jtbApplicationStagesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jtbApplicationStagesLocalService.dynamicQuery();
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

		return _jtbApplicationStagesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JtbApplicationStagesModelImpl</code>.
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

		return _jtbApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JtbApplicationStagesModelImpl</code>.
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

		return _jtbApplicationStagesLocalService.dynamicQuery(
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

		return _jtbApplicationStagesLocalService.dynamicQueryCount(
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

		return _jtbApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.stage.services.model.JtbApplicationStages
		fetchJtbApplicationStages(long jtbApplicationStagesId) {

		return _jtbApplicationStagesLocalService.fetchJtbApplicationStages(
			jtbApplicationStagesId);
	}

	/**
	 * Returns the jtb application stages matching the UUID and group.
	 *
	 * @param uuid the jtb application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JtbApplicationStages
		fetchJtbApplicationStagesByUuidAndGroupId(String uuid, long groupId) {

		return _jtbApplicationStagesLocalService.
			fetchJtbApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jtbApplicationStagesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _jtbApplicationStagesLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jtbApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public String getJtbApplicaitonCurrentStages(String caseId) {
		return _jtbApplicationStagesLocalService.getJtbApplicaitonCurrentStages(
			caseId);
	}

	/**
	 * Returns the jtb application stages with the primary key.
	 *
	 * @param jtbApplicationStagesId the primary key of the jtb application stages
	 * @return the jtb application stages
	 * @throws PortalException if a jtb application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JtbApplicationStages
			getJtbApplicationStages(long jtbApplicationStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbApplicationStagesLocalService.getJtbApplicationStages(
			jtbApplicationStagesId);
	}

	/**
	 * Returns the jtb application stages matching the UUID and group.
	 *
	 * @param uuid the jtb application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jtb application stages
	 * @throws PortalException if a matching jtb application stages could not be found
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JtbApplicationStages
			getJtbApplicationStagesByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbApplicationStagesLocalService.
			getJtbApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the jtb application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @return the range of jtb application stageses
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.stage.services.model.JtbApplicationStages>
			getJtbApplicationStageses(int start, int end) {

		return _jtbApplicationStagesLocalService.getJtbApplicationStageses(
			start, end);
	}

	/**
	 * Returns all the jtb application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the jtb application stageses
	 * @param companyId the primary key of the company
	 * @return the matching jtb application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.stage.services.model.JtbApplicationStages>
			getJtbApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _jtbApplicationStagesLocalService.
			getJtbApplicationStagesesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of jtb application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the jtb application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jtb application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.stage.services.model.JtbApplicationStages>
			getJtbApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.jtb.application.stage.services.model.
						JtbApplicationStages> orderByComparator) {

		return _jtbApplicationStagesLocalService.
			getJtbApplicationStagesesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jtb application stageses.
	 *
	 * @return the number of jtb application stageses
	 */
	@Override
	public int getJtbApplicationStagesesCount() {
		return _jtbApplicationStagesLocalService.
			getJtbApplicationStagesesCount();
	}

	@Override
	public Long getJTBAttractionSeenCases() {
		return _jtbApplicationStagesLocalService.getJTBAttractionSeenCases();
	}

	@Override
	public com.nbp.jtb.application.stage.services.model.JtbApplicationStages
			getJtbBy_CI(String caseId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return _jtbApplicationStagesLocalService.getJtbBy_CI(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.jtb.application.stage.services.model.JtbApplicationStages>
				getJtbByCI(String caseId)
			throws com.nbp.jtb.application.stage.services.exception.
				NoSuchJtbApplicationStagesException {

		return _jtbApplicationStagesLocalService.getJtbByCI(caseId);
	}

	@Override
	public com.nbp.jtb.application.stage.services.model.JtbApplicationStages
			getJtbByCI_SN(String caseId, String stageName)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return _jtbApplicationStagesLocalService.getJtbByCI_SN(
			caseId, stageName);
	}

	@Override
	public com.nbp.jtb.application.stage.services.model.JtbApplicationStages
			getJtbByCI_ST(String caseId, String stageStatus)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return _jtbApplicationStagesLocalService.getJtbByCI_ST(
			caseId, stageStatus);
	}

	@Override
	public com.nbp.jtb.application.stage.services.model.JtbApplicationStages
			getJtbByCI_ST_SN(
				String caseId, String stageStatus, String stageName)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return _jtbApplicationStagesLocalService.getJtbByCI_ST_SN(
			caseId, stageStatus, stageName);
	}

	@Override
	public java.util.List<String> getJTBDistinctStages() {
		return _jtbApplicationStagesLocalService.getJTBDistinctStages();
	}

	@Override
	public Long getJTBOtherSeenCases() {
		return _jtbApplicationStagesLocalService.getJTBOtherSeenCases();
	}

	@Override
	public Long getJTBSeenCases() {
		return _jtbApplicationStagesLocalService.getJTBSeenCases();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbApplicationStagesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.jtb.application.stage.services.model.JtbApplicationStages>
			gtJtbApplicationStages_By_SN(String stageName) {

		return _jtbApplicationStagesLocalService.gtJtbApplicationStages_By_SN(
			stageName);
	}

	/**
	 * Updates the jtb application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplicationStages the jtb application stages
	 * @return the jtb application stages that was updated
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JtbApplicationStages
		updateJtbApplicationStages(
			com.nbp.jtb.application.stage.services.model.JtbApplicationStages
				jtbApplicationStages) {

		return _jtbApplicationStagesLocalService.updateJtbApplicationStages(
			jtbApplicationStages);
	}

	@Override
	public com.nbp.jtb.application.stage.services.model.JtbApplicationStages
		updateJtbApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _jtbApplicationStagesLocalService.updateJtbApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jtbApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public JtbApplicationStagesLocalService getWrappedService() {
		return _jtbApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		JtbApplicationStagesLocalService jtbApplicationStagesLocalService) {

		_jtbApplicationStagesLocalService = jtbApplicationStagesLocalService;
	}

	private JtbApplicationStagesLocalService _jtbApplicationStagesLocalService;

}