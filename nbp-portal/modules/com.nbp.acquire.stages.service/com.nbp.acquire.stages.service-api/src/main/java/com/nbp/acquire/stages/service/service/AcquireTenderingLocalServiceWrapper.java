/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcquireTenderingLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireTenderingLocalService
 * @generated
 */
public class AcquireTenderingLocalServiceWrapper
	implements AcquireTenderingLocalService,
			   ServiceWrapper<AcquireTenderingLocalService> {

	public AcquireTenderingLocalServiceWrapper() {
		this(null);
	}

	public AcquireTenderingLocalServiceWrapper(
		AcquireTenderingLocalService acquireTenderingLocalService) {

		_acquireTenderingLocalService = acquireTenderingLocalService;
	}

	/**
	 * Adds the acquire tendering to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireTenderingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireTendering the acquire tendering
	 * @return the acquire tendering that was added
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireTendering
		addAcquireTendering(
			com.nbp.acquire.stages.service.model.AcquireTendering
				acquireTendering) {

		return _acquireTenderingLocalService.addAcquireTendering(
			acquireTendering);
	}

	/**
	 * Creates a new acquire tendering with the primary key. Does not add the acquire tendering to the database.
	 *
	 * @param acquireTenderingId the primary key for the new acquire tendering
	 * @return the new acquire tendering
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireTendering
		createAcquireTendering(long acquireTenderingId) {

		return _acquireTenderingLocalService.createAcquireTendering(
			acquireTenderingId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireTenderingLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acquire tendering from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireTenderingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireTendering the acquire tendering
	 * @return the acquire tendering that was removed
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireTendering
		deleteAcquireTendering(
			com.nbp.acquire.stages.service.model.AcquireTendering
				acquireTendering) {

		return _acquireTenderingLocalService.deleteAcquireTendering(
			acquireTendering);
	}

	/**
	 * Deletes the acquire tendering with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireTenderingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireTenderingId the primary key of the acquire tendering
	 * @return the acquire tendering that was removed
	 * @throws PortalException if a acquire tendering with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireTendering
			deleteAcquireTendering(long acquireTenderingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireTenderingLocalService.deleteAcquireTendering(
			acquireTenderingId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireTenderingLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acquireTenderingLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acquireTenderingLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acquireTenderingLocalService.dynamicQuery();
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

		return _acquireTenderingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireTenderingModelImpl</code>.
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

		return _acquireTenderingLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireTenderingModelImpl</code>.
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

		return _acquireTenderingLocalService.dynamicQuery(
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

		return _acquireTenderingLocalService.dynamicQueryCount(dynamicQuery);
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

		return _acquireTenderingLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireTendering
		fetchAcquireTendering(long acquireTenderingId) {

		return _acquireTenderingLocalService.fetchAcquireTendering(
			acquireTenderingId);
	}

	/**
	 * Returns the acquire tendering with the primary key.
	 *
	 * @param acquireTenderingId the primary key of the acquire tendering
	 * @return the acquire tendering
	 * @throws PortalException if a acquire tendering with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireTendering
			getAcquireTendering(long acquireTenderingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireTenderingLocalService.getAcquireTendering(
			acquireTenderingId);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireTendering
			getAcquireTenderingBy_CI(String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireTenderingException {

		return _acquireTenderingLocalService.getAcquireTenderingBy_CI(caseId);
	}

	@Override
	public java.util.List<com.nbp.acquire.stages.service.model.AcquireTendering>
			getAcquireTenderingListByCI(String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireTenderingException {

		return _acquireTenderingLocalService.getAcquireTenderingListByCI(
			caseId);
	}

	/**
	 * Returns a range of all the acquire tenderings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireTenderingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire tenderings
	 * @param end the upper bound of the range of acquire tenderings (not inclusive)
	 * @return the range of acquire tenderings
	 */
	@Override
	public java.util.List<com.nbp.acquire.stages.service.model.AcquireTendering>
		getAcquireTenderings(int start, int end) {

		return _acquireTenderingLocalService.getAcquireTenderings(start, end);
	}

	/**
	 * Returns the number of acquire tenderings.
	 *
	 * @return the number of acquire tenderings
	 */
	@Override
	public int getAcquireTenderingsCount() {
		return _acquireTenderingLocalService.getAcquireTenderingsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acquireTenderingLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acquireTenderingLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireTenderingLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireTenderingLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireTendering
		updateAcquireApplicationTendering(
			String caseId, String nameOfEachBidders, String bidPriceofeachBid,
			String minPriceOfTenderOffer, String meetsMinimum,
			String highestOffer, String status) {

		return _acquireTenderingLocalService.updateAcquireApplicationTendering(
			caseId, nameOfEachBidders, bidPriceofeachBid, minPriceOfTenderOffer,
			meetsMinimum, highestOffer, status);
	}

	/**
	 * Updates the acquire tendering in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireTenderingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireTendering the acquire tendering
	 * @return the acquire tendering that was updated
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireTendering
		updateAcquireTendering(
			com.nbp.acquire.stages.service.model.AcquireTendering
				acquireTendering) {

		return _acquireTenderingLocalService.updateAcquireTendering(
			acquireTendering);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireTendering
		updateApplicationTenderingBiddingStage(
			String caseId, String[] BiddingDetails) {

		return _acquireTenderingLocalService.
			updateApplicationTenderingBiddingStage(caseId, BiddingDetails);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acquireTenderingLocalService.getBasePersistence();
	}

	@Override
	public AcquireTenderingLocalService getWrappedService() {
		return _acquireTenderingLocalService;
	}

	@Override
	public void setWrappedService(
		AcquireTenderingLocalService acquireTenderingLocalService) {

		_acquireTenderingLocalService = acquireTenderingLocalService;
	}

	private AcquireTenderingLocalService _acquireTenderingLocalService;

}