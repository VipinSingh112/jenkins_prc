/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JtbAppBoardDecisionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JtbAppBoardDecisionLocalService
 * @generated
 */
public class JtbAppBoardDecisionLocalServiceWrapper
	implements JtbAppBoardDecisionLocalService,
			   ServiceWrapper<JtbAppBoardDecisionLocalService> {

	public JtbAppBoardDecisionLocalServiceWrapper() {
		this(null);
	}

	public JtbAppBoardDecisionLocalServiceWrapper(
		JtbAppBoardDecisionLocalService jtbAppBoardDecisionLocalService) {

		_jtbAppBoardDecisionLocalService = jtbAppBoardDecisionLocalService;
	}

	/**
	 * Adds the jtb app board decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAppBoardDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAppBoardDecision the jtb app board decision
	 * @return the jtb app board decision that was added
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JtbAppBoardDecision
		addJtbAppBoardDecision(
			com.nbp.jtb.application.stage.services.model.JtbAppBoardDecision
				jtbAppBoardDecision) {

		return _jtbAppBoardDecisionLocalService.addJtbAppBoardDecision(
			jtbAppBoardDecision);
	}

	/**
	 * Creates a new jtb app board decision with the primary key. Does not add the jtb app board decision to the database.
	 *
	 * @param jtbAppDeciBoardDecisionId the primary key for the new jtb app board decision
	 * @return the new jtb app board decision
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JtbAppBoardDecision
		createJtbAppBoardDecision(long jtbAppDeciBoardDecisionId) {

		return _jtbAppBoardDecisionLocalService.createJtbAppBoardDecision(
			jtbAppDeciBoardDecisionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAppBoardDecisionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jtb app board decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAppBoardDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAppBoardDecision the jtb app board decision
	 * @return the jtb app board decision that was removed
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JtbAppBoardDecision
		deleteJtbAppBoardDecision(
			com.nbp.jtb.application.stage.services.model.JtbAppBoardDecision
				jtbAppBoardDecision) {

		return _jtbAppBoardDecisionLocalService.deleteJtbAppBoardDecision(
			jtbAppBoardDecision);
	}

	/**
	 * Deletes the jtb app board decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAppBoardDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAppDeciBoardDecisionId the primary key of the jtb app board decision
	 * @return the jtb app board decision that was removed
	 * @throws PortalException if a jtb app board decision with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JtbAppBoardDecision
			deleteJtbAppBoardDecision(long jtbAppDeciBoardDecisionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAppBoardDecisionLocalService.deleteJtbAppBoardDecision(
			jtbAppDeciBoardDecisionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAppBoardDecisionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jtbAppBoardDecisionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jtbAppBoardDecisionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jtbAppBoardDecisionLocalService.dynamicQuery();
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

		return _jtbAppBoardDecisionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JtbAppBoardDecisionModelImpl</code>.
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

		return _jtbAppBoardDecisionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JtbAppBoardDecisionModelImpl</code>.
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

		return _jtbAppBoardDecisionLocalService.dynamicQuery(
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

		return _jtbAppBoardDecisionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _jtbAppBoardDecisionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.stage.services.model.JtbAppBoardDecision
		fetchJtbAppBoardDecision(long jtbAppDeciBoardDecisionId) {

		return _jtbAppBoardDecisionLocalService.fetchJtbAppBoardDecision(
			jtbAppDeciBoardDecisionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jtbAppBoardDecisionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jtbAppBoardDecisionLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.jtb.application.stage.services.model.JtbAppBoardDecision>
				getjtb_By_CD(String status)
			throws com.nbp.jtb.application.stage.services.exception.
				NoSuchJtbAppBoardDecisionException {

		return _jtbAppBoardDecisionLocalService.getjtb_By_CD(status);
	}

	@Override
	public com.nbp.jtb.application.stage.services.model.JtbAppBoardDecision
			getjtb_CD_CI(String caseId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbAppBoardDecisionException {

		return _jtbAppBoardDecisionLocalService.getjtb_CD_CI(caseId);
	}

	/**
	 * Returns the jtb app board decision with the primary key.
	 *
	 * @param jtbAppDeciBoardDecisionId the primary key of the jtb app board decision
	 * @return the jtb app board decision
	 * @throws PortalException if a jtb app board decision with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JtbAppBoardDecision
			getJtbAppBoardDecision(long jtbAppDeciBoardDecisionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAppBoardDecisionLocalService.getJtbAppBoardDecision(
			jtbAppDeciBoardDecisionId);
	}

	/**
	 * Returns a range of all the jtb app board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JtbAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb app board decisions
	 * @param end the upper bound of the range of jtb app board decisions (not inclusive)
	 * @return the range of jtb app board decisions
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.stage.services.model.JtbAppBoardDecision>
			getJtbAppBoardDecisions(int start, int end) {

		return _jtbAppBoardDecisionLocalService.getJtbAppBoardDecisions(
			start, end);
	}

	/**
	 * Returns the number of jtb app board decisions.
	 *
	 * @return the number of jtb app board decisions
	 */
	@Override
	public int getJtbAppBoardDecisionsCount() {
		return _jtbAppBoardDecisionLocalService.getJtbAppBoardDecisionsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbAppBoardDecisionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAppBoardDecisionLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the jtb app board decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAppBoardDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAppBoardDecision the jtb app board decision
	 * @return the jtb app board decision that was updated
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JtbAppBoardDecision
		updateJtbAppBoardDecision(
			com.nbp.jtb.application.stage.services.model.JtbAppBoardDecision
				jtbAppBoardDecision) {

		return _jtbAppBoardDecisionLocalService.updateJtbAppBoardDecision(
			jtbAppBoardDecision);
	}

	@Override
	public com.nbp.jtb.application.stage.services.model.JtbAppBoardDecision
		updateJtbAppBoardDecision(
			String caseId, java.util.Date dateOfBoardDecision,
			String committeeDecision) {

		return _jtbAppBoardDecisionLocalService.updateJtbAppBoardDecision(
			caseId, dateOfBoardDecision, committeeDecision);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jtbAppBoardDecisionLocalService.getBasePersistence();
	}

	@Override
	public JtbAppBoardDecisionLocalService getWrappedService() {
		return _jtbAppBoardDecisionLocalService;
	}

	@Override
	public void setWrappedService(
		JtbAppBoardDecisionLocalService jtbAppBoardDecisionLocalService) {

		_jtbAppBoardDecisionLocalService = jtbAppBoardDecisionLocalService;
	}

	private JtbAppBoardDecisionLocalService _jtbAppBoardDecisionLocalService;

}