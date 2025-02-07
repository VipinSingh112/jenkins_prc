/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FullLicenseCommitteeDecisionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FullLicenseCommitteeDecisionLocalService
 * @generated
 */
public class FullLicenseCommitteeDecisionLocalServiceWrapper
	implements FullLicenseCommitteeDecisionLocalService,
			   ServiceWrapper<FullLicenseCommitteeDecisionLocalService> {

	public FullLicenseCommitteeDecisionLocalServiceWrapper() {
		this(null);
	}

	public FullLicenseCommitteeDecisionLocalServiceWrapper(
		FullLicenseCommitteeDecisionLocalService
			fullLicenseCommitteeDecisionLocalService) {

		_fullLicenseCommitteeDecisionLocalService =
			fullLicenseCommitteeDecisionLocalService;
	}

	/**
	 * Adds the full license committee decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FullLicenseCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fullLicenseCommitteeDecision the full license committee decision
	 * @return the full license committee decision that was added
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		FullLicenseCommitteeDecision addFullLicenseCommitteeDecision(
			com.npm.cannabis.application.stages.services.model.
				FullLicenseCommitteeDecision fullLicenseCommitteeDecision) {

		return _fullLicenseCommitteeDecisionLocalService.
			addFullLicenseCommitteeDecision(fullLicenseCommitteeDecision);
	}

	/**
	 * Creates a new full license committee decision with the primary key. Does not add the full license committee decision to the database.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key for the new full license committee decision
	 * @return the new full license committee decision
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		FullLicenseCommitteeDecision createFullLicenseCommitteeDecision(
			long fullLicenseCommitteeDecisionId) {

		return _fullLicenseCommitteeDecisionLocalService.
			createFullLicenseCommitteeDecision(fullLicenseCommitteeDecisionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fullLicenseCommitteeDecisionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the full license committee decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FullLicenseCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fullLicenseCommitteeDecision the full license committee decision
	 * @return the full license committee decision that was removed
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		FullLicenseCommitteeDecision deleteFullLicenseCommitteeDecision(
			com.npm.cannabis.application.stages.services.model.
				FullLicenseCommitteeDecision fullLicenseCommitteeDecision) {

		return _fullLicenseCommitteeDecisionLocalService.
			deleteFullLicenseCommitteeDecision(fullLicenseCommitteeDecision);
	}

	/**
	 * Deletes the full license committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FullLicenseCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key of the full license committee decision
	 * @return the full license committee decision that was removed
	 * @throws PortalException if a full license committee decision with the primary key could not be found
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		FullLicenseCommitteeDecision deleteFullLicenseCommitteeDecision(
				long fullLicenseCommitteeDecisionId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _fullLicenseCommitteeDecisionLocalService.
			deleteFullLicenseCommitteeDecision(fullLicenseCommitteeDecisionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fullLicenseCommitteeDecisionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fullLicenseCommitteeDecisionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fullLicenseCommitteeDecisionLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fullLicenseCommitteeDecisionLocalService.dynamicQuery();
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

		return _fullLicenseCommitteeDecisionLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.FullLicenseCommitteeDecisionModelImpl</code>.
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

		return _fullLicenseCommitteeDecisionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.FullLicenseCommitteeDecisionModelImpl</code>.
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

		return _fullLicenseCommitteeDecisionLocalService.dynamicQuery(
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

		return _fullLicenseCommitteeDecisionLocalService.dynamicQueryCount(
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

		return _fullLicenseCommitteeDecisionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.
		FullLicenseCommitteeDecision fetchFullLicenseCommitteeDecision(
			long fullLicenseCommitteeDecisionId) {

		return _fullLicenseCommitteeDecisionLocalService.
			fetchFullLicenseCommitteeDecision(fullLicenseCommitteeDecisionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fullLicenseCommitteeDecisionLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the full license committee decision with the primary key.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key of the full license committee decision
	 * @return the full license committee decision
	 * @throws PortalException if a full license committee decision with the primary key could not be found
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		FullLicenseCommitteeDecision getFullLicenseCommitteeDecision(
				long fullLicenseCommitteeDecisionId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _fullLicenseCommitteeDecisionLocalService.
			getFullLicenseCommitteeDecision(fullLicenseCommitteeDecisionId);
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.
		FullLicenseCommitteeDecision getFullLicenseCommitteeDecisionBy_Case_Id(
				String caseId)
			throws com.npm.cannabis.application.stages.services.exception.
				NoSuchFullLicenseCommitteeDecisionException {

		return _fullLicenseCommitteeDecisionLocalService.
			getFullLicenseCommitteeDecisionBy_Case_Id(caseId);
	}

	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			FullLicenseCommitteeDecision>
				getFullLicenseCommitteeDecisionByCaseId(String caseId) {

		return _fullLicenseCommitteeDecisionLocalService.
			getFullLicenseCommitteeDecisionByCaseId(caseId);
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.
		FullLicenseCommitteeDecision
				getFullLicenseCommitteeDecisionByCaseIdStatus(
					String caseId, String committeeDecision)
			throws com.npm.cannabis.application.stages.services.exception.
				NoSuchFullLicenseCommitteeDecisionException {

		return _fullLicenseCommitteeDecisionLocalService.
			getFullLicenseCommitteeDecisionByCaseIdStatus(
				caseId, committeeDecision);
	}

	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			FullLicenseCommitteeDecision>
				getFullLicenseCommitteeDecisionByStatus(
					String committeeDecision) {

		return _fullLicenseCommitteeDecisionLocalService.
			getFullLicenseCommitteeDecisionByStatus(committeeDecision);
	}

	/**
	 * Returns a range of all the full license committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @return the range of full license committee decisions
	 */
	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			FullLicenseCommitteeDecision> getFullLicenseCommitteeDecisions(
				int start, int end) {

		return _fullLicenseCommitteeDecisionLocalService.
			getFullLicenseCommitteeDecisions(start, end);
	}

	/**
	 * Returns the number of full license committee decisions.
	 *
	 * @return the number of full license committee decisions
	 */
	@Override
	public int getFullLicenseCommitteeDecisionsCount() {
		return _fullLicenseCommitteeDecisionLocalService.
			getFullLicenseCommitteeDecisionsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fullLicenseCommitteeDecisionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fullLicenseCommitteeDecisionLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fullLicenseCommitteeDecisionLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.
		FullLicenseCommitteeDecision updateCommitteeDecisionApplicationStage(
			String caseId, String bondFeeDue, String committeeDecision,
			String licenseFeeDue, long totalAmountDue, String stageStatus) {

		return _fullLicenseCommitteeDecisionLocalService.
			updateCommitteeDecisionApplicationStage(
				caseId, bondFeeDue, committeeDecision, licenseFeeDue,
				totalAmountDue, stageStatus);
	}

	/**
	 * Updates the full license committee decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FullLicenseCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fullLicenseCommitteeDecision the full license committee decision
	 * @return the full license committee decision that was updated
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		FullLicenseCommitteeDecision updateFullLicenseCommitteeDecision(
			com.npm.cannabis.application.stages.services.model.
				FullLicenseCommitteeDecision fullLicenseCommitteeDecision) {

		return _fullLicenseCommitteeDecisionLocalService.
			updateFullLicenseCommitteeDecision(fullLicenseCommitteeDecision);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _fullLicenseCommitteeDecisionLocalService.getBasePersistence();
	}

	@Override
	public FullLicenseCommitteeDecisionLocalService getWrappedService() {
		return _fullLicenseCommitteeDecisionLocalService;
	}

	@Override
	public void setWrappedService(
		FullLicenseCommitteeDecisionLocalService
			fullLicenseCommitteeDecisionLocalService) {

		_fullLicenseCommitteeDecisionLocalService =
			fullLicenseCommitteeDecisionLocalService;
	}

	private FullLicenseCommitteeDecisionLocalService
		_fullLicenseCommitteeDecisionLocalService;

}