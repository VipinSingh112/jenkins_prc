/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiningApplicationDeskVeriLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationDeskVeriLocalService
 * @generated
 */
public class MiningApplicationDeskVeriLocalServiceWrapper
	implements MiningApplicationDeskVeriLocalService,
			   ServiceWrapper<MiningApplicationDeskVeriLocalService> {

	public MiningApplicationDeskVeriLocalServiceWrapper() {
		this(null);
	}

	public MiningApplicationDeskVeriLocalServiceWrapper(
		MiningApplicationDeskVeriLocalService
			miningApplicationDeskVeriLocalService) {

		_miningApplicationDeskVeriLocalService =
			miningApplicationDeskVeriLocalService;
	}

	/**
	 * Adds the mining application desk veri to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationDeskVeri the mining application desk veri
	 * @return the mining application desk veri that was added
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationDeskVeri
		addMiningApplicationDeskVeri(
			com.nbp.mining.stage.service.model.MiningApplicationDeskVeri
				miningApplicationDeskVeri) {

		return _miningApplicationDeskVeriLocalService.
			addMiningApplicationDeskVeri(miningApplicationDeskVeri);
	}

	/**
	 * Creates a new mining application desk veri with the primary key. Does not add the mining application desk veri to the database.
	 *
	 * @param miningDeskVeriId the primary key for the new mining application desk veri
	 * @return the new mining application desk veri
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationDeskVeri
		createMiningApplicationDeskVeri(long miningDeskVeriId) {

		return _miningApplicationDeskVeriLocalService.
			createMiningApplicationDeskVeri(miningDeskVeriId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationDeskVeriLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void deleteMiningAppDV_ById(long applicationId) {
		_miningApplicationDeskVeriLocalService.deleteMiningAppDV_ById(
			applicationId);
	}

	/**
	 * Deletes the mining application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningDeskVeriId the primary key of the mining application desk veri
	 * @return the mining application desk veri that was removed
	 * @throws PortalException if a mining application desk veri with the primary key could not be found
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationDeskVeri
			deleteMiningApplicationDeskVeri(long miningDeskVeriId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationDeskVeriLocalService.
			deleteMiningApplicationDeskVeri(miningDeskVeriId);
	}

	/**
	 * Deletes the mining application desk veri from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationDeskVeri the mining application desk veri
	 * @return the mining application desk veri that was removed
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationDeskVeri
		deleteMiningApplicationDeskVeri(
			com.nbp.mining.stage.service.model.MiningApplicationDeskVeri
				miningApplicationDeskVeri) {

		return _miningApplicationDeskVeriLocalService.
			deleteMiningApplicationDeskVeri(miningApplicationDeskVeri);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationDeskVeriLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miningApplicationDeskVeriLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miningApplicationDeskVeriLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miningApplicationDeskVeriLocalService.dynamicQuery();
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

		return _miningApplicationDeskVeriLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationDeskVeriModelImpl</code>.
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

		return _miningApplicationDeskVeriLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationDeskVeriModelImpl</code>.
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

		return _miningApplicationDeskVeriLocalService.dynamicQuery(
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

		return _miningApplicationDeskVeriLocalService.dynamicQueryCount(
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

		return _miningApplicationDeskVeriLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationDeskVeri
		fetchMiningApplicationDeskVeri(long miningDeskVeriId) {

		return _miningApplicationDeskVeriLocalService.
			fetchMiningApplicationDeskVeri(miningDeskVeriId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miningApplicationDeskVeriLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miningApplicationDeskVeriLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the mining application desk veri with the primary key.
	 *
	 * @param miningDeskVeriId the primary key of the mining application desk veri
	 * @return the mining application desk veri
	 * @throws PortalException if a mining application desk veri with the primary key could not be found
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationDeskVeri
			getMiningApplicationDeskVeri(long miningDeskVeriId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationDeskVeriLocalService.
			getMiningApplicationDeskVeri(miningDeskVeriId);
	}

	/**
	 * Returns a range of all the mining application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application desk veris
	 * @param end the upper bound of the range of mining application desk veris (not inclusive)
	 * @return the range of mining application desk veris
	 */
	@Override
	public java.util.List
		<com.nbp.mining.stage.service.model.MiningApplicationDeskVeri>
			getMiningApplicationDeskVeris(int start, int end) {

		return _miningApplicationDeskVeriLocalService.
			getMiningApplicationDeskVeris(start, end);
	}

	/**
	 * Returns the number of mining application desk veris.
	 *
	 * @return the number of mining application desk veris
	 */
	@Override
	public int getMiningApplicationDeskVerisCount() {
		return _miningApplicationDeskVeriLocalService.
			getMiningApplicationDeskVerisCount();
	}

	@Override
	public java.util.List
		<com.nbp.mining.stage.service.model.MiningApplicationDeskVeri>
			getMiningDeskVerification(long applicationId) {

		return _miningApplicationDeskVeriLocalService.getMiningDeskVerification(
			applicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningApplicationDeskVeriLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationDeskVeriLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the mining application desk veri in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationDeskVeri the mining application desk veri
	 * @return the mining application desk veri that was updated
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationDeskVeri
		updateMiningApplicationDeskVeri(
			com.nbp.mining.stage.service.model.MiningApplicationDeskVeri
				miningApplicationDeskVeri) {

		return _miningApplicationDeskVeriLocalService.
			updateMiningApplicationDeskVeri(miningApplicationDeskVeri);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miningApplicationDeskVeriLocalService.getBasePersistence();
	}

	@Override
	public MiningApplicationDeskVeriLocalService getWrappedService() {
		return _miningApplicationDeskVeriLocalService;
	}

	@Override
	public void setWrappedService(
		MiningApplicationDeskVeriLocalService
			miningApplicationDeskVeriLocalService) {

		_miningApplicationDeskVeriLocalService =
			miningApplicationDeskVeriLocalService;
	}

	private MiningApplicationDeskVeriLocalService
		_miningApplicationDeskVeriLocalService;

}