/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FactoriesAppCommitteeDecisionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesAppCommitteeDecisionLocalService
 * @generated
 */
public class FactoriesAppCommitteeDecisionLocalServiceWrapper
	implements FactoriesAppCommitteeDecisionLocalService,
			   ServiceWrapper<FactoriesAppCommitteeDecisionLocalService> {

	public FactoriesAppCommitteeDecisionLocalServiceWrapper() {
		this(null);
	}

	public FactoriesAppCommitteeDecisionLocalServiceWrapper(
		FactoriesAppCommitteeDecisionLocalService
			factoriesAppCommitteeDecisionLocalService) {

		_factoriesAppCommitteeDecisionLocalService =
			factoriesAppCommitteeDecisionLocalService;
	}

	/**
	 * Adds the factories app committee decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesAppCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesAppCommitteeDecision the factories app committee decision
	 * @return the factories app committee decision that was added
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesAppCommitteeDecision addFactoriesAppCommitteeDecision(
			com.nbp.factories.registration.stage.services.model.
				FactoriesAppCommitteeDecision factoriesAppCommitteeDecision) {

		return _factoriesAppCommitteeDecisionLocalService.
			addFactoriesAppCommitteeDecision(factoriesAppCommitteeDecision);
	}

	/**
	 * Creates a new factories app committee decision with the primary key. Does not add the factories app committee decision to the database.
	 *
	 * @param factoriesAppCommiDecId the primary key for the new factories app committee decision
	 * @return the new factories app committee decision
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesAppCommitteeDecision createFactoriesAppCommitteeDecision(
			long factoriesAppCommiDecId) {

		return _factoriesAppCommitteeDecisionLocalService.
			createFactoriesAppCommitteeDecision(factoriesAppCommiDecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesAppCommitteeDecisionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the factories app committee decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesAppCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesAppCommitteeDecision the factories app committee decision
	 * @return the factories app committee decision that was removed
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesAppCommitteeDecision deleteFactoriesAppCommitteeDecision(
			com.nbp.factories.registration.stage.services.model.
				FactoriesAppCommitteeDecision factoriesAppCommitteeDecision) {

		return _factoriesAppCommitteeDecisionLocalService.
			deleteFactoriesAppCommitteeDecision(factoriesAppCommitteeDecision);
	}

	/**
	 * Deletes the factories app committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesAppCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesAppCommiDecId the primary key of the factories app committee decision
	 * @return the factories app committee decision that was removed
	 * @throws PortalException if a factories app committee decision with the primary key could not be found
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesAppCommitteeDecision deleteFactoriesAppCommitteeDecision(
				long factoriesAppCommiDecId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesAppCommitteeDecisionLocalService.
			deleteFactoriesAppCommitteeDecision(factoriesAppCommiDecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesAppCommitteeDecisionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _factoriesAppCommitteeDecisionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _factoriesAppCommitteeDecisionLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _factoriesAppCommitteeDecisionLocalService.dynamicQuery();
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

		return _factoriesAppCommitteeDecisionLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesAppCommitteeDecisionModelImpl</code>.
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

		return _factoriesAppCommitteeDecisionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesAppCommitteeDecisionModelImpl</code>.
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

		return _factoriesAppCommitteeDecisionLocalService.dynamicQuery(
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

		return _factoriesAppCommitteeDecisionLocalService.dynamicQueryCount(
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

		return _factoriesAppCommitteeDecisionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesAppCommitteeDecision fetchFactoriesAppCommitteeDecision(
			long factoriesAppCommiDecId) {

		return _factoriesAppCommitteeDecisionLocalService.
			fetchFactoriesAppCommitteeDecision(factoriesAppCommiDecId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _factoriesAppCommitteeDecisionLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the factories app committee decision with the primary key.
	 *
	 * @param factoriesAppCommiDecId the primary key of the factories app committee decision
	 * @return the factories app committee decision
	 * @throws PortalException if a factories app committee decision with the primary key could not be found
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesAppCommitteeDecision getFactoriesAppCommitteeDecision(
				long factoriesAppCommiDecId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesAppCommitteeDecisionLocalService.
			getFactoriesAppCommitteeDecision(factoriesAppCommiDecId);
	}

	/**
	 * Returns a range of all the factories app committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories app committee decisions
	 * @param end the upper bound of the range of factories app committee decisions (not inclusive)
	 * @return the range of factories app committee decisions
	 */
	@Override
	public java.util.List
		<com.nbp.factories.registration.stage.services.model.
			FactoriesAppCommitteeDecision> getFactoriesAppCommitteeDecisions(
				int start, int end) {

		return _factoriesAppCommitteeDecisionLocalService.
			getFactoriesAppCommitteeDecisions(start, end);
	}

	/**
	 * Returns the number of factories app committee decisions.
	 *
	 * @return the number of factories app committee decisions
	 */
	@Override
	public int getFactoriesAppCommitteeDecisionsCount() {
		return _factoriesAppCommitteeDecisionLocalService.
			getFactoriesAppCommitteeDecisionsCount();
	}

	@Override
	public java.util.List
		<com.nbp.factories.registration.stage.services.model.
			FactoriesAppCommitteeDecision> getFactory_By_CD(String status)
				throws com.nbp.factories.registration.stage.services.exception.
					NoSuchFactoriesAppCommitteeDecisionException {

		return _factoriesAppCommitteeDecisionLocalService.getFactory_By_CD(
			status);
	}

	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesAppCommitteeDecision getFactory_CD_CI(String caseId)
			throws com.nbp.factories.registration.stage.services.exception.
				NoSuchFactoriesAppCommitteeDecisionException {

		return _factoriesAppCommitteeDecisionLocalService.getFactory_CD_CI(
			caseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _factoriesAppCommitteeDecisionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _factoriesAppCommitteeDecisionLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesAppCommitteeDecisionLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the factories app committee decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesAppCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesAppCommitteeDecision the factories app committee decision
	 * @return the factories app committee decision that was updated
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesAppCommitteeDecision updateFactoriesAppCommitteeDecision(
			com.nbp.factories.registration.stage.services.model.
				FactoriesAppCommitteeDecision factoriesAppCommitteeDecision) {

		return _factoriesAppCommitteeDecisionLocalService.
			updateFactoriesAppCommitteeDecision(factoriesAppCommitteeDecision);
	}

	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesAppCommitteeDecision updateQuarryApplicationCommitteeDecision(
			String caseId, java.util.Date dateOfCommitteeDecision,
			String committeeDecision) {

		return _factoriesAppCommitteeDecisionLocalService.
			updateQuarryApplicationCommitteeDecision(
				caseId, dateOfCommitteeDecision, committeeDecision);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _factoriesAppCommitteeDecisionLocalService.getBasePersistence();
	}

	@Override
	public FactoriesAppCommitteeDecisionLocalService getWrappedService() {
		return _factoriesAppCommitteeDecisionLocalService;
	}

	@Override
	public void setWrappedService(
		FactoriesAppCommitteeDecisionLocalService
			factoriesAppCommitteeDecisionLocalService) {

		_factoriesAppCommitteeDecisionLocalService =
			factoriesAppCommitteeDecisionLocalService;
	}

	private FactoriesAppCommitteeDecisionLocalService
		_factoriesAppCommitteeDecisionLocalService;

}