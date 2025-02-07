/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ExplosiveCommisionDecisionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveCommisionDecisionLocalService
 * @generated
 */
public class ExplosiveCommisionDecisionLocalServiceWrapper
	implements ExplosiveCommisionDecisionLocalService,
			   ServiceWrapper<ExplosiveCommisionDecisionLocalService> {

	public ExplosiveCommisionDecisionLocalServiceWrapper() {
		this(null);
	}

	public ExplosiveCommisionDecisionLocalServiceWrapper(
		ExplosiveCommisionDecisionLocalService
			explosiveCommisionDecisionLocalService) {

		_explosiveCommisionDecisionLocalService =
			explosiveCommisionDecisionLocalService;
	}

	/**
	 * Adds the explosive commision decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveCommisionDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveCommisionDecision the explosive commision decision
	 * @return the explosive commision decision that was added
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveCommisionDecision addExplosiveCommisionDecision(
			com.nbp.explosives.competency.stages.service.model.
				ExplosiveCommisionDecision explosiveCommisionDecision) {

		return _explosiveCommisionDecisionLocalService.
			addExplosiveCommisionDecision(explosiveCommisionDecision);
	}

	/**
	 * Creates a new explosive commision decision with the primary key. Does not add the explosive commision decision to the database.
	 *
	 * @param commisiondecId the primary key for the new explosive commision decision
	 * @return the new explosive commision decision
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveCommisionDecision createExplosiveCommisionDecision(
			long commisiondecId) {

		return _explosiveCommisionDecisionLocalService.
			createExplosiveCommisionDecision(commisiondecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveCommisionDecisionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the explosive commision decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveCommisionDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveCommisionDecision the explosive commision decision
	 * @return the explosive commision decision that was removed
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveCommisionDecision deleteExplosiveCommisionDecision(
			com.nbp.explosives.competency.stages.service.model.
				ExplosiveCommisionDecision explosiveCommisionDecision) {

		return _explosiveCommisionDecisionLocalService.
			deleteExplosiveCommisionDecision(explosiveCommisionDecision);
	}

	/**
	 * Deletes the explosive commision decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveCommisionDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param commisiondecId the primary key of the explosive commision decision
	 * @return the explosive commision decision that was removed
	 * @throws PortalException if a explosive commision decision with the primary key could not be found
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveCommisionDecision deleteExplosiveCommisionDecision(
				long commisiondecId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveCommisionDecisionLocalService.
			deleteExplosiveCommisionDecision(commisiondecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveCommisionDecisionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _explosiveCommisionDecisionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _explosiveCommisionDecisionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _explosiveCommisionDecisionLocalService.dynamicQuery();
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

		return _explosiveCommisionDecisionLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveCommisionDecisionModelImpl</code>.
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

		return _explosiveCommisionDecisionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveCommisionDecisionModelImpl</code>.
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

		return _explosiveCommisionDecisionLocalService.dynamicQuery(
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

		return _explosiveCommisionDecisionLocalService.dynamicQueryCount(
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

		return _explosiveCommisionDecisionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveCommisionDecision fetchExplosiveCommisionDecision(
			long commisiondecId) {

		return _explosiveCommisionDecisionLocalService.
			fetchExplosiveCommisionDecision(commisiondecId);
	}

	/**
	 * Returns the explosive commision decision matching the UUID and group.
	 *
	 * @param uuid the explosive commision decision's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveCommisionDecision
			fetchExplosiveCommisionDecisionByUuidAndGroupId(
				String uuid, long groupId) {

		return _explosiveCommisionDecisionLocalService.
			fetchExplosiveCommisionDecisionByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _explosiveCommisionDecisionLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the explosive commision decision with the primary key.
	 *
	 * @param commisiondecId the primary key of the explosive commision decision
	 * @return the explosive commision decision
	 * @throws PortalException if a explosive commision decision with the primary key could not be found
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveCommisionDecision getExplosiveCommisionDecision(
				long commisiondecId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveCommisionDecisionLocalService.
			getExplosiveCommisionDecision(commisiondecId);
	}

	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveCommisionDecision getExplosiveCommisionDecisionBy_CI(
				String caseId)
			throws com.nbp.explosives.competency.stages.service.exception.
				NoSuchExplosiveCommisionDecisionException {

		return _explosiveCommisionDecisionLocalService.
			getExplosiveCommisionDecisionBy_CI(caseId);
	}

	/**
	 * Returns the explosive commision decision matching the UUID and group.
	 *
	 * @param uuid the explosive commision decision's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosive commision decision
	 * @throws PortalException if a matching explosive commision decision could not be found
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveCommisionDecision
				getExplosiveCommisionDecisionByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveCommisionDecisionLocalService.
			getExplosiveCommisionDecisionByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the explosive commision decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @return the range of explosive commision decisions
	 */
	@Override
	public java.util.List
		<com.nbp.explosives.competency.stages.service.model.
			ExplosiveCommisionDecision> getExplosiveCommisionDecisions(
				int start, int end) {

		return _explosiveCommisionDecisionLocalService.
			getExplosiveCommisionDecisions(start, end);
	}

	/**
	 * Returns all the explosive commision decisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosive commision decisions
	 * @param companyId the primary key of the company
	 * @return the matching explosive commision decisions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.explosives.competency.stages.service.model.
			ExplosiveCommisionDecision>
				getExplosiveCommisionDecisionsByUuidAndCompanyId(
					String uuid, long companyId) {

		return _explosiveCommisionDecisionLocalService.
			getExplosiveCommisionDecisionsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of explosive commision decisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosive commision decisions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching explosive commision decisions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.explosives.competency.stages.service.model.
			ExplosiveCommisionDecision>
				getExplosiveCommisionDecisionsByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.explosives.competency.stages.service.model.
							ExplosiveCommisionDecision> orderByComparator) {

		return _explosiveCommisionDecisionLocalService.
			getExplosiveCommisionDecisionsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of explosive commision decisions.
	 *
	 * @return the number of explosive commision decisions
	 */
	@Override
	public int getExplosiveCommisionDecisionsCount() {
		return _explosiveCommisionDecisionLocalService.
			getExplosiveCommisionDecisionsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _explosiveCommisionDecisionLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _explosiveCommisionDecisionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _explosiveCommisionDecisionLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveCommisionDecisionLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the explosive commision decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveCommisionDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveCommisionDecision the explosive commision decision
	 * @return the explosive commision decision that was updated
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveCommisionDecision updateExplosiveCommisionDecision(
			com.nbp.explosives.competency.stages.service.model.
				ExplosiveCommisionDecision explosiveCommisionDecision) {

		return _explosiveCommisionDecisionLocalService.
			updateExplosiveCommisionDecision(explosiveCommisionDecision);
	}

	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveCommisionDecision updateExplosiveCommisionDecision(
				String caseId, java.util.Date dateOfDecision,
				String commisionDecision)
			throws com.nbp.explosives.competency.stages.service.exception.
				NoSuchExplosiveCommisionDecisionException {

		return _explosiveCommisionDecisionLocalService.
			updateExplosiveCommisionDecision(
				caseId, dateOfDecision, commisionDecision);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _explosiveCommisionDecisionLocalService.getBasePersistence();
	}

	@Override
	public ExplosiveCommisionDecisionLocalService getWrappedService() {
		return _explosiveCommisionDecisionLocalService;
	}

	@Override
	public void setWrappedService(
		ExplosiveCommisionDecisionLocalService
			explosiveCommisionDecisionLocalService) {

		_explosiveCommisionDecisionLocalService =
			explosiveCommisionDecisionLocalService;
	}

	private ExplosiveCommisionDecisionLocalService
		_explosiveCommisionDecisionLocalService;

}