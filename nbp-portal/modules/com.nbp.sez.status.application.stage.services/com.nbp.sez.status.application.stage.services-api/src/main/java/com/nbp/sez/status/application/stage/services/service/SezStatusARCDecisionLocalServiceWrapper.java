/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezStatusARCDecisionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusARCDecisionLocalService
 * @generated
 */
public class SezStatusARCDecisionLocalServiceWrapper
	implements ServiceWrapper<SezStatusARCDecisionLocalService>,
			   SezStatusARCDecisionLocalService {

	public SezStatusARCDecisionLocalServiceWrapper() {
		this(null);
	}

	public SezStatusARCDecisionLocalServiceWrapper(
		SezStatusARCDecisionLocalService sezStatusARCDecisionLocalService) {

		_sezStatusARCDecisionLocalService = sezStatusARCDecisionLocalService;
	}

	/**
	 * Adds the sez status arc decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusARCDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusARCDecision the sez status arc decision
	 * @return the sez status arc decision that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.SezStatusARCDecision
			addSezStatusARCDecision(
				com.nbp.sez.status.application.stage.services.model.
					SezStatusARCDecision sezStatusARCDecision) {

		return _sezStatusARCDecisionLocalService.addSezStatusARCDecision(
			sezStatusARCDecision);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusARCDecisionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez status arc decision with the primary key. Does not add the sez status arc decision to the database.
	 *
	 * @param sezStatusCommitteeId the primary key for the new sez status arc decision
	 * @return the new sez status arc decision
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.SezStatusARCDecision
			createSezStatusARCDecision(long sezStatusCommitteeId) {

		return _sezStatusARCDecisionLocalService.createSezStatusARCDecision(
			sezStatusCommitteeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusARCDecisionLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez status arc decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusARCDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusCommitteeId the primary key of the sez status arc decision
	 * @return the sez status arc decision that was removed
	 * @throws PortalException if a sez status arc decision with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.SezStatusARCDecision
				deleteSezStatusARCDecision(long sezStatusCommitteeId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusARCDecisionLocalService.deleteSezStatusARCDecision(
			sezStatusCommitteeId);
	}

	/**
	 * Deletes the sez status arc decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusARCDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusARCDecision the sez status arc decision
	 * @return the sez status arc decision that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.SezStatusARCDecision
			deleteSezStatusARCDecision(
				com.nbp.sez.status.application.stage.services.model.
					SezStatusARCDecision sezStatusARCDecision) {

		return _sezStatusARCDecisionLocalService.deleteSezStatusARCDecision(
			sezStatusARCDecision);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezStatusARCDecisionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezStatusARCDecisionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezStatusARCDecisionLocalService.dynamicQuery();
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

		return _sezStatusARCDecisionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusARCDecisionModelImpl</code>.
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

		return _sezStatusARCDecisionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusARCDecisionModelImpl</code>.
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

		return _sezStatusARCDecisionLocalService.dynamicQuery(
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

		return _sezStatusARCDecisionLocalService.dynamicQueryCount(
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

		return _sezStatusARCDecisionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.stage.services.model.SezStatusARCDecision
			fetchSezStatusARCDecision(long sezStatusCommitteeId) {

		return _sezStatusARCDecisionLocalService.fetchSezStatusARCDecision(
			sezStatusCommitteeId);
	}

	/**
	 * Returns the sez status arc decision matching the UUID and group.
	 *
	 * @param uuid the sez status arc decision's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status arc decision, or <code>null</code> if a matching sez status arc decision could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.SezStatusARCDecision
			fetchSezStatusARCDecisionByUuidAndGroupId(
				String uuid, long groupId) {

		return _sezStatusARCDecisionLocalService.
			fetchSezStatusARCDecisionByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezStatusARCDecisionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _sezStatusARCDecisionLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezStatusARCDecisionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusARCDecisionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusARCDecisionLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.sez.status.application.stage.services.model.SezStatusARCDecision
				getSeStatusARCDecision_By_CI(String caseId)
			throws com.nbp.sez.status.application.stage.services.exception.
				NoSuchSezStatusARCDecisionException {

		return _sezStatusARCDecisionLocalService.getSeStatusARCDecision_By_CI(
			caseId);
	}

	/**
	 * Returns the sez status arc decision with the primary key.
	 *
	 * @param sezStatusCommitteeId the primary key of the sez status arc decision
	 * @return the sez status arc decision
	 * @throws PortalException if a sez status arc decision with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.SezStatusARCDecision
				getSezStatusARCDecision(long sezStatusCommitteeId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusARCDecisionLocalService.getSezStatusARCDecision(
			sezStatusCommitteeId);
	}

	/**
	 * Returns the sez status arc decision matching the UUID and group.
	 *
	 * @param uuid the sez status arc decision's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status arc decision
	 * @throws PortalException if a matching sez status arc decision could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.SezStatusARCDecision
				getSezStatusARCDecisionByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusARCDecisionLocalService.
			getSezStatusARCDecisionByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the sez status arc decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusARCDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @return the range of sez status arc decisions
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusARCDecision> getSezStatusARCDecisions(int start, int end) {

		return _sezStatusARCDecisionLocalService.getSezStatusARCDecisions(
			start, end);
	}

	/**
	 * Returns all the sez status arc decisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status arc decisions
	 * @param companyId the primary key of the company
	 * @return the matching sez status arc decisions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusARCDecision> getSezStatusARCDecisionsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _sezStatusARCDecisionLocalService.
			getSezStatusARCDecisionsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of sez status arc decisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status arc decisions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching sez status arc decisions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusARCDecision> getSezStatusARCDecisionsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.sez.status.application.stage.services.model.
						SezStatusARCDecision> orderByComparator) {

		return _sezStatusARCDecisionLocalService.
			getSezStatusARCDecisionsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of sez status arc decisions.
	 *
	 * @return the number of sez status arc decisions
	 */
	@Override
	public int getSezStatusARCDecisionsCount() {
		return _sezStatusARCDecisionLocalService.
			getSezStatusARCDecisionsCount();
	}

	/**
	 * Updates the sez status arc decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusARCDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusARCDecision the sez status arc decision
	 * @return the sez status arc decision that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.SezStatusARCDecision
			updateSezStatusARCDecision(
				com.nbp.sez.status.application.stage.services.model.
					SezStatusARCDecision sezStatusARCDecision) {

		return _sezStatusARCDecisionLocalService.updateSezStatusARCDecision(
			sezStatusARCDecision);
	}

	@Override
	public
		com.nbp.sez.status.application.stage.services.model.SezStatusARCDecision
			updateSezStatusARCDecision(
				String caseId, String committeeDecision,
				java.util.Date dateOfdecision) {

		return _sezStatusARCDecisionLocalService.updateSezStatusARCDecision(
			caseId, committeeDecision, dateOfdecision);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezStatusARCDecisionLocalService.getBasePersistence();
	}

	@Override
	public SezStatusARCDecisionLocalService getWrappedService() {
		return _sezStatusARCDecisionLocalService;
	}

	@Override
	public void setWrappedService(
		SezStatusARCDecisionLocalService sezStatusARCDecisionLocalService) {

		_sezStatusARCDecisionLocalService = sezStatusARCDecisionLocalService;
	}

	private SezStatusARCDecisionLocalService _sezStatusARCDecisionLocalService;

}