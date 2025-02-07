/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link PharmaApplicationCommitteeDecisionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationCommitteeDecisionLocalService
 * @generated
 */
public class PharmaApplicationCommitteeDecisionLocalServiceWrapper
	implements PharmaApplicationCommitteeDecisionLocalService,
			   ServiceWrapper<PharmaApplicationCommitteeDecisionLocalService> {

	public PharmaApplicationCommitteeDecisionLocalServiceWrapper() {
		this(null);
	}

	public PharmaApplicationCommitteeDecisionLocalServiceWrapper(
		PharmaApplicationCommitteeDecisionLocalService
			pharmaApplicationCommitteeDecisionLocalService) {

		_pharmaApplicationCommitteeDecisionLocalService =
			pharmaApplicationCommitteeDecisionLocalService;
	}

	/**
	 * Adds the pharma application committee decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationCommitteeDecision the pharma application committee decision
	 * @return the pharma application committee decision that was added
	 */
	@Override
	public com.nbp.pharmaceutical.stages.services.model.
		PharmaApplicationCommitteeDecision
			addPharmaApplicationCommitteeDecision(
				com.nbp.pharmaceutical.stages.services.model.
					PharmaApplicationCommitteeDecision
						pharmaApplicationCommitteeDecision) {

		return _pharmaApplicationCommitteeDecisionLocalService.
			addPharmaApplicationCommitteeDecision(
				pharmaApplicationCommitteeDecision);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationCommitteeDecisionLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new pharma application committee decision with the primary key. Does not add the pharma application committee decision to the database.
	 *
	 * @param pharmaCommitteeDecisionId the primary key for the new pharma application committee decision
	 * @return the new pharma application committee decision
	 */
	@Override
	public com.nbp.pharmaceutical.stages.services.model.
		PharmaApplicationCommitteeDecision
			createPharmaApplicationCommitteeDecision(
				long pharmaCommitteeDecisionId) {

		return _pharmaApplicationCommitteeDecisionLocalService.
			createPharmaApplicationCommitteeDecision(pharmaCommitteeDecisionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationCommitteeDecisionLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the pharma application committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaCommitteeDecisionId the primary key of the pharma application committee decision
	 * @return the pharma application committee decision that was removed
	 * @throws PortalException if a pharma application committee decision with the primary key could not be found
	 */
	@Override
	public com.nbp.pharmaceutical.stages.services.model.
		PharmaApplicationCommitteeDecision
				deletePharmaApplicationCommitteeDecision(
					long pharmaCommitteeDecisionId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationCommitteeDecisionLocalService.
			deletePharmaApplicationCommitteeDecision(pharmaCommitteeDecisionId);
	}

	/**
	 * Deletes the pharma application committee decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationCommitteeDecision the pharma application committee decision
	 * @return the pharma application committee decision that was removed
	 */
	@Override
	public com.nbp.pharmaceutical.stages.services.model.
		PharmaApplicationCommitteeDecision
			deletePharmaApplicationCommitteeDecision(
				com.nbp.pharmaceutical.stages.services.model.
					PharmaApplicationCommitteeDecision
						pharmaApplicationCommitteeDecision) {

		return _pharmaApplicationCommitteeDecisionLocalService.
			deletePharmaApplicationCommitteeDecision(
				pharmaApplicationCommitteeDecision);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pharmaApplicationCommitteeDecisionLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pharmaApplicationCommitteeDecisionLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pharmaApplicationCommitteeDecisionLocalService.dynamicQuery();
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

		return _pharmaApplicationCommitteeDecisionLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationCommitteeDecisionModelImpl</code>.
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

		return _pharmaApplicationCommitteeDecisionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationCommitteeDecisionModelImpl</code>.
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

		return _pharmaApplicationCommitteeDecisionLocalService.dynamicQuery(
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

		return _pharmaApplicationCommitteeDecisionLocalService.
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

		return _pharmaApplicationCommitteeDecisionLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.pharmaceutical.stages.services.model.
		PharmaApplicationCommitteeDecision
			fetchPharmaApplicationCommitteeDecision(
				long pharmaCommitteeDecisionId) {

		return _pharmaApplicationCommitteeDecisionLocalService.
			fetchPharmaApplicationCommitteeDecision(pharmaCommitteeDecisionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pharmaApplicationCommitteeDecisionLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pharmaApplicationCommitteeDecisionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaApplicationCommitteeDecisionLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationCommitteeDecisionLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the pharma application committee decision with the primary key.
	 *
	 * @param pharmaCommitteeDecisionId the primary key of the pharma application committee decision
	 * @return the pharma application committee decision
	 * @throws PortalException if a pharma application committee decision with the primary key could not be found
	 */
	@Override
	public com.nbp.pharmaceutical.stages.services.model.
		PharmaApplicationCommitteeDecision
				getPharmaApplicationCommitteeDecision(
					long pharmaCommitteeDecisionId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationCommitteeDecisionLocalService.
			getPharmaApplicationCommitteeDecision(pharmaCommitteeDecisionId);
	}

	/**
	 * Returns a range of all the pharma application committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application committee decisions
	 * @param end the upper bound of the range of pharma application committee decisions (not inclusive)
	 * @return the range of pharma application committee decisions
	 */
	@Override
	public java.util.List
		<com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationCommitteeDecision>
				getPharmaApplicationCommitteeDecisions(int start, int end) {

		return _pharmaApplicationCommitteeDecisionLocalService.
			getPharmaApplicationCommitteeDecisions(start, end);
	}

	/**
	 * Returns the number of pharma application committee decisions.
	 *
	 * @return the number of pharma application committee decisions
	 */
	@Override
	public int getPharmaApplicationCommitteeDecisionsCount() {
		return _pharmaApplicationCommitteeDecisionLocalService.
			getPharmaApplicationCommitteeDecisionsCount();
	}

	@Override
	public com.nbp.pharmaceutical.stages.services.model.
		PharmaApplicationCommitteeDecision getPharmaCommitteDecisionByCI(
				String caseId)
			throws com.nbp.pharmaceutical.stages.services.exception.
				NoSuchPharmaApplicationCommitteeDecisionException {

		return _pharmaApplicationCommitteeDecisionLocalService.
			getPharmaCommitteDecisionByCI(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationCommitteeDecision>
					getPharmaCommitteDecisionByStatus(String status)
				throws com.nbp.pharmaceutical.stages.services.exception.
					NoSuchPharmaApplicationCommitteeDecisionException {

		return _pharmaApplicationCommitteeDecisionLocalService.
			getPharmaCommitteDecisionByStatus(status);
	}

	/**
	 * Updates the pharma application committee decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationCommitteeDecision the pharma application committee decision
	 * @return the pharma application committee decision that was updated
	 */
	@Override
	public com.nbp.pharmaceutical.stages.services.model.
		PharmaApplicationCommitteeDecision
			updatePharmaApplicationCommitteeDecision(
				com.nbp.pharmaceutical.stages.services.model.
					PharmaApplicationCommitteeDecision
						pharmaApplicationCommitteeDecision) {

		return _pharmaApplicationCommitteeDecisionLocalService.
			updatePharmaApplicationCommitteeDecision(
				pharmaApplicationCommitteeDecision);
	}

	@Override
	public com.nbp.pharmaceutical.stages.services.model.
		PharmaApplicationCommitteeDecision
			updatePharmaApplicationCommitteeDecision(
				String caseId, java.util.Date dateOfCommitteeDecision,
				String committeeDecision) {

		return _pharmaApplicationCommitteeDecisionLocalService.
			updatePharmaApplicationCommitteeDecision(
				caseId, dateOfCommitteeDecision, committeeDecision);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _pharmaApplicationCommitteeDecisionLocalService.
			getBasePersistence();
	}

	@Override
	public PharmaApplicationCommitteeDecisionLocalService getWrappedService() {
		return _pharmaApplicationCommitteeDecisionLocalService;
	}

	@Override
	public void setWrappedService(
		PharmaApplicationCommitteeDecisionLocalService
			pharmaApplicationCommitteeDecisionLocalService) {

		_pharmaApplicationCommitteeDecisionLocalService =
			pharmaApplicationCommitteeDecisionLocalService;
	}

	private PharmaApplicationCommitteeDecisionLocalService
		_pharmaApplicationCommitteeDecisionLocalService;

}