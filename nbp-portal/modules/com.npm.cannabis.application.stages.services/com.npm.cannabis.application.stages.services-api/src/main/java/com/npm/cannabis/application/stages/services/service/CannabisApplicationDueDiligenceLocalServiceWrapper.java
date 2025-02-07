/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisApplicationDueDiligenceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationDueDiligenceLocalService
 * @generated
 */
public class CannabisApplicationDueDiligenceLocalServiceWrapper
	implements CannabisApplicationDueDiligenceLocalService,
			   ServiceWrapper<CannabisApplicationDueDiligenceLocalService> {

	public CannabisApplicationDueDiligenceLocalServiceWrapper() {
		this(null);
	}

	public CannabisApplicationDueDiligenceLocalServiceWrapper(
		CannabisApplicationDueDiligenceLocalService
			cannabisApplicationDueDiligenceLocalService) {

		_cannabisApplicationDueDiligenceLocalService =
			cannabisApplicationDueDiligenceLocalService;
	}

	/**
	 * Adds the cannabis application due diligence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationDueDiligence the cannabis application due diligence
	 * @return the cannabis application due diligence that was added
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationDueDiligence addCannabisApplicationDueDiligence(
			com.npm.cannabis.application.stages.services.model.
				CannabisApplicationDueDiligence
					cannabisApplicationDueDiligence) {

		return _cannabisApplicationDueDiligenceLocalService.
			addCannabisApplicationDueDiligence(cannabisApplicationDueDiligence);
	}

	/**
	 * Creates a new cannabis application due diligence with the primary key. Does not add the cannabis application due diligence to the database.
	 *
	 * @param cannabisAppDDId the primary key for the new cannabis application due diligence
	 * @return the new cannabis application due diligence
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationDueDiligence createCannabisApplicationDueDiligence(
			long cannabisAppDDId) {

		return _cannabisApplicationDueDiligenceLocalService.
			createCannabisApplicationDueDiligence(cannabisAppDDId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationDueDiligenceLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the cannabis application due diligence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationDueDiligence the cannabis application due diligence
	 * @return the cannabis application due diligence that was removed
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationDueDiligence deleteCannabisApplicationDueDiligence(
			com.npm.cannabis.application.stages.services.model.
				CannabisApplicationDueDiligence
					cannabisApplicationDueDiligence) {

		return _cannabisApplicationDueDiligenceLocalService.
			deleteCannabisApplicationDueDiligence(
				cannabisApplicationDueDiligence);
	}

	/**
	 * Deletes the cannabis application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisAppDDId the primary key of the cannabis application due diligence
	 * @return the cannabis application due diligence that was removed
	 * @throws PortalException if a cannabis application due diligence with the primary key could not be found
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationDueDiligence deleteCannabisApplicationDueDiligence(
				long cannabisAppDDId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationDueDiligenceLocalService.
			deleteCannabisApplicationDueDiligence(cannabisAppDDId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationDueDiligenceLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisApplicationDueDiligenceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisApplicationDueDiligenceLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisApplicationDueDiligenceLocalService.dynamicQuery();
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

		return _cannabisApplicationDueDiligenceLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationDueDiligenceModelImpl</code>.
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

		return _cannabisApplicationDueDiligenceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationDueDiligenceModelImpl</code>.
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

		return _cannabisApplicationDueDiligenceLocalService.dynamicQuery(
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

		return _cannabisApplicationDueDiligenceLocalService.dynamicQueryCount(
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

		return _cannabisApplicationDueDiligenceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationDueDiligence fetchCannabisApplicationDueDiligence(
			long cannabisAppDDId) {

		return _cannabisApplicationDueDiligenceLocalService.
			fetchCannabisApplicationDueDiligence(cannabisAppDDId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisApplicationDueDiligenceLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the cannabis application due diligence with the primary key.
	 *
	 * @param cannabisAppDDId the primary key of the cannabis application due diligence
	 * @return the cannabis application due diligence
	 * @throws PortalException if a cannabis application due diligence with the primary key could not be found
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationDueDiligence getCannabisApplicationDueDiligence(
				long cannabisAppDDId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationDueDiligenceLocalService.
			getCannabisApplicationDueDiligence(cannabisAppDDId);
	}

	/**
	 * Returns a range of all the cannabis application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @return the range of cannabis application due diligences
	 */
	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisApplicationDueDiligence>
				getCannabisApplicationDueDiligences(int start, int end) {

		return _cannabisApplicationDueDiligenceLocalService.
			getCannabisApplicationDueDiligences(start, end);
	}

	/**
	 * Returns the number of cannabis application due diligences.
	 *
	 * @return the number of cannabis application due diligences
	 */
	@Override
	public int getCannabisApplicationDueDiligencesCount() {
		return _cannabisApplicationDueDiligenceLocalService.
			getCannabisApplicationDueDiligencesCount();
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationDueDiligence getCannabisApplicationDueDiligenceStage(
				String caseId, String agencyName)
			throws com.npm.cannabis.application.stages.services.exception.
				NoSuchCannabisApplicationDueDiligenceException {

		return _cannabisApplicationDueDiligenceLocalService.
			getCannabisApplicationDueDiligenceStage(caseId, agencyName);
	}

	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisApplicationDueDiligence>
				getCannabisApplicationDueDiligenceStages(String caseId) {

		return _cannabisApplicationDueDiligenceLocalService.
			getCannabisApplicationDueDiligenceStages(caseId);
	}

	@Override
	public java.util.List<String> getDistinctAgencies() {
		return _cannabisApplicationDueDiligenceLocalService.
			getDistinctAgencies();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisApplicationDueDiligenceLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationDueDiligenceLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationDueDiligenceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the cannabis application due diligence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationDueDiligence the cannabis application due diligence
	 * @return the cannabis application due diligence that was updated
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationDueDiligence updateCannabisApplicationDueDiligence(
			com.npm.cannabis.application.stages.services.model.
				CannabisApplicationDueDiligence
					cannabisApplicationDueDiligence) {

		return _cannabisApplicationDueDiligenceLocalService.
			updateCannabisApplicationDueDiligence(
				cannabisApplicationDueDiligence);
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationDueDiligence updateCannabisApplicationDueDiligence(
			String caseId, String agencyName, String agencyContactName,
			String agencyEmailAddress, java.util.Date dateFeedbackReceived,
			java.util.Date dateOfApplication,
			java.util.Date dateSubmittedToAgency,
			java.util.Date datefoDeadlineByAgency, String entityName,
			String status, String licenseNumber, String statusOfAgencyLetter,
			String agencyDecision) {

		return _cannabisApplicationDueDiligenceLocalService.
			updateCannabisApplicationDueDiligence(
				caseId, agencyName, agencyContactName, agencyEmailAddress,
				dateFeedbackReceived, dateOfApplication, dateSubmittedToAgency,
				datefoDeadlineByAgency, entityName, status, licenseNumber,
				statusOfAgencyLetter, agencyDecision);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisApplicationDueDiligenceLocalService.
			getBasePersistence();
	}

	@Override
	public CannabisApplicationDueDiligenceLocalService getWrappedService() {
		return _cannabisApplicationDueDiligenceLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationDueDiligenceLocalService
			cannabisApplicationDueDiligenceLocalService) {

		_cannabisApplicationDueDiligenceLocalService =
			cannabisApplicationDueDiligenceLocalService;
	}

	private CannabisApplicationDueDiligenceLocalService
		_cannabisApplicationDueDiligenceLocalService;

}