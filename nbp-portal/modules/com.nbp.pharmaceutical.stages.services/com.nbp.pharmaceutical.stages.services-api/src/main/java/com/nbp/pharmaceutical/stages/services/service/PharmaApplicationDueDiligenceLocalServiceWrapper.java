/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link PharmaApplicationDueDiligenceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationDueDiligenceLocalService
 * @generated
 */
public class PharmaApplicationDueDiligenceLocalServiceWrapper
	implements PharmaApplicationDueDiligenceLocalService,
			   ServiceWrapper<PharmaApplicationDueDiligenceLocalService> {

	public PharmaApplicationDueDiligenceLocalServiceWrapper() {
		this(null);
	}

	public PharmaApplicationDueDiligenceLocalServiceWrapper(
		PharmaApplicationDueDiligenceLocalService
			pharmaApplicationDueDiligenceLocalService) {

		_pharmaApplicationDueDiligenceLocalService =
			pharmaApplicationDueDiligenceLocalService;
	}

	/**
	 * Adds the pharma application due diligence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationDueDiligence the pharma application due diligence
	 * @return the pharma application due diligence that was added
	 */
	@Override
	public
		com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationDueDiligence addPharmaApplicationDueDiligence(
				com.nbp.pharmaceutical.stages.services.model.
					PharmaApplicationDueDiligence
						pharmaApplicationDueDiligence) {

		return _pharmaApplicationDueDiligenceLocalService.
			addPharmaApplicationDueDiligence(pharmaApplicationDueDiligence);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationDueDiligenceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new pharma application due diligence with the primary key. Does not add the pharma application due diligence to the database.
	 *
	 * @param pharmaAppDDId the primary key for the new pharma application due diligence
	 * @return the new pharma application due diligence
	 */
	@Override
	public
		com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationDueDiligence createPharmaApplicationDueDiligence(
				long pharmaAppDDId) {

		return _pharmaApplicationDueDiligenceLocalService.
			createPharmaApplicationDueDiligence(pharmaAppDDId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationDueDiligenceLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the pharma application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaAppDDId the primary key of the pharma application due diligence
	 * @return the pharma application due diligence that was removed
	 * @throws PortalException if a pharma application due diligence with the primary key could not be found
	 */
	@Override
	public
		com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationDueDiligence deletePharmaApplicationDueDiligence(
					long pharmaAppDDId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationDueDiligenceLocalService.
			deletePharmaApplicationDueDiligence(pharmaAppDDId);
	}

	/**
	 * Deletes the pharma application due diligence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationDueDiligence the pharma application due diligence
	 * @return the pharma application due diligence that was removed
	 */
	@Override
	public
		com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationDueDiligence deletePharmaApplicationDueDiligence(
				com.nbp.pharmaceutical.stages.services.model.
					PharmaApplicationDueDiligence
						pharmaApplicationDueDiligence) {

		return _pharmaApplicationDueDiligenceLocalService.
			deletePharmaApplicationDueDiligence(pharmaApplicationDueDiligence);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pharmaApplicationDueDiligenceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pharmaApplicationDueDiligenceLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pharmaApplicationDueDiligenceLocalService.dynamicQuery();
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

		return _pharmaApplicationDueDiligenceLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationDueDiligenceModelImpl</code>.
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

		return _pharmaApplicationDueDiligenceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationDueDiligenceModelImpl</code>.
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

		return _pharmaApplicationDueDiligenceLocalService.dynamicQuery(
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

		return _pharmaApplicationDueDiligenceLocalService.dynamicQueryCount(
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

		return _pharmaApplicationDueDiligenceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationDueDiligence fetchPharmaApplicationDueDiligence(
				long pharmaAppDDId) {

		return _pharmaApplicationDueDiligenceLocalService.
			fetchPharmaApplicationDueDiligence(pharmaAppDDId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pharmaApplicationDueDiligenceLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pharmaApplicationDueDiligenceLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaApplicationDueDiligenceLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationDueDiligenceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the pharma application due diligence with the primary key.
	 *
	 * @param pharmaAppDDId the primary key of the pharma application due diligence
	 * @return the pharma application due diligence
	 * @throws PortalException if a pharma application due diligence with the primary key could not be found
	 */
	@Override
	public
		com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationDueDiligence getPharmaApplicationDueDiligence(
					long pharmaAppDDId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationDueDiligenceLocalService.
			getPharmaApplicationDueDiligence(pharmaAppDDId);
	}

	@Override
	public java.util.List
		<com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationDueDiligence> getPharmaApplicationDueDiligenceAN(
					String agencyName)
				throws com.nbp.pharmaceutical.stages.services.exception.
					NoSuchPharmaApplicationDueDiligenceException {

		return _pharmaApplicationDueDiligenceLocalService.
			getPharmaApplicationDueDiligenceAN(agencyName);
	}

	/**
	 * Returns a range of all the pharma application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @return the range of pharma application due diligences
	 */
	@Override
	public java.util.List
		<com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationDueDiligence> getPharmaApplicationDueDiligences(
				int start, int end) {

		return _pharmaApplicationDueDiligenceLocalService.
			getPharmaApplicationDueDiligences(start, end);
	}

	/**
	 * Returns the number of pharma application due diligences.
	 *
	 * @return the number of pharma application due diligences
	 */
	@Override
	public int getPharmaApplicationDueDiligencesCount() {
		return _pharmaApplicationDueDiligenceLocalService.
			getPharmaApplicationDueDiligencesCount();
	}

	@Override
	public
		com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationDueDiligence getPharmaApplicationDueDiligenceStage(
					String caseId, String agencyName)
				throws com.nbp.pharmaceutical.stages.services.exception.
					NoSuchPharmaApplicationDueDiligenceException {

		return _pharmaApplicationDueDiligenceLocalService.
			getPharmaApplicationDueDiligenceStage(caseId, agencyName);
	}

	/**
	 * Updates the pharma application due diligence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationDueDiligence the pharma application due diligence
	 * @return the pharma application due diligence that was updated
	 */
	@Override
	public
		com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationDueDiligence updatePharmaApplicationDueDiligence(
				com.nbp.pharmaceutical.stages.services.model.
					PharmaApplicationDueDiligence
						pharmaApplicationDueDiligence) {

		return _pharmaApplicationDueDiligenceLocalService.
			updatePharmaApplicationDueDiligence(pharmaApplicationDueDiligence);
	}

	@Override
	public
		com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationDueDiligence updatePharmaApplicationDueDiligence(
				String caseId, String agencyName,
				java.util.Date dateSubmittedToAgency,
				java.util.Date dateFeedbackReceived, String status,
				String durationOfTimeSpentAtAgency, String agencyDecision) {

		return _pharmaApplicationDueDiligenceLocalService.
			updatePharmaApplicationDueDiligence(
				caseId, agencyName, dateSubmittedToAgency, dateFeedbackReceived,
				status, durationOfTimeSpentAtAgency, agencyDecision);
	}

	@Override
	public
		com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationDueDiligence updatePharmaApplicationDueDiligence(
				String caseId, String agencyName, String agencyContactName,
				String agencyEmailAddress, java.util.Date dateFeedbackReceived,
				java.util.Date dateOfApplication,
				java.util.Date dateSubmittedToAgency,
				java.util.Date datefoDeadlineByAgency, String entityName,
				String status, String licenseNumber) {

		return _pharmaApplicationDueDiligenceLocalService.
			updatePharmaApplicationDueDiligence(
				caseId, agencyName, agencyContactName, agencyEmailAddress,
				dateFeedbackReceived, dateOfApplication, dateSubmittedToAgency,
				datefoDeadlineByAgency, entityName, status, licenseNumber);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _pharmaApplicationDueDiligenceLocalService.getBasePersistence();
	}

	@Override
	public PharmaApplicationDueDiligenceLocalService getWrappedService() {
		return _pharmaApplicationDueDiligenceLocalService;
	}

	@Override
	public void setWrappedService(
		PharmaApplicationDueDiligenceLocalService
			pharmaApplicationDueDiligenceLocalService) {

		_pharmaApplicationDueDiligenceLocalService =
			pharmaApplicationDueDiligenceLocalService;
	}

	private PharmaApplicationDueDiligenceLocalService
		_pharmaApplicationDueDiligenceLocalService;

}