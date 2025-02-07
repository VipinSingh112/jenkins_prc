/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiningExclusiveLicFormFiveLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningExclusiveLicFormFiveLocalService
 * @generated
 */
public class MiningExclusiveLicFormFiveLocalServiceWrapper
	implements MiningExclusiveLicFormFiveLocalService,
			   ServiceWrapper<MiningExclusiveLicFormFiveLocalService> {

	public MiningExclusiveLicFormFiveLocalServiceWrapper() {
		this(null);
	}

	public MiningExclusiveLicFormFiveLocalServiceWrapper(
		MiningExclusiveLicFormFiveLocalService
			miningExclusiveLicFormFiveLocalService) {

		_miningExclusiveLicFormFiveLocalService =
			miningExclusiveLicFormFiveLocalService;
	}

	/**
	 * Adds the mining exclusive lic form five to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningExclusiveLicFormFiveLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningExclusiveLicFormFive the mining exclusive lic form five
	 * @return the mining exclusive lic form five that was added
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.
			MiningExclusiveLicFormFive addMiningExclusiveLicFormFive(
				com.nbp.mining.lease.application.service.model.
					MiningExclusiveLicFormFive miningExclusiveLicFormFive) {

		return _miningExclusiveLicFormFiveLocalService.
			addMiningExclusiveLicFormFive(miningExclusiveLicFormFive);
	}

	/**
	 * Creates a new mining exclusive lic form five with the primary key. Does not add the mining exclusive lic form five to the database.
	 *
	 * @param miningExclusiveLicFormFiveId the primary key for the new mining exclusive lic form five
	 * @return the new mining exclusive lic form five
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.
			MiningExclusiveLicFormFive createMiningExclusiveLicFormFive(
				long miningExclusiveLicFormFiveId) {

		return _miningExclusiveLicFormFiveLocalService.
			createMiningExclusiveLicFormFive(miningExclusiveLicFormFiveId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningExclusiveLicFormFiveLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the mining exclusive lic form five with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningExclusiveLicFormFiveLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningExclusiveLicFormFiveId the primary key of the mining exclusive lic form five
	 * @return the mining exclusive lic form five that was removed
	 * @throws PortalException if a mining exclusive lic form five with the primary key could not be found
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.
			MiningExclusiveLicFormFive deleteMiningExclusiveLicFormFive(
					long miningExclusiveLicFormFiveId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _miningExclusiveLicFormFiveLocalService.
			deleteMiningExclusiveLicFormFive(miningExclusiveLicFormFiveId);
	}

	/**
	 * Deletes the mining exclusive lic form five from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningExclusiveLicFormFiveLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningExclusiveLicFormFive the mining exclusive lic form five
	 * @return the mining exclusive lic form five that was removed
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.
			MiningExclusiveLicFormFive deleteMiningExclusiveLicFormFive(
				com.nbp.mining.lease.application.service.model.
					MiningExclusiveLicFormFive miningExclusiveLicFormFive) {

		return _miningExclusiveLicFormFiveLocalService.
			deleteMiningExclusiveLicFormFive(miningExclusiveLicFormFive);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningExclusiveLicFormFiveLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miningExclusiveLicFormFiveLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miningExclusiveLicFormFiveLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miningExclusiveLicFormFiveLocalService.dynamicQuery();
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

		return _miningExclusiveLicFormFiveLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningExclusiveLicFormFiveModelImpl</code>.
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

		return _miningExclusiveLicFormFiveLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningExclusiveLicFormFiveModelImpl</code>.
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

		return _miningExclusiveLicFormFiveLocalService.dynamicQuery(
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

		return _miningExclusiveLicFormFiveLocalService.dynamicQueryCount(
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

		return _miningExclusiveLicFormFiveLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.mining.lease.application.service.model.
			MiningExclusiveLicFormFive fetchMiningExclusiveLicFormFive(
				long miningExclusiveLicFormFiveId) {

		return _miningExclusiveLicFormFiveLocalService.
			fetchMiningExclusiveLicFormFive(miningExclusiveLicFormFiveId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miningExclusiveLicFormFiveLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miningExclusiveLicFormFiveLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public
		com.nbp.mining.lease.application.service.model.
			MiningExclusiveLicFormFive getMiningById(
					long miningLeaseApplicationId)
				throws com.nbp.mining.lease.application.service.exception.
					NoSuchMiningExclusiveLicFormFiveException {

		return _miningExclusiveLicFormFiveLocalService.getMiningById(
			miningLeaseApplicationId);
	}

	/**
	 * Returns the mining exclusive lic form five with the primary key.
	 *
	 * @param miningExclusiveLicFormFiveId the primary key of the mining exclusive lic form five
	 * @return the mining exclusive lic form five
	 * @throws PortalException if a mining exclusive lic form five with the primary key could not be found
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.
			MiningExclusiveLicFormFive getMiningExclusiveLicFormFive(
					long miningExclusiveLicFormFiveId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _miningExclusiveLicFormFiveLocalService.
			getMiningExclusiveLicFormFive(miningExclusiveLicFormFiveId);
	}

	/**
	 * Returns a range of all the mining exclusive lic form fives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningExclusiveLicFormFiveModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining exclusive lic form fives
	 * @param end the upper bound of the range of mining exclusive lic form fives (not inclusive)
	 * @return the range of mining exclusive lic form fives
	 */
	@Override
	public java.util.List
		<com.nbp.mining.lease.application.service.model.
			MiningExclusiveLicFormFive> getMiningExclusiveLicFormFives(
				int start, int end) {

		return _miningExclusiveLicFormFiveLocalService.
			getMiningExclusiveLicFormFives(start, end);
	}

	/**
	 * Returns the number of mining exclusive lic form fives.
	 *
	 * @return the number of mining exclusive lic form fives
	 */
	@Override
	public int getMiningExclusiveLicFormFivesCount() {
		return _miningExclusiveLicFormFiveLocalService.
			getMiningExclusiveLicFormFivesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningExclusiveLicFormFiveLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningExclusiveLicFormFiveLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the mining exclusive lic form five in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningExclusiveLicFormFiveLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningExclusiveLicFormFive the mining exclusive lic form five
	 * @return the mining exclusive lic form five that was updated
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.
			MiningExclusiveLicFormFive updateMiningExclusiveLicFormFive(
				com.nbp.mining.lease.application.service.model.
					MiningExclusiveLicFormFive miningExclusiveLicFormFive) {

		return _miningExclusiveLicFormFiveLocalService.
			updateMiningExclusiveLicFormFive(miningExclusiveLicFormFive);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miningExclusiveLicFormFiveLocalService.getBasePersistence();
	}

	@Override
	public MiningExclusiveLicFormFiveLocalService getWrappedService() {
		return _miningExclusiveLicFormFiveLocalService;
	}

	@Override
	public void setWrappedService(
		MiningExclusiveLicFormFiveLocalService
			miningExclusiveLicFormFiveLocalService) {

		_miningExclusiveLicFormFiveLocalService =
			miningExclusiveLicFormFiveLocalService;
	}

	private MiningExclusiveLicFormFiveLocalService
		_miningExclusiveLicFormFiveLocalService;

}