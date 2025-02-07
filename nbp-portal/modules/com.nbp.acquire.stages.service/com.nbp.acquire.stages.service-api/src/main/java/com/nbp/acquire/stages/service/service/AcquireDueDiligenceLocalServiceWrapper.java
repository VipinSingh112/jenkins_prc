/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcquireDueDiligenceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDueDiligenceLocalService
 * @generated
 */
public class AcquireDueDiligenceLocalServiceWrapper
	implements AcquireDueDiligenceLocalService,
			   ServiceWrapper<AcquireDueDiligenceLocalService> {

	public AcquireDueDiligenceLocalServiceWrapper() {
		this(null);
	}

	public AcquireDueDiligenceLocalServiceWrapper(
		AcquireDueDiligenceLocalService acquireDueDiligenceLocalService) {

		_acquireDueDiligenceLocalService = acquireDueDiligenceLocalService;
	}

	/**
	 * Adds the acquire due diligence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDueDiligence the acquire due diligence
	 * @return the acquire due diligence that was added
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireDueDiligence
		addAcquireDueDiligence(
			com.nbp.acquire.stages.service.model.AcquireDueDiligence
				acquireDueDiligence) {

		return _acquireDueDiligenceLocalService.addAcquireDueDiligence(
			acquireDueDiligence);
	}

	/**
	 * Creates a new acquire due diligence with the primary key. Does not add the acquire due diligence to the database.
	 *
	 * @param sampleId the primary key for the new acquire due diligence
	 * @return the new acquire due diligence
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireDueDiligence
		createAcquireDueDiligence(long sampleId) {

		return _acquireDueDiligenceLocalService.createAcquireDueDiligence(
			sampleId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireDueDiligenceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acquire due diligence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDueDiligence the acquire due diligence
	 * @return the acquire due diligence that was removed
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireDueDiligence
		deleteAcquireDueDiligence(
			com.nbp.acquire.stages.service.model.AcquireDueDiligence
				acquireDueDiligence) {

		return _acquireDueDiligenceLocalService.deleteAcquireDueDiligence(
			acquireDueDiligence);
	}

	/**
	 * Deletes the acquire due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sampleId the primary key of the acquire due diligence
	 * @return the acquire due diligence that was removed
	 * @throws PortalException if a acquire due diligence with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireDueDiligence
			deleteAcquireDueDiligence(long sampleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireDueDiligenceLocalService.deleteAcquireDueDiligence(
			sampleId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireDueDiligenceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acquireDueDiligenceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acquireDueDiligenceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acquireDueDiligenceLocalService.dynamicQuery();
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

		return _acquireDueDiligenceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireDueDiligenceModelImpl</code>.
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

		return _acquireDueDiligenceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireDueDiligenceModelImpl</code>.
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

		return _acquireDueDiligenceLocalService.dynamicQuery(
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

		return _acquireDueDiligenceLocalService.dynamicQueryCount(dynamicQuery);
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

		return _acquireDueDiligenceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireDueDiligence
		fetchAcquireDueDiligence(long sampleId) {

		return _acquireDueDiligenceLocalService.fetchAcquireDueDiligence(
			sampleId);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireDueDiligence
			getAcquireDD_By_CI(String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDueDiligenceException {

		return _acquireDueDiligenceLocalService.getAcquireDD_By_CI(caseId);
	}

	/**
	 * Returns the acquire due diligence with the primary key.
	 *
	 * @param sampleId the primary key of the acquire due diligence
	 * @return the acquire due diligence
	 * @throws PortalException if a acquire due diligence with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireDueDiligence
			getAcquireDueDiligence(long sampleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireDueDiligenceLocalService.getAcquireDueDiligence(
			sampleId);
	}

	@Override
	public java.util.List
		<com.nbp.acquire.stages.service.model.AcquireDueDiligence>
			getAcquireDueDiligenceBy_CI(String caseId) {

		return _acquireDueDiligenceLocalService.getAcquireDueDiligenceBy_CI(
			caseId);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireDueDiligence
			getAcquireDueDiligenceBy_CI_SN(String caseId, String agncyName)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDueDiligenceException {

		return _acquireDueDiligenceLocalService.getAcquireDueDiligenceBy_CI_SN(
			caseId, agncyName);
	}

	/**
	 * Returns a range of all the acquire due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire due diligences
	 * @param end the upper bound of the range of acquire due diligences (not inclusive)
	 * @return the range of acquire due diligences
	 */
	@Override
	public java.util.List
		<com.nbp.acquire.stages.service.model.AcquireDueDiligence>
			getAcquireDueDiligences(int start, int end) {

		return _acquireDueDiligenceLocalService.getAcquireDueDiligences(
			start, end);
	}

	/**
	 * Returns the number of acquire due diligences.
	 *
	 * @return the number of acquire due diligences
	 */
	@Override
	public int getAcquireDueDiligencesCount() {
		return _acquireDueDiligenceLocalService.getAcquireDueDiligencesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acquireDueDiligenceLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<String> getDistinctAgencies() {
		return _acquireDueDiligenceLocalService.getDistinctAgencies();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acquireDueDiligenceLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireDueDiligenceLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireDueDiligenceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireDueDiligence
		updateAcquireApplication(
			String caseId, String siteVisitRequires,
			java.util.Date prefferedsiteVisitDate, String statusApproved,
			String agencyName, java.util.Date dateSubmittedToAgency,
			java.util.Date dateFeedbackReceived, String agencyRecommendations) {

		return _acquireDueDiligenceLocalService.updateAcquireApplication(
			caseId, siteVisitRequires, prefferedsiteVisitDate, statusApproved,
			agencyName, dateSubmittedToAgency, dateFeedbackReceived,
			agencyRecommendations);
	}

	/**
	 * Updates the acquire due diligence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDueDiligence the acquire due diligence
	 * @return the acquire due diligence that was updated
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireDueDiligence
		updateAcquireDueDiligence(
			com.nbp.acquire.stages.service.model.AcquireDueDiligence
				acquireDueDiligence) {

		return _acquireDueDiligenceLocalService.updateAcquireDueDiligence(
			acquireDueDiligence);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acquireDueDiligenceLocalService.getBasePersistence();
	}

	@Override
	public AcquireDueDiligenceLocalService getWrappedService() {
		return _acquireDueDiligenceLocalService;
	}

	@Override
	public void setWrappedService(
		AcquireDueDiligenceLocalService acquireDueDiligenceLocalService) {

		_acquireDueDiligenceLocalService = acquireDueDiligenceLocalService;
	}

	private AcquireDueDiligenceLocalService _acquireDueDiligenceLocalService;

}