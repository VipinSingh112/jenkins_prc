/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjAppBoardDecisionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjAppBoardDecisionLocalService
 * @generated
 */
public class NcbjAppBoardDecisionLocalServiceWrapper
	implements NcbjAppBoardDecisionLocalService,
			   ServiceWrapper<NcbjAppBoardDecisionLocalService> {

	public NcbjAppBoardDecisionLocalServiceWrapper() {
		this(null);
	}

	public NcbjAppBoardDecisionLocalServiceWrapper(
		NcbjAppBoardDecisionLocalService ncbjAppBoardDecisionLocalService) {

		_ncbjAppBoardDecisionLocalService = ncbjAppBoardDecisionLocalService;
	}

	/**
	 * Adds the ncbj app board decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjAppBoardDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjAppBoardDecision the ncbj app board decision
	 * @return the ncbj app board decision that was added
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjAppBoardDecision
		addNcbjAppBoardDecision(
			com.nbp.ncbj.stages.services.model.NcbjAppBoardDecision
				ncbjAppBoardDecision) {

		return _ncbjAppBoardDecisionLocalService.addNcbjAppBoardDecision(
			ncbjAppBoardDecision);
	}

	/**
	 * Creates a new ncbj app board decision with the primary key. Does not add the ncbj app board decision to the database.
	 *
	 * @param ncbjAppBoardDecisionId the primary key for the new ncbj app board decision
	 * @return the new ncbj app board decision
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjAppBoardDecision
		createNcbjAppBoardDecision(long ncbjAppBoardDecisionId) {

		return _ncbjAppBoardDecisionLocalService.createNcbjAppBoardDecision(
			ncbjAppBoardDecisionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjAppBoardDecisionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncbj app board decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjAppBoardDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjAppBoardDecisionId the primary key of the ncbj app board decision
	 * @return the ncbj app board decision that was removed
	 * @throws PortalException if a ncbj app board decision with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjAppBoardDecision
			deleteNcbjAppBoardDecision(long ncbjAppBoardDecisionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjAppBoardDecisionLocalService.deleteNcbjAppBoardDecision(
			ncbjAppBoardDecisionId);
	}

	/**
	 * Deletes the ncbj app board decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjAppBoardDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjAppBoardDecision the ncbj app board decision
	 * @return the ncbj app board decision that was removed
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjAppBoardDecision
		deleteNcbjAppBoardDecision(
			com.nbp.ncbj.stages.services.model.NcbjAppBoardDecision
				ncbjAppBoardDecision) {

		return _ncbjAppBoardDecisionLocalService.deleteNcbjAppBoardDecision(
			ncbjAppBoardDecision);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjAppBoardDecisionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjAppBoardDecisionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjAppBoardDecisionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjAppBoardDecisionLocalService.dynamicQuery();
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

		return _ncbjAppBoardDecisionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjAppBoardDecisionModelImpl</code>.
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

		return _ncbjAppBoardDecisionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjAppBoardDecisionModelImpl</code>.
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

		return _ncbjAppBoardDecisionLocalService.dynamicQuery(
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

		return _ncbjAppBoardDecisionLocalService.dynamicQueryCount(
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

		return _ncbjAppBoardDecisionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjAppBoardDecision
		fetchNcbjAppBoardDecision(long ncbjAppBoardDecisionId) {

		return _ncbjAppBoardDecisionLocalService.fetchNcbjAppBoardDecision(
			ncbjAppBoardDecisionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjAppBoardDecisionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjAppBoardDecisionLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.ncbj.stages.services.model.NcbjAppBoardDecision> getNcbj_By_CD(
				String status)
			throws com.nbp.ncbj.stages.services.exception.
				NoSuchNcbjAppBoardDecisionException {

		return _ncbjAppBoardDecisionLocalService.getNcbj_By_CD(status);
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjAppBoardDecision
			getNcbj_CD_CI(String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjAppBoardDecisionException {

		return _ncbjAppBoardDecisionLocalService.getNcbj_CD_CI(caseId);
	}

	/**
	 * Returns the ncbj app board decision with the primary key.
	 *
	 * @param ncbjAppBoardDecisionId the primary key of the ncbj app board decision
	 * @return the ncbj app board decision
	 * @throws PortalException if a ncbj app board decision with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjAppBoardDecision
			getNcbjAppBoardDecision(long ncbjAppBoardDecisionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjAppBoardDecisionLocalService.getNcbjAppBoardDecision(
			ncbjAppBoardDecisionId);
	}

	/**
	 * Returns a range of all the ncbj app board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj app board decisions
	 * @param end the upper bound of the range of ncbj app board decisions (not inclusive)
	 * @return the range of ncbj app board decisions
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.stages.services.model.NcbjAppBoardDecision>
			getNcbjAppBoardDecisions(int start, int end) {

		return _ncbjAppBoardDecisionLocalService.getNcbjAppBoardDecisions(
			start, end);
	}

	/**
	 * Returns the number of ncbj app board decisions.
	 *
	 * @return the number of ncbj app board decisions
	 */
	@Override
	public int getNcbjAppBoardDecisionsCount() {
		return _ncbjAppBoardDecisionLocalService.
			getNcbjAppBoardDecisionsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjAppBoardDecisionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjAppBoardDecisionLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjAppBoardDecision
		updateJtbAppBoardDecision(
			String caseId, java.util.Date dateOfBoardDecision,
			String committeeDecision) {

		return _ncbjAppBoardDecisionLocalService.updateJtbAppBoardDecision(
			caseId, dateOfBoardDecision, committeeDecision);
	}

	/**
	 * Updates the ncbj app board decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjAppBoardDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjAppBoardDecision the ncbj app board decision
	 * @return the ncbj app board decision that was updated
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjAppBoardDecision
		updateNcbjAppBoardDecision(
			com.nbp.ncbj.stages.services.model.NcbjAppBoardDecision
				ncbjAppBoardDecision) {

		return _ncbjAppBoardDecisionLocalService.updateNcbjAppBoardDecision(
			ncbjAppBoardDecision);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjAppBoardDecisionLocalService.getBasePersistence();
	}

	@Override
	public NcbjAppBoardDecisionLocalService getWrappedService() {
		return _ncbjAppBoardDecisionLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjAppBoardDecisionLocalService ncbjAppBoardDecisionLocalService) {

		_ncbjAppBoardDecisionLocalService = ncbjAppBoardDecisionLocalService;
	}

	private NcbjAppBoardDecisionLocalService _ncbjAppBoardDecisionLocalService;

}