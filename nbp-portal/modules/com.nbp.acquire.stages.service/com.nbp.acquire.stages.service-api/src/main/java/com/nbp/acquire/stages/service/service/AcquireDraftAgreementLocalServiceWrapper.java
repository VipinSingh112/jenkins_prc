/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcquireDraftAgreementLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDraftAgreementLocalService
 * @generated
 */
public class AcquireDraftAgreementLocalServiceWrapper
	implements AcquireDraftAgreementLocalService,
			   ServiceWrapper<AcquireDraftAgreementLocalService> {

	public AcquireDraftAgreementLocalServiceWrapper() {
		this(null);
	}

	public AcquireDraftAgreementLocalServiceWrapper(
		AcquireDraftAgreementLocalService acquireDraftAgreementLocalService) {

		_acquireDraftAgreementLocalService = acquireDraftAgreementLocalService;
	}

	/**
	 * Adds the acquire draft agreement to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDraftAgreementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDraftAgreement the acquire draft agreement
	 * @return the acquire draft agreement that was added
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireDraftAgreement
		addAcquireDraftAgreement(
			com.nbp.acquire.stages.service.model.AcquireDraftAgreement
				acquireDraftAgreement) {

		return _acquireDraftAgreementLocalService.addAcquireDraftAgreement(
			acquireDraftAgreement);
	}

	/**
	 * Creates a new acquire draft agreement with the primary key. Does not add the acquire draft agreement to the database.
	 *
	 * @param acquireDraftId the primary key for the new acquire draft agreement
	 * @return the new acquire draft agreement
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireDraftAgreement
		createAcquireDraftAgreement(long acquireDraftId) {

		return _acquireDraftAgreementLocalService.createAcquireDraftAgreement(
			acquireDraftId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireDraftAgreementLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acquire draft agreement from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDraftAgreementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDraftAgreement the acquire draft agreement
	 * @return the acquire draft agreement that was removed
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireDraftAgreement
		deleteAcquireDraftAgreement(
			com.nbp.acquire.stages.service.model.AcquireDraftAgreement
				acquireDraftAgreement) {

		return _acquireDraftAgreementLocalService.deleteAcquireDraftAgreement(
			acquireDraftAgreement);
	}

	/**
	 * Deletes the acquire draft agreement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDraftAgreementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDraftId the primary key of the acquire draft agreement
	 * @return the acquire draft agreement that was removed
	 * @throws PortalException if a acquire draft agreement with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireDraftAgreement
			deleteAcquireDraftAgreement(long acquireDraftId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireDraftAgreementLocalService.deleteAcquireDraftAgreement(
			acquireDraftId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireDraftAgreementLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acquireDraftAgreementLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acquireDraftAgreementLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acquireDraftAgreementLocalService.dynamicQuery();
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

		return _acquireDraftAgreementLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireDraftAgreementModelImpl</code>.
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

		return _acquireDraftAgreementLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireDraftAgreementModelImpl</code>.
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

		return _acquireDraftAgreementLocalService.dynamicQuery(
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

		return _acquireDraftAgreementLocalService.dynamicQueryCount(
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

		return _acquireDraftAgreementLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireDraftAgreement
		fetchAcquireDraftAgreement(long acquireDraftId) {

		return _acquireDraftAgreementLocalService.fetchAcquireDraftAgreement(
			acquireDraftId);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireDraftAgreement
			getAcquireDrafAgreementBy_CI(String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDraftAgreementException {

		return _acquireDraftAgreementLocalService.getAcquireDrafAgreementBy_CI(
			caseId);
	}

	/**
	 * Returns the acquire draft agreement with the primary key.
	 *
	 * @param acquireDraftId the primary key of the acquire draft agreement
	 * @return the acquire draft agreement
	 * @throws PortalException if a acquire draft agreement with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireDraftAgreement
			getAcquireDraftAgreement(long acquireDraftId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireDraftAgreementLocalService.getAcquireDraftAgreement(
			acquireDraftId);
	}

	/**
	 * Returns a range of all the acquire draft agreements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireDraftAgreementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire draft agreements
	 * @param end the upper bound of the range of acquire draft agreements (not inclusive)
	 * @return the range of acquire draft agreements
	 */
	@Override
	public java.util.List
		<com.nbp.acquire.stages.service.model.AcquireDraftAgreement>
			getAcquireDraftAgreements(int start, int end) {

		return _acquireDraftAgreementLocalService.getAcquireDraftAgreements(
			start, end);
	}

	/**
	 * Returns the number of acquire draft agreements.
	 *
	 * @return the number of acquire draft agreements
	 */
	@Override
	public int getAcquireDraftAgreementsCount() {
		return _acquireDraftAgreementLocalService.
			getAcquireDraftAgreementsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acquireDraftAgreementLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acquireDraftAgreementLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireDraftAgreementLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireDraftAgreementLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acquire draft agreement in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDraftAgreementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDraftAgreement the acquire draft agreement
	 * @return the acquire draft agreement that was updated
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireDraftAgreement
		updateAcquireDraftAgreement(
			com.nbp.acquire.stages.service.model.AcquireDraftAgreement
				acquireDraftAgreement) {

		return _acquireDraftAgreementLocalService.updateAcquireDraftAgreement(
			acquireDraftAgreement);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireDraftAgreement
		updateAcquireDraftAgreement(String caseId, String paymentAmountDue) {

		return _acquireDraftAgreementLocalService.updateAcquireDraftAgreement(
			caseId, paymentAmountDue);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acquireDraftAgreementLocalService.getBasePersistence();
	}

	@Override
	public AcquireDraftAgreementLocalService getWrappedService() {
		return _acquireDraftAgreementLocalService;
	}

	@Override
	public void setWrappedService(
		AcquireDraftAgreementLocalService acquireDraftAgreementLocalService) {

		_acquireDraftAgreementLocalService = acquireDraftAgreementLocalService;
	}

	private AcquireDraftAgreementLocalService
		_acquireDraftAgreementLocalService;

}