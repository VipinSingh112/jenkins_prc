/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JanaacApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacApplicationStagesLocalService
 * @generated
 */
public class JanaacApplicationStagesLocalServiceWrapper
	implements JanaacApplicationStagesLocalService,
			   ServiceWrapper<JanaacApplicationStagesLocalService> {

	public JanaacApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public JanaacApplicationStagesLocalServiceWrapper(
		JanaacApplicationStagesLocalService
			janaacApplicationStagesLocalService) {

		_janaacApplicationStagesLocalService =
			janaacApplicationStagesLocalService;
	}

	/**
	 * Adds the janaac application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacApplicationStages the janaac application stages
	 * @return the janaac application stages that was added
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacApplicationStages
		addJanaacApplicationStages(
			com.nbp.janaac.stages.services.model.JanaacApplicationStages
				janaacApplicationStages) {

		return _janaacApplicationStagesLocalService.addJanaacApplicationStages(
			janaacApplicationStages);
	}

	/**
	 * Creates a new janaac application stages with the primary key. Does not add the janaac application stages to the database.
	 *
	 * @param janaacApplicationStagesId the primary key for the new janaac application stages
	 * @return the new janaac application stages
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacApplicationStages
		createJanaacApplicationStages(long janaacApplicationStagesId) {

		return _janaacApplicationStagesLocalService.
			createJanaacApplicationStages(janaacApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the janaac application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacApplicationStages the janaac application stages
	 * @return the janaac application stages that was removed
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacApplicationStages
		deleteJanaacApplicationStages(
			com.nbp.janaac.stages.services.model.JanaacApplicationStages
				janaacApplicationStages) {

		return _janaacApplicationStagesLocalService.
			deleteJanaacApplicationStages(janaacApplicationStages);
	}

	/**
	 * Deletes the janaac application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacApplicationStagesId the primary key of the janaac application stages
	 * @return the janaac application stages that was removed
	 * @throws PortalException if a janaac application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacApplicationStages
			deleteJanaacApplicationStages(long janaacApplicationStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacApplicationStagesLocalService.
			deleteJanaacApplicationStages(janaacApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _janaacApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _janaacApplicationStagesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _janaacApplicationStagesLocalService.dynamicQuery();
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

		return _janaacApplicationStagesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacApplicationStagesModelImpl</code>.
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

		return _janaacApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacApplicationStagesModelImpl</code>.
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

		return _janaacApplicationStagesLocalService.dynamicQuery(
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

		return _janaacApplicationStagesLocalService.dynamicQueryCount(
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

		return _janaacApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.stages.services.model.JanaacApplicationStages
		fetchJanaacApplicationStages(long janaacApplicationStagesId) {

		return _janaacApplicationStagesLocalService.
			fetchJanaacApplicationStages(janaacApplicationStagesId);
	}

	/**
	 * Returns the janaac application stages matching the UUID and group.
	 *
	 * @param uuid the janaac application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacApplicationStages
		fetchJanaacApplicationStagesByUuidAndGroupId(
			String uuid, long groupId) {

		return _janaacApplicationStagesLocalService.
			fetchJanaacApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _janaacApplicationStagesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _janaacApplicationStagesLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _janaacApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public String getJanaacApplicationCurrentStages(String caseId) {
		return _janaacApplicationStagesLocalService.
			getJanaacApplicationCurrentStages(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.janaac.stages.services.model.JanaacApplicationStages>
			getJanaacApplicationStage_By_SN(String stageName) {

		return _janaacApplicationStagesLocalService.
			getJanaacApplicationStage_By_SN(stageName);
	}

	/**
	 * Returns the janaac application stages with the primary key.
	 *
	 * @param janaacApplicationStagesId the primary key of the janaac application stages
	 * @return the janaac application stages
	 * @throws PortalException if a janaac application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacApplicationStages
			getJanaacApplicationStages(long janaacApplicationStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacApplicationStagesLocalService.getJanaacApplicationStages(
			janaacApplicationStagesId);
	}

	/**
	 * Returns the janaac application stages matching the UUID and group.
	 *
	 * @param uuid the janaac application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching janaac application stages
	 * @throws PortalException if a matching janaac application stages could not be found
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacApplicationStages
			getJanaacApplicationStagesByUuidAndGroupId(
				String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacApplicationStagesLocalService.
			getJanaacApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the janaac application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @return the range of janaac application stageses
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.stages.services.model.JanaacApplicationStages>
			getJanaacApplicationStageses(int start, int end) {

		return _janaacApplicationStagesLocalService.
			getJanaacApplicationStageses(start, end);
	}

	/**
	 * Returns all the janaac application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the janaac application stageses
	 * @param companyId the primary key of the company
	 * @return the matching janaac application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.stages.services.model.JanaacApplicationStages>
			getJanaacApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _janaacApplicationStagesLocalService.
			getJanaacApplicationStagesesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of janaac application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the janaac application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching janaac application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.stages.services.model.JanaacApplicationStages>
			getJanaacApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.janaac.stages.services.model.
						JanaacApplicationStages> orderByComparator) {

		return _janaacApplicationStagesLocalService.
			getJanaacApplicationStagesesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of janaac application stageses.
	 *
	 * @return the number of janaac application stageses
	 */
	@Override
	public int getJanaacApplicationStagesesCount() {
		return _janaacApplicationStagesLocalService.
			getJanaacApplicationStagesesCount();
	}

	@Override
	public com.nbp.janaac.stages.services.model.JanaacApplicationStages
			getJanaacBy_CI(String caseId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return _janaacApplicationStagesLocalService.getJanaacBy_CI(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.janaac.stages.services.model.JanaacApplicationStages>
			getJanaacByCI(String caseId) {

		return _janaacApplicationStagesLocalService.getJanaacByCI(caseId);
	}

	@Override
	public com.nbp.janaac.stages.services.model.JanaacApplicationStages
			getJanaacByCI_SN(String caseId, String stageName)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return _janaacApplicationStagesLocalService.getJanaacByCI_SN(
			caseId, stageName);
	}

	@Override
	public com.nbp.janaac.stages.services.model.JanaacApplicationStages
			getJanaacByCI_ST(String caseId, String stageStatus)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return _janaacApplicationStagesLocalService.getJanaacByCI_ST(
			caseId, stageStatus);
	}

	@Override
	public com.nbp.janaac.stages.services.model.JanaacApplicationStages
			getJanaacByCI_ST_SN(
				String caseId, String stageStatus, String stageName)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return _janaacApplicationStagesLocalService.getJanaacByCI_ST_SN(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _janaacApplicationStagesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.janaac.stages.services.model.JanaacApplicationStages
		updateJanaacApplicationStage(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _janaacApplicationStagesLocalService.
			updateJanaacApplicationStage(
				caseId, stageName, stageStartDate, stageEndDate, duration,
				stageStatus);
	}

	/**
	 * Updates the janaac application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacApplicationStages the janaac application stages
	 * @return the janaac application stages that was updated
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacApplicationStages
		updateJanaacApplicationStages(
			com.nbp.janaac.stages.services.model.JanaacApplicationStages
				janaacApplicationStages) {

		return _janaacApplicationStagesLocalService.
			updateJanaacApplicationStages(janaacApplicationStages);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _janaacApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public JanaacApplicationStagesLocalService getWrappedService() {
		return _janaacApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		JanaacApplicationStagesLocalService
			janaacApplicationStagesLocalService) {

		_janaacApplicationStagesLocalService =
			janaacApplicationStagesLocalService;
	}

	private JanaacApplicationStagesLocalService
		_janaacApplicationStagesLocalService;

}