/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiningProspectingRightsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingRightsLocalService
 * @generated
 */
public class MiningProspectingRightsLocalServiceWrapper
	implements MiningProspectingRightsLocalService,
			   ServiceWrapper<MiningProspectingRightsLocalService> {

	public MiningProspectingRightsLocalServiceWrapper() {
		this(null);
	}

	public MiningProspectingRightsLocalServiceWrapper(
		MiningProspectingRightsLocalService
			miningProspectingRightsLocalService) {

		_miningProspectingRightsLocalService =
			miningProspectingRightsLocalService;
	}

	/**
	 * Adds the mining prospecting rights to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningProspectingRightsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningProspectingRights the mining prospecting rights
	 * @return the mining prospecting rights that was added
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningProspectingRights
			addMiningProspectingRights(
				com.nbp.mining.lease.application.service.model.
					MiningProspectingRights miningProspectingRights) {

		return _miningProspectingRightsLocalService.addMiningProspectingRights(
			miningProspectingRights);
	}

	/**
	 * Creates a new mining prospecting rights with the primary key. Does not add the mining prospecting rights to the database.
	 *
	 * @param prospectingRightsId the primary key for the new mining prospecting rights
	 * @return the new mining prospecting rights
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningProspectingRights
			createMiningProspectingRights(long prospectingRightsId) {

		return _miningProspectingRightsLocalService.
			createMiningProspectingRights(prospectingRightsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningProspectingRightsLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the mining prospecting rights with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningProspectingRightsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param prospectingRightsId the primary key of the mining prospecting rights
	 * @return the mining prospecting rights that was removed
	 * @throws PortalException if a mining prospecting rights with the primary key could not be found
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningProspectingRights
				deleteMiningProspectingRights(long prospectingRightsId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _miningProspectingRightsLocalService.
			deleteMiningProspectingRights(prospectingRightsId);
	}

	/**
	 * Deletes the mining prospecting rights from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningProspectingRightsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningProspectingRights the mining prospecting rights
	 * @return the mining prospecting rights that was removed
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningProspectingRights
			deleteMiningProspectingRights(
				com.nbp.mining.lease.application.service.model.
					MiningProspectingRights miningProspectingRights) {

		return _miningProspectingRightsLocalService.
			deleteMiningProspectingRights(miningProspectingRights);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningProspectingRightsLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miningProspectingRightsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miningProspectingRightsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miningProspectingRightsLocalService.dynamicQuery();
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

		return _miningProspectingRightsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningProspectingRightsModelImpl</code>.
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

		return _miningProspectingRightsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningProspectingRightsModelImpl</code>.
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

		return _miningProspectingRightsLocalService.dynamicQuery(
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

		return _miningProspectingRightsLocalService.dynamicQueryCount(
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

		return _miningProspectingRightsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningProspectingRights
			fetchMiningProspectingRights(long prospectingRightsId) {

		return _miningProspectingRightsLocalService.
			fetchMiningProspectingRights(prospectingRightsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miningProspectingRightsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miningProspectingRightsLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningProspectingRights
				getMiningById(long miningLeaseApplicationId)
			throws com.nbp.mining.lease.application.service.exception.
				NoSuchMiningProspectingRightsException {

		return _miningProspectingRightsLocalService.getMiningById(
			miningLeaseApplicationId);
	}

	/**
	 * Returns the mining prospecting rights with the primary key.
	 *
	 * @param prospectingRightsId the primary key of the mining prospecting rights
	 * @return the mining prospecting rights
	 * @throws PortalException if a mining prospecting rights with the primary key could not be found
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningProspectingRights
				getMiningProspectingRights(long prospectingRightsId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _miningProspectingRightsLocalService.getMiningProspectingRights(
			prospectingRightsId);
	}

	/**
	 * Returns a range of all the mining prospecting rightses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningProspectingRightsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting rightses
	 * @param end the upper bound of the range of mining prospecting rightses (not inclusive)
	 * @return the range of mining prospecting rightses
	 */
	@Override
	public java.util.List
		<com.nbp.mining.lease.application.service.model.MiningProspectingRights>
			getMiningProspectingRightses(int start, int end) {

		return _miningProspectingRightsLocalService.
			getMiningProspectingRightses(start, end);
	}

	/**
	 * Returns the number of mining prospecting rightses.
	 *
	 * @return the number of mining prospecting rightses
	 */
	@Override
	public int getMiningProspectingRightsesCount() {
		return _miningProspectingRightsLocalService.
			getMiningProspectingRightsesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningProspectingRightsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningProspectingRightsLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the mining prospecting rights in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningProspectingRightsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningProspectingRights the mining prospecting rights
	 * @return the mining prospecting rights that was updated
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningProspectingRights
			updateMiningProspectingRights(
				com.nbp.mining.lease.application.service.model.
					MiningProspectingRights miningProspectingRights) {

		return _miningProspectingRightsLocalService.
			updateMiningProspectingRights(miningProspectingRights);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miningProspectingRightsLocalService.getBasePersistence();
	}

	@Override
	public MiningProspectingRightsLocalService getWrappedService() {
		return _miningProspectingRightsLocalService;
	}

	@Override
	public void setWrappedService(
		MiningProspectingRightsLocalService
			miningProspectingRightsLocalService) {

		_miningProspectingRightsLocalService =
			miningProspectingRightsLocalService;
	}

	private MiningProspectingRightsLocalService
		_miningProspectingRightsLocalService;

}