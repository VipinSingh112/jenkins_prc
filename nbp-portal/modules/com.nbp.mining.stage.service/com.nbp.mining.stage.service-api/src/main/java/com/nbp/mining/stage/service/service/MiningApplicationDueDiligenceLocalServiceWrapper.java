/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiningApplicationDueDiligenceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationDueDiligenceLocalService
 * @generated
 */
public class MiningApplicationDueDiligenceLocalServiceWrapper
	implements MiningApplicationDueDiligenceLocalService,
			   ServiceWrapper<MiningApplicationDueDiligenceLocalService> {

	public MiningApplicationDueDiligenceLocalServiceWrapper() {
		this(null);
	}

	public MiningApplicationDueDiligenceLocalServiceWrapper(
		MiningApplicationDueDiligenceLocalService
			miningApplicationDueDiligenceLocalService) {

		_miningApplicationDueDiligenceLocalService =
			miningApplicationDueDiligenceLocalService;
	}

	/**
	 * Adds the mining application due diligence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationDueDiligence the mining application due diligence
	 * @return the mining application due diligence that was added
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationDueDiligence
		addMiningApplicationDueDiligence(
			com.nbp.mining.stage.service.model.MiningApplicationDueDiligence
				miningApplicationDueDiligence) {

		return _miningApplicationDueDiligenceLocalService.
			addMiningApplicationDueDiligence(miningApplicationDueDiligence);
	}

	/**
	 * Creates a new mining application due diligence with the primary key. Does not add the mining application due diligence to the database.
	 *
	 * @param miningDueDiliId the primary key for the new mining application due diligence
	 * @return the new mining application due diligence
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationDueDiligence
		createMiningApplicationDueDiligence(long miningDueDiliId) {

		return _miningApplicationDueDiligenceLocalService.
			createMiningApplicationDueDiligence(miningDueDiliId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationDueDiligenceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the mining application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningDueDiliId the primary key of the mining application due diligence
	 * @return the mining application due diligence that was removed
	 * @throws PortalException if a mining application due diligence with the primary key could not be found
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationDueDiligence
			deleteMiningApplicationDueDiligence(long miningDueDiliId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationDueDiligenceLocalService.
			deleteMiningApplicationDueDiligence(miningDueDiliId);
	}

	/**
	 * Deletes the mining application due diligence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationDueDiligence the mining application due diligence
	 * @return the mining application due diligence that was removed
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationDueDiligence
		deleteMiningApplicationDueDiligence(
			com.nbp.mining.stage.service.model.MiningApplicationDueDiligence
				miningApplicationDueDiligence) {

		return _miningApplicationDueDiligenceLocalService.
			deleteMiningApplicationDueDiligence(miningApplicationDueDiligence);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationDueDiligenceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miningApplicationDueDiligenceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miningApplicationDueDiligenceLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miningApplicationDueDiligenceLocalService.dynamicQuery();
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

		return _miningApplicationDueDiligenceLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationDueDiligenceModelImpl</code>.
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

		return _miningApplicationDueDiligenceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationDueDiligenceModelImpl</code>.
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

		return _miningApplicationDueDiligenceLocalService.dynamicQuery(
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

		return _miningApplicationDueDiligenceLocalService.dynamicQueryCount(
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

		return _miningApplicationDueDiligenceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationDueDiligence
		fetchMiningApplicationDueDiligence(long miningDueDiliId) {

		return _miningApplicationDueDiligenceLocalService.
			fetchMiningApplicationDueDiligence(miningDueDiliId);
	}

	/**
	 * Returns the mining application due diligence matching the UUID and group.
	 *
	 * @param uuid the mining application due diligence's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationDueDiligence
		fetchMiningApplicationDueDiligenceByUuidAndGroupId(
			String uuid, long groupId) {

		return _miningApplicationDueDiligenceLocalService.
			fetchMiningApplicationDueDiligenceByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miningApplicationDueDiligenceLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _miningApplicationDueDiligenceLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miningApplicationDueDiligenceLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the mining application due diligence with the primary key.
	 *
	 * @param miningDueDiliId the primary key of the mining application due diligence
	 * @return the mining application due diligence
	 * @throws PortalException if a mining application due diligence with the primary key could not be found
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationDueDiligence
			getMiningApplicationDueDiligence(long miningDueDiliId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationDueDiligenceLocalService.
			getMiningApplicationDueDiligence(miningDueDiliId);
	}

	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationDueDiligence
			getMiningApplicationDueDiligenceByCI(String caseId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDueDiligenceException {

		return _miningApplicationDueDiligenceLocalService.
			getMiningApplicationDueDiligenceByCI(caseId);
	}

	/**
	 * Returns the mining application due diligence matching the UUID and group.
	 *
	 * @param uuid the mining application due diligence's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mining application due diligence
	 * @throws PortalException if a matching mining application due diligence could not be found
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationDueDiligence
			getMiningApplicationDueDiligenceByUuidAndGroupId(
				String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationDueDiligenceLocalService.
			getMiningApplicationDueDiligenceByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the mining application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @return the range of mining application due diligences
	 */
	@Override
	public java.util.List
		<com.nbp.mining.stage.service.model.MiningApplicationDueDiligence>
			getMiningApplicationDueDiligences(int start, int end) {

		return _miningApplicationDueDiligenceLocalService.
			getMiningApplicationDueDiligences(start, end);
	}

	/**
	 * Returns all the mining application due diligences matching the UUID and company.
	 *
	 * @param uuid the UUID of the mining application due diligences
	 * @param companyId the primary key of the company
	 * @return the matching mining application due diligences, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.mining.stage.service.model.MiningApplicationDueDiligence>
			getMiningApplicationDueDiligencesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _miningApplicationDueDiligenceLocalService.
			getMiningApplicationDueDiligencesByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of mining application due diligences matching the UUID and company.
	 *
	 * @param uuid the UUID of the mining application due diligences
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching mining application due diligences, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.mining.stage.service.model.MiningApplicationDueDiligence>
			getMiningApplicationDueDiligencesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.mining.stage.service.model.
						MiningApplicationDueDiligence> orderByComparator) {

		return _miningApplicationDueDiligenceLocalService.
			getMiningApplicationDueDiligencesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of mining application due diligences.
	 *
	 * @return the number of mining application due diligences
	 */
	@Override
	public int getMiningApplicationDueDiligencesCount() {
		return _miningApplicationDueDiligenceLocalService.
			getMiningApplicationDueDiligencesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningApplicationDueDiligenceLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationDueDiligenceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the mining application due diligence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationDueDiligence the mining application due diligence
	 * @return the mining application due diligence that was updated
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationDueDiligence
		updateMiningApplicationDueDiligence(
			com.nbp.mining.stage.service.model.MiningApplicationDueDiligence
				miningApplicationDueDiligence) {

		return _miningApplicationDueDiligenceLocalService.
			updateMiningApplicationDueDiligence(miningApplicationDueDiligence);
	}

	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationDueDiligence
		updateMiningApplicationDueDiligence(
			String caseId, String agencyName, String statusOfSubmission,
			String feedbackReceived, String status) {

		return _miningApplicationDueDiligenceLocalService.
			updateMiningApplicationDueDiligence(
				caseId, agencyName, statusOfSubmission, feedbackReceived,
				status);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miningApplicationDueDiligenceLocalService.getBasePersistence();
	}

	@Override
	public MiningApplicationDueDiligenceLocalService getWrappedService() {
		return _miningApplicationDueDiligenceLocalService;
	}

	@Override
	public void setWrappedService(
		MiningApplicationDueDiligenceLocalService
			miningApplicationDueDiligenceLocalService) {

		_miningApplicationDueDiligenceLocalService =
			miningApplicationDueDiligenceLocalService;
	}

	private MiningApplicationDueDiligenceLocalService
		_miningApplicationDueDiligenceLocalService;

}