/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiningLeaseApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningLeaseApplicationLocalService
 * @generated
 */
public class MiningLeaseApplicationLocalServiceWrapper
	implements MiningLeaseApplicationLocalService,
			   ServiceWrapper<MiningLeaseApplicationLocalService> {

	public MiningLeaseApplicationLocalServiceWrapper() {
		this(null);
	}

	public MiningLeaseApplicationLocalServiceWrapper(
		MiningLeaseApplicationLocalService miningLeaseApplicationLocalService) {

		_miningLeaseApplicationLocalService =
			miningLeaseApplicationLocalService;
	}

	/**
	 * Adds the mining lease application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningLeaseApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningLeaseApplication the mining lease application
	 * @return the mining lease application that was added
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningLeaseApplication
		addMiningLeaseApplication(
			com.nbp.mining.lease.application.service.model.
				MiningLeaseApplication miningLeaseApplication) {

		return _miningLeaseApplicationLocalService.addMiningLeaseApplication(
			miningLeaseApplication);
	}

	/**
	 * Creates a new mining lease application with the primary key. Does not add the mining lease application to the database.
	 *
	 * @param miningLeaseApplicationId the primary key for the new mining lease application
	 * @return the new mining lease application
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningLeaseApplication
		createMiningLeaseApplication(long miningLeaseApplicationId) {

		return _miningLeaseApplicationLocalService.createMiningLeaseApplication(
			miningLeaseApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningLeaseApplicationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the mining lease application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningLeaseApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningLeaseApplicationId the primary key of the mining lease application
	 * @return the mining lease application that was removed
	 * @throws PortalException if a mining lease application with the primary key could not be found
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningLeaseApplication
			deleteMiningLeaseApplication(long miningLeaseApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningLeaseApplicationLocalService.deleteMiningLeaseApplication(
			miningLeaseApplicationId);
	}

	/**
	 * Deletes the mining lease application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningLeaseApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningLeaseApplication the mining lease application
	 * @return the mining lease application that was removed
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningLeaseApplication
		deleteMiningLeaseApplication(
			com.nbp.mining.lease.application.service.model.
				MiningLeaseApplication miningLeaseApplication) {

		return _miningLeaseApplicationLocalService.deleteMiningLeaseApplication(
			miningLeaseApplication);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningLeaseApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miningLeaseApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miningLeaseApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miningLeaseApplicationLocalService.dynamicQuery();
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

		return _miningLeaseApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningLeaseApplicationModelImpl</code>.
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

		return _miningLeaseApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningLeaseApplicationModelImpl</code>.
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

		return _miningLeaseApplicationLocalService.dynamicQuery(
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

		return _miningLeaseApplicationLocalService.dynamicQueryCount(
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

		return _miningLeaseApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.mining.lease.application.service.model.MiningLeaseApplication
		fetchMiningLeaseApplication(long miningLeaseApplicationId) {

		return _miningLeaseApplicationLocalService.fetchMiningLeaseApplication(
			miningLeaseApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miningLeaseApplicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miningLeaseApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List<String> getJadscDistinctCategory() {
		return _miningLeaseApplicationLocalService.getJadscDistinctCategory();
	}

	@Override
	public com.nbp.mining.lease.application.service.model.MiningLeaseApplication
			getMiningBy_PRNum_PLNum(
				String applicationNumber, String prospRightsNum)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return _miningLeaseApplicationLocalService.getMiningBy_PRNum_PLNum(
			applicationNumber, prospRightsNum);
	}

	@Override
	public com.nbp.mining.lease.application.service.model.MiningLeaseApplication
			getMiningByAppNum(String applicationNumber)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return _miningLeaseApplicationLocalService.getMiningByAppNum(
			applicationNumber);
	}

	@Override
	public com.nbp.mining.lease.application.service.model.MiningLeaseApplication
			getMiningByCaseId(String caseId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return _miningLeaseApplicationLocalService.getMiningByCaseId(caseId);
	}

	@Override
	public com.nbp.mining.lease.application.service.model.MiningLeaseApplication
			getMiningByRT_AppNo(
				String typeOfApplicant, String expiredLicenseAppNumber)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return _miningLeaseApplicationLocalService.getMiningByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);
	}

	@Override
	public java.util.List
		<com.nbp.mining.lease.application.service.model.MiningLeaseApplication>
			getMiningByS_U(long userId, int status) {

		return _miningLeaseApplicationLocalService.getMiningByS_U(
			userId, status);
	}

	@Override
	public java.util.List
		<com.nbp.mining.lease.application.service.model.MiningLeaseApplication>
			getMiningByStatus(int status) {

		return _miningLeaseApplicationLocalService.getMiningByStatus(status);
	}

	@Override
	public java.util.List<String> getMiningDistinctCategory() {
		return _miningLeaseApplicationLocalService.getMiningDistinctCategory();
	}

	/**
	 * Returns the mining lease application with the primary key.
	 *
	 * @param miningLeaseApplicationId the primary key of the mining lease application
	 * @return the mining lease application
	 * @throws PortalException if a mining lease application with the primary key could not be found
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningLeaseApplication
			getMiningLeaseApplication(long miningLeaseApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningLeaseApplicationLocalService.getMiningLeaseApplication(
			miningLeaseApplicationId);
	}

	/**
	 * Returns a range of all the mining lease applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @return the range of mining lease applications
	 */
	@Override
	public java.util.List
		<com.nbp.mining.lease.application.service.model.MiningLeaseApplication>
			getMiningLeaseApplications(int start, int end) {

		return _miningLeaseApplicationLocalService.getMiningLeaseApplications(
			start, end);
	}

	/**
	 * Returns the number of mining lease applications.
	 *
	 * @return the number of mining lease applications
	 */
	@Override
	public int getMiningLeaseApplicationsCount() {
		return _miningLeaseApplicationLocalService.
			getMiningLeaseApplicationsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningLeaseApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningLeaseApplicationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the mining lease application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningLeaseApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningLeaseApplication the mining lease application
	 * @return the mining lease application that was updated
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningLeaseApplication
		updateMiningLeaseApplication(
			com.nbp.mining.lease.application.service.model.
				MiningLeaseApplication miningLeaseApplication) {

		return _miningLeaseApplicationLocalService.updateMiningLeaseApplication(
			miningLeaseApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miningLeaseApplicationLocalService.getBasePersistence();
	}

	@Override
	public MiningLeaseApplicationLocalService getWrappedService() {
		return _miningLeaseApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		MiningLeaseApplicationLocalService miningLeaseApplicationLocalService) {

		_miningLeaseApplicationLocalService =
			miningLeaseApplicationLocalService;
	}

	private MiningLeaseApplicationLocalService
		_miningLeaseApplicationLocalService;

}