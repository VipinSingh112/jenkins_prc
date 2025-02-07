/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QuarryAppCommitteeDecisionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryAppCommitteeDecisionLocalService
 * @generated
 */
public class QuarryAppCommitteeDecisionLocalServiceWrapper
	implements QuarryAppCommitteeDecisionLocalService,
			   ServiceWrapper<QuarryAppCommitteeDecisionLocalService> {

	public QuarryAppCommitteeDecisionLocalServiceWrapper() {
		this(null);
	}

	public QuarryAppCommitteeDecisionLocalServiceWrapper(
		QuarryAppCommitteeDecisionLocalService
			quarryAppCommitteeDecisionLocalService) {

		_quarryAppCommitteeDecisionLocalService =
			quarryAppCommitteeDecisionLocalService;
	}

	/**
	 * Adds the quarry app committee decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryAppCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryAppCommitteeDecision the quarry app committee decision
	 * @return the quarry app committee decision that was added
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryAppCommitteeDecision
		addQuarryAppCommitteeDecision(
			com.nbp.quarry.stage.service.model.QuarryAppCommitteeDecision
				quarryAppCommitteeDecision) {

		return _quarryAppCommitteeDecisionLocalService.
			addQuarryAppCommitteeDecision(quarryAppCommitteeDecision);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryAppCommitteeDecisionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new quarry app committee decision with the primary key. Does not add the quarry app committee decision to the database.
	 *
	 * @param quarryAppCommitteeDecisionId the primary key for the new quarry app committee decision
	 * @return the new quarry app committee decision
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryAppCommitteeDecision
		createQuarryAppCommitteeDecision(long quarryAppCommitteeDecisionId) {

		return _quarryAppCommitteeDecisionLocalService.
			createQuarryAppCommitteeDecision(quarryAppCommitteeDecisionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryAppCommitteeDecisionLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the quarry app committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryAppCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryAppCommitteeDecisionId the primary key of the quarry app committee decision
	 * @return the quarry app committee decision that was removed
	 * @throws PortalException if a quarry app committee decision with the primary key could not be found
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryAppCommitteeDecision
			deleteQuarryAppCommitteeDecision(long quarryAppCommitteeDecisionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryAppCommitteeDecisionLocalService.
			deleteQuarryAppCommitteeDecision(quarryAppCommitteeDecisionId);
	}

	/**
	 * Deletes the quarry app committee decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryAppCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryAppCommitteeDecision the quarry app committee decision
	 * @return the quarry app committee decision that was removed
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryAppCommitteeDecision
		deleteQuarryAppCommitteeDecision(
			com.nbp.quarry.stage.service.model.QuarryAppCommitteeDecision
				quarryAppCommitteeDecision) {

		return _quarryAppCommitteeDecisionLocalService.
			deleteQuarryAppCommitteeDecision(quarryAppCommitteeDecision);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _quarryAppCommitteeDecisionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _quarryAppCommitteeDecisionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _quarryAppCommitteeDecisionLocalService.dynamicQuery();
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

		return _quarryAppCommitteeDecisionLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryAppCommitteeDecisionModelImpl</code>.
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

		return _quarryAppCommitteeDecisionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryAppCommitteeDecisionModelImpl</code>.
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

		return _quarryAppCommitteeDecisionLocalService.dynamicQuery(
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

		return _quarryAppCommitteeDecisionLocalService.dynamicQueryCount(
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

		return _quarryAppCommitteeDecisionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.quarry.stage.service.model.QuarryAppCommitteeDecision
		fetchQuarryAppCommitteeDecision(long quarryAppCommitteeDecisionId) {

		return _quarryAppCommitteeDecisionLocalService.
			fetchQuarryAppCommitteeDecision(quarryAppCommitteeDecisionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _quarryAppCommitteeDecisionLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _quarryAppCommitteeDecisionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryAppCommitteeDecisionLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryAppCommitteeDecisionLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.quarry.stage.service.model.QuarryAppCommitteeDecision>
				getQuarry_By_CD(String status)
			throws com.nbp.quarry.stage.service.exception.
				NoSuchQuarryAppCommitteeDecisionException {

		return _quarryAppCommitteeDecisionLocalService.getQuarry_By_CD(status);
	}

	@Override
	public com.nbp.quarry.stage.service.model.QuarryAppCommitteeDecision
			getQuarry_CD_CI(String caseId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryAppCommitteeDecisionException {

		return _quarryAppCommitteeDecisionLocalService.getQuarry_CD_CI(caseId);
	}

	/**
	 * Returns the quarry app committee decision with the primary key.
	 *
	 * @param quarryAppCommitteeDecisionId the primary key of the quarry app committee decision
	 * @return the quarry app committee decision
	 * @throws PortalException if a quarry app committee decision with the primary key could not be found
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryAppCommitteeDecision
			getQuarryAppCommitteeDecision(long quarryAppCommitteeDecisionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryAppCommitteeDecisionLocalService.
			getQuarryAppCommitteeDecision(quarryAppCommitteeDecisionId);
	}

	/**
	 * Returns a range of all the quarry app committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry app committee decisions
	 * @param end the upper bound of the range of quarry app committee decisions (not inclusive)
	 * @return the range of quarry app committee decisions
	 */
	@Override
	public java.util.List
		<com.nbp.quarry.stage.service.model.QuarryAppCommitteeDecision>
			getQuarryAppCommitteeDecisions(int start, int end) {

		return _quarryAppCommitteeDecisionLocalService.
			getQuarryAppCommitteeDecisions(start, end);
	}

	/**
	 * Returns the number of quarry app committee decisions.
	 *
	 * @return the number of quarry app committee decisions
	 */
	@Override
	public int getQuarryAppCommitteeDecisionsCount() {
		return _quarryAppCommitteeDecisionLocalService.
			getQuarryAppCommitteeDecisionsCount();
	}

	/**
	 * Updates the quarry app committee decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryAppCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryAppCommitteeDecision the quarry app committee decision
	 * @return the quarry app committee decision that was updated
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryAppCommitteeDecision
		updateQuarryAppCommitteeDecision(
			com.nbp.quarry.stage.service.model.QuarryAppCommitteeDecision
				quarryAppCommitteeDecision) {

		return _quarryAppCommitteeDecisionLocalService.
			updateQuarryAppCommitteeDecision(quarryAppCommitteeDecision);
	}

	@Override
	public com.nbp.quarry.stage.service.model.QuarryAppCommitteeDecision
		updateQuarryApplicationCommitteeDecision(
			String caseId, java.util.Date dateOfCommitteeDecision,
			String committeeDecision) {

		return _quarryAppCommitteeDecisionLocalService.
			updateQuarryApplicationCommitteeDecision(
				caseId, dateOfCommitteeDecision, committeeDecision);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _quarryAppCommitteeDecisionLocalService.getBasePersistence();
	}

	@Override
	public QuarryAppCommitteeDecisionLocalService getWrappedService() {
		return _quarryAppCommitteeDecisionLocalService;
	}

	@Override
	public void setWrappedService(
		QuarryAppCommitteeDecisionLocalService
			quarryAppCommitteeDecisionLocalService) {

		_quarryAppCommitteeDecisionLocalService =
			quarryAppCommitteeDecisionLocalService;
	}

	private QuarryAppCommitteeDecisionLocalService
		_quarryAppCommitteeDecisionLocalService;

}