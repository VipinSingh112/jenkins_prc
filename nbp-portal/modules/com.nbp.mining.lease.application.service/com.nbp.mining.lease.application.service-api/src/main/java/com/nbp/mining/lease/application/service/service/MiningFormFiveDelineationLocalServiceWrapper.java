/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiningFormFiveDelineationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningFormFiveDelineationLocalService
 * @generated
 */
public class MiningFormFiveDelineationLocalServiceWrapper
	implements MiningFormFiveDelineationLocalService,
			   ServiceWrapper<MiningFormFiveDelineationLocalService> {

	public MiningFormFiveDelineationLocalServiceWrapper() {
		this(null);
	}

	public MiningFormFiveDelineationLocalServiceWrapper(
		MiningFormFiveDelineationLocalService
			miningFormFiveDelineationLocalService) {

		_miningFormFiveDelineationLocalService =
			miningFormFiveDelineationLocalService;
	}

	/**
	 * Adds the mining form five delineation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningFormFiveDelineationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningFormFiveDelineation the mining form five delineation
	 * @return the mining form five delineation that was added
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningFormFiveDelineation
			addMiningFormFiveDelineation(
				com.nbp.mining.lease.application.service.model.
					MiningFormFiveDelineation miningFormFiveDelineation) {

		return _miningFormFiveDelineationLocalService.
			addMiningFormFiveDelineation(miningFormFiveDelineation);
	}

	/**
	 * Creates a new mining form five delineation with the primary key. Does not add the mining form five delineation to the database.
	 *
	 * @param miningFormFiveDelineationId the primary key for the new mining form five delineation
	 * @return the new mining form five delineation
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningFormFiveDelineation
			createMiningFormFiveDelineation(long miningFormFiveDelineationId) {

		return _miningFormFiveDelineationLocalService.
			createMiningFormFiveDelineation(miningFormFiveDelineationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningFormFiveDelineationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the mining form five delineation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningFormFiveDelineationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningFormFiveDelineationId the primary key of the mining form five delineation
	 * @return the mining form five delineation that was removed
	 * @throws PortalException if a mining form five delineation with the primary key could not be found
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningFormFiveDelineation
				deleteMiningFormFiveDelineation(
					long miningFormFiveDelineationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _miningFormFiveDelineationLocalService.
			deleteMiningFormFiveDelineation(miningFormFiveDelineationId);
	}

	/**
	 * Deletes the mining form five delineation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningFormFiveDelineationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningFormFiveDelineation the mining form five delineation
	 * @return the mining form five delineation that was removed
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningFormFiveDelineation
			deleteMiningFormFiveDelineation(
				com.nbp.mining.lease.application.service.model.
					MiningFormFiveDelineation miningFormFiveDelineation) {

		return _miningFormFiveDelineationLocalService.
			deleteMiningFormFiveDelineation(miningFormFiveDelineation);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningFormFiveDelineationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miningFormFiveDelineationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miningFormFiveDelineationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miningFormFiveDelineationLocalService.dynamicQuery();
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

		return _miningFormFiveDelineationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningFormFiveDelineationModelImpl</code>.
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

		return _miningFormFiveDelineationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningFormFiveDelineationModelImpl</code>.
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

		return _miningFormFiveDelineationLocalService.dynamicQuery(
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

		return _miningFormFiveDelineationLocalService.dynamicQueryCount(
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

		return _miningFormFiveDelineationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningFormFiveDelineation
			fetchMiningFormFiveDelineation(long miningFormFiveDelineationId) {

		return _miningFormFiveDelineationLocalService.
			fetchMiningFormFiveDelineation(miningFormFiveDelineationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miningFormFiveDelineationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miningFormFiveDelineationLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningFormFiveDelineation
				getMiningById(long miningLeaseApplicationId)
			throws com.nbp.mining.lease.application.service.exception.
				NoSuchMiningFormFiveDelineationException {

		return _miningFormFiveDelineationLocalService.getMiningById(
			miningLeaseApplicationId);
	}

	/**
	 * Returns the mining form five delineation with the primary key.
	 *
	 * @param miningFormFiveDelineationId the primary key of the mining form five delineation
	 * @return the mining form five delineation
	 * @throws PortalException if a mining form five delineation with the primary key could not be found
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningFormFiveDelineation
				getMiningFormFiveDelineation(long miningFormFiveDelineationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _miningFormFiveDelineationLocalService.
			getMiningFormFiveDelineation(miningFormFiveDelineationId);
	}

	/**
	 * Returns a range of all the mining form five delineations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningFormFiveDelineationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining form five delineations
	 * @param end the upper bound of the range of mining form five delineations (not inclusive)
	 * @return the range of mining form five delineations
	 */
	@Override
	public java.util.List
		<com.nbp.mining.lease.application.service.model.
			MiningFormFiveDelineation> getMiningFormFiveDelineations(
				int start, int end) {

		return _miningFormFiveDelineationLocalService.
			getMiningFormFiveDelineations(start, end);
	}

	/**
	 * Returns the number of mining form five delineations.
	 *
	 * @return the number of mining form five delineations
	 */
	@Override
	public int getMiningFormFiveDelineationsCount() {
		return _miningFormFiveDelineationLocalService.
			getMiningFormFiveDelineationsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningFormFiveDelineationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningFormFiveDelineationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the mining form five delineation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningFormFiveDelineationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningFormFiveDelineation the mining form five delineation
	 * @return the mining form five delineation that was updated
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningFormFiveDelineation
			updateMiningFormFiveDelineation(
				com.nbp.mining.lease.application.service.model.
					MiningFormFiveDelineation miningFormFiveDelineation) {

		return _miningFormFiveDelineationLocalService.
			updateMiningFormFiveDelineation(miningFormFiveDelineation);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miningFormFiveDelineationLocalService.getBasePersistence();
	}

	@Override
	public MiningFormFiveDelineationLocalService getWrappedService() {
		return _miningFormFiveDelineationLocalService;
	}

	@Override
	public void setWrappedService(
		MiningFormFiveDelineationLocalService
			miningFormFiveDelineationLocalService) {

		_miningFormFiveDelineationLocalService =
			miningFormFiveDelineationLocalService;
	}

	private MiningFormFiveDelineationLocalService
		_miningFormFiveDelineationLocalService;

}