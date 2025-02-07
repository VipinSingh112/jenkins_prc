/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiningProspectingLicenseAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingLicenseAddLocalService
 * @generated
 */
public class MiningProspectingLicenseAddLocalServiceWrapper
	implements MiningProspectingLicenseAddLocalService,
			   ServiceWrapper<MiningProspectingLicenseAddLocalService> {

	public MiningProspectingLicenseAddLocalServiceWrapper() {
		this(null);
	}

	public MiningProspectingLicenseAddLocalServiceWrapper(
		MiningProspectingLicenseAddLocalService
			miningProspectingLicenseAddLocalService) {

		_miningProspectingLicenseAddLocalService =
			miningProspectingLicenseAddLocalService;
	}

	/**
	 * Adds the mining prospecting license add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningProspectingLicenseAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningProspectingLicenseAdd the mining prospecting license add
	 * @return the mining prospecting license add that was added
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.
			MiningProspectingLicenseAdd addMiningProspectingLicenseAdd(
				com.nbp.mining.lease.application.service.model.
					MiningProspectingLicenseAdd miningProspectingLicenseAdd) {

		return _miningProspectingLicenseAddLocalService.
			addMiningProspectingLicenseAdd(miningProspectingLicenseAdd);
	}

	/**
	 * Creates a new mining prospecting license add with the primary key. Does not add the mining prospecting license add to the database.
	 *
	 * @param miningProspectingLicenseAddId the primary key for the new mining prospecting license add
	 * @return the new mining prospecting license add
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.
			MiningProspectingLicenseAdd createMiningProspectingLicenseAdd(
				long miningProspectingLicenseAddId) {

		return _miningProspectingLicenseAddLocalService.
			createMiningProspectingLicenseAdd(miningProspectingLicenseAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningProspectingLicenseAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the mining prospecting license add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningProspectingLicenseAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningProspectingLicenseAddId the primary key of the mining prospecting license add
	 * @return the mining prospecting license add that was removed
	 * @throws PortalException if a mining prospecting license add with the primary key could not be found
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.
			MiningProspectingLicenseAdd deleteMiningProspectingLicenseAdd(
					long miningProspectingLicenseAddId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _miningProspectingLicenseAddLocalService.
			deleteMiningProspectingLicenseAdd(miningProspectingLicenseAddId);
	}

	/**
	 * Deletes the mining prospecting license add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningProspectingLicenseAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningProspectingLicenseAdd the mining prospecting license add
	 * @return the mining prospecting license add that was removed
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.
			MiningProspectingLicenseAdd deleteMiningProspectingLicenseAdd(
				com.nbp.mining.lease.application.service.model.
					MiningProspectingLicenseAdd miningProspectingLicenseAdd) {

		return _miningProspectingLicenseAddLocalService.
			deleteMiningProspectingLicenseAdd(miningProspectingLicenseAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningProspectingLicenseAddLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miningProspectingLicenseAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miningProspectingLicenseAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miningProspectingLicenseAddLocalService.dynamicQuery();
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

		return _miningProspectingLicenseAddLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningProspectingLicenseAddModelImpl</code>.
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

		return _miningProspectingLicenseAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningProspectingLicenseAddModelImpl</code>.
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

		return _miningProspectingLicenseAddLocalService.dynamicQuery(
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

		return _miningProspectingLicenseAddLocalService.dynamicQueryCount(
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

		return _miningProspectingLicenseAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.mining.lease.application.service.model.
			MiningProspectingLicenseAdd fetchMiningProspectingLicenseAdd(
				long miningProspectingLicenseAddId) {

		return _miningProspectingLicenseAddLocalService.
			fetchMiningProspectingLicenseAdd(miningProspectingLicenseAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miningProspectingLicenseAddLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miningProspectingLicenseAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the mining prospecting license add with the primary key.
	 *
	 * @param miningProspectingLicenseAddId the primary key of the mining prospecting license add
	 * @return the mining prospecting license add
	 * @throws PortalException if a mining prospecting license add with the primary key could not be found
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.
			MiningProspectingLicenseAdd getMiningProspectingLicenseAdd(
					long miningProspectingLicenseAddId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _miningProspectingLicenseAddLocalService.
			getMiningProspectingLicenseAdd(miningProspectingLicenseAddId);
	}

	/**
	 * Returns a range of all the mining prospecting license adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningProspectingLicenseAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting license adds
	 * @param end the upper bound of the range of mining prospecting license adds (not inclusive)
	 * @return the range of mining prospecting license adds
	 */
	@Override
	public java.util.List
		<com.nbp.mining.lease.application.service.model.
			MiningProspectingLicenseAdd> getMiningProspectingLicenseAdds(
				int start, int end) {

		return _miningProspectingLicenseAddLocalService.
			getMiningProspectingLicenseAdds(start, end);
	}

	/**
	 * Returns the number of mining prospecting license adds.
	 *
	 * @return the number of mining prospecting license adds
	 */
	@Override
	public int getMiningProspectingLicenseAddsCount() {
		return _miningProspectingLicenseAddLocalService.
			getMiningProspectingLicenseAddsCount();
	}

	@Override
	public java.util.List
		<com.nbp.mining.lease.application.service.model.
			MiningProspectingLicenseAdd> getMinningById(
				long miningLeaseApplicationId) {

		return _miningProspectingLicenseAddLocalService.getMinningById(
			miningLeaseApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningProspectingLicenseAddLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningProspectingLicenseAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the mining prospecting license add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningProspectingLicenseAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningProspectingLicenseAdd the mining prospecting license add
	 * @return the mining prospecting license add that was updated
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.
			MiningProspectingLicenseAdd updateMiningProspectingLicenseAdd(
				com.nbp.mining.lease.application.service.model.
					MiningProspectingLicenseAdd miningProspectingLicenseAdd) {

		return _miningProspectingLicenseAddLocalService.
			updateMiningProspectingLicenseAdd(miningProspectingLicenseAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miningProspectingLicenseAddLocalService.getBasePersistence();
	}

	@Override
	public MiningProspectingLicenseAddLocalService getWrappedService() {
		return _miningProspectingLicenseAddLocalService;
	}

	@Override
	public void setWrappedService(
		MiningProspectingLicenseAddLocalService
			miningProspectingLicenseAddLocalService) {

		_miningProspectingLicenseAddLocalService =
			miningProspectingLicenseAddLocalService;
	}

	private MiningProspectingLicenseAddLocalService
		_miningProspectingLicenseAddLocalService;

}