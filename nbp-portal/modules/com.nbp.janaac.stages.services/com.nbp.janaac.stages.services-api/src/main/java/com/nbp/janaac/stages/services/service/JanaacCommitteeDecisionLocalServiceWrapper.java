/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JanaacCommitteeDecisionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacCommitteeDecisionLocalService
 * @generated
 */
public class JanaacCommitteeDecisionLocalServiceWrapper
	implements JanaacCommitteeDecisionLocalService,
			   ServiceWrapper<JanaacCommitteeDecisionLocalService> {

	public JanaacCommitteeDecisionLocalServiceWrapper() {
		this(null);
	}

	public JanaacCommitteeDecisionLocalServiceWrapper(
		JanaacCommitteeDecisionLocalService
			janaacCommitteeDecisionLocalService) {

		_janaacCommitteeDecisionLocalService =
			janaacCommitteeDecisionLocalService;
	}

	/**
	 * Adds the janaac committee decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacCommitteeDecision the janaac committee decision
	 * @return the janaac committee decision that was added
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacCommitteeDecision
		addJanaacCommitteeDecision(
			com.nbp.janaac.stages.services.model.JanaacCommitteeDecision
				janaacCommitteeDecision) {

		return _janaacCommitteeDecisionLocalService.addJanaacCommitteeDecision(
			janaacCommitteeDecision);
	}

	/**
	 * Creates a new janaac committee decision with the primary key. Does not add the janaac committee decision to the database.
	 *
	 * @param janaacCommitteeDecisionId the primary key for the new janaac committee decision
	 * @return the new janaac committee decision
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacCommitteeDecision
		createJanaacCommitteeDecision(long janaacCommitteeDecisionId) {

		return _janaacCommitteeDecisionLocalService.
			createJanaacCommitteeDecision(janaacCommitteeDecisionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacCommitteeDecisionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the janaac committee decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacCommitteeDecision the janaac committee decision
	 * @return the janaac committee decision that was removed
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacCommitteeDecision
		deleteJanaacCommitteeDecision(
			com.nbp.janaac.stages.services.model.JanaacCommitteeDecision
				janaacCommitteeDecision) {

		return _janaacCommitteeDecisionLocalService.
			deleteJanaacCommitteeDecision(janaacCommitteeDecision);
	}

	/**
	 * Deletes the janaac committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacCommitteeDecisionId the primary key of the janaac committee decision
	 * @return the janaac committee decision that was removed
	 * @throws PortalException if a janaac committee decision with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacCommitteeDecision
			deleteJanaacCommitteeDecision(long janaacCommitteeDecisionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacCommitteeDecisionLocalService.
			deleteJanaacCommitteeDecision(janaacCommitteeDecisionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacCommitteeDecisionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _janaacCommitteeDecisionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _janaacCommitteeDecisionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _janaacCommitteeDecisionLocalService.dynamicQuery();
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

		return _janaacCommitteeDecisionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacCommitteeDecisionModelImpl</code>.
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

		return _janaacCommitteeDecisionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacCommitteeDecisionModelImpl</code>.
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

		return _janaacCommitteeDecisionLocalService.dynamicQuery(
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

		return _janaacCommitteeDecisionLocalService.dynamicQueryCount(
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

		return _janaacCommitteeDecisionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.stages.services.model.JanaacCommitteeDecision
		fetchJanaacCommitteeDecision(long janaacCommitteeDecisionId) {

		return _janaacCommitteeDecisionLocalService.
			fetchJanaacCommitteeDecision(janaacCommitteeDecisionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _janaacCommitteeDecisionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _janaacCommitteeDecisionLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.janaac.stages.services.model.JanaacCommitteeDecision
			getJanaac_by_caseId(String caseId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacCommitteeDecisionException {

		return _janaacCommitteeDecisionLocalService.getJanaac_by_caseId(caseId);
	}

	/**
	 * Returns the janaac committee decision with the primary key.
	 *
	 * @param janaacCommitteeDecisionId the primary key of the janaac committee decision
	 * @return the janaac committee decision
	 * @throws PortalException if a janaac committee decision with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacCommitteeDecision
			getJanaacCommitteeDecision(long janaacCommitteeDecisionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacCommitteeDecisionLocalService.getJanaacCommitteeDecision(
			janaacCommitteeDecisionId);
	}

	/**
	 * Returns a range of all the janaac committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac committee decisions
	 * @param end the upper bound of the range of janaac committee decisions (not inclusive)
	 * @return the range of janaac committee decisions
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.stages.services.model.JanaacCommitteeDecision>
			getJanaacCommitteeDecisions(int start, int end) {

		return _janaacCommitteeDecisionLocalService.getJanaacCommitteeDecisions(
			start, end);
	}

	/**
	 * Returns the number of janaac committee decisions.
	 *
	 * @return the number of janaac committee decisions
	 */
	@Override
	public int getJanaacCommitteeDecisionsCount() {
		return _janaacCommitteeDecisionLocalService.
			getJanaacCommitteeDecisionsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _janaacCommitteeDecisionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacCommitteeDecisionLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.janaac.stages.services.model.JanaacCommitteeDecision
		updateJanaacApplicationCommitteeDecision(
			String caseId, java.util.Date dateOfCommitteeDecision,
			String committeeDecision) {

		return _janaacCommitteeDecisionLocalService.
			updateJanaacApplicationCommitteeDecision(
				caseId, dateOfCommitteeDecision, committeeDecision);
	}

	/**
	 * Updates the janaac committee decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacCommitteeDecision the janaac committee decision
	 * @return the janaac committee decision that was updated
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacCommitteeDecision
		updateJanaacCommitteeDecision(
			com.nbp.janaac.stages.services.model.JanaacCommitteeDecision
				janaacCommitteeDecision) {

		return _janaacCommitteeDecisionLocalService.
			updateJanaacCommitteeDecision(janaacCommitteeDecision);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _janaacCommitteeDecisionLocalService.getBasePersistence();
	}

	@Override
	public JanaacCommitteeDecisionLocalService getWrappedService() {
		return _janaacCommitteeDecisionLocalService;
	}

	@Override
	public void setWrappedService(
		JanaacCommitteeDecisionLocalService
			janaacCommitteeDecisionLocalService) {

		_janaacCommitteeDecisionLocalService =
			janaacCommitteeDecisionLocalService;
	}

	private JanaacCommitteeDecisionLocalService
		_janaacCommitteeDecisionLocalService;

}