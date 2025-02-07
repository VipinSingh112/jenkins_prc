/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link WraApplicationDeskVeriLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see WraApplicationDeskVeriLocalService
 * @generated
 */
public class WraApplicationDeskVeriLocalServiceWrapper
	implements ServiceWrapper<WraApplicationDeskVeriLocalService>,
			   WraApplicationDeskVeriLocalService {

	public WraApplicationDeskVeriLocalServiceWrapper() {
		this(null);
	}

	public WraApplicationDeskVeriLocalServiceWrapper(
		WraApplicationDeskVeriLocalService wraApplicationDeskVeriLocalService) {

		_wraApplicationDeskVeriLocalService =
			wraApplicationDeskVeriLocalService;
	}

	/**
	 * Adds the wra application desk veri to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplicationDeskVeri the wra application desk veri
	 * @return the wra application desk veri that was added
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraApplicationDeskVeri
		addWraApplicationDeskVeri(
			com.nbp.wra.stage.service.model.WraApplicationDeskVeri
				wraApplicationDeskVeri) {

		return _wraApplicationDeskVeriLocalService.addWraApplicationDeskVeri(
			wraApplicationDeskVeri);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraApplicationDeskVeriLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new wra application desk veri with the primary key. Does not add the wra application desk veri to the database.
	 *
	 * @param wraApplicationDeskVeriId the primary key for the new wra application desk veri
	 * @return the new wra application desk veri
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraApplicationDeskVeri
		createWraApplicationDeskVeri(long wraApplicationDeskVeriId) {

		return _wraApplicationDeskVeriLocalService.createWraApplicationDeskVeri(
			wraApplicationDeskVeriId);
	}

	@Override
	public void deleteCannabisAppDV_ById(long wraApplicationId) {
		_wraApplicationDeskVeriLocalService.deleteCannabisAppDV_ById(
			wraApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraApplicationDeskVeriLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the wra application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplicationDeskVeriId the primary key of the wra application desk veri
	 * @return the wra application desk veri that was removed
	 * @throws PortalException if a wra application desk veri with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraApplicationDeskVeri
			deleteWraApplicationDeskVeri(long wraApplicationDeskVeriId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraApplicationDeskVeriLocalService.deleteWraApplicationDeskVeri(
			wraApplicationDeskVeriId);
	}

	/**
	 * Deletes the wra application desk veri from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplicationDeskVeri the wra application desk veri
	 * @return the wra application desk veri that was removed
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraApplicationDeskVeri
		deleteWraApplicationDeskVeri(
			com.nbp.wra.stage.service.model.WraApplicationDeskVeri
				wraApplicationDeskVeri) {

		return _wraApplicationDeskVeriLocalService.deleteWraApplicationDeskVeri(
			wraApplicationDeskVeri);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _wraApplicationDeskVeriLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _wraApplicationDeskVeriLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _wraApplicationDeskVeriLocalService.dynamicQuery();
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

		return _wraApplicationDeskVeriLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraApplicationDeskVeriModelImpl</code>.
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

		return _wraApplicationDeskVeriLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraApplicationDeskVeriModelImpl</code>.
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

		return _wraApplicationDeskVeriLocalService.dynamicQuery(
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

		return _wraApplicationDeskVeriLocalService.dynamicQueryCount(
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

		return _wraApplicationDeskVeriLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.wra.stage.service.model.WraApplicationDeskVeri
		fetchWraApplicationDeskVeri(long wraApplicationDeskVeriId) {

		return _wraApplicationDeskVeriLocalService.fetchWraApplicationDeskVeri(
			wraApplicationDeskVeriId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _wraApplicationDeskVeriLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.wra.stage.service.model.WraApplicationDeskVeri>
			getApplicationDeskVerificationList(long wraApplicationId) {

		return _wraApplicationDeskVeriLocalService.
			getApplicationDeskVerificationList(wraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _wraApplicationDeskVeriLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _wraApplicationDeskVeriLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraApplicationDeskVeriLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the wra application desk veri with the primary key.
	 *
	 * @param wraApplicationDeskVeriId the primary key of the wra application desk veri
	 * @return the wra application desk veri
	 * @throws PortalException if a wra application desk veri with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraApplicationDeskVeri
			getWraApplicationDeskVeri(long wraApplicationDeskVeriId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraApplicationDeskVeriLocalService.getWraApplicationDeskVeri(
			wraApplicationDeskVeriId);
	}

	/**
	 * Returns a range of all the wra application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application desk veris
	 * @param end the upper bound of the range of wra application desk veris (not inclusive)
	 * @return the range of wra application desk veris
	 */
	@Override
	public java.util.List
		<com.nbp.wra.stage.service.model.WraApplicationDeskVeri>
			getWraApplicationDeskVeris(int start, int end) {

		return _wraApplicationDeskVeriLocalService.getWraApplicationDeskVeris(
			start, end);
	}

	/**
	 * Returns the number of wra application desk veris.
	 *
	 * @return the number of wra application desk veris
	 */
	@Override
	public int getWraApplicationDeskVerisCount() {
		return _wraApplicationDeskVeriLocalService.
			getWraApplicationDeskVerisCount();
	}

	/**
	 * Updates the wra application desk veri in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplicationDeskVeri the wra application desk veri
	 * @return the wra application desk veri that was updated
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraApplicationDeskVeri
		updateWraApplicationDeskVeri(
			com.nbp.wra.stage.service.model.WraApplicationDeskVeri
				wraApplicationDeskVeri) {

		return _wraApplicationDeskVeriLocalService.updateWraApplicationDeskVeri(
			wraApplicationDeskVeri);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _wraApplicationDeskVeriLocalService.getBasePersistence();
	}

	@Override
	public WraApplicationDeskVeriLocalService getWrappedService() {
		return _wraApplicationDeskVeriLocalService;
	}

	@Override
	public void setWrappedService(
		WraApplicationDeskVeriLocalService wraApplicationDeskVeriLocalService) {

		_wraApplicationDeskVeriLocalService =
			wraApplicationDeskVeriLocalService;
	}

	private WraApplicationDeskVeriLocalService
		_wraApplicationDeskVeriLocalService;

}