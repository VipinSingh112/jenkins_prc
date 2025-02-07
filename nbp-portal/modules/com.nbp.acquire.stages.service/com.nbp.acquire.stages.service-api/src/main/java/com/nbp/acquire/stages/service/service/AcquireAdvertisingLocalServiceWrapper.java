/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcquireAdvertisingLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireAdvertisingLocalService
 * @generated
 */
public class AcquireAdvertisingLocalServiceWrapper
	implements AcquireAdvertisingLocalService,
			   ServiceWrapper<AcquireAdvertisingLocalService> {

	public AcquireAdvertisingLocalServiceWrapper() {
		this(null);
	}

	public AcquireAdvertisingLocalServiceWrapper(
		AcquireAdvertisingLocalService acquireAdvertisingLocalService) {

		_acquireAdvertisingLocalService = acquireAdvertisingLocalService;
	}

	/**
	 * Adds the acquire advertising to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireAdvertisingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireAdvertising the acquire advertising
	 * @return the acquire advertising that was added
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireAdvertising
		addAcquireAdvertising(
			com.nbp.acquire.stages.service.model.AcquireAdvertising
				acquireAdvertising) {

		return _acquireAdvertisingLocalService.addAcquireAdvertising(
			acquireAdvertising);
	}

	/**
	 * Creates a new acquire advertising with the primary key. Does not add the acquire advertising to the database.
	 *
	 * @param acquireAdvertisingId the primary key for the new acquire advertising
	 * @return the new acquire advertising
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireAdvertising
		createAcquireAdvertising(long acquireAdvertisingId) {

		return _acquireAdvertisingLocalService.createAcquireAdvertising(
			acquireAdvertisingId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireAdvertisingLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acquire advertising from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireAdvertisingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireAdvertising the acquire advertising
	 * @return the acquire advertising that was removed
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireAdvertising
		deleteAcquireAdvertising(
			com.nbp.acquire.stages.service.model.AcquireAdvertising
				acquireAdvertising) {

		return _acquireAdvertisingLocalService.deleteAcquireAdvertising(
			acquireAdvertising);
	}

	/**
	 * Deletes the acquire advertising with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireAdvertisingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireAdvertisingId the primary key of the acquire advertising
	 * @return the acquire advertising that was removed
	 * @throws PortalException if a acquire advertising with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireAdvertising
			deleteAcquireAdvertising(long acquireAdvertisingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireAdvertisingLocalService.deleteAcquireAdvertising(
			acquireAdvertisingId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireAdvertisingLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acquireAdvertisingLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acquireAdvertisingLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acquireAdvertisingLocalService.dynamicQuery();
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

		return _acquireAdvertisingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireAdvertisingModelImpl</code>.
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

		return _acquireAdvertisingLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireAdvertisingModelImpl</code>.
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

		return _acquireAdvertisingLocalService.dynamicQuery(
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

		return _acquireAdvertisingLocalService.dynamicQueryCount(dynamicQuery);
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

		return _acquireAdvertisingLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireAdvertising
		fetchAcquireAdvertising(long acquireAdvertisingId) {

		return _acquireAdvertisingLocalService.fetchAcquireAdvertising(
			acquireAdvertisingId);
	}

	/**
	 * Returns the acquire advertising with the primary key.
	 *
	 * @param acquireAdvertisingId the primary key of the acquire advertising
	 * @return the acquire advertising
	 * @throws PortalException if a acquire advertising with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireAdvertising
			getAcquireAdvertising(long acquireAdvertisingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireAdvertisingLocalService.getAcquireAdvertising(
			acquireAdvertisingId);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireAdvertising
			getAcquireAdvertisingBy_CI(String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireAdvertisingException {

		return _acquireAdvertisingLocalService.getAcquireAdvertisingBy_CI(
			caseId);
	}

	/**
	 * Returns a range of all the acquire advertisings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireAdvertisingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire advertisings
	 * @param end the upper bound of the range of acquire advertisings (not inclusive)
	 * @return the range of acquire advertisings
	 */
	@Override
	public java.util.List
		<com.nbp.acquire.stages.service.model.AcquireAdvertising>
			getAcquireAdvertisings(int start, int end) {

		return _acquireAdvertisingLocalService.getAcquireAdvertisings(
			start, end);
	}

	/**
	 * Returns the number of acquire advertisings.
	 *
	 * @return the number of acquire advertisings
	 */
	@Override
	public int getAcquireAdvertisingsCount() {
		return _acquireAdvertisingLocalService.getAcquireAdvertisingsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acquireAdvertisingLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acquireAdvertisingLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireAdvertisingLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireAdvertisingLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the acquire advertising in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireAdvertisingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireAdvertising the acquire advertising
	 * @return the acquire advertising that was updated
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireAdvertising
		updateAcquireAdvertising(
			com.nbp.acquire.stages.service.model.AcquireAdvertising
				acquireAdvertising) {

		return _acquireAdvertisingLocalService.updateAcquireAdvertising(
			acquireAdvertising);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireAdvertising
		updateAcquireApplicationAdvertising(
			String caseId, java.util.Date dateFrom, java.util.Date dateTo,
			String advertisingMediaStatus) {

		return _acquireAdvertisingLocalService.
			updateAcquireApplicationAdvertising(
				caseId, dateFrom, dateTo, advertisingMediaStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acquireAdvertisingLocalService.getBasePersistence();
	}

	@Override
	public AcquireAdvertisingLocalService getWrappedService() {
		return _acquireAdvertisingLocalService;
	}

	@Override
	public void setWrappedService(
		AcquireAdvertisingLocalService acquireAdvertisingLocalService) {

		_acquireAdvertisingLocalService = acquireAdvertisingLocalService;
	}

	private AcquireAdvertisingLocalService _acquireAdvertisingLocalService;

}