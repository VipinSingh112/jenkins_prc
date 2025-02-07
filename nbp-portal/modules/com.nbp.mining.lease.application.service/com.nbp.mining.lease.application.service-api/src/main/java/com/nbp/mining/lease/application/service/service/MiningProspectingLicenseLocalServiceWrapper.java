/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiningProspectingLicenseLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingLicenseLocalService
 * @generated
 */
public class MiningProspectingLicenseLocalServiceWrapper
	implements MiningProspectingLicenseLocalService,
			   ServiceWrapper<MiningProspectingLicenseLocalService> {

	public MiningProspectingLicenseLocalServiceWrapper() {
		this(null);
	}

	public MiningProspectingLicenseLocalServiceWrapper(
		MiningProspectingLicenseLocalService
			miningProspectingLicenseLocalService) {

		_miningProspectingLicenseLocalService =
			miningProspectingLicenseLocalService;
	}

	/**
	 * Adds the mining prospecting license to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningProspectingLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningProspectingLicense the mining prospecting license
	 * @return the mining prospecting license that was added
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningProspectingLicense
			addMiningProspectingLicense(
				com.nbp.mining.lease.application.service.model.
					MiningProspectingLicense miningProspectingLicense) {

		return _miningProspectingLicenseLocalService.
			addMiningProspectingLicense(miningProspectingLicense);
	}

	/**
	 * Creates a new mining prospecting license with the primary key. Does not add the mining prospecting license to the database.
	 *
	 * @param miningProspectingLicenseId the primary key for the new mining prospecting license
	 * @return the new mining prospecting license
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningProspectingLicense
			createMiningProspectingLicense(long miningProspectingLicenseId) {

		return _miningProspectingLicenseLocalService.
			createMiningProspectingLicense(miningProspectingLicenseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningProspectingLicenseLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the mining prospecting license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningProspectingLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningProspectingLicenseId the primary key of the mining prospecting license
	 * @return the mining prospecting license that was removed
	 * @throws PortalException if a mining prospecting license with the primary key could not be found
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningProspectingLicense
				deleteMiningProspectingLicense(long miningProspectingLicenseId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _miningProspectingLicenseLocalService.
			deleteMiningProspectingLicense(miningProspectingLicenseId);
	}

	/**
	 * Deletes the mining prospecting license from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningProspectingLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningProspectingLicense the mining prospecting license
	 * @return the mining prospecting license that was removed
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningProspectingLicense
			deleteMiningProspectingLicense(
				com.nbp.mining.lease.application.service.model.
					MiningProspectingLicense miningProspectingLicense) {

		return _miningProspectingLicenseLocalService.
			deleteMiningProspectingLicense(miningProspectingLicense);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningProspectingLicenseLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miningProspectingLicenseLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miningProspectingLicenseLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miningProspectingLicenseLocalService.dynamicQuery();
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

		return _miningProspectingLicenseLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningProspectingLicenseModelImpl</code>.
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

		return _miningProspectingLicenseLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningProspectingLicenseModelImpl</code>.
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

		return _miningProspectingLicenseLocalService.dynamicQuery(
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

		return _miningProspectingLicenseLocalService.dynamicQueryCount(
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

		return _miningProspectingLicenseLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningProspectingLicense
			fetchMiningProspectingLicense(long miningProspectingLicenseId) {

		return _miningProspectingLicenseLocalService.
			fetchMiningProspectingLicense(miningProspectingLicenseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miningProspectingLicenseLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miningProspectingLicenseLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the mining prospecting license with the primary key.
	 *
	 * @param miningProspectingLicenseId the primary key of the mining prospecting license
	 * @return the mining prospecting license
	 * @throws PortalException if a mining prospecting license with the primary key could not be found
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningProspectingLicense
				getMiningProspectingLicense(long miningProspectingLicenseId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _miningProspectingLicenseLocalService.
			getMiningProspectingLicense(miningProspectingLicenseId);
	}

	/**
	 * Returns a range of all the mining prospecting licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningProspectingLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting licenses
	 * @param end the upper bound of the range of mining prospecting licenses (not inclusive)
	 * @return the range of mining prospecting licenses
	 */
	@Override
	public java.util.List
		<com.nbp.mining.lease.application.service.model.
			MiningProspectingLicense> getMiningProspectingLicenses(
				int start, int end) {

		return _miningProspectingLicenseLocalService.
			getMiningProspectingLicenses(start, end);
	}

	/**
	 * Returns the number of mining prospecting licenses.
	 *
	 * @return the number of mining prospecting licenses
	 */
	@Override
	public int getMiningProspectingLicensesCount() {
		return _miningProspectingLicenseLocalService.
			getMiningProspectingLicensesCount();
	}

	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningProspectingLicense
				getMinningById(long miningLeaseApplicationId)
			throws com.nbp.mining.lease.application.service.exception.
				NoSuchMiningProspectingLicenseException {

		return _miningProspectingLicenseLocalService.getMinningById(
			miningLeaseApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningProspectingLicenseLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningProspectingLicenseLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the mining prospecting license in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningProspectingLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningProspectingLicense the mining prospecting license
	 * @return the mining prospecting license that was updated
	 */
	@Override
	public
		com.nbp.mining.lease.application.service.model.MiningProspectingLicense
			updateMiningProspectingLicense(
				com.nbp.mining.lease.application.service.model.
					MiningProspectingLicense miningProspectingLicense) {

		return _miningProspectingLicenseLocalService.
			updateMiningProspectingLicense(miningProspectingLicense);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miningProspectingLicenseLocalService.getBasePersistence();
	}

	@Override
	public MiningProspectingLicenseLocalService getWrappedService() {
		return _miningProspectingLicenseLocalService;
	}

	@Override
	public void setWrappedService(
		MiningProspectingLicenseLocalService
			miningProspectingLicenseLocalService) {

		_miningProspectingLicenseLocalService =
			miningProspectingLicenseLocalService;
	}

	private MiningProspectingLicenseLocalService
		_miningProspectingLicenseLocalService;

}