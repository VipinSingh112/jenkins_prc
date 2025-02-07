/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiicRecommendationsDecisionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicRecommendationsDecisionLocalService
 * @generated
 */
public class MiicRecommendationsDecisionLocalServiceWrapper
	implements MiicRecommendationsDecisionLocalService,
			   ServiceWrapper<MiicRecommendationsDecisionLocalService> {

	public MiicRecommendationsDecisionLocalServiceWrapper() {
		this(null);
	}

	public MiicRecommendationsDecisionLocalServiceWrapper(
		MiicRecommendationsDecisionLocalService
			miicRecommendationsDecisionLocalService) {

		_miicRecommendationsDecisionLocalService =
			miicRecommendationsDecisionLocalService;
	}

	/**
	 * Adds the miic recommendations decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicRecommendationsDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicRecommendationsDecision the miic recommendations decision
	 * @return the miic recommendations decision that was added
	 */
	@Override
	public com.nbp.miic.stages.service.model.MiicRecommendationsDecision
		addMiicRecommendationsDecision(
			com.nbp.miic.stages.service.model.MiicRecommendationsDecision
				miicRecommendationsDecision) {

		return _miicRecommendationsDecisionLocalService.
			addMiicRecommendationsDecision(miicRecommendationsDecision);
	}

	/**
	 * Creates a new miic recommendations decision with the primary key. Does not add the miic recommendations decision to the database.
	 *
	 * @param miicRecommendationsDecisionId the primary key for the new miic recommendations decision
	 * @return the new miic recommendations decision
	 */
	@Override
	public com.nbp.miic.stages.service.model.MiicRecommendationsDecision
		createMiicRecommendationsDecision(long miicRecommendationsDecisionId) {

		return _miicRecommendationsDecisionLocalService.
			createMiicRecommendationsDecision(miicRecommendationsDecisionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicRecommendationsDecisionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the miic recommendations decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicRecommendationsDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicRecommendationsDecisionId the primary key of the miic recommendations decision
	 * @return the miic recommendations decision that was removed
	 * @throws PortalException if a miic recommendations decision with the primary key could not be found
	 */
	@Override
	public com.nbp.miic.stages.service.model.MiicRecommendationsDecision
			deleteMiicRecommendationsDecision(
				long miicRecommendationsDecisionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicRecommendationsDecisionLocalService.
			deleteMiicRecommendationsDecision(miicRecommendationsDecisionId);
	}

	/**
	 * Deletes the miic recommendations decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicRecommendationsDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicRecommendationsDecision the miic recommendations decision
	 * @return the miic recommendations decision that was removed
	 */
	@Override
	public com.nbp.miic.stages.service.model.MiicRecommendationsDecision
		deleteMiicRecommendationsDecision(
			com.nbp.miic.stages.service.model.MiicRecommendationsDecision
				miicRecommendationsDecision) {

		return _miicRecommendationsDecisionLocalService.
			deleteMiicRecommendationsDecision(miicRecommendationsDecision);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicRecommendationsDecisionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miicRecommendationsDecisionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miicRecommendationsDecisionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miicRecommendationsDecisionLocalService.dynamicQuery();
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

		return _miicRecommendationsDecisionLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.stages.service.model.impl.MiicRecommendationsDecisionModelImpl</code>.
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

		return _miicRecommendationsDecisionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.stages.service.model.impl.MiicRecommendationsDecisionModelImpl</code>.
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

		return _miicRecommendationsDecisionLocalService.dynamicQuery(
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

		return _miicRecommendationsDecisionLocalService.dynamicQueryCount(
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

		return _miicRecommendationsDecisionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.miic.stages.service.model.MiicRecommendationsDecision
		fetchMiicRecommendationsDecision(long miicRecommendationsDecisionId) {

		return _miicRecommendationsDecisionLocalService.
			fetchMiicRecommendationsDecision(miicRecommendationsDecisionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miicRecommendationsDecisionLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miicRecommendationsDecisionLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.miic.stages.service.model.MiicRecommendationsDecision
			getMiic_RD_by_CI(String caseId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicRecommendationsDecisionException {

		return _miicRecommendationsDecisionLocalService.getMiic_RD_by_CI(
			caseId);
	}

	/**
	 * Returns the miic recommendations decision with the primary key.
	 *
	 * @param miicRecommendationsDecisionId the primary key of the miic recommendations decision
	 * @return the miic recommendations decision
	 * @throws PortalException if a miic recommendations decision with the primary key could not be found
	 */
	@Override
	public com.nbp.miic.stages.service.model.MiicRecommendationsDecision
			getMiicRecommendationsDecision(long miicRecommendationsDecisionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicRecommendationsDecisionLocalService.
			getMiicRecommendationsDecision(miicRecommendationsDecisionId);
	}

	/**
	 * Returns a range of all the miic recommendations decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.stages.service.model.impl.MiicRecommendationsDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic recommendations decisions
	 * @param end the upper bound of the range of miic recommendations decisions (not inclusive)
	 * @return the range of miic recommendations decisions
	 */
	@Override
	public java.util.List
		<com.nbp.miic.stages.service.model.MiicRecommendationsDecision>
			getMiicRecommendationsDecisions(int start, int end) {

		return _miicRecommendationsDecisionLocalService.
			getMiicRecommendationsDecisions(start, end);
	}

	/**
	 * Returns the number of miic recommendations decisions.
	 *
	 * @return the number of miic recommendations decisions
	 */
	@Override
	public int getMiicRecommendationsDecisionsCount() {
		return _miicRecommendationsDecisionLocalService.
			getMiicRecommendationsDecisionsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicRecommendationsDecisionLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicRecommendationsDecisionLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the miic recommendations decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicRecommendationsDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicRecommendationsDecision the miic recommendations decision
	 * @return the miic recommendations decision that was updated
	 */
	@Override
	public com.nbp.miic.stages.service.model.MiicRecommendationsDecision
		updateMiicRecommendationsDecision(
			com.nbp.miic.stages.service.model.MiicRecommendationsDecision
				miicRecommendationsDecision) {

		return _miicRecommendationsDecisionLocalService.
			updateMiicRecommendationsDecision(miicRecommendationsDecision);
	}

	@Override
	public com.nbp.miic.stages.service.model.MiicRecommendationsDecision
		updateMiicRecommendationsDecision(
			String caseId, java.util.Date dateOfRecommendationsDecision,
			String recommendationsDecision) {

		return _miicRecommendationsDecisionLocalService.
			updateMiicRecommendationsDecision(
				caseId, dateOfRecommendationsDecision, recommendationsDecision);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miicRecommendationsDecisionLocalService.getBasePersistence();
	}

	@Override
	public MiicRecommendationsDecisionLocalService getWrappedService() {
		return _miicRecommendationsDecisionLocalService;
	}

	@Override
	public void setWrappedService(
		MiicRecommendationsDecisionLocalService
			miicRecommendationsDecisionLocalService) {

		_miicRecommendationsDecisionLocalService =
			miicRecommendationsDecisionLocalService;
	}

	private MiicRecommendationsDecisionLocalService
		_miicRecommendationsDecisionLocalService;

}