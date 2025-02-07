/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiningRenewalLicenceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningRenewalLicenceLocalService
 * @generated
 */
public class MiningRenewalLicenceLocalServiceWrapper
	implements MiningRenewalLicenceLocalService,
			   ServiceWrapper<MiningRenewalLicenceLocalService> {

	public MiningRenewalLicenceLocalServiceWrapper() {
		this(null);
	}

	public MiningRenewalLicenceLocalServiceWrapper(
		MiningRenewalLicenceLocalService miningRenewalLicenceLocalService) {

		_miningRenewalLicenceLocalService = miningRenewalLicenceLocalService;
	}

	/**
	 * Adds the mining renewal licence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningRenewalLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningRenewalLicence the mining renewal licence
	 * @return the mining renewal licence that was added
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningRenewalLicence
		addMiningRenewalLicence(
			com.nbp.mining.lease.application.service.model.MiningRenewalLicence
				miningRenewalLicence) {

		return _miningRenewalLicenceLocalService.addMiningRenewalLicence(
			miningRenewalLicence);
	}

	/**
	 * Creates a new mining renewal licence with the primary key. Does not add the mining renewal licence to the database.
	 *
	 * @param miningRenewalLicenceId the primary key for the new mining renewal licence
	 * @return the new mining renewal licence
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningRenewalLicence
		createMiningRenewalLicence(long miningRenewalLicenceId) {

		return _miningRenewalLicenceLocalService.createMiningRenewalLicence(
			miningRenewalLicenceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningRenewalLicenceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the mining renewal licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningRenewalLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningRenewalLicenceId the primary key of the mining renewal licence
	 * @return the mining renewal licence that was removed
	 * @throws PortalException if a mining renewal licence with the primary key could not be found
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningRenewalLicence
			deleteMiningRenewalLicence(long miningRenewalLicenceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningRenewalLicenceLocalService.deleteMiningRenewalLicence(
			miningRenewalLicenceId);
	}

	/**
	 * Deletes the mining renewal licence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningRenewalLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningRenewalLicence the mining renewal licence
	 * @return the mining renewal licence that was removed
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningRenewalLicence
		deleteMiningRenewalLicence(
			com.nbp.mining.lease.application.service.model.MiningRenewalLicence
				miningRenewalLicence) {

		return _miningRenewalLicenceLocalService.deleteMiningRenewalLicence(
			miningRenewalLicence);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningRenewalLicenceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miningRenewalLicenceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miningRenewalLicenceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miningRenewalLicenceLocalService.dynamicQuery();
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

		return _miningRenewalLicenceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningRenewalLicenceModelImpl</code>.
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

		return _miningRenewalLicenceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningRenewalLicenceModelImpl</code>.
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

		return _miningRenewalLicenceLocalService.dynamicQuery(
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

		return _miningRenewalLicenceLocalService.dynamicQueryCount(
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

		return _miningRenewalLicenceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.mining.lease.application.service.model.MiningRenewalLicence
		fetchMiningRenewalLicence(long miningRenewalLicenceId) {

		return _miningRenewalLicenceLocalService.fetchMiningRenewalLicence(
			miningRenewalLicenceId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miningRenewalLicenceLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miningRenewalLicenceLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.mining.lease.application.service.model.MiningRenewalLicence
			getMiningById(long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningRenewalLicenceException {

		return _miningRenewalLicenceLocalService.getMiningById(
			miningLeaseApplicationId);
	}

	/**
	 * Returns the mining renewal licence with the primary key.
	 *
	 * @param miningRenewalLicenceId the primary key of the mining renewal licence
	 * @return the mining renewal licence
	 * @throws PortalException if a mining renewal licence with the primary key could not be found
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningRenewalLicence
			getMiningRenewalLicence(long miningRenewalLicenceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningRenewalLicenceLocalService.getMiningRenewalLicence(
			miningRenewalLicenceId);
	}

	/**
	 * Returns a range of all the mining renewal licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningRenewalLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining renewal licences
	 * @param end the upper bound of the range of mining renewal licences (not inclusive)
	 * @return the range of mining renewal licences
	 */
	@Override
	public java.util.List
		<com.nbp.mining.lease.application.service.model.MiningRenewalLicence>
			getMiningRenewalLicences(int start, int end) {

		return _miningRenewalLicenceLocalService.getMiningRenewalLicences(
			start, end);
	}

	/**
	 * Returns the number of mining renewal licences.
	 *
	 * @return the number of mining renewal licences
	 */
	@Override
	public int getMiningRenewalLicencesCount() {
		return _miningRenewalLicenceLocalService.
			getMiningRenewalLicencesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningRenewalLicenceLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningRenewalLicenceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the mining renewal licence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningRenewalLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningRenewalLicence the mining renewal licence
	 * @return the mining renewal licence that was updated
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningRenewalLicence
		updateMiningRenewalLicence(
			com.nbp.mining.lease.application.service.model.MiningRenewalLicence
				miningRenewalLicence) {

		return _miningRenewalLicenceLocalService.updateMiningRenewalLicence(
			miningRenewalLicence);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miningRenewalLicenceLocalService.getBasePersistence();
	}

	@Override
	public MiningRenewalLicenceLocalService getWrappedService() {
		return _miningRenewalLicenceLocalService;
	}

	@Override
	public void setWrappedService(
		MiningRenewalLicenceLocalService miningRenewalLicenceLocalService) {

		_miningRenewalLicenceLocalService = miningRenewalLicenceLocalService;
	}

	private MiningRenewalLicenceLocalService _miningRenewalLicenceLocalService;

}