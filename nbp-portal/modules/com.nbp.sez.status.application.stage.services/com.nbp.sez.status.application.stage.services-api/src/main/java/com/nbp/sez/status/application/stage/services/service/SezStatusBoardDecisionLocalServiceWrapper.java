/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezStatusBoardDecisionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusBoardDecisionLocalService
 * @generated
 */
public class SezStatusBoardDecisionLocalServiceWrapper
	implements ServiceWrapper<SezStatusBoardDecisionLocalService>,
			   SezStatusBoardDecisionLocalService {

	public SezStatusBoardDecisionLocalServiceWrapper() {
		this(null);
	}

	public SezStatusBoardDecisionLocalServiceWrapper(
		SezStatusBoardDecisionLocalService sezStatusBoardDecisionLocalService) {

		_sezStatusBoardDecisionLocalService =
			sezStatusBoardDecisionLocalService;
	}

	/**
	 * Adds the sez status board decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusBoardDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusBoardDecision the sez status board decision
	 * @return the sez status board decision that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusBoardDecision addSezStatusBoardDecision(
				com.nbp.sez.status.application.stage.services.model.
					SezStatusBoardDecision sezStatusBoardDecision) {

		return _sezStatusBoardDecisionLocalService.addSezStatusBoardDecision(
			sezStatusBoardDecision);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusBoardDecisionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez status board decision with the primary key. Does not add the sez status board decision to the database.
	 *
	 * @param sezStatusBoardId the primary key for the new sez status board decision
	 * @return the new sez status board decision
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusBoardDecision createSezStatusBoardDecision(
				long sezStatusBoardId) {

		return _sezStatusBoardDecisionLocalService.createSezStatusBoardDecision(
			sezStatusBoardId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusBoardDecisionLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez status board decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusBoardDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusBoardId the primary key of the sez status board decision
	 * @return the sez status board decision that was removed
	 * @throws PortalException if a sez status board decision with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusBoardDecision deleteSezStatusBoardDecision(
					long sezStatusBoardId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusBoardDecisionLocalService.deleteSezStatusBoardDecision(
			sezStatusBoardId);
	}

	/**
	 * Deletes the sez status board decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusBoardDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusBoardDecision the sez status board decision
	 * @return the sez status board decision that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusBoardDecision deleteSezStatusBoardDecision(
				com.nbp.sez.status.application.stage.services.model.
					SezStatusBoardDecision sezStatusBoardDecision) {

		return _sezStatusBoardDecisionLocalService.deleteSezStatusBoardDecision(
			sezStatusBoardDecision);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezStatusBoardDecisionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezStatusBoardDecisionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezStatusBoardDecisionLocalService.dynamicQuery();
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

		return _sezStatusBoardDecisionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusBoardDecisionModelImpl</code>.
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

		return _sezStatusBoardDecisionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusBoardDecisionModelImpl</code>.
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

		return _sezStatusBoardDecisionLocalService.dynamicQuery(
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

		return _sezStatusBoardDecisionLocalService.dynamicQueryCount(
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

		return _sezStatusBoardDecisionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusBoardDecision fetchSezStatusBoardDecision(
				long sezStatusBoardId) {

		return _sezStatusBoardDecisionLocalService.fetchSezStatusBoardDecision(
			sezStatusBoardId);
	}

	/**
	 * Returns the sez status board decision matching the UUID and group.
	 *
	 * @param uuid the sez status board decision's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusBoardDecision fetchSezStatusBoardDecisionByUuidAndGroupId(
				String uuid, long groupId) {

		return _sezStatusBoardDecisionLocalService.
			fetchSezStatusBoardDecisionByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezStatusBoardDecisionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _sezStatusBoardDecisionLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezStatusBoardDecisionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusBoardDecisionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusBoardDecisionLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusBoardDecision getSezStatus_Board_Decision_By_Id(
				String caseId) {

		return _sezStatusBoardDecisionLocalService.
			getSezStatus_Board_Decision_By_Id(caseId);
	}

	/**
	 * Returns the sez status board decision with the primary key.
	 *
	 * @param sezStatusBoardId the primary key of the sez status board decision
	 * @return the sez status board decision
	 * @throws PortalException if a sez status board decision with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusBoardDecision getSezStatusBoardDecision(
					long sezStatusBoardId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusBoardDecisionLocalService.getSezStatusBoardDecision(
			sezStatusBoardId);
	}

	/**
	 * Returns the sez status board decision matching the UUID and group.
	 *
	 * @param uuid the sez status board decision's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status board decision
	 * @throws PortalException if a matching sez status board decision could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusBoardDecision getSezStatusBoardDecisionByUuidAndGroupId(
					String uuid, long groupId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusBoardDecisionLocalService.
			getSezStatusBoardDecisionByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the sez status board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @return the range of sez status board decisions
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusBoardDecision> getSezStatusBoardDecisions(
				int start, int end) {

		return _sezStatusBoardDecisionLocalService.getSezStatusBoardDecisions(
			start, end);
	}

	/**
	 * Returns all the sez status board decisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status board decisions
	 * @param companyId the primary key of the company
	 * @return the matching sez status board decisions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusBoardDecision>
				getSezStatusBoardDecisionsByUuidAndCompanyId(
					String uuid, long companyId) {

		return _sezStatusBoardDecisionLocalService.
			getSezStatusBoardDecisionsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of sez status board decisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status board decisions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching sez status board decisions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusBoardDecision>
				getSezStatusBoardDecisionsByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.sez.status.application.stage.services.model.
							SezStatusBoardDecision> orderByComparator) {

		return _sezStatusBoardDecisionLocalService.
			getSezStatusBoardDecisionsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of sez status board decisions.
	 *
	 * @return the number of sez status board decisions
	 */
	@Override
	public int getSezStatusBoardDecisionsCount() {
		return _sezStatusBoardDecisionLocalService.
			getSezStatusBoardDecisionsCount();
	}

	/**
	 * Updates the sez status board decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusBoardDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusBoardDecision the sez status board decision
	 * @return the sez status board decision that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusBoardDecision updateSezStatusBoardDecision(
				com.nbp.sez.status.application.stage.services.model.
					SezStatusBoardDecision sezStatusBoardDecision) {

		return _sezStatusBoardDecisionLocalService.updateSezStatusBoardDecision(
			sezStatusBoardDecision);
	}

	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusBoardDecision updateSezStatusDecision(
				String caseId, java.util.Date dateOfBoardDecision,
				String boardDecisio) {

		return _sezStatusBoardDecisionLocalService.updateSezStatusDecision(
			caseId, dateOfBoardDecision, boardDecisio);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezStatusBoardDecisionLocalService.getBasePersistence();
	}

	@Override
	public SezStatusBoardDecisionLocalService getWrappedService() {
		return _sezStatusBoardDecisionLocalService;
	}

	@Override
	public void setWrappedService(
		SezStatusBoardDecisionLocalService sezStatusBoardDecisionLocalService) {

		_sezStatusBoardDecisionLocalService =
			sezStatusBoardDecisionLocalService;
	}

	private SezStatusBoardDecisionLocalService
		_sezStatusBoardDecisionLocalService;

}