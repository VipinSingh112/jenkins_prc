/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjApplicationCorrectiveActionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicationCorrectiveActionLocalService
 * @generated
 */
public class NcbjApplicationCorrectiveActionLocalServiceWrapper
	implements NcbjApplicationCorrectiveActionLocalService,
			   ServiceWrapper<NcbjApplicationCorrectiveActionLocalService> {

	public NcbjApplicationCorrectiveActionLocalServiceWrapper() {
		this(null);
	}

	public NcbjApplicationCorrectiveActionLocalServiceWrapper(
		NcbjApplicationCorrectiveActionLocalService
			ncbjApplicationCorrectiveActionLocalService) {

		_ncbjApplicationCorrectiveActionLocalService =
			ncbjApplicationCorrectiveActionLocalService;
	}

	/**
	 * Adds the ncbj application corrective action to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationCorrectiveActionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicationCorrectiveAction the ncbj application corrective action
	 * @return the ncbj application corrective action that was added
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationCorrectiveAction
		addNcbjApplicationCorrectiveAction(
			com.nbp.ncbj.stages.services.model.NcbjApplicationCorrectiveAction
				ncbjApplicationCorrectiveAction) {

		return _ncbjApplicationCorrectiveActionLocalService.
			addNcbjApplicationCorrectiveAction(ncbjApplicationCorrectiveAction);
	}

	/**
	 * Creates a new ncbj application corrective action with the primary key. Does not add the ncbj application corrective action to the database.
	 *
	 * @param ncbjAppCorrActionId the primary key for the new ncbj application corrective action
	 * @return the new ncbj application corrective action
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationCorrectiveAction
		createNcbjApplicationCorrectiveAction(long ncbjAppCorrActionId) {

		return _ncbjApplicationCorrectiveActionLocalService.
			createNcbjApplicationCorrectiveAction(ncbjAppCorrActionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicationCorrectiveActionLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the ncbj application corrective action with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationCorrectiveActionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjAppCorrActionId the primary key of the ncbj application corrective action
	 * @return the ncbj application corrective action that was removed
	 * @throws PortalException if a ncbj application corrective action with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationCorrectiveAction
			deleteNcbjApplicationCorrectiveAction(long ncbjAppCorrActionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicationCorrectiveActionLocalService.
			deleteNcbjApplicationCorrectiveAction(ncbjAppCorrActionId);
	}

	/**
	 * Deletes the ncbj application corrective action from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationCorrectiveActionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicationCorrectiveAction the ncbj application corrective action
	 * @return the ncbj application corrective action that was removed
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationCorrectiveAction
		deleteNcbjApplicationCorrectiveAction(
			com.nbp.ncbj.stages.services.model.NcbjApplicationCorrectiveAction
				ncbjApplicationCorrectiveAction) {

		return _ncbjApplicationCorrectiveActionLocalService.
			deleteNcbjApplicationCorrectiveAction(
				ncbjApplicationCorrectiveAction);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicationCorrectiveActionLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjApplicationCorrectiveActionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjApplicationCorrectiveActionLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjApplicationCorrectiveActionLocalService.dynamicQuery();
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

		return _ncbjApplicationCorrectiveActionLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjApplicationCorrectiveActionModelImpl</code>.
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

		return _ncbjApplicationCorrectiveActionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjApplicationCorrectiveActionModelImpl</code>.
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

		return _ncbjApplicationCorrectiveActionLocalService.dynamicQuery(
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

		return _ncbjApplicationCorrectiveActionLocalService.dynamicQueryCount(
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

		return _ncbjApplicationCorrectiveActionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationCorrectiveAction
		fetchNcbjApplicationCorrectiveAction(long ncbjAppCorrActionId) {

		return _ncbjApplicationCorrectiveActionLocalService.
			fetchNcbjApplicationCorrectiveAction(ncbjAppCorrActionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjApplicationCorrectiveActionLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjApplicationCorrectiveActionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the ncbj application corrective action with the primary key.
	 *
	 * @param ncbjAppCorrActionId the primary key of the ncbj application corrective action
	 * @return the ncbj application corrective action
	 * @throws PortalException if a ncbj application corrective action with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationCorrectiveAction
			getNcbjApplicationCorrectiveAction(long ncbjAppCorrActionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicationCorrectiveActionLocalService.
			getNcbjApplicationCorrectiveAction(ncbjAppCorrActionId);
	}

	/**
	 * Returns a range of all the ncbj application corrective actions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjApplicationCorrectiveActionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application corrective actions
	 * @param end the upper bound of the range of ncbj application corrective actions (not inclusive)
	 * @return the range of ncbj application corrective actions
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.stages.services.model.NcbjApplicationCorrectiveAction>
			getNcbjApplicationCorrectiveActions(int start, int end) {

		return _ncbjApplicationCorrectiveActionLocalService.
			getNcbjApplicationCorrectiveActions(start, end);
	}

	/**
	 * Returns the number of ncbj application corrective actions.
	 *
	 * @return the number of ncbj application corrective actions
	 */
	@Override
	public int getNcbjApplicationCorrectiveActionsCount() {
		return _ncbjApplicationCorrectiveActionLocalService.
			getNcbjApplicationCorrectiveActionsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjApplicationCorrectiveActionLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicationCorrectiveActionLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationCorrectiveAction
			getPreAPprovalConditionBy_CI(String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationCorrectiveActionException {

		return _ncbjApplicationCorrectiveActionLocalService.
			getPreAPprovalConditionBy_CI(caseId);
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationCorrectiveAction
		updateCorrectionAction(String caseId, long ncbjAppCorrActionId) {

		return _ncbjApplicationCorrectiveActionLocalService.
			updateCorrectionAction(caseId, ncbjAppCorrActionId);
	}

	/**
	 * Updates the ncbj application corrective action in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationCorrectiveActionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicationCorrectiveAction the ncbj application corrective action
	 * @return the ncbj application corrective action that was updated
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationCorrectiveAction
		updateNcbjApplicationCorrectiveAction(
			com.nbp.ncbj.stages.services.model.NcbjApplicationCorrectiveAction
				ncbjApplicationCorrectiveAction) {

		return _ncbjApplicationCorrectiveActionLocalService.
			updateNcbjApplicationCorrectiveAction(
				ncbjApplicationCorrectiveAction);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjApplicationCorrectiveActionLocalService.
			getBasePersistence();
	}

	@Override
	public NcbjApplicationCorrectiveActionLocalService getWrappedService() {
		return _ncbjApplicationCorrectiveActionLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjApplicationCorrectiveActionLocalService
			ncbjApplicationCorrectiveActionLocalService) {

		_ncbjApplicationCorrectiveActionLocalService =
			ncbjApplicationCorrectiveActionLocalService;
	}

	private NcbjApplicationCorrectiveActionLocalService
		_ncbjApplicationCorrectiveActionLocalService;

}