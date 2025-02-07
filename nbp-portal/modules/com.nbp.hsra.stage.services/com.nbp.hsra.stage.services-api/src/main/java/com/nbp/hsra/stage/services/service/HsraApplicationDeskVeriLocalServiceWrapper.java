/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HsraApplicationDeskVeriLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationDeskVeriLocalService
 * @generated
 */
public class HsraApplicationDeskVeriLocalServiceWrapper
	implements HsraApplicationDeskVeriLocalService,
			   ServiceWrapper<HsraApplicationDeskVeriLocalService> {

	public HsraApplicationDeskVeriLocalServiceWrapper() {
		this(null);
	}

	public HsraApplicationDeskVeriLocalServiceWrapper(
		HsraApplicationDeskVeriLocalService
			hsraApplicationDeskVeriLocalService) {

		_hsraApplicationDeskVeriLocalService =
			hsraApplicationDeskVeriLocalService;
	}

	/**
	 * Adds the hsra application desk veri to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationDeskVeri the hsra application desk veri
	 * @return the hsra application desk veri that was added
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HsraApplicationDeskVeri
		addHsraApplicationDeskVeri(
			com.nbp.hsra.stage.services.model.HsraApplicationDeskVeri
				hsraApplicationDeskVeri) {

		return _hsraApplicationDeskVeriLocalService.addHsraApplicationDeskVeri(
			hsraApplicationDeskVeri);
	}

	/**
	 * Creates a new hsra application desk veri with the primary key. Does not add the hsra application desk veri to the database.
	 *
	 * @param hsraApplicationDeskVeriId the primary key for the new hsra application desk veri
	 * @return the new hsra application desk veri
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HsraApplicationDeskVeri
		createHsraApplicationDeskVeri(long hsraApplicationDeskVeriId) {

		return _hsraApplicationDeskVeriLocalService.
			createHsraApplicationDeskVeri(hsraApplicationDeskVeriId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationDeskVeriLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void deleteHsraAppDV_ById(long hsraApplicationId) {
		_hsraApplicationDeskVeriLocalService.deleteHsraAppDV_ById(
			hsraApplicationId);
	}

	/**
	 * Deletes the hsra application desk veri from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationDeskVeri the hsra application desk veri
	 * @return the hsra application desk veri that was removed
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HsraApplicationDeskVeri
		deleteHsraApplicationDeskVeri(
			com.nbp.hsra.stage.services.model.HsraApplicationDeskVeri
				hsraApplicationDeskVeri) {

		return _hsraApplicationDeskVeriLocalService.
			deleteHsraApplicationDeskVeri(hsraApplicationDeskVeri);
	}

	/**
	 * Deletes the hsra application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationDeskVeriId the primary key of the hsra application desk veri
	 * @return the hsra application desk veri that was removed
	 * @throws PortalException if a hsra application desk veri with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HsraApplicationDeskVeri
			deleteHsraApplicationDeskVeri(long hsraApplicationDeskVeriId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationDeskVeriLocalService.
			deleteHsraApplicationDeskVeri(hsraApplicationDeskVeriId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationDeskVeriLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _hsraApplicationDeskVeriLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _hsraApplicationDeskVeriLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _hsraApplicationDeskVeriLocalService.dynamicQuery();
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

		return _hsraApplicationDeskVeriLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HsraApplicationDeskVeriModelImpl</code>.
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

		return _hsraApplicationDeskVeriLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HsraApplicationDeskVeriModelImpl</code>.
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

		return _hsraApplicationDeskVeriLocalService.dynamicQuery(
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

		return _hsraApplicationDeskVeriLocalService.dynamicQueryCount(
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

		return _hsraApplicationDeskVeriLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.stage.services.model.HsraApplicationDeskVeri
		fetchHsraApplicationDeskVeri(long hsraApplicationDeskVeriId) {

		return _hsraApplicationDeskVeriLocalService.
			fetchHsraApplicationDeskVeri(hsraApplicationDeskVeriId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _hsraApplicationDeskVeriLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.hsra.stage.services.model.HsraApplicationDeskVeri>
			getApplicationDeskVerificationList(long hsraApplicationId) {

		return _hsraApplicationDeskVeriLocalService.
			getApplicationDeskVerificationList(hsraApplicationId);
	}

	/**
	 * Returns the hsra application desk veri with the primary key.
	 *
	 * @param hsraApplicationDeskVeriId the primary key of the hsra application desk veri
	 * @return the hsra application desk veri
	 * @throws PortalException if a hsra application desk veri with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HsraApplicationDeskVeri
			getHsraApplicationDeskVeri(long hsraApplicationDeskVeriId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationDeskVeriLocalService.getHsraApplicationDeskVeri(
			hsraApplicationDeskVeriId);
	}

	/**
	 * Returns a range of all the hsra application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HsraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application desk veris
	 * @param end the upper bound of the range of hsra application desk veris (not inclusive)
	 * @return the range of hsra application desk veris
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.stage.services.model.HsraApplicationDeskVeri>
			getHsraApplicationDeskVeris(int start, int end) {

		return _hsraApplicationDeskVeriLocalService.getHsraApplicationDeskVeris(
			start, end);
	}

	/**
	 * Returns the number of hsra application desk veris.
	 *
	 * @return the number of hsra application desk veris
	 */
	@Override
	public int getHsraApplicationDeskVerisCount() {
		return _hsraApplicationDeskVeriLocalService.
			getHsraApplicationDeskVerisCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _hsraApplicationDeskVeriLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _hsraApplicationDeskVeriLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationDeskVeriLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the hsra application desk veri in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationDeskVeri the hsra application desk veri
	 * @return the hsra application desk veri that was updated
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HsraApplicationDeskVeri
		updateHsraApplicationDeskVeri(
			com.nbp.hsra.stage.services.model.HsraApplicationDeskVeri
				hsraApplicationDeskVeri) {

		return _hsraApplicationDeskVeriLocalService.
			updateHsraApplicationDeskVeri(hsraApplicationDeskVeri);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _hsraApplicationDeskVeriLocalService.getBasePersistence();
	}

	@Override
	public HsraApplicationDeskVeriLocalService getWrappedService() {
		return _hsraApplicationDeskVeriLocalService;
	}

	@Override
	public void setWrappedService(
		HsraApplicationDeskVeriLocalService
			hsraApplicationDeskVeriLocalService) {

		_hsraApplicationDeskVeriLocalService =
			hsraApplicationDeskVeriLocalService;
	}

	private HsraApplicationDeskVeriLocalService
		_hsraApplicationDeskVeriLocalService;

}