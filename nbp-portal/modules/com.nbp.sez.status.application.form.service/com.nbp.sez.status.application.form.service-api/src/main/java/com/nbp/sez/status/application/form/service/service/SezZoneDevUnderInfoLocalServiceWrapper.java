/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezZoneDevUnderInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneDevUnderInfoLocalService
 * @generated
 */
public class SezZoneDevUnderInfoLocalServiceWrapper
	implements ServiceWrapper<SezZoneDevUnderInfoLocalService>,
			   SezZoneDevUnderInfoLocalService {

	public SezZoneDevUnderInfoLocalServiceWrapper() {
		this(null);
	}

	public SezZoneDevUnderInfoLocalServiceWrapper(
		SezZoneDevUnderInfoLocalService sezZoneDevUnderInfoLocalService) {

		_sezZoneDevUnderInfoLocalService = sezZoneDevUnderInfoLocalService;
	}

	/**
	 * Adds the sez zone dev under info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneDevUnderInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneDevUnderInfo the sez zone dev under info
	 * @return the sez zone dev under info that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneDevUnderInfo
		addSezZoneDevUnderInfo(
			com.nbp.sez.status.application.form.service.model.
				SezZoneDevUnderInfo sezZoneDevUnderInfo) {

		return _sezZoneDevUnderInfoLocalService.addSezZoneDevUnderInfo(
			sezZoneDevUnderInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneDevUnderInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez zone dev under info with the primary key. Does not add the sez zone dev under info to the database.
	 *
	 * @param sezZoneDevUnderInfoId the primary key for the new sez zone dev under info
	 * @return the new sez zone dev under info
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneDevUnderInfo
		createSezZoneDevUnderInfo(long sezZoneDevUnderInfoId) {

		return _sezZoneDevUnderInfoLocalService.createSezZoneDevUnderInfo(
			sezZoneDevUnderInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneDevUnderInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez zone dev under info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneDevUnderInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneDevUnderInfoId the primary key of the sez zone dev under info
	 * @return the sez zone dev under info that was removed
	 * @throws PortalException if a sez zone dev under info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneDevUnderInfo
			deleteSezZoneDevUnderInfo(long sezZoneDevUnderInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneDevUnderInfoLocalService.deleteSezZoneDevUnderInfo(
			sezZoneDevUnderInfoId);
	}

	/**
	 * Deletes the sez zone dev under info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneDevUnderInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneDevUnderInfo the sez zone dev under info
	 * @return the sez zone dev under info that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneDevUnderInfo
		deleteSezZoneDevUnderInfo(
			com.nbp.sez.status.application.form.service.model.
				SezZoneDevUnderInfo sezZoneDevUnderInfo) {

		return _sezZoneDevUnderInfoLocalService.deleteSezZoneDevUnderInfo(
			sezZoneDevUnderInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezZoneDevUnderInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezZoneDevUnderInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezZoneDevUnderInfoLocalService.dynamicQuery();
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

		return _sezZoneDevUnderInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneDevUnderInfoModelImpl</code>.
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

		return _sezZoneDevUnderInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneDevUnderInfoModelImpl</code>.
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

		return _sezZoneDevUnderInfoLocalService.dynamicQuery(
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

		return _sezZoneDevUnderInfoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _sezZoneDevUnderInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneDevUnderInfo
		fetchSezZoneDevUnderInfo(long sezZoneDevUnderInfoId) {

		return _sezZoneDevUnderInfoLocalService.fetchSezZoneDevUnderInfo(
			sezZoneDevUnderInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezZoneDevUnderInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezZoneDevUnderInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezZoneDevUnderInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneDevUnderInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneDevUnderInfo
			getSezById(long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneDevUnderInfoException {

		return _sezZoneDevUnderInfoLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone dev under info with the primary key.
	 *
	 * @param sezZoneDevUnderInfoId the primary key of the sez zone dev under info
	 * @return the sez zone dev under info
	 * @throws PortalException if a sez zone dev under info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneDevUnderInfo
			getSezZoneDevUnderInfo(long sezZoneDevUnderInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneDevUnderInfoLocalService.getSezZoneDevUnderInfo(
			sezZoneDevUnderInfoId);
	}

	/**
	 * Returns a range of all the sez zone dev under infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneDevUnderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone dev under infos
	 * @param end the upper bound of the range of sez zone dev under infos (not inclusive)
	 * @return the range of sez zone dev under infos
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.SezZoneDevUnderInfo>
			getSezZoneDevUnderInfos(int start, int end) {

		return _sezZoneDevUnderInfoLocalService.getSezZoneDevUnderInfos(
			start, end);
	}

	/**
	 * Returns the number of sez zone dev under infos.
	 *
	 * @return the number of sez zone dev under infos
	 */
	@Override
	public int getSezZoneDevUnderInfosCount() {
		return _sezZoneDevUnderInfoLocalService.getSezZoneDevUnderInfosCount();
	}

	/**
	 * Updates the sez zone dev under info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneDevUnderInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneDevUnderInfo the sez zone dev under info
	 * @return the sez zone dev under info that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneDevUnderInfo
		updateSezZoneDevUnderInfo(
			com.nbp.sez.status.application.form.service.model.
				SezZoneDevUnderInfo sezZoneDevUnderInfo) {

		return _sezZoneDevUnderInfoLocalService.updateSezZoneDevUnderInfo(
			sezZoneDevUnderInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezZoneDevUnderInfoLocalService.getBasePersistence();
	}

	@Override
	public SezZoneDevUnderInfoLocalService getWrappedService() {
		return _sezZoneDevUnderInfoLocalService;
	}

	@Override
	public void setWrappedService(
		SezZoneDevUnderInfoLocalService sezZoneDevUnderInfoLocalService) {

		_sezZoneDevUnderInfoLocalService = sezZoneDevUnderInfoLocalService;
	}

	private SezZoneDevUnderInfoLocalService _sezZoneDevUnderInfoLocalService;

}