/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcquireFinalExecutedAgreementLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireFinalExecutedAgreementLocalService
 * @generated
 */
public class AcquireFinalExecutedAgreementLocalServiceWrapper
	implements AcquireFinalExecutedAgreementLocalService,
			   ServiceWrapper<AcquireFinalExecutedAgreementLocalService> {

	public AcquireFinalExecutedAgreementLocalServiceWrapper() {
		this(null);
	}

	public AcquireFinalExecutedAgreementLocalServiceWrapper(
		AcquireFinalExecutedAgreementLocalService
			acquireFinalExecutedAgreementLocalService) {

		_acquireFinalExecutedAgreementLocalService =
			acquireFinalExecutedAgreementLocalService;
	}

	/**
	 * Adds the acquire final executed agreement to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireFinalExecutedAgreementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireFinalExecutedAgreement the acquire final executed agreement
	 * @return the acquire final executed agreement that was added
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreement
		addAcquireFinalExecutedAgreement(
			com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreement
				acquireFinalExecutedAgreement) {

		return _acquireFinalExecutedAgreementLocalService.
			addAcquireFinalExecutedAgreement(acquireFinalExecutedAgreement);
	}

	/**
	 * Creates a new acquire final executed agreement with the primary key. Does not add the acquire final executed agreement to the database.
	 *
	 * @param acquirefinalId the primary key for the new acquire final executed agreement
	 * @return the new acquire final executed agreement
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreement
		createAcquireFinalExecutedAgreement(long acquirefinalId) {

		return _acquireFinalExecutedAgreementLocalService.
			createAcquireFinalExecutedAgreement(acquirefinalId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireFinalExecutedAgreementLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acquire final executed agreement from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireFinalExecutedAgreementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireFinalExecutedAgreement the acquire final executed agreement
	 * @return the acquire final executed agreement that was removed
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreement
		deleteAcquireFinalExecutedAgreement(
			com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreement
				acquireFinalExecutedAgreement) {

		return _acquireFinalExecutedAgreementLocalService.
			deleteAcquireFinalExecutedAgreement(acquireFinalExecutedAgreement);
	}

	/**
	 * Deletes the acquire final executed agreement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireFinalExecutedAgreementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquirefinalId the primary key of the acquire final executed agreement
	 * @return the acquire final executed agreement that was removed
	 * @throws PortalException if a acquire final executed agreement with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreement
			deleteAcquireFinalExecutedAgreement(long acquirefinalId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireFinalExecutedAgreementLocalService.
			deleteAcquireFinalExecutedAgreement(acquirefinalId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireFinalExecutedAgreementLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acquireFinalExecutedAgreementLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acquireFinalExecutedAgreementLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acquireFinalExecutedAgreementLocalService.dynamicQuery();
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

		return _acquireFinalExecutedAgreementLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireFinalExecutedAgreementModelImpl</code>.
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

		return _acquireFinalExecutedAgreementLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireFinalExecutedAgreementModelImpl</code>.
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

		return _acquireFinalExecutedAgreementLocalService.dynamicQuery(
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

		return _acquireFinalExecutedAgreementLocalService.dynamicQueryCount(
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

		return _acquireFinalExecutedAgreementLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreement
		fetchAcquireFinalExecutedAgreement(long acquirefinalId) {

		return _acquireFinalExecutedAgreementLocalService.
			fetchAcquireFinalExecutedAgreement(acquirefinalId);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreement
			getAcquireFinalAgreementBy_CI(String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireFinalExecutedAgreementException {

		return _acquireFinalExecutedAgreementLocalService.
			getAcquireFinalAgreementBy_CI(caseId);
	}

	/**
	 * Returns the acquire final executed agreement with the primary key.
	 *
	 * @param acquirefinalId the primary key of the acquire final executed agreement
	 * @return the acquire final executed agreement
	 * @throws PortalException if a acquire final executed agreement with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreement
			getAcquireFinalExecutedAgreement(long acquirefinalId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireFinalExecutedAgreementLocalService.
			getAcquireFinalExecutedAgreement(acquirefinalId);
	}

	/**
	 * Returns a range of all the acquire final executed agreements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireFinalExecutedAgreementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire final executed agreements
	 * @param end the upper bound of the range of acquire final executed agreements (not inclusive)
	 * @return the range of acquire final executed agreements
	 */
	@Override
	public java.util.List
		<com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreement>
			getAcquireFinalExecutedAgreements(int start, int end) {

		return _acquireFinalExecutedAgreementLocalService.
			getAcquireFinalExecutedAgreements(start, end);
	}

	/**
	 * Returns the number of acquire final executed agreements.
	 *
	 * @return the number of acquire final executed agreements
	 */
	@Override
	public int getAcquireFinalExecutedAgreementsCount() {
		return _acquireFinalExecutedAgreementLocalService.
			getAcquireFinalExecutedAgreementsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acquireFinalExecutedAgreementLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acquireFinalExecutedAgreementLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireFinalExecutedAgreementLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireFinalExecutedAgreementLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acquire final executed agreement in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireFinalExecutedAgreementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireFinalExecutedAgreement the acquire final executed agreement
	 * @return the acquire final executed agreement that was updated
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreement
		updateAcquireFinalExecutedAgreement(
			com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreement
				acquireFinalExecutedAgreement) {

		return _acquireFinalExecutedAgreementLocalService.
			updateAcquireFinalExecutedAgreement(acquireFinalExecutedAgreement);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreement
		updateAcquireFinalExecutedAgreement(
			String caseId, java.util.Date dateContractExecuted) {

		return _acquireFinalExecutedAgreementLocalService.
			updateAcquireFinalExecutedAgreement(caseId, dateContractExecuted);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acquireFinalExecutedAgreementLocalService.getBasePersistence();
	}

	@Override
	public AcquireFinalExecutedAgreementLocalService getWrappedService() {
		return _acquireFinalExecutedAgreementLocalService;
	}

	@Override
	public void setWrappedService(
		AcquireFinalExecutedAgreementLocalService
			acquireFinalExecutedAgreementLocalService) {

		_acquireFinalExecutedAgreementLocalService =
			acquireFinalExecutedAgreementLocalService;
	}

	private AcquireFinalExecutedAgreementLocalService
		_acquireFinalExecutedAgreementLocalService;

}