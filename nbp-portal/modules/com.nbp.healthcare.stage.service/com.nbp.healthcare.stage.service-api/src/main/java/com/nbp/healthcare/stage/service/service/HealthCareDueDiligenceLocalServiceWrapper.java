/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HealthCareDueDiligenceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareDueDiligenceLocalService
 * @generated
 */
public class HealthCareDueDiligenceLocalServiceWrapper
	implements HealthCareDueDiligenceLocalService,
			   ServiceWrapper<HealthCareDueDiligenceLocalService> {

	public HealthCareDueDiligenceLocalServiceWrapper() {
		this(null);
	}

	public HealthCareDueDiligenceLocalServiceWrapper(
		HealthCareDueDiligenceLocalService healthCareDueDiligenceLocalService) {

		_healthCareDueDiligenceLocalService =
			healthCareDueDiligenceLocalService;
	}

	/**
	 * Adds the health care due diligence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareDueDiligence the health care due diligence
	 * @return the health care due diligence that was added
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthCareDueDiligence
		addHealthCareDueDiligence(
			com.nbp.healthcare.stage.service.model.HealthCareDueDiligence
				healthCareDueDiligence) {

		return _healthCareDueDiligenceLocalService.addHealthCareDueDiligence(
			healthCareDueDiligence);
	}

	/**
	 * Creates a new health care due diligence with the primary key. Does not add the health care due diligence to the database.
	 *
	 * @param healthDDId the primary key for the new health care due diligence
	 * @return the new health care due diligence
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthCareDueDiligence
		createHealthCareDueDiligence(long healthDDId) {

		return _healthCareDueDiligenceLocalService.createHealthCareDueDiligence(
			healthDDId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareDueDiligenceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the health care due diligence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareDueDiligence the health care due diligence
	 * @return the health care due diligence that was removed
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthCareDueDiligence
		deleteHealthCareDueDiligence(
			com.nbp.healthcare.stage.service.model.HealthCareDueDiligence
				healthCareDueDiligence) {

		return _healthCareDueDiligenceLocalService.deleteHealthCareDueDiligence(
			healthCareDueDiligence);
	}

	/**
	 * Deletes the health care due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthDDId the primary key of the health care due diligence
	 * @return the health care due diligence that was removed
	 * @throws PortalException if a health care due diligence with the primary key could not be found
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthCareDueDiligence
			deleteHealthCareDueDiligence(long healthDDId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareDueDiligenceLocalService.deleteHealthCareDueDiligence(
			healthDDId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareDueDiligenceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _healthCareDueDiligenceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _healthCareDueDiligenceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _healthCareDueDiligenceLocalService.dynamicQuery();
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

		return _healthCareDueDiligenceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthCareDueDiligenceModelImpl</code>.
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

		return _healthCareDueDiligenceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthCareDueDiligenceModelImpl</code>.
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

		return _healthCareDueDiligenceLocalService.dynamicQuery(
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

		return _healthCareDueDiligenceLocalService.dynamicQueryCount(
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

		return _healthCareDueDiligenceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.healthcare.stage.service.model.HealthCareDueDiligence
		fetchHealthCareDueDiligence(long healthDDId) {

		return _healthCareDueDiligenceLocalService.fetchHealthCareDueDiligence(
			healthDDId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _healthCareDueDiligenceLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<String> getDistinctAgencies() {
		return _healthCareDueDiligenceLocalService.getDistinctAgencies();
	}

	@Override
	public com.nbp.healthcare.stage.service.model.HealthCareDueDiligence
			getHealthCareBy_CI(String caseId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthCareDueDiligenceException {

		return _healthCareDueDiligenceLocalService.getHealthCareBy_CI(caseId);
	}

	/**
	 * Returns the health care due diligence with the primary key.
	 *
	 * @param healthDDId the primary key of the health care due diligence
	 * @return the health care due diligence
	 * @throws PortalException if a health care due diligence with the primary key could not be found
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthCareDueDiligence
			getHealthCareDueDiligence(long healthDDId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareDueDiligenceLocalService.getHealthCareDueDiligence(
			healthDDId);
	}

	@Override
	public com.nbp.healthcare.stage.service.model.HealthCareDueDiligence
			getHealthCareDueDiligenceBy_CI_SN(String caseId, String agncyName)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthCareDueDiligenceException {

		return _healthCareDueDiligenceLocalService.
			getHealthCareDueDiligenceBy_CI_SN(caseId, agncyName);
	}

	/**
	 * Returns a range of all the health care due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthCareDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care due diligences
	 * @param end the upper bound of the range of health care due diligences (not inclusive)
	 * @return the range of health care due diligences
	 */
	@Override
	public java.util.List
		<com.nbp.healthcare.stage.service.model.HealthCareDueDiligence>
			getHealthCareDueDiligences(int start, int end) {

		return _healthCareDueDiligenceLocalService.getHealthCareDueDiligences(
			start, end);
	}

	/**
	 * Returns the number of health care due diligences.
	 *
	 * @return the number of health care due diligences
	 */
	@Override
	public int getHealthCareDueDiligencesCount() {
		return _healthCareDueDiligenceLocalService.
			getHealthCareDueDiligencesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _healthCareDueDiligenceLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthCareDueDiligenceLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareDueDiligenceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the health care due diligence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareDueDiligence the health care due diligence
	 * @return the health care due diligence that was updated
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthCareDueDiligence
		updateHealthCareDueDiligence(
			com.nbp.healthcare.stage.service.model.HealthCareDueDiligence
				healthCareDueDiligence) {

		return _healthCareDueDiligenceLocalService.updateHealthCareDueDiligence(
			healthCareDueDiligence);
	}

	@Override
	public com.nbp.healthcare.stage.service.model.HealthCareDueDiligence
		updateHealthCareDueDiligence(
			String caseId, java.util.Date dateSubmittedAgency,
			String nameofAgency, String Status,
			java.util.Date feedbackReceived) {

		return _healthCareDueDiligenceLocalService.updateHealthCareDueDiligence(
			caseId, dateSubmittedAgency, nameofAgency, Status,
			feedbackReceived);
	}

	@Override
	public com.nbp.healthcare.stage.service.model.HealthCareDueDiligence
		updateHealthCareDueDiligence(
			String caseId, java.util.Date dateSubmittedAgency,
			String nameofAgency, String Status, java.util.Date feedbackReceived,
			String reasonForObejction, String agencyDecision) {

		return _healthCareDueDiligenceLocalService.updateHealthCareDueDiligence(
			caseId, dateSubmittedAgency, nameofAgency, Status, feedbackReceived,
			reasonForObejction, agencyDecision);
	}

	@Override
	public com.nbp.healthcare.stage.service.model.HealthCareDueDiligence
		updateHealthCareDueDiligence(
			String caseId, java.util.Date dateSubmittedAgency,
			String nameofAgency, String Status, java.util.Date feedbackReceived,
			String reasonForObejction, String agencyDecision,
			String durationOfPeriod) {

		return _healthCareDueDiligenceLocalService.updateHealthCareDueDiligence(
			caseId, dateSubmittedAgency, nameofAgency, Status, feedbackReceived,
			reasonForObejction, agencyDecision, durationOfPeriod);
	}

	@Override
	public com.nbp.healthcare.stage.service.model.HealthCareDueDiligence
		updateHealthCareDueDiligence(
			String caseId, java.util.Date dateSubmittedAgency,
			String nameofAgency, String Status, String feedbackReceived,
			java.util.Date date) {

		return _healthCareDueDiligenceLocalService.updateHealthCareDueDiligence(
			caseId, dateSubmittedAgency, nameofAgency, Status, feedbackReceived,
			date);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _healthCareDueDiligenceLocalService.getBasePersistence();
	}

	@Override
	public HealthCareDueDiligenceLocalService getWrappedService() {
		return _healthCareDueDiligenceLocalService;
	}

	@Override
	public void setWrappedService(
		HealthCareDueDiligenceLocalService healthCareDueDiligenceLocalService) {

		_healthCareDueDiligenceLocalService =
			healthCareDueDiligenceLocalService;
	}

	private HealthCareDueDiligenceLocalService
		_healthCareDueDiligenceLocalService;

}