/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiningApplicationMinisterialDecisionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationMinisterialDecisionLocalService
 * @generated
 */
public class MiningApplicationMinisterialDecisionLocalServiceWrapper
	implements MiningApplicationMinisterialDecisionLocalService,
			   ServiceWrapper
				   <MiningApplicationMinisterialDecisionLocalService> {

	public MiningApplicationMinisterialDecisionLocalServiceWrapper() {
		this(null);
	}

	public MiningApplicationMinisterialDecisionLocalServiceWrapper(
		MiningApplicationMinisterialDecisionLocalService
			miningApplicationMinisterialDecisionLocalService) {

		_miningApplicationMinisterialDecisionLocalService =
			miningApplicationMinisterialDecisionLocalService;
	}

	/**
	 * Adds the mining application ministerial decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationMinisterialDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationMinisterialDecision the mining application ministerial decision
	 * @return the mining application ministerial decision that was added
	 */
	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationMinisterialDecision
			addMiningApplicationMinisterialDecision(
				com.nbp.mining.stage.service.model.
					MiningApplicationMinisterialDecision
						miningApplicationMinisterialDecision) {

		return _miningApplicationMinisterialDecisionLocalService.
			addMiningApplicationMinisterialDecision(
				miningApplicationMinisterialDecision);
	}

	/**
	 * Creates a new mining application ministerial decision with the primary key. Does not add the mining application ministerial decision to the database.
	 *
	 * @param miningDecId the primary key for the new mining application ministerial decision
	 * @return the new mining application ministerial decision
	 */
	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationMinisterialDecision
			createMiningApplicationMinisterialDecision(long miningDecId) {

		return _miningApplicationMinisterialDecisionLocalService.
			createMiningApplicationMinisterialDecision(miningDecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationMinisterialDecisionLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the mining application ministerial decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationMinisterialDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningDecId the primary key of the mining application ministerial decision
	 * @return the mining application ministerial decision that was removed
	 * @throws PortalException if a mining application ministerial decision with the primary key could not be found
	 */
	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationMinisterialDecision
				deleteMiningApplicationMinisterialDecision(long miningDecId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationMinisterialDecisionLocalService.
			deleteMiningApplicationMinisterialDecision(miningDecId);
	}

	/**
	 * Deletes the mining application ministerial decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationMinisterialDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationMinisterialDecision the mining application ministerial decision
	 * @return the mining application ministerial decision that was removed
	 */
	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationMinisterialDecision
			deleteMiningApplicationMinisterialDecision(
				com.nbp.mining.stage.service.model.
					MiningApplicationMinisterialDecision
						miningApplicationMinisterialDecision) {

		return _miningApplicationMinisterialDecisionLocalService.
			deleteMiningApplicationMinisterialDecision(
				miningApplicationMinisterialDecision);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationMinisterialDecisionLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miningApplicationMinisterialDecisionLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miningApplicationMinisterialDecisionLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miningApplicationMinisterialDecisionLocalService.dynamicQuery();
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

		return _miningApplicationMinisterialDecisionLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationMinisterialDecisionModelImpl</code>.
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

		return _miningApplicationMinisterialDecisionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationMinisterialDecisionModelImpl</code>.
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

		return _miningApplicationMinisterialDecisionLocalService.dynamicQuery(
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

		return _miningApplicationMinisterialDecisionLocalService.
			dynamicQueryCount(dynamicQuery);
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

		return _miningApplicationMinisterialDecisionLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationMinisterialDecision
			fetchMiningApplicationMinisterialDecision(long miningDecId) {

		return _miningApplicationMinisterialDecisionLocalService.
			fetchMiningApplicationMinisterialDecision(miningDecId);
	}

	/**
	 * Returns the mining application ministerial decision matching the UUID and group.
	 *
	 * @param uuid the mining application ministerial decision's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationMinisterialDecision
			fetchMiningApplicationMinisterialDecisionByUuidAndGroupId(
				String uuid, long groupId) {

		return _miningApplicationMinisterialDecisionLocalService.
			fetchMiningApplicationMinisterialDecisionByUuidAndGroupId(
				uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miningApplicationMinisterialDecisionLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _miningApplicationMinisterialDecisionLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miningApplicationMinisterialDecisionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the mining application ministerial decision with the primary key.
	 *
	 * @param miningDecId the primary key of the mining application ministerial decision
	 * @return the mining application ministerial decision
	 * @throws PortalException if a mining application ministerial decision with the primary key could not be found
	 */
	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationMinisterialDecision
				getMiningApplicationMinisterialDecision(long miningDecId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationMinisterialDecisionLocalService.
			getMiningApplicationMinisterialDecision(miningDecId);
	}

	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationMinisterialDecision
				getMiningApplicationMinisterialDecisionByCI(String caseId)
			throws com.nbp.mining.stage.service.exception.
				NoSuchMiningApplicationMinisterialDecisionException {

		return _miningApplicationMinisterialDecisionLocalService.
			getMiningApplicationMinisterialDecisionByCI(caseId);
	}

	/**
	 * Returns the mining application ministerial decision matching the UUID and group.
	 *
	 * @param uuid the mining application ministerial decision's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mining application ministerial decision
	 * @throws PortalException if a matching mining application ministerial decision could not be found
	 */
	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationMinisterialDecision
				getMiningApplicationMinisterialDecisionByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationMinisterialDecisionLocalService.
			getMiningApplicationMinisterialDecisionByUuidAndGroupId(
				uuid, groupId);
	}

	/**
	 * Returns a range of all the mining application ministerial decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @return the range of mining application ministerial decisions
	 */
	@Override
	public java.util.List
		<com.nbp.mining.stage.service.model.
			MiningApplicationMinisterialDecision>
				getMiningApplicationMinisterialDecisions(int start, int end) {

		return _miningApplicationMinisterialDecisionLocalService.
			getMiningApplicationMinisterialDecisions(start, end);
	}

	/**
	 * Returns all the mining application ministerial decisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the mining application ministerial decisions
	 * @param companyId the primary key of the company
	 * @return the matching mining application ministerial decisions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.mining.stage.service.model.
			MiningApplicationMinisterialDecision>
				getMiningApplicationMinisterialDecisionsByUuidAndCompanyId(
					String uuid, long companyId) {

		return _miningApplicationMinisterialDecisionLocalService.
			getMiningApplicationMinisterialDecisionsByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of mining application ministerial decisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the mining application ministerial decisions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching mining application ministerial decisions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.mining.stage.service.model.
			MiningApplicationMinisterialDecision>
				getMiningApplicationMinisterialDecisionsByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.mining.stage.service.model.
							MiningApplicationMinisterialDecision>
								orderByComparator) {

		return _miningApplicationMinisterialDecisionLocalService.
			getMiningApplicationMinisterialDecisionsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of mining application ministerial decisions.
	 *
	 * @return the number of mining application ministerial decisions
	 */
	@Override
	public int getMiningApplicationMinisterialDecisionsCount() {
		return _miningApplicationMinisterialDecisionLocalService.
			getMiningApplicationMinisterialDecisionsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningApplicationMinisterialDecisionLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationMinisterialDecisionLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the mining application ministerial decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationMinisterialDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationMinisterialDecision the mining application ministerial decision
	 * @return the mining application ministerial decision that was updated
	 */
	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationMinisterialDecision
			updateMiningApplicationMinisterialDecision(
				com.nbp.mining.stage.service.model.
					MiningApplicationMinisterialDecision
						miningApplicationMinisterialDecision) {

		return _miningApplicationMinisterialDecisionLocalService.
			updateMiningApplicationMinisterialDecision(
				miningApplicationMinisterialDecision);
	}

	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationMinisterialDecision
			updateMiningMinisterialDecision(
				String caseId, String committeeDecision,
				java.sql.Date dateofCommitteeDecision,
				java.sql.Date dateOfExpiration, String certificateNumber) {

		return _miningApplicationMinisterialDecisionLocalService.
			updateMiningMinisterialDecision(
				caseId, committeeDecision, dateofCommitteeDecision,
				dateOfExpiration, certificateNumber);
	}

	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationMinisterialDecision
			updateMiningMinisterialDecision(
				String caseId, String committeeDecision,
				java.util.Date dateofCommitteeDecision,
				java.util.Date dateOfExpiration, String certificateNumber) {

		return _miningApplicationMinisterialDecisionLocalService.
			updateMiningMinisterialDecision(
				caseId, committeeDecision, dateofCommitteeDecision,
				dateOfExpiration, certificateNumber);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miningApplicationMinisterialDecisionLocalService.
			getBasePersistence();
	}

	@Override
	public MiningApplicationMinisterialDecisionLocalService
		getWrappedService() {

		return _miningApplicationMinisterialDecisionLocalService;
	}

	@Override
	public void setWrappedService(
		MiningApplicationMinisterialDecisionLocalService
			miningApplicationMinisterialDecisionLocalService) {

		_miningApplicationMinisterialDecisionLocalService =
			miningApplicationMinisterialDecisionLocalService;
	}

	private MiningApplicationMinisterialDecisionLocalService
		_miningApplicationMinisterialDecisionLocalService;

}